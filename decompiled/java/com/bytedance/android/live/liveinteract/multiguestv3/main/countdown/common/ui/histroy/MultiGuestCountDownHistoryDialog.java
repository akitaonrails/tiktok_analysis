package com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.common.ui.histroy;

import X.C01NB;
import X.C11NJ;
import X.C11QI;
import X.C11S5;
import X.C16FZ;
import X.C1701940uOG;
import X.C19487311Lz;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C516201zk;
import X.C751340Tdc;
import X.C786410Ut5;
import X.C926630aDl;
import X.RunnableC781530UlD;
import X.ViewOnClickListenerC512201z6;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.ICountdownApi;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownGetUserHistoryParams;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicCountDownTimerPlayModeConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class MultiGuestCountDownHistoryDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZyw8HELIOSPSs4LSAkJmsvJiI+JytiPCZ9ICw/PT08MWsBPCMnIQI5LDwnCyo5JzsXJzIiASYgPCo+MAs6KSkjLg==";
    public RunnableC781530UlD LL;
    public C16FZ LLILLJJLI;
    public View LLILLL;
    public Long LLILZ;
    public ViewGroup LLILZIL;
    public final C11NJ LLILZLL = new C11NJ();

    public MultiGuestCountDownHistoryDialog() {
        C926630aDl.LIZIZ(this, 16, true, true, false, null, 0, 240);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final void MR() {
        Long l;
        C16FZ c16fz = this.LLILLJJLI;
        if (c16fz != null) {
            C500260Jjc.LJLJLJ(c16fz, true);
        }
        RunnableC781530UlD runnableC781530UlD = this.LL;
        if (runnableC781530UlD != null) {
            C500260Jjc.LJLJLJ(runnableC781530UlD, false);
        }
        View view = this.LLILLL;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, false);
        }
        C480460Ism.LIZ().getClass();
        ICountdownApi iCountdownApi = (ICountdownApi) C480460Ism.LIZLLL(ICountdownApi.class);
        CountdownGetUserHistoryParams countdownGetUserHistoryParams = new CountdownGetUserHistoryParams();
        DataChannel dataChannel = this.dataChannel;
        countdownGetUserHistoryParams.roomId = (dataChannel == null || (l = (Long) dataChannel.gg0(C751340Tdc.class)) == null) ? 0L : l.longValue();
        Long l2 = this.LLILZ;
        countdownGetUserHistoryParams.userId = l2 != null ? l2.longValue() : 0L;
        C19487311Lz.LIZ(new C11QI(C01NB.LIZIZ(iCountdownApi.getUserCountdownHistory(countdownGetUserHistoryParams), "MultiGuestCountDownHistoryDialog", "getCountDownHistory").LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new C516201zk(this, 27)).LJIIL(new C516201zk(this, 28))).LJIILL(), this.LLILZLL, null, null, 30);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C500980Jkm createParams() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L47
            int r3 = X.C465640INu.LIZIZ(r0)
        La:
            X.0Jkm r2 = new X.0Jkm
            r0 = 2131569234(0x7f0d2a52, float:1.8764089E38)
            r2.<init>(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L43
            java.lang.Class<X.0TZM> r0 = X.C0TZM.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L43
            boolean r1 = r0.booleanValue()
            if (r1 != 0) goto L44
            r0 = 8388629(0x800015, float:1.1754973E-38)
        L29:
            r2.LJII = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.LJI = r0
            if (r1 == 0) goto L41
            r0 = -1
        L32:
            r2.LJIIIZ = r0
            if (r1 == 0) goto L37
            r3 = -1
        L37:
            r2.LJIIJ = r3
            if (r1 == 0) goto L49
            r0 = 2131887795(0x7f1206b3, float:1.9410207E38)
            r2.LIZJ = r0
            return r2
        L41:
            r0 = r3
            goto L32
        L43:
            r1 = 1
        L44:
            r0 = 80
            goto L29
        L47:
            r3 = 0
            goto La
        L49:
            r0 = 2131887796(0x7f1206b4, float:1.941021E38)
            r2.LIZJ = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.common.ui.histroy.MultiGuestCountDownHistoryDialog.createParams():X.0Jkm");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.LLILZLL.LJ();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        C786410Ut5.I7(new ViewOnClickListenerC512201z6(this, 4), view.findViewById(R.id.yg_));
        this.LLILZIL = (ViewGroup) view.findViewById(R.id.eux);
        if (LinkmicCountDownTimerPlayModeConfig.INSTANCE.isServiceEnable()) {
            ViewGroup viewGroup = this.LLILZIL;
            if (viewGroup != null) {
                layoutParams = viewGroup.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = (int) (((double) C497740JfY.LJIILLIIL()) * 0.6d);
                }
            } else {
                layoutParams = null;
            }
            ViewGroup viewGroup2 = this.LLILZIL;
            if (viewGroup2 != null) {
                C786410Ut5.X5(layoutParams, viewGroup2);
            }
        }
        this.LL = (RunnableC781530UlD) view.findViewById(R.id.ezv);
        this.LLILLJJLI = (C16FZ) view.findViewById(R.id.nnp);
        View viewFindViewById = view.findViewById(R.id.p4z);
        this.LLILLL = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ViewOnClickListenerC512201z6(this, 5), viewFindViewById);
        }
        RunnableC781530UlD runnableC781530UlD = this.LL;
        if (runnableC781530UlD != null) {
            Context context = getContext();
            if (context != null) {
                runnableC781530UlD.setLayoutManager(new LinearLayoutManager(context));
            } else {
                return;
            }
        }
        MR();
    }
}
