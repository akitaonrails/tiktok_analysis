package X;

import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ue2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777080Ue2 {
    public boolean LIZ;
    public String LIZIZ;

    public C777080Ue2() {
        PunishEventInfo punishEventInfo;
        PunishEventInfo punishEventInfo2;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        boolean z = false;
        if (room != null) {
            WarningTag warningTag = room.warningTag;
            String str = null;
            if (Intrinsics.LJFF((warningTag == null || (punishEventInfo2 = warningTag.punishInfo) == null) ? null : punishEventInfo2.punishType, "mute")) {
                WarningTag warningTag2 = room.warningTag;
                if (warningTag2 != null && (punishEventInfo = warningTag2.punishInfo) != null) {
                    str = punishEventInfo.punishReason;
                }
                if (Intrinsics.LJFF(str, "CREDIT_MUTE")) {
                    z = true;
                }
            }
        }
        this.LIZ = z;
        this.LIZIZ = "";
    }
}
