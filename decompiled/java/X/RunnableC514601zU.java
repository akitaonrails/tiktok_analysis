package X;

import com.bytedance.android.livesdk.ShinyCardGiftIconBubbleEvent;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01zU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC514601zU implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(RunnableC514601zU runnableC514601zU) {
        boolean zLIZ;
        C1C7U.LIZ("MusicDiskLruCache@763.removeUnusedKey$1");
        try {
            ((Function1) runnableC514601zU.l1).invoke(Long.valueOf(((C0WKX) runnableC514601zU.l0).LIZLLL(runnableC514601zU.j2, true)));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicDiskLruCache@763.removeUnusedKey$1");
    }

    public static final void run$1(RunnableC514601zU runnableC514601zU) {
        boolean zLIZ;
        boolean z;
        C1C7U.LIZ("ShinyCardGiftHelper@45f4.tryShowBubble$1");
        try {
            if (runnableC514601zU.j2 == UserService.getInstance().user().getCurrentUserId()) {
                z = true;
            } else {
                z = false;
            }
            DataChannel dataChannel = (DataChannel) runnableC514601zU.l0;
            if (dataChannel != null) {
                dataChannel.LC0(ShinyCardGiftIconBubbleEvent.class, new Pair((Gift) runnableC514601zU.l1, Boolean.valueOf(z)));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShinyCardGiftHelper@45f4.tryShowBubble$1");
    }

    public RunnableC514601zU(long j, Object obj, Object obj2, int i) {
        this.$t = i;
        this.j2 = j;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
