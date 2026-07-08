package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.model.GradeIcon;
import com.bytedance.android.livesdk.model.UserHonor;
import java.io.IOException;

/* JADX INFO: renamed from: X.1DgJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262051DgJ implements InterfaceC2183511Acv<UserHonor> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static UserHonor LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        UserHonor userHonor = new UserHonor();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1626205171:
                        if (strNextName.equals("new_live_icon")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.newLiveIcon = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1332194002:
                        if (strNextName.equals("background")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.profileDialogBg = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1020146895:
                        if (strNextName.equals("deprecated20")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.totalDiamond = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1020146892:
                        if (strNextName.equals("deprecated23")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.currentDiamond = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1020146891:
                        if (strNextName.equals("deprecated24")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.thisGradeMinDiamond = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1020146890:
                        if (strNextName.equals("deprecated25")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.thisGradeMaxDiamond = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -850785741:
                        if (strNextName.equals("grade_describe")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.gradeDescribe = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -838651986:
                        if (strNextName.equals("screen_chat_type")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.screenChatType = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -520854354:
                        if (strNextName.equals("next_privileges")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.nextPrivileges = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 3226745:
                        if (strNextName.equals("icon")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.currentHonorIcon = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 3373707:
                        if (strNextName.equals("name")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.currentHonorName = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 102865796:
                        if (strNextName.equals("level")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.level = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 109264530:
                        if (strNextName.equals("score")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.score = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 679367318:
                        if (strNextName.equals("upgrade_need_consume")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.upgradeNeedConsume = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 720145556:
                        if (strNextName.equals("grade_banner")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.gradeBanner = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 799877692:
                        if (strNextName.equals("grade_icon_list")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.gradeIconList = C2261301Df6.LIZIZ(jsonReader, new InterfaceC2183511Acv<GradeIcon>() { // from class: X.1Dg2
                                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                    @Override // X.InterfaceC2183511Acv
                                    public final GradeIcon LIZ(JsonReader jsonReader2) throws IOException {
                                        if (jsonReader2.peek() == JsonToken.NULL) {
                                            return null;
                                        }
                                        GradeIcon gradeIcon = new GradeIcon();
                                        jsonReader2.beginObject();
                                        while (jsonReader2.hasNext()) {
                                            String strNextName2 = jsonReader2.nextName();
                                            if (strNextName2 != null) {
                                                switch (strNextName2.hashCode()) {
                                                    case -1655888138:
                                                        if (strNextName2.equals("level_str")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                gradeIcon.levelStr = jsonReader2.nextString();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 3226745:
                                                        if (strNextName2.equals("icon")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                gradeIcon.icon = C2261331Df9.LIZIZ(jsonReader2);
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 102865796:
                                                        if (strNextName2.equals("level")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                gradeIcon.level = jsonReader2.nextInt();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 1287879566:
                                                        if (strNextName2.equals("icon_diamond")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                gradeIcon.iconDiamond = jsonReader2.nextInt();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            jsonReader2.skipValue();
                                        }
                                        jsonReader2.endObject();
                                        return gradeIcon;
                                    }
                                });
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 895015477:
                        if (strNextName.equals("new_im_icon_with_level")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.newImIconWithLevel = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 969508996:
                        if (strNextName.equals("diamond_icon")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.diamondIcon = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1008662508:
                        if (strNextName.equals("live_icon")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.liveIcon = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1216891461:
                        if (strNextName.equals("next_icon")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.nextHonorIcon = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1217038423:
                        if (strNextName.equals("next_name")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.nextHonorName = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1312585048:
                        if (strNextName.equals("background_back")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.profileDialogBackBg = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1897193782:
                        if (strNextName.equals("im_icon_with_level")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.imIconWithLevel = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1910144692:
                        if (strNextName.equals("im_icon")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                userHonor.imIcon = C2261331Df9.LIZIZ(jsonReader);
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
        return userHonor;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ UserHonor LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
