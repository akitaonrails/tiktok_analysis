package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.model.FraternityInfo;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dfy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261841Dfy implements InterfaceC2183511Acv<FraternityInfo> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static FraternityInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        FraternityInfo fraternityInfo = new FraternityInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1332194002:
                        if (strNextName.equals("background")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                fraternityInfo.background = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -507058317:
                        if (strNextName.equals("font_color")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                fraternityInfo.fontColor = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 3373707:
                        if (strNextName.equals("name")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                fraternityInfo.name = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 102865796:
                        if (strNextName.equals("level")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                fraternityInfo.level = jsonReader.nextLong();
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
        return fraternityInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ FraternityInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
