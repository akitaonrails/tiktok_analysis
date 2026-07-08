package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLowAgeCountrySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.UserWithAgeSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0UTB, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UTB implements InterfaceC928000aFy {
    public C19GN LIZ;

    public static void LIZIZ(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_age_popup_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJIIJJI("live_interact");
        c474500IjALIZ.LJIILJJIL("guest_connect");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJJII(str, "click_icon");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC928000aFy
    public final boolean LIZ(final C0UTD c0utd, boolean z) {
        final Context context = c0utd.LIZ;
        final long currentUserId = UserService.getInstance().user().getCurrentUserId();
        final C0UTE c0ute = new C0UTE();
        boolean zLIZ = C0UTE.LIZ(context, "saved_uid_start", currentUserId);
        if (LiveLowAgeCountrySetting.INSTANCE.getValue() && !UserWithAgeSetting.INSTANCE.getValue() && !zLIZ && !C2764015e.LIZIZ) {
            if (!z) {
                C19GO c19go = new C19GO(context);
                c19go.LIZLLL = C497740JfY.LJIJJ(2131842659, Integer.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue()));
                c19go.LJII = C497740JfY.LJIJI(2131842657);
                c19go.LJFF(new DialogInterface.OnClickListener() { // from class: X.0UTC
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        C0UTE c0ute2 = c0ute;
                        Context context2 = context;
                        long j = currentUserId;
                        c0ute2.getClass();
                        C0UTE.LIZIZ(context2, "saved_uid_start", j);
                        C0UTD c0utd2 = c0utd;
                        c0utd2.LIZJ.invoke(Integer.valueOf(c0utd2.LJ));
                        C0UTB c0utb = this;
                        DataChannel dataChannel = c0utd.LIZIZ;
                        c0utb.getClass();
                        C0UTB.LIZIZ(dataChannel, "continue");
                    }
                }, C497740JfY.LJIJI(2131842658), false);
                c19go.LIZLLL(new DialogInterfaceOnClickListenerC785930UsJ(c0utd, this, 1), C497740JfY.LJIJI(2131842656), false);
                c19go.LJJIIJ = false;
                C19GN c19gnLIZ = c19go.LIZ();
                this.LIZ = c19gnLIZ;
                C786410Ut5.M4(c19gnLIZ);
                DataChannel dataChannel = c0utd.LIZIZ;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_age_popup_show");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LJIIJJI("live_interact");
                c474500IjALIZ.LJIILJJIL("guest_connect");
                c474500IjALIZ.LJIILL("show");
                c474500IjALIZ.LIZ();
            }
            return true;
        }
        return false;
    }
}
