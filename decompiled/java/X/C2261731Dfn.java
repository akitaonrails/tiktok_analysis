package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261731Dfn implements InterfaceC2183511Acv<EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage = new EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1362537971:
                        if (strNextName.equals("minetype")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopLabelImage.minetype = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1221029593:
                        if (strNextName.equals("height")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopLabelImage.height = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -970411666:
                        if (strNextName.equals("url_list")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopLabelImage.urlList = C2261301Df6.LIZIZ(jsonReader, C2261421DfI.LIZJ);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 116076:
                        if (strNextName.equals("uri")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopLabelImage.uri = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 94842723:
                        if (strNextName.equals("color")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopLabelImage.color = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 113126854:
                        if (strNextName.equals("width")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopLabelImage.width = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1330105219:
                        if (strNextName.equals("thumb_uri")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopLabelImage.thumbUri = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1909938138:
                        if (strNextName.equals("thumb_uri_list")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopLabelImage.thumbUriList = C2261301Df6.LIZIZ(jsonReader, C2261421DfI.LIZJ);
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
        return shopLabelImage;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
