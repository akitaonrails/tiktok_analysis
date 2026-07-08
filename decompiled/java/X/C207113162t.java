package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.162t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207113162t extends C163Z<C162X> {
    @Override // X.AnonymousClass1636
    public final C163A LIZIZ() {
        return C162X.LJ;
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
    public static final boolean LJIIL(Aweme aweme, C164H c164h) {
        boolean z;
        C1869630ykj c1869630ykj;
        AnonymousClass1649 anonymousClass1649 = (AnonymousClass1649) c164h;
        String str = null;
        if (anonymousClass1649.LIZ) {
            C161N c161n = C161N.LIZIZ;
            if (c161n.LLFII(aweme, null) && (c1869630ykj = (C1869630ykj) C162X.LJ.LJI(aweme, c161n.LLIIZ())) != null) {
                str = c1869630ykj.LIZIZ;
            }
        }
        anonymousClass1649.LIZJ = str;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        anonymousClass1649.LIZLLL = z;
        return true;
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
