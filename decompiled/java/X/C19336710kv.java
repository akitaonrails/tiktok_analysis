package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.tns.banner.VideoReviewStatusVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.OriginalAudioStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.notification.NotificationDetailSettingFragment;
import com.ss.android.ugc.aweme.live.notification.NotificationSettingFragment;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.edit.IReplaceMusicService;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10kv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19336710kv extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19336710kv(MatchCountDownAssem matchCountDownAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = matchCountDownAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19336710kv(VideoReviewStatusVM videoReviewStatusVM, int i) {
        super(4);
        this.$t = i;
        this.l0 = videoReviewStatusVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19336710kv(NotificationDetailSettingFragment notificationDetailSettingFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = notificationDetailSettingFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19336710kv(NotificationSettingFragment notificationSettingFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = notificationSettingFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19336710kv(NotificationLiveBottomDialog notificationLiveBottomDialog, int i) {
        super(4);
        this.$t = i;
        this.l0 = notificationLiveBottomDialog;
    }

    public static final Object invoke$0(C19336710kv c19336710kv, Object obj, Object obj2, Object obj3, Object obj4) {
        Aweme aweme;
        Object objValueOf;
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        UrlModel urlModel;
        List<String> urlList;
        Context context = (Context) obj;
        String str5 = (String) obj3;
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        VideoReviewStatusVM videoReviewStatusVM = (VideoReviewStatusVM) c19336710kv.l0;
        Context context2 = ((View) obj2).getContext();
        VideoItemParams item = videoReviewStatusVM.getItem();
        if (item != null && (aweme = item.getAweme()) != null && !C735280Sso.LIZ(aweme)) {
            C2189821An6 c2189821An6LIZ = C0SUC.LIZ(context);
            List<Integer> list = VideoReviewStatusVM.LLIZLLLIL;
            if (zBooleanValue) {
                if (str5.length() > 0) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context2, "//webview");
                    smartRouteBuildRoute.withParam(UriProtector.parse(str5));
                    smartRouteBuildRoute.open();
                }
            } else {
                VideoItemParams item2 = videoReviewStatusVM.getItem();
                if (item2 == null || !C10IS.LJI(item2)) {
                    if (C10IT.LJI(aweme)) {
                        if (AwemeExtKt.isPhotoMode(aweme)) {
                            C317840Cd4.LIZ.getClass();
                            C317840Cd4.LIZ(context2, aweme, "photomode_copyrighted", "change_ban_music");
                        } else {
                            Activity activityLJFF = C2214201BlK.LJFF();
                            if (activityLJFF != null) {
                                IReplaceMusicDownloadService iReplaceMusicDownloadService = (IReplaceMusicDownloadService) ServiceManager.get().getService(IReplaceMusicDownloadService.class);
                                String aid = aweme.getAid();
                                String strLIZ = C10IS.LIZ(c2189821An6LIZ);
                                if (strLIZ == null) {
                                    strLIZ = "";
                                }
                                String strLIZIZ = C10IS.LIZIZ(c2189821An6LIZ);
                                if (strLIZIZ == null) {
                                    strLIZIZ = "";
                                }
                                iReplaceMusicDownloadService.LIZ(activityLJFF, aid, strLIZ, strLIZIZ);
                            }
                        }
                        IReplaceMusicService iReplaceMusicService = (IReplaceMusicService) ServiceManager.get().getService(IReplaceMusicService.class);
                        if (iReplaceMusicService != null) {
                            iReplaceMusicService.dismissCopyrightViolationSnackBar();
                        }
                    } else if (str5.length() > 0) {
                        SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context2, "//webview");
                        smartRouteBuildRoute2.withParam(UriProtector.parse(str5));
                        smartRouteBuildRoute2.open();
                    }
                }
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
            c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
            Music music = aweme.getMusic();
            if (music == null) {
                objValueOf = "";
            } else {
                objValueOf = Long.valueOf(music.getId());
            }
            c2344009Gk.LJ(objValueOf, "music_id");
            c2344009Gk.LJIIIIZZ("enter_method", C10IS.LIZIZ(c2189821An6LIZ));
            c2344009Gk.LJIIIIZZ("creation_id", "");
            c2344009Gk.LJIIIIZZ("shoot_way", "");
            c2344009Gk.LJIIIIZZ("content_source", "");
            if (zBooleanValue) {
                str = "violation_detail_page";
            } else {
                str = "replace";
            }
            c2344009Gk.LJIIIIZZ("action_type", str);
            if (AwemeExtKt.isPhotoMode(aweme)) {
                str2 = "photo_mode";
            } else {
                str2 = "video";
            }
            c2344009Gk.LJIIIIZZ("replace_music_content_type", str2);
            OriginalAudioStruct originalAudioStruct = aweme.originalAudio;
            if (originalAudioStruct != null && (urlModel = originalAudioStruct.playUrl) != null && (urlList = urlModel.getUrlList()) != null && (!urlList.isEmpty())) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "has_original_sound");
            if (C10IT.LJI(aweme)) {
                str3 = "copyright";
            } else {
                str3 = "other";
            }
            c2344009Gk.LJIIIIZZ("mute_reason", str3);
            Video video = aweme.getVideo();
            if (video != null && video.isLongVideo()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("is_long_video", str4);
            c2344009Gk.LJIIIIZZ("mute_follow_up_status", C10IT.LJ(aweme));
            C20684815ws.LJIILLIIL("click_music_mute_detail", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C19336710kv c19336710kv, Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C1867990yi5 c1867990yi5 = (C1867990yi5) obj3;
        long jLongValue = ((Number) obj4).longValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("selectSubscribe showCountDown:");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", countDownText:");
        sbLIZ.append(c1867990yi5);
        sbLIZ.append(", countdownTimeStamp:");
        sbLIZ.append(jLongValue);
        C20441214yg.LIZIZ("MatchCountDownAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (zBooleanValue) {
            String str = ((MatchCountDownAssem) c19336710kv.l0).LLLIIIIL;
            if (str != null && !a0.LJJJIL(str)) {
                ((MatchCountDownAssem) c19336710kv.l0).kp(0);
            }
            if (jLongValue < 0) {
                C432120Gx0 c432120Gx0 = ((MatchCountDownAssem) c19336710kv.l0).LLJJIII;
                if (c432120Gx0 != null) {
                    c432120Gx0.setText("");
                }
            } else {
                C432120Gx0 c432120Gx02 = ((MatchCountDownAssem) c19336710kv.l0).LLJJIII;
                if (c432120Gx02 != null) {
                    c432120Gx02.setText(C963140bAe.LJIIJJI(jLongValue));
                }
            }
        } else {
            ((MatchCountDownAssem) c19336710kv.l0).getClass();
            if (C20487515Er.LIZIZ(C20487515Er.LIZ(C915980Zwa.LJII())).LIZIZ()) {
                ((MatchCountDownAssem) c19336710kv.l0).kp(8);
            }
            if (c1867990yi5.LIZ != null) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(abstractC738140SxQ), null, null, new C1879680z0w((MatchCountDownAssem) c19336710kv.l0, c1867990yi5, null), 3);
            } else {
                C432120Gx0 c432120Gx03 = ((MatchCountDownAssem) c19336710kv.l0).LLJJIII;
                if (c432120Gx03 != null) {
                    c432120Gx03.setText(c1867990yi5.LIZIZ);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C19336710kv c19336710kv, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj3).intValue();
        int iIntValue2 = ((Number) obj4).intValue();
        if (obj2 != null) {
            NotificationSettingFragment notificationSettingFragment = (NotificationSettingFragment) c19336710kv.l0;
            if (iIntValue2 == 0) {
                notificationSettingFragment.MR(4, iIntValue);
            } else {
                notificationSettingFragment.VR(null, null, false);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C19336710kv c19336710kv, Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj3).intValue();
        int iIntValue2 = ((Number) obj4).intValue();
        if (obj2 != null) {
            NotificationDetailSettingFragment notificationDetailSettingFragment = (NotificationDetailSettingFragment) c19336710kv.l0;
            if (iIntValue2 == 0) {
                notificationDetailSettingFragment.MR(4, iIntValue);
            } else {
                notificationDetailSettingFragment.ZR(null, null, false);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(C19336710kv c19336710kv, Object obj, Object obj2, Object obj3, Object obj4) {
        String string;
        int iIntValue = ((Number) obj3).intValue();
        int iIntValue2 = ((Number) obj4).intValue();
        if (obj2 != null) {
            NotificationLiveBottomDialog notificationLiveBottomDialog = (NotificationLiveBottomDialog) c19336710kv.l0;
            DialogC1239500iMO dialogC1239500iMO = notificationLiveBottomDialog.LLL;
            if (dialogC1239500iMO != null) {
                dialogC1239500iMO.dismiss();
                C785410UrT.LIZ(dialogC1239500iMO);
            }
            if (iIntValue2 == 0) {
                notificationLiveBottomDialog.MR(iIntValue);
                AwemeRawAd awemeRawAd = notificationLiveBottomDialog.LLIZLLLIL;
                if (awemeRawAd == null || awemeRawAd.getNotificationConfig() != 1) {
                    notificationLiveBottomDialog.dismiss();
                }
                if (iIntValue != 1) {
                    if (iIntValue != 2) {
                        if (iIntValue == 3) {
                            C1233040iBy c1233040iBy = new C1233040iBy(notificationLiveBottomDialog.getContext());
                            c1233040iBy.LIZIZ(2131842792);
                            c1233040iBy.LIZLLL();
                        }
                    } else {
                        C1233040iBy c1233040iBy2 = new C1233040iBy(notificationLiveBottomDialog.getContext());
                        c1233040iBy2.LIZIZ(2131842798);
                        c1233040iBy2.LIZLLL();
                    }
                } else {
                    Context context = notificationLiveBottomDialog.getContext();
                    String nickname = null;
                    if (context != null) {
                        string = context.getString(2131842789);
                    } else {
                        string = null;
                    }
                    User user = notificationLiveBottomDialog.LL;
                    if (user != null) {
                        nickname = user.getNickname();
                    }
                    if (string != null && nickname != null) {
                        C1233040iBy c1233040iBy3 = new C1233040iBy(notificationLiveBottomDialog.getContext());
                        c1233040iBy3.LIZJ(C786410Ut5.j4(string, Arrays.copyOf(new Object[]{nickname}, 1)));
                        c1233040iBy3.LIZLLL();
                    }
                }
                C10EW c10ew = notificationLiveBottomDialog.LLJ;
                if (c10ew != null) {
                    c10ew.LJ(4, iIntValue);
                }
            } else {
                notificationLiveBottomDialog.OR();
            }
        }
        return Unit.LIZ;
    }
}
