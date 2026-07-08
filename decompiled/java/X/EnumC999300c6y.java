package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.BaseEcLiveFeedCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.EcLiveFeedPreviewCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.LiveInfoContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ShowInfoWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdCardWidget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC999300c6y {
    public static final EnumC999300c6y EC_AD_CARD;
    public static final EnumC999300c6y EC_LIVE_FEED_CARD;
    public static final EnumC999300c6y EC_LIVE_INFO;
    public static final EnumC999300c6y EC_PREVIEW_CARD_INFO;
    public static final /* synthetic */ EnumC999300c6y[] LLILZLL;
    public static final /* synthetic */ C2254308sP LLIZ;
    public static final EnumC999300c6y PROGRAMMED_LIVE_INFO;
    public static final EnumC999300c6y UNDEFINED;
    public final C0J09 LL;
    public final String LLILLJJLI;
    public final AbstractC999330c71 LLILLL;
    public final C0TNJ LLILZ;
    public final Class<? extends Object> LLILZIL;

    public static InterfaceC2044707zh<EnumC999300c6y> getEntries() {
        return LLIZ;
    }

    static {
        EnumC999300c6y enumC999300c6y = new EnumC999300c6y("UNDEFINED", 0, C0J09.UNDEFINED, "undefined component", new AbstractC999330c71() { // from class: X.0c6z
        }, C0TNJ.UNDEFINED, null);
        UNDEFINED = enumC999300c6y;
        C0J09 c0j09 = C0J09.EC_LIVE_FEED_CARD;
        C999340c72 c999340c72 = C999340c72.LIZ;
        C0TNJ c0tnj = C0TNJ.ECOM_LIVE;
        EnumC999300c6y enumC999300c6y2 = new EnumC999300c6y("EC_LIVE_FEED_CARD", 1, c0j09, "ecom card", c999340c72, c0tnj, BaseEcLiveFeedCardWidget.class);
        EC_LIVE_FEED_CARD = enumC999300c6y2;
        EnumC999300c6y enumC999300c6y3 = new EnumC999300c6y("EC_PREVIEW_CARD_INFO", 2, C0J09.EC_PREVIEW_CARD_INFO, "ecom double line info", C999350c73.LIZ, c0tnj, EcLiveFeedPreviewCardWidget.class);
        EC_PREVIEW_CARD_INFO = enumC999300c6y3;
        C0J09 c0j092 = C0J09.EC_LIVE_INFO;
        C999360c74 c999360c74 = C999360c74.LIZ;
        EnumC999300c6y enumC999300c6y4 = new EnumC999300c6y("EC_LIVE_INFO", 3, c0j092, "ecom single line info", c999360c74, c0tnj, LiveInfoContainerWidget.class);
        EC_LIVE_INFO = enumC999300c6y4;
        EnumC999300c6y enumC999300c6y5 = new EnumC999300c6y("EC_AD_CARD", 4, C0J09.EC_AD_CARD, "ecom ad lynx card", c999340c72, c0tnj, AdCardWidget.class);
        EC_AD_CARD = enumC999300c6y5;
        EnumC999300c6y enumC999300c6y6 = new EnumC999300c6y("PROGRAMMED_LIVE_INFO", 5, C0J09.PROGRAMMED_LIVE_INFO, "programmed live single line info", c999360c74, C0TNJ.PROGRAMMED_LIVE, ShowInfoWidget.class);
        PROGRAMMED_LIVE_INFO = enumC999300c6y6;
        EnumC999300c6y[] enumC999300c6yArr = {enumC999300c6y, enumC999300c6y2, enumC999300c6y3, enumC999300c6y4, enumC999300c6y5, enumC999300c6y6};
        LLILZLL = enumC999300c6yArr;
        LLIZ = new C2254308sP(enumC999300c6yArr);
    }

    public static EnumC999300c6y[] values() {
        return (EnumC999300c6y[]) LLILZLL.clone();
    }

    public final C0TNJ getBusinessType() {
        return this.LLILZ;
    }

    public final Class<? extends Object> getComponentClass() {
        return this.LLILZIL;
    }

    public final C0J09 getComponentName() {
        return this.LL;
    }

    public final String getDescription() {
        return this.LLILLJJLI;
    }

    public final AbstractC999330c71 getDisplayArea() {
        return this.LLILLL;
    }

    public static EnumC999300c6y valueOf(String str) {
        return (EnumC999300c6y) C08FF.LIZ(EnumC999300c6y.class, str);
    }

    public EnumC999300c6y(String str, int i, C0J09 c0j09, String str2, AbstractC999330c71 abstractC999330c71, C0TNJ c0tnj, Class cls) {
        this.LL = c0j09;
        this.LLILLJJLI = str2;
        this.LLILLL = abstractC999330c71;
        this.LLILZ = c0tnj;
        this.LLILZIL = cls;
    }
}
