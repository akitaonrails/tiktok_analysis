package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.model.UserAttr;
import java.io.IOException;

/* JADX INFO: renamed from: X.1DfM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261461DfM implements InterfaceC2183511Acv<UserAttr> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static UserAttr LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        UserAttr userAttr = new UserAttr();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case 107637754:
                        if (strNextName.equals("is_admin")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userAttr.isAdmin = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 119233046:
                        if (strNextName.equals("is_muted")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userAttr.isMuted = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 482435774:
                        if (strNextName.equals("is_channel_admin")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userAttr.isChannelAdmin = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 721262667:
                        if (strNextName.equals("has_voting_function")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userAttr.hasVotingFunction = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 780654484:
                        if (strNextName.equals("admin_permissions")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                C2261391DfF c2261391DfF = C2261421DfI.LIZ;
                                userAttr.adminPermissions = C2261341DfA.LIZIZ(jsonReader, c2261391DfF, c2261391DfF);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1006438902:
                        if (strNextName.equals("is_super_admin")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userAttr.isSuperAdmin = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 2034137338:
                        if (strNextName.equals("mute_duration")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userAttr.muteDuration = jsonReader.nextLong();
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
        return userAttr;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ UserAttr LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
