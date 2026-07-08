package X;

import Y.AkS42S1300000_31;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editpost.ClientText;
import com.ss.android.ugc.aweme.editpost.ClientTextWrapper;
import com.ss.android.ugc.aweme.editpost.DescTitleTranslatedText;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.translation.model.DescriptionTranslationResult;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.162W, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C162W extends C162R<C1869620yki> {
    public static final C162W LJ = new C162W();
    public static final C01GW LJFF = C452501pT.LIZIZ(new C1361500lXA());

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
        C1869620yki c1869620yki;
        boolean z2;
        boolean z3;
        Aweme aweme2 = aweme;
        DescTitleTranslatedText descTitleTranslatedText = aweme2.getDescTitleTranslatedText();
        if (descTitleTranslatedText == null) {
            return false;
        }
        String str2 = "feed_cache";
        String str3 = null;
        if (!Intrinsics.LJFF(descTitleTranslatedText.translatedDescLang, str)) {
            return false;
        }
        if (descTitleTranslatedText.translatedDescContent.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str4 = "";
        if (z) {
            ClientTextWrapper clientTextWrapper = new ClientTextWrapper(0, null);
            String strLIZIZ = C0SKF.LIZIZ(aweme2);
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            String str5 = descTitleTranslatedText.translatedDescContent;
            if (str5 != null) {
                str4 = str5;
            }
            if (interfaceC1389740mGi != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String str6 = descTitleTranslatedText.translatedDescVariant;
            if (((Boolean) C0B80.LIZ.getValue()).booleanValue()) {
                str3 = "feed_cache";
            }
            c1869620yki = new C1869620yki(clientTextWrapper, strLIZIZ, str4, str, z3, str6, str3);
        } else {
            ClientText clientText = descTitleTranslatedText.translatedDescClientText;
            if (clientText == null) {
                return false;
            }
            ClientTextWrapper clientTextWrapper2 = new ClientTextWrapper(2, clientText);
            String strLIZIZ2 = C0SKF.LIZIZ(aweme2);
            if (strLIZIZ2 != null) {
                str4 = strLIZIZ2;
            }
            String strLLIIZ = C161N.LIZIZ.LLIIZ();
            if (interfaceC1389740mGi != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str7 = descTitleTranslatedText.translatedDescVariant;
            if (((Boolean) C0B80.LIZ.getValue()).booleanValue()) {
                str3 = "feed_cache";
            }
            c1869620yki = new C1869620yki(clientTextWrapper2, str4, "", strLLIIZ, z2, str7, str3);
        }
        C162W c162w = LJ;
        c162w.getClass();
        ((AbstractC1361510lXB) LJFF.getValue()).LJFF(c1869620yki, aweme2, str);
        boolean z4 = c1869620yki.LJ;
        String str8 = c1869620yki.LJI;
        if (str8 != null) {
            str2 = str8;
        }
        C163A.LJIILIIL(c162w, enumC207100162g, c162u, 0, z4, null, str2, null, null, c1869620yki.LJFF, 416);
        return true;
    }

    @Override // X.C163A
    public final C11NZ LJIILJJIL(Aweme aweme, C162U c162u, String str, InterfaceC1389740mGi interfaceC1389740mGi, String str2) {
        C11NZ<DescriptionTranslationResult> c11nzLJIIJ;
        Aweme aweme2 = aweme;
        String aid = aweme2.getAid();
        try {
            C161O c161oLIZ = C1236630iHl.LIZ();
            if (c161oLIZ == null || (c11nzLJIIJ = c161oLIZ.LJIIJ(aid, str, 2)) == null) {
                c11nzLJIIJ = C11IR.LL;
            }
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
            c11nzLJIIJ = C11IR.LL;
        }
        return c11nzLJIIJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new AkS42S1300000_31(c162u, interfaceC1389740mGi, str, aweme2, 0)).LJL(C11S5.LIZ());
    }
}
