package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0J9Q, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J9Q implements InterfaceViewOnClickListenerC1102800enu, C0UXZ {
    public C20743716Ff LL;
    public DataChannel LLILLJJLI;
    public InterfaceC1103130eoR LLILLL;
    public Context LLILZ;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
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

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        LIZ(dataChannel, interfaceC1103130eoR, null, (C20743716Ff) interfaceC1103130eoR.findViewById(R.id.ao2), (C16F5) interfaceC1103130eoR.findViewById(R.id.anz));
    }

    @Override // X.C0UXZ
    public final void LIZIZ(DataChannel dataChannel, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        View view = c499640Jic.LIZ;
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
        LIZ(dataChannel, null, c499640Jic.LIZ, c499640Jic.LJI, c499640Jic.LIZLLL);
    }

    public final void LIZ(DataChannel dataChannel, InterfaceC1103130eoR interfaceC1103130eoR, View view, C20743716Ff c20743716Ff, C16F5 c16f5) {
        Context context;
        int i;
        int length;
        Boolean boolLIZ;
        Room room;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = interfaceC1103130eoR;
        if (interfaceC1103130eoR == null || (context = interfaceC1103130eoR.getContext()) == null) {
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
        }
        this.LLILZ = context;
        this.LL = c20743716Ff;
        if (c20743716Ff != null) {
            if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || (boolLIZ = Boolean.valueOf(room.aigcSelfDisclosureSwitch)) == null) {
                boolLIZ = InterfaceC772190UQv.O3.LIZ();
            }
            c20743716Ff.setChecked(Intrinsics.LJFF(boolLIZ, Boolean.TRUE));
            c20743716Ff.setDebounceClickEnabled(true);
            c20743716Ff.setDelayInterval(500L);
            C786410Ut5.A7(c20743716Ff, new C521680Kd4(c20743716Ff, this, 2));
        }
        if (c16f5 != null) {
            if (LiveHostSettingsUIConfig.enable()) {
                i = 2131853402;
            } else {
                i = 2131850524;
            }
            String strLJIJI = C497740JfY.LJIJI(i);
            String strLJIJI2 = C497740JfY.LJIJI(2131850525);
            if (strLJIJI != null) {
                length = strLJIJI.length();
            } else {
                length = 0;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJIJI);
            sbLIZ.append(' ');
            sbLIZ.append(strLJIJI2);
            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            C1119920fFW.LJ(this.LLILZ, spannableString, 0, length, 17, 8, 400);
            C1119920fFW.LJ(this.LLILZ, spannableString, length, spannableString.length(), 17, 8, 500);
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ex3, this.LLILZ)), 0, length, 17);
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ewy, this.LLILZ)), length, spannableString.length(), 17);
            C786410Ut5.p2(spannableString, new C521550Kcr(this, 5), length, spannableString.length(), 17);
            c16f5.setText(spannableString);
            c16f5.setLinksClickable(true);
            c16f5.setMovementMethod(LinkMovementMethod.getInstance());
            c16f5.setHighlightColor(0);
        }
    }
}
