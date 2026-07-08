package X;

import com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount;

/* JADX INFO: renamed from: X.1ArH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192411ArH {
    public static IUserAccount LIZ;

    public static final int LIZJ(C2192431ArJ c2192431ArJ) {
        if ((c2192431ArJ.LIZ.getValue() & EnumC19365010pU.SINGLE_PROCESS.getValue()) == 1) {
            return 0;
        }
        if ((c2192431ArJ.LJ instanceof C20430814x0) && (c2192431ArJ.LIZ.getValue() & EnumC19365010pU.MULTI_PROCESS.getValue()) == 2) {
            return 1;
        }
        if (!(c2192431ArJ.LJ instanceof C20448114zn) || (c2192431ArJ.LIZ.getValue() & EnumC19365010pU.MULTI_PROCESS.getValue()) != 2) {
            return 0;
        }
        return 4;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1ArI] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.06Rh] */
    public static final C2192421ArI LIZ(final String str, C589160N8w c589160N8w, String str2) {
        final C2192451ArL c2192451ArL = new C2192451ArL();
        c2192451ArL.LIZ = C0XJF.KV;
        if (str == null) {
            str = "global";
        }
        final C1607706Rf c1607706Rf = C1607706Rf.LIZJ;
        c2192451ArL.LIZIZ = new Object(str, c1607706Rf) { // from class: X.06Rh
            public final String LIZ;
            public final C1607706Rf LIZIZ;

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ);
                sbLIZ.append('@');
                sbLIZ.append(this.LIZIZ);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = str;
                this.LIZIZ = c1607706Rf;
            }
        };
        if (c589160N8w != null) {
            c2192451ArL.LIZ(c589160N8w.LIZ("/"));
        }
        c2192451ArL.LIZ("kv");
        c2192451ArL.LIZLLL = str2;
        return new Object(c2192451ArL) { // from class: X.1ArI
            public static final /* synthetic */ int LJ = 0;
            public final C0XJF LIZ;
            public final C1607906Rh LIZIZ;
            public final C2192461ArM LIZJ;
            public final String LIZLLL;

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                C0XJF c0xjf = this.LIZ;
                sbLIZ.append(c0xjf != null ? c0xjf.getType() : null);
                sbLIZ.append("://");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append('/');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C2192461ArM c2192461ArM = this.LIZJ;
                if (c2192461ArM != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(c2192461ArM);
                    sbLIZ2.append('/');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(this.LIZLLL);
                return C2188811AlT.LIZIZ(sbLIZ3);
            }

            {
                this.LIZ = c2192451ArL.LIZ;
                this.LIZIZ = c2192451ArL.LIZIZ;
                this.LIZJ = c2192451ArL.LIZJ;
                this.LIZLLL = c2192451ArL.LIZLLL;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(java.lang.String r6, X.C589160N8w r7, X.EnumC20429814wq r8, java.lang.String r9) {
        /*
            if (r6 != 0) goto L6
            if (r7 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int[] r1 = X.C20361014lk.LIZ
            int r0 = r8.ordinal()
            r1 = r1[r0]
            r0 = 1
            java.lang.String r5 = ""
            if (r1 == r0) goto L63
            r0 = 2
            if (r1 != r0) goto L5d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 46
            if (r6 == 0) goto L2f
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r6)
            r0.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            if (r0 != 0) goto L30
        L2f:
            r0 = r5
        L30:
            r3.append(r0)
            if (r7 == 0) goto L4c
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "."
            java.lang.String r0 = r7.LIZ(r0)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 == 0) goto L4c
            r5 = r0
        L4c:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r5.toLowerCase(r0)
            r3.append(r0)
            r3.append(r9)
            java.lang.String r0 = r3.toString()
            return r0
        L5d:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L63:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r3 = 47
            if (r6 == 0) goto L7d
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r6)
            r0.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            if (r0 == 0) goto L7d
            r5 = r0
        L7d:
            r4.append(r5)
            java.lang.String r2 = "/"
            if (r7 == 0) goto L99
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r7.LIZ(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 == 0) goto L99
            r2 = r0
        L99:
            java.lang.String r0 = "kv/keva/"
            java.lang.String r1 = r2.concat(r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2192411ArH.LIZIZ(java.lang.String, X.0N8w, X.14wq, java.lang.String):java.lang.String");
    }
}
