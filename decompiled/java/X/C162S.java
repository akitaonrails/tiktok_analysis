package X;

import Y.AkS202S0300000_31;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.translation.model.StickerTranslationResult;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.162S, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C162S extends C162R<C012V> {
    public static final C162S LJ = new C162S();
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(32));

    @Override // X.C163A
    public final String LJFF() {
        return "StickerTranslationRepo";
    }

    @Override // X.C163A
    public final AbstractC1361510lXB LIZJ() {
        return (AbstractC1361510lXB) LJFF.getValue();
    }

    @Override // X.C163A
    public final EnumC207100162g LIZLLL(Aweme aweme) {
        return EnumC207100162g.TEXT_STICKER;
    }

    @Override // X.C163A
    public final String LJ(Aweme aweme) {
        String textStickerMajorityLang = aweme.getTextStickerMajorityLang();
        if (textStickerMajorityLang == null) {
            return "";
        }
        return textStickerMajorityLang;
    }

    @Override // X.C163A
    public final C11NZ LJIILJJIL(Aweme aweme, C162U c162u, String str, InterfaceC1389740mGi interfaceC1389740mGi, String str2) {
        C11NZ<StickerTranslationResult> c11nzLJII;
        Aweme aweme2 = aweme;
        String aid = aweme2.getAid();
        String strLLIIZ = C161N.LIZIZ.LLIIZ();
        try {
            C161O c161oLIZ = C1236630iHl.LIZ();
            if (c161oLIZ == null || (c11nzLJII = c161oLIZ.LJII(aid, strLLIIZ)) == null) {
                c11nzLJII = C11IR.LL;
            }
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
            c11nzLJII = C11IR.LL;
        }
        return c11nzLJII.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJJJZI(new AkS202S0300000_31(aweme2, interfaceC1389740mGi, c162u, 2)).LJL(C11S5.LIZ());
    }
}
