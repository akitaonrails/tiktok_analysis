package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.model.ActivityRewardInfo;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dfz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261851Dfz implements InterfaceC2183511Acv<ActivityRewardInfo> {
    public static ActivityRewardInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        ActivityRewardInfo activityRewardInfo = new ActivityRewardInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Intrinsics.LJFF(strNextName, "Badge")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    activityRewardInfo.mBage = C2261331Df9.LIZIZ(jsonReader);
                } else {
                    jsonReader.nextNull();
                }
            } else if (Intrinsics.LJFF(strNextName, "StoryTag")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    activityRewardInfo.mStoryTag = C2261331Df9.LIZIZ(jsonReader);
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return activityRewardInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ ActivityRewardInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
