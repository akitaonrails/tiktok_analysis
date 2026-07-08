package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.User;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Df8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261321Df8 implements InterfaceC2183511Acv<User.CreatorScoreProfile> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static User.CreatorScoreProfile LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        User.CreatorScoreProfile creatorScoreProfile = new User.CreatorScoreProfile();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1866927479:
                        if (strNextName.equals("final_score")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                creatorScoreProfile.finalScore = jsonReader.nextDouble();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1481071862:
                        if (strNextName.equals("country_code")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                creatorScoreProfile.countryCode = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1614949899:
                        if (strNextName.equals("display_info")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                creatorScoreProfile.displayInfo = C2261311Df7.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1724860684:
                        if (strNextName.equals("score_info_extra")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                C2261401DfG c2261401DfG = C2261421DfI.LIZJ;
                                creatorScoreProfile.scoreInfoExtra = C2261341DfA.LIZIZ(jsonReader, c2261401DfG, c2261401DfG);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return creatorScoreProfile;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ User.CreatorScoreProfile LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
