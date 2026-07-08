package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.mt.protector.impl.string2number.CastShortProtector;
import java.io.IOException;

/* JADX INFO: renamed from: X.1DfN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2261471DfN implements InterfaceC2183511Acv<Short> {
    @Override // X.InterfaceC2183511Acv
    public final Short LIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        if (jsonReader.peek() == JsonToken.NAME) {
            return Short.valueOf(CastShortProtector.parseShort(jsonReader.nextName()));
        }
        return Short.valueOf((short) jsonReader.nextInt());
    }
}
