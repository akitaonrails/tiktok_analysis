package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Df0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261241Df0 implements InterfaceC2183511Acv<EcommerceEntrance.ShowcaseEntranceInfo> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EcommerceEntrance.ShowcaseEntranceInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        EcommerceEntrance.ShowcaseEntranceInfo showcaseEntranceInfo = new EcommerceEntrance.ShowcaseEntranceInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1974376483:
                        if (strNextName.equals("showcase_name")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                showcaseEntranceInfo.showcaseName = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 727431652:
                        if (strNextName.equals("sold_count")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                showcaseEntranceInfo.soldCount = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1149063721:
                        if (strNextName.equals("creator_score_profile")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                showcaseEntranceInfo.creatorScoreProfile = C2261321Df8.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1768965932:
                        if (strNextName.equals("format_sold_count")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                showcaseEntranceInfo.formatSoldCount = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1901636577:
                        if (strNextName.equals("selling_point")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                showcaseEntranceInfo.sellingPoint = C2261301Df6.LIZIZ(jsonReader, new C2261281Df4());
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
        return showcaseEntranceInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ EcommerceEntrance.ShowcaseEntranceInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
