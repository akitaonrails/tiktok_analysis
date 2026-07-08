package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.model.FansClubData;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DfJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261431DfJ implements InterfaceC2183511Acv<FansClubData.UserBadge> {
    public static FansClubData.UserBadge LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        FansClubData.UserBadge userBadge = new FansClubData.UserBadge();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Intrinsics.LJFF(strNextName, "icons")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    userBadge.icons = C2261341DfA.LIZIZ(jsonReader, C2261421DfI.LIZ, new C2261331Df9());
                } else {
                    jsonReader.nextNull();
                }
            } else if (Intrinsics.LJFF(strNextName, "title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    userBadge.title = jsonReader.nextString();
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return userBadge;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ FansClubData.UserBadge LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
