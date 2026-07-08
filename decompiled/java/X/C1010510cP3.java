package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentRelationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cP3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010510cP3 extends AbstractC1010710cPN<ViewGroup> {
    public InterfaceC1010470cOz LLILZLL;
    public final C01GW LLIZ;

    @Override // X.AbstractC1010710cPN
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final ViewGroup LIZIZ() {
        ViewGroup viewGroup = this.LL.LIZ;
        if (viewGroup != null) {
            return (ViewGroup) viewGroup.findViewById(R.id.ynj);
        }
        return null;
    }

    @Override // X.AbstractC1010710cPN, X.C0PPF
    public final void bind() {
        C0Q18 c0q18 = (C0Q18) this.LLIZ.getValue();
        if (c0q18 != null) {
            c0q18.Xq2(EnumC656000PoE.SEARCH_AD_TWO_COLUMN_CARD_BOTTOM.getValue(), LIZIZ());
        }
        if (this.LLIZ.getValue() == null) {
            InterfaceC1010470cOz interfaceC1010470cOzLJIILL = C0R12.LIZIZ.LJIILL(new C1010400cOs(this));
            interfaceC1010470cOzLJIILL.r90(LIZIZ());
            interfaceC1010470cOzLJIILL.bind();
            this.LLILZLL = interfaceC1010470cOzLJIILL;
        } else {
            this.LLILZLL = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind SearchAdAnoleButtonComponent componentView = ");
        sbLIZ.append(LIZIZ());
        C2188811AlT.LIZIZ(sbLIZ);
        int i = C2510609se.LIZ;
        InterfaceC1011430cQX interfaceC1011430cQX = this.LL.LIZLLL;
        if (interfaceC1011430cQX != null) {
            interfaceC1011430cQX.LIZLLL(EnumC1011130cQ3.PHOTO_CARD_START_PLAY, new AwS560S0100000_16(this, 765));
        }
    }

    @Override // X.AbstractC1010710cPN, X.C0PPF
    public final void onViewAttachedToWindow() {
        InterfaceC1010470cOz interfaceC1010470cOz = this.LLILZLL;
        if (interfaceC1010470cOz != null) {
            interfaceC1010470cOz.onViewAttachedToWindow();
        }
    }

    @Override // X.AbstractC1010710cPN, X.C0PPF
    public final void onViewDetachedFromWindow() {
        InterfaceC1010470cOz interfaceC1010470cOz = this.LLILZLL;
        if (interfaceC1010470cOz != null) {
            interfaceC1010470cOz.onViewDetachedFromWindow();
        }
    }

    public C1010510cP3(C1010580cPA c1010580cPA) {
        super(c1010580cPA);
        this.LLIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 766));
    }

    @Override // X.AbstractC1010710cPN
    public final void LIZJ(InterfaceC1010450cOx interfaceC1010450cOx) {
        InterfaceC1010470cOz interfaceC1010470cOz = this.LLILZLL;
        if (interfaceC1010470cOz != null) {
            interfaceC1010470cOz.Ms(interfaceC1010450cOx);
        }
        InterfaceC658610PsR interfaceC658610PsR = (InterfaceC658610PsR) this.LLIZ.getValue();
        if (interfaceC658610PsR != null) {
            interfaceC658610PsR.Ms(interfaceC1010450cOx);
        }
    }

    @Override // X.AbstractC1010710cPN
    public final boolean LJFF(C1010580cPA c1010580cPA) {
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentRelationModel> map;
        Aweme aweme;
        AwemeRawAd awemeRawAd2;
        AnoleModel anoleModel2;
        Map<String, AnoleComponentRelationModel> map2;
        Aweme aweme2;
        AwemeRawAd awemeRawAd3;
        AnoleModel anoleModel3;
        Map<String, AnoleComponentRelationModel> map3;
        if (C1010120cOQ.LIZ(this.LLILLJJLI, EnumC656000PoE.SEARCH_AD_TWO_COLUMN_CARD_BOTTOM.getValue())) {
            return true;
        }
        int i = C658160Pri.LIZ[c1010580cPA.LIZJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                Aweme aweme3 = this.LLILLJJLI;
                if (aweme3 != null && C1010120cOQ.LJIIL(aweme3) && (aweme2 = this.LLILLJJLI) != null && (awemeRawAd3 = aweme2.getAwemeRawAd()) != null && (anoleModel3 = awemeRawAd3.getAnoleModel()) != null && (map3 = anoleModel3.componentRelations) != null && map3.containsKey("search_cta")) {
                    return true;
                }
                return false;
            }
            Aweme aweme4 = this.LLILLJJLI;
            if (aweme4 != null && C1010120cOQ.LJIIL(aweme4) && (aweme = this.LLILLJJLI) != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (anoleModel2 = awemeRawAd2.getAnoleModel()) != null && (map2 = anoleModel2.componentRelations) != null && map2.containsKey("search_carousel_ads_cta")) {
                return true;
            }
            return false;
        }
        Aweme aweme5 = this.LLILLJJLI;
        if (aweme5 != null && (awemeRawAd = aweme5.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.componentRelations) != null) {
            return map.containsKey("search_product_anchor");
        }
        return false;
    }
}
