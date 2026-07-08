package com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting;

import X.C497740JfY;
import X.C786410Ut5;
import X.C948450amx;
import X.C971370bNv;
import X.C978980baC;
import Y.ACListenerS150S0100000_15;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BaseMultiLiveSettingView extends MultiLiveSettingDialogContract$AbsView {
    public MultiLiveAnchorPanelSettings LLILZ;
    public DataChannel LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public boolean LLJI;
    public String LLJIJIL;
    public final MultiGuestDataHolder LLILZIL = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
    public boolean LLJ = true;

    public abstract void SR();

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsView
    public final C978980baC OR() {
        if (this.LLIZ == 0) {
            SR();
        }
        C978980baC c978980baC = new C978980baC();
        c978980baC.LIZJ = this.LLIZLLLIL;
        c978980baC.LIZ = SpannableString.valueOf(C497740JfY.LJIJI(2131844061));
        LinearLayout linearLayout = new LinearLayout(getContext());
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(((int) C497740JfY.LIZIZ(24.0f)) * 2, -2));
        if (this.LLJI) {
            LiveIconView liveIconView = new LiveIconView(getContext(), null);
            C786410Ut5.w6(liveIconView, new ViewGroup.LayoutParams((int) C497740JfY.LIZIZ(24.0f), (int) C497740JfY.LIZIZ(24.0f)));
            liveIconView.setIconAttr(R.attr.eny);
            linearLayout.addView(liveIconView);
            C786410Ut5.R7(linearLayout, new ACListenerS150S0100000_15(this, 183));
        } else if (this.LLJ) {
            LiveIconView liveIconView2 = new LiveIconView(getContext(), null);
            C786410Ut5.w6(liveIconView2, new ViewGroup.LayoutParams((int) C497740JfY.LIZIZ(24.0f), (int) C497740JfY.LIZIZ(24.0f)));
            liveIconView2.setIconAttr(R.attr.d33);
            linearLayout.addView(liveIconView2);
            C786410Ut5.R7(linearLayout, new ACListenerS150S0100000_15(this, 184));
            C971370bNv.LIZ(2131840792, linearLayout);
        }
        c978980baC.LJI = linearLayout;
        c978980baC.LJIIJ = new AwS559S0100000_15(this, 236);
        return c978980baC;
    }
}
