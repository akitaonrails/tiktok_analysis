package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D9W, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D9W {
    public final EnumC334620D9w LIZ;
    public final EnumC334560D9q LIZIZ;
    public final C0DA4 LIZJ;
    public final C0D9Y LIZLLL;
    public final String LJ;
    public final C0DAM LJFF;

    public C0D9W() {
        this(null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D9W)) {
            return false;
        }
        C0D9W c0d9w = (C0D9W) obj;
        return this.LIZ == c0d9w.LIZ && this.LIZIZ == c0d9w.LIZIZ && this.LIZJ == c0d9w.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0d9w.LIZLLL) && Intrinsics.LJFF(this.LJ, c0d9w.LJ) && this.LJFF == c0d9w.LJFF;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        C0D9Y c0d9y = this.LIZLLL;
        int iHashCode2 = (iHashCode + (c0d9y == null ? 0 : c0d9y.hashCode())) * 31;
        String str = this.LJ;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutPaymentMethodState(bridgePhase=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cashierPhase=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", actionPhase=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", latestRefreshParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", exposureState=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZIZ() {
        return this.LIZ == EnumC334620D9w.READY && this.LIZIZ == EnumC334560D9q.READY && this.LIZJ == C0DA4.IDLE;
    }

    public final String LIZJ() {
        StringBuilder sb = new StringBuilder("bridge=");
        sb.append(this.LIZ.name());
        sb.append(", cashier=");
        sb.append(this.LIZIZ.name());
        sb.append(", action=");
        sb.append(this.LIZJ.name());
        sb.append(", refreshParamsReady=");
        sb.append(this.LIZLLL != null);
        String str = this.LJ;
        if (str != null && !a0.LJJJIL(str)) {
            sb.append(", msg=");
            sb.append(this.LJ);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0DB8 LIZLLL() {
        /*
            r5 = this;
            X.0D9w r4 = r5.LIZ
            X.0D9w r0 = X.EnumC334620D9w.FAILED
            java.lang.String r3 = ""
            if (r4 != r0) goto L2a
            X.0DAM r1 = r5.LJFF
            X.0DAM r0 = X.C0DAM.NOT_SHOWN
            if (r1 != r0) goto L2a
            java.lang.String r0 = r5.LJ
            if (r0 == 0) goto L13
            r3 = r0
        L13:
            boolean r0 = kotlin.text.a0.LJJJIL(r3)
            if (r0 == 0) goto L20
            r0 = 2131857514(0x7f11906a, float:1.934879E38)
            java.lang.String r3 = X.C0D9L.LIZ(r0)
        L20:
            java.lang.String r0 = r5.LIZJ()
            X.0DB9 r1 = new X.0DB9
            r1.<init>(r3, r0)
            return r1
        L2a:
            X.0D9q r2 = r5.LIZIZ
            X.0D9q r0 = X.EnumC334560D9q.FAILED
            if (r2 != r0) goto L52
            X.0DAM r1 = r5.LJFF
            X.0DAM r0 = X.C0DAM.NOT_SHOWN
            if (r1 != r0) goto L52
            java.lang.String r0 = r5.LJ
            if (r0 == 0) goto L3b
            r3 = r0
        L3b:
            boolean r0 = kotlin.text.a0.LJJJIL(r3)
            if (r0 == 0) goto L48
            r0 = 2131857494(0x7f119056, float:1.934875E38)
            java.lang.String r3 = X.C0D9L.LIZ(r0)
        L48:
            java.lang.String r0 = r5.LIZJ()
            X.0DB9 r1 = new X.0DB9
            r1.<init>(r3, r0)
            return r1
        L52:
            X.0D9w r0 = X.EnumC334620D9w.PREPARING
            if (r4 == r0) goto L5a
            X.0D9q r0 = X.EnumC334560D9q.INITIAL_LOADING
            if (r2 != r0) goto L6a
        L5a:
            X.0DAM r1 = r5.LJFF
            X.0DAM r0 = X.C0DAM.NOT_SHOWN
            if (r1 != r0) goto L6a
            X.0DB6 r1 = new X.0DB6
            java.lang.String r0 = r5.LIZJ()
            r1.<init>(r0)
            return r1
        L6a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r5.LIZJ()
            r2.append(r0)
            X.0DA4 r1 = r5.LIZJ
            X.0DA4 r4 = X.C0DA4.BUILDING_TOKEN
            r3 = 0
            if (r1 != r4) goto Laa
            r0 = 2131857473(0x7f119041, float:1.9348707E38)
            java.lang.String r1 = X.C0D9L.LIZ(r0)
        L84:
            if (r1 == 0) goto L94
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            if (r0 != 0) goto L94
            java.lang.String r0 = ", runtime="
            r2.append(r0)
            r2.append(r1)
        L94:
            java.lang.String r2 = r2.toString()
            X.0DA4 r1 = r5.LIZJ
            X.0DA4 r0 = X.C0DA4.REFRESHING
            if (r1 != r0) goto La8
            r0 = 1
        L9f:
            if (r1 != r4) goto La2
            r3 = 1
        La2:
            X.0DB7 r1 = new X.0DB7
            r1.<init>(r2, r0, r3)
            return r1
        La8:
            r0 = 0
            goto L9f
        Laa:
            X.0DA4 r0 = X.C0DA4.REFRESHING
            if (r1 != r0) goto Lb6
            r0 = 2131857545(0x7f119089, float:1.9348853E38)
            java.lang.String r1 = X.C0D9L.LIZ(r0)
            goto L84
        Lb6:
            java.lang.String r0 = r5.LJ
            if (r0 == 0) goto L94
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto L94
            java.lang.String r1 = r5.LJ
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D9W.LIZLLL():X.0DB8");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0D9W(C0D9Y c0d9y, int i) {
        EnumC334620D9w enumC334620D9w;
        EnumC334560D9q enumC334560D9q;
        C0DA4 c0da4;
        C0D9Y c0d9y2 = c0d9y;
        if ((i & 1) != 0) {
            enumC334620D9w = EnumC334620D9w.PREPARING;
        } else {
            enumC334620D9w = null;
        }
        if ((i & 2) != 0) {
            enumC334560D9q = EnumC334560D9q.INITIAL_LOADING;
        } else {
            enumC334560D9q = null;
        }
        if ((i & 4) != 0) {
            c0da4 = C0DA4.IDLE;
        } else {
            c0da4 = null;
        }
        this(enumC334620D9w, enumC334560D9q, c0da4, (i & 8) != 0 ? null : c0d9y2, null, (i & 32) != 0 ? C0DAM.NOT_SHOWN : null);
    }

    public C0D9W(EnumC334620D9w enumC334620D9w, EnumC334560D9q enumC334560D9q, C0DA4 c0da4, C0D9Y c0d9y, String str, C0DAM c0dam) {
        this.LIZ = enumC334620D9w;
        this.LIZIZ = enumC334560D9q;
        this.LIZJ = c0da4;
        this.LIZLLL = c0d9y;
        this.LJ = str;
        this.LJFF = c0dam;
    }

    public static C0D9W LIZ(C0D9W c0d9w, EnumC334620D9w enumC334620D9w, EnumC334560D9q enumC334560D9q, C0DA4 c0da4, C0D9Y c0d9y, String str, C0DAM c0dam, int i) {
        C0DAM c0dam2 = c0dam;
        String str2 = str;
        C0D9Y c0d9y2 = c0d9y;
        C0DA4 c0da42 = c0da4;
        EnumC334560D9q enumC334560D9q2 = enumC334560D9q;
        EnumC334620D9w enumC334620D9w2 = enumC334620D9w;
        if ((i & 1) != 0) {
            enumC334620D9w2 = c0d9w.LIZ;
        }
        if ((i & 2) != 0) {
            enumC334560D9q2 = c0d9w.LIZIZ;
        }
        if ((i & 4) != 0) {
            c0da42 = c0d9w.LIZJ;
        }
        if ((i & 8) != 0) {
            c0d9y2 = c0d9w.LIZLLL;
        }
        if ((i & 16) != 0) {
            str2 = c0d9w.LJ;
        }
        if ((i & 32) != 0) {
            c0dam2 = c0d9w.LJFF;
        }
        c0d9w.getClass();
        return new C0D9W(enumC334620D9w2, enumC334560D9q2, c0da42, c0d9y2, str2, c0dam2);
    }
}
