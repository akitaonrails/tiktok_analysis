package Y;

import X.C16FS;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C946210ajL;
import X.C947280al4;
import X.C977610bXz;
import X.InterfaceC937820aVo;
import X.InterfaceC937840aVq;
import X.InterfaceC937900aVw;
import com.bytedance.android.live.linkmic.LivePublicScreenClipChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeStageAudienceCoverRectSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeStageCornerRadiusPercent;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ARunnableS34S0110000_15 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        ArrayList arrayList = new ArrayList();
        InterfaceC937900aVw interfaceC937900aVw = (InterfaceC937900aVw) this.l0;
        List<InterfaceC937840aVq> allLayoutWindows = (interfaceC937900aVw == null || (interfaceC937820aVoLJJJJZ = interfaceC937900aVw.LJJJJZ()) == null) ? null : interfaceC937820aVoLJJJJZ.getAllLayoutWindows();
        int iWidth = 0;
        if (allLayoutWindows != null) {
            for (InterfaceC937840aVq interfaceC937840aVq : allLayoutWindows) {
                if (interfaceC937840aVq.LJIILLIIL() && interfaceC937840aVq.LJJIIJ().getChildCount() != 0) {
                    arrayList.add(interfaceC937840aVq.LJFF());
                    iWidth = interfaceC937840aVq.LJIIJ().width();
                }
            }
        }
        float fLIZIZ = (!LiveCoHostTakeStageAudienceCoverRectSetting.INSTANCE.isEnable() || this.z1) ? 0.0f : C418440Gaw.LIZIZ(Double.valueOf(LiveCoHostTakeStageCornerRadiusPercent.INSTANCE.getValue())) * iWidth;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (dataChannelGlobal != null) {
            dataChannelGlobal.HQ2(LivePublicScreenClipChannel.class, new C946210ajL(arrayList, fLIZIZ));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendClipEvent, rectList.size=");
        sbLIZ.append(arrayList.size());
        sbLIZ.append(", rectList=");
        sbLIZ.append(arrayList);
        C20441214yg.LIZIZ("take_stage_hole", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void run$0(ARunnableS34S0110000_15 aRunnableS34S0110000_15) {
        boolean zLIZ;
        C1C7U.LIZ("IndividualMatchInviterViewModel@270a.sendInvite$1");
        try {
            ((C977610bXz) aRunnableS34S0110000_15.l0).LIZLLL(aRunnableS34S0110000_15.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IndividualMatchInviterViewModel@270a.sendInvite$1");
    }

    public static final void run$1(ARunnableS34S0110000_15 aRunnableS34S0110000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiCoHostWindowManager$Companion@b5f2.sendClipEvent$1");
        try {
            aRunnableS34S0110000_15.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiCoHostWindowManager$Companion@b5f2.sendClipEvent$1");
    }

    public static final void run$2(ARunnableS34S0110000_15 aRunnableS34S0110000_15) {
        boolean zLIZ;
        C1C7U.LIZ("LetsDanceMainSpotBizViewElement@4462.showMainButtonLoading$1");
        try {
            if (aRunnableS34S0110000_15.z1) {
                C16FS mainButton = ((C947280al4) aRunnableS34S0110000_15.l0).getMainButton();
                if (mainButton != null) {
                    mainButton.LJ();
                }
            } else {
                C16FS mainButton2 = ((C947280al4) aRunnableS34S0110000_15.l0).getMainButton();
                if (mainButton2 != null) {
                    mainButton2.LJIIL();
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LetsDanceMainSpotBizViewElement@4462.showMainButtonLoading$1");
    }

    public ARunnableS34S0110000_15(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
