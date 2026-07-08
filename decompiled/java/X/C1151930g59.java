package X;

import Y.ARunnableS117S0100000_17;
import com.bytedance.android.live.gift.GiftLimitNotificationEvent;
import com.bytedance.android.live.gift.IGiftReminderService;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import com.bytedance.android.livesdk.impl.revenue.goodybag.widget.GoodyBagWidget;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0g59, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151930g59 extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        if (2 - this.$t != 0) {
            super.LJL(interfaceC1541990qEH, str, c1542120qEU);
        } else {
            LJL$0(this, interfaceC1541990qEH, str, c1542120qEU);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        if (2 - this.$t != 0) {
            super.LJLIIIL(interfaceC1541990qEH);
        } else {
            LJLIIIL$0(this, interfaceC1541990qEH);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 0:
                LJLJI$0(this, interfaceC1541990qEH);
                break;
            case 1:
                LJLJI$1(this, interfaceC1541990qEH);
                break;
            default:
                super.LJLJI(interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void onDestroy() {
        switch (this.$t) {
            case 0:
                onDestroy$0(this);
                break;
            case 1:
                onDestroy$1(this);
                break;
            default:
                super.onDestroy();
                break;
        }
    }

    public static final void onDestroy$0(C1151930g59 c1151930g59) {
        InterfaceC978780bZs interfaceC978780bZs;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRedEnvelopeDialogDismiss,datachannel==>");
        sbLIZ.append(((RedEnvelopeWidget) c1151930g59.l1).dataChannel);
        C20441214yg.LIZIZ("RedEnvelopeWidget", C2188811AlT.LIZIZ(sbLIZ));
        WeakReference<InterfaceC978780bZs> weakReference = ((C1104530eqh) c1151930g59.l0).LJ;
        if (weakReference != null && (interfaceC978780bZs = weakReference.get()) != null) {
            interfaceC978780bZs.LIZIZ(true);
        }
        ((IGiftReminderService) C1161920gLG.LIZJ(IGiftReminderService.class)).tt2(3);
        DataChannel dataChannel = ((RedEnvelopeWidget) c1151930g59.l1).dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(GiftLimitNotificationEvent.class, Boolean.valueOf(((IGiftReminderService) C1161920gLG.LIZJ(IGiftReminderService.class)).TM0()));
        }
    }

    public static final void onDestroy$1(C1151930g59 c1151930g59) {
        InterfaceC978780bZs interfaceC978780bZs;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGoodyBagDialogDismiss,datachannel==>");
        sbLIZ.append(((GoodyBagWidget) c1151930g59.l1).dataChannel);
        C20441214yg.LIZIZ("GoodyBagWidget", C2188811AlT.LIZIZ(sbLIZ));
        WeakReference<InterfaceC978780bZs> weakReference = ((C0UY7) c1151930g59.l0).LIZ;
        if (weakReference != null && (interfaceC978780bZs = weakReference.get()) != null) {
            interfaceC978780bZs.LIZIZ(true);
        }
        ((IGiftReminderService) C1161920gLG.LIZJ(IGiftReminderService.class)).tt2(3);
        DataChannel dataChannel = ((GoodyBagWidget) c1151930g59.l1).dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(GiftLimitNotificationEvent.class, Boolean.valueOf(((IGiftReminderService) C1161920gLG.LIZJ(IGiftReminderService.class)).TM0()));
        }
    }

    public static final void LJLIIIL$0(C1151930g59 c1151930g59, InterfaceC1541990qEH interfaceC1541990qEH) {
        C20441214yg.LJIIIZ("AnchorActivityCell", "sparkView onLoadFinish");
        HandlerHook.viewPost((C1092560eXO) c1151930g59.l0, new ARunnableS117S0100000_17((Function0) c1151930g59.l1, 247));
    }

    public static final void LJLJI$0(C1151930g59 c1151930g59, InterfaceC1541990qEH interfaceC1541990qEH) {
        InterfaceC978780bZs interfaceC978780bZs;
        WeakReference<InterfaceC978780bZs> weakReference = ((C1104530eqh) c1151930g59.l0).LJ;
        if (weakReference != null && (interfaceC978780bZs = weakReference.get()) != null) {
            interfaceC978780bZs.LIZ();
        }
    }

    public static final void LJLJI$1(C1151930g59 c1151930g59, InterfaceC1541990qEH interfaceC1541990qEH) {
        InterfaceC978780bZs interfaceC978780bZs;
        WeakReference<InterfaceC978780bZs> weakReference = ((C0UY7) c1151930g59.l0).LIZ;
        if (weakReference != null && (interfaceC978780bZs = weakReference.get()) != null) {
            interfaceC978780bZs.LIZ();
        }
    }

    public C1151930g59(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJL$0(C1151930g59 c1151930g59, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        c1151930g59.LJLI(interfaceC1541990qEH, str, c1542120qEU.LIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sparkView onLoadFailed:");
        sbLIZ.append(c1542120qEU.LIZ());
        C20441214yg.LJIIIZ("AnchorActivityCell", C2188811AlT.LIZIZ(sbLIZ));
    }
}
