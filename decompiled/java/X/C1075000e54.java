package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.relation.auth.model.ContactBookUploadItem;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.0e54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075000e54 extends AbstractC1002380cBw {
    public final C2218501BsG LIZJ;
    public final C2218431Bs9 LIZLLL;
    public final C1075030e57 LJ;
    public final C1074950e4z LJFF;

    @Override // X.AbstractC1002380cBw
    public final boolean LIZ() {
        return super.LIZ() && !C10EU.LJIIIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    @Override // X.AbstractC1002380cBw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super X.C1074840e4o> r15) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1075000e54.LIZJ(X.05Vn):java.lang.Object");
    }

    public final Map<String, String> LIZLLL(List<ContactBookUploadItem> list) {
        C2218501BsG c2218501BsG = this.LIZJ;
        AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3((List) list, (List<? extends Effect>) 170);
        c2218501BsG.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            Object objInvoke = awS547S0100000_3.invoke();
            long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("serialize cost: ");
            sbLIZ.append(jUptimeMillis2);
            C2188811AlT.LIZIZ(sbLIZ);
            c2218501BsG.LJIILIIL = jUptimeMillis2;
            return (Map) objInvoke;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                c2218501BsG.LJIJI = th.getMessage();
                C2338609Ei c2338609Ei = C2338609Ei.LIZ;
                String str = c2218501BsG.LJIJI;
                c2338609Ei.getClass();
                C2338609Ei.LIZ(401, str, null, "", "", "");
                throw th;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("serialize cost: ");
                sbLIZ2.append(jUptimeMillis3);
                C2188811AlT.LIZIZ(sbLIZ2);
                c2218501BsG.LJIILIIL = jUptimeMillis3;
                throw th2;
            }
        }
    }

    public C1075000e54(EnumC1074240e3q enumC1074240e3q, C1074950e4z c1074950e4z, int i) {
        C1DFB c1dfb;
        C2218501BsG c2218501BsG;
        C2218431Bs9 c2218431Bs9;
        if ((i & 2) != 0) {
            c1dfb = C0PEM.LIZJ;
        } else {
            c1dfb = null;
        }
        if ((i & 4) != 0) {
            c2218501BsG = new C2218501BsG(enumC1074240e3q, EnumC1995407rk.OPT_AUTHORIZATION, false, 124);
        } else {
            c2218501BsG = null;
        }
        if ((i & 8) != 0) {
            c2218431Bs9 = new C2218431Bs9(c2218501BsG, new C1075050e59(enumC1074240e3q));
        } else {
            c2218431Bs9 = null;
        }
        C1075030e57 c1075030e57 = (i & 16) != 0 ? new C1075030e57(c2218501BsG) : null;
        c1074950e4z = (i & 32) != 0 ? new C1074950e4z(enumC1074240e3q, false, 6) : c1074950e4z;
        super(c2218501BsG, c1dfb);
        this.LIZJ = c2218501BsG;
        this.LIZLLL = c2218431Bs9;
        this.LJ = c1075030e57;
        this.LJFF = c1074950e4z;
    }
}
