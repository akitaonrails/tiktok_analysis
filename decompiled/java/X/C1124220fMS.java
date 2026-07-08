package X;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastLiveLogOpt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS383S0200000_17;

/* JADX INFO: renamed from: X.0fMS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124220fMS extends RecyclerView.ViewHolder {
    public final LiveIconView LL;
    public final C16F5 LLILLJJLI;
    public final C16FV LLILLL;
    public final View LLILZ;

    public C1124220fMS(View view) {
        super(view);
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.wz2);
        this.LLILLJJLI = c16f5;
        C786410Ut5.k5(this.LLILLJJLI, 0.9f);
        c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, view.getContext()));
        this.LL = (LiveIconView) view.findViewById(R.id.j0k);
        this.LLILLL = (C16FV) view.findViewById(R.id.wxx);
        this.LLILZ = view.findViewById(R.id.wys);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public final void I5(C1124240fMU c1124240fMU) {
        LifecycleOwner lifecycleOwner;
        if (!TextUtils.isEmpty(c1124240fMU.LIZ)) {
            C500260Jjc.LJIILIIL(this.LLILLL);
            C500260Jjc.LLFFF(this.LLILLJJLI);
            this.LLILLJJLI.setText(c1124240fMU.LIZ);
        } else if (c1124240fMU.LIZIZ != 0) {
            C500260Jjc.LLFFF(this.LLILLL);
            C500260Jjc.LJIILIIL(this.LLILLJJLI);
            this.LLILLL.setImageResource(c1124240fMU.LIZIZ);
        }
        C0UX6 c0ux6 = c1124240fMU.LJI;
        if (c0ux6 != null) {
            DataChannel dataChannelLJIIIZ = C782710Un7.LJIIIZ(C782710Un7.LIZ);
            if (dataChannelLJIIIZ != null) {
                lifecycleOwner = dataChannelLJIIIZ.LLILZ;
            } else {
                lifecycleOwner = null;
            }
            RedDotExtensionKt.LJI(this.LLILZ, lifecycleOwner, null, c0ux6, new AwS383S0200000_17(c1124240fMU, this, 131));
        } else {
            if (c1124240fMU.LJFF) {
                C500260Jjc.LLFFF(this.LLILZ);
                c1124240fMU.LJIIIZ.invoke();
                C1124230fMT c1124230fMT = new C1124230fMT(c1124240fMU.LIZJ, c1124240fMU.LIZLLL);
                if (LiveBroadcastLiveLogOpt.INSTANCE.canReport(0.1d)) {
                    c1124230fMT.invoke();
                }
            } else {
                C500260Jjc.LJIILIIL(this.LLILZ);
            }
            L5(c1124240fMU);
        }
        if (c1124240fMU.LJIIIIZZ != 0) {
            C500260Jjc.LLFFF(this.LL);
            this.LL.setImageResource(c1124240fMU.LJIIIIZZ);
        } else {
            C500260Jjc.LJIILIIL(this.LL);
        }
    }

    public final void L5(C1124240fMU c1124240fMU) {
        if (c1124240fMU.LIZJ == 16 && !c1124240fMU.LJIIJ) {
            c1124240fMU.LJIIJ = true;
            boolean zLJJJJIZL = C500260Jjc.LJJJJIZL(this.LLILZ);
            C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_backpack_entrance_show");
            c474500IjALIZ.LJIL();
            C1128860fTw.LJ(c474500IjALIZ);
            C1128460fTI.LIZ(c474500IjALIZ, null);
            c474500IjALIZ.LJJII(Integer.valueOf(zLJJJJIZL ? 1 : 0), "is_red_dot");
            c474500IjALIZ.LIZ();
        }
    }
}
