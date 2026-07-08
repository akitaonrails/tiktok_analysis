package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Df2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261261Df2 implements InterfaceC2183511Acv<EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel = new EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1649475163:
                        if (strNextName.equals("label_type")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                storeOfficialLabel.labelType = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -267430395:
                        if (strNextName.equals("label_image_dark")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                storeOfficialLabel.labelImageDark = C2261731Dfn.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 307208295:
                        if (strNextName.equals("label_image_light")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                storeOfficialLabel.labelImageLight = C2261731Dfn.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1166578839:
                        if (strNextName.equals("label_type_str")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                storeOfficialLabel.labelTypeStr = jsonReader.nextString();
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
        return storeOfficialLabel;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
