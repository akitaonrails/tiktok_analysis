package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.widget.aisummary.LivePreviewAiSummaryNewWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.PreviewGameRewardsWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.guessing.PreviewGameGuessingWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.hotcomment.PreviewHotCommentWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.realtimecomment.freq.CommentDisplayInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.PreviewCardCommentBox;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: renamed from: X.0TKi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745020TKi {
    public static boolean LIZ(C1ACA c1aca, EnumC745000TKg enumC745000TKg, int i) {
        boolean z;
        boolean z2;
        LiveRoomStruct liveRoomStruct;
        PreviewCardCommentBox previewCardCommentBox;
        String str;
        boolean z3;
        boolean z4;
        Long lValueOf;
        Object c098200Yq;
        boolean zAfter;
        InterfaceC500940Jki interfaceC500940JkiUser;
        LiveRoomStruct liveRoomStruct2;
        Object obj = null;
        if ((i & 2) != 0) {
            enumC745000TKg = null;
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!C745010TKh.LIZLLL(c1aca) || c1aca == null || (liveRoomStruct = c1aca.LIZJ) == null || (previewCardCommentBox = liveRoomStruct.previewCardCommentBox) == null || (str = previewCardCommentBox.content) == null || str.length() == 0 || (c1aca != null && (((liveRoomStruct2 = c1aca.LIZJ) != null && liveRoomStruct2.hasCommerceGoods) || C1ABT.LJIILIIL(c1aca)))) {
            return false;
        }
        PreviewGameGuessingWidget.LLJJIJIL.getClass();
        if (!C2175451ABz.LIZ(c1aca)) {
            PreviewGameRewardsWidget.LLJJJIL.getClass();
            if (!C2175421ABw.LIZ(c1aca)) {
                PreviewHotCommentWidget.LLJJLIIIJLLLLLLLZ.getClass();
                if (!C1AC4.LIZ(c1aca)) {
                    if (z && c1aca != null && c1aca.LJIILIIL) {
                        return false;
                    }
                    int i2 = LivePreviewAiSummaryNewWidget.LLLF;
                    if (C745110TKr.LIZ(c1aca) == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (c1aca.LJJZZIII == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i3 = C745010TKh.LIZIZ().style;
                    if (i3 != 1) {
                        if (i3 == 2 && !z3 && !z4) {
                            if (enumC745000TKg == EnumC745000TKg.DISPLAY) {
                                return true;
                            }
                            if (C745010TKh.LIZIZ().style == 2) {
                                UserService userService = UserService.getInstance();
                                if (userService != null && (interfaceC500940JkiUser = userService.user()) != null) {
                                    lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
                                } else {
                                    lValueOf = null;
                                }
                                String strValueOf = String.valueOf(lValueOf);
                                if (strValueOf.length() != 0) {
                                    CommentDisplayInfo commentDisplayInfoLIZIZ = C744980TKe.LIZIZ(strValueOf);
                                    if (commentDisplayInfoLIZIZ == null) {
                                        return true;
                                    }
                                    C744980TKe.LIZIZ = commentDisplayInfoLIZIZ;
                                    String strLIZ = C744980TKe.LIZ();
                                    if (strLIZ != null && strLIZ.length() != 0) {
                                        String str2 = commentDisplayInfoLIZIZ.controlDeadline;
                                        if (!TextUtils.equals(commentDisplayInfoLIZIZ.forbidDisplayDate, strLIZ)) {
                                            if (!C123100dR.LIZ(str2)) {
                                                return true;
                                            }
                                            try {
                                                SimpleDateFormat simpleDateFormat = C744980TKe.LIZ;
                                                Date date = simpleDateFormat.parse(strLIZ);
                                                if (date != null) {
                                                    zAfter = date.after(simpleDateFormat.parse(str2));
                                                } else {
                                                    zAfter = false;
                                                }
                                                c098200Yq = Boolean.valueOf(zAfter);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                c098200Yq = new C098200Yq(th);
                                                C189200o6.m2constructorimpl(c098200Yq);
                                            }
                                            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                                                obj = c098200Yq;
                                            }
                                            Boolean bool = (Boolean) obj;
                                            if (bool != null && bool.booleanValue()) {
                                                return true;
                                            }
                                            commentDisplayInfoLIZIZ.forbidDisplayDate = strLIZ;
                                        }
                                    } else {
                                        C20441214yg.LJ("CommentDisplayFreqController", "canDisplayComment, getDateString exception");
                                    }
                                }
                            }
                        }
                        return false;
                    }
                    if (!z2) {
                        return true;
                    }
                    return z3;
                }
            }
        }
        return false;
    }
}
