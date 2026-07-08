package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.162z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207119162z extends AnonymousClass1635<C207113162t, C0S5R> implements InterfaceC585880MyQ {
    public final boolean LJIIJ;
    public final C207119162z LJIIJJI;

    @Override // X.AnonymousClass1637
    public final C164G LIZJ() {
        return new C0S5R(null, null, false, null);
    }

    @Override // X.AnonymousClass1637
    public final boolean LIZLLL() {
        return this.LJIIJ;
    }

    @Override // X.AnonymousClass1635
    public final InterfaceC585880MyQ LJI() {
        return this.LJIIJJI;
    }

    public C207119162z(C207113162t c207113162t) {
        super(c207113162t, new C1055510dZd());
        this.LJIIJ = true;
        this.LJIIJJI = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC585880MyQ
    public final void LIZ(String str) {
        Aweme aweme = (Aweme) this.LIZLLL;
        String aid = null;
        if (aweme != null) {
            aid = aweme.getAid();
        }
        if (!Intrinsics.LJFF(str, aid)) {
            return;
        }
        LJ(this.LJFF, EnumC715680S5m.NOT_OVERWRITTEN);
    }

    @Override // X.AnonymousClass1635
    public final void LJIIIIZZ(String str) {
        super.LJIIIIZZ(str);
        if (!C161T.LIZ().LIZ() && ((C0S5R) this.LJI.getValue()).LIZJ) {
            LJ(this.LJFF, EnumC715680S5m.NOT_OVERWRITTEN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    @Override // X.AnonymousClass1637
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C164G LIZIZ(X.C0S5Q r6, X.C0S5Q r7, com.ss.android.ugc.aweme.feed.model.Aweme r8, X.EnumC715680S5m r9) {
        /*
            r5 = this;
            X.0S5P r6 = (X.C0S5P) r6
            X.0S5P r7 = (X.C0S5P) r7
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = (com.ss.android.ugc.aweme.feed.model.Aweme) r8
            r4 = 0
            if (r8 == 0) goto Lb1
            X.0SKK r0 = r6.LIZ
            int[] r1 = X.C0SBI.LIZ
            int r0 = r0.ordinal()
            r2 = r1[r0]
            r1 = 1
            if (r2 == r1) goto L3d
            r0 = 2
            if (r2 == r0) goto L3d
            r0 = 3
            if (r2 == r0) goto Lb1
            r0 = 4
            if (r2 != r0) goto L37
            X.1649 r3 = new X.1649
            java.lang.String r0 = r8.getAid()
            r3.<init>(r1, r0)
            X.C207113162t.LJIIL(r8, r3)
            boolean r2 = r3.LIZLLL
            java.lang.String r1 = r3.LIZJ
            java.lang.String r0 = r3.LIZIZ
            X.0S5R r3 = new X.0S5R
            r3.<init>(r4, r1, r2, r0)
            return r3
        L37:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L3d:
            if (r7 == 0) goto Laf
            X.0SKK r2 = r7.LIZ
        L41:
            boolean r0 = X.C292360Bd4.LIZ
            if (r0 == 0) goto L95
            ITEM r0 = r5.LIZLLL
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L95
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isPhotoMode(r0)
            if (r0 != r1) goto L95
            java.lang.String r0 = r5.LJ
            boolean r0 = X.C0SKF.LIZLLL(r0)
            if (r0 == 0) goto Lad
            X.0SKK r0 = X.C0SKK.TRANSLATED
            if (r2 == r0) goto Lad
            X.161N r3 = X.C161N.LIZIZ
            boolean r0 = r3.LLF(r8, r4)
            if (r0 == 0) goto Lad
            X.162Y r2 = X.C162Y.LJ
            java.lang.String r0 = r3.LLIIZ()
            X.164B r0 = r2.LJI(r8, r0)
            X.0ykj r0 = (X.C1869630ykj) r0
            if (r0 == 0) goto L93
            java.lang.String r0 = r0.LIZIZ
        L75:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto Lad
        L7b:
            X.1649 r3 = new X.1649
            java.lang.String r0 = r8.getAid()
            r3.<init>(r1, r0)
            X.C207113162t.LJIIL(r8, r3)
            boolean r2 = r3.LIZLLL
            java.lang.String r1 = r3.LIZJ
            java.lang.String r0 = r3.LIZIZ
            X.0S5R r3 = new X.0S5R
            r3.<init>(r4, r1, r2, r0)
            return r3
        L93:
            r0 = r4
            goto L75
        L95:
            java.lang.String r0 = r5.LJ
            boolean r0 = X.C0SKF.LIZLLL(r0)
            if (r0 == 0) goto Lad
            X.0SKK r0 = X.C0SKK.TRANSLATED
            if (r2 == r0) goto Lad
            ITEM r0 = r5.LIZLLL
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L7b
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isPhotoMode(r0)
            if (r0 != r1) goto L7b
        Lad:
            r1 = 0
            goto L7b
        Laf:
            r2 = r4
            goto L41
        Lb1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207119162z.LIZIZ(X.0S5Q, X.0S5Q, java.lang.Object, X.0S5m):X.164G");
    }
}
