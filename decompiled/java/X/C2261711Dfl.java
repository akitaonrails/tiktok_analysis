package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.PaddingInfo;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dfl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261711Dfl implements InterfaceC2183511Acv<PaddingInfo> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static PaddingInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        PaddingInfo paddingInfo = new PaddingInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -849041878:
                        if (strNextName.equals("badge_width")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                paddingInfo.badgeWidth = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -580930941:
                        if (strNextName.equals("icon_bottom_padding")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                paddingInfo.iconBottomPadding = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -571372583:
                        if (strNextName.equals("left_padding")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                paddingInfo.leftPadding = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 261212398:
                        if (strNextName.equals("right_padding")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                paddingInfo.rightPadding = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 341989223:
                        if (strNextName.equals("middle_padding")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                paddingInfo.middlePadding = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 687549537:
                        if (strNextName.equals("icon_top_padding")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                paddingInfo.iconTopPadding = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 772098195:
                        if (strNextName.equals("vertical_padding_rule")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                paddingInfo.verticalPaddingRule = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 918924965:
                        if (strNextName.equals("horizontal_padding_rule")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                paddingInfo.horizontalPaddingRule = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1311415530:
                        if (strNextName.equals("use_specific")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                paddingInfo.useSpecific = jsonReader.nextBoolean();
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
        return paddingInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ PaddingInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
