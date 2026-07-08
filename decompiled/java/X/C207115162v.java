package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.TranslationInfo;
import java.util.List;

/* JADX INFO: renamed from: X.162v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207115162v extends C163Z<C207097162d> {
    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ void LJFF(Aweme aweme, AnonymousClass1648 anonymousClass1648) {
    }

    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ void LJII(Aweme aweme, C207127163h c207127163h) {
    }

    @Override // X.AnonymousClass1636
    public final C163A LIZIZ() {
        return C207097162d.LJ;
    }

    @Override // X.AnonymousClass1636
    public final EnumC207101162h LIZJ() {
        return EnumC207101162h.PHOTO_TEXT;
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIIZ(Aweme aweme) {
        return C161N.LIZIZ.LJJLIIIJJIZ(aweme);
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIJ(Aweme aweme, EnumC715680S5m enumC715680S5m) {
        return C161N.LIZIZ.LJ(aweme, null);
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
        List<PhotoModeImageUrlModel> imageList;
        TranslationInfo translationInfo;
        Aweme aweme2 = aweme;
        if (c162u != null) {
            EnumC207100162g enumC207100162g = EnumC207100162g.PHOTO_TEXT;
            PhotoModeImageInfo photoModeImageInfo = aweme2.getPhotoModeImageInfo();
            String str = null;
            if (photoModeImageInfo != null && (translationInfo = photoModeImageInfo.getTranslationInfo()) != null) {
                str = translationInfo.iamgeMajorLanguage;
            }
            PhotoModeImageInfo photoModeImageInfo2 = aweme2.getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null && !imageList.isEmpty()) {
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
            c162u.LIZJ(enumC207100162g, enumC1782690wUV, str, null, null, null);
        }
    }
}
