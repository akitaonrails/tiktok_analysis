package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.User;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261751Dfp implements InterfaceC2183511Acv<User.OwnRoom> {
    public static User.OwnRoom LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        User.OwnRoom ownRoom = new User.OwnRoom();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (Intrinsics.LJFF(jsonReader.nextName(), "room_ids")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ownRoom.roomIdList = C2261301Df6.LIZIZ(jsonReader, C2261421DfI.LIZIZ);
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return ownRoom;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ User.OwnRoom LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
