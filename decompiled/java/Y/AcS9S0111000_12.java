package Y;

import X.C0UYB;
import X.C158B;
import X.C475510Ikn;
import X.C930640aKE;
import X.C930670aKH;
import X.C930690aKJ;
import X.C931170aL5;
import X.EnumC748580TYa;
import X.InterfaceC1685420txc;
import X.InterfaceC743640TFa;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveRetryPushCountSetting;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public class AcS9S0111000_12 implements InterfaceC743640TFa {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC743640TFa
    public final void LIZ(LiveDialog liveDialog) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, liveDialog);
                break;
            case 1:
                LIZ$1(this, liveDialog);
                break;
            case 2:
                LIZ$2(this, liveDialog);
                break;
            case 3:
                LIZ$3(this, liveDialog);
                break;
            case 4:
                LIZ$4(this, liveDialog);
                break;
            case 5:
                LIZ$5(this, liveDialog);
                break;
            case 6:
                LIZ$6(this, liveDialog);
                break;
        }
    }

    public static final void LIZ$0(AcS9S0111000_12 acS9S0111000_12, LiveDialog liveDialog) {
        int i;
        liveDialog.dismiss();
        ((C0UYB) acS9S0111000_12.l0).LIZIZ(acS9S0111000_12.i2, "server", acS9S0111000_12.z1);
        ((C0UYB) acS9S0111000_12.l0).LJIIIIZZ.invoke(17);
        ((C0UYB) acS9S0111000_12.l0).LJIIIZ.invoke(CertProviderManagerKt.findCert("bpea-ttlive_close_capture", 1476788484), null);
        InterfaceC1685420txc<Integer, Long, Long, Boolean, Integer, Unit> interfaceC1685420txc = ((C0UYB) acS9S0111000_12.l0).LJII;
        Integer numValueOf = Integer.valueOf(acS9S0111000_12.i2);
        ((C0UYB) acS9S0111000_12.l0).getClass();
        Long lValueOf = Long.valueOf(C0UYB.LIZ());
        Long lValueOf2 = Long.valueOf(((C0UYB) acS9S0111000_12.l0).LIZJ.getId());
        Boolean boolValueOf = Boolean.valueOf(acS9S0111000_12.z1);
        Creator creator = ((C0UYB) acS9S0111000_12.l0).LIZJ.creator;
        if (creator != null) {
            i = creator.roomContinue;
        } else {
            i = 0;
        }
        interfaceC1685420txc.invoke(numValueOf, lValueOf, lValueOf2, boolValueOf, Integer.valueOf(i));
    }

    public static final void LIZ$1(AcS9S0111000_12 acS9S0111000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((C0UYB) acS9S0111000_12.l0).LIZIZ(acS9S0111000_12.i2, "live_core", acS9S0111000_12.z1);
        ((C0UYB) acS9S0111000_12.l0).LJIIIZ.invoke(CertProviderManagerKt.findCert("bpea-427", 1476788485), null);
        if (LiveRetryPushCountSetting.INSTANCE.liveRetryPushCount() > 0) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            dataChannelGlobal.JQ2(C931170aL5.class, Boolean.TRUE);
            dataChannelGlobal.JQ2(C930670aKH.class, Integer.valueOf(acS9S0111000_12.i2));
        }
        ((C0UYB) acS9S0111000_12.l0).LJIIIIZZ.invoke(6);
    }

    public static final void LIZ$2(AcS9S0111000_12 acS9S0111000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((C0UYB) acS9S0111000_12.l0).LIZIZ(acS9S0111000_12.i2, "live_core", acS9S0111000_12.z1);
        ((C0UYB) acS9S0111000_12.l0).LJIIIZ.invoke(CertProviderManagerKt.findCert("bpea-ttlive_close_capture", 1476788484), null);
        if (LiveRetryPushCountSetting.INSTANCE.liveRetryPushCount() > 0) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            dataChannelGlobal.JQ2(C931170aL5.class, Boolean.TRUE);
            dataChannelGlobal.JQ2(C930690aKJ.class, Integer.valueOf(acS9S0111000_12.i2));
            HashMap map = new HashMap();
            map.put("end_receive_source", "ttlh");
            map.put("end_receive_time", String.valueOf(C158B.LIZJ()));
            dataChannelGlobal.JQ2(C930640aKE.class, map);
        }
        ((C0UYB) acS9S0111000_12.l0).LJIIIIZZ.invoke(6);
        liveDialog.dismiss();
    }

    public static final void LIZ$3(AcS9S0111000_12 acS9S0111000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((ModeratorPermissionEditFragment) acS9S0111000_12.l0).VR(acS9S0111000_12.i2, "ok", acS9S0111000_12.z1);
    }

    public static final void LIZ$4(AcS9S0111000_12 acS9S0111000_12, LiveDialog liveDialog) {
        DataChannel dataChannelLJ = C475510Ikn.LJ((ModeratorPermissionEditFragment) acS9S0111000_12.l0);
        if (dataChannelLJ != null) {
            EnumC748580TYa enumC748580TYa = EnumC748580TYa.MODERATOR_LIST;
            enumC748580TYa.next();
            dataChannelLJ.zW(BroadcastDialogPageChannel.class, enumC748580TYa);
        }
        liveDialog.dismiss();
        ((ModeratorPermissionEditFragment) acS9S0111000_12.l0).VR(acS9S0111000_12.i2, "manage", acS9S0111000_12.z1);
    }

    public static final void LIZ$5(AcS9S0111000_12 acS9S0111000_12, LiveDialog liveDialog) {
        liveDialog.dismiss();
        ((ModeratorPermissionEditFragmentSheet) acS9S0111000_12.l0).ES(acS9S0111000_12.i2, "ok", acS9S0111000_12.z1);
    }

    public static final void LIZ$6(AcS9S0111000_12 acS9S0111000_12, LiveDialog liveDialog) {
        DataChannel dataChannelLJ = C475510Ikn.LJ((ModeratorPermissionEditFragmentSheet) acS9S0111000_12.l0);
        if (dataChannelLJ != null) {
            EnumC748580TYa enumC748580TYa = EnumC748580TYa.MODERATOR_LIST;
            enumC748580TYa.next();
            dataChannelLJ.zW(BroadcastDialogPageChannel.class, enumC748580TYa);
        }
        liveDialog.dismiss();
        ((ModeratorPermissionEditFragmentSheet) acS9S0111000_12.l0).ES(acS9S0111000_12.i2, "manage", acS9S0111000_12.z1);
    }

    public AcS9S0111000_12(Object obj, int i, boolean z, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.z1 = z;
    }
}
