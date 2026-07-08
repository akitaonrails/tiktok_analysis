package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import java.io.IOException;

/* JADX INFO: renamed from: X.1DfQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261501DfQ implements InterfaceC2183511Acv<SlimRoom.LinkMic> {
    @Override // X.InterfaceC2183511Acv
    public final SlimRoom.LinkMic LIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        SlimRoom.LinkMic linkMic = new SlimRoom.LinkMic();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                int iHashCode = strNextName.hashCode();
                if (iHashCode != -2118213113) {
                    if (iHashCode != -1647540192) {
                        if (iHashCode == -1549000240 && strNextName.equals("show_user_list")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                linkMic.followedList = C2261301Df6.LIZIZ(jsonReader, new C2262061DgK());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                    } else if (strNextName.equals("followed_count")) {
                        if (jsonReader.peek() != JsonToken.NULL) {
                            linkMic.followedCount = jsonReader.nextInt();
                        } else {
                            jsonReader.nextNull();
                        }
                    }
                } else if (strNextName.equals("audience_id_list")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        linkMic.audienceIdList = C2261301Df6.LIZIZ(jsonReader, C2261421DfI.LIZIZ);
                    } else {
                        jsonReader.nextNull();
                    }
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return linkMic;
    }
}
