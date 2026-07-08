package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15nD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20624915nD extends C09AY implements Function0<Boolean> {
    public C20624915nD() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        try {
            System.out.println(C13LE.LIZ(C20742916Ex.class));
            return Boolean.TRUE;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
            if (interfaceC723720SaA != null) {
                interfaceC723720SaA.LIZIZ("Could not find AndInflater", e);
            }
            return Boolean.FALSE;
        }
    }
}
