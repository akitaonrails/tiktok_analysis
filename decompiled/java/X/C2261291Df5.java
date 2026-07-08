package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.User;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Df5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261291Df5 implements InterfaceC2183511Acv<User.CreatorScoreLabelInfo> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static User.CreatorScoreLabelInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        User.CreatorScoreLabelInfo creatorScoreLabelInfo = new User.CreatorScoreLabelInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1649494120:
                        if (strNextName.equals("label_text")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                creatorScoreLabelInfo.labelText = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1560889974:
                        if (strNextName.equals("logo_dark")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                creatorScoreLabelInfo.logoDark = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1135332990:
                        if (strNextName.equals("logo_light")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                creatorScoreLabelInfo.logoLight = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -973533735:
                        if (strNextName.equals("label_text_color_dark")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                creatorScoreLabelInfo.labelTextColorDark = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -107158765:
                        if (strNextName.equals("label_text_color_light")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                creatorScoreLabelInfo.labelTextColorLight = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1814720484:
                        if (strNextName.equals("pop_up_info")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                creatorScoreLabelInfo.popUpInfo = C2261351DfB.LIZIZ(jsonReader);
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
        return creatorScoreLabelInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ User.CreatorScoreLabelInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
