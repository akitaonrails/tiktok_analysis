package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.TextBadge;
import java.io.IOException;

/* JADX INFO: renamed from: X.1DfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261591DfZ implements InterfaceC2183511Acv<TextBadge> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static TextBadge LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        TextBadge textBadge = new TextBadge();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -988425403:
                        if (strNextName.equals("pieces")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                textBadge.pieces = C2261301Df6.LIZIZ(jsonReader, C2261421DfI.LIZJ);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -794388590:
                        if (strNextName.equals("default_pattern")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                textBadge.defaultPattern = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 106079:
                        if (strNextName.equals("key")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                textBadge.key = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1615288471:
                        if (strNextName.equals("display_type")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                textBadge.badgeDisplayType = jsonReader.nextInt();
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
        return textBadge;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ TextBadge LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
