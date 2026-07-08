package X;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: renamed from: X.1DfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2261381DfE implements InterfaceC2183511Acv<Boolean> {
    @Override // X.InterfaceC2183511Acv
    public final Boolean LIZ(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        if (jsonTokenPeek == JsonToken.NAME) {
            return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextName()));
        }
        if (jsonTokenPeek == JsonToken.STRING) {
            return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
        }
        return Boolean.valueOf(jsonReader.nextBoolean());
    }
}
