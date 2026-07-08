package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.ProfileCardPanel;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dfg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261661Dfg implements InterfaceC2183511Acv<ProfileCardPanel> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static ProfileCardPanel LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        ProfileCardPanel profileCardPanel = new ProfileCardPanel();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1974346657:
                        if (strNextName.equals("badge_text_position")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                profileCardPanel.badgeTextPosition = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -982930461:
                        if (strNextName.equals("profile_content")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                profileCardPanel.profileContent = C2261641Dfe.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 864046898:
                        if (strNextName.equals("projection_config")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                profileCardPanel.projectionConfig = C2261671Dfh.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1121358543:
                        if (strNextName.equals("use_new_profile_card_style")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                profileCardPanel.useNewProfileCardStyle = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1584497116:
                        if (strNextName.equals("separator_config")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                profileCardPanel.separatorConfig = C2261721Dfm.LIZIZ(jsonReader);
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
        return profileCardPanel;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ ProfileCardPanel LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
