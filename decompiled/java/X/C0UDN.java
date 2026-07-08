package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.effect.api.EffectRedDotStatusChangeEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UDN, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UDN extends C0UDO {
    public View LL;
    public DataChannel LLILLJJLI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            C781270Ukn.LJI().getLiveSoundEffectDialog().show(fragmentManager, "LiveSoundEffectDialogFragment");
        }
        C500260Jjc.LJIILIIL(this.LL);
        InterfaceC766480U4w.LJIJI.LJFF(Boolean.FALSE);
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(EffectRedDotStatusChangeEvent.class);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_sound_click");
        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
        c474500IjALIZ.LIZ();
    }

    @Override // X.C0UDO, X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        super.WH(interfaceC1103130eoR, dataChannel);
        this.LLILLJJLI = dataChannel;
        interfaceC1103130eoR.findViewById(R.id.y74);
        View viewFindViewById = interfaceC1103130eoR.findViewById(R.id.y7r);
        this.LL = viewFindViewById;
        C500260Jjc.LJLJLJ(viewFindViewById, false);
    }
}
