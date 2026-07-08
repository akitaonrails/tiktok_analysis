package Y;

import X.C01GW;
import X.C01QD;
import X.C0IJT;
import X.C0UVW;
import X.C1440005kM;
import X.C1C7U;
import X.C474500IjA;
import X.C480460Ism;
import X.C781270Ukn;
import com.bytedance.android.livesdk.api.BroadcastRoomApi;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS91S0000000_12 implements Runnable {
    public final int $t;

    public static final void run$3(ARunnableS91S0000000_12 aRunnableS91S0000000_12) {
    }

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
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public ARunnableS91S0000000_12(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS91S0000000_12 aRunnableS91S0000000_12) {
        C1C7U.LIZ("BroadcastService@7e13.preloadRetrofitApi$1L");
        C480460Ism.LIZ().getClass();
        ((BroadcastRoomApi) C480460Ism.LIZLLL(BroadcastRoomApi.class)).getLivePermissionApply("");
        C480460Ism.LIZ().getClass();
        ((RoomRetrofitApi) C480460Ism.LIZIZ(RoomRetrofitApi.class)).createRoom(null);
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        C01QD.LIZ().LJ().sendStatus(0L, 0, 0L, 0, "", 0L, 0L);
        C781270Ukn.LJII().preloadBroadcastApi();
        C01QD.LIZ().LJ().sendStreamStatus(0L, 0, 0L, 0L);
        C1C7U.LIZIZ("BroadcastService@7e13.preloadRetrofitApi$1L");
    }

    public static final void run$1(ARunnableS91S0000000_12 aRunnableS91S0000000_12) {
        C1C7U.LIZ("MessageShowHandler@5daa.proxyShowWithPermissionCheck$2L");
        MessageShowHandler.LJ.set(false);
        C1C7U.LIZIZ("MessageShowHandler@5daa.proxyShowWithPermissionCheck$2L");
    }

    public static final void run$2(ARunnableS91S0000000_12 aRunnableS91S0000000_12) {
        C1C7U.LIZ("GameServiceStrategy@730c.onReconnect$1L");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_network_error");
        c474500IjALIZ.LJJII(String.valueOf(1), "error_type");
        c474500IjALIZ.LIZ();
        C1C7U.LIZIZ("GameServiceStrategy@730c.onReconnect$1L");
    }

    public static final void run$4(ARunnableS91S0000000_12 aRunnableS91S0000000_12) {
        C1C7U.LIZ("BaseLoginOrLogoutProgressListener@7b16.onProgress$3L");
        C1440005kM.LIZ(new IEvent() { // from class: X.0T0F
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
        C1C7U.LIZIZ("BaseLoginOrLogoutProgressListener@7b16.onProgress$3L");
    }
}
