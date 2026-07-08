package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Df4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261281Df4 implements InterfaceC2183511Acv<EcommerceEntrance.SellingPoint> {
    @Override // X.InterfaceC2183511Acv
    public final EcommerceEntrance.SellingPoint LIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        EcommerceEntrance.SellingPoint sellingPoint = new EcommerceEntrance.SellingPoint();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Intrinsics.LJFF(strNextName, "show_text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    sellingPoint.showText = jsonReader.nextString();
                } else {
                    jsonReader.nextNull();
                }
            } else if (Intrinsics.LJFF(strNextName, "selling_point_type")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    sellingPoint.sellingPointType = jsonReader.nextInt();
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return sellingPoint;
    }
}
