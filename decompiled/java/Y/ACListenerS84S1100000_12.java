package Y;

import X.C0TQK;
import X.C0UYF;
import X.C781270Ukn;
import X.C784600UqA;
import X.C784610UqB;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;

/* JADX INFO: loaded from: classes13.dex */
public class ACListenerS84S1100000_12 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public ACListenerS84S1100000_12(C0UYF c0uyf, int i) {
        this.$t = i;
        this.l1 = c0uyf;
        this.s0 = null;
    }

    public static final void onClick$0(ACListenerS84S1100000_12 aCListenerS84S1100000_12, View view) {
        C781270Ukn.LJFF().Zz1();
        Context context = ((C0UYF) aCListenerS84S1100000_12.l1).LL;
        C784600UqA c784600UqA = new C784600UqA(aCListenerS84S1100000_12.s0);
        c784600UqA.LIZJ = true;
        C784610UqB.LIZIZ(context, c784600UqA);
    }

    public static final void onClick$1(ACListenerS84S1100000_12 aCListenerS84S1100000_12, View view) {
        C781270Ukn.LJFF().Zz1();
        Context context = ((LiveBroadcastFragment) aCListenerS84S1100000_12.l1).getContext();
        C784600UqA c784600UqA = new C784600UqA(aCListenerS84S1100000_12.s0);
        c784600UqA.LIZJ = true;
        C784610UqB.LIZIZ(context, c784600UqA);
    }

    public static final void onClick$2(ACListenerS84S1100000_12 aCListenerS84S1100000_12, View view) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute((C0TQK) aCListenerS84S1100000_12.l1, "//webview");
        smartRouteBuildRoute.withParam("url", aCListenerS84S1100000_12.s0);
        smartRouteBuildRoute.open();
    }

    public static final void onClick$3(ACListenerS84S1100000_12 aCListenerS84S1100000_12, View view) {
        C781270Ukn.LJFF().Zz1();
        Context context = ((VoiceChatBroadcastFragment) aCListenerS84S1100000_12.l1).getContext();
        C784600UqA c784600UqA = new C784600UqA(aCListenerS84S1100000_12.s0);
        c784600UqA.LIZJ = true;
        C784610UqB.LIZIZ(context, c784600UqA);
    }

    public ACListenerS84S1100000_12(LiveBroadcastFragment liveBroadcastFragment, int i) {
        this.$t = i;
        this.l1 = liveBroadcastFragment;
        this.s0 = null;
    }

    public ACListenerS84S1100000_12(VoiceChatBroadcastFragment voiceChatBroadcastFragment, int i) {
        this.$t = i;
        this.l1 = voiceChatBroadcastFragment;
        this.s0 = null;
    }

    public ACListenerS84S1100000_12(C0TQK c0tqk, String str, int i) {
        this.$t = i;
        this.l1 = c0tqk;
        this.s0 = str;
    }
}
