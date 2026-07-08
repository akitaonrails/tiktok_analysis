package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.IOException;

/* JADX INFO: renamed from: X.1DfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261421DfI {
    public static final C2261391DfF LIZ = new InterfaceC2183511Acv<Integer>() { // from class: X.1DfF
        @Override // X.InterfaceC2183511Acv
        public final Integer LIZ(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            if (jsonReader.peek() == JsonToken.NAME) {
                return Integer.valueOf(CastIntegerProtector.parseInt(jsonReader.nextName()));
            }
            return Integer.valueOf(jsonReader.nextInt());
        }
    };
    public static final C2261411DfH LIZIZ = new InterfaceC2183511Acv<Long>() { // from class: X.1DfH
        @Override // X.InterfaceC2183511Acv
        public final Long LIZ(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            if (jsonReader.peek() == JsonToken.NAME) {
                return Long.valueOf(CastLongProtector.parseLong(jsonReader.nextName()));
            }
            return Long.valueOf(jsonReader.nextLong());
        }
    };
    public static final C2261401DfG LIZJ = new InterfaceC2183511Acv<String>() { // from class: X.1DfG
        @Override // X.InterfaceC2183511Acv
        public final String LIZ(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            if (jsonReader.peek() == JsonToken.NAME) {
                return jsonReader.nextName();
            }
            return jsonReader.nextString();
        }
    };
}
