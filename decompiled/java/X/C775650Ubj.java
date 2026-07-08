package X;

import Y.ARunnableS112S0100000_12;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ubj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775650Ubj extends AbstractC775660Ubk implements InterfaceViewOnClickListenerC1102800enu, C0UXZ {
    public String LLIZ;

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

    @Override // X.AbstractC775660Ubk
    public final String LIZ() {
        return this.LLIZ;
    }

    public C775650Ubj(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        super(C500260Jjc.LJJLIIIJ(dataChannel), String.valueOf(C500260Jjc.LIZIZ(dataChannel)), String.valueOf(C500260Jjc.LIZIZ(dataChannel)), lifecycleOwner);
        this.LLIZ = "center";
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        this.LLILZLL = null;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        LJFF(dataChannel, (C20743716Ff) interfaceC1103130eoR.findViewById(R.id.vwt), (C16F5) interfaceC1103130eoR.findViewById(R.id.vwr));
    }

    @Override // X.C0UXZ
    public final void LIZIZ(DataChannel dataChannel, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        View view = c499640Jic.LIZ;
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
        LJFF(dataChannel, c499640Jic.LJI, c499640Jic.LIZLLL);
    }

    public final void LJFF(DataChannel dataChannel, C20743716Ff c20743716Ff, C16F5 c16f5) {
        C773830UXd c773830UXd;
        String str;
        if (dataChannel == null || (c773830UXd = (C773830UXd) dataChannel.gg0(C0UXK.class)) == null) {
            c773830UXd = new C773830UXd("");
        }
        this.LLILZLL = c773830UXd;
        boolean zLJFF = Intrinsics.LJFF(c773830UXd.LIZ, "STABLE_MODE");
        String str2 = "center";
        if (zLJFF) {
            C773830UXd c773830UXd2 = this.LLILZLL;
            if (c773830UXd2 != null && (str = c773830UXd2.LIZIZ) != null) {
                str2 = str;
            }
            this.LLIZ = str2;
        } else {
            this.LLIZ = "center";
        }
        C1813280xHq.LIZ(this, AbstractC775660Ubk.LIZJ(), this.LLILZ);
        LJ(c20743716Ff);
        LIZLLL(c16f5);
        AbstractC775660Ubk.LIZJ().vQ2(C775790Ubx.LIZ);
        C473410IhP.LIZJ(new ARunnableS112S0100000_12(this, 96), 200L);
    }
}
