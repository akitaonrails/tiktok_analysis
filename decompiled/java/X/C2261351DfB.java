package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.User;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261351DfB implements InterfaceC2183511Acv<User.PopUpInfo> {
    public static User.PopUpInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        User.PopUpInfo popUpInfo = new User.PopUpInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Intrinsics.LJFF(strNextName, "title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    popUpInfo.title = jsonReader.nextString();
                } else {
                    jsonReader.nextNull();
                }
            } else if (Intrinsics.LJFF(strNextName, "description")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    popUpInfo.description = jsonReader.nextString();
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return popUpInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ User.PopUpInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
