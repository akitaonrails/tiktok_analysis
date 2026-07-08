package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261821Dfw implements InterfaceC2183511Acv<EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel storeIdentityLabel = new EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1649475163:
                        if (strNextName.equals("label_type")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                storeIdentityLabel.labelType = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -740861511:
                        if (strNextName.equals("identity_label_text")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                storeIdentityLabel.identityLabelText = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -590980172:
                        if (strNextName.equals("identity_label_text_color_light")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                storeIdentityLabel.identityLabelTextColorLight = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -226700381:
                        if (strNextName.equals("identity_logo_light")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                storeIdentityLabel.identityLogoLight = C2261741Dfo.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -86555648:
                        if (strNextName.equals("identity_label_bg_color_dark")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                storeIdentityLabel.identityLabelBgColorDark = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 257785112:
                        if (strNextName.equals("identity_label_text_color_dark")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                storeIdentityLabel.identityLabelTextColorDark = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 269536073:
                        if (strNextName.equals("identity_logo_dark")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                storeIdentityLabel.identityLogoDark = C2261741Dfo.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1004621282:
                        if (strNextName.equals("shop_explanation_page_schema")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                storeIdentityLabel.shopExplanationPageSchema = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1619358156:
                        if (strNextName.equals("identity_label_bg_color_light")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                storeIdentityLabel.identityLabelBgColorLight = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1658582076:
                        if (strNextName.equals("shop_identity_label_key")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                storeIdentityLabel.shopIdentityLabelKey = jsonReader.nextString();
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
        return storeIdentityLabel;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
