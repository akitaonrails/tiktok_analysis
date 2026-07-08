package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.TextMoreAnchor;
import com.ss.android.ugc.aweme.feed.model.TitlePanelConfigs;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.utils.IAdOpenHelper;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0ddq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058120ddq implements InterfaceC1066840dru {
    public Aweme LIZ;
    public TextMoreAnchor LIZIZ;
    public String LIZJ;
    public AnchorCommonStruct LIZLLL;

    @Override // X.InterfaceC1066840dru
    public final UrlModel getIconUrl() {
        return null;
    }

    @Override // X.InterfaceC1066840dru
    public final String LIZ() {
        TextMoreAnchor textMoreAnchor = this.LIZIZ;
        if (textMoreAnchor != null) {
            return textMoreAnchor.title;
        }
        return null;
    }

    @Override // X.InterfaceC1066840dru
    public final String LIZIZ() {
        TextMoreAnchor textMoreAnchor = this.LIZIZ;
        if (textMoreAnchor != null) {
            return textMoreAnchor.prefix;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1066840dru
    public final int LIZLLL() {
        String str;
        TextMoreAnchor textMoreAnchor = this.LIZIZ;
        if (textMoreAnchor == null || (str = textMoreAnchor.iconName) == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -1302661034:
                if (str.equals("IconLinkFill")) {
                    return R.raw.icon_link_fill;
                }
                return 0;
            case -1209764794:
                if (str.equals("IconShoppingCartFillLTR")) {
                    return R.raw.icon_shopping_cart_fill_ltr;
                }
                return 0;
            case -909535900:
                if (str.equals("IconDownloadFill")) {
                    return R.raw.icon_download_fill;
                }
                return 0;
            case -111818845:
                if (str.equals("IconNewspaperFill")) {
                    return R.raw.icon_newspaper_fill;
                }
                return 0;
            case 683236050:
                if (str.equals("IconBagFill")) {
                    return R.raw.icon_bag_fill;
                }
                return 0;
            case 1092707737:
                if (str.equals("IconQ_38_AFillLTR")) {
                    return R.raw.icon_qa_fill_ltr;
                }
                return 0;
            default:
                return 0;
        }
    }

    @Override // X.InterfaceC1066840dru
    public final String LJII() {
        TextMoreAnchor textMoreAnchor = this.LIZIZ;
        if (textMoreAnchor != null) {
            return textMoreAnchor.suffix;
        }
        return null;
    }

    @Override // X.InterfaceC1066840dru
    public final InterfaceC1066840dru clone() {
        C1058120ddq c1058120ddq = new C1058120ddq();
        c1058120ddq.LIZJ = this.LIZJ;
        c1058120ddq.LIZ = this.LIZ;
        c1058120ddq.LIZLLL = this.LIZLLL;
        c1058120ddq.LIZIZ = this.LIZIZ;
        return c1058120ddq;
    }

    @Override // X.InterfaceC1066840dru
    public final InterfaceC1392590mLJ LJIIIIZZ() {
        return C1065370dpX.LIZ(this);
    }

    @Override // X.InterfaceC1066840dru
    public final AnchorCommonStruct LJI() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1066840dru
    public final Aweme getAweme() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1066840dru
    public final void LIZJ(C2344009Gk c2344009Gk) {
        Activity activityLIZIZ;
        IAdOpenHelper iAdOpenHelper;
        C1065370dpX.LIZIZ(this, this.LIZJ, this.LIZ, c2344009Gk);
        Aweme aweme = this.LIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        Activity activityLIZIZ2 = null;
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        if (C708480Rqg.LIZ(activityLIZIZ, aweme)) {
            return;
        }
        C0SWD.LIZ = 1;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ2 != null) {
            activityLIZIZ2 = abstractC1387200mCcLIZIZ2.LIZIZ();
        }
        Aweme aweme2 = this.LIZ;
        if (activityLIZIZ2 != null && aweme2 != null && (iAdOpenHelper = (IAdOpenHelper) PluggableExtentionKt.pluggableSpi$default(IAdOpenHelper.class, false, false, false, 14, null)) != null) {
            iAdOpenHelper.LIZJ(activityLIZIZ2, aweme2);
        }
    }

    @Override // X.InterfaceC1066840dru
    public final void LJ(C2344009Gk c2344009Gk) {
        C1065370dpX.LIZJ(this, this.LIZJ, this.LIZ, c2344009Gk);
    }

    @Override // X.InterfaceC1066840dru
    public final boolean LJFF(int i, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str) {
        TextMoreAnchor textMoreAnchor;
        TitlePanelConfigs titlePanelConfigs;
        List<TextMoreAnchor> list;
        this.LIZJ = str;
        this.LIZ = aweme;
        this.LIZLLL = anchorCommonStruct;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (titlePanelConfigs = awemeRawAd.getTitlePanelConfigs()) != null && (list = titlePanelConfigs.anchors) != null) {
            textMoreAnchor = (TextMoreAnchor) C13LP.LJJJLZIJ(i, list);
        } else {
            textMoreAnchor = null;
        }
        this.LIZIZ = textMoreAnchor;
        if (AwemeExtKt.isTextMoreAd(aweme) && this.LIZIZ != null) {
            return true;
        }
        return false;
    }
}
