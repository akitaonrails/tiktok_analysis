package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.FollowInfo;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dfx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261831Dfx implements InterfaceC2183511Acv<FollowInfo> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static FollowInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        FollowInfo followInfo = new FollowInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -2107390546:
                        if (strNextName.equals("follower_count")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                followInfo.followerCount = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 68471991:
                        if (strNextName.equals("push_status")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                followInfo.pushStatus = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 458536417:
                        if (strNextName.equals("following_count")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                followInfo.followingCount = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1028143168:
                        if (strNextName.equals("follow_status")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                followInfo.followStatus = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return followInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ FollowInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
