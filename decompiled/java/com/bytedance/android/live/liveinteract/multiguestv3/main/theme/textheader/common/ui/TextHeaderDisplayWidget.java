package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ui;

import X.C01F5;
import X.C01GW;
import X.C15P4;
import X.C1848410yCV;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C439101nJ;
import X.C452501pT;
import X.C500260Jjc;
import X.C931810aM7;
import X.C972080bP4;
import X.InterfaceC944150ag1;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS150S0100000_15;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import avg.f;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderDisplayStateChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderUiStateListenerManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.TextHeaderUsingRichTextChangeChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: loaded from: classes16.dex */
public final class TextHeaderDisplayWidget extends LiveWidget implements InterfaceC944150ag1 {
    public C15P4 LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 367));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i2r;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numLIZ;
        super.onCreate();
        View view = getView();
        C15P4 c15p4 = view != null ? (C15P4) view.findViewById(R.id.xn3) : null;
        this.LL = c15p4;
        ViewGroup.LayoutParams layoutParams = c15p4 != null ? c15p4.getLayoutParams() : null;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && (numLIZ = C931810aM7.LIZ(null)) != null) {
            int iLIZ = C439101nJ.LIZ(numLIZ.intValue());
            marginLayoutParams.setMarginStart(iLIZ);
            marginLayoutParams.setMarginEnd(iLIZ);
            C15P4 c15p42 = this.LL;
            if (c15p42 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c15p42);
                c15p42.setLayoutParams(marginLayoutParams);
            }
        }
        C15P4 c15p43 = this.LL;
        if (c15p43 != null) {
            c15p43.LJIILIIL();
        }
        C15P4 c15p44 = this.LL;
        if (c15p44 != null) {
            c15p44.setOnTouchListener(new View.OnTouchListener() { // from class: X.0asK
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        C972080bP4.LIZLLL("ACTION_UP", "TextHeaderDisplayWidget", 2);
                        view2.performClick();
                    }
                    return true;
                }
            });
        }
        C15P4 c15p45 = this.LL;
        if (c15p45 != null) {
            View.OnClickListener aCListenerS150S0100000_15 = new ACListenerS150S0100000_15(this, 126);
            if (C1848410yCV.LIZ) {
                aCListenerS150S0100000_15 = new f(aCListenerS150S0100000_15);
            }
            a aVar = new a(aCListenerS150S0100000_15);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c15p45);
            }
            c15p45.setOnClickListener(aVar);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, TextHeaderDisplayStateChannel.class, new AwS594S0100000_15(this, 434));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, TextHeaderUsingRichTextChangeChannel.class, new AwS594S0100000_15(this, 435));
        }
        C972080bP4.LIZLLL("onLoad", "TextHeaderDisplayWidget", 2);
        DataChannel dataChannel3 = this.dataChannel;
        x1(dataChannel3 != null ? (C01F5) dataChannel3.gg0(TextHeaderUsingRichTextChangeChannel.class) : null);
        getLifecycle().addObserver((TextHeaderUiStateListenerManager) this.LLILLJJLI.getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        getLifecycle().removeObserver((TextHeaderUiStateListenerManager) this.LLILLJJLI.getValue());
    }

    public final void x1(C01F5 c01f5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTextContent richTextStyle:");
        sbLIZ.append(c01f5);
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "TextHeaderDisplayWidget", 2);
        if (c01f5 != null && !Intrinsics.LJFF(c01f5, C01F5.LJIIIIZZ)) {
            C500260Jjc.LJLJLJ(this.LL, true);
            C15P4 c15p4 = this.LL;
            if (c15p4 != null) {
                c15p4.LJIIIIZZ(c01f5);
                return;
            }
            return;
        }
        C500260Jjc.LJLJLJ(this.LL, false);
    }
}
