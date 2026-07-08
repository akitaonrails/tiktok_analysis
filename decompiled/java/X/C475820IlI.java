package X;

import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;
import com.bytedance.android.livesdkapi.host.IHostShare;
import java.util.Map;

/* JADX INFO: renamed from: X.0IlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475820IlI implements InterfaceC475810IlH<FollowPair> {
    public C474500IjA LIZ;

    @Override // X.InterfaceC475810IlH
    public final void LIZ(Map<String, ? extends Object> map) {
        Boolean bool;
        C0IR5 c0ir5;
        ShareFromInfo shareFromInfo;
        C474130IiZ c474130IiZ;
        C0IXY c0ixy;
        String str;
        if (map == null) {
            return;
        }
        Object obj = map.get("wanna_follow");
        Map map2 = null;
        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            boolean zBooleanValue = bool.booleanValue();
            Object obj2 = map.get("live_context_log");
            if (obj2 instanceof C0IR5) {
                c0ir5 = (C0IR5) obj2;
            } else {
                c0ir5 = null;
            }
            Object obj3 = map.get("share_from_info_log");
            if (obj3 instanceof ShareFromInfo) {
                shareFromInfo = (ShareFromInfo) obj3;
            } else {
                shareFromInfo = null;
            }
            Object obj4 = map.get("follow_log");
            if (obj4 instanceof C474130IiZ) {
                c474130IiZ = (C474130IiZ) obj4;
            } else {
                c474130IiZ = null;
            }
            Object obj5 = map.get("ad_info_log");
            if (obj5 instanceof C0IXY) {
                c0ixy = (C0IXY) obj5;
            } else {
                c0ixy = null;
            }
            Object obj6 = map.get("follow_log_params");
            if (obj6 instanceof Map) {
                map2 = (Map) obj6;
            }
            if (zBooleanValue) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
            c474500IjALIZ.LJIJJ(c0ir5);
            c474500IjALIZ.LJJIL(shareFromInfo);
            c474500IjALIZ.LJIILLIIL(c474130IiZ);
            c474500IjALIZ.LJFF(c0ixy);
            c474500IjALIZ.LJJIIZI(map2);
            InterfaceC474510IjB interfaceC474510IjB = c474500IjALIZ.LIZ;
            if (interfaceC474510IjB != null) {
                interfaceC474510IjB.LJII();
            }
            this.LIZ = c474500IjALIZ;
        }
    }

    @Override // X.InterfaceC475810IlH
    public final void LIZIZ(FollowPair followPair, Map map) {
        Boolean bool;
        long jLongValue;
        boolean zBooleanValue;
        Boolean bool2;
        Long l;
        FollowPair followPair2 = followPair;
        if (map != null) {
            Object obj = map.get("wanna_follow");
            if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                boolean zBooleanValue2 = bool.booleanValue();
                Object obj2 = map.get("user_id");
                if ((obj2 instanceof Long) && (l = (Long) obj2) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                Object obj3 = map.get("need_to_post_event_to_host");
                if ((obj3 instanceof Boolean) && (bool2 = (Boolean) obj3) != null) {
                    zBooleanValue = bool2.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                C474500IjA c474500IjA = this.LIZ;
                if (c474500IjA != null) {
                    c474500IjA.LJJII(Long.valueOf(followPair2.followStatus), "follow_status");
                    c474500IjA.LIZ();
                }
                if (zBooleanValue) {
                    IHostShare iHostShare = (IHostShare) C1161920gLG.LIZJ(IHostShare.class);
                    String str = "follow";
                    if (iHostShare.isSharer(jLongValue).booleanValue()) {
                        if (!zBooleanValue2) {
                            str = "follow_cancel";
                        }
                        iHostShare.postFollowRecommendEvent("share_link", "live_profile_card_sharer", str);
                    } else {
                        if (!zBooleanValue2) {
                            str = "follow_cancel";
                        }
                        iHostShare.postFollowRecommendEvent("share_link", "live_profile_card_receiver", str);
                    }
                }
            }
        }
    }
}
