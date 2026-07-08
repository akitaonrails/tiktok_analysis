package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.model.NobleLevelInfo;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dg1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261871Dg1 implements InterfaceC2183511Acv<NobleLevelInfo> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static NobleLevelInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        NobleLevelInfo nobleLevelInfo = new NobleLevelInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1449371977:
                        if (strNextName.equals("noble_background_color")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                nobleLevelInfo.nobleBackgroundColor = C2261301Df6.LIZIZ(jsonReader, C2261421DfI.LIZJ);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -859269379:
                        if (strNextName.equals("noble_big_icon")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                nobleLevelInfo.nobleBigIcon = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -276565298:
                        if (strNextName.equals("noble_boarder")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                nobleLevelInfo.nobleBoarder = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -208978285:
                        if (strNextName.equals("noble_background")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                nobleLevelInfo.nobleBackground = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -96179731:
                        if (strNextName.equals("expire_time")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                nobleLevelInfo.expireTime = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 39954175:
                        if (strNextName.equals("noble_level")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                nobleLevelInfo.nobleLevel = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 139744670:
                        if (strNextName.equals("noble_icon")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                nobleLevelInfo.nobleIcon = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 139891632:
                        if (strNextName.equals("noble_name")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                nobleLevelInfo.nobleName = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1634990943:
                        if (strNextName.equals("noble_icon_with_back")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                nobleLevelInfo.nobleIconWithBack = C2261331Df9.LIZIZ(jsonReader);
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
        return nobleLevelInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ NobleLevelInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
