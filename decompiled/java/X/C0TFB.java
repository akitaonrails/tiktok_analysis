package X;

import Y.ACListenerS116S0200000_12;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.game.GameLiveDualDeviceLoadEvent;
import com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice3.GameDualDeviceDialogV3;
import com.bytedance.android.livesdk.game.broadcast.toolbar.behavior.ToolbarGameDualDeviceBehavior$onLoadForLiveHostSettings$2;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0TFB, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TFB implements InterfaceViewOnClickListenerC1102800enu, C0UXZ {
    public final C01GW LL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(16));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(15));
    public DataChannel LLILLL;
    public C11JF LLILZ;
    public InterfaceC1103130eoR LLILZIL;
    public View LLILZLL;
    public C16F5 LLIZ;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean f1() {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean dj() {
        if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment()) {
            return true;
        }
        return C0TDF.LJI();
    }

    public final void LIZJ(View view) {
        boolean zBooleanValue;
        DataChannel dataChannel;
        FragmentManager fragmentManager;
        C20337914i1<Integer> c20337914i1;
        FragmentManager fragmentManager2;
        Context context;
        int i = 1;
        Boolean boolLJFF = C520010KaN.LJFF(C946803n0.LIZ(view), "hotsoon.intent.extra.IS_LANDSCAPE", true);
        if (boolLJFF != null) {
            zBooleanValue = boolLJFF.booleanValue();
        } else {
            zBooleanValue = true;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_setting_detail");
        c474500IjALIZ.LJJII(this.LLILLJJLI.getValue(), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(((Number) this.LL.getValue()).longValue()), "room_id");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LIZ();
        if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment()) {
            DataChannel dataChannel2 = this.LLILLL;
            if (dataChannel2 != null) {
                dataChannel2.LC0(GameLiveDualDeviceLoadEvent.class, 0);
            }
            if (zBooleanValue) {
                c20337914i1 = InterfaceC772390URp.c0;
            } else {
                c20337914i1 = InterfaceC772390URp.d0;
            }
            Object objLJJIIZ = C13LQ.LJJIIZ(c20337914i1.LIZIZ().intValue(), C0TDU.values());
            if (objLJJIIZ != null) {
                C0TDF.LIZIZ().onNext(objLJJIIZ);
            }
            C0TDF.LIZLLL().LIZLLL.onNext(Boolean.valueOf(zBooleanValue));
            if (view != null && (context = view.getContext()) != null) {
                C0TDF.LJII(C14KS.LJI(context), C14KS.LJ(context));
                C0TDF.LIZLLL().LIZIZ();
            }
            DataChannel dataChannel3 = this.LLILLL;
            if (dataChannel3 != null && (fragmentManager2 = (FragmentManager) dataChannel3.gg0(C748880TZe.class)) != null) {
                String str = GameDualDeviceDialogV3._pnsPageId;
                if (C0TDF.LJI()) {
                    i = 7;
                }
                C498390Jgb.LIZ(i, fragmentManager2, "live", zBooleanValue);
                return;
            }
            return;
        }
        if (C0TDF.LJI() && (dataChannel = this.LLILLL) != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            C743440TEg.LIZ(4, fragmentManager, "live_take_detail", zBooleanValue);
        }
    }

    public final void LIZLLL(DataChannel dataChannel) {
        View contentView;
        this.LLILLL = dataChannel;
        this.LLILZ = (C11JF) C0TDF.LIZJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS181S0100000_12(this, 32));
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            InterfaceC1103130eoR interfaceC1103130eoR = this.LLILZIL;
            if (interfaceC1103130eoR != null && (contentView = interfaceC1103130eoR.getContentView()) != null) {
                contentView.setOnLongClickListener(new ViewOnLongClickListenerC786000UsQ(this, 0));
            }
            View view = this.LLILZLL;
            if (view != null) {
                view.setOnLongClickListener(new ViewOnLongClickListenerC786000UsQ(this, 1));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        LIZJ(view);
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        C11JF c11jf = this.LLILZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILZ = null;
    }

    public final void LIZ(View view, float f) {
        ViewGroup viewGroup;
        if ((view instanceof ConstraintLayout) && (viewGroup = (ViewGroup) view) != null) {
            C16F5 c16f5 = new C16F5(viewGroup.getContext(), null);
            c16f5.setId(View.generateViewId());
            c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.ezt, viewGroup.getContext()));
            c16f5.setTextAppearance(R.style.a92);
            C19ME c19me = new C19ME(-2, -2);
            if (f > 0.0f) {
                c19me.setMarginEnd((int) C497740JfY.LIZIZ(f));
            }
            c19me.topToTop = 0;
            c19me.bottomToBottom = 0;
            c19me.endToEnd = 0;
            viewGroup.addView(c16f5, c19me);
            this.LLIZ = c16f5;
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLILZIL = interfaceC1103130eoR;
        if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment()) {
            LIZ(interfaceC1103130eoR.getContentView(), 0.0f);
        }
        LIZLLL(dataChannel);
    }

    @Override // X.C0UXZ
    public final void LIZIZ(DataChannel dataChannel, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        this.LLILZLL = c499640Jic.LIZ;
        if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment()) {
            LIZ(this.LLILZLL, 12.0f);
        }
        LIZLLL(dataChannel);
        View view = this.LLILZLL;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS116S0200000_12(this, dataChannel, 8), view);
        }
        lifecycleOwner.getLifecycle().addObserver(new ToolbarGameDualDeviceBehavior$onLoadForLiveHostSettings$2(this));
    }
}
