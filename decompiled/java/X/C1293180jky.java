package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293180jky {
    public static <T> void LIZIZ(List<? extends C1293200jl0<T>> list) {
        int i;
        T t;
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C1293200jl0 c1293200jl0 = (C1293200jl0) ListProtector.get(list, i2);
            i2++;
            C1293200jl0 c1293200jl02 = (C1293200jl0) ListProtector.get(list, i2);
            c1293200jl0.LJFF = Float.valueOf(c1293200jl02.LJ);
            if (c1293200jl0.LIZJ == null && (t = c1293200jl02.LIZIZ) != null) {
                c1293200jl0.LIZJ = t;
                if (c1293200jl0 instanceof C1293190jkz) {
                    ((C1293190jkz) c1293200jl0).LIZLLL();
                }
            }
        }
        C1293200jl0 c1293200jl03 = (C1293200jl0) ListProtector.get(list, i);
        if ((c1293200jl03.LIZIZ == null || c1293200jl03.LIZJ == null) && arrayList.size() > 1) {
            arrayList.remove(c1293200jl03);
        }
    }

    public static List LIZ(float f, JsonReader jsonReader, C1291600jiQ c1291600jiQ, InterfaceC1293670jll interfaceC1293670jll) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            c1291600jiQ.LIZ("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("k")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(C1293210jl1.LIZ(jsonReader, c1291600jiQ, f, interfaceC1293670jll, false));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(C1293210jl1.LIZ(jsonReader, c1291600jiQ, f, interfaceC1293670jll, true));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(C1293210jl1.LIZ(jsonReader, c1291600jiQ, f, interfaceC1293670jll, false));
            }
        }
        jsonReader.endObject();
        LIZIZ(arrayList);
        return arrayList;
    }
}
