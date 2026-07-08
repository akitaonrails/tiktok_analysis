package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dfb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261611Dfb implements InterfaceC2183511Acv<CombineBadgeStruct> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static CombineBadgeStruct LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        CombineBadgeStruct combineBadgeStruct = new CombineBadgeStruct();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1778482948:
                        if (strNextName.equals("multi_guest_show_style")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.multiGuestShowStyle = Integer.valueOf(jsonReader.nextInt());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1700770851:
                        if (strNextName.equals("background_auto_mirrored")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.bgAutoMirrored = Boolean.valueOf(jsonReader.nextBoolean());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1332194002:
                        if (strNextName.equals("background")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.background = C2261491DfP.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1142723845:
                        if (strNextName.equals("background_dark_mode")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.backgroundDarkMode = C2261491DfP.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -806339567:
                        if (strNextName.equals("padding")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.padding = C2261711Dfl.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -492120639:
                        if (strNextName.equals("font_style")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.fontStyle = C2261701Dfk.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -454877128:
                        if (strNextName.equals("arrow_config")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.arrowConfig = C2261681Dfi.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -454354948:
                        if (strNextName.equals("padding_new_font")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.paddingNewFont = C2261711Dfl.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -110692532:
                        if (strNextName.equals("public_screen_show_style")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.publicScreenShowStyle = Integer.valueOf(jsonReader.nextInt());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 114225:
                        if (strNextName.equals("str")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.str = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 3226745:
                        if (strNextName.equals("icon")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.icon = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 3556653:
                        if (strNextName.equals("text")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.text = C2261581DfY.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 274797544:
                        if (strNextName.equals("icon_auto_mirrored")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.iconAutoMirrored = Boolean.valueOf(jsonReader.nextBoolean());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 704596403:
                        if (strNextName.equals("ranklist_online_audience_show_style")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.rankListOnlineAudienceShowStyle = Integer.valueOf(jsonReader.nextInt());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 764458623:
                        if (strNextName.equals("personal_card_show_style")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.personalCardShowStyle = Integer.valueOf(jsonReader.nextInt());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1330951275:
                        if (strNextName.equals("profile_card_panel")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.profileCardPanel = C2261661Dfg.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1615288471:
                        if (strNextName.equals("display_type")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                combineBadgeStruct.badgeDisplayType = jsonReader.nextInt();
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
        return combineBadgeStruct;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ CombineBadgeStruct LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
