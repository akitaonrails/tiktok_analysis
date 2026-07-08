package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08vO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.AIMusicConfigHelper$initAuthConfigASync$1", f = "AIMusicConfigHelper.kt", l = {}, m = "invokeSuspend")
public final class C2272808vO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2272808vO(InterfaceC1364105Vn<? super C2272808vO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2272808vO(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIMusicConfigHelper@fb13.initAuthConfigASync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C2288808xy.LIZ.getClass();
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Task cancelled:");
            sbLIZ.append(e.getMessage());
            C201955140j.LJIILIIL("AIMusicConfigHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C2288808xy.LIZIZ != null && C2288808xy.LIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initAuthConfigASync hit cache id:");
            sbLIZ2.append(C786410Ut5.u3().getId());
            C201955140j.LJIILIIL("AIMusicConfigHelper", C2188811AlT.LIZIZ(sbLIZ2));
            C2288808xy.LIZJ();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AIMusicConfigHelper@fb13.initAuthConfigASync$1");
            return unit;
        }
        Boolean bool = Boolean.FALSE;
        Object objCreate = null;
        C2288808xy.LIZIZ = null;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("resetAuthKey isFail:");
        sbLIZ3.append(bool);
        C201955140j.LJIILIIL("AIMusicConfigHelper", C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("initAuthConfigASync init id:");
        sbLIZ4.append(C786410Ut5.u3().getId());
        sbLIZ4.append('\"');
        C201955140j.LJIILIIL("AIMusicConfigHelper", C2188811AlT.LIZIZ(sbLIZ4));
        Map<String, String> mapLIZJ = C2097908Jt.LIZJ(new Pair("purpose", "AI"));
        C11U6<VideoCreation> c11u6 = new C11U6<VideoCreation>() { // from class: X.08vP
            @Override // X.C11U6
            public final void onFailure(Throwable th) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("initAuthConfigASync onFailure :");
                sbLIZ5.append(th.getMessage());
                C201955140j.LJIILIIL("AIMusicConfigHelper", C2188811AlT.LIZIZ(sbLIZ5));
            }

            @Override // X.C11U6
            public final void onSuccess(VideoCreation videoCreation) {
                VideoCreation videoCreation2 = videoCreation;
                if (videoCreation2 instanceof UploadAuthKeyConfig) {
                    C2288808xy c2288808xy = C2288808xy.LIZ;
                    Pair<? extends UploadImageConfig, String> pair = new Pair<>(((UploadAuthKeyConfig) videoCreation2).frameUploadConfig, "");
                    c2288808xy.getClass();
                    C2288808xy.LIZIZ = pair;
                    C2288808xy.LJI = System.currentTimeMillis();
                    C2288808xy.LIZJ();
                    C201955140j.LJIILIIL("AIMusicConfigHelper", "initAuthConfigASync success");
                    return;
                }
                C201955140j.LJIILIIL("AIMusicConfigHelper", "initAuthConfigASync fail");
            }
        };
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(((AVApi) ServiceManager.get().getService(AVApi.class)).LIZ());
        if (interfaceC2661011fLIZ != null) {
            objCreate = interfaceC2661011fLIZ.create(UploaderRetrofitService.class);
        }
        ListenableFuture<UploadAuthKeyConfig> uploadAuthKeyConfig = ((UploaderRetrofitService) objCreate).getUploadAuthKeyConfig(mapLIZJ);
        uploadAuthKeyConfig.LJIIJJI(new C135Q(uploadAuthKeyConfig, c11u6), EnumC2272608vM.LL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIMusicConfigHelper@fb13.initAuthConfigASync$1");
        return unit2;
    }
}
