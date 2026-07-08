package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.User;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Df7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261311Df7 implements InterfaceC2183511Acv<User.CreatorScoreDisplayInfo> {
    public static User.CreatorScoreDisplayInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        User.CreatorScoreDisplayInfo creatorScoreDisplayInfo = new User.CreatorScoreDisplayInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Intrinsics.LJFF(strNextName, "ecommerce_entrance_label")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    creatorScoreDisplayInfo.ecommerceEntranceLabel = C2261291Df5.LIZIZ(jsonReader);
                } else {
                    jsonReader.nextNull();
                }
            } else if (Intrinsics.LJFF(strNextName, "score_level")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    creatorScoreDisplayInfo.scoreLevel = jsonReader.nextInt();
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return creatorScoreDisplayInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ User.CreatorScoreDisplayInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
