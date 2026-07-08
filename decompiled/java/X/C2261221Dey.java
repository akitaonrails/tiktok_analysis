package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261221Dey implements InterfaceC2183511Acv<EcommerceEntrance.ShopEntranceInfo> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EcommerceEntrance.ShopEntranceInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        EcommerceEntrance.ShopEntranceInfo shopEntranceInfo = new EcommerceEntrance.ShopEntranceInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -2103918028:
                        if (strNextName.equals("shop_name")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopEntranceInfo.shopName = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1849288312:
                        if (strNextName.equals("show_rate_not_applicable")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopEntranceInfo.showRateNotApplicable = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1492718058:
                        if (strNextName.equals("store_label")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopEntranceInfo.storeLabel = C2261251Df1.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1217958693:
                        if (strNextName.equals("exp_rate_top_display")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopEntranceInfo.expRateTopDisplay = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 120411098:
                        if (strNextName.equals("exp_rate_percentile")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopEntranceInfo.expRatePercentile = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 727431652:
                        if (strNextName.equals("sold_count")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopEntranceInfo.soldCount = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1021220565:
                        if (strNextName.equals("rate_display_style")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopEntranceInfo.rateDisplayStyle = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1179104006:
                        if (strNextName.equals("shop_rating")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopEntranceInfo.shopRating = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1768965932:
                        if (strNextName.equals("format_sold_count")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopEntranceInfo.formatSoldCount = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1901636577:
                        if (strNextName.equals("selling_point")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopEntranceInfo.sellingPoint = C2261301Df6.LIZIZ(jsonReader, new C2261281Df4());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 2067081988:
                        if (strNextName.equals("shop_id")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                shopEntranceInfo.shopId = jsonReader.nextString();
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
        return shopEntranceInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ EcommerceEntrance.ShopEntranceInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
