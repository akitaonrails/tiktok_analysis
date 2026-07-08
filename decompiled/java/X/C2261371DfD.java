package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.io.IOException;

/* JADX INFO: renamed from: X.1DfD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2261371DfD implements InterfaceC2183511Acv<Float> {
    @Override // X.InterfaceC2183511Acv
    public final Float LIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        if (jsonReader.peek() == JsonToken.NAME) {
            return Float.valueOf(CastFloatProtector.parseFloat(jsonReader.nextName()));
        }
        return Float.valueOf((float) jsonReader.nextDouble());
    }
}
