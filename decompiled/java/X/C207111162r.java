package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.162r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207111162r extends C163Z<C162W> {
    @Override // X.AnonymousClass1636
    public final C163A LIZIZ() {
        return C162W.LJ;
    }

    @Override // X.AnonymousClass1636
    public final EnumC207101162h LIZJ() {
        return EnumC207101162h.DESCRIPTION;
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIIZ(Aweme aweme) {
        return C0SKF.LIZ(aweme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c A[PHI: r5
      0x004c: PHI (r5v1 boolean) = (r5v0 boolean), (r5v0 boolean), (r5v0 boolean), (r5v3 boolean), (r5v3 boolean), (r5v3 boolean) binds: [B:8:0x0026, B:10:0x002c, B:11:0x002e, B:13:0x0033, B:14:0x0035, B:16:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIIL(com.ss.android.ugc.aweme.feed.model.Aweme r8, X.C164H r9) {
        /*
            X.1641 r9 = (X.AnonymousClass1641) r9
            X.162W r1 = X.C162W.LJ
            X.161N r7 = X.C161N.LIZIZ
            java.lang.String r0 = r7.LLIIZ()
            X.164B r6 = r1.LJI(r8, r0)
            X.0yki r6 = (X.C1869620yki) r6
            X.163t r1 = X.C163V.Companion
            r5 = 0
            if (r6 == 0) goto L4e
            com.ss.android.ugc.aweme.editpost.ClientTextWrapper r0 = r6.LIZ
            if (r0 == 0) goto L4e
            int r0 = r0.translationProtocol
        L1b:
            r1.getClass()
            X.163V r4 = X.C207139163t.LIZ(r0)
            boolean r0 = r9.LIZ
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L4c
            boolean r0 = r7.LLFII(r8, r3)
            if (r0 == 0) goto L4c
            if (r6 == 0) goto L4c
            r5 = 1
            X.163V r0 = X.C163V.TRANSLATION_PROTOCOL_V2
            if (r4 != r0) goto L4c
            if (r6 == 0) goto L4c
            com.ss.android.ugc.aweme.editpost.ClientTextWrapper r0 = r6.LIZ
            if (r0 == 0) goto L4c
            com.ss.android.ugc.aweme.editpost.ClientText r1 = r0.clientText
        L3d:
            X.163V r0 = X.C163V.TRANSLATION_PROTOCOL_PLAIN_TEXT
            if (r4 != r0) goto L45
            if (r6 == 0) goto L45
            java.lang.String r3 = r6.LIZJ
        L45:
            r9.LIZJ = r1
            r9.LJ = r5
            r9.LIZLLL = r3
            return r2
        L4c:
            r1 = r3
            goto L3d
        L4e:
            r0 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207111162r.LJIIL(com.ss.android.ugc.aweme.feed.model.Aweme, X.164H):boolean");
    }

    @Override // X.AnonymousClass1636
    public final void LJFF(Aweme aweme, AnonymousClass1648 anonymousClass1648) {
        C0SKF.LIZ(aweme);
    }

    @Override // X.AnonymousClass1636
    public final void LJII(Aweme aweme, C207127163h c207127163h) {
        boolean z;
        if (C0SKF.LIZ(aweme) && LJIIJ(aweme, EnumC715680S5m.NOT_OVERWRITTEN)) {
            z = true;
        } else {
            z = false;
        }
        c207127163h.LIZJ = z;
        LJIIL(aweme, new AnonymousClass1641(true, aweme.getAid()));
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIJ(Aweme aweme, EnumC715680S5m enumC715680S5m) {
        return C161N.LIZIZ.LLFII(aweme, null);
    }

    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ void LJI(C207134163o c207134163o, C207131163l c207131163l) {
    }

    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ void LJIIIIZZ(C207134163o c207134163o, AnonymousClass1643 anonymousClass1643) {
    }

    @Override // X.AnonymousClass1636
    public final void LIZLLL(Aweme aweme, C162U c162u, boolean z, boolean z2) {
        EnumC1782690wUV enumC1782690wUV;
        Aweme aweme2 = aweme;
        if (c162u != null) {
            EnumC207100162g enumC207100162g = EnumC207100162g.DESCRIPTION;
            String descLanguage = aweme2.getDescLanguage();
            String desc = aweme2.getDesc();
            int length = 0;
            if (desc != null && desc.length() != 0) {
                if (!z) {
                    enumC1782690wUV = EnumC1782690wUV.NOT_TRANSLATABLE;
                } else if (!z2) {
                    enumC1782690wUV = EnumC1782690wUV.TRANSLATION_NOT_TRIGGERED;
                } else {
                    enumC1782690wUV = EnumC1782690wUV.TO_BE_TRANSLATED;
                }
            } else {
                enumC1782690wUV = EnumC1782690wUV.NOT_EXIST;
            }
            String desc2 = aweme2.getDesc();
            if (desc2 != null) {
                length = desc2.length();
            }
            c162u.LIZJ(enumC207100162g, enumC1782690wUV, descLanguage, Integer.valueOf(length), null, null);
        }
    }
}
