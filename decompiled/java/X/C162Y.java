package X;

import Y.AkS202S0300000_31;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editpost.DescTitleTranslatedText;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.translation.model.PhotoTitleTranslationResult;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.162Y, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C162Y extends C162R<C1869630ykj> {
    public static final C162Y LJ;
    public static final String LJFF;
    public static final C01GW LJI;

    static {
        C162Y c162y = new C162Y();
        LJ = c162y;
        LJFF = c162y.getClass().getSimpleName();
        LJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(31));
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
        return EnumC207100162g.PHOTO_TITLE;
    }

    @Override // X.C163A
    public final String LJ(Aweme aweme) {
        String photoTitleLanguageCode = aweme.getPhotoTitleLanguageCode();
        if (photoTitleLanguageCode == null) {
            return "";
        }
        return photoTitleLanguageCode;
    }

    @Override // X.C163A
    public final boolean LIZ(Aweme aweme, String str, C162U c162u, EnumC207100162g enumC207100162g, InterfaceC1389740mGi interfaceC1389740mGi) {
        String title;
        boolean z;
        Aweme aweme2 = aweme;
        DescTitleTranslatedText descTitleTranslatedText = aweme2.getDescTitleTranslatedText();
        if (descTitleTranslatedText == null || !C123100dR.LIZ(descTitleTranslatedText.translatedTitle) || !Intrinsics.LJFF(descTitleTranslatedText.translatedTitleLang, str)) {
            return false;
        }
        C162Y c162y = LJ;
        c162y.getClass();
        C162Z c162z = (C162Z) LJI.getValue();
        PhotoModeImageInfo photoModeImageInfo = aweme2.getPhotoModeImageInfo();
        String str2 = "";
        if (photoModeImageInfo == null || (title = photoModeImageInfo.getTitle()) == null) {
            title = "";
        }
        String str3 = descTitleTranslatedText.translatedTitle;
        if (str3 != null) {
            str2 = str3;
        }
        if (interfaceC1389740mGi != null) {
            z = true;
        } else {
            z = false;
        }
        C1869630ykj c1869630ykjLJII = c162z.LJII(aweme2, title, str2, str, descTitleTranslatedText.translatedTitleVariant, z);
        C163A.LJIILIIL(c162y, enumC207100162g, c162u, c1869630ykjLJII.c5(), c1869630ykjLJII.LIZLLL, null, "feed_cache", null, null, c1869630ykjLJII.LJ, 416);
        return true;
    }

    @Override // X.C163A
    public final C11NZ LJIILJJIL(Aweme aweme, C162U c162u, String str, InterfaceC1389740mGi interfaceC1389740mGi, String str2) {
        C11NZ<PhotoTitleTranslationResult> c11nzLJIIIZ;
        Aweme aweme2 = aweme;
        String aid = aweme2.getAid();
        String strLLIIZ = C161N.LIZIZ.LLIIZ();
        try {
            C161O c161oLIZ = C1236630iHl.LIZ();
            if (c161oLIZ == null || (c11nzLJIIIZ = c161oLIZ.LJIIIZ(aid, strLLIIZ)) == null) {
                c11nzLJIIIZ = C11IR.LL;
            }
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
            c11nzLJIIIZ = C11IR.LL;
        }
        return c11nzLJIIIZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new AkS202S0300000_31(aweme2, interfaceC1389740mGi, c162u, 1)).LJL(C11S5.LIZ());
    }
}
