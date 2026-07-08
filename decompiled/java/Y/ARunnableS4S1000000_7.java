package Y;

import X.C01GW;
import X.C0IX5;
import X.C1143780fs0;
import X.C1161920gLG;
import X.C1C7U;
import X.C463850IGx;
import com.bytedance.android.live.broadcast.SchemaReverseCameraEvent;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS4S1000000_7 implements Runnable {
    public final int $t;
    public String s0;

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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS4S1000000_7 aRunnableS4S1000000_7) {
        String str = aRunnableS4S1000000_7.s0;
        String str2 = LivePlayFragment._pnsPageId;
        C1C7U.LIZ("LivePlayFragment@afba.triggerFullLinkPerfStatus$1L");
        C0IX5.LJII(str);
        C1C7U.LIZIZ("LivePlayFragment@afba.triggerFullLinkPerfStatus$1L");
    }

    public static final void run$1(ARunnableS4S1000000_7 aRunnableS4S1000000_7) {
        boolean zLIZ;
        C1C7U.LIZ("GeckoResourceUtil@49d9.triggerDownGecko$2");
        try {
            C01GW c01gw = C1143780fs0.LIZIZ;
            if (!((LinkedHashSet) c01gw.getValue()).contains(aRunnableS4S1000000_7.s0)) {
                ((LinkedHashSet) c01gw.getValue()).add(aRunnableS4S1000000_7.s0);
                ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).ud2(aRunnableS4S1000000_7.s0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GeckoResourceUtil@49d9.triggerDownGecko$2");
    }

    public static final void run$2(ARunnableS4S1000000_7 aRunnableS4S1000000_7) {
        boolean zLIZ;
        C1C7U.LIZ("LiveEndMultiGuestFeedInjector@4c49.releaseGate$1");
        try {
            Map<String, String> map = C463850IGx.LIZ;
            C463850IGx.LIZ(aRunnableS4S1000000_7.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveEndMultiGuestFeedInjector@4c49.releaseGate$1");
    }

    public static final void run$3(ARunnableS4S1000000_7 aRunnableS4S1000000_7) {
        boolean zLIZ;
        C1C7U.LIZ("SetCameraSchemaDispatcher@b4b.setCamera$1$1");
        try {
            DataChannelGlobal.LLILZ.FQ2(SchemaReverseCameraEvent.class, aRunnableS4S1000000_7.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SetCameraSchemaDispatcher@b4b.setCamera$1$1");
    }

    public ARunnableS4S1000000_7(String str, int i) {
        this.$t = i;
        if (i != 0) {
            this.s0 = str;
        } else {
            this.s0 = str;
        }
    }
}
