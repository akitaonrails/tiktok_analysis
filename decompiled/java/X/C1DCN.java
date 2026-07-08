package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.features.model.SessionFeatureItem;

/* JADX INFO: renamed from: X.1DCN, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCN<I> implements InterfaceC2251961DCg {
    public static final C1DCN<I> LIZ = new C1DCN<>();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC2251961DCg
    public final void LIZIZ(C204535151p c204535151p) {
        C603460Nlg c603460Nlg;
        long j;
        long j2;
        SessionFeatureItem sessionFeatureItem = c204535151p.LIZ;
        if (c204535151p.LIZIZ instanceof C582300Mse) {
            sessionFeatureItem.videoStartTimestamp = Long.valueOf(System.currentTimeMillis());
            sessionFeatureItem.vv++;
        }
        InterfaceC582850MtX interfaceC582850MtX = c204535151p.LIZIZ;
        if ((interfaceC582850MtX instanceof C603460Nlg) && (c603460Nlg = (C603460Nlg) interfaceC582850MtX) != null) {
            String str = c603460Nlg.LIZ;
            long jLongValue = 0;
            switch (str.hashCode()) {
                case -1877516040:
                    if (str.equals("play_time")) {
                        String value = c603460Nlg.LIZIZ.getValue("duration");
                        if (value != null) {
                            try {
                                j = CastLongProtector.parseLong(value);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                j = 0;
                            }
                        } else {
                            j = 0;
                        }
                        Long l = sessionFeatureItem.playTimeMax;
                        if (l != null) {
                            jLongValue = l.longValue();
                        }
                        sessionFeatureItem.playTimeMax = Long.valueOf(Math.max(jLongValue, j));
                        sessionFeatureItem.playTimeSum += j;
                        sessionFeatureItem.timestamp = System.currentTimeMillis();
                    }
                    break;
                case -1642623552:
                    if (str.equals("post_comment") && C2252021DCm.LIZ().enable_is_commentted) {
                        sessionFeatureItem.isCommentted = Boolean.TRUE;
                        break;
                    }
                    break;
                case -1542322381:
                    if (str.equals("livesdk_comment_pannel_show") && C2251931DCd.LJI) {
                        sessionFeatureItem.isClickComment = Boolean.TRUE;
                        break;
                    }
                    break;
                case -1330248535:
                    if (str.equals("click_comment_button") && C2252021DCm.LIZ().enable_is_click_comment) {
                        sessionFeatureItem.isClickComment = Boolean.TRUE;
                        break;
                    }
                    break;
                case -1268958287:
                    if (str.equals("follow") && C2252021DCm.LJI) {
                        sessionFeatureItem.isFollow = Boolean.TRUE;
                        break;
                    }
                    break;
                case -1122536402:
                    if (str.equals("livesdk_share") && C2251931DCd.LIZLLL) {
                        sessionFeatureItem.isShare = Boolean.TRUE;
                        break;
                    }
                    break;
                case -1115849514:
                    if (str.equals("livesdk_live_duration")) {
                        String value2 = c603460Nlg.LIZIZ.getValue("duration");
                        if (value2 != null) {
                            try {
                                jLongValue = CastLongProtector.parseLong(value2);
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                        sessionFeatureItem.playTimeCurLiveRoom += jLongValue;
                        sessionFeatureItem.playTimeLiveRoom += jLongValue;
                    }
                    break;
                case -1103263308:
                    if (str.equals("livesdk_dislike") && C2251931DCd.LJ) {
                        sessionFeatureItem.isDisliked = Boolean.TRUE;
                        break;
                    }
                    break;
                case -934521548:
                    if (str.equals("report") && C2252021DCm.LJIIL) {
                        sessionFeatureItem.isReported = Boolean.TRUE;
                        break;
                    }
                    break;
                case -804282046:
                    if (str.equals("livesdk_follow") && C2251931DCd.LIZJ) {
                        sessionFeatureItem.isFollow = Boolean.TRUE;
                        break;
                    }
                    break;
                case -795864119:
                    if (str.equals("enter_personal_detail")) {
                        sessionFeatureItem.isEnterUserProfile = true;
                    }
                    break;
                case -505186085:
                    if (str.equals("livesdk_unfollow") && C2251931DCd.LIZJ) {
                        sessionFeatureItem.isFollow = Boolean.FALSE;
                        break;
                    }
                    break;
                case -405326491:
                    if (str.equals("favourite_video") && C2252021DCm.LJIIIZ) {
                        sessionFeatureItem.isFavorite = Boolean.TRUE;
                        break;
                    }
                    break;
                case -17674694:
                    if (str.equals("video_play_finish")) {
                        sessionFeatureItem.isPlayFinished = true;
                    }
                    break;
                case 3321751:
                    if (str.equals("like") && C2252021DCm.LJIIIIZZ) {
                        sessionFeatureItem.isLike = Boolean.TRUE;
                        break;
                    }
                    break;
                case 21313630:
                    if (str.equals("livesdk_audience_live_message") && C2251931DCd.LJI) {
                        sessionFeatureItem.isCommentted = Boolean.TRUE;
                        break;
                    }
                    break;
                case 239764896:
                    if (str.equals("cancel_favourite_video") && C2252021DCm.LJIIIZ) {
                        sessionFeatureItem.isFavorite = Boolean.FALSE;
                        break;
                    }
                    break;
                case 409478171:
                    if (str.equals("share_video") && C2252021DCm.LJIIJ) {
                        sessionFeatureItem.isShare = Boolean.TRUE;
                        break;
                    }
                    break;
                case 552900296:
                    if (str.equals("follow_cancel") && C2252021DCm.LJI) {
                        sessionFeatureItem.isFollow = Boolean.FALSE;
                        break;
                    }
                    break;
                case 1059589542:
                    if (str.equals("livesdk_live_user_report") && C2251931DCd.LJFF) {
                        sessionFeatureItem.isReported = Boolean.TRUE;
                        break;
                    }
                    break;
                case 1190532130:
                    if (str.equals("like_cancel") && C2252021DCm.LJIIIIZZ) {
                        sessionFeatureItem.isLike = Boolean.FALSE;
                        break;
                    }
                    break;
                case 1438590386:
                    if (str.equals("enter_music_detail") && C2252021DCm.LIZ().enable_is_enter_music) {
                        sessionFeatureItem.isEnterMusic = Boolean.TRUE;
                        break;
                    }
                    break;
                case 1671642405:
                    if (str.equals("dislike") && C2252021DCm.LJIIJJI) {
                        sessionFeatureItem.isDisliked = Boolean.TRUE;
                        break;
                    }
                    break;
                case 1763681274:
                    if (str.equals("livesdk_live_window_duration_v2")) {
                        String value3 = c603460Nlg.LIZIZ.getValue("duration");
                        if (value3 != null) {
                            try {
                                j2 = CastLongProtector.parseLong(value3);
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                j2 = 0;
                            }
                        } else {
                            j2 = 0;
                        }
                        sessionFeatureItem.playTimeSum += j2;
                        Long l2 = sessionFeatureItem.playTimeMax;
                        if (l2 != null) {
                            jLongValue = l2.longValue();
                        }
                        sessionFeatureItem.playTimeMax = Long.valueOf(Math.max(jLongValue, j2));
                        sessionFeatureItem.timestamp = System.currentTimeMillis();
                    }
                    break;
                case 2041791848:
                    if (str.equals("livesdk_like") && C2251931DCd.LJII) {
                        sessionFeatureItem.isLike = Boolean.TRUE;
                        break;
                    }
                    break;
            }
        }
    }
}
