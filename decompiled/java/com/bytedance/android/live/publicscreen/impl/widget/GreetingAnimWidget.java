package com.bytedance.android.live.publicscreen.impl.widget;

import X.C01GW;
import X.C1083910eJR;
import X.C1124870fNV;
import X.C1133830fbx;
import X.C19748612Om;
import X.C292401Bi;
import X.C500260Jjc;
import X.ViewOnLayoutChangeListenerC1151610g4d;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget;
import com.bytedance.android.live.publicscreen.impl.GreetingReceivedEvent;
import com.bytedance.android.livesdk.dataChannel.StartClearScreenEvent;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class GreetingAnimWidget extends IPublicScreenContextWidget {
    public AnimatorSet LLJ;
    public boolean LLJI;
    public final C01GW LLILLJJLI = C292401Bi.LIZ(new AwS561S0100000_17(this, 85));
    public final C01GW LLILLL = C292401Bi.LIZ(new AwS561S0100000_17(this, 87));
    public final C01GW LLILZ = C292401Bi.LIZ(new AwS561S0100000_17(this, 86));
    public final C01GW LLILZIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 90));
    public final C01GW LLILZLL = C292401Bi.LIZ(new AwS561S0100000_17(this, 91));
    public final C01GW LLIZ = C292401Bi.LIZ(new AwS561S0100000_17(this, 88));
    public final C01GW LLIZLLLIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 89));
    public final C01GW LLJIJIL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(18));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gzy;
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        AnimatorSet animatorSet;
        ViewGroup viewGroup;
        this.LLJI = false;
        C1083910eJR.LIZ(this.dataChannel, 1);
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C19748612Om.LIZIZ(viewGroup);
        }
        AnimatorSet animatorSet2 = this.LLJ;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.LLJ) != null) {
            animatorSet.cancel();
        }
        hide();
    }

    public static CharSequence x1(Text text) {
        if (text == null) {
            return null;
        }
        String str = text.defaultPattern;
        String str2 = text.key;
        if (str2 != null && str2.length() != 0) {
            C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
            String str3 = text.key;
            c1124870fNVLIZJ.getClass();
            String strLIZIZ = C1124870fNV.LIZIZ(str3);
            if (strLIZIZ != null && strLIZIZ.length() != 0) {
                str = strLIZIZ;
            }
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        return C1133830fbx.LJIILJJIL(str, text, null);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View view = getView();
        if (view != null) {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1151610g4d(this, 1));
        }
        if (((Boolean) this.LLJIJIL.getValue()).booleanValue()) {
            C500260Jjc.LJIILIIL((View) this.LLIZLLLIL.getValue());
        } else {
            C500260Jjc.LJIILIIL((View) this.LLIZ.getValue());
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, GreetingReceivedEvent.class, new AwS596S0100000_17(this, 74));
            dataChannel.BQ2(this, StartClearScreenEvent.class, new AwS596S0100000_17(this, 75));
        }
    }
}
