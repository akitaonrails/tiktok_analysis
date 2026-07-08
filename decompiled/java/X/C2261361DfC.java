package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import java.io.IOException;

/* JADX INFO: renamed from: X.1DfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2261361DfC implements InterfaceC2183511Acv<Double> {
    @Override // X.InterfaceC2183511Acv
    public final Double LIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        if (jsonReader.peek() == JsonToken.NAME) {
            return Double.valueOf(CastDoubleProtector.parseDouble(jsonReader.nextName()));
        }
        return Double.valueOf(jsonReader.nextDouble());
    }
}
