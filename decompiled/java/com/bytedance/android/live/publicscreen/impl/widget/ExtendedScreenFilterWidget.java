package com.bytedance.android.live.publicscreen.impl.widget;

import X.C011Z;
import X.C01GW;
import X.C09RB;
import X.C09RD;
import X.C1113890f5n;
import X.C292401Bi;
import X.C354201Zc;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import Y.ACListenerS120S0200000_17;
import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.publicscreen.impl.AddDisplaySourceOptionWrapperEvent;
import com.bytedance.android.live.publicscreen.impl.DisplaySourceOptionWrappersChannel;
import com.bytedance.android.live.publicscreen.impl.DisplayUserMarkFilterData;
import com.bytedance.android.live.publicscreen.impl.GiftHistoryEnabledChannel;
import com.bytedance.android.live.publicscreen.impl.RemoveDisplaySourceOptionWrapperEvent;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedSwitchToMarkedViewerEvent;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ExtendedScreenFilterWidget extends LiveRecyclableWidget {
    public RadioButton LLJ;
    public final C01GW LL = C292401Bi.LIZ(new AwS561S0100000_17(this, 82));
    public final C01GW LLILLJJLI = C292401Bi.LIZ(new AwS561S0100000_17(this, 79));
    public final C01GW LLILLL = C292401Bi.LIZ(new AwS561S0100000_17(this, 80));
    public final C01GW LLILZ = C292401Bi.LIZ(new AwS561S0100000_17(this, 81));
    public final C01GW LLILZIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 75));
    public final C01GW LLILZLL = C292401Bi.LIZ(new AwS561S0100000_17(this, 76));
    public final C01GW LLIZ = C292401Bi.LIZ(new AwS561S0100000_17(this, 77));
    public final C01GW LLIZLLLIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 78));
    public final ACListenerS152S0100000_17 LLJI = new ACListenerS152S0100000_17(this, 15);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hyc;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LLJ = (RadioButton) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C786410Ut5.I7(new ACListenerS152S0100000_17(this, 12), (View) this.LLILZIL.getValue());
        View view = (View) this.LLIZ.getValue();
        if (view != null) {
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 13), view);
        }
        View view2 = (View) this.LLIZLLLIL.getValue();
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 14), view2);
        }
        ((View) this.LLILLJJLI.getValue()).setClickable(false);
        ((View) this.LLILZ.getValue()).setClickable(false);
        ((View) this.LLILLL.getValue()).setClickable(false);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Boolean boolValueOf;
        List list;
        LiveMode liveMode;
        List list2;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(GiftHistoryEnabledChannel.class), Boolean.FALSE)) {
            View view = (View) this.LLIZ.getValue();
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null && (list2 = (List) dataChannel2.gg0(DisplaySourceOptionWrappersChannel.class)) != null && list2.isEmpty()) {
                hide();
            }
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (liveMode = (LiveMode) dataChannel3.gg0(LiveModeChannel.class)) != null) {
            boolValueOf = Boolean.valueOf(C354201Zc.LIZLLL(liveMode));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
            ((TextView) this.LLILZLL.getValue()).setText(C497740JfY.LJIJI(2131843077));
        }
        this.LLJ = (RadioButton) this.LLILLJJLI.getValue();
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null && (list = (List) dataChannel4.gg0(DisplaySourceOptionWrappersChannel.class)) != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                x1((C1113890f5n) it2.next());
            }
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.BQ2(this, AddDisplaySourceOptionWrapperEvent.class, new AwS596S0100000_17(this, 68));
        }
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            dataChannel6.BQ2(this, RemoveDisplaySourceOptionWrapperEvent.class, new AwS596S0100000_17(this, 69));
        }
        DataChannel dataChannel7 = this.dataChannel;
        if (dataChannel7 != null) {
            dataChannel7.BQ2(this, DisplayUserMarkFilterData.class, new AwS596S0100000_17(this, 70));
            dataChannel7.BQ2(this, LiveExtendedSwitchToMarkedViewerEvent.class, new AwS596S0100000_17(this, 71));
        }
    }

    public final void x1(C1113890f5n c1113890f5n) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLJIILL;
        ViewGroup viewGroup = (ViewGroup) this.LL.getValue();
        if (viewGroup == null) {
            return;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gqm, viewGroup, false);
        viewTd.setId(c1113890f5n.LIZIZ);
        RadioButton radioButton = (RadioButton) viewTd.findViewById(R.id.yqd);
        radioButton.setClickable(false);
        ((TextView) viewTd.findViewById(R.id.yqc)).setText(c1113890f5n.LIZ());
        C786410Ut5.I7(new ACListenerS120S0200000_17(radioButton, this, 7), viewTd);
        if (Intrinsics.LJFF(C497740JfY.LJIJI(2131844098), c1113890f5n.LIZ()) && (iLJIILL = C09RB.LJIILL(new C09RD((ViewGroup) this.LL.getValue()), this.LLIZLLLIL.getValue())) >= 0 && iLJIILL < viewGroup.getChildCount()) {
            viewGroup.addView(viewTd, iLJIILL);
        } else {
            viewGroup.addView(viewTd);
        }
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(8.0f));
            C786410Ut5.W5(viewTd, marginLayoutParams);
        }
    }

    public final void y1(View view, RadioButton radioButton, boolean z) {
        if (z) {
            this.LLJI.onClick(view);
        }
        RadioButton radioButton2 = this.LLJ;
        if (radioButton2 != null) {
            radioButton2.setChecked(false);
        }
        this.LLJ = radioButton;
        if (radioButton != null) {
            radioButton.setChecked(true);
        }
    }
}
