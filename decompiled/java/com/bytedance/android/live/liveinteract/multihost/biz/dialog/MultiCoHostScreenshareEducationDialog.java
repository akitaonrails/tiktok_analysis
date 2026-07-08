package com.bytedance.android.live.liveinteract.multihost.biz.dialog;

import X.C1143680frq;
import X.C497740JfY;
import X.C785410UrT;
import X.C786410Ut5;
import X.C816490W1f;
import X.C915980Zwa;
import X.C954630awv;
import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LifecycleAwareDialog;
import com.bytedance.android.live.liveinteract.api.LinkCoHostLeaveChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AwS451S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiCoHostScreenshareEducationDialog extends LifecycleAwareDialog {
    public static final /* synthetic */ int LLJJI = 0;
    public final boolean LLJILJIL;
    public final String LLJILJILJ;
    public final DataChannel LLJILLL;
    public final AwS451S0200000_15 LLJJ;

    @Override // X.C19GJ
    public final boolean LJLI() {
        return false;
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJLIIIL() {
        show();
        C785410UrT.LIZIZ(this);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(this);
        C816490W1f.LIZ(this);
        C915980Zwa.LJII().LLLJIL(C954630awv.class, this.LLJJ);
        DataChannel dataChannel = this.LLJILLL;
        if (dataChannel != null) {
            dataChannel.CQ2(LinkCoHostLeaveChannel.class, this, new AwS594S0100000_15(this, 466));
        }
    }

    @Override // X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        C915980Zwa.LJII().LJJLIIIJL(C954630awv.class, this.LLJJ);
        DataChannel dataChannel = this.LLJILLL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        super.dismiss();
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View decorView;
        super.onCreate(bundle);
        if (getWindow() != null) {
            Window window = getWindow();
            if (window != null) {
                window.setStatusBarColor(0);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setNavigationBarColor(0);
            }
            Window window3 = getWindow();
            if (window3 != null) {
                window3.addFlags(Integer.MIN_VALUE);
            }
            Window window4 = getWindow();
            if (window4 != null && (decorView = window4.getDecorView()) != null) {
                decorView.setSystemUiVisibility(512);
            }
            Window window5 = getWindow();
            if (window5 != null) {
                window5.setLayout(-1, -1);
            }
        }
        setContentView(C786410Ut5.LJLLJ(getContext(), R.layout.h2y, null), new ViewGroup.LayoutParams(-1, -1));
        View viewFindViewById = findViewById(R.id.euw);
        if (viewFindViewById != null) {
            View viewFindViewById2 = viewFindViewById.findViewById(R.id.ft0);
            if (viewFindViewById2 != null) {
                C786410Ut5.I7(new ACListenerS150S0100000_15(this, 156), viewFindViewById2);
            }
            View viewFindViewById3 = viewFindViewById.findViewById(R.id.lqp);
            TextView textView = (TextView) viewFindViewById.findViewById(R.id.mwj);
            TextView textView2 = (TextView) viewFindViewById.findViewById(R.id.mwi);
            if (this.LLJILJIL) {
                C1143680frq.LIZLLL(viewFindViewById3, "tiktok_live_interaction_demand_1", "ttlive_cohost_screenshare_education_screenshare.png");
                if (textView != null) {
                    textView.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131853123), Arrays.copyOf(new Object[]{this.LLJILJILJ}, 1)));
                }
                if (textView2 != null) {
                    textView2.setText(C497740JfY.LJIJI(2131853122));
                    return;
                }
                return;
            }
            C1143680frq.LIZLLL(viewFindViewById3, "tiktok_live_interaction_demand_1", "ttlive_cohost_screenshare_education_camera_only.png");
            if (textView != null) {
                textView.setText(C497740JfY.LJIJI(2131853121));
            }
            if (textView2 == null) {
                return;
            }
            textView2.setText(C786410Ut5.j4(C497740JfY.LJIJI(2131853120), Arrays.copyOf(new Object[]{this.LLJILJILJ}, 1)));
        }
    }

    public MultiCoHostScreenshareEducationDialog(Context context, boolean z, String str, Long l, DataChannel dataChannel) {
        super(context);
        this.LLJILJIL = z;
        this.LLJILJILJ = str;
        this.LLJILLL = dataChannel;
        this.LLJJ = new AwS451S0200000_15(l, this, 6);
    }
}
