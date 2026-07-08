package Y;

import X.C1AI9;
import X.C772260URc;
import X.InterfaceC743640TFa;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.broadcast.interaction.widget.TryModeGoLiveWidget;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesRequestEndChannel;
import com.bytedance.android.livesdk.viewerwishestmp.settings.ViewerWishesSettingsPage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
public class AcS499S0100000_33 implements InterfaceC743640TFa {
    public final int $t;
    public Object l0;

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
        }
    }

    public AcS499S0100000_33(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AcS499S0100000_33 acS499S0100000_33, LiveDialog liveDialog) {
        liveDialog.dismiss();
        TryModeGoLiveWidget tryModeGoLiveWidget = (TryModeGoLiveWidget) acS499S0100000_33.l0;
        C772260URc c772260URc = tryModeGoLiveWidget.LL;
        if (c772260URc != null) {
            c772260URc.LIZIZ(tryModeGoLiveWidget.LLILLL, "go_live");
        }
        ((TryModeGoLiveWidget) acS499S0100000_33.l0).x1("go_live");
    }

    public static final void LIZ$1(AcS499S0100000_33 acS499S0100000_33, LiveDialog liveDialog) {
        DataChannel dataChannel;
        C1AI9 c1ai9 = ((ViewerWishesSettingsPage) acS499S0100000_33.l0).LLLF;
        if (c1ai9 != null && (dataChannel = c1ai9.LIZIZ) != null) {
            dataChannel.LC0(ViewerWishesRequestEndChannel.class, AFwS224S0000000_33.get$arr$(597));
        }
        liveDialog.dismiss();
        ((ViewerWishesSettingsPage) acS499S0100000_33.l0).close(1);
    }

    public static final void LIZ$2(AcS499S0100000_33 acS499S0100000_33, LiveDialog liveDialog) {
        liveDialog.dismiss();
        Function0 function0 = (Function0) acS499S0100000_33.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$3(AcS499S0100000_33 acS499S0100000_33, LiveDialog liveDialog) {
        liveDialog.dismiss();
        Function0 function0 = (Function0) acS499S0100000_33.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
