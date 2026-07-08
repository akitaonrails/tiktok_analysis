package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.NumberConfig;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261631Dfd implements InterfaceC2183511Acv<NumberConfig> {
    public static NumberConfig LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        NumberConfig numberConfig = new NumberConfig();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                int iHashCode = strNextName.hashCode();
                if (iHashCode != -1332194002) {
                    if (iHashCode != -1034364087) {
                        if (iHashCode == -492120639 && strNextName.equals("font_style")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                numberConfig.fontStyle = C2261701Dfk.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                    } else if (strNextName.equals("number")) {
                        if (jsonReader.peek() != JsonToken.NULL) {
                            numberConfig.number = jsonReader.nextLong();
                        } else {
                            jsonReader.nextNull();
                        }
                    }
                } else if (strNextName.equals("background")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        numberConfig.background = C2261491DfP.LIZIZ(jsonReader);
                    } else {
                        jsonReader.nextNull();
                    }
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return numberConfig;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ NumberConfig LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
