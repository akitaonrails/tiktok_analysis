package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.opencamera;

import X.AbstractDialogC972150bPB;
import X.C09JN;
import X.C0IJT;
import X.C0UI0;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1161920gLG;
import X.C11JF;
import X.C16FS;
import X.C1701940uOG;
import X.C19490011Na;
import X.C19GI;
import X.C20441214yg;
import X.C465900IOu;
import X.C474500IjA;
import X.C769040UEs;
import X.C784440Upu;
import X.C785410UrT;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C924620aAW;
import X.C927580aFI;
import X.C927820aFg;
import X.C948450amx;
import X.InterfaceC948490an1;
import X.InterfaceC954180awC;
import Y.ACListenerS150S0100000_15;
import Y.AfS184S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorOpenCameraEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveAnchorMuteVideoEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiLiveAnchorOpenCameraDialog extends AbstractDialogC972150bPB implements GenericLifecycleObserver {
    public final DataChannel LLJI;
    public final LifecycleOwner LLJIJIL;
    public final String LLJILJIL;
    public C11JF LLJILJILJ;
    public boolean LLJILLL;
    public final String LLJJ;

    @InterfaceC948490an1(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mDataHolder;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g9h;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.LLJILLL = true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    public final void LJL() {
        MultiGuestDataHolder multiGuestDataHolder = this.mDataHolder;
        if (multiGuestDataHolder == null) {
            multiGuestDataHolder = null;
        }
        multiGuestDataHolder.LJJIIZI(true);
        String str = this.LLJILJIL;
        String str2 = Intrinsics.LJFF(str, "end_link_and_no_guest") ? "business_mute_host_end_link_and_no_guest" : Intrinsics.LJFF(str, "close_link") ? "business_mute_host_close_link" : "business_unknown";
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LJJL(Boolean.FALSE, str2, null);
        }
        if (C915980Zwa.LJIIIIZZ().LLJLL() == null) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
            C769040UEs.LIZLLL(this.LLJI);
        }
        C784440Upu.LIZ().LIZIZ(new C465900IOu(40));
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.LC0(MultiLiveAnchorMuteVideoEvent.class, new C0UI0(true, str2));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("log_name", "ttlive_multilive_anchor_switch_camera");
        jSONObject.put("switch", "on");
        jSONObject.put("way", "Anchor's camera is opened forcedly in MultiLiveAnchorOpenCameraDialog");
        C20441214yg.LJIIIZ(this.LLJJ, C786410Ut5.J3(jSONObject));
        dismiss();
        C785410UrT.LIZ(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LLJILLL) {
            LJL();
        }
        this.LLJILLL = false;
    }

    @Override // X.C19GI, X.DialogC19728412Gs, android.app.Dialog
    public final void show() {
        Object obj;
        WindowManager.LayoutParams attributes = null;
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT/yXtkcom5G7X882Jih7wpacNIu2jwum94Usfk1C5Nws9sAkaaqjYAovoETitaIVxGQ=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            C19GI c19gi = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (C19GI) obj;
            super.show();
            c0wst.LIZ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", null, objArr, c19gi, c0wzw, true);
        }
        Window window = getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.dimAmount = 0.0f;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
    }

    @Override // X.C19GI, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.LC0(AnchorOpenCameraEvent.class, new C927820aFg(false, this.LLJILJIL));
        }
        C11JF c11jf = this.LLJILJILJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJIJIL.getLifecycle().removeObserver(this);
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        this.LLJIJIL.getLifecycle().addObserver(this);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.LC0(AnchorOpenCameraEvent.class, new C927820aFg(true, this.LLJILJIL));
        }
        this.LLJILJILJ = (C11JF) C19490011Na.LIZ(0L, 1L, TimeUnit.SECONDS).LJLIIL(6L).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS184S0100000_15(this, 24), new C09JN() { // from class: X.0aG7
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MultiLiveAnchorOpenCameraDialog@d5d4.onCreate$2");
                C1C7U.LIZIZ("MultiLiveAnchorOpenCameraDialog@d5d4.onCreate$2");
            }
        });
        C786410Ut5.h8((C16FS) findViewById(R.id.pnu), new ACListenerS150S0100000_15(this, 59));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_downgrade_turn_on_camera_panel");
        C924620aAW.LJIILIIL(c474500IjALIZ);
        if (C927580aFI.LIZ) {
            str = "moderator_disconnect";
        } else {
            str = "guest_leave";
        }
        c474500IjALIZ.LJJII(str, "trigger");
        c474500IjALIZ.LIZ();
        C927580aFI.LIZ = false;
    }

    public MultiLiveAnchorOpenCameraDialog(Context context, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        super(context);
        this.LLJI = dataChannel;
        this.LLJIJIL = lifecycleOwner;
        this.LLJILJIL = "end_link_and_no_guest";
        this.LLJJ = "MultiLiveAnchorOpenCamera";
        C948450amx.LIZIZ.LIZJ(this);
    }
}
