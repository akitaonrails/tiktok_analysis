package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.IOException;

/* JADX INFO: renamed from: X.1Dg5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2261911Dg5 implements InterfaceC2183511Acv<SubscribeInfo> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static SubscribeInfo LIZIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        SubscribeInfo subscribeInfo = new SubscribeInfo();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1941776769:
                        if (strNextName.equals("sol_room_display_text")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeInfo.solRoomDisplayText = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1829855998:
                        if (strNextName.equals("user_gift_sub_auth")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeInfo.userGiftSubAuth = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1549145271:
                        if (strNextName.equals("is_subscribed_to_anchor")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeInfo.isSubscribedToCurrentAnchor = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1531885941:
                        if (strNextName.equals("timer_detail")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeInfo.timerDetail = C2261921Dg6.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1426684947:
                        if (strNextName.equals("is_in_grace_period")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeInfo.isInGracePeriod = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -892481550:
                        if (strNextName.equals(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeInfo.status = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -796264331:
                        if (strNextName.equals("is_subscribe")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeInfo.isSubscribed = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -631333393:
                        if (strNextName.equals("qualification")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeInfo.isAnchorQualified = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -224886629:
                        if (strNextName.equals("is_sol_eligible")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeInfo.isSolEligible = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 29331380:
                        if (strNextName.equals("package_id")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeInfo.packageId = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 93494179:
                        if (strNextName.equals("badge")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeInfo.subscribeBadge = C2261771Dfr.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 555936345:
                        if (strNextName.equals("enable_subscription")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeInfo.anchorEnableSubscription = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1016795756:
                        if (strNextName.equals("anchor_gift_sub_auth")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeInfo.anchorGiftSubAuth = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1434694742:
                        if (strNextName.equals("sub_split_status")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeInfo.subSplitStatus = C2261811Dfv.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1871614584:
                        if (strNextName.equals("subscriber_count")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeInfo.subscriberCount = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1907314384:
                        if (strNextName.equals("sub_end_time")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                subscribeInfo.subEndTime = jsonReader.nextLong();
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
        return subscribeInfo;
    }

    @Override // X.InterfaceC2183511Acv
    public final /* bridge */ /* synthetic */ SubscribeInfo LIZ(JsonReader jsonReader) {
        return LIZIZ(jsonReader);
    }
}
