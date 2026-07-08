package X;

import Y.ACallableS426S0100000_21;
import Y.AObjectS364S0100000_21;
import Y.ARunnableS90S0200000_21;
import Y.ARunnableS93S0000000_16;
import Y.AfS12S2200000_21;
import Y.AfS190S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.comment.model.CommentSurprise;
import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.comment.quickmention.QuickMentionVM;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.experiment.CommentWithStickerExp;
import com.ss.android.ugc.aweme.feed.bottom.BottomBarViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ICreativeAppDiffService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0lCZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348730lCZ implements InterfaceC1349150lDF, InterfaceC1349200lDK, InterfaceC1345970l87, InterfaceC1351180lGW, InterfaceC1349100lDA, InterfaceC21501419Cq, InterfaceC487330J9f {
    public C1353500lKG LLILLL;
    public final Fragment LLILZ;
    public final InterfaceC1348780lCe LLILZIL;
    public Map<String, C1345870l7x> LLIZ;
    public String LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public Emoji LLJJIII;
    public List<CommentImageModel> LLJJIJI;
    public CommentStickerStruct LLJJIJIIJIL;
    public ViewOnTouchListenerC1348820lCi LLJJJ;
    public ViewOnClickListenerC1348950lCv LLJJJIL;
    public View LLJJJJ;
    public View LLJJJJJIL;
    public TextView LLJJJJLIIL;
    public final GiftViewModel LLJLILLLLZIIL;
    public final BottomBarViewModel LLJLL;
    public View LLJLLIL;
    public boolean LLJZ;
    public final C1348410lC3 LLLII;
    public CharSequence LL = "";
    public String LLILLJJLI = "";
    public final HashSet<User> LLILZLL = new HashSet<>();
    public String LLJIJIL = "";
    public boolean LLJILJIL = true;
    public boolean LLJILJILJ = false;
    public final boolean LLJILLL = true;
    public String LLJJ = "";
    public EnumC048800Fq LLJJI = EnumC048800Fq.DEFAULT;
    public boolean LLJJIJIL = false;
    public boolean LLJJL = false;
    public String LLJJLIIIJLLLLLLLZ = "";
    public boolean LLJL = false;
    public final List<EditText> LLJLIL = new CopyOnWriteArrayList();
    public final IVideoGiftService LLJLLL = VideoGiftService.LJI();
    public final List<InterfaceC1349030lD3> LLJZIJLIL = new CopyOnWriteArrayList();
    public boolean LLL = false;
    public boolean LLLF = false;
    public int LLLFF = -1;
    public int LLLFFI = -1;
    public int LLLFZ = -1;
    public boolean LLLI = false;
    public int LLLIIII = 0;
    public boolean LLLIIIIL = false;
    public boolean LLLIIIL = false;
    public String LLLIIL = "";

    @Override // X.InterfaceC1351180lGW
    public final void LIZ() {
        this.LLLIIL = "emoji";
    }

    @Override // X.InterfaceC1351180lGW
    public final void LIZLLL() {
        List<CommentImageModel> list = this.LLJJIJI;
        if (list != null && !list.isEmpty()) {
            if (this.LLLIIIL) {
                return;
            }
            this.LLLIIIL = true;
            String str = C20642515q3.LJI(2131829121) + " ";
            C1353500lKG c1353500lKG = this.LLILLL;
            if (c1353500lKG == null || C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)) == null) {
                return;
            }
            C2204961BRm.LLLZZIL(this.LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)).insert(0, str);
            return;
        }
        if (this.LLJJIJIIJIL != null) {
            if (this.LLLIIIL) {
                return;
            }
            this.LLLIIIL = true;
            String str2 = C20642515q3.LJI(2131829123) + " ";
            C1353500lKG c1353500lKG2 = this.LLILLL;
            if (c1353500lKG2 == null || C2204961BRm.LLLZZIL(c1353500lKG2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)) == null) {
                return;
            }
            C2204961BRm.LLLZZIL(this.LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)).insert(0, str2);
            return;
        }
        if (this.LLLIIIL) {
            this.LLLIIIL = false;
            String str3 = C20642515q3.LJI(2131829121) + " ";
            String str4 = C20642515q3.LJI(2131829123) + " ";
            C1353500lKG c1353500lKG3 = this.LLILLL;
            if (c1353500lKG3 != null && C2204961BRm.LLLZZIL(c1353500lKG3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)) != null && C2204961BRm.LLLZZIL(this.LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)).toString().startsWith(str3)) {
                C2204961BRm.LLLZZIL(this.LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)).replace(0, str3.length(), "");
            }
            C1353500lKG c1353500lKG4 = this.LLILLL;
            if (c1353500lKG4 == null || C2204961BRm.LLLZZIL(c1353500lKG4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)) == null || !C2204961BRm.LLLZZIL(this.LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)).toString().startsWith(str4)) {
                return;
            }
            C2204961BRm.LLLZZIL(this.LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)).replace(0, str4.length(), "");
        }
    }

    @Override // X.InterfaceC1351180lGW
    public final boolean LJI() {
        C1350650lFf.LIZ.getClass();
        return (!C1350650lFf.LIZIZ() || this.LLJJIJI == null || this.LLLI) ? false : true;
    }

    public final boolean LJIIIZ() {
        Aweme commentInputAweme = this.LLILZIL.getCommentInputAweme();
        if (commentInputAweme != null && commentInputAweme.isCmtSwt()) {
            C844470XAv.LIZ.getClass();
            C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
            c1233040iBy.LIZIZ(2131824697);
            c1233040iBy.LIZLLL();
            return true;
        }
        Aweme commentInputAweme2 = this.LLILZIL.getCommentInputAweme();
        if (commentInputAweme2 != null && AwemeExtKt.isScheduleVideo(commentInputAweme2)) {
            return true;
        }
        Aweme commentInputAweme3 = this.LLILZIL.getCommentInputAweme();
        if (commentInputAweme3 != null && commentInputAweme3.getVideoControl() != null && commentInputAweme3.getVideoControl().timerStatus == 0) {
            Fragment fragment = this.LLILZ;
            if (fragment == null || fragment.getContext() == null) {
                C844470XAv.LIZ.getClass();
                C844470XAv.LIZ();
            }
            return true;
        }
        if (this.LLILZIL.checkCommentInputable()) {
            CommentService.LIZ.getClass();
            if (!C523420Kfs.LIZ().LJIILLIIL(this.LLILZIL.getCommentInputAweme()) && C523420Kfs.LIZ().LJJIJIIJIL(this.LLILZIL.getCommentInputAweme())) {
                C735280Sso c735280Sso = C735280Sso.LIZ;
                Aweme commentInputAweme4 = this.LLILZIL.getCommentInputAweme();
                c735280Sso.getClass();
                if (!C735280Sso.LJFF(commentInputAweme4) && !C10EU.LJIIIIZZ()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String LJIIJJI() {
        InterfaceC1348780lCe interfaceC1348780lCe = this.LLILZIL;
        return (interfaceC1348780lCe == null || interfaceC1348780lCe.getCommentInputAweme() == null) ? "" : this.LLILZIL.getCommentInputAweme().getAid();
    }

    public final String LJIIL() {
        InterfaceC1348780lCe interfaceC1348780lCe = this.LLILZIL;
        return (interfaceC1348780lCe == null || interfaceC1348780lCe.getCommentInputAweme() == null) ? "" : AwemeExtKt.getAuthorUid(this.LLILZIL.getCommentInputAweme());
    }

    public final Aweme LJIILIIL() {
        InterfaceC1348780lCe interfaceC1348780lCe = this.LLILZIL;
        if (interfaceC1348780lCe == null) {
            return null;
        }
        return interfaceC1348780lCe.getCommentInputAweme();
    }

    public final CommentVideoModel.Type LJIILJJIL() {
        CommentVideoModel.Type type = CommentVideoModel.Type.NONE;
        return !this.LLILZIL.isLandscapeMode() ? (!this.LLL || this.LLILZIL.getCommentInputReplyComment().getForbidVideoReply()) ? type : CommentVideoModel.Type.COMMENT : type;
    }

    public final String LJIIZILJ() {
        return this.LLILZIL.getEventType() == null ? "" : this.LLILZIL.getEventType();
    }

    public final String LJIJ() {
        InterfaceC1348780lCe interfaceC1348780lCe = this.LLILZIL;
        return interfaceC1348780lCe instanceof ViewOnTouchListenerC1351130lGR ? TextUtils.isEmpty(interfaceC1348780lCe.getEventType()) ? !TextUtils.isEmpty(((ViewOnTouchListenerC1351130lGR) this.LLILZIL).LLJI) ? ((ViewOnTouchListenerC1351130lGR) this.LLILZIL).LLJI : "" : this.LLILZIL.getEventType() : interfaceC1348780lCe.getEventType() != null ? this.LLILZIL.getEventType() : "";
    }

    public final String LJIJI() {
        return this.LLILZIL.getFromPage() == null ? "" : this.LLILZIL.getFromPage();
    }

    public final boolean LJJ() {
        Fragment fragment = this.LLILZ;
        return fragment != null && fragment.isAdded();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI() {
        /*
            r3 = this;
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r1 = r3.LLJJ
            java.lang.String r0 = "enter_from"
            r2.LJIIIIZZ(r0, r1)
            java.lang.String r1 = r3.LJIIJJI()
            java.lang.String r0 = "group_id"
            r2.LJIIIIZZ(r0, r1)
            java.lang.String r1 = r3.LJIIL()
            java.lang.String r0 = "author_id"
            r2.LJIIIIZZ(r0, r1)
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r1 = r0.getCurUserId()
            java.lang.String r0 = "user_id"
            r2.LJIIIIZZ(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LJIILIIL()
            int r1 = X.C1345170l6p.LIZ(r0)
            java.lang.String r0 = "is_follow"
            r2.LIZJ(r1, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LJIILIIL()
            if (r0 == 0) goto L62
            boolean r0 = r0.isLike()
            r1 = 1
            if (r0 != r1) goto L62
        L47:
            java.lang.String r0 = "is_like"
            r2.LIZJ(r1, r0)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "click_gift_icon"
            r2.LJIIIIZZ(r1, r0)
            java.lang.String r1 = "sub_position"
            java.lang.String r0 = "comment_panel_outer"
            r2.LJIIIIZZ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "show_gift_panel"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L62:
            r1 = 0
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1348730lCZ.LJJIFFI():void");
    }

    public final void LJJIIZI() {
        GiftViewModel giftViewModel = this.LLJLILLLLZIIL;
        if (giftViewModel == null || giftViewModel.wQ2().getValue() == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "keyboard_dialog");
        c2344009Gk.LJIIIIZZ("author_id", LJIIL());
        c2344009Gk.LJIIIIZZ("group_id", LJIIJJI());
        c2344009Gk.LJIIIIZZ("enter_from", LJIIZILJ());
        c2344009Gk.LJ(this.LLJLILLLLZIIL.vQ2().getValue(), "current_balance");
        C20684815ws.LJIILLIIL("video_gift_send_click", c2344009Gk.LIZ);
    }

    public final void LJJIJIIJI() {
        GiftStruct value;
        C1353500lKG c1353500lKG = this.LLILLL;
        if (c1353500lKG != null) {
            c1353500lKG.setText("");
            LJJIJL();
            this.LLILLL.setHint(this.LLIZLLLIL);
            View view = this.LLJJJJ;
            if (view != null) {
                C786410Ut5.T4(view, 1.0f);
            }
            LJJII(this.LLILLL);
        }
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        GiftViewModel giftViewModel = this.LLJLILLLLZIIL;
        if (giftViewModel != null) {
            MutableLiveData<GiftStruct> mutableLiveDataWQ2 = giftViewModel.wQ2();
            if (mutableLiveDataWQ2.getValue() != null && (value = this.LLJLILLLLZIIL.wQ2().getValue()) != null) {
                this.LLLFFI = value.diamondCount;
                Integer num = value.selectedIndex;
                if (num != null) {
                    this.LLLFZ = num.intValue();
                }
            }
            if (!C306510Bzt.LIZ()) {
                mutableLiveDataWQ2.setValue(null);
            }
            this.LLJLILLLLZIIL.LLJJ = false;
        }
        this.LLILZLL.clear();
    }

    @Override // X.InterfaceC1351180lGW
    public final boolean LIZJ() {
        return (!CommentWithStickerExp.LIZIZ() || this.LLJJIJIIJIL == null || this.LLLI) ? false : true;
    }

    public final int LJIJJ() {
        Aweme awemeLJIILIIL = LJIILIIL();
        if (awemeLJIILIIL != null) {
            AwemeExtKt.getAuthorUid(awemeLJIILIIL);
        }
        if (this.LLILZIL.getCommentInputViewType() == 4) {
            return 60;
        }
        return C1353700lKa.LIZIZ();
    }

    public final void LJIL() {
        DialogFragment dialogFragment;
        if (LJJ() && (dialogFragment = (DialogFragment) this.LLILZ.getChildFragmentManager().LJJJJZI("CommentInputManager")) != null) {
            try {
                dialogFragment.dismiss();
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJJI() {
        List<CommentImageModel> list;
        Aweme awemeLJIILIIL = LJIILIIL();
        C1353500lKG c1353500lKG = this.LLILLL;
        int i = 0;
        int i2 = ((c1353500lKG == null || TextUtils.isEmpty(C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)))) && ((list = this.LLJJIJI) == null || list.isEmpty()) && this.LLJJIJIIJIL == null) ? 0 : 1;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C735840Sti.LIZ.getClass();
        C735840Sti.LIZIZ(awemeLJIILIIL, c2344009Gk);
        if (awemeLJIILIIL != null && C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(awemeLJIILIIL))) {
            i = 1;
        }
        InterfaceC1348780lCe interfaceC1348780lCe = this.LLILZIL;
        if (interfaceC1348780lCe != null) {
            String sessionId = interfaceC1348780lCe.getSessionId();
            if (!TextUtils.isEmpty(sessionId)) {
                c2344009Gk.LJFF("session_id", sessionId);
            }
        }
        String strLJII = C454000HrC.LJII();
        if (!TextUtils.isEmpty(strLJII)) {
            c2344009Gk.LJFF("emoji_tab", strLJII);
        }
        c2344009Gk.LJIIIIZZ("position", "comment");
        c2344009Gk.LJIIIIZZ("enter_from", this.LLJJ);
        String authorUid = "";
        c2344009Gk.LJIIIIZZ("group_id", (awemeLJIILIIL == null || awemeLJIILIIL.getAid() == null) ? "" : awemeLJIILIIL.getAid());
        if (awemeLJIILIIL != null && AwemeExtKt.getAuthorUid(awemeLJIILIIL) != null) {
            authorUid = AwemeExtKt.getAuthorUid(awemeLJIILIIL);
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(awemeLJIILIIL.getAuthor()), "follow_status");
        c2344009Gk.LJIIIIZZ("input_box_status", !this.LLLIIIIL ? "normal" : "fullscreen");
        c2344009Gk.LIZJ(i2, "has_input");
        c2344009Gk.LIZJ(i, "is_video_author");
        C20684815ws.LJIILLIIL("click_emoji_entrance", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJL() {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1348730lCZ.LJJIJL():void");
    }

    @Override // X.InterfaceC1351180lGW
    public final String LJII() {
        return this.LLLIIL;
    }

    public static int LJIILLIIL(Aweme aweme) {
        if (aweme == null) {
            return 4;
        }
        if (!C306520Bzu.LIZ() && aweme.getAuthor() != null && aweme.getAuthor().isEnabledFilterAllComments() && !C735370Ssx.LJJIJLIJ(aweme)) {
            return 5;
        }
        if (AwemeExtKt.isScheduleVideo(aweme)) {
            return 0;
        }
        CommentService.LIZ.getClass();
        if (C523420Kfs.LIZ().LJIILLIIL(aweme)) {
            return 1;
        }
        if (!C523420Kfs.LIZ().LJJIJIIJIL(aweme)) {
            return 2;
        }
        return 3;
    }

    public static boolean LJJIZ(Aweme aweme) {
        if (aweme == null || AwemeExtKt.isProhibited(aweme) || aweme.getCommentSetting() == 3) {
            return true;
        }
        User author = aweme.getAuthor();
        if (author == null) {
            return false;
        }
        int commentSetting = author.getCommentSetting();
        int commentSetting2 = aweme.getCommentSetting();
        if (commentSetting == 3 || commentSetting2 == 3) {
            return true;
        }
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().LIZJ(author.getUid())) {
            if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser().getCommentSetting() == 3 || aweme.getCommentSetting() == 3) {
                return true;
            }
            return false;
        }
        if (commentSetting == 1) {
            C735280Sso.LIZ.getClass();
            if (!C735280Sso.LIZLLL(aweme)) {
                return true;
            }
        } else if (commentSetting == 2) {
            C735280Sso.LIZ.getClass();
            if (!C735280Sso.LIZIZ(aweme)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1345970l87
    public final void AB(Comment comment) {
        LJJIJ(comment.getFakeId());
        InterfaceC1348780lCe interfaceC1348780lCe = this.LLILZIL;
        if (interfaceC1348780lCe != null) {
            interfaceC1348780lCe.onCommentInputPublishOnlyGiftSuccess(comment);
            LJIJJLI(comment);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0lCv] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0lCi] */
    @Override // X.InterfaceC1351180lGW
    public final void LJFF(C1348830lCj c1348830lCj) {
        C1353500lKG c1353500lKG;
        int i;
        this.LLJILJIL = c1348830lCj.LJIIIIZZ;
        final C1353500lKG c1353500lKG2 = c1348830lCj.LIZIZ;
        View view = c1348830lCj.LIZJ;
        View view2 = c1348830lCj.LIZLLL;
        View view3 = c1348830lCj.LJ;
        TextView textView = c1348830lCj.LJFF;
        final String str = c1348830lCj.LJI;
        final String str2 = c1348830lCj.LJII;
        this.LLJJI = c1348830lCj.LJIIIZ;
        this.LLLIIII = c1348830lCj.LJIIJ;
        this.LLJJ = str2;
        boolean z = false;
        this.LLLF = false;
        if (LJIILIIL() != null) {
            GiftViewModel giftViewModel = this.LLJLILLLLZIIL;
            String str3 = this.LLJJ;
            String groupId = LJIILIIL().getGroupId();
            String strLJIIL = LJIIL();
            String requestId = LJIILIIL().getRequestId();
            giftViewModel.LLILZLL = str3;
            giftViewModel.LLIZ = groupId;
            giftViewModel.LLIZLLLIL = strLJIIL;
            giftViewModel.LLJ = requestId;
        }
        this.LLILLL = c1353500lKG2;
        LJIIIIZZ(c1353500lKG2);
        this.LLJJJJLIIL = textView;
        if (textView != null) {
            if (this.LLJJL) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLIL(textView, i);
        }
        if (this.LLILZ != null && (c1353500lKG = this.LLILLL) != null) {
            this.LLJJJIL = new View.OnClickListener() { // from class: X.0lCv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    C1348730lCZ c1348730lCZ = this.LL;
                    String str4 = str2;
                    String str5 = str;
                    c1348730lCZ.LLLFF = 1;
                    c1348730lCZ.LJJIJIIJIL(view4, str4, str5);
                }
            };
            this.LLJJJ = new View.OnTouchListener() { // from class: X.0lCi
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view4, MotionEvent motionEvent) {
                    C1348730lCZ c1348730lCZ = this.LL;
                    String str4 = str2;
                    String str5 = str;
                    if (c1348730lCZ.LLILLL.isFocused() || c1348730lCZ.LLILLL.isFocusable() || c1348730lCZ.LLILLL.isFocusableInTouchMode()) {
                        c1348730lCZ.LLILLL.setFocusable(false);
                        c1348730lCZ.LLILLL.setFocusableInTouchMode(false);
                    }
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action != 1) {
                            if (action != 2) {
                                return false;
                            }
                            return true;
                        }
                        view4.performClick();
                        c1348730lCZ.LJJIJIIJIL(view4, str4, str5);
                        return true;
                    }
                    return true;
                }
            };
            c1353500lKG.setFocusable(false);
            this.LLILLL.setFocusableInTouchMode(false);
            this.LLILLL.setInputType(0);
            C786410Ut5.L9(this.LLILLL, this.LLJJJIL);
            this.LLILLL.setOnTouchListener(this.LLJJJ);
            if (view != null) {
                this.LLJJJJ = view;
                if (C10EU.LJIIIIZZ() || this.LLJJL) {
                    LJJIL(this.LLJJJJ, false);
                }
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0lCc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        C1348730lCZ c1348730lCZ = this.LL;
                        String str4 = str;
                        String str5 = str2;
                        C1353500lKG c1353500lKG3 = c1353500lKG2;
                        if (c1348730lCZ.LJJ()) {
                            C1353500lKG c1353500lKG4 = c1348730lCZ.LLILLL;
                            if (c1353500lKG4 != null && c1353500lKG4.getMentionExtraStructList() != null && c1348730lCZ.LLILLL.getMentionExtraStructList().size() >= 5 && c1348730lCZ.LLILZ != null) {
                                C1389890mGx c1389890mGx = new C1389890mGx(c1348730lCZ.LLILZ);
                                c1389890mGx.LJIIIZ(2131837103);
                                c1389890mGx.LJIIJJI();
                                return;
                            }
                            if (C20612915lH.LIZIZ.LJIIIIZZ().LJFF(new AObjectS364S0100000_21(c1348730lCZ, 0)) || c1348730lCZ.LJJJI(str4, str5, "click_comment_at") || c1348730lCZ.LLILZIL.getCommentInputAweme() == null) {
                                return;
                            }
                            C735280Sso c735280Sso = C735280Sso.LIZ;
                            Aweme commentInputAweme = c1348730lCZ.LLILZIL.getCommentInputAweme();
                            c735280Sso.getClass();
                            if (C735280Sso.LJFF(commentInputAweme)) {
                                return;
                            }
                            c1348730lCZ.LLJI = true;
                            CharSequence hint = c1353500lKG3.getHint();
                            if (!c1348730lCZ.LJJ()) {
                                return;
                            }
                            Bundle bundleLJIILL = c1348730lCZ.LJIILL(hint);
                            bundleLJIILL.putBoolean("clickAt", true);
                            KeyboardDialogFragment keyboardDialogFragmentOR = KeyboardDialogFragment.OR(c1348730lCZ.LLILZIL.getCommentInputViewType(), c1348730lCZ.LJIIZILJ());
                            Bundle arguments = keyboardDialogFragmentOR.getArguments();
                            if (arguments != null) {
                                C786410Ut5.LJJIIJZLJL(arguments, bundleLJIILL);
                            }
                            c1348730lCZ.LJIIJ(keyboardDialogFragmentOR);
                        }
                    }
                }, this.LLJJJJ);
            }
            if (view2 != null) {
                this.LLJJJJJIL = view2;
                if (C10EU.LJIIIIZZ() || this.LLJJL) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                new C626130Oh9(view2).LJLIL(1L, TimeUnit.SECONDS).LJJLJLI(new AfS12S2200000_21(this, str, c1353500lKG2, str2, 1));
            }
            Aweme awemeLJIILIIL = LJIILIIL();
            if (view3 != null && awemeLJIILIIL != null) {
                this.LLJLLIL = view3;
                if (this.LLJLLL.LIZ(awemeLJIILIIL) && C1350950lG9.LIZIZ.LIZLLL()) {
                    z = true;
                }
                LJJIL(view3, z);
                new C626130Oh9(this.LLJLLIL).LJLIL(1L, TimeUnit.SECONDS).LJJLJLI(new AfS190S0100000_21(this, 27));
            }
            C1341780l1M c1341780l1M = C1341780l1M.LIZ;
            View view4 = this.LLJJJJ;
            EnumC1341650l19 enumC1341650l19 = EnumC1341650l19.ALPHA_BUTTON;
            c1341780l1M.LIZ(view4, enumC1341650l19);
            c1341780l1M.LIZ(this.LLJJJJJIL, enumC1341650l19);
            c1341780l1M.LIZ(this.LLJLLIL, enumC1341650l19);
            LJJIJL();
        }
    }

    public final void LJIIIIZZ(C1353500lKG c1353500lKG) {
        if (c1353500lKG != null && !((CopyOnWriteArrayList) this.LLJLIL).contains(c1353500lKG)) {
            c1353500lKG.LLJJI.add(new InterfaceC1349190lDJ() { // from class: X.0lCx
                @Override // X.InterfaceC1349190lDJ
                public final void LIZ() {
                    this.LIZ.LLJILJILJ = true;
                }
            });
            c1353500lKG.addTextChangedListener(new C1402120mag(this, 18));
            C1353500lKG c1353500lKG2 = this.LLILLL;
            if (c1353500lKG2 != null) {
                c1353500lKG.setText(C2204961BRm.LLLZZIL(c1353500lKG2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)));
            }
            ((CopyOnWriteArrayList) this.LLJLIL).add(c1353500lKG);
        }
    }

    public final void LJIIJ(KeyboardDialogFragment keyboardDialogFragment) {
        QuickMentionVM quickMentionVM;
        Bundle arguments = keyboardDialogFragment.getArguments();
        if (arguments != null) {
            arguments.putInt("argIsInvokedFromFakeEditText", this.LLLFF);
            this.LLLFF = -1;
            if (!arguments.containsKey("hideGiftIcon")) {
                arguments.putBoolean("hideGiftIcon", false);
            }
            C786410Ut5.LJJJI("fromPage", LJIJI(), arguments);
            arguments.putBoolean("arg_require_gray_background", this.LLJILJIL);
            InterfaceC1348780lCe interfaceC1348780lCe = this.LLILZIL;
            if (interfaceC1348780lCe != null && !TextUtils.isEmpty(interfaceC1348780lCe.getSessionId())) {
                C786410Ut5.LJJJI("session_id", this.LLILZIL.getSessionId(), arguments);
            }
        }
        keyboardDialogFragment.LLLIIIIL = this;
        keyboardDialogFragment.LLLIIII = this;
        keyboardDialogFragment.LLLIIIL = this;
        Aweme awemeLJIILIIL = LJIILIIL();
        keyboardDialogFragment.LLLIZZ = awemeLJIILIIL;
        C460000I2c c460000I2c = keyboardDialogFragment.LLLIIL;
        if (c460000I2c != null) {
            c460000I2c.LJFF = awemeLJIILIIL;
        }
        if (C2279851ELn.LIZIZ() && keyboardDialogFragment.LLJJL != null && (quickMentionVM = keyboardDialogFragment.LLLLLLJ) != null) {
            if (quickMentionVM.getState().LL == EnumC1347820lB6.HIDE) {
                keyboardDialogFragment.LLJJL.LJIILIIL(awemeLJIILIIL, null);
            } else {
                keyboardDialogFragment.LLJJL.LJIILIIL(awemeLJIILIIL, C1351410lGt.LIZJ(awemeLJIILIIL));
            }
        }
        keyboardDialogFragment.LLLLII = this;
        C1353500lKG c1353500lKG = keyboardDialogFragment.LLIZ;
        if (c1353500lKG != null) {
            LJIIIIZZ(c1353500lKG);
        }
        keyboardDialogFragment.LLLLIILL = this.LLJLILLLLZIIL;
        Emoji emoji = this.LLJJIII;
        keyboardDialogFragment.LLLJIL = emoji;
        C1348730lCZ c1348730lCZ = keyboardDialogFragment.LLLLII;
        if (c1348730lCZ != null) {
            c1348730lCZ.LJJIJLIJ(emoji);
        }
        CommentVideoModel.Type typeLJIILJJIL = LJIILJJIL();
        ICreativeAppDiffService.LIZ.getClass();
        C1346440l8s.LIZ().LIZIZ();
        keyboardDialogFragment.LLLLIIIILLL = typeLJIILJJIL;
        try {
            keyboardDialogFragment.show(this.LLILZ.getChildFragmentManager(), "CommentInputManager");
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final Bundle LJIILL(CharSequence charSequence) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJIIJI(bundle, "hint", charSequence);
        bundle.putInt("maxLength", LJIJJ());
        bundle.putBoolean("showAt", true);
        C786410Ut5.LJJJI("arg_event_type", this.LLILZIL.getEventType(), bundle);
        bundle.putBoolean("isLandscapeMode", this.LLILZIL.isLandscapeMode());
        bundle.putInt("publishScenario", this.LLLIIII);
        return bundle;
    }

    public final void LJIJJLI(Comment comment) {
        if (comment.getFakeIsFromGiftBag()) {
            Aweme awemeLJIILIIL = LJIILIIL();
            if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getGiftBagStatus() == 1) {
                ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().setGiftBagStatus(0);
                ((LiveData) this.LLJLL.LL.getValue()).postValue(Boolean.FALSE);
                if (awemeLJIILIIL != null) {
                    this.LLJLILLLLZIIL.PF2(awemeLJIILIIL.getAid(), AwemeExtKt.getAuthorUid(awemeLJIILIIL));
                }
            }
        }
    }

    public final void LJJII(C1353500lKG c1353500lKG) {
        if (c1353500lKG == null || !((CopyOnWriteArrayList) this.LLJLIL).contains(c1353500lKG) || this.LLJL) {
            return;
        }
        this.LLJL = true;
        for (EditText editText : (CopyOnWriteArrayList) this.LLJLIL) {
            if (editText != c1353500lKG && !C0PVY.LIZ(C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)), C2204961BRm.LLJILLL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)))) {
                editText.setText(C2204961BRm.LLJILLL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)));
            }
        }
        this.LLLIIIL = false;
        this.LLJL = false;
    }

    public final void LJJIII(String str) {
        List<CommentImageModel> list;
        boolean z;
        if (this.LLILZIL.getCommentInputAweme() != null) {
            C1353500lKG c1353500lKG = this.LLILLL;
            String sessionId = null;
            if ((c1353500lKG == null || TextUtils.isEmpty(C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)))) && (((list = this.LLJJIJI) == null || list.isEmpty()) && this.LLJJIJIIJIL == null)) {
                z = false;
            } else {
                z = true;
            }
            InterfaceC1348780lCe interfaceC1348780lCe = this.LLILZIL;
            if (interfaceC1348780lCe != null) {
                sessionId = interfaceC1348780lCe.getSessionId();
            }
            C1350920lG6.LLFFF(str, this.LLILZIL.getCommentInputAweme(), LJIIZILJ(), !this.LLLIIIIL, z, sessionId, Boolean.FALSE, null);
        }
    }

    public final void LJJIIJ(CommentVideoModel.Type type) {
        if (type != CommentVideoModel.Type.NONE) {
            if (this.LLL) {
                LJJIIZ("collection_text_panel", type, this.LLILZIL.getCommentInputReplyComment());
            } else {
                LJJIIZ("comment_click", type, this.LLILZIL.getCommentInputReplyComment());
            }
        }
    }

    public final void LJJIIJZLJL(boolean z) {
        if (this.LLILLL == null || !LJJ() || LJIIIZ() || this.LLLII.LIZJ) {
            return;
        }
        if (z) {
            CharSequence hint = this.LLILLL.getHint();
            if (LJJ()) {
                this.LLJLILLLLZIIL.LLJILJIL = "click_gift_icon";
                this.LLJJLIIIJLLLLLLLZ = "click_gift_icon";
                LJJIFFI();
                Bundle bundleLJIILL = LJIILL(hint);
                bundleLJIILL.putBoolean("showGiftPanel", true);
                C786410Ut5.LJJJI("click_from", this.LLJJLIIIJLLLLLLLZ, bundleLJIILL);
                KeyboardDialogFragment keyboardDialogFragmentOR = KeyboardDialogFragment.OR(this.LLILZIL.getCommentInputViewType(), LJIIZILJ());
                Bundle arguments = keyboardDialogFragmentOR.getArguments();
                if (arguments != null) {
                    C786410Ut5.LJJIIJZLJL(arguments, bundleLJIILL);
                }
                LJIIJ(keyboardDialogFragmentOR);
            }
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            String str = this.LLJJ;
            String strLJIIJJI = LJIIJJI();
            String strLJIIL = LJIIL();
            c1350920lG6.getClass();
            C1350920lG6.LJIJJLI(str, strLJIIJJI, strLJIIL, "comment_panel_outer");
            return;
        }
        C1233040iBy c1233040iBy = new C1233040iBy(this.LLILZ.getContext());
        c1233040iBy.LIZIZ(2131858208);
        c1233040iBy.LIZLLL();
    }

    public final void LJJIJ(String str) {
        C1260870iur c1260870iur;
        if (this.LLIZ != null && !TextUtils.isEmpty(str) && (c1260870iur = (C1260870iur) ((ConcurrentHashMap) this.LLIZ).remove(str)) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removePublishedPresenter ");
            sbLIZ.append(str);
            sbLIZ.append(" presenter: ");
            sbLIZ.append(c1260870iur);
            C2188811AlT.LIZIZ(sbLIZ);
            c1260870iur.LJIILJJIL();
            c1260870iur.LIZ();
        }
    }

    public final void LJJIJIL(C1345870l7x c1345870l7x) {
        String fakeId;
        if (this.LLIZ == null) {
            this.LLIZ = new ConcurrentHashMap();
        }
        Comment comment = c1345870l7x.LLJ;
        if (comment != null) {
            fakeId = comment.getFakeId();
        } else {
            fakeId = "";
        }
        if (!TextUtils.isEmpty(fakeId)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("savePublishingPresenter: ");
            sbLIZ.append(fakeId);
            sbLIZ.append(" presenter: ");
            sbLIZ.append(c1345870l7x);
            C2188811AlT.LIZIZ(sbLIZ);
            ((ConcurrentHashMap) this.LLIZ).put(fakeId, c1345870l7x);
        }
    }

    public final void LJJIJLIJ(Emoji emoji) {
        if (this.LLJJIII == emoji) {
            return;
        }
        this.LLJJIII = emoji;
        for (InterfaceC1349030lD3 interfaceC1349030lD3 : (CopyOnWriteArrayList) this.LLJZIJLIL) {
            if (interfaceC1349030lD3 != null) {
                interfaceC1349030lD3.LIZ();
            }
        }
    }

    @Override // X.InterfaceC1345970l87
    public final void rE2(Comment comment) throws Throwable {
        LJJIJLIJ(null);
        C1353500lKG c1353500lKG = this.LLILLL;
        if (c1353500lKG != null) {
            C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null));
            if (!this.LLL) {
                this.LLILLL.setText("");
            }
        }
        this.LL = "";
        if (this.LLJJIJI != null) {
            this.LLJJIJI = null;
        }
        if (this.LLJJIJIIJIL != null) {
            this.LLJJIJIIJIL = null;
        }
        if (comment != null) {
            comment.getShouldDisplayFakeComment();
        }
        LJJIJL();
        InterfaceC1348780lCe interfaceC1348780lCe = this.LLILZIL;
        if (interfaceC1348780lCe != null) {
            interfaceC1348780lCe.onCommentInputPublishStart(comment);
        }
        if (comment == null || !comment.isStoryEmojiComment()) {
            LJIL();
            if (comment == null) {
                return;
            }
        }
        C1348610lCN c1348610lCN = C1348610lCN.LIZ;
        EnumC1346360l8k inputServiceType = this.LLILZIL.getInputServiceType();
        String awemeId = comment.getAwemeId();
        c1348610lCN.getClass();
        C1348610lCN.LIZIZ(inputServiceType, awemeId);
    }

    public C1348730lCZ(Fragment fragment, InterfaceC1348780lCe interfaceC1348780lCe) {
        StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
        String methodName = stackTrace[3].getMethodName();
        String className = stackTrace[3].getClassName();
        C294190Bg1 c294190Bg1 = C294190Bg1.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(className);
        sbLIZ.append(": ");
        sbLIZ.append(methodName);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c294190Bg1.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, "CommentInputManager");
        c2344009Gk.LJIIIIZZ("stack_info", strLIZIZ);
        C20684815ws.LJIILLIIL("comment_refactor_check", c2344009Gk.LIZ);
        if (fragment != null && interfaceC1348780lCe != null) {
            this.LLILZ = fragment;
            this.LLILZIL = interfaceC1348780lCe;
            this.LLIZLLLIL = fragment.getResources().getString(2131829129);
            GiftViewModel giftViewModel = (GiftViewModel) ViewModelProviders.of(fragment.getActivity()).get(GiftViewModel.class);
            this.LLJLILLLLZIIL = giftViewModel;
            if (LJIILIIL() != null) {
                giftViewModel.LLJJI = LJIILIIL();
            }
            this.LLJLL = (BottomBarViewModel) ViewModelProviders.of(fragment.getActivity()).get(BottomBarViewModel.class);
            C1389340mG4.LIZJ(null, null);
            if (fragment.getActivity() != null) {
                C487280J9a.LIZIZ(fragment.getActivity(), this);
            }
            this.LLLII = new C1348410lC3();
            return;
        }
        throw new RuntimeException("Empty fragment/service!");
    }

    public final void LJJIL(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (this.LLILZIL.isLandscapeMode()) {
            C1351950lHl.LJIJJ(view);
        } else if (z) {
            C1351950lHl.LJIJJLI(view);
        } else {
            C1351950lHl.LJIJJ(view);
        }
    }

    public final void LJJJ(CharSequence charSequence, boolean z) {
        if (LJJ() && LJJ()) {
            Bundle bundleLJIILL = LJIILL(charSequence);
            bundleLJIILL.putBoolean("showEmojiPanel", z);
            bundleLJIILL.putBoolean("isCommentDesc", this.LLLF);
            C786410Ut5.LJJIJIIJI(bundleLJIILL, "defaultContent", "");
            C786410Ut5.LJJJI("fromPage", LJIJI(), bundleLJIILL);
            C786410Ut5.LJJJI("click_from", this.LLJIJIL, bundleLJIILL);
            C786410Ut5.LJJJI("enter_method", this.LLILZIL.getEnterMethod(), bundleLJIILL);
            KeyboardDialogFragment keyboardDialogFragmentOR = KeyboardDialogFragment.OR(this.LLILZIL.getCommentInputViewType(), LJIIZILJ());
            Bundle arguments = keyboardDialogFragmentOR.getArguments();
            if (arguments != null) {
                C786410Ut5.LJJIIJZLJL(arguments, bundleLJIILL);
            }
            LJIIJ(keyboardDialogFragmentOR);
        }
    }

    @Override // X.InterfaceC1345970l87
    public final void aB2(Exception exc, Comment comment) {
        LJJIJ(comment.getFakeId());
        InterfaceC1348780lCe interfaceC1348780lCe = this.LLILZIL;
        if (interfaceC1348780lCe != null) {
            interfaceC1348780lCe.onCommentInputPublishFailed(exc, this.LLJ, comment);
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C1389340mG4.LIZJ(activity, null);
        C19252910Tv.LIZIZ.LIZLLL().LJIIIIZZ().getClass();
        C1616660sAi.LIZ(activity, configuration);
    }

    @Override // X.InterfaceC1345970l87
    public final void onImageUploadProgress(String str, int i) {
        InterfaceC1348780lCe interfaceC1348780lCe = this.LLILZIL;
        if (interfaceC1348780lCe != null) {
            interfaceC1348780lCe.onImageUploadProgress(str, i);
        }
    }

    public final void LJJIIZ(String str, CommentVideoModel.Type type, Comment comment) {
        User user;
        String cid;
        String cid2;
        String eventType;
        String text;
        String str2;
        String sessionId;
        if (LJJ() && this.LLILZ.getActivity() != null && this.LLILZIL != null && comment != null && (user = comment.getUser()) != null) {
            String eventType2 = this.LLILZIL.getEventType();
            if (comment.getCommentType() == 2) {
                cid = comment.getRootCommentId();
                cid2 = comment.getCid();
            } else {
                cid = comment.getCid();
                cid2 = "";
            }
            if (this.LLILZIL.getEventType().isEmpty()) {
                eventType = LJIIZILJ();
            } else {
                eventType = this.LLILZIL.getEventType();
            }
            if (this.LLL && (str.equals("collection_text_panel") || str.equals("comment_press") || str.equals("collection_reply_button"))) {
                eventType = "collection_comment";
            }
            if (comment.getImageList() != null && !comment.getImageList().isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(comment.getText());
                sbLIZ.append(" ");
                sbLIZ.append(this.LLILZ.getString(2131829121));
                text = C2188811AlT.LIZIZ(sbLIZ);
            } else if (comment.getStickerStruct() != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(comment.getText());
                sbLIZ2.append(" ");
                sbLIZ2.append(this.LLILZ.getString(2131829123));
                text = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                text = comment.getText();
            }
            C19EG activity = this.LLILZ.getActivity();
            String uid = user.getUid();
            String strLIZJ = C10EU.LIZJ(user);
            UrlModel avatarThumb = user.getAvatarThumb();
            String cid3 = comment.getCid();
            String awemeId = comment.getAwemeId();
            String strLJIIL = LJIIL();
            int iLIZ = C737370SwB.LIZ(eventType2);
            if (type == CommentVideoModel.Type.COMMENT) {
                str2 = "comment_reply";
            } else {
                str2 = "question_and_answer";
            }
            C1395000mPC.LIZ(activity, new CommentVideoModel(uid, strLIZJ, avatarThumb, text, null, cid3, awemeId, strLJIIL, cid, cid2, iLIZ, str, 0, 0, type, str2, eventType));
            if (eventType.equals("collection_comment")) {
                InterfaceC1348780lCe interfaceC1348780lCe = this.LLILZIL;
                if (interfaceC1348780lCe != null) {
                    sessionId = interfaceC1348780lCe.getSessionId();
                } else {
                    sessionId = null;
                }
                C1350920lG6.LLD(str, comment, LJIILIIL(), -1, -1, eventType, null, sessionId);
            }
            LJIL();
        }
    }

    public final void LJJIJIIJIL(View view, String str, String str2) {
        Context contextLIZ;
        Fragment fragment = this.LLILZ;
        if (fragment == null || (contextLIZ = fragment.getContext()) == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        if (!LJJ()) {
            return;
        }
        if ((C0OBG.LIZIZ(view) && view != null) || LJJJI(str2, str, "click_type_comment")) {
            return;
        }
        if (C10EU.LJIIIIZZ()) {
            C1233040iBy c1233040iBy = new C1233040iBy(contextLIZ);
            c1233040iBy.LIZIZ(2131828626);
            c1233040iBy.LIZLLL();
            return;
        }
        if (this.LLILZIL.getCommentInputAweme() != null) {
            C735280Sso c735280Sso = C735280Sso.LIZ;
            Aweme commentInputAweme = this.LLILZIL.getCommentInputAweme();
            c735280Sso.getClass();
            if (!C735280Sso.LJFF(commentInputAweme)) {
                this.LLJI = true;
                if (this.LLLIIII == 6) {
                    this.LLLIIL = "text";
                }
                if (view instanceof C1353500lKG) {
                    CharSequence hint = ((TextView) view).getHint();
                    this.LLJIJIL = "click_input_box";
                    LJJJ(hint, false);
                } else if (LJJ()) {
                    LJJIJL();
                    LJJJ(this.LLIZLLLIL, false);
                }
            }
        }
        this.LLILZIL.onCommentInputClick();
    }

    public final boolean LJJJI(String str, String str2, String str3) {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C19EG activity = this.LLILZ.getActivity();
            C627150Oin c627150Oin = new C627150Oin();
            C786410Ut5.LJJJI("group_id", str, c627150Oin.LIZ);
            C786410Ut5.LJJJI("author_id", LJIIL(), c627150Oin.LIZ);
            C786410Ut5.LJJJI("log_pb", C735370Ssx.LJIIJJI(str), c627150Oin.LIZ);
            C0XPD.LIZIZ(activity, str2, str3, c627150Oin.LIZ, null);
            return true;
        }
        return LJIIIZ();
    }

    @Override // X.InterfaceC21501419Cq
    public final void onActivityResult(int i, int i2, Intent intent) {
        User user;
        if (LJJ() && i == 111) {
            KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) this.LLILZ.getChildFragmentManager().LJJJJZI("CommentInputManager");
            if (keyboardDialogFragment != null) {
                keyboardDialogFragment.LLLIL = true;
            }
            if (intent != null && (user = (User) intent.getSerializableExtra("extra_data")) != null) {
                this.LLILZLL.add(user);
                if (keyboardDialogFragment != null) {
                    if (!keyboardDialogFragment.LLIZ.LJIIIIZZ(0, C1342220l24.LJ(user, this.LLILZIL.getEventType(), true, true), user.getUid(), user.getSecUid()) && this.LLILZ.getContext() != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(this.LLILZ);
                        c1389890mGx.LJIIIZ(2131826445);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    return;
                }
                C786410Ut5.LJJZZIII(new BPEAHandler(), new ARunnableS90S0200000_21(this, user, 64));
            }
        }
    }

    @Override // X.InterfaceC1345970l87
    public final void rk2(Comment comment, CommentResponse commentResponse, CommentImageModel commentImageModel) {
        boolean z;
        LJJIJ(comment.getFakeId());
        if (this.LLILZIL != null) {
            C1343720l4U c1343720l4U = C1343720l4U.LIZ;
            String cid = comment.getCid();
            c1343720l4U.getClass();
            Comment commentLIZJ = C1343720l4U.LIZJ(cid);
            if (commentLIZJ != null) {
                comment.setText(C1342220l24.LIZLLL(commentLIZJ));
                comment.setTextExtra(commentLIZJ.getTextExtra());
            }
            List<Comment> replyComments = comment.getReplyComments();
            if (!C086I.LIZIZ(replyComments)) {
                for (Comment comment2 : replyComments) {
                    Comment commentLIZJ2 = C1343720l4U.LIZJ(comment2.getCid());
                    if (commentLIZJ2 != null) {
                        comment2.setText(C1342220l24.LIZLLL(commentLIZJ2));
                        comment2.setTextExtra(commentLIZJ2.getTextExtra());
                    }
                }
            }
            C1344420l5c.LIZ(comment);
            if (C1351950lHl.LJII(comment) && commentImageModel != null) {
                int i = C1344860l6K.LIZ;
                C1344860l6K.LIZ(commentImageModel, comment.getAwemeId());
            }
            InterfaceC1348780lCe interfaceC1348780lCe = this.LLILZIL;
            if (commentResponse.commentSurprise != null) {
                z = true;
            } else {
                z = false;
            }
            interfaceC1348780lCe.onCommentInputPublishSuccess(comment, z, commentResponse);
            CommentSurprise commentSurprise = commentResponse.commentSurprise;
            if (commentSurprise != null) {
                C1352020lHs.LIZJ(commentSurprise);
                this.LLILZIL.tryTriggerEasterEgg(new CommentSurpriseStruct(commentResponse.comment, commentResponse.commentSurprise, false));
            }
            C0OC0 c0oc0 = C0OC0.LIZ;
            this.LLILZIL.getCommentInputAweme();
            c0oc0.getClass();
            if (this.LLILZIL.getCommentInputAweme() != null) {
                C1344480l5i.LIZ(this.LLILZIL.getCommentInputAweme().getAid(), null, false);
            }
        }
        C1440005kM.LIZ(new C739390SzR(comment.getLabelInfo(), comment.getAwemeId()));
        ((IMainService) ServiceManager.get().getService(IMainService.class)).tryShowIllegalUsernameDialog("comment", new ARunnableS93S0000000_16(13), new ARunnableS93S0000000_16(14));
        if (comment.getGift() != null) {
            LJIJJLI(comment);
        }
        ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJJJZ("post_comment", "");
        CommentPerfMonitorUtil.LIZ.getClass();
        C1345430l7F c1345430l7F = CommentPerfMonitorUtil.LIZJ;
        c1345430l7F.LIZJ = System.currentTimeMillis();
        C15O7.LIZJ(new ACallableS426S0100000_21(c1345430l7F, 10));
        if (C1346390l8n.LIZIZ(comment)) {
            this.LLILZIL.publishCommentPost(comment, null, "check_box");
        }
    }

    @Override // X.InterfaceC1351180lGW
    public final void LIZIZ(String str, String str2, String str3, Map map) {
        InterfaceC1348780lCe interfaceC1348780lCe;
        C1350920lG6.LIZ.getClass();
        C1350920lG6.LLIIII(str, str2, 3, 0, str3, null, null);
        if (LJJ() && (interfaceC1348780lCe = this.LLILZIL) != null && interfaceC1348780lCe.getCommentInputAweme() != null) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            do {
                sb.append(str);
                i++;
            } while (i < 3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
            C786410Ut5.q2(spannableStringBuilder, new CommentEmojiSpan(str, 0, str3, str2, 3), 0, spannableStringBuilder.length(), 33);
            this.LLJ = 1;
            this.LLILZIL.onCommentInputPublishClick(1, sb.length() / 2, spannableStringBuilder, "", "", false, new C1347310lAH());
            String eventType = this.LLILZIL.getEventType();
            Aweme commentInputAweme = this.LLILZIL.getCommentInputAweme();
            C1345920l82 c1345920l82 = new C1345920l82();
            c1345920l82.LIZ = commentInputAweme.getAid();
            c1345920l82.LIZIZ = sb.toString();
            c1345920l82.LIZLLL = null;
            c1345920l82.LJIILJJIL = eventType;
            c1345920l82.LJFF = C737370SwB.LIZ(eventType);
            c1345920l82.LJIIJJI = 1;
            c1345920l82.LJIILIIL = 1;
            c1345920l82.LJJI = LJIJ();
            c1345920l82.LJIJ = LJIIL();
            C1345870l7x c1345870l7x = new C1345870l7x();
            c1345870l7x.LLILLJJLI = this;
            this.LLILZIL.getEventType();
            c1345870l7x.LLIZ = 1;
            c1345870l7x.LJIILL(c1345920l82.LIZ());
            LJJIJIL(c1345870l7x);
            LJJIJLIJ(null);
            if ("quick_panel".equals(str2)) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", LJIIZILJ());
                c2344009Gk.LJIIIIZZ("group_id", commentInputAweme.getAid());
                c2344009Gk.LJIIIIZZ("action_type", "emoji");
                c2344009Gk.LJIIIIZZ("emoji_id", str);
                c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(commentInputAweme));
                if (commentInputAweme.getStatistics() != null) {
                    c2344009Gk.LIZLLL(commentInputAweme.getStatistics().getCommentCount(), "visible_comment_cnt");
                }
                c2344009Gk.LJFF(Scene.SCENE_SERVICE, C1350920lG6.LJJIIJZLJL(commentInputAweme, LJIIZILJ(), true));
                c2344009Gk.LJII(map);
                C20684815ws.LJIILLIIL("click_quick_comment_panel", c2344009Gk.LIZ);
            }
        }
    }
}
