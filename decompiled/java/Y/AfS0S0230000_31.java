package Y;

import X.C09JN;
import X.C1C7U;
import android.graphics.Bitmap;
import com.bytedance.android.livesdk.notificatoin.AudioLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: loaded from: classes32.dex */
public class AfS0S0230000_31 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;
    public boolean z4;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S0230000_31 afS0S0230000_31, Object obj) {
        C1C7U.LIZ("AudioLiveService@42bb.showNotification$1$1");
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && !bitmap.isRecycled()) {
            ((AudioLiveService) afS0S0230000_31.l0).showDefaultNotification((Room) afS0S0230000_31.l1, afS0S0230000_31.z2, afS0S0230000_31.z3, afS0S0230000_31.z4, bitmap);
        } else {
            ((AudioLiveService) afS0S0230000_31.l0).showDefaultNotification((Room) afS0S0230000_31.l1, afS0S0230000_31.z2, afS0S0230000_31.z3, afS0S0230000_31.z4, null);
        }
        C1C7U.LIZIZ("AudioLiveService@42bb.showNotification$1$1");
    }

    public static final void accept$1(AfS0S0230000_31 afS0S0230000_31, Object obj) {
        C1C7U.LIZ("AudioLiveService@42bb.showNotification$1$2");
        ((AudioLiveService) afS0S0230000_31.l0).showDefaultNotification((Room) afS0S0230000_31.l1, afS0S0230000_31.z2, afS0S0230000_31.z3, afS0S0230000_31.z4, null);
        C1C7U.LIZIZ("AudioLiveService@42bb.showNotification$1$2");
    }

    public AfS0S0230000_31(AudioLiveService audioLiveService, Room room, boolean z, boolean z2, boolean z3, int i) {
        this.$t = i;
        this.l0 = audioLiveService;
        this.l1 = room;
        this.z2 = z;
        this.z3 = z2;
        this.z4 = z3;
    }
}
