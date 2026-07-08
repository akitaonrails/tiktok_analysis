package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class C1519010pdD extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1519010pdD(C1519020pdE c1519020pdE) {
        super(1, c1519020pdE, C1519020pdE.class, "onAppSwitchBackground", "onAppSwitchBackground(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        Object obj = this.receiver;
        obj.getClass();
        if (C1519020pdE.LIZJ < 0 || C1519020pdE.LIZLLL == null) {
            synchronized (obj) {
                try {
                    C1519020pdE.LIZ.getClass();
                    C1519020pdE.LIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        ((InterfaceC1519050pdH) C1519020pdE.LJFF.getValue()).putBoolean("is_background", zBooleanValue);
        return Unit.LIZ;
    }
}
