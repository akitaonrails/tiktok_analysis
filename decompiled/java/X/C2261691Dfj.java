package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.StringBadge;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dfj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261691Dfj implements InterfaceC2183511Acv<StringBadge> {
    public static StringBadge LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        StringBadge stringBadge = new StringBadge();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Intrinsics.LJFF(strNextName, "display_type")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    stringBadge.badgeDisplayType = jsonReader.nextInt();
                } else {
                    jsonReader.nextNull();
                }
            } else if (Intrinsics.LJFF(strNextName, "str")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    stringBadge.contentStr = jsonReader.nextString();
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return stringBadge;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ StringBadge LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
