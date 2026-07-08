package X;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0jl6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293260jl6 implements InterfaceC1293670jll<C1293350jlF> {
    public static final C1293260jl6 LIZ = new C1293260jl6();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1293670jll
    public final C1293350jlF LIZ(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> listLIZJ = null;
        boolean zNextBoolean = false;
        List<PointF> listLIZJ2 = null;
        List<PointF> listLIZJ3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName.hashCode()) {
                case 99:
                    if (strNextName.equals("c")) {
                        zNextBoolean = jsonReader.nextBoolean();
                    }
                    break;
                case 105:
                    if (strNextName.equals("i")) {
                        listLIZJ2 = C1293250jl5.LIZJ(jsonReader, f);
                    }
                    break;
                case 111:
                    if (strNextName.equals("o")) {
                        listLIZJ3 = C1293250jl5.LIZJ(jsonReader, f);
                    }
                    break;
                case 118:
                    if (strNextName.equals("v")) {
                        listLIZJ = C1293250jl5.LIZJ(jsonReader, f);
                    }
                    break;
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (listLIZJ != null && listLIZJ2 != null && listLIZJ3 != null) {
            if (listLIZJ.isEmpty()) {
                return new C1293350jlF(new PointF(), false, Collections.emptyList());
            }
            int size = listLIZJ.size();
            PointF pointF = (PointF) ListProtector.get(listLIZJ, 0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) ListProtector.get(listLIZJ, i);
                int i2 = i - 1;
                arrayList.add(new C1293660jlk(C1291750jif.LIZ((PointF) ListProtector.get(listLIZJ, i2), (PointF) ListProtector.get(listLIZJ3, i2)), C1291750jif.LIZ(pointF2, (PointF) ListProtector.get(listLIZJ2, i)), pointF2));
            }
            if (zNextBoolean) {
                PointF pointF3 = (PointF) ListProtector.get(listLIZJ, 0);
                int i3 = size - 1;
                arrayList.add(new C1293660jlk(C1291750jif.LIZ((PointF) ListProtector.get(listLIZJ, i3), (PointF) ListProtector.get(listLIZJ3, i3)), C1291750jif.LIZ(pointF3, (PointF) ListProtector.get(listLIZJ2, 0)), pointF3));
            }
            return new C1293350jlF(pointF, zNextBoolean, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
