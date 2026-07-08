package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dfr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261771Dfr implements InterfaceC2183511Acv<SubscribeBadge> {
    public static SubscribeBadge LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        SubscribeBadge subscribeBadge = new SubscribeBadge();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                int iHashCode = strNextName.hashCode();
                if (iHashCode != -1883868374) {
                    if (iHashCode != -1290893620) {
                        if (iHashCode == 724321974 && strNextName.equals("is_customized")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeBadge.isCustomized = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                    } else if (strNextName.equals("preview_img")) {
                        if (jsonReader.peek() != JsonToken.NULL) {
                            subscribeBadge.previewImage = C2261331Df9.LIZIZ(jsonReader);
                        } else {
                            jsonReader.nextNull();
                        }
                    }
                } else if (strNextName.equals("origin_img")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        subscribeBadge.originImage = C2261331Df9.LIZIZ(jsonReader);
                    } else {
                        jsonReader.nextNull();
                    }
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return subscribeBadge;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ SubscribeBadge LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
