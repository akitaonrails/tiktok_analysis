package X;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: renamed from: X.0jkv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293150jkv {
    public static C1292990jkf LIZIZ(JsonReader jsonReader, C1291600jiQ c1291600jiQ) {
        return new C1292990jkf(C1293180jky.LIZ(1.0f, jsonReader, c1291600jiQ, new InterfaceC1293670jll<Integer>() { // from class: X.0jl3
            @Override // X.InterfaceC1293670jll
            public final Integer LIZ(JsonReader jsonReader2, float f) {
                return Integer.valueOf(Math.round(C1293250jl5.LIZLLL(jsonReader2) * f));
            }
        }));
    }

    public static C1293140jku LIZJ(JsonReader jsonReader, C1291600jiQ c1291600jiQ) {
        return new C1293140jku(C1293180jky.LIZ(C1293420jlM.LIZLLL(), jsonReader, c1291600jiQ, new InterfaceC1293670jll<PointF>() { // from class: X.0jkw
            @Override // X.InterfaceC1293670jll
            public final PointF LIZ(JsonReader jsonReader2, float f) throws IOException {
                JsonToken jsonTokenPeek = jsonReader2.peek();
                if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
                    return C1293250jl5.LIZIZ(jsonReader2, f);
                }
                if (jsonTokenPeek == JsonToken.BEGIN_OBJECT) {
                    return C1293250jl5.LIZIZ(jsonReader2, f);
                }
                if (jsonTokenPeek == JsonToken.NUMBER) {
                    PointF pointF = new PointF(((float) jsonReader2.nextDouble()) * f, ((float) jsonReader2.nextDouble()) * f);
                    while (jsonReader2.hasNext()) {
                        jsonReader2.skipValue();
                    }
                    return pointF;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cannot convert json to point. Next token is ");
                sbLIZ.append(jsonTokenPeek);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }));
    }

    public static C1292960jkc LIZ(JsonReader jsonReader, C1291600jiQ c1291600jiQ, boolean z) {
        float fLIZLLL;
        if (z) {
            fLIZLLL = C1293420jlM.LIZLLL();
        } else {
            fLIZLLL = 1.0f;
        }
        return new C1292960jkc(C1293180jky.LIZ(fLIZLLL, jsonReader, c1291600jiQ, new InterfaceC1293670jll<Float>() { // from class: X.0jl7
            @Override // X.InterfaceC1293670jll
            public final Float LIZ(JsonReader jsonReader2, float f) {
                return Float.valueOf(C1293250jl5.LIZLLL(jsonReader2) * f);
            }
        }));
    }
}
