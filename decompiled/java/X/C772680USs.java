package X;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostAndCoHostAddAgeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLowAgeCountrySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.UserWithAgeSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0USs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772680USs implements InterfaceC759380Tqa {
    public final User LIZ = (User) UserService.getInstance().user().getCurrentUser();

    @Override // X.InterfaceC759380Tqa
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC759380Tqa
    public final int getErrorCode() {
        return 110;
    }

    public static void LIZLLL(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_age_popup_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LJIILJJIL("start_broadcast");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJJII(str, "click_icon");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZIZ(final C500840JkY c500840JkY, boolean z, C759360TqY c759360TqY) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c759360TqY));
        final Context context = c500840JkY.LIZ;
        final C0UTE c0ute = new C0UTE();
        boolean zLIZ = C0UTE.LIZ(context, "saved_uid_start", this.LIZ.getId());
        if (LiveLowAgeCountrySetting.INSTANCE.getValue() && !UserWithAgeSetting.INSTANCE.getValue() && !zLIZ && LiveHostAndCoHostAddAgeSetting.INSTANCE.getValue() == 0) {
            C19GO c19go = new C19GO(context);
            c19go.LIZLLL = C497740JfY.LJIJJ(2131842659, C2286608xc.LJ(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue()));
            c19go.LJII = C497740JfY.LJIJI(2131842657);
            c19go.LJFF(new DialogInterface.OnClickListener() { // from class: X.0USt
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    C772680USs c772680USs = this.LL;
                    DataChannel dataChannel = c500840JkY.LIZIZ;
                    c772680USs.getClass();
                    C772680USs.LIZLLL(dataChannel, "continue");
                    C0UTE c0ute2 = c0ute;
                    Context context2 = context;
                    long id = this.LL.LIZ.getId();
                    c0ute2.getClass();
                    C0UTE.LIZIZ(context2, "saved_uid_start", id);
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn.resumeWith(bool);
                }
            }, C497740JfY.LJIJI(2131842658), false);
            c19go.LIZLLL(new DialogInterface.OnClickListener() { // from class: X.0USc
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C772680USs c772680USs = this.LL;
                    DataChannel dataChannel = c500840JkY.LIZIZ;
                    c772680USs.getClass();
                    C772680USs.LIZLLL(dataChannel, "cancel");
                    dialogInterface.dismiss();
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                    Boolean bool = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn.resumeWith(bool);
                }
            }, C497740JfY.LJIJI(2131842656), false);
            c19go.LJJIIJ = false;
            C786410Ut5.M4(c19go.LIZ());
            DataChannel dataChannel = c500840JkY.LIZIZ;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_age_popup_show");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJIIJJI("live");
            c474500IjALIZ.LJIILJJIL("start_broadcast");
            c474500IjALIZ.LJIILL("show");
            c474500IjALIZ.LIZ();
        } else {
            C189200o6.m2constructorimpl(false);
            c23260099m.resumeWith(false);
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c759360TqY);
        }
        return objLIZ;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZJ(C500840JkY c500840JkY, boolean z, C09AX c09ax) {
        return C759370TqZ.LIZ(this, c500840JkY, z, c09ax);
    }
}
