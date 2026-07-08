package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.User;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Dfs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261781Dfs implements InterfaceC2183511Acv<User.EnigmaInfo> {
    public static User.EnigmaInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        User.EnigmaInfo enigmaInfo = new User.EnigmaInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (Intrinsics.LJFF(jsonReader.nextName(), "is_enigma_mask_on")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    enigmaInfo.isEnigmaMaskOn = jsonReader.nextBoolean();
                } else {
                    jsonReader.nextNull();
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return enigmaInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ User.EnigmaInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
