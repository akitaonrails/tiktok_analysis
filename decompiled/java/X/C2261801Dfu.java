package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.model.AnchorInfo;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dfu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261801Dfu implements InterfaceC2183511Acv<AnchorInfo> {
    public static AnchorInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        AnchorInfo anchorInfo = new AnchorInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (Intrinsics.LJFF(jsonReader.nextName(), "level")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    anchorInfo.level = jsonReader.nextLong();
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return anchorInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ AnchorInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
