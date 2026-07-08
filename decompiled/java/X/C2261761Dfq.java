package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.User;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261761Dfq implements InterfaceC2183511Acv<User.FansClubInfo> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static User.FansClubInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        User.FansClubInfo fansClubInfo = new User.FansClubInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -2120894176:
                        if (strNextName.equals("is_sleeping")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                fansClubInfo.isSleeping = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1859994672:
                        if (strNextName.equals("fans_count")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                fansClubInfo.fansCount = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1851980219:
                        if (strNextName.equals("fans_level")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                fansClubInfo.fansLevel = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1845581485:
                        if (strNextName.equals("fans_score")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                fansClubInfo.fansScore = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 93494179:
                        if (strNextName.equals("badge")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                fansClubInfo.badge = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 967717557:
                        if (strNextName.equals("fans_club_name")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                fansClubInfo.fansClubName = jsonReader.nextString();
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
        return fansClubInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ User.FansClubInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
