package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.CombineBadgeBackground;
import java.io.IOException;

/* JADX INFO: renamed from: X.1DfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261491DfP implements InterfaceC2183511Acv<CombineBadgeBackground> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static CombineBadgeBackground LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        CombineBadgeBackground combineBadgeBackground = new CombineBadgeBackground();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -724938390:
                        if (strNextName.equals("stretchable_background_image")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeBackground.stretchableBackgroundImage = C2261481DfO.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 35728188:
                        if (strNextName.equals("border_color_code")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeBackground.borderColorCode = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 100313435:
                        if (strNextName.equals("image")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeBackground.image = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1811019002:
                        if (strNextName.equals("background_color_code")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeBackground.backgroundColorCode = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1922336683:
                        if (strNextName.equals("left_side_image")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeBackground.leftSideImage = C2261331Df9.LIZIZ(jsonReader);
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
        return combineBadgeBackground;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ CombineBadgeBackground LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
