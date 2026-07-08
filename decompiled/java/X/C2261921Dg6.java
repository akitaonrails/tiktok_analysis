package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261921Dg6 implements InterfaceC2183511Acv<TimerDetail> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static TimerDetail LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        TimerDetail timerDetail = new TimerDetail();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -2076481451:
                        if (strNextName.equals("timer_id")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.timerId = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1945095419:
                        if (strNextName.equals("total_pause_time_s")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.totalPauseTimeS = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1480126789:
                        if (strNextName.equals("time_increase_cap_s")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.timeIncreaseCapS = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1310903082:
                        if (strNextName.equals("audit_status")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.auditStatus = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1271353878:
                        if (strNextName.equals("remaining_time_s")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.remainingTimeS = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1089143252:
                        if (strNextName.equals("timer_status")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.timerStatus = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1068300998:
                        if (strNextName.equals("anchor_side_title")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.anchorSideTitle = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -857951865:
                        if (strNextName.equals("time_increase_per_sub_s")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.timeIncreasePerSubS = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -411606699:
                        if (strNextName.equals("screen_h")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.screenH = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -411606684:
                        if (strNextName.equals("screen_w")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.screenW = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -192410740:
                        if (strNextName.equals("start_countdown_time_s")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.startCountdownTimeS = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -132156828:
                        if (strNextName.equals("user_side_title")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.userSideTitle = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -57818544:
                        if (strNextName.equals("sub_count")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.subCount = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -41830683:
                        if (strNextName.equals("anchor_id")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.anchorId = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 238533110:
                        if (strNextName.equals("sticker_x")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.stickerX = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 238533111:
                        if (strNextName.equals("sticker_y")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.stickerY = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 725191900:
                        if (strNextName.equals("total_time_s")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.totalTimeS = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 887125256:
                        if (strNextName.equals("antidirt_status")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.antidirtStatus = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1277873496:
                        if (strNextName.equals("last_pause_timestamp_s")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.lastPauseTimestampS = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1436764042:
                        if (strNextName.equals("timestamp_s")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.timestampS = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1463609133:
                        if (strNextName.equals("start_timestamp_s")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.startTimestampS = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1692185234:
                        if (strNextName.equals("audit_info")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.auditInfo = C2261861Dg0.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 2018116603:
                        if (strNextName.equals("time_increase_reach_cap")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                timerDetail.timeIncreaseReachCap = jsonReader.nextBoolean();
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
        return timerDetail;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ TimerDetail LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
