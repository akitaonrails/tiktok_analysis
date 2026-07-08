package X;

import android.os.SystemClock;
import android.widget.ImageView;
import com.bytedance.android.livesdk.broadcast.LiveBroadcastEndFragment;

/* JADX INFO: renamed from: X.0Ut1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786370Ut1 extends AbstractC1542200qEc {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        if (1 - this.$t != 0) {
            super.LJL(interfaceC1541990qEH, str, c1542120qEU);
        } else {
            LJL$0(this, interfaceC1541990qEH, str, c1542120qEU);
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
        switch (this.$t) {
            case 0:
                LJLIIIL$0(this, interfaceC1541990qEH);
                break;
            case 1:
                LJLIIIL$1(this, interfaceC1541990qEH);
                break;
            default:
                super.LJLIIIL(interfaceC1541990qEH);
                break;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        if (1 - this.$t != 0) {
            super.LJLIIL(interfaceC1541990qEH, str);
        } else {
            LJLIIL$0(this, interfaceC1541990qEH, str);
        }
    }

    public C786370Ut1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJLIIIL$0(C786370Ut1 c786370Ut1, InterfaceC1541990qEH interfaceC1541990qEH) {
        ((C197039127h) c786370Ut1.l0).setLoading(false);
    }

    public static final void LJLIIIL$1(C786370Ut1 c786370Ut1, InterfaceC1541990qEH interfaceC1541990qEH) {
        C0UV8 c0uv8 = C0UV8.LL;
        C0UV8.LLILLL.LIZIZ("t_end_page_did_appear");
        C0UV8.LIZ(0, true, ((LiveBroadcastEndFragment) c786370Ut1.l0).LLILZLL);
        LiveBroadcastEndFragment liveBroadcastEndFragment = (LiveBroadcastEndFragment) c786370Ut1.l0;
        if (liveBroadcastEndFragment.LLJ > -1) {
            liveBroadcastEndFragment.LLJI = System.currentTimeMillis();
            LiveBroadcastEndFragment liveBroadcastEndFragment2 = (LiveBroadcastEndFragment) c786370Ut1.l0;
            C1CC2.LJIIIZ(0, liveBroadcastEndFragment2.LLJI - liveBroadcastEndFragment2.LLJ, "ttlive_anchor_finish_page_load_duration");
            ((LiveBroadcastEndFragment) c786370Ut1.l0).LLJ = -1L;
            C1CC2.LJIIIZ(0, 0L, "ttlive_anchor_finish_page_load_status_all");
        }
        C782530Ump.LIZIZ(1, ((LiveBroadcastEndFragment) c786370Ut1.l0).LLJJIJI);
    }

    public static final void LJLIIL$0(C786370Ut1 c786370Ut1, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        LiveBroadcastEndFragment liveBroadcastEndFragment = (LiveBroadcastEndFragment) c786370Ut1.l0;
        liveBroadcastEndFragment.getClass();
        liveBroadcastEndFragment.LLJ = System.currentTimeMillis();
        Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
        if (lValueOf != null) {
            lValueOf.longValue();
            C782530Ump.LIZIZ = lValueOf.longValue();
        }
    }

    public static final void LJL$0(C786370Ut1 c786370Ut1, InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        ImageView imageViewNR = ((LiveBroadcastEndFragment) c786370Ut1.l0).NR();
        if (imageViewNR != null) {
            C786410Ut5.LJZI(0, imageViewNR);
        }
        C0UV8 c0uv8 = C0UV8.LL;
        C0UV8.LLILLL.LIZIZ("t_end_page_did_appear");
        C0UV8.LIZ(0, false, ((LiveBroadcastEndFragment) c786370Ut1.l0).LLILZLL);
        C1CC2.LJIIIZ(1, 0L, "ttlive_anchor_finish_page_load_status_all");
        C782530Ump.LIZIZ(0, ((LiveBroadcastEndFragment) c786370Ut1.l0).LLJJIJI);
    }
}
