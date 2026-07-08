package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.SeparatorConfig;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dfm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261721Dfm implements InterfaceC2183511Acv<SeparatorConfig> {
    public static SeparatorConfig LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        SeparatorConfig separatorConfig = new SeparatorConfig();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (Intrinsics.LJFF(jsonReader.nextName(), "color")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    separatorConfig.color = jsonReader.nextString();
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return separatorConfig;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ SeparatorConfig LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
