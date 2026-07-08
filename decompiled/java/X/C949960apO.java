package X;

import Y.ACListenerS27S1300000_15;
import Y.AcS496S0100000_15;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveQuickCohostPreFilterSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS416S0200000_15;

/* JADX INFO: renamed from: X.0apO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949960apO {
    public static final boolean LIZ() {
        return C915980Zwa.LJIIIZ().LJII() > 0;
    }

    public static final void LIZIZ(Context context, LifecycleOwner lifecycleOwner) {
        Room room;
        if (C915980Zwa.LJIIIZ().LJII() > 0) {
            C915980Zwa.LJIIIZ().LIZ(EnumC959580b4u.CANCEL_BUTTON_CLICKED, null);
            return;
        }
        AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(context, lifecycleOwner, 11);
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        DataChannel dataChannel = C464550IJp.LIZIZ().LIZIZ;
        if (!LiveQuickCohostPreFilterSetting.INSTANCE.isEnable() && dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && room.visibleScopeType != 0) {
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LJII(2131856067);
            C494720Jag c494720Jag = new C494720Jag();
            C755620TkW c755620TkW = new C755620TkW();
            c755620TkW.LIZ = C497740JfY.LJIJI(2131856065);
            c755620TkW.LIZJ = new AcS496S0100000_15(awS416S0200000_15, 10);
            c494720Jag.LIZ(new C0TZ2(c755620TkW));
            C755630TkX c755630TkX = new C755630TkX();
            c755630TkX.LIZ = C497740JfY.LJIJI(2131856053);
            c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0apP
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            };
            c494720Jag.LIZ(new C0TZ3(c755630TkX));
            c494720Jag.LIZIZ = 1;
            c782110Um9.LIZJ(new C494730Jah(c494720Jag));
            c782110Um9.LJIILLIIL = false;
            c782110Um9.LJIILL = false;
            C786410Ut5.E4(c782110Um9.LIZ());
            return;
        }
        awS416S0200000_15.invoke();
    }

    public static void LIZJ(C16FS c16fs, DataChannel dataChannel, Boolean bool, String str, int i) {
        String str2 = str;
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        C786410Ut5.h8(c16fs, new ACListenerS27S1300000_15(null, bool2, c16fs, str2, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C16FS r5, com.bytedance.ies.sdk.datachannel.DataChannel r6, boolean r7, boolean r8, int r9) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C949960apO.LIZLLL(X.16FS, com.bytedance.ies.sdk.datachannel.DataChannel, boolean, boolean, int):void");
    }
}
