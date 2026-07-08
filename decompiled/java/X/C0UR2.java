package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.DisableMuteMicEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.MuteMicCheckedEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicSwitchClosedEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UR2, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UR2 implements InterfaceViewOnClickListenerC1102800enu, C0UXZ {
    public final LifecycleOwner LL;
    public C20743716Ff LLILLJJLI;
    public DataChannel LLILLL;
    public InterfaceC1103130eoR LLILZ;
    public View LLILZIL;
    public LiveIconView LLILZLL;
    public boolean LLIZ;

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
    public final boolean dj() {
        return false;
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
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

    public final void LIZLLL() {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        if (C500260Jjc.LJJJIL(this.LLILLL)) {
            boolean z = C768810UDv.LIZ;
            if (z && (dataChannel2 = this.LLILLL) != null) {
                dataChannel2.FQ2(MuteMicSwitchClosedEvent.class);
            }
            boolean z2 = !z;
            C768800UDu.LIZ(this.LLILLL, "more_panel", z2);
            DataChannel dataChannel3 = this.LLILLL;
            if (dataChannel3 != null) {
                dataChannel3.zW(MuteMicChannel.class, Boolean.valueOf(z2));
            }
            LJ(z2);
            return;
        }
        if (C924810aAp.LJ().LJJJJ) {
            C766270U4b.LIZLLL(2131843202);
            boolean z3 = C768810UDv.LIZ;
            if (this.LLIZ) {
                LJ(z3);
                return;
            }
            C20743716Ff c20743716Ff = this.LLILLJJLI;
            if (c20743716Ff != null) {
                c20743716Ff.setChecked(z3);
                return;
            }
            return;
        }
        boolean z4 = C768810UDv.LIZ;
        boolean z5 = !z4;
        LJ(z5);
        DataChannel dataChannel4 = this.LLILLL;
        if (dataChannel4 != null) {
            dataChannel4.zW(MuteMicChannel.class, Boolean.valueOf(z5));
        }
        if (z4 && (dataChannel = this.LLILLL) != null) {
            dataChannel.FQ2(MuteMicSwitchClosedEvent.class);
        }
        C768800UDu.LIZ(this.LLILLL, "more_panel", z5);
    }

    public C0UR2(LifecycleOwner lifecycleOwner) {
        this.LL = lifecycleOwner;
    }

    public final void LIZ(boolean z) {
        float f;
        InterfaceC1103130eoR interfaceC1103130eoR = this.LLILZ;
        float f2 = 0.4f;
        if (interfaceC1103130eoR != null) {
            if (z) {
                f = 0.4f;
            } else {
                f = 1.0f;
            }
            interfaceC1103130eoR.setAlpha(f);
        }
        View view = this.LLILZIL;
        if (view != null) {
            if (!z) {
                f2 = 1.0f;
            }
            C786410Ut5.T4(view, f2);
        }
        boolean z2 = C768810UDv.LIZ;
        if (this.LLIZ) {
            LJ(z2);
        } else {
            C20743716Ff c20743716Ff = this.LLILLJJLI;
            if (c20743716Ff != null) {
                c20743716Ff.setChecked(z2);
            }
        }
        C1834150xpV.LJIIJ(this.LLILLJJLI, C500260Jjc.LJJIFFI(Boolean.valueOf(z)));
    }

    public final void LJ(boolean z) {
        Context context;
        Pair pair;
        View view = this.LLILZIL;
        if (view != null && (context = view.getContext()) != null) {
            if (z) {
                pair = new Pair(Integer.valueOf(C20736316Cj.LIZIZ(R.attr.ezv, C1834150xpV.LJIIIIZZ(context))), Integer.valueOf(R.attr.e3x));
            } else {
                int iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezs, C1834150xpV.LJIIIIZZ(context));
                if (LiveHostSettingsUIConfig.v2()) {
                    iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezs, C1834150xpV.LJII(context));
                }
                pair = new Pair(Integer.valueOf(iLIZIZ), Integer.valueOf(R.attr.e3u));
            }
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            LiveIconView liveIconView = this.LLILZLL;
            if (liveIconView != null) {
                liveIconView.setIcon(C20736316Cj.LIZLLL(iIntValue2, context));
            }
            LiveIconView liveIconView2 = this.LLILZLL;
            if (liveIconView2 != null) {
                liveIconView2.setIconTint(iIntValue);
            }
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        if (dataChannel != null) {
            dataChannel.zQ2(this.LL);
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLIZ = false;
        LIZJ(dataChannel, interfaceC1103130eoR, null, (C20743716Ff) interfaceC1103130eoR.findViewById(R.id.oy8));
    }

    @Override // X.C0UXZ
    public final void LIZIZ(DataChannel dataChannel, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        this.LLIZ = true;
        this.LLILZLL = c499640Jic.LIZIZ;
        LIZJ(dataChannel, null, c499640Jic.LIZ, c499640Jic.LJI);
        View view = c499640Jic.LIZ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), view);
        }
    }

    public final void LIZJ(DataChannel dataChannel, InterfaceC1103130eoR interfaceC1103130eoR, View view, C20743716Ff c20743716Ff) {
        this.LLILLL = dataChannel;
        this.LLILZ = interfaceC1103130eoR;
        this.LLILZIL = view;
        this.LLILLJJLI = c20743716Ff;
        if (c20743716Ff != null) {
            c20743716Ff.setDisabledAlpha(1.0f);
        }
        C20743716Ff c20743716Ff2 = this.LLILLJJLI;
        if (c20743716Ff2 != null) {
            c20743716Ff2.setEnabled(false);
        }
        C20743716Ff c20743716Ff3 = this.LLILLJJLI;
        if (c20743716Ff3 != null) {
            c20743716Ff3.setDebounceClickEnabled(true);
        }
        C20743716Ff c20743716Ff4 = this.LLILLJJLI;
        if (c20743716Ff4 != null) {
            c20743716Ff4.setDelayInterval(500L);
        }
        LIZ(C776230Ucf.LLILZ);
        C20743716Ff c20743716Ff5 = this.LLILLJJLI;
        if (c20743716Ff5 != null) {
            C500260Jjc.LJLIIIL(500L, c20743716Ff5, new AwS591S0100000_12(this, 752));
        }
        if (dataChannel != null) {
            dataChannel.BQ2(this.LL, DisableMuteMicEvent.class, new AwS591S0100000_12(this, 753));
            if (C500260Jjc.LJJIZ(dataChannel)) {
                dataChannel.CQ2(MuteMicCheckedEvent.class, this.LL, new AwS591S0100000_12(this, 754));
            }
        }
    }
}
