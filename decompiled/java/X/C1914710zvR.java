package X;

import Y.ACListenerS146S0100000_11;
import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ogc.news.INewsService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.whythisvideo.IWhyThisVideoService;
import com.ss.android.ugc.tiktok.pns.feedsafety.whythispost.ui.ContainerFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914710zvR extends LinearLayout {
    public final InterfaceC1914640zvK LL;
    public final Aweme LLILLJJLI;
    public final BaseSharePackage LLILLL;
    public SparkContext LLILZ;

    public final void LIZ(String str) {
        String str2;
        Bundle bundle;
        String string;
        BaseSharePackage baseSharePackage = this.LLILLL;
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string = bundle.getString("panel_source")) != null && a0.LJJIIZI(string, "share", false)) {
            str2 = "why_this_post";
        } else {
            str2 = "why_this_post_long_press";
        }
        C20684815ws.LJIILLIIL(str, C2097608Jq.LJIIIIZZ(new Pair("popup_id", "why_this_post_adjust_menu"), new Pair("enter_from", str2)));
    }

    public final void LIZIZ(String str) {
        String string;
        Bundle bundle;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("popup_id", "why_this_post_adjust_menu");
        BaseSharePackage baseSharePackage = this.LLILLL;
        if (baseSharePackage == null || (bundle = baseSharePackage.extras) == null || (string = bundle.getString("panel_source")) == null) {
            string = "";
        }
        pairArr[1] = new Pair("enter_from", string);
        pairArr[2] = new Pair("action", str);
        C20684815ws.LJIILLIIL("why_this_post_popup_click", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public C1914710zvR(Context context, ContainerFragment containerFragment, Aweme aweme, BaseSharePackage baseSharePackage) {
        int i;
        int i2;
        C11G4 c11g4;
        Bundle bundle;
        String string;
        C11G4 c11g42;
        C11G4 c11g43;
        C11G4 c11g44;
        C11G4 c11g45;
        String string2;
        super(context);
        this.LL = containerFragment;
        this.LLILLJJLI = aweme;
        this.LLILLL = baseSharePackage;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.iba, this, true);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.bmy);
        C127K c127k = (C127K) findViewById(R.id.pc6);
        C127K c127k2 = (C127K) findViewById(R.id.t84);
        C127K c127k3 = (C127K) findViewById(R.id.hxw);
        C127K c127k4 = (C127K) findViewById(R.id.nyr);
        C127K c127k5 = (C127K) findViewById(R.id.awg);
        C786410Ut5.a9(tuxIconView, new ACListenerS162S0100000_28(this, 143));
        int i3 = 8;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "keyword_filter_reverse", true, false)) {
            LIZ("show_kw_filtering_entrypoint");
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLZLL(c127k3, i);
        INewsService.LIZ.getClass();
        INewsService value = C0N2J.LIZIZ.getValue();
        if (value != null && value.LIZ() != null && C1168080gVC.LIZIZ()) {
            LIZ("manage_topics_button_show");
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LLZLL(c127k4, i2);
        IWhyThisVideoService iWhyThisVideoService = (IWhyThisVideoService) PluggableExtentionKt.pluggableSpi$default(IWhyThisVideoService.class, false, false, false, 14, null);
        if (iWhyThisVideoService != null && iWhyThisVideoService.LIZIZ()) {
            LIZ("refresh_fyf_button_show");
            i3 = 0;
        }
        C786410Ut5.LLZLL(c127k5, i3);
        C127M accessory = c127k5.getAccessory();
        if (accessory instanceof C11G4) {
            c11g4 = (C11G4) accessory;
        } else {
            c11g4 = null;
        }
        String str = "";
        if (c11g4 != null) {
            C1593970ra7.LIZ.getClass();
            if (!C1593970ra7.LIZ()) {
                string2 = "";
            } else {
                string2 = getContext().getString(2131829500);
            }
            c11g4.LJIILJJIL(string2);
        }
        c127k.setOnClickListener(new AwS590S0100000_11(this, 502));
        C127M accessory2 = c127k2.getAccessory();
        if ((accessory2 instanceof C11G4) && (c11g45 = (C11G4) accessory2) != null) {
            c11g45.LJIILL(new ACListenerS146S0100000_11(this, 72));
        }
        C127M accessory3 = c127k3.getAccessory();
        if ((accessory3 instanceof C11G4) && (c11g44 = (C11G4) accessory3) != null) {
            c11g44.LJIILL(new ACListenerS162S0100000_28(this, 144));
        }
        C127M accessory4 = c127k4.getAccessory();
        if ((accessory4 instanceof C11G4) && (c11g43 = (C11G4) accessory4) != null) {
            c11g43.LJIILL(new ACListenerS162S0100000_28(this, 145));
        }
        C127M accessory5 = c127k5.getAccessory();
        if ((accessory5 instanceof C11G4) && (c11g42 = (C11G4) accessory5) != null) {
            c11g42.LJIILL(new ACListenerS162S0100000_28(this, 146));
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("popup_id", "why_this_post_adjust_menu");
        if (baseSharePackage != null && (bundle = baseSharePackage.extras) != null && (string = bundle.getString("panel_source")) != null) {
            str = string;
        }
        pairArr[1] = new Pair("enter_from", str);
        C20684815ws.LJIILLIIL("why_this_post_popup_show", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
