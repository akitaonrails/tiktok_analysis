package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.TranslationInfo;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.162d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207097162d extends C162R<C012W> {
    public static final C207097162d LJ;
    public static final String LJFF;
    public static final C01GW LJI;

    static {
        C207097162d c207097162d = new C207097162d();
        LJ = c207097162d;
        LJFF = c207097162d.getClass().getSimpleName();
        LJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(30));
    }

    @Override // X.C163A
    public final AbstractC1361510lXB LIZJ() {
        return (AbstractC1361510lXB) LJI.getValue();
    }

    @Override // X.C163A
    public final String LJFF() {
        return LJFF;
    }

    @Override // X.C163A
    public final EnumC207100162g LIZLLL(Aweme aweme) {
        return EnumC207100162g.PHOTO_TEXT;
    }

    @Override // X.C163A
    public final String LJ(Aweme aweme) {
        TranslationInfo translationInfo;
        String str;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo == null || (translationInfo = photoModeImageInfo.getTranslationInfo()) == null || (str = translationInfo.iamgeMajorLanguage) == null) {
            return "";
        }
        return str;
    }

    @Override // X.C163A
    public final C11NZ LJIILJJIL(Aweme aweme, C162U c162u, String str, InterfaceC1389740mGi interfaceC1389740mGi, String str2) {
        C163A.LJIILIIL(LJ, LIZLLL(null), c162u, null, false, null, null, null, null, null, 1016);
        return C11NZ.LJJJJZ(Boolean.TRUE);
    }
}
