package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;

/* JADX INFO: renamed from: X.162s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207112162s extends C163Z<C162S> {
    @Override // X.AnonymousClass1636
    public final /* bridge */ /* synthetic */ void LJFF(Aweme aweme, AnonymousClass1648 anonymousClass1648) {
    }

    @Override // X.AnonymousClass1636
    public final C163A LIZIZ() {
        return C162S.LJ;
    }

    @Override // X.AnonymousClass1636
    public final EnumC207101162h LIZJ() {
        return EnumC207101162h.STICKER;
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIIZ(Aweme aweme) {
        return C0SCU.LIZ().LLIIII(aweme, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AnonymousClass1636
    public final void LJII(Aweme aweme, C207127163h c207127163h) {
        HashMap<String, String> map;
        C012V c012v;
        boolean zLJIIJ = LJIIJ(aweme, EnumC715680S5m.NOT_OVERWRITTEN);
        if (zLJIIJ && (c012v = (C012V) C162S.LJ.LJI(aweme, C161N.LIZIZ.LLIIZ())) != null) {
            map = c012v.LIZ;
        } else {
            map = null;
        }
        c207127163h.LIZLLL = new C0S5M(map, zLJIIJ);
    }

    @Override // X.AnonymousClass1636
    public final boolean LJIIJ(Aweme aweme, EnumC715680S5m enumC715680S5m) {
        return C161N.LIZIZ.LJJJJL(aweme, null);
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
        Integer numValueOf;
        String textStickerMajorityLang;
        Aweme aweme2 = aweme;
        if (c162u != null) {
            if (!C161F.LIZLLL(aweme2.getInteractStickerStructs())) {
                enumC1782690wUV = EnumC1782690wUV.NOT_EXIST;
            } else if (!z) {
                enumC1782690wUV = EnumC1782690wUV.NOT_TRANSLATABLE;
            } else if (!z2) {
                enumC1782690wUV = EnumC1782690wUV.TRANSLATION_NOT_TRIGGERED;
            } else {
                enumC1782690wUV = EnumC1782690wUV.TO_BE_TRANSLATED;
            }
            if (enumC1782690wUV == EnumC1782690wUV.TO_BE_TRANSLATED) {
                numValueOf = Integer.valueOf(C161N.LIZIZ.LJIJ(aweme2));
            } else {
                numValueOf = null;
            }
            if (enumC1782690wUV == EnumC1782690wUV.NOT_EXIST) {
                textStickerMajorityLang = null;
            } else {
                textStickerMajorityLang = aweme2.getTextStickerMajorityLang();
            }
            c162u.LIZJ(EnumC207100162g.TEXT_STICKER, enumC1782690wUV, textStickerMajorityLang, numValueOf, null, null);
        }
    }
}
