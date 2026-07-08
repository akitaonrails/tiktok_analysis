package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commerce.tools.music.ShootActionOrigin;
import java.util.Map;

/* JADX INFO: renamed from: X.15MK, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15MK {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ShootActionOrigin LIZ(Bundle bundle, String str) {
        Object obj;
        Object obj2;
        Object obj3;
        if (str != null) {
            switch (str.hashCode()) {
                case -1731750228:
                    if (str.equals("single_song")) {
                        Object obj4 = null;
                        if (bundle != null) {
                            try {
                                obj = bundle.get("extra_event_params");
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                obj = null;
                            } catch (OutOfMemoryError e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                obj = null;
                            }
                            break;
                        } else {
                            obj = null;
                        }
                        if ((obj instanceof Map) && obj != null) {
                            obj2 = ((Map) obj).get("shoot");
                        } else {
                            obj2 = null;
                        }
                        if ((obj2 instanceof Map) && obj2 != null) {
                            obj3 = ((Map) obj2).get("action_originated_from");
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            obj4 = obj3;
                        }
                        String str2 = (String) obj4;
                        if (str2 != null) {
                            switch (str2.hashCode()) {
                                case -1731750228:
                                    if (str2.equals("single_song")) {
                                        return ShootActionOrigin.CLICK_VIDEO_MUSIC;
                                    }
                                    break;
                                case -1482672230:
                                    if (str2.equals("collection_video")) {
                                        return ShootActionOrigin.CLICK_VIDEO_MUSIC;
                                    }
                                    break;
                                case -1271119582:
                                    if (str2.equals("homepage_follow")) {
                                        return ShootActionOrigin.CLICK_VIDEO_MUSIC;
                                    }
                                    break;
                                case -667094460:
                                    if (str2.equals("homepage_friends")) {
                                        return ShootActionOrigin.CLICK_VIDEO_MUSIC;
                                    }
                                    break;
                                case -562830579:
                                    if (str2.equals("personal_homepage")) {
                                        return ShootActionOrigin.CLICK_VIDEO_MUSIC;
                                    }
                                    break;
                                case 1425879700:
                                    if (str2.equals("search_result")) {
                                        return ShootActionOrigin.SEARCH_MUSIC;
                                    }
                                    break;
                                case 1691937916:
                                    if (str2.equals("homepage_hot")) {
                                        return ShootActionOrigin.CLICK_VIDEO_MUSIC;
                                    }
                                    break;
                            }
                        }
                        return ShootActionOrigin.CLICK_VIDEO_MUSIC;
                    }
                    break;
                case -1659026515:
                    if (str.equals("anchor_combine_prop")) {
                        return ShootActionOrigin.CLICK_EFFECT;
                    }
                    break;
                case -907987551:
                    if (str.equals("schema")) {
                        return ShootActionOrigin.SEARCH_MUSIC;
                    }
                    break;
                case -892243791:
                    if (str.equals("stitch")) {
                        return ShootActionOrigin.CLICK_VIDEO_DUET_STITCH;
                    }
                    break;
                case -728228373:
                    if (str.equals("prop_page")) {
                        return ShootActionOrigin.CLICK_EFFECT;
                    }
                    break;
                case 3094784:
                    if (str.equals("duet")) {
                        return ShootActionOrigin.CLICK_VIDEO_DUET_STITCH;
                    }
                    break;
                case 249266798:
                    if (str.equals("duet_page")) {
                        return ShootActionOrigin.CLICK_VIDEO_DUET_STITCH;
                    }
                    break;
                case 669986889:
                    if (str.equals("direct_shoot")) {
                        return ShootActionOrigin.CLICK_PLUS;
                    }
                    break;
                case 1402633315:
                    if (str.equals("challenge")) {
                        return ShootActionOrigin.CLICK_HASHTAG;
                    }
                    break;
                case 1425879700:
                    if (str.equals("search_result")) {
                        return ShootActionOrigin.SEARCH_MUSIC;
                    }
                    break;
            }
        }
        return ShootActionOrigin.OTHERS;
    }
}
