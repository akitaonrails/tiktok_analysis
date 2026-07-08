package X;

import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0cni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025800cni {
    public static final C1026310coX LIZ(C1025820cnk c1025820cnk, C1025720cna c1025720cna) {
        AbstractC1025450cn9 abstractC1025450cn9;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        AbstractC1025700cnY abstractC1025700cnY = c1025820cnk.LJIILL.LJI;
        AwemeRawAd awemeRawAd = null;
        if (abstractC1025700cnY instanceof AbstractC1025450cn9) {
            abstractC1025450cn9 = (AbstractC1025450cn9) abstractC1025700cnY;
        } else {
            abstractC1025450cn9 = null;
        }
        String str = (String) c1025820cnk.LJIJ.getValue();
        C1025810cnj c1025810cnj = c1025820cnk.LJIILL;
        Object obj = c1025810cnj.LIZ.LIZLLL;
        if (obj instanceof AwemeRawAd) {
            awemeRawAd = (AwemeRawAd) obj;
        }
        boolean z5 = c1025810cnj.LJIIIIZZ;
        AdlpExtraModel adlpExtraModel = c1025810cnj.LJFF;
        adlpExtraModel.setRefer((String) c1025820cnk.LJIIJJI.getValue());
        Boolean bool = Boolean.TRUE;
        if (abstractC1025450cn9 != null) {
            z = abstractC1025450cn9.LIZLLL;
            z2 = abstractC1025450cn9.LJ;
        } else {
            z = false;
            z2 = false;
        }
        if (abstractC1025450cn9 != null) {
            z3 = abstractC1025450cn9.LJFF;
        } else {
            z3 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z3);
        C1025810cnj c1025810cnj2 = c1025820cnk.LJIILL;
        String str2 = c1025810cnj2.LIZLLL;
        Integer numValueOf = Integer.valueOf(c1025810cnj2.LJ);
        if (abstractC1025450cn9 != null) {
            z4 = abstractC1025450cn9.LJII;
        } else {
            z4 = false;
        }
        return new C1026310coX(str, awemeRawAd, adlpExtraModel, z5, c1025720cna, new C1028100crQ(bool, null, Boolean.FALSE, z, z2, Boolean.TRUE, boolValueOf, null, str2, numValueOf, false, false, false, z4, null, Boolean.FALSE));
    }
}
