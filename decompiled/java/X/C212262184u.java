package X;

import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnchorPinCardButtonProperty;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnchorPinCardConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BuyButtonProperty;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.184u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212262184u {
    public final C197039127h LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 522));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 521));
    public boolean LIZLLL;
    public AnchorPinCardConfig LJ;

    public final C212265184x LIZ() {
        return (C212265184x) this.LIZJ.getValue();
    }

    public final int LIZIZ() {
        if (this.LIZLLL) {
            Integer num = LIZ().LJII;
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
        Integer num2 = LIZJ().LJIIIIZZ;
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    public final C212266184y LIZJ() {
        return (C212266184y) this.LIZIZ.getValue();
    }

    public final TuxTextView LIZLLL() {
        return (TuxTextView) (this.LIZLLL ? LIZ() : LIZJ()).LIZ;
    }

    public C212262184u(C197039127h c197039127h) {
        this.LIZ = c197039127h;
    }

    public final void LJFF(boolean z) {
        C185J c185jLIZJ;
        if (this.LIZLLL) {
            c185jLIZJ = LIZ();
        } else {
            c185jLIZJ = LIZJ();
        }
        c185jLIZJ.LJIIIZ(z);
    }

    public final void LJ(C212284185q c212284185q, Integer num) {
        String str;
        String str2;
        Map<String, AnchorPinCardButtonProperty> map;
        Map<String, AnchorPinCardButtonProperty> map2;
        AnchorPinCardButtonProperty anchorPinCardButtonProperty;
        String str3;
        String str4;
        if (this.LIZLLL) {
            C212265184x c212265184xLIZ = LIZ();
            AnchorPinCardConfig anchorPinCardConfig = this.LJ;
            c212265184xLIZ.getClass();
            if ((num != null || (anchorPinCardConfig != null && (num = anchorPinCardConfig.buttonType) != null)) && anchorPinCardConfig != null && (map = anchorPinCardConfig.buttonConfig) != null && !map.isEmpty()) {
                c212265184xLIZ.LJII = num;
                if (anchorPinCardConfig != null && (map2 = anchorPinCardConfig.buttonConfig) != null && (anchorPinCardButtonProperty = map2.get(String.valueOf(num))) != null) {
                    c212265184xLIZ.LJI.setText(anchorPinCardButtonProperty.displayText);
                    if (C960203pA.LIZIZ(c212265184xLIZ.LJI.getContext()) && C123100dR.LIZ(anchorPinCardButtonProperty.displayTextColorDarkMode)) {
                        str3 = anchorPinCardButtonProperty.displayTextColorDarkMode;
                    } else {
                        str3 = anchorPinCardButtonProperty.displayTextColor;
                    }
                    c212265184xLIZ.LJI.setTextColor(ColorProtector.parseColor(str3));
                    if (C960203pA.LIZIZ(c212265184xLIZ.LJI.getContext()) && C123100dR.LIZ(anchorPinCardButtonProperty.backgroundColorDarkMode)) {
                        str4 = anchorPinCardButtonProperty.backgroundColorDarkMode;
                    } else {
                        str4 = anchorPinCardButtonProperty.backgroundColor;
                    }
                    c212265184xLIZ.LJIIL().LIZ(c212265184xLIZ.LJI, ColorProtector.parseColor(str4));
                    return;
                }
                return;
            }
            return;
        }
        if (c212284185q == null) {
            return;
        }
        C212266184y c212266184yLIZJ = LIZJ();
        c212266184yLIZJ.getClass();
        c212266184yLIZJ.LJII = Boolean.valueOf(c212284185q.LIZ);
        Integer num2 = c212284185q.LIZIZ;
        if (num2 != null) {
            c212266184yLIZJ.LJIIIIZZ = num2;
        }
        C182S c182s = PopupCardVO.Companion;
        Integer num3 = c212266184yLIZJ.LJIIIIZZ;
        c182s.getClass();
        BuyButtonProperty buyButtonPropertyLIZIZ = C182S.LIZIZ(num3);
        c212266184yLIZJ.LJI.setText(buyButtonPropertyLIZIZ.displayText);
        if (C960203pA.LIZIZ(c212266184yLIZJ.LJI.getContext()) && C123100dR.LIZ(buyButtonPropertyLIZIZ.displayTextColorDarkMode)) {
            str = buyButtonPropertyLIZIZ.displayTextColorDarkMode;
        } else {
            str = buyButtonPropertyLIZIZ.displayTextColor;
        }
        c212266184yLIZJ.LJI.setTextColor(ColorProtector.parseColor(str));
        if (C960203pA.LIZIZ(c212266184yLIZJ.LJI.getContext()) && C123100dR.LIZ(buyButtonPropertyLIZIZ.backgroundColorDarkMode)) {
            str2 = buyButtonPropertyLIZIZ.backgroundColorDarkMode;
        } else {
            str2 = buyButtonPropertyLIZIZ.backgroundColor;
        }
        c212266184yLIZJ.LJIIL().LIZ(c212266184yLIZJ.LJI, ColorProtector.parseColor(str2));
    }
}
