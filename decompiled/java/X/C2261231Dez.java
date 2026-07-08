package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261231Dez implements InterfaceC2183511Acv<EcommerceEntrance> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EcommerceEntrance LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        EcommerceEntrance ecommerceEntrance = new EcommerceEntrance();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1946318530:
                        if (strNextName.equals("view_version")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                ecommerceEntrance.viewVersion = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1612775645:
                        if (strNextName.equals("entrance_type")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                ecommerceEntrance.entranceType = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1605893267:
                        if (strNextName.equals("creator_type")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                ecommerceEntrance.creatorType = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1578099954:
                        if (strNextName.equals("shop_entrance_info")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                ecommerceEntrance.shopEntranceInfo = C2261221Dey.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -907987551:
                        if (strNextName.equals("schema")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                ecommerceEntrance.schema = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1671218053:
                        if (strNextName.equals("showcase_entrance_info")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                ecommerceEntrance.showcaseEntranceInfo = C2261241Df0.LIZIZ(jsonReader);
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
        return ecommerceEntrance;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ EcommerceEntrance LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
