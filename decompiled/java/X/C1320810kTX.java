package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;

/* JADX INFO: renamed from: X.0kTX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320810kTX extends AbstractC1320720kTO<C1320810kTX, C1325710kbR, C1323050kX9<AbstractC1327750kej>, InterfaceC1330440kj4> {
    public final C1325540kbA LJIJI;
    public final C1320830kTZ LJIJJ;
    public C1322480kWE<InterfaceC1320130kSR> LJIJJLI;
    public InterfaceC1320080kSM LJIL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1320720kTO
    public final C1320250kSd LIZLLL() {
        C1320250kSd c1320250kSd;
        C1336010ks3.LIZIZ();
        try {
            InterfaceC1320850kTb interfaceC1320850kTb = this.LJIILJJIL;
            String strValueOf = String.valueOf(AbstractC1320720kTO.LJIJ.getAndIncrement());
            if (interfaceC1320850kTb instanceof C1320250kSd) {
                c1320250kSd = (C1320250kSd) interfaceC1320850kTb;
            } else {
                C1320830kTZ c1320830kTZ = this.LJIJJ;
                c1320250kSd = new C1320250kSd(c1320830kTZ.LIZ, c1320830kTZ.LIZIZ, c1320830kTZ.LIZJ, c1320830kTZ.LIZLLL, c1320830kTZ.LJ, c1320830kTZ.LJFF);
                InterfaceC1320070kSL<Boolean> interfaceC1320070kSL = c1320830kTZ.LJI;
                if (interfaceC1320070kSL != null) {
                    c1320250kSd.LJJIJ = interfaceC1320070kSL.get().booleanValue();
                }
            }
            c1320250kSd.LJIILL = this.LJIILIIL;
            InterfaceC1320070kSL interfaceC1320070kSLLJ = LJ(c1320250kSd, strValueOf);
            C1325710kbR c1325710kbR = (C1325710kbR) this.LIZLLL;
            InterfaceC1325590kbF interfaceC1325590kbF = this.LJIJI.LJIIJJI;
            c1320250kSd.LJJIII(interfaceC1320070kSLLJ, strValueOf, (interfaceC1325590kbF == null || c1325710kbR == null) ? null : c1325710kbR.LJIJJ != null ? interfaceC1325590kbF.LIZIZ(c1325710kbR, this.LIZJ) : interfaceC1325590kbF.LIZJ(c1325710kbR, this.LIZJ), this.LIZJ, this.LJIJJLI, this.LJIL, (C1325710kbR) this.LIZLLL);
            c1320250kSd.LJJIIJ();
            C1336010ks3.LIZIZ();
            return c1320250kSd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [REQUEST, X.0kbR] */
    public final C1320810kTX LJI(Uri uri) {
        if (uri == null) {
            this.LIZLLL = null;
            return this;
        }
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
        c1325700kbQLIZLLL.LJ = C1324670kZl.LJ;
        this.LIZLLL = c1325700kbQLIZLLL.LIZ();
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [REQUEST, X.0kbR] */
    public final C1320810kTX LJII(String str) {
        if (str != null && !str.isEmpty()) {
            LJI(Uri.parse(str));
            return this;
        }
        this.LIZLLL = C1325710kbR.LIZIZ(str);
        return this;
    }

    public C1320810kTX(Context context, C1320830kTZ c1320830kTZ, C1325540kbA c1325540kbA, Set<InterfaceC1320650kTH> set) {
        super(context, set);
        this.LJIJI = c1325540kbA;
        this.LJIJJ = c1320830kTZ;
        this.LJIIIZ = c1320830kTZ.LJII;
    }

    @Override // X.AbstractC1320720kTO
    public final AbstractC1321260kUG LIZIZ(InterfaceC1320850kTb interfaceC1320850kTb, Object obj, Object obj2, EnumC1320790kTV enumC1320790kTV) {
        EnumC1320950kTl enumC1320950kTl;
        InterfaceC1325670kbN interfaceC1325670kbNLJJII;
        EnumC1331380kka enumC1331380kka;
        C1325710kbR c1325710kbR = (C1325710kbR) obj;
        C1325540kbA c1325540kbA = this.LJIJI;
        int i = C1320800kTW.LIZ[enumC1320790kTV.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    enumC1320950kTl = EnumC1320950kTl.BITMAP_MEMORY_CACHE;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cache level");
                    sbLIZ.append(enumC1320790kTV);
                    sbLIZ.append("is not supported. ");
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                enumC1320950kTl = EnumC1320950kTl.DISK_CACHE;
            }
        } else {
            enumC1320950kTl = EnumC1320950kTl.FULL_FETCH;
        }
        if (interfaceC1320850kTb instanceof C1320250kSd) {
            interfaceC1325670kbNLJJII = ((C1320250kSd) interfaceC1320850kTb).LJJII();
        } else {
            interfaceC1325670kbNLJJII = null;
        }
        EnumC1331380kka enumC1331380kka2 = EnumC1331380kka.HIGH;
        if (c1325710kbR != null) {
            enumC1331380kka = c1325710kbR.LJIILL;
        } else {
            enumC1331380kka = enumC1331380kka2;
        }
        return c1325540kbA.LJFF(c1325710kbR, obj2, enumC1320950kTl, (C1320270kSf) interfaceC1325670kbNLJJII, EnumC1331380kka.getHigherPriority(enumC1331380kka2, enumC1331380kka));
    }
}
