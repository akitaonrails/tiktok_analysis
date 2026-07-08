package X;

import Y.ACListenerS162S0100000_28;
import Y.ACListenerS74S0110000_28;
import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.tiktok.pns.feedsafety.api.algorefresh.IAlgoRefreshService;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0zvW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914760zvW extends LinearLayout {
    public final BaseSharePackage LL;
    public final InterfaceC1914640zvK LLILLJJLI;

    public C1914760zvW(Context context, BaseSharePackage baseSharePackage, InterfaceC1914640zvK interfaceC1914640zvK) {
        boolean z;
        Bundle bundle;
        String string;
        super(context);
        this.LL = baseSharePackage;
        this.LLILLJJLI = interfaceC1914640zvK;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ibc, this, true);
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 150), findViewById(R.id.e1g));
        TextView textView = (TextView) findViewById(R.id.wtp_button);
        IAlgoRefreshService iAlgoRefreshService = (IAlgoRefreshService) PluggableExtentionKt.pluggableSpi$default(IAlgoRefreshService.class, false, false, false, 14, null);
        if (iAlgoRefreshService != null && iAlgoRefreshService.LIZJ()) {
            z = true;
        } else {
            z = false;
            textView.setText(C1383370m6R.LJIIJ(2131858502));
        }
        C786410Ut5.U8((C197039127h) findViewById(R.id.wtp_button), new ACListenerS74S0110000_28(z, this, 1));
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("popup_id", "why_this_post_algo_refresh");
        pairArr[1] = new Pair("enter_from", (baseSharePackage == null || (bundle = baseSharePackage.extras) == null || (string = bundle.getString("panel_source")) == null) ? "" : string);
        C20684815ws.LJIILLIIL("why_this_post_popup_show", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
