package X;

import Y.AkS42S1300000_31;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editpost.DescTitleTranslatedText;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.translation.model.DescriptionTranslationResult;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.162X, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C162X extends C162R<C1869630ykj> {
    public static final C162X LJ = new C162X();
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(29));

    @Override // X.C163A
    public final String LJFF() {
        return "DescTranslationRepo";
    }

    @Override // X.C163A
    public final AbstractC1361510lXB LIZJ() {
        return (AbstractC1361510lXB) LJFF.getValue();
    }

    @Override // X.C163A
    public final EnumC207100162g LIZLLL(Aweme aweme) {
        return EnumC207100162g.DESCRIPTION;
    }

    @Override // X.C163A
    public final String LJ(Aweme aweme) {
        String descLanguage = aweme.getDescLanguage();
        if (descLanguage == null) {
            return "";
        }
        return descLanguage;
    }

    @Override // X.C163A
    public final boolean LIZ(Aweme aweme, String str, C162U c162u, EnumC207100162g enumC207100162g, InterfaceC1389740mGi interfaceC1389740mGi) {
        boolean z;
        Aweme aweme2 = aweme;
        DescTitleTranslatedText descTitleTranslatedText = aweme2.getDescTitleTranslatedText();
        if (descTitleTranslatedText == null || !C123100dR.LIZ(descTitleTranslatedText.translatedDescContent) || !Intrinsics.LJFF(descTitleTranslatedText.translatedDescLang, str)) {
            return false;
        }
        C162X c162x = LJ;
        c162x.getClass();
        C162Z c162z = (C162Z) LJFF.getValue();
        String strLIZIZ = C0SKF.LIZIZ(aweme2);
        String str2 = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        String str3 = descTitleTranslatedText.translatedDescContent;
        if (str3 != null) {
            str2 = str3;
        }
        if (interfaceC1389740mGi != null) {
            z = true;
        } else {
            z = false;
        }
        C1869630ykj c1869630ykjLJII = c162z.LJII(aweme2, strLIZIZ, str2, str, descTitleTranslatedText.translatedDescVariant, z);
        C163A.LJIILIIL(c162x, enumC207100162g, c162u, c1869630ykjLJII.c5(), c1869630ykjLJII.LIZLLL, null, "feed_cache", null, null, c1869630ykjLJII.LJ, 416);
        return true;
    }

    @Override // X.C163A
    public final C11NZ LJIILJJIL(Aweme aweme, C162U c162u, String str, InterfaceC1389740mGi interfaceC1389740mGi, String str2) {
        C11NZ<DescriptionTranslationResult> c11nzLJIIJ;
        Aweme aweme2 = aweme;
        String aid = aweme2.getAid();
        try {
            C161O c161oLIZ = C1236630iHl.LIZ();
            if (c161oLIZ == null || (c11nzLJIIJ = c161oLIZ.LJIIJ(aid, str, 0)) == null) {
                c11nzLJIIJ = C11IR.LL;
            }
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
            c11nzLJIIJ = C11IR.LL;
        }
        return c11nzLJIIJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new AkS42S1300000_31(c162u, interfaceC1389740mGi, str, aweme2, 1)).LJL(C11S5.LIZ());
    }
}
