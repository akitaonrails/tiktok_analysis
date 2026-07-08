package X;

import Y.ACListenerS147S0100000_12;
import android.animation.ObjectAnimator;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.ZoomCameraScaleEvent;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0UGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C769440UGg implements InterfaceViewOnClickListenerC1102800enu, C0UXZ {
    public boolean LL;
    public long LLILLJJLI;
    public View LLILLL;
    public final /* synthetic */ VideoWidget LLILZ;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
    }

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

    public final boolean LIZ() {
        this.LLILZ.getClass();
        if (!C781270Ukn.LJIILJJIL().tL()) {
            return false;
        }
        if (this.LLILLJJLI == 0) {
            this.LLILLJJLI = SystemClock.elapsedRealtime();
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime < this.LLILLJJLI + 1500) {
                return false;
            }
            this.LLILLJJLI = jElapsedRealtime;
        }
        boolean z = !this.LL;
        this.LL = z;
        if (z) {
            C1276840jKc.LIZ.getClass();
            C1276840jKc.LJJJLZIJ = 1;
        } else {
            C1276840jKc.LIZ.getClass();
            C1276840jKc.LJJJLZIJ = 2;
        }
        if (this.LL) {
            VideoWidget videoWidget = this.LLILZ;
            if (!videoWidget.LLJJIII) {
                videoWidget.LLJILJILJ.LLIZ.s3(false);
            }
        } else {
            VideoWidget videoWidget2 = this.LLILZ;
            if (!videoWidget2.LLJJIII) {
                videoWidget2.LLJILJILJ.LLIZ.s3(true);
            }
        }
        this.LLILZ.LLJILJILJ.LJIIJ(CertProviderManagerKt.findCert("bpea-376", 1476788233));
        this.LLILZ.dataChannel.LC0(ZoomCameraScaleEvent.class, Float.valueOf(0.0f));
        C769430UGf c769430UGf = this.LLILZ.LLJJJJLIIL;
        c769430UGf.LL = this.LL;
        c769430UGf.LJ(true);
        C768460UCm.LIZIZ().zr(false);
        InterfaceC772190UQv.c3.LJ(Integer.valueOf(this.LL ? 1 : 0));
        return true;
    }

    public final void LIZJ() {
        if (this.LL) {
            C1276840jKc.LIZ.getClass();
            C1276840jKc.LJJJLZIJ = 1;
        } else {
            C1276840jKc.LIZ.getClass();
            C1276840jKc.LJJJLZIJ = 2;
        }
        View view = this.LLILLL;
        if (view != null) {
            Property property = View.ALPHA;
            float[] fArr = new float[2];
            this.LLILZ.getClass();
            fArr[0] = C781270Ukn.LJIILJJIL().tL() ? 0.4f : 1.0f;
            this.LLILZ.getClass();
            fArr[1] = C781270Ukn.LJIILJJIL().tL() ? 1.0f : 0.4f;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat.start();
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pm_live_switch_camera_show");
        c474500IjALIZ.LJIJJLI(this.LLILZ.dataChannel);
        c474500IjALIZ.LIZ();
    }

    public C769440UGg(VideoWidget videoWidget) {
        this.LLILZ = videoWidget;
        this.LL = InterfaceC772190UQv.c3.LIZ().intValue() == 1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (LIZ()) {
            InterfaceC772190UQv.t3.LJFF(Boolean.FALSE);
            EnumC1102750enp.REVERSE_CAMERA.setRedDotVisible(this.LLILZ.dataChannel, false);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("pm_live_switch_camera_click");
            c474500IjALIZ.LJIJJLI(this.LLILZ.dataChannel);
            c474500IjALIZ.LJIIJJI("live_take");
            c474500IjALIZ.LJIILL("click");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLILLL = EnumC1102750enp.REVERSE_CAMERA.getView(dataChannel);
        LIZJ();
    }

    @Override // X.C0UXZ
    public final void LIZIZ(DataChannel dataChannel, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        LIZJ();
        if (c499640Jic != null) {
            View view = c499640Jic.LIZ;
            this.LLILLL = view;
            if (view != null) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(this, 386), view);
            }
        }
    }
}
