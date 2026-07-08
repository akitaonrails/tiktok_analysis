package X;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1DfA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261341DfA<K, V> implements InterfaceC2183511Acv<Map<K, V>> {
    public static <K, V> HashMap<K, V> LIZIZ(JsonReader jsonReader, InterfaceC2183511Acv<K> interfaceC2183511Acv, InterfaceC2183511Acv<V> interfaceC2183511Acv2) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        HashMap<K, V> map = new HashMap<>();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            K kLIZ = interfaceC2183511Acv.LIZ(jsonReader);
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
            } else {
                map.put(kLIZ, interfaceC2183511Acv2.LIZ(jsonReader));
            }
        }
        jsonReader.endObject();
        return map;
    }
}
