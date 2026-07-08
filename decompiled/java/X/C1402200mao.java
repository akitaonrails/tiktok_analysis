package X;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.likelist.adapter.LikeCell;
import com.ss.android.ugc.aweme.comment.viewerlist.adapter.VideoViewerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.share.improve.channel.RepostChannel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.upvote.detail.panel.CommentRepostPanelCell;
import com.ss.android.ugc.aweme.upvote.detail.panel.CommentRepostViewMorePanelCell;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListCell;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListViewModel;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.list.BaseRepostCell;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.list.RepostViewMoreCell;
import com.ss.android.ugc.now.interaction.assem.CommentCell;
import com.ss.android.ugc.profile.business.ci.viewer.api.ProfileViewerInfo;
import com.ss.android.ugc.profile.business.ci.viewer.ui.ProfileViewerCell;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS105S1000000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402200mao implements InterfaceC2211931Bhf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2211931Bhf
    public final void LIZ(View view, String str) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view, str);
                break;
            case 1:
                LIZ$1(this, view, str);
                break;
            case 2:
                LIZ$2(this, view, str);
                break;
            case 3:
                LIZ$3(this, view, str);
                break;
            case 4:
                LIZ$4(this, view, str);
                break;
            case 5:
                LIZ$5(this, view, str);
                break;
            case 6:
                LIZ$6(this, view, str);
                break;
            case 7:
                LIZ$7(this, view, str);
                break;
            case 8:
                LIZ$8(this, view, str);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view, str);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view, str);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view, str);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view, str);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view, str);
                break;
            case 14:
                LIZ$14(this, view, str);
                break;
            case 15:
                LIZ$15(this, view, str);
                break;
            case 16:
                LIZ$16(this, view, str);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view, str);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view, str);
                break;
            case 19:
                LIZ$19(this, view, str);
                break;
        }
    }

    public C1402200mao(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1402200mao c1402200mao, View view, String str) {
        LikeCell likeCell;
        C1356860lPg item;
        User user;
        C1356860lPg item2;
        List<String> list;
        int size;
        if (C297570BlT.LIZIZ() && (item = (likeCell = (LikeCell) c1402200mao.l0).getItem()) != null && (user = item.LL) != null && (item2 = likeCell.getItem()) != null && (list = item2.LLILZLL) != null && (size = list.size()) >= 1 && ((View) likeCell.LLIZLLLIL.getValue()).getVisibility() == 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "like_list");
            c2344009Gk.LIZJ(size, "unread_num");
            c2344009Gk.LJIIIIZZ("to_user_id", user.getUid());
            c2344009Gk.LJIIIIZZ("follow_status", C735370Ssx.LJIJJLI(user));
            C20684815ws.LJIILLIIL("unread_post_show", c2344009Gk.LIZ);
        }
    }

    public static final void LIZ$1(C1402200mao c1402200mao, View view, String str) {
        VideoViewerCell videoViewerCell;
        C1356890lPj item;
        User user;
        C1356890lPj item2;
        List<String> list;
        int size;
        if (C297570BlT.LIZIZ() && (item = (videoViewerCell = (VideoViewerCell) c1402200mao.l0).getItem()) != null && (user = item.LL) != null && (item2 = videoViewerCell.getItem()) != null && (list = item2.LLILZIL) != null && (size = list.size()) >= 1 && videoViewerCell.T5().getVisibility() == 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "views_list");
            c2344009Gk.LIZJ(size, "unread_num");
            c2344009Gk.LJIIIIZZ("to_user_id", user.getUid());
            c2344009Gk.LJIIIIZZ("follow_status", C735370Ssx.LJIJJLI(user));
            C20684815ws.LJIILLIIL("unread_post_show", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$10(X.C1402200mao r5, android.view.View r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "5"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell r0 = (com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell) r0
            X.0lYA r0 = r0.L5()
            if (r0 == 0) goto L3a
            com.ss.android.ugc.aweme.sharer.model.SharePackage r4 = r0.LL
            r3 = 0
            if (r4 == 0) goto L3a
            android.os.Bundle r1 = r4.extras
            if (r1 == 0) goto L74
            java.lang.String r0 = "aid"
            java.lang.String r2 = r1.getString(r0)
        L21:
            android.os.Bundle r1 = r4.extras
            if (r1 == 0) goto L2b
            java.lang.String r0 = "event_type"
            java.lang.String r3 = r1.getString(r0)
        L2b:
            if (r2 == 0) goto L3a
            X.0lVU r0 = X.C1360460lVU.LIZIZ
            X.0lXG r0 = r0.LJJII()
            if (r3 != 0) goto L37
            java.lang.String r3 = ""
        L37:
            r0.LJ(r2, r3)
        L3a:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell r0 = (com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell) r0
            r0.getClass()
            java.util.Map<java.lang.String, X.0lbw> r0 = X.C1361760lXa.LIZ
            java.lang.String r5 = "click_to_im_show_duration"
            java.lang.Object r0 = r0.get(r5)
            X.0lbw r0 = (X.C1364460lbw) r0
            if (r0 == 0) goto L73
            long r3 = r0.LIZIZ
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L73
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.util.Map<java.lang.String, X.0lbw> r0 = X.C1361760lXa.LIZ
            java.lang.Object r0 = r0.get(r5)
            X.0lbw r0 = (X.C1364460lbw) r0
            if (r0 == 0) goto L65
            r0.LIZIZ = r2
        L65:
            java.util.Map<java.lang.String, X.0lbw> r1 = X.C1361760lXa.LIZ
            java.lang.String r0 = "im_ui_load_duration"
            java.lang.Object r0 = r1.get(r0)
            X.0lbw r0 = (X.C1364460lbw) r0
            if (r0 == 0) goto L73
            r0.LIZIZ = r2
        L73:
            return
        L74:
            r2 = r3
            if (r4 == 0) goto L2b
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402200mao.LIZ$10(X.0mao, android.view.View, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$11(C1402200mao c1402200mao, View view, String str) {
        String str2;
        String aid;
        int iLIZLLL;
        String str3;
        String uid;
        String str4;
        C1357950lRR c1357950lRR;
        RepostReplyStruct repostReplyStruct;
        UpvoteStruct upvoteStruct;
        C1358240lRu c1358240lRu;
        User user;
        C1358240lRu c1358240lRu2;
        C1358240lRu c1358240lRu3;
        User user2;
        BaseRepostCell baseRepostCell = (BaseRepostCell) c1402200mao.l0;
        baseRepostCell.getClass();
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        VideoItemParams videoItemParams = baseRepostCell.V5().LLILLJJLI;
        if (videoItemParams == null || (str2 = videoItemParams.mEventType) == null) {
            str2 = "";
        }
        String strAQ2 = baseRepostCell.V5().AQ2();
        String str5 = baseRepostCell.V5().LLJ;
        Aweme aweme = baseRepostCell.V5().LL;
        String str6 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C1358220lRs c1358220lRs = (C1358220lRs) baseRepostCell.getItem();
        if (c1358220lRs != null && (c1358240lRu3 = c1358220lRs.LLILLL) != null && (user2 = c1358240lRu3.LIZ) != null) {
            iLIZLLL = C1358170lRn.LIZLLL(user2);
        } else {
            iLIZLLL = 0;
        }
        C1358000lRW c1358000lRW = BaseRepostCell.LLJI;
        C1358220lRs c1358220lRs2 = (C1358220lRs) baseRepostCell.getItem();
        c1358000lRW.getClass();
        String strLIZ = C1358000lRW.LIZ(c1358220lRs2);
        C1358220lRs c1358220lRs3 = (C1358220lRs) baseRepostCell.getItem();
        if (c1358220lRs3 != null && (c1358240lRu2 = c1358220lRs3.LLILLL) != null) {
            str3 = c1358240lRu2.LJ;
        } else {
            str3 = null;
        }
        C1358220lRs c1358220lRs4 = (C1358220lRs) baseRepostCell.getItem();
        if (c1358220lRs4 != null && (c1358240lRu = c1358220lRs4.LLILLL) != null && (user = c1358240lRu.LIZ) != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        C1358220lRs c1358220lRs5 = (C1358220lRs) baseRepostCell.getItem();
        if (c1358220lRs5 != null && (upvoteStruct = c1358220lRs5.LLILLJJLI) != null) {
            str4 = upvoteStruct.upvoteId;
        } else {
            str4 = null;
        }
        T item = baseRepostCell.getItem();
        if ((item instanceof C1357950lRR) && (c1357950lRR = (C1357950lRR) item) != null && (repostReplyStruct = c1357950lRR.LLILZLL) != null) {
            str6 = repostReplyStruct.replyId;
        }
        c1358550lSP.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", strAQ2);
        C1358170lRn.LIZ(c2344009Gk, "aggregate_notice_type", str5);
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LJIIIIZZ("author_uid", uid);
        c2344009Gk.LIZJ(iLIZLLL, "follow_status");
        c2344009Gk.LJIIIIZZ("repost_type", strLIZ);
        c2344009Gk.LJIIIIZZ("content_type", C1358170lRn.LJFF(str3));
        c2344009Gk.LJIIIIZZ("repost_id", str4);
        C1358170lRn.LIZ(c2344009Gk, "reply_id", str6);
        C20684815ws.LJIILLIIL("ttsocial_repost_panel_repost_view", c2344009Gk.LIZ);
    }

    public static final void LIZ$12(C1402200mao c1402200mao, View view, String str) {
        RepostViewMoreCell repostViewMoreCell;
        C1358360lS6 item;
        String str2;
        String aid;
        int iLIZLLL;
        String uid;
        String str3;
        if (((RepostViewMoreCell) c1402200mao.l0).itemView.isAttachedToWindow() && (item = (repostViewMoreCell = (RepostViewMoreCell) c1402200mao.l0).getItem()) != null) {
            int i = item.LLILZ;
            if (i == 0 || i == 1) {
                C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                VideoItemParams videoItemParams = repostViewMoreCell.I5().LLILLJJLI;
                if (videoItemParams == null || (str2 = videoItemParams.mEventType) == null) {
                    str2 = "";
                }
                String strAQ2 = repostViewMoreCell.I5().AQ2();
                String str4 = repostViewMoreCell.I5().LLJ;
                Aweme aweme = repostViewMoreCell.I5().LL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                User user = item.LL.user;
                if (user != null) {
                    iLIZLLL = C1358170lRn.LIZLLL(user);
                } else {
                    iLIZLLL = 0;
                }
                User user2 = item.LL.user;
                if (user2 != null) {
                    uid = user2.getUid();
                } else {
                    uid = null;
                }
                boolean zLJ = C1359720lUI.LJ(item.LL);
                int i2 = (int) (item.LLILLL - ((long) item.LLILZIL));
                UpvoteStruct upvoteStruct = item.LL;
                if (upvoteStruct != null) {
                    str3 = upvoteStruct.upvoteId;
                } else {
                    str3 = null;
                }
                String str5 = repostViewMoreCell.I5().LLILZLL;
                c1358550lSP.getClass();
                C1358550lSP.LJJ(iLIZLLL, zLJ ? 1 : 0, "ttsocial_repost_panel_view_more_replies_show", str2, i2, strAQ2, str4, aid, uid, str3, str5);
            }
            int i3 = item.LLILZ;
            if (i3 == 1 || i3 == 2) {
                repostViewMoreCell.N5(item.LLILLJJLI);
            }
        }
    }

    public static final void LIZ$13(C1402200mao c1402200mao, View view, String str) {
        String str2;
        EnumC1342350l2H enumC1342350l2H = EnumC1342350l2H.SHOW;
        C1354970lMd c1354970lMd = (C1354970lMd) c1402200mao.l0;
        C1346290l8d c1346290l8d = c1354970lMd.LL;
        if (c1346290l8d != null) {
            str2 = c1346290l8d.LIZIZ;
        } else {
            str2 = null;
        }
        C1350920lG6.LJJZ(enumC1342350l2H, str2, c1354970lMd.LLILZ, c1354970lMd.LLILLJJLI, c1354970lMd.LLILLL, c1354970lMd.LLILZLL);
    }

    public static final void LIZ$14(C1402200mao c1402200mao, View view, String str) {
        InterfaceC1369790lkX interfaceC1369790lkX = ((C1369800lkY) c1402200mao.l0).LLILZ;
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LIZIZ(interfaceC1369790lkX);
        C1364460lbw c1364460lbw = C1361760lXa.LIZ.get("click_to_expose_duration");
        if (c1364460lbw != null && c1364460lbw.LIZIZ == 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1364460lbw c1364460lbw2 = C1361760lXa.LIZ.get("click_to_expose_duration");
            if (c1364460lbw2 != null) {
                c1364460lbw2.LIZIZ = jElapsedRealtime;
            }
            C1364460lbw c1364460lbw3 = C1361760lXa.LIZ.get("ui_load_duration");
            if (c1364460lbw3 != null) {
                c1364460lbw3.LIZIZ = jElapsedRealtime;
            }
        }
    }

    public static final void LIZ$15(C1402200mao c1402200mao, View view, String str) {
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LIZIZ(((C1369820lka) c1402200mao.l0).LLILLL);
        C1364460lbw c1364460lbw = C1361760lXa.LIZ.get("click_to_expose_duration");
        if (c1364460lbw != null && c1364460lbw.LIZIZ == 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1364460lbw c1364460lbw2 = C1361760lXa.LIZ.get("click_to_expose_duration");
            if (c1364460lbw2 != null) {
                c1364460lbw2.LIZIZ = jElapsedRealtime;
            }
            C1364460lbw c1364460lbw3 = C1361760lXa.LIZ.get("ui_load_duration");
            if (c1364460lbw3 != null) {
                c1364460lbw3.LIZIZ = jElapsedRealtime;
            }
        }
    }

    public static final void LIZ$16(C1402200mao c1402200mao, View view, String str) {
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LIZ(((C1370250llH) c1402200mao.l0).LLILZLL);
        InterfaceC1370310llN interfaceC1370310llN = ((C1370250llH) c1402200mao.l0).LLILZLL;
        if (interfaceC1370310llN != null) {
            interfaceC1370310llN.LJI();
        }
    }

    public static final void LIZ$17(C1402200mao c1402200mao, View view, String str) {
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LIZ((InterfaceC1370310llN) c1402200mao.l0);
        InterfaceC1370310llN interfaceC1370310llN = (InterfaceC1370310llN) c1402200mao.l0;
        if (interfaceC1370310llN != null) {
            interfaceC1370310llN.LJI();
        }
    }

    public static final void LIZ$18(C1402200mao c1402200mao, View view, String str) {
        String string;
        Bundle bundle;
        Bundle bundle2;
        if (Intrinsics.LJFF(str, "3")) {
            SharePackage sharePackage = ((C1363390laD) c1402200mao.l0).LL.LL;
            String string2 = null;
            if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
                string = bundle2.getString("aid");
            } else {
                string = null;
            }
            SharePackage sharePackage2 = ((C1363390laD) c1402200mao.l0).LL.LL;
            if (sharePackage2 != null && (bundle = sharePackage2.extras) != null) {
                string2 = bundle.getString("event_type");
            }
            if (string != null) {
                InterfaceC1361560lXG interfaceC1361560lXGLJJII = C1360460lVU.LIZIZ.LJJII();
                if (string2 == null) {
                    string2 = "";
                }
                interfaceC1361560lXGLJJII.LJ(string, string2);
            }
        }
        C1364460lbw c1364460lbw = C1361760lXa.LIZ.get("click_to_im_show_duration");
        if (c1364460lbw != null && c1364460lbw.LIZIZ == 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1364460lbw c1364460lbw2 = C1361760lXa.LIZ.get("click_to_im_show_duration");
            if (c1364460lbw2 != null) {
                c1364460lbw2.LIZIZ = jElapsedRealtime;
            }
            C1364460lbw c1364460lbw3 = C1361760lXa.LIZ.get("im_ui_load_duration");
            if (c1364460lbw3 != null) {
                c1364460lbw3.LIZIZ = jElapsedRealtime;
            }
        }
    }

    public static final void LIZ$19(C1402200mao c1402200mao, View view, String str) {
        String string;
        Bundle bundle;
        Bundle bundle2;
        if (Intrinsics.LJFF(str, "5")) {
            SharePackage sharePackage = ((C1363410laF) c1402200mao.l0).LL.LL;
            String string2 = null;
            if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
                string = bundle2.getString("aid");
            } else {
                string = null;
            }
            SharePackage sharePackage2 = ((C1363410laF) c1402200mao.l0).LL.LL;
            if (sharePackage2 != null && (bundle = sharePackage2.extras) != null) {
                string2 = bundle.getString("event_type");
            }
            if (string != null) {
                InterfaceC1361560lXG interfaceC1361560lXGLJJII = C1360460lVU.LIZIZ.LJJII();
                if (string2 == null) {
                    string2 = "";
                }
                interfaceC1361560lXGLJJII.LJI(string, string2);
            }
        }
        C1364460lbw c1364460lbw = C1361760lXa.LIZ.get("click_to_im_show_duration");
        if (c1364460lbw != null && c1364460lbw.LIZIZ == 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1364460lbw c1364460lbw2 = C1361760lXa.LIZ.get("click_to_im_show_duration");
            if (c1364460lbw2 != null) {
                c1364460lbw2.LIZIZ = jElapsedRealtime;
            }
            C1364460lbw c1364460lbw3 = C1361760lXa.LIZ.get("im_ui_load_duration");
            if (c1364460lbw3 != null) {
                c1364460lbw3.LIZIZ = jElapsedRealtime;
            }
        }
    }

    public static final void LIZ$2(C1402200mao c1402200mao, View view, String str) {
        Function0<Unit> function0 = ((C1361580lXI) c1402200mao.l0).LJFF;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ$3(C1402200mao c1402200mao, View view, String str) {
        if (Intrinsics.LJFF(str, String.valueOf(((RepostChannel) c1402200mao.l0).hashCode()))) {
            C1360460lVU.LIZIZ.LJJII().LJ(((RepostChannel) c1402200mao.l0).LL.getAid(), ((RepostChannel) c1402200mao.l0).LLILLL.getString("event_type", ""));
        }
    }

    public static final void LIZ$4(C1402200mao c1402200mao, View view, String str) {
        UpvoteStruct upvoteStruct;
        String str2;
        C1357250lQJ item = ((CommentRepostPanelCell) c1402200mao.l0).getItem();
        if (item != null && (upvoteStruct = item.LL) != null) {
            C1358550lSP c1358550lSP = C1358550lSP.LIZ;
            VideoItemParams videoItemParamsS5 = ((CommentRepostPanelCell) c1402200mao.l0).S5();
            String aid = null;
            if (videoItemParamsS5 != null) {
                str2 = videoItemParamsS5.mEventType;
            } else {
                str2 = null;
            }
            String str3 = upvoteStruct.carrierId;
            Aweme awemeR5 = ((CommentRepostPanelCell) c1402200mao.l0).R5();
            if (awemeR5 != null) {
                aid = awemeR5.getAid();
            }
            Boolean boolValueOf = Boolean.valueOf(C298420Bmq.LIZ());
            c1358550lSP.getClass();
            C1358550lSP.LJIIJ(str2, upvoteStruct, str3, aid, "comment", boolValueOf);
        }
    }

    public static final void LIZ$5(C1402200mao c1402200mao, View view, String str) {
        String uid;
        String str2;
        Aweme aweme;
        VideoItemParams videoItemParams;
        C1358780lSm item = ((CommentRepostViewMorePanelCell) c1402200mao.l0).getItem();
        if (item == null) {
            return;
        }
        User user = item.LL.user;
        String aid = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        UpvotePanelListViewModel upvotePanelListViewModel = ((CommentRepostViewMorePanelCell) c1402200mao.l0).LL;
        if (upvotePanelListViewModel != null && (videoItemParams = upvotePanelListViewModel.LLJI) != null) {
            str2 = videoItemParams.mEventType;
        } else {
            str2 = null;
        }
        UpvotePanelListViewModel upvotePanelListViewModel2 = ((CommentRepostViewMorePanelCell) c1402200mao.l0).LL;
        if (upvotePanelListViewModel2 != null && (aweme = upvotePanelListViewModel2.LLJIJIL) != null) {
            aid = aweme.getAid();
        }
        if (item.LLILZ != 2) {
            C1358550lSP.LIZ.getClass();
            C20684815ws.LJIJI("ttsocial_repost_panel_view_more_show", new Pair(str2, "enter_from"), new Pair("recommend_panel", "enter_method"), new Pair(aid, "group_id"), new Pair(uid, "reposter_uid"));
        }
        if (item.LLILZ != 0) {
            CommentRepostViewMorePanelCell commentRepostViewMorePanelCell = (CommentRepostViewMorePanelCell) c1402200mao.l0;
            if (!commentRepostViewMorePanelCell.LLIZ) {
                commentRepostViewMorePanelCell.LLIZ = true;
                C1358550lSP.LIZ.getClass();
                C1358550lSP.LJIILL(str2, aid, uid);
            }
        }
    }

    public static final void LIZ$6(C1402200mao c1402200mao, View view, String str) {
        UpvoteStruct upvoteStruct;
        String str2;
        String aid;
        String str3;
        UpvoteStruct upvoteStruct2;
        UpvoteStruct upvoteStruct3;
        User user;
        String name;
        SetSticker setSticker;
        String str4;
        VideoItemParams videoItemParams;
        User user2;
        InterfaceC898240ZLq interfaceC898240ZLqInvoke;
        C1260960iv0 c1260960iv0;
        String str5;
        String str6;
        String aid2;
        VideoItemParams videoItemParams2;
        UpvoteStruct upvoteStruct4;
        User user3;
        String str7;
        VideoItemParams videoItemParams3;
        UpvotePanelListCell upvotePanelListCell = (UpvotePanelListCell) c1402200mao.l0;
        C1358130lRj item = upvotePanelListCell.getItem();
        UpvoteStruct upvoteStruct5 = null;
        if (item != null) {
            upvoteStruct = item.LL;
        } else {
            upvoteStruct = null;
        }
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        if (item != null && (videoItemParams3 = item.LLILLJJLI) != null) {
            str2 = videoItemParams3.mEventType;
        } else {
            str2 = null;
        }
        String strD6 = upvotePanelListCell.d6();
        Aweme awemeA6 = upvotePanelListCell.a6();
        if (awemeA6 != null) {
            aid = awemeA6.getAid();
        } else {
            aid = null;
        }
        String strI6 = upvotePanelListCell.i6();
        Boolean boolValueOf = Boolean.valueOf(C298420Bmq.LIZ());
        c1358550lSP.getClass();
        C1358550lSP.LJIIJ(str2, upvoteStruct, strD6, aid, strI6, boolValueOf);
        if (item != null && (upvoteStruct4 = item.LL) != null) {
            C1358770lSl.LIZ.getClass();
            if (C1358770lSl.LJ(upvoteStruct4) && (user3 = item.LL.user) != null) {
                EnumC1260930iux enumC1260930iux = EnumC1260930iux.SHOW;
                VideoItemParams videoItemParams4 = item.LLILLJJLI;
                if (videoItemParams4 != null) {
                    str7 = videoItemParams4.mEventType;
                } else {
                    str7 = null;
                }
                C1358550lSP.LIZJ(user3, enumC1260930iux, str7);
                C1262570ixb.LIZ("1", user3.getUid());
            }
        }
        C1358130lRj item2 = ((UpvotePanelListCell) c1402200mao.l0).getItem();
        if (item2 != null && (videoItemParams2 = item2.LLILLJJLI) != null) {
            str3 = videoItemParams2.mEventType;
        } else {
            str3 = null;
        }
        String strF6 = ((UpvotePanelListCell) c1402200mao.l0).f6();
        String strX5 = ((UpvotePanelListCell) c1402200mao.l0).X5();
        Aweme awemeA62 = ((UpvotePanelListCell) c1402200mao.l0).a6();
        C1358130lRj item3 = ((UpvotePanelListCell) c1402200mao.l0).getItem();
        if (item3 != null) {
            upvoteStruct2 = item3.LL;
        } else {
            upvoteStruct2 = null;
        }
        C1358550lSP.LJIILLIIL(str3, strF6, "show", strX5, awemeA62, upvoteStruct2);
        UpvotePanelListCell upvotePanelListCell2 = (UpvotePanelListCell) c1402200mao.l0;
        C1358130lRj item4 = upvotePanelListCell2.getItem();
        if (item4 != null && (user2 = item4.LL.user) != null && C1336205Ku.LIZ(false).getLightInteractService().LIZIZ(user2.getUid()) && user2.getFollowStatus() == C0SY7.FOLLOW_MUTUAL.getValue()) {
            RelationButton relationButton = (RelationButton) upvotePanelListCell2.LLJIJIL.getValue();
            String strLJJLIIIJJI = upvotePanelListCell2.e6().LJJLIIIJJI(upvotePanelListCell2.LLJJJ);
            String str8 = "";
            if (strLJJLIIIJJI == null) {
                strLJJLIIIJJI = "";
            }
            String str9 = upvotePanelListCell2.LLJJJ;
            String uid = user2.getUid();
            String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
            String strLJII = upvotePanelListCell2.e6().LJII(strLJJLIIIJJI);
            if (strLJII.length() == 0) {
                strLJII = "nudge";
            }
            Function0<InterfaceC898240ZLq> tracker = relationButton.getTracker();
            if (tracker != null) {
                interfaceC898240ZLqInvoke = tracker.invoke();
            } else {
                interfaceC898240ZLqInvoke = null;
            }
            if (interfaceC898240ZLqInvoke instanceof C1260960iv0) {
                c1260960iv0 = (C1260960iv0) interfaceC898240ZLqInvoke;
            } else {
                c1260960iv0 = null;
            }
            InterfaceC892560Yzu interfaceC892560YzuLJJIJIIJIL = upvotePanelListCell2.e6().LJJIJIIJIL(C0SY5.LIZIZ(relationButton.getContext()));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uid);
            sbLIZ.append(currentUserID);
            sbLIZ.append(str9);
            sbLIZ.append(strLJJLIIIJJI);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (c1260960iv0 != null) {
                str5 = c1260960iv0.LIZIZ;
                str6 = c1260960iv0.LIZLLL;
            } else {
                str5 = null;
                str6 = null;
            }
            interfaceC892560YzuLJJIJIIJIL.LIZIZ(strLIZIZ, str5, str6, null, null, null, strLJII);
            ILightInteractionPlatformService iLightInteractionPlatformServiceE6 = upvotePanelListCell2.e6();
            String str10 = item4.LL.upvoteId;
            String strLJJLIIIJJI2 = upvotePanelListCell2.e6().LJJLIIIJJI(upvotePanelListCell2.LLJJJ);
            if (strLJJLIIIJJI2 == null) {
                strLJJLIIIJJI2 = "";
            }
            String str11 = upvotePanelListCell2.LLJJJ;
            String uid2 = user2.getUid();
            if (uid2 == null) {
                uid2 = "";
            }
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            if (!iLightInteractionPlatformServiceE6.LJJJJLI(str10, strLJJLIIIJJI2, str11, uid2, curUserId)) {
                IIMNudgeAndStreakService imNudgeAndStreakService = C1336205Ku.LIZ(false).getImNudgeAndStreakService();
                EnumC896030ZDd enumC896030ZDd = EnumC896030ZDd.RECOMMEND_PANEL;
                String uid3 = user2.getUid();
                if (uid3 == null) {
                    uid3 = "";
                }
                Aweme awemeA63 = upvotePanelListCell2.a6();
                if (awemeA63 != null && (aid2 = awemeA63.getAid()) != null) {
                    str8 = aid2;
                }
                imNudgeAndStreakService.LJJIFFI(enumC896030ZDd, uid3, str8);
            }
        }
        UpvotePanelListCell upvotePanelListCell3 = (UpvotePanelListCell) c1402200mao.l0;
        C1358130lRj item5 = upvotePanelListCell3.getItem();
        if (item5 != null && (upvoteStruct3 = item5.LL) != null && (user = upvoteStruct3.user) != null && user.getFollowStatus() == 2) {
            C455830Hu9.LIZ.getClass();
            C455870HuD c455870HuD = (C455870HuD) C455830Hu9.LJ.getValue();
            if (C424430Gkb.LIZ()) {
                name = (String) C13LP.LJJJLL(upvotePanelListCell3.W5());
            } else if (c455870HuD != null && (setSticker = c455870HuD.LIZ) != null) {
                name = setSticker.getName();
            } else {
                name = null;
            }
            C1358130lRj item6 = upvotePanelListCell3.getItem();
            if (item6 != null && (videoItemParams = item6.LLILLJJLI) != null) {
                str4 = videoItemParams.mEventType;
            } else {
                str4 = null;
            }
            String strF62 = upvotePanelListCell3.f6();
            Aweme awemeA64 = upvotePanelListCell3.a6();
            C1358130lRj item7 = upvotePanelListCell3.getItem();
            if (item7 != null) {
                upvoteStruct5 = item7.LL;
            }
            C1358550lSP.LJIIJJI(str4, strF62, "show", awemeA64, name, upvoteStruct5);
        }
    }

    public static final void LIZ$7(C1402200mao c1402200mao, View view, String str) {
        InterfaceC1398730mVD interfaceC1398730mVD;
        if (((C1609500rzA) ((CommentCell) c1402200mao.l0).LLILZIL.getValue()).getMode() != EnumC1605470rsf.NONE && (interfaceC1398730mVD = (InterfaceC1398730mVD) ((CommentCell) c1402200mao.l0).LLJJIJIIJIL.getValue()) != null) {
            interfaceC1398730mVD.LJIIIIZZ(((C1609500rzA) ((CommentCell) c1402200mao.l0).LLILZIL.getValue()).getMode());
        }
    }

    public static final void LIZ$8(C1402200mao c1402200mao, View view, String str) {
        InterfaceC1398730mVD interfaceC1398730mVD;
        if (((C1609500rzA) ((com.ss.android.ugc.now.interaction.assem.LikeCell) c1402200mao.l0).LLILZ.getValue()).getMode() != EnumC1605470rsf.NONE && (interfaceC1398730mVD = (InterfaceC1398730mVD) ((com.ss.android.ugc.now.interaction.assem.LikeCell) c1402200mao.l0).LLIZ.getValue()) != null) {
            interfaceC1398730mVD.LJIIIIZZ(((C1609500rzA) ((com.ss.android.ugc.now.interaction.assem.LikeCell) c1402200mao.l0).LLILZ.getValue()).getMode());
        }
    }

    public static final void LIZ$9(C1402200mao c1402200mao, View view, String str) {
        String nickname;
        ProfileViewerInfo profileViewerInfo;
        User user;
        ProfileViewerInfo profileViewerInfo2;
        User user2;
        ProfileViewerCell profileViewerCell;
        C1386850mC3 item;
        ProfileViewerInfo profileViewerInfo3;
        User user3;
        C1386850mC3 item2;
        List<String> list;
        int size;
        TuxTextView tuxTextViewT5;
        C1386850mC3 item3;
        ProfileViewerInfo profileViewerInfo4;
        String uid;
        ProfileViewerInfo profileViewerInfo5;
        User user4;
        String uid2;
        ProfileViewerInfo profileViewerInfo6;
        User user5;
        ProfileViewerInfo profileViewerInfo7;
        User user6;
        int size2;
        C1386850mC3 item4;
        List<String> list2;
        ((ProfileViewerCell) c1402200mao.l0).W5(EnumC1260930iux.SHOW);
        ProfileViewerCell profileViewerCell2 = (ProfileViewerCell) c1402200mao.l0;
        C1386850mC3 item5 = profileViewerCell2.getItem();
        String uid3 = null;
        if (item5 != null && (profileViewerInfo7 = item5.LL) != null && (user6 = profileViewerInfo7.user) != null) {
            TuxTextView tuxTextViewT52 = profileViewerCell2.T5();
            if (tuxTextViewT52 != null && tuxTextViewT52.getVisibility() == 0 && (item4 = profileViewerCell2.getItem()) != null && (list2 = item4.LLILLJJLI) != null) {
                size2 = list2.size();
            } else {
                size2 = 0;
            }
            C1386870mC5.LIZ.getClass();
            String str2 = "";
            if (C1386870mC5.LIZ()) {
                C1253930ijf c1253930ijf = C1253930ijf.LIZ;
                String str3 = profileViewerCell2.U5().LLJILJILJ;
                if (str3 != null) {
                    str2 = str3;
                }
                String uid4 = user6.getUid();
                String strLJIJJLI = C735370Ssx.LJIJJLI(user6);
                String strValueOf = String.valueOf(profileViewerCell2.LLJILJIL.LIZIZ.getValue());
                c1253930ijf.getClass();
                C1253930ijf.LJIILL(size2, str2, uid4, strLJIJJLI, strValueOf);
            } else {
                C1253930ijf c1253930ijf2 = C1253930ijf.LIZ;
                String str4 = profileViewerCell2.U5().LLJILJILJ;
                if (str4 != null) {
                    str2 = str4;
                }
                String uid5 = user6.getUid();
                String strLJIJJLI2 = C735370Ssx.LJIJJLI(user6);
                c1253930ijf2.getClass();
                C1253930ijf.LJIILL(size2, str2, uid5, strLJIJJLI2, null);
            }
        }
        C1386870mC5.LIZ.getClass();
        if (C1386870mC5.LIZ()) {
            ProfileViewerCell profileViewerCell3 = (ProfileViewerCell) c1402200mao.l0;
            profileViewerCell3.getClass();
            C0ZE7 c0ze7 = new C0ZE7(profileViewerCell3.getCurrentLifecycleOwner());
            c0ze7.LIZIZ(EnumC1910440zoY.PROFILE_VISITOR_LIST);
            c0ze7.LJII = Boolean.valueOf(profileViewerCell3.LLJIJIL);
            C1386850mC3 item6 = profileViewerCell3.getItem();
            if (item6 != null && (profileViewerInfo6 = item6.LL) != null && (user5 = profileViewerInfo6.user) != null) {
                uid2 = user5.getUid();
            } else {
                uid2 = null;
            }
            c0ze7.LIZJ = uid2;
            C897490ZIt.LIZLLL(c0ze7);
        }
        if (((ProfileViewerCell) c1402200mao.l0).a6()) {
            ((ProfileViewerCell) c1402200mao.l0).c6();
        }
        if (InnerPushDedupExp.LJ && (item3 = ((ProfileViewerCell) c1402200mao.l0).getItem()) != null && (profileViewerInfo4 = item3.LL) != null) {
            long j = profileViewerInfo4.lastViewTime;
            ProfileViewerCell profileViewerCell4 = (ProfileViewerCell) c1402200mao.l0;
            C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
            C1386850mC3 item7 = profileViewerCell4.getItem();
            if (item7 != null && (profileViewerInfo5 = item7.LL) != null && (user4 = profileViewerInfo5.user) != null) {
                uid = user4.getUid();
            } else {
                uid = null;
            }
            c1908480zlO.LIZIZ(new C1906330zhv("ProfileViewer", uid, j / ((long) 1000000), 2));
        }
        C1386890mC7 c1386890mC7 = C1386890mC7.LIZ;
        String str5 = ((ProfileViewerCell) c1402200mao.l0).U5().LLJILJILJ;
        c1386890mC7.getClass();
        C421540Gfw.LIZ(new AwS105S1000000_21(str5, 12));
        if (C297570BlT.LIZLLL() && (item = (profileViewerCell = (ProfileViewerCell) c1402200mao.l0).getItem()) != null && (profileViewerInfo3 = item.LL) != null && (user3 = profileViewerInfo3.user) != null && (item2 = profileViewerCell.getItem()) != null && (list = item2.LLILLJJLI) != null && (size = list.size()) >= 1 && (tuxTextViewT5 = profileViewerCell.T5()) != null && tuxTextViewT5.getVisibility() == 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "profile_visitor_list");
            c2344009Gk.LIZJ(size, "unread_num");
            c2344009Gk.LJIIIIZZ("to_user_id", user3.getUid());
            c2344009Gk.LJIIIIZZ("follow_status", C735370Ssx.LJIJJLI(user3));
            C20684815ws.LJIILLIIL("unread_post_show", c2344009Gk.LIZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("the expose cell's is ");
        C1386850mC3 item8 = ((ProfileViewerCell) c1402200mao.l0).getItem();
        if (item8 != null && (profileViewerInfo2 = item8.LL) != null && (user2 = profileViewerInfo2.user) != null) {
            nickname = user2.getNickname();
        } else {
            nickname = null;
        }
        sbLIZ.append(nickname);
        sbLIZ.append(" : ");
        C1386850mC3 item9 = ((ProfileViewerCell) c1402200mao.l0).getItem();
        if (item9 != null && (profileViewerInfo = item9.LL) != null && (user = profileViewerInfo.user) != null) {
            uid3 = user.getUid();
        }
        sbLIZ.append(uid3);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
