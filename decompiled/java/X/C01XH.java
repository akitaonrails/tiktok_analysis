package X;

import com.ss.android.ugc.aweme.check.IAutoSoundCheckService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01XH, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pgc.hybrid.xbridge.impl.StudioGetStudioInappSettings$getVideoSoundSetting$1", f = "StudioGetStudioInappSettings.kt", l = {47}, m = "invokeSuspend")
public final class C01XH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;

    public C01XH(InterfaceC1364105Vn<? super C01XH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01XH(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StudioGetStudioInappSettings@cfa9.getVideoSoundSetting$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IAutoSoundCheckService iAutoSoundCheckService = (IAutoSoundCheckService) ServiceManager.get().getService(IAutoSoundCheckService.class);
            this.LL = 1;
            obj = iAutoSoundCheckService.LIZIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StudioGetStudioInappSettings@cfa9.getVideoSoundSetting$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("StudioGetStudioInappSettings@cfa9.getVideoSoundSetting$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C01XH(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
