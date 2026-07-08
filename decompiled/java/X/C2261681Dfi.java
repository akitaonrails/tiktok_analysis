package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.ArrowConfig;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dfi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261681Dfi implements InterfaceC2183511Acv<ArrowConfig> {
    public static ArrowConfig LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        ArrowConfig arrowConfig = new ArrowConfig();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (Intrinsics.LJFF(jsonReader.nextName(), "icon")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    arrowConfig.icon = C2261331Df9.LIZIZ(jsonReader);
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return arrowConfig;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ ArrowConfig LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
