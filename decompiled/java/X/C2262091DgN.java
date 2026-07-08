package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.model.AnchorLevel;
import java.io.IOException;

/* JADX INFO: renamed from: X.1DgN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262091DgN implements InterfaceC2183511Acv<AnchorLevel> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static AnchorLevel LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        AnchorLevel anchorLevel = new AnchorLevel();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -2067332895:
                        if (strNextName.equals("task_start_experience")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                anchorLevel.taskStartExperience = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1951686780:
                        if (strNextName.equals("task_start_time")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                anchorLevel.taskStartTime = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1265586688:
                        if (strNextName.equals("profile_dialog_bg_back")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                anchorLevel.profileDialogBackBg = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1265272373:
                        if (strNextName.equals("lowest_experience_this_level")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                anchorLevel.lowestExperienceThisLevel = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1001204931:
                        if (strNextName.equals("highest_experience_this_level")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                anchorLevel.highestExperienceThisLevel = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -274528783:
                        if (strNextName.equals("task_decrease_experience")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                anchorLevel.taskDecreaseExperience = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -85567126:
                        if (strNextName.equals("experience")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                anchorLevel.experience = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 102865796:
                        if (strNextName.equals("level")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                anchorLevel.level = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 345901827:
                        if (strNextName.equals("stage_level")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                anchorLevel.stageLevelIcon = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1229679793:
                        if (strNextName.equals("small_icon")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                anchorLevel.levelIcon = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1734096171:
                        if (strNextName.equals("task_end_time")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                anchorLevel.taskEndTime = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1807675550:
                        if (strNextName.equals("task_target_experience")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                anchorLevel.taskTargetExperience = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 2044547974:
                        if (strNextName.equals("profile_dialog_bg")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                anchorLevel.profileDialogBg = C2261331Df9.LIZIZ(jsonReader);
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
        return anchorLevel;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ AnchorLevel LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
