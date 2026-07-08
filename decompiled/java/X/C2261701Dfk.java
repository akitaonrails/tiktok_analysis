package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.FontStyle;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dfk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261701Dfk implements InterfaceC2183511Acv<FontStyle> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static FontStyle LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        FontStyle fontStyle = new FontStyle();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1539906063:
                        if (strNextName.equals("font_size")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                fontStyle.fontSize = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -507058317:
                        if (strNextName.equals("font_color")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                fontStyle.fontColor = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -488774186:
                        if (strNextName.equals("font_width")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                fontStyle.fontWidth = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1723544976:
                        if (strNextName.equals("border_color")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                fontStyle.borderColor = jsonReader.nextString();
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
        return fontStyle;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ FontStyle LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
