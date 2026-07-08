package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.User;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261791Dft implements InterfaceC2183511Acv<User.ComboBadgeInfo> {
    public static User.ComboBadgeInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        User.ComboBadgeInfo comboBadgeInfo = new User.ComboBadgeInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Intrinsics.LJFF(strNextName, "icon")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    comboBadgeInfo.icon = C2261331Df9.LIZIZ(jsonReader);
                } else {
                    jsonReader.nextNull();
                }
            } else if (Intrinsics.LJFF(strNextName, "combo_count")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    comboBadgeInfo.comboCount = jsonReader.nextLong();
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return comboBadgeInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ User.ComboBadgeInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
