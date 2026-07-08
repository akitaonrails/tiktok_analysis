package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.ImageModel;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Df3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261271Df3 implements InterfaceC2183511Acv<ImageModel.Content> {
    public static ImageModel.Content LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        ImageModel.Content content = new ImageModel.Content();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                int iHashCode = strNextName.hashCode();
                if (iHashCode != -507058317) {
                    if (iHashCode != 3373707) {
                        if (iHashCode == 102865796 && strNextName.equals("level")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                content.level = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                    } else if (strNextName.equals("name")) {
                        if (jsonReader.peek() != JsonToken.NULL) {
                            content.name = jsonReader.nextString();
                        } else {
                            jsonReader.nextNull();
                        }
                    }
                } else if (strNextName.equals("font_color")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        content.fontColor = jsonReader.nextString();
                    } else {
                        jsonReader.nextNull();
                    }
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return content;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ ImageModel.Content LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
