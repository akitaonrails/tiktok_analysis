package X;

import com.bytedance.android.livesdk.livesetting.game.GameGuessingSchema;
import com.bytedance.android.livesdk.livesetting.game.GameGuessingSchemaV3;
import com.bytedance.android.livesdk.livesetting.game.GameLiveEnableCreatorMultiGuessSetting;
import com.bytedance.android.livesdk.livesetting.game.SchemaData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0g61, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152470g61 {
    public static final /* synthetic */ int LIZ = 0;

    public static SchemaData LIZ(DataChannel dataChannel, boolean z) {
        Room roomLJJLIIIIJ;
        if (z) {
            if (GameLiveEnableCreatorMultiGuessSetting.INSTANCE.enable()) {
                return GameGuessingSchemaV3.INSTANCE.getValue();
            }
            return GameGuessingSchema.INSTANCE.getValue();
        }
        if (dataChannel != null) {
            roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
        } else {
            roomLJJLIIIIJ = null;
        }
        if (C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJJJJ(roomLJJLIIIIJ)))) {
            return GameGuessingSchemaV3.INSTANCE.getValue();
        }
        return GameGuessingSchema.INSTANCE.getValue();
    }
}
