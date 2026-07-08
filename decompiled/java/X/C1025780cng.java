package X;

import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0cng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025780cng {
    public static final C1026310coX LIZ(C1025830cnl c1025830cnl, C1025720cna c1025720cna) {
        AbstractC1025450cn9 abstractC1025450cn9;
        AwemeRawAd awemeRawAd;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        C1025790cnh c1025790cnh = c1025830cnl.LJIILL;
        AbstractC1025700cnY abstractC1025700cnY = c1025790cnh.LJFF;
        Integer num = null;
        if (abstractC1025700cnY instanceof AbstractC1025450cn9) {
            abstractC1025450cn9 = (AbstractC1025450cn9) abstractC1025700cnY;
        } else {
            abstractC1025450cn9 = null;
        }
        String str2 = c1025790cnh.LIZJ;
        Object obj = c1025790cnh.LIZ.LIZLLL;
        if (obj instanceof AwemeRawAd) {
            awemeRawAd = (AwemeRawAd) obj;
        } else {
            awemeRawAd = null;
        }
        boolean z4 = c1025790cnh.LJII;
        AdlpExtraModel adlpExtraModel = c1025790cnh.LJ;
        adlpExtraModel.setRefer((String) c1025830cnl.LJIIJJI.getValue());
        if (abstractC1025450cn9 != null) {
            str = abstractC1025450cn9.LJIIIIZZ;
        } else {
            str = null;
        }
        adlpExtraModel.setEnterScene(str);
        if (abstractC1025450cn9 != null) {
            num = abstractC1025450cn9.LJIIIZ;
        }
        adlpExtraModel.setAlphaLoadingEffectiveScene(num);
        Boolean bool = Boolean.TRUE;
        String str3 = c1025830cnl.LJIILL.LIZLLL;
        boolean z5 = false;
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
        if (abstractC1025450cn9 != null) {
            z5 = abstractC1025450cn9.LJII;
        }
        return new C1026310coX(str2, awemeRawAd, adlpExtraModel, z4, c1025720cna, new C1028100crQ(bool, str3, Boolean.FALSE, z, z2, Boolean.TRUE, boolValueOf, null, null, null, false, false, false, z5, null, Boolean.FALSE));
    }
}
