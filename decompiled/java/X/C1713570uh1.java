package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.verify.base.model.SchemaComposer;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.pipo.verify.base.model.VerifyInfo;
import com.bytedance.pipo.verify.base.tracking.VerifyAnalysisSession;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0uh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713570uh1 {
    public final C1713520ugw LIZ;
    public final C1713630uh7 LIZIZ;
    public final InterfaceC1713650uh9 LIZJ;
    public final C1714380uiK LIZLLL;
    public final String LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final Activity LJII;
    public final C1776150wJx LJIIIIZZ;
    public final C01GW LJIIIZ;
    public List<Pair<String, String>> LJIIJ;
    public final C01GW LJIIJJI;
    public boolean LJIIL;
    public final C1713680uhC LJIILIIL;
    public String LJIILJJIL;

    public final C1713840uhS LIZLLL() {
        return this.LIZ.LIZ.LIZ;
    }

    public final C1713530ugx LJ() {
        return (C1713530ugx) this.LJIIIZ.getValue();
    }

    public final EnumC1714450uiR LJFF() {
        return this.LIZ.LIZIZ.LIZ;
    }

    public final C1713750uhJ LJII() {
        Object obj = ((Map) this.LJFF.getValue()).get("PIPO_VERIFICATION_TECH_TRACKER");
        if (obj instanceof C1713750uhJ) {
            return (C1713750uhJ) obj;
        }
        return null;
    }

    public final VerifyInfo LJIIIZ() {
        return (VerifyInfo) this.LIZIZ.LIZLLL.getValue();
    }

    public final String LJI() {
        return LJ().LIZIZ();
    }

    public final VerifyDetail LJIIIIZZ() {
        return LJIIIZ().verifyDetail;
    }

    public final boolean LJIIJ() {
        C1713530ugx c1713530ugxLJ = LJ();
        String strLIZIZ = c1713530ugxLJ.LIZIZ();
        return (strLIZIZ == null || a0.LJJJIL(strLIZIZ) || c1713530ugxLJ.LJI.get()) ? false : true;
    }

    public static boolean LIZ(SchemaComposer schemaComposer) {
        if (schemaComposer != null) {
            String str = schemaComposer.f47native;
            if (str != null && str.length() > 0) {
                return true;
            }
            String str2 = schemaComposer.web;
            if (str2 != null && str2.length() > 0) {
                return true;
            }
            String str3 = schemaComposer.lynx;
            if (str3 != null && str3.length() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C1706890uWF
            if (r0 == 0) goto La7
            r8 = r11
            X.0uWF r8 = (X.C1706890uWF) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La7
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r4 = r8.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r3 = 4
            java.lang.String r6 = "exchange_session_request"
            r5 = 1
            if (r0 == 0) goto L6d
            if (r0 != r5) goto Lb3
            X.C155000ia.LIZIZ(r4)
        L25:
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            X.0uhJ r1 = r10.LJII()
            if (r1 == 0) goto L34
            boolean r0 = r10.LJIIJ()
            X.C1713750uhJ.LJIIIIZZ(r1, r6, r0, r3)
        L34:
            boolean r0 = r10.LJIIJ()
            if (r0 != 0) goto Lae
            X.0ugx r0 = r10.LJ()
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.LJI
            boolean r0 = r0.get()
            if (r0 == 0) goto L61
            X.0uhC r0 = r10.LJIILIIL
            X.0uhD r1 = new X.0uhD
            r2 = 0
            java.lang.String r3 = "SESSION_EXPIRED"
            java.lang.String r4 = ""
            r9 = 248(0xf8, float:3.48E-43)
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.LIZ(r1)
        L5b:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L61:
            X.0uhC r1 = r10.LJIILIIL
            java.lang.String r0 = "EXCHANGE_SESSION_FAILED"
            X.0uhD r0 = X.C1713490ugt.LIZ(r0, r4, r3)
            r1.LIZ(r0)
            goto L5b
        L6d:
            X.C155000ia.LIZIZ(r4)
            boolean r0 = r10.LJIIJ()
            r4 = 0
            if (r0 != 0) goto L97
            X.0uhJ r0 = r10.LJII()
            if (r0 == 0) goto L80
            r0.LJIIIZ(r6)
        L80:
            r8.LLILLL = r5
            X.0ugx r2 = r10.LJ()
            r2.getClass()
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0uWJ r0 = new X.0uWJ
            r0.<init>(r2, r4)
            java.lang.Object r4 = X.C23250099c.LJI(r8, r1, r0)
            if (r4 != r7) goto L25
            return r7
        L97:
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r2 = X.C2296808zG.LIZ(r0)
            X.0uWE r1 = new X.0uWE
            r1.<init>(r10, r4)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r4, r4, r1, r0)
            goto L34
        La7:
            X.0uWF r8 = new X.0uWF
            r8.<init>(r10, r11)
            goto L12
        Lae:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        Lb3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1713570uh1.LIZJ(X.05Vn):java.lang.Object");
    }

    public final void LJIIZILJ(C19EG c19eg) {
        if (!C1713600uh4.LIZ.get()) {
            this.LJIILIIL.LIZ(C1713490ugt.LIZ("SDK_NOT_INIT", null, 6));
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII().plus(this.LJIIIIZZ)), null, null, new C1713500ugu(this, c19eg, null), 3);
    }

    public static boolean LJIIL(C1713570uh1 c1713570uh1, int i) {
        boolean z;
        AFwS268S0000000_26 aFwS268S0000000_26 = AFwS268S0000000_26.get$arr$(660);
        AFwS268S0000000_26 aFwS268S0000000_262 = AFwS268S0000000_26.get$arr$(661);
        C1713630uh7 c1713630uh7 = c1713570uh1.LIZIZ;
        int i2 = 0;
        if (i >= 0 && i < c1713630uh7.LIZ.LIZLLL.size()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            c1713630uh7.getClass();
            return false;
        }
        Object obj = ListProtector.get(c1713630uh7.LIZ.LIZLLL, i);
        List<C1713640uh8> list = c1713630uh7.LIZ.LIZLLL;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (C1713640uh8 c1713640uh8 : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                if (i3 != i) {
                    arrayList.add(c1713640uh8);
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        C1713580uh2 c1713580uh2 = c1713630uh7.LIZ;
        C1713630uh7 c1713630uh72 = new C1713630uh7(new C1713580uh2(c1713580uh2.LIZ, c1713580uh2.LIZIZ, c1713580uh2.LIZJ, C13LP.LJLIL(arrayList, Collections.singletonList(obj))), 0);
        C1714380uiK c1714380uiKLIZ = C1714380uiK.LIZ(c1713570uh1.LIZLLL, false, false, c1713570uh1.LJIIIZ().verifyType, ((VerifyInfo) c1713630uh72.LIZLLL.getValue()).verifyType, 3);
        C1713520ugw c1713520ugw = c1713570uh1.LIZ;
        C1713540ugy c1713540ugyLIZ = C1713540ugy.LIZ(c1713520ugw.LIZJ, c1713570uh1.LJI());
        C1714040uhm c1714040uhmLIZ = C1714040uhm.LIZ(c1713570uh1.LIZ.LIZIZ, null, null, false, 127);
        aFwS268S0000000_26.getClass();
        C1713520ugw c1713520ugw2 = new C1713520ugw(c1713520ugw.LIZ, c1714040uhmLIZ, c1713540ugyLIZ);
        InterfaceC1713650uh9 interfaceC1713650uh9 = c1713570uh1.LIZJ;
        aFwS268S0000000_262.getClass();
        C1713570uh1 c1713570uh12 = new C1713570uh1(c1713520ugw2, c1713630uh72, interfaceC1713650uh9, c1714380uiKLIZ);
        c1713570uh12.LJIIL = c1713570uh1.LJIIL;
        if (!(c1713570uh1.LJII instanceof C19EG)) {
            return false;
        }
        C1713750uhJ c1713750uhJLJII = c1713570uh1.LJII();
        if (c1713750uhJLJII != null) {
            i2 = c1713750uhJLJII.LIZ;
        }
        C1713750uhJ c1713750uhJ = new C1713750uhJ(i2);
        c1713750uhJ.LJIIJ();
        c1713750uhJ.LIZIZ = c1713570uh12;
        c1713570uh12.LJIILJJIL(c1713750uhJ, "PIPO_VERIFICATION_TECH_TRACKER");
        c1713570uh12.LJIIZILJ((C19EG) c1713570uh1.LJII);
        return true;
    }

    public final void LJIILJJIL(Object obj, String str) {
        ((Map) this.LJFF.getValue()).put(str, obj);
    }

    public final void LJIILLIIL(String str, boolean z) {
        Unit unit;
        if (!C1714240ui6.LIZ()) {
            return;
        }
        if (z) {
            try {
                C1707060uWW c1707060uWW = C1707060uWW.LIZ;
                String str2 = LJIIIZ().verifyId;
                c1707060uWW.getClass();
                VerifyAnalysisSession verifyAnalysisSessionLIZ = C1707060uWW.LIZ(str2);
                if (verifyAnalysisSessionLIZ != null) {
                    verifyAnalysisSessionLIZ.LJIIIIZZ = str;
                    verifyAnalysisSessionLIZ.LJIIIZ = "do_verify_next_verify";
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C1713750uhJ c1713750uhJLJII = LJII();
        if (c1713750uhJLJII != null) {
            C1713750uhJ.LJIIJJI(c1713750uhJLJII, LJIIIZ().verifyType, str, "NEXT_VERIFY", "INTERNAL", "do_verify_next_verify", z);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C189200o6.m2constructorimpl(unit);
    }

    public static Object LIZIZ(C1713570uh1 c1713570uh1, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1713530ugx c1713530ugxLJ = c1713570uh1.LJ();
        c1713530ugxLJ.getClass();
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1707040uWU(c1713530ugxLJ, str, null, null));
    }

    public final Object LJIILIIL(String str, Map<String, String> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        C1713530ugx c1713530ugxLJ = LJ();
        c1713530ugxLJ.getClass();
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1706950uWL(str, c1713530ugxLJ, map, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public final void LJIILL(String str, String str2, boolean z) {
        Unit unit;
        String str3;
        String str4 = str2;
        if (!C1714240ui6.LIZ()) {
            return;
        }
        if (str4 == null) {
            str4 = "bio_fallback";
        }
        if (z) {
            try {
                C1707060uWW c1707060uWW = C1707060uWW.LIZ;
                String str5 = LJIIIZ().verifyId;
                c1707060uWW.getClass();
                VerifyAnalysisSession verifyAnalysisSessionLIZ = C1707060uWW.LIZ(str5);
                if (verifyAnalysisSessionLIZ != null) {
                    verifyAnalysisSessionLIZ.LJIIIIZZ = str;
                    verifyAnalysisSessionLIZ.LJIIIZ = str4;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C1713750uhJ c1713750uhJLJII = LJII();
        if (c1713750uhJLJII != null) {
            String str6 = LJIIIZ().verifyType;
            if (Intrinsics.LJFF(str4, "user_switch_method")) {
                str3 = "EXTERNAL";
            } else {
                str3 = "INTERNAL";
            }
            C1713750uhJ.LJIIJJI(c1713750uhJLJII, str6, str, "SWITCH_CANDIDATE", str3, str4, z);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C189200o6.m2constructorimpl(unit);
    }

    public C1713570uh1(C1713520ugw c1713520ugw, C1713630uh7 c1713630uh7, InterfaceC1713650uh9 interfaceC1713650uh9, C1714380uiK c1714380uiK) {
        Activity activityLIZJ;
        this.LIZ = c1713520ugw;
        this.LIZIZ = c1713630uh7;
        this.LIZJ = interfaceC1713650uh9;
        this.LIZLLL = c1714380uiK;
        String string = UUID.randomUUID().toString();
        this.LJ = string;
        this.LJFF = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(471));
        this.LJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1491));
        InterfaceC1713480ugs interfaceC1713480ugs = C1713600uh4.LJ;
        if (interfaceC1713480ugs != null) {
            activityLIZJ = interfaceC1713480ugs.LIZJ();
        } else {
            activityLIZJ = null;
        }
        this.LJII = activityLIZJ;
        this.LJIIIIZZ = new C1776150wJx(CoroutineExceptionHandler.LJJLIL, this, 5);
        this.LJIIIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1490));
        this.LJIIJJI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(470));
        this.LJIILIIL = new C1713680uhC(this, interfaceC1713650uh9, new AwS605S0100000_26(this, 727));
        C1713600uh4.LIZIZ.put(string, this);
    }

    public final void LJIIJJI(String str, String str2, String str3, Map<String, String> map) {
        try {
            C1714060uho.LIZIZ(this, str, str2, str3, this.LIZ, map);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1713600uh4.LIZIZ(th);
        }
    }
}
