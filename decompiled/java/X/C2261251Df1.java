package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Df1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261251Df1 implements InterfaceC2183511Acv<EcommerceEntrance.ShopEntranceInfo.StoreLabel> {
    public static EcommerceEntrance.ShopEntranceInfo.StoreLabel LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel = new EcommerceEntrance.ShopEntranceInfo.StoreLabel();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                int iHashCode = strNextName.hashCode();
                if (iHashCode != -1206165344) {
                    if (iHashCode != 1336071324) {
                        if (iHashCode == 1693054609 && strNextName.equals("is_bytemall")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                storeLabel.isBytemall = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                    } else if (strNextName.equals("shop_identity_label")) {
                        if (jsonReader.peek() != JsonToken.NULL) {
                            storeLabel.shopIdentityLabel = C2261821Dfw.LIZIZ(jsonReader);
                        } else {
                            jsonReader.nextNull();
                        }
                    }
                } else if (strNextName.equals("official_label")) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        storeLabel.officialLabel = C2261261Df2.LIZIZ(jsonReader);
                    } else {
                        jsonReader.nextNull();
                    }
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return storeLabel;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ EcommerceEntrance.ShopEntranceInfo.StoreLabel LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
