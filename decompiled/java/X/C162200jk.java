package X;

import com.bytedance.android.livesdk.model.InteractionQuestionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.00jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C162200jk {
    public static int LIZ;

    public static final boolean LIZ(DataChannel dataChannel) {
        Room roomLIZ;
        InteractionQuestionInfo interactionQuestionInfo;
        if (C162100jj.LIZJ(dataChannel) && (roomLIZ = C162100jj.LIZ(dataChannel)) != null && (interactionQuestionInfo = roomLIZ.interactionQuestion) != null && interactionQuestionInfo.qaEntryType != null) {
            return true;
        }
        return false;
    }
}
