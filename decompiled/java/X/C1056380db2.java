package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.text.Regex;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0db2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056380db2 implements InterfaceC1056430db7 {
    public static boolean LIZJ;
    public static boolean LJ;
    public static final C1056380db2 LIZ = new C1056380db2();
    public static AbstractC1623806Xk<? extends Map<String, C1074830e4n>> LIZIZ = C491101vh.LIZ;
    public static String LIZLLL = "find_friends";

    public static final void LIZJ() {
        if (!EnumC1070410dxf.CONTACT.isGrant() || !(LIZIZ instanceof C491101vh) || LIZJ || LJ) {
            return;
        }
        LIZJ = true;
        C15O7.LIZJ(new Callable() { // from class: X.0NPP
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                C1C7U.LIZ("RecUserContactAccessHelper@4d.forceRead$1");
                C23250099c.LJ(C23271099x.INSTANCE, new C1056020daS(null));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RecUserContactAccessHelper@4d.forceRead$1");
                return unit;
            }
        });
    }

    @Override // X.InterfaceC1056430db7
    public final String LIZIZ(String str) {
        String str2;
        boolean z;
        int length;
        C1074830e4n c1074830e4n;
        if (C1076010e6h.LIZJ.LJIIJ().LJ()) {
            AbstractC1623806Xk<? extends Map<String, C1074830e4n>> abstractC1623806Xk = LIZIZ;
            if (!(abstractC1623806Xk instanceof C491101vh) && !(abstractC1623806Xk instanceof C1623706Xj)) {
                Map<String, C1074830e4n> mapLIZ = abstractC1623806Xk.LIZ();
                if (mapLIZ == null || (c1074830e4n = mapLIZ.get(str)) == null || (str2 = c1074830e4n.contactName) == null) {
                    str2 = "";
                }
                String strLIZ = C447550Hgn.LIZ(str2);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("get ");
                sbLIZ.append(str);
                sbLIZ.append(" -> ");
                sbLIZ.append(strLIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                if (strLIZ.length() == 0) {
                    throw new C1056400db4(EnumC1056390db3.NOT_FOUND);
                }
                if (strLIZ.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String strLJJIFFI = u.LJJIFFI(strLIZ, " ", "", false);
                    if (strLJJIFFI.charAt(0) != '+' ? !(2 > (length = strLJJIFFI.length()) || length >= 18 || !new Regex("[0-9.-]+").matches(strLJJIFFI)) : C2218571BsN.LIZJ().LJIIJJI(strLJJIFFI)) {
                        throw new C1056400db4(EnumC1056390db3.PHONE_FILTER);
                    }
                }
                if (strLIZ.length() != 0 && PatternProtector.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", 2).matcher(u.LJJIFFI(strLIZ, " ", "", false)).matches()) {
                    throw new C1056400db4(EnumC1056390db3.EMAIL);
                }
                return strLIZ;
            }
            C1071540dzU.LIZIZ.LIZIZ();
            LIZJ();
            throw new C1056400db4(EnumC1056390db3.ON_PROCESSING);
        }
        throw new C1056400db4(EnumC1056390db3.NO_GRANT);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1055970daN r8, java.lang.String r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            r0 = 202541(0x3172d, float:2.8382E-40)
            boolean r6 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            boolean r0 = r10 instanceof X.C1056030daT
            if (r0 == 0) goto L33
            r5 = r10
            X.0daT r5 = (X.C1056030daT) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L33
            int r2 = r2 - r1
            r5.LLILLL = r2
        L19:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L39
            if (r0 == r2) goto L5d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r6 == 0) goto L32
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L32:
            throw r1
        L33:
            X.0daT r5 = new X.0daT
            r5.<init>(r7, r10)
            goto L19
        L39:
            X.C155000ia.LIZIZ(r4)
            X.06Xj r0 = new X.06Xj
            r0.<init>()
            X.C1056380db2.LIZIZ = r0
            X.0e3q r1 = X.C1074230e3p.LIZ(r9)     // Catch: java.lang.Throwable -> L66
            r0 = 2
            X.C1074230e3p.LIZIZ(r1, r0)     // Catch: java.lang.Throwable -> L66
            X.0e3q r0 = X.C1074230e3p.LIZ(r9)     // Catch: java.lang.Throwable -> L66
            r5.LLILLL = r2     // Catch: java.lang.Throwable -> L66
            java.lang.Object r4 = r8.LIZJ(r0, r5)     // Catch: java.lang.Throwable -> L66
            if (r4 != r3) goto L60
            if (r6 == 0) goto L5c
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L5c:
            return r3
        L5d:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L66
        L60:
            X.0e4o r4 = (X.C1074840e4o) r4     // Catch: java.lang.Throwable -> L66
            X.C189200o6.m2constructorimpl(r4)     // Catch: java.lang.Throwable -> L66
            goto L72
        L66:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r4 = new X.00Yq
            r4.<init>(r0)
            X.C189200o6.m2constructorimpl(r4)
        L72:
            boolean r0 = X.C189200o6.m8isSuccessimpl(r4)
            java.lang.String r2 = "[UserCard]"
            if (r0 == 0) goto L8d
            r0 = r4
            X.0e4o r0 = (X.C1074840e4o) r0
            X.06Xi r1 = new X.06Xi
            java.util.Map<java.lang.String, X.0e4n> r0 = r0.hashNationalNumberMap
            r1.<init>(r0)
            X.C1056380db2.LIZIZ = r1
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r0 = "setup contact state success!"
            X.C1720106oR.LJI(r2, r0)
        L8d:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r4)
            if (r1 == 0) goto La1
            X.01vg r0 = new X.01vg
            r0.<init>(r1)
            X.C1056380db2.LIZIZ = r0
            int r0 = X.C2187451AjH.LIZ
            java.lang.String r0 = "setup contact state fail!"
            X.C1720106oR.LIZIZ(r2, r0, r1)
        La1:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r6 == 0) goto La8
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1056380db2.LIZLLL(X.0daN, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1056430db7
    public final Object LIZ(InterfaceC1055970daN interfaceC1055970daN, String str, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        LJ = z;
        if (EnumC1070410dxf.CONTACT.isGrant() && (LIZIZ instanceof C491101vh) && !z) {
            int i = C2187451AjH.LIZ;
            LIZLLL = str;
            Object objLIZLLL = LIZLLL(interfaceC1055970daN, str, interfaceC1364105Vn);
            if (objLIZLLL == C099R.LJFF()) {
                return objLIZLLL;
            }
            return Unit.LIZ;
        }
        C1264320j0Q.LIZ.getClass();
        C1264320j0Q.LIZLLL("[UserCard]", "triggerReadOnScene, skip read");
        return Unit.LIZ;
    }
}
