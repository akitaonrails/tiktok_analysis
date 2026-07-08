package X;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1Df6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261301Df6<E> implements InterfaceC2183511Acv<List<E>> {
    public static <E> ArrayList<E> LIZIZ(JsonReader jsonReader, InterfaceC2183511Acv<E> interfaceC2183511Acv) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        ArrayList<E> arrayList = new ArrayList<>();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
            } else {
                arrayList.add(interfaceC2183511Acv.LIZ(jsonReader));
            }
        }
        jsonReader.endArray();
        return arrayList;
    }
}
