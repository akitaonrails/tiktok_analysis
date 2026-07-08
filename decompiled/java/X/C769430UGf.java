package X;

import Y.ACListenerS116S0200000_12;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C769430UGf implements InterfaceViewOnClickListenerC1102800enu, C0UXZ {
    public boolean LL;
    public View LLILLJJLI;
    public View LLILLL;
    public C20743716Ff LLILZ;
    public final /* synthetic */ VideoWidget LLILZIL;

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

    public final boolean LIZJ() {
        if (!this.LL) {
            return false;
        }
        this.LLILZIL.getClass();
        if (!C781270Ukn.LJIILJJIL().tL()) {
            return false;
        }
        VideoWidget videoWidget = this.LLILZIL;
        boolean z = !videoWidget.LLJJIII;
        videoWidget.LLJJIII = z;
        videoWidget.LLJILJILJ.LLIZ.s3(z);
        VideoWidget videoWidget2 = this.LLILZIL;
        Context context = videoWidget2.context;
        if (context != null) {
            C766270U4b.LJIIIZ(context, videoWidget2.LLJJIII ? context.getResources().getString(2131842779) : context.getResources().getString(2131842778));
        }
        return true;
    }

    public C769430UGf(VideoWidget videoWidget) {
        this.LLILZIL = videoWidget;
    }

    public final void LIZ(View view) {
        InterfaceC772190UQv.u3.LJFF(Boolean.FALSE);
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (LIZJ()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("pm_live_mirror_click");
            c474500IjALIZ.LJIJJLI(this.LLILZIL.dataChannel);
            c474500IjALIZ.LJIIJJI("live_take");
            c474500IjALIZ.LJIILL("click");
            c474500IjALIZ.LJIILJJIL("live_take_detail");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZIL.LLJJIII ? 1 : 0), "is_open");
            c474500IjALIZ.LIZ();
            LJ(false);
        }
    }

    public final void LJ(boolean z) {
        float f;
        View view = this.LLILLL;
        if (view != null && z) {
            Property property = View.ALPHA;
            float[] fArr = new float[2];
            boolean z2 = this.LL;
            float f2 = 0.4f;
            if (z2) {
                f = 0.4f;
            } else {
                f = 1.0f;
            }
            fArr[0] = f;
            if (z2) {
                f2 = 1.0f;
            }
            fArr[1] = f2;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat.start();
            C20743716Ff c20743716Ff = this.LLILZ;
            if (c20743716Ff != null) {
                C1834150xpV.LJIIJ(c20743716Ff, this.LL);
            }
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLILZ = (C20743716Ff) interfaceC1103130eoR.findViewById(R.id.oh5);
        this.LLILLJJLI = interfaceC1103130eoR.LJ();
        this.LLILLL = interfaceC1103130eoR.LJ();
        LIZLLL(dataChannel, this.LLILZ, interfaceC1103130eoR.findViewById(R.id.y7r));
    }

    @Override // X.C0UXZ
    public final void LIZIZ(DataChannel dataChannel, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        View view;
        if (c499640Jic != null) {
            this.LLILLJJLI = c499640Jic.LIZ;
            view = c499640Jic.LJFF;
            this.LLILLL = c499640Jic.LIZIZ;
        } else {
            view = null;
        }
        LIZLLL(dataChannel, null, view);
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS116S0200000_12(this, c499640Jic, 86), view2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.bytedance.ies.sdk.datachannel.DataChannel r4, X.C20743716Ff r5, android.view.View r6) {
        /*
            r3 = this;
            java.lang.String r0 = "livesdk_pm_live_mirror_show"
            X.0IjA r0 = X.C0IJT.LIZ(r0)
            r0.LJIJJLI(r4)
            r0.LIZ()
            X.14i1<java.lang.Integer> r0 = X.InterfaceC772190UQv.c3
            java.lang.Object r0 = r0.LIZ()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2 = 0
            r1 = 1
            if (r0 != r1) goto L5c
            com.bytedance.android.livesdk.broadcast.video.VideoWidget r0 = r3.LLILZIL
            r0.getClass()
            com.bytedance.android.live.liveinteract.api.IInteractService r0 = X.C781270Ukn.LJIILJJIL()
            boolean r0 = r0.tL()
            if (r0 == 0) goto L5c
            r0 = 1
        L2c:
            r3.LL = r0
            r0 = r0 ^ 1
            r3.LJ(r0)
            if (r5 == 0) goto L5b
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setDisabledAlpha(r0)
            r5.setEnabled(r2)
            r5.setDebounceClickEnabled(r1)
            r0 = 500(0x1f4, double:2.47E-321)
            r5.setDelayInterval(r0)
            boolean r0 = r3.LL
            X.C1834150xpV.LJIIJ(r5, r0)
            com.bytedance.android.livesdk.broadcast.video.VideoWidget r0 = r3.LLILZIL
            boolean r0 = r0.LLJJIII
            r5.setChecked(r0)
            Y.ACListenerS116S0200000_12 r1 = new Y.ACListenerS116S0200000_12
            r0 = 85
            r1.<init>(r3, r6, r0)
            X.C786410Ut5.k8(r5, r1)
        L5b:
            return
        L5c:
            r0 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C769430UGf.LIZLLL(com.bytedance.ies.sdk.datachannel.DataChannel, X.16Ff, android.view.View):void");
    }
}
