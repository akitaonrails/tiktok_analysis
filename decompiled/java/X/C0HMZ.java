package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.o;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HMZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2$1", f = "SocialAvatarCreationViewModelV2.kt", l = {}, m = "invokeSuspend")
public final class C0HMZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0HMZ(InterfaceC1364105Vn<? super C0HMZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HMZ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarCreationViewModelV2@c606.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C19328310jZ.LIZIZ.LIZIZ(((IPushSettingService) ServiceManager.get().getService(IPushSettingService.class)).LJII());
        } catch (C0XIR e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (o e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarCreationViewModelV2@c606.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0HMZ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
