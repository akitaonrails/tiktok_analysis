package X;

import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0O4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.assem.list.compose.ArtistCertificationSoundOnBannerKt$ArtistCertificationSoundOnBanner$1$1", f = "ArtistCertificationSoundOnBanner.kt", l = {}, m = "invokeSuspend")
public final class C613540O4q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C613540O4q(InterfaceC1364105Vn<? super C613540O4q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C613540O4q(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ArtistCertificationSoundOnBannerKt@a75.ArtistCertificationSoundOnBanner$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setLazyUpdate(true);
            String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
            C1537050q6J.LIZ.getClass();
            C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
            if (c1551950qULLIZ != null) {
                List<String> list = C632410OrH.LIZJ().preloadChannels;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new CheckRequestBodyModel.TargetChannel(it2.next()));
                }
                c1551950qULLIZ.LIZ(null, C2097908Jt.LIZJ(new Pair(accessKey, arrayList)), optionCheckUpdateParams);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ArtistCertificationSoundOnBannerKt@a75.ArtistCertificationSoundOnBanner$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C613540O4q(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
