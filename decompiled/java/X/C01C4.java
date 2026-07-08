package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01C4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01C4 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ DataChannel LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01C4(DataChannel dataChannel, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(0);
        this.LL = dataChannel;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = z2;
        this.LLILZIL = str2;
        this.LLILZLL = z3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Room room;
        LiveMode streamType;
        boolean z = C500260Jjc.LJIIZILJ(this.LL) || this.LLILLJJLI;
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ((C01C5.LIZ(this.LL) || C01C5.LIZIZ(this.LL)) ? "livesdk_moderator_custom_poll_entrance_show" : z ? "livesdk_anchor_custom_poll_entrance_show" : "livesdk_custom_poll_entrance_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJIJJLI(this.LL);
        c474500IjALIZIZ.LJJII(this.LLILLL, "enter_from");
        DataChannel dataChannel = this.LL;
        boolean z2 = this.LLILZ;
        String str = this.LLILZIL;
        boolean z3 = this.LLILZLL;
        boolean z4 = this.LLILLJJLI;
        String strLIZ = null;
        strLIZ = null;
        strLIZ = null;
        if (C01C5.LIZ(dataChannel)) {
            User userLIZIZ = C0KXJ.LIZIZ();
            c474500IjALIZIZ.LJJII(userLIZIZ != null ? Long.valueOf(userLIZIZ.getId()) : null, "moderator_id");
            c474500IjALIZIZ.LJJII("moderator", "user_type");
        } else if (z) {
            c474500IjALIZIZ.LJJII("anchor", "user_type");
            c474500IjALIZIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "has_red_dot");
            c474500IjALIZIZ.LJJ(str);
            c474500IjALIZIZ.LJJII(Integer.valueOf(z3 ? 1 : 0), "has_bubble_guidance");
            if (z4) {
                c474500IjALIZIZ.LJJ(str);
            } else {
                if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (streamType = room.getStreamType()) != null) {
                    strLIZ = C354201Zc.LIZ(streamType);
                }
                c474500IjALIZIZ.LJJ(strLIZ);
            }
        }
        c474500IjALIZIZ.LJJII(C0KYR.LIZJ(dataChannel), "admin_type");
        c474500IjALIZIZ.LIZ();
        return Unit.LIZ;
    }
}
