package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEConfigCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09oH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.PreloadVESoImpl$warmupVEConfigCenterAsync$1", f = "PreloadVESoImpl.kt", l = {}, m = "invokeSuspend")
public final class C2483509oH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2483509oH(InterfaceC1364105Vn<? super C2483509oH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2483509oH(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreloadVESoImpl@1766.warmupVEConfigCenterAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            VEConfigCenter.getInstance();
            C201955140j.LIZLLL(C201967140v.LIZIZ, "VideoRecordContainerScene", "VEConfigCenter async warmup done");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C201955140j.LJIIIZ(C201967140v.LIZIZ, "VideoRecordContainerScene", "VEConfigCenter async warmup failed", th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreloadVESoImpl@1766.warmupVEConfigCenterAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2483509oH(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
