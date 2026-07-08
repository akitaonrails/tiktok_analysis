package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.LabelConfig;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dfc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261621Dfc implements InterfaceC2183511Acv<LabelConfig> {
    public static LabelConfig LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        LabelConfig labelConfig = new LabelConfig();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                int iHashCode = strNextName.hashCode();
                if (iHashCode != -1332194002) {
                    if (iHashCode != -492120639) {
                        if (iHashCode == 102727412 && strNextName.equals("label")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                labelConfig.label = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                    } else if (strNextName.equals("font_style")) {
                        if (jsonReader.peek() != JsonToken.NULL) {
                            labelConfig.fontStyle = C2261701Dfk.LIZIZ(jsonReader);
                        } else {
                            jsonReader.nextNull();
                        }
                    }
                } else if (strNextName.equals("background")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        labelConfig.background = C2261491DfP.LIZIZ(jsonReader);
                    } else {
                        jsonReader.nextNull();
                    }
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return labelConfig;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ LabelConfig LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
