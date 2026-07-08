package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;

/* JADX INFO: renamed from: X.162u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207114162u extends C163Z<C162Y> {
    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ void LJFF(Aweme aweme, AnonymousClass1648 anonymousClass1648) {
    }

    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ void LJII(Aweme aweme, C207127163h c207127163h) {
    }

    @Override // X.AnonymousClass1636
    public final C163A LIZIZ() {
        return C162Y.LJ;
    }

    @Override // X.AnonymousClass1636
    public final EnumC207101162h LIZJ() {
        return EnumC207101162h.PHOTO_TITLE;
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIIZ(Aweme aweme) {
        return C161N.LIZIZ.LJJJJZ(aweme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LJIIL(Aweme aweme, C164H c164h) {
        boolean z;
        C1869630ykj c1869630ykj;
        C164A c164a = (C164A) c164h;
        String str = null;
        if (c164a.LIZ) {
            C161N c161n = C161N.LIZIZ;
            if (c161n.LJJJJZ(aweme) && c161n.LLF(aweme, null) && (c1869630ykj = (C1869630ykj) C162Y.LJ.LJI(aweme, c161n.LLIIZ())) != null) {
                str = c1869630ykj.LIZIZ;
            }
        }
        c164a.LIZJ = str;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        c164a.LIZLLL = z;
        return true;
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIJ(Aweme aweme, EnumC715680S5m enumC715680S5m) {
        return C161N.LIZIZ.LLF(aweme, null);
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
        String title;
        String title2;
        Aweme aweme2 = aweme;
        if (c162u != null) {
            EnumC207100162g enumC207100162g = EnumC207100162g.PHOTO_TITLE;
            String photoTitleLanguageCode = aweme2.getPhotoTitleLanguageCode();
            PhotoModeImageInfo photoModeImageInfo = aweme2.getPhotoModeImageInfo();
            Integer numValueOf = null;
            if (photoModeImageInfo != null && (title2 = photoModeImageInfo.getTitle()) != null && title2.length() != 0) {
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
            PhotoModeImageInfo photoModeImageInfo2 = aweme2.getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null && (title = photoModeImageInfo2.getTitle()) != null) {
                numValueOf = Integer.valueOf(title.length());
            }
            c162u.LIZJ(enumC207100162g, enumC1782690wUV, photoTitleLanguageCode, numValueOf, null, null);
        }
    }
}
