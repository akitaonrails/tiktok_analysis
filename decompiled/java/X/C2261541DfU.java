package X;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.PaidEventPreview;

/* JADX INFO: renamed from: X.1DfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261541DfU implements InterfaceC2183511Acv<PaidEventPreview> {
    public static PaidEventPreview LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        PaidEventPreview paidEventPreview = new PaidEventPreview();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Intrinsics.LJFF(strNextName, "allow_preview")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    paidEventPreview.allowPreview = jsonReader.nextLong();
                } else {
                    jsonReader.nextNull();
                }
            } else if (Intrinsics.LJFF(strNextName, "allow_preview_time")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    paidEventPreview.allowPreviewTime = jsonReader.nextLong();
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return paidEventPreview;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ PaidEventPreview LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
