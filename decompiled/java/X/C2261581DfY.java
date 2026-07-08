package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.BadgeText;
import java.io.IOException;

/* JADX INFO: renamed from: X.1DfY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261581DfY implements InterfaceC2183511Acv<BadgeText> {
    public static BadgeText LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        BadgeText badgeText = new BadgeText();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                int iHashCode = strNextName.hashCode();
                if (iHashCode != -988425403) {
                    if (iHashCode != -794388590) {
                        if (iHashCode == 106079 && strNextName.equals("key")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                badgeText.key = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                    } else if (strNextName.equals("default_pattern")) {
                        if (jsonReader.peek() != JsonToken.NULL) {
                            badgeText.defaultPattern = jsonReader.nextString();
                        } else {
                            jsonReader.nextNull();
                        }
                    }
                } else if (strNextName.equals("pieces")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        badgeText.pieces = C2261301Df6.LIZIZ(jsonReader, C2261421DfI.LIZJ);
                    } else {
                        jsonReader.nextNull();
                    }
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return badgeText;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ BadgeText LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
