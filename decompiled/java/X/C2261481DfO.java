package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.StretchableBackgroundImage;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DfO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261481DfO implements InterfaceC2183511Acv<StretchableBackgroundImage> {
    public static StretchableBackgroundImage LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        StretchableBackgroundImage stretchableBackgroundImage = new StretchableBackgroundImage();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Intrinsics.LJFF(strNextName, "flex_settings")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    stretchableBackgroundImage.flexSettings = C2261301Df6.LIZIZ(jsonReader, C2261421DfI.LIZIZ);
                } else {
                    jsonReader.nextNull();
                }
            } else if (Intrinsics.LJFF(strNextName, "image")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    stretchableBackgroundImage.image = C2261331Df9.LIZIZ(jsonReader);
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return stretchableBackgroundImage;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ StretchableBackgroundImage LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
