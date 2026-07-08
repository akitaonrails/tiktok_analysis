package Y;

import X.C0H9X;
import X.C0OBG;
import X.C1009410cNH;
import X.C1022820ciu;
import X.C1067210dsV;
import X.C1067230dsX;
import X.C2097608Jq;
import X.C2184171Adz;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen;
import com.ss.android.ugc.aweme.commercialize.model.DisclaimerText;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.AnoleAdCardModel;
import com.ss.android.ugc.aweme.model.AnoleProductModel;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class ACListenerS52S0400000_16 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS52S0400000_16 aCListenerS52S0400000_16, View view) {
        ((Function1) aCListenerS52S0400000_16.l0).invoke((WikipediaInfo) aCListenerS52S0400000_16.l1);
        C1067210dsV.LIZ(((C1067230dsX) aCListenerS52S0400000_16.l2).itemView.getContext(), (WikipediaInfo) aCListenerS52S0400000_16.l1, (Map) aCListenerS52S0400000_16.l3, C2097608Jq.LJ());
    }

    public static final void onClick$1(ACListenerS52S0400000_16 aCListenerS52S0400000_16, View view) {
        String str = ((DisclaimerText) aCListenerS52S0400000_16.l0).id;
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", (AwemeRawAd) aCListenerS52S0400000_16.l1);
        c1022820ciuLIZLLL.LIZJ("disclaimer", "refer");
        c1022820ciuLIZLLL.LIZIZ(str, "disclaimer_id");
        c1022820ciuLIZLLL.LJII();
        String str2 = ((DisclaimerText) aCListenerS52S0400000_16.l0).url;
        Activity activity = (Activity) aCListenerS52S0400000_16.l2;
        Aweme aweme = (Aweme) aCListenerS52S0400000_16.l3;
        IAdLightWebPageOpen iAdLightWebPageOpen = (IAdLightWebPageOpen) PluggableExtentionKt.pluggableSpi$default(IAdLightWebPageOpen.class, false, false, false, 14, null);
        if (iAdLightWebPageOpen != null) {
            iAdLightWebPageOpen.LIZ(activity, aweme, str2, false);
        }
    }

    public static final void onClick$2(ACListenerS52S0400000_16 aCListenerS52S0400000_16, View view) {
        String str = ((DisclaimerText) aCListenerS52S0400000_16.l0).id;
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", (AwemeRawAd) aCListenerS52S0400000_16.l1);
        c1022820ciuLIZLLL.LIZJ("disclaimer", "refer");
        c1022820ciuLIZLLL.LIZIZ(str, "disclaimer_id");
        c1022820ciuLIZLLL.LJII();
        String str2 = ((DisclaimerText) aCListenerS52S0400000_16.l0).url;
        Activity activity = (Activity) aCListenerS52S0400000_16.l2;
        Aweme aweme = (Aweme) aCListenerS52S0400000_16.l3;
        IAdLightWebPageOpen iAdLightWebPageOpen = (IAdLightWebPageOpen) PluggableExtentionKt.pluggableSpi$default(IAdLightWebPageOpen.class, false, false, false, 14, null);
        if (iAdLightWebPageOpen != null) {
            iAdLightWebPageOpen.LIZ(activity, aweme, str2, false);
        }
    }

    public static final void onClick$3(ACListenerS52S0400000_16 aCListenerS52S0400000_16, View view) {
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        C1009410cNH.LIZ(view.getContext(), "image", (AnoleProductModel) aCListenerS52S0400000_16.l0, (AnoleAdCardModel) aCListenerS52S0400000_16.l1, (AwemeRawAd) aCListenerS52S0400000_16.l2);
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "click", (AwemeRawAd) aCListenerS52S0400000_16.l2);
        c1022820ciuLIZLLL.LIZJ("image", "refer");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(((C0H9X) aCListenerS52S0400000_16.l3).LLILZ + 1), "index");
        c1022820ciuLIZLLL.LIZIZ(((AnoleProductModel) aCListenerS52S0400000_16.l0).getProductId(), "product_id");
        c1022820ciuLIZLLL.LJII();
    }

    public ACListenerS52S0400000_16(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
