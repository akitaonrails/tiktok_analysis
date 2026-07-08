package X;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0jl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293250jl5 {
    public static int LIZ(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        int iNextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    public static float LIZLLL(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i = C1293240jl4.LIZ[jsonTokenPeek.ordinal()];
        if (i != 1) {
            if (i == 2) {
                jsonReader.beginArray();
                float fNextDouble = (float) jsonReader.nextDouble();
                while (jsonReader.hasNext()) {
                    jsonReader.skipValue();
                }
                jsonReader.endArray();
                return fNextDouble;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unknown value for token of type ");
            sbLIZ.append(jsonTokenPeek);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return (float) jsonReader.nextDouble();
    }

    public static PointF LIZIZ(JsonReader jsonReader, float f) throws IOException {
        int i = C1293240jl4.LIZ[jsonReader.peek().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    jsonReader.beginObject();
                    float fLIZLLL = 0.0f;
                    float fLIZLLL2 = 0.0f;
                    while (jsonReader.hasNext()) {
                        String strNextName = jsonReader.nextName();
                        strNextName.getClass();
                        if (!strNextName.equals("x")) {
                            if (!strNextName.equals("y")) {
                                jsonReader.skipValue();
                            } else {
                                fLIZLLL2 = LIZLLL(jsonReader);
                            }
                        } else {
                            fLIZLLL = LIZLLL(jsonReader);
                        }
                    }
                    jsonReader.endObject();
                    return new PointF(fLIZLLL * f, fLIZLLL2 * f);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown point starts with ");
                sbLIZ.append(jsonReader.peek());
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            jsonReader.beginArray();
            float fNextDouble = (float) jsonReader.nextDouble();
            float fNextDouble2 = (float) jsonReader.nextDouble();
            while (jsonReader.peek() != JsonToken.END_ARRAY) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return new PointF(fNextDouble * f, fNextDouble2 * f);
        }
        float fNextDouble3 = (float) jsonReader.nextDouble();
        float fNextDouble4 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(fNextDouble3 * f, fNextDouble4 * f);
    }

    public static List<PointF> LIZJ(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(LIZIZ(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }
}
