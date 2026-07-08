package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarViewAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0lCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348990lCz implements InterfaceC1348780lCe {
    public final Activity LL;
    public final InterfaceC1254640iko LLILLJJLI;
    public final C1349000lD0 LLILLL;
    public final InterfaceC665370Q7z LLILZ;
    public final View LLILZIL;
    public final String LLILZLL;
    public final InterfaceC1349040lD4 LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ Comment getCommentInputReplyComment() {
        return null;
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ String getEnterMethod() {
        return "";
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ String getFromPage() {
        return "";
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ String getSessionId() {
        return null;
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ boolean isLandscapeMode() {
        return false;
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputClick() {
    }

    @Override // X.InterfaceC1348780lCe
    public void onEvent(C1346240l8Y c1346240l8Y) {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void onImageUploadProgress(String str, int i) {
    }

    @Override // X.InterfaceC1348780lCe
    public final /* synthetic */ void tryTriggerEasterEgg(CommentSurpriseStruct commentSurpriseStruct) {
    }

    public final Aweme LIZIZ() {
        InterfaceC1254640iko interfaceC1254640iko = this.LLILLJJLI;
        if (interfaceC1254640iko != null) {
            return ((DetailFragmentPanel) interfaceC1254640iko).o();
        }
        return null;
    }

    public final BottomBarViewAbility LIZJ() {
        return (BottomBarViewAbility) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC1348780lCe
    public final String getEventType() {
        String eventType;
        C0HTT c0htt = this.LLILLJJLI;
        return (c0htt == null || (eventType = ((BaseListFragmentPanel) c0htt).getEventType()) == null) ? "" : eventType;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014d  */
    @Override // X.InterfaceC1348780lCe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean checkCommentInputable() {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1348990lCz.checkCommentInputable():boolean");
    }

    @Override // X.InterfaceC1348780lCe
    public final Aweme getCommentInputAweme() {
        return LIZIZ();
    }

    @Override // X.InterfaceC1348780lCe
    public final int getCommentInputViewType() {
        C1348730lCZ c1348730lCZAm;
        C1348730lCZ c1348730lCZAm2;
        BottomBarViewAbility bottomBarViewAbilityLIZJ = LIZJ();
        if (bottomBarViewAbilityLIZJ != null && (c1348730lCZAm2 = bottomBarViewAbilityLIZJ.am()) != null && c1348730lCZAm2.LJI()) {
            return 10;
        }
        BottomBarViewAbility bottomBarViewAbilityLIZJ2 = LIZJ();
        return (bottomBarViewAbilityLIZJ2 == null || (c1348730lCZAm = bottomBarViewAbilityLIZJ2.am()) == null || !c1348730lCZAm.LIZJ()) ? 1 : 11;
    }

    @Override // X.InterfaceC1348780lCe
    public final EnumC1346360l8k getInputServiceType() {
        return EnumC1346360l8k.DETAIL_BOTTOM;
    }

    @C14EU
    public final void onCommentEvent(C1209980ham c1209980ham) {
        String aid;
        C1348730lCZ c1348730lCZAm;
        if (c1209980ham.LIZ == 8) {
            Object obj = c1209980ham.LIZIZ;
            if (LIZIZ() == null) {
                return;
            }
            Aweme awemeLIZIZ = LIZIZ();
            if (awemeLIZIZ == null || (aid = awemeLIZIZ.getAid()) == null) {
                aid = "";
            }
            if (Intrinsics.LJFF(aid, obj)) {
                BottomBarViewAbility bottomBarViewAbilityLIZJ = LIZJ();
                if (bottomBarViewAbilityLIZJ != null && (c1348730lCZAm = bottomBarViewAbilityLIZJ.am()) != null) {
                    c1348730lCZAm.LJJIJL();
                }
                AbstractBottomPriorityComponent abstractBottomPriorityComponentLIZ = this.LLILLL.LIZ();
                if (abstractBottomPriorityComponentLIZ != null) {
                    LIZ(abstractBottomPriorityComponentLIZ, AFwS259S0000000_21.get$arr$(385));
                }
            }
        }
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishOnlyGiftSuccess(Comment comment) {
        BottomBarViewAbility bottomBarViewAbilityLIZJ = LIZJ();
        if (bottomBarViewAbilityLIZJ != null) {
            bottomBarViewAbilityLIZJ.W3();
        }
        AbstractBottomPriorityComponent abstractBottomPriorityComponentLIZ = this.LLILLL.LIZ();
        if (abstractBottomPriorityComponentLIZ != null) {
            LIZ(abstractBottomPriorityComponentLIZ, new AwS600S0100000_21(comment, 323));
        }
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishStart(Comment comment) {
        if (comment == null) {
            return;
        }
        if (!C199499133x.LIZ(comment.getGiftEffectPath()) && comment.getFakeGiftId() != 0) {
            BottomBarViewAbility bottomBarViewAbilityLIZJ = LIZJ();
            if (bottomBarViewAbilityLIZJ != null) {
                bottomBarViewAbilityLIZJ.Sx1(comment);
                return;
            }
            return;
        }
        AbstractBottomPriorityComponent abstractBottomPriorityComponentLIZ = this.LLILLL.LIZ();
        if (abstractBottomPriorityComponentLIZ == null) {
            return;
        }
        LIZ(abstractBottomPriorityComponentLIZ, new AwS600S0100000_21(comment, 324));
    }

    @C14EU
    public final void onDislikeAwemeEvent(C1372310lob c1372310lob) {
        float f;
        Activity activity = this.LL;
        if (activity == null || c1372310lob.LJ != activity.hashCode() || c1372310lob.LIZIZ != 2) {
            return;
        }
        if (c1372310lob.LIZ) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        BottomBarViewAbility bottomBarViewAbilityLIZJ = LIZJ();
        if (bottomBarViewAbilityLIZJ != null) {
            bottomBarViewAbilityLIZJ.hC0(f);
        }
    }

    @Override // X.InterfaceC1348780lCe
    public final void onEmojiToKeyboard(String str) {
        String aid;
        String authorUid;
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        String str2 = this.LLILZLL;
        Aweme awemeLIZIZ = LIZIZ();
        String str3 = "";
        if (awemeLIZIZ == null || (aid = awemeLIZIZ.getAid()) == null) {
            aid = "";
        }
        Aweme awemeLIZIZ2 = LIZIZ();
        if (awemeLIZIZ2 != null && (authorUid = AwemeExtKt.getAuthorUid(awemeLIZIZ2)) != null) {
            str3 = authorUid;
        }
        c1350920lG6.getClass();
        C1350920lG6.LJLJJLL(str, str2, aid, str3);
    }

    public static void LIZ(AbstractBottomPriorityComponent abstractBottomPriorityComponent, Function1 function1) {
        if (abstractBottomPriorityComponent instanceof AbstractBottomInputPriorityComponent) {
            function1.invoke(abstractBottomPriorityComponent);
        }
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputKeyboardDismiss(boolean z, C1347310lAH c1347310lAH) {
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        C0HTT c0htt = this.LLILLJJLI;
        if (c0htt != null) {
            C737030Svd c737030Svd = new C737030Svd(9, (Object) null);
            c737030Svd.LIZJ = null;
            ((BaseListFragmentPanel) c0htt).LLIIL(c737030Svd);
        }
        InterfaceC1349040lD4 interfaceC1349040lD4 = this.LLIZ;
        if (interfaceC1349040lD4 != null) {
            interfaceC1349040lD4.LJJIIJ();
        }
        AbstractBottomPriorityComponent abstractBottomPriorityComponentLIZ = this.LLILLL.LIZ();
        if (abstractBottomPriorityComponentLIZ != null) {
            LIZ(abstractBottomPriorityComponentLIZ, AFwS259S0000000_21.get$arr$(386));
        }
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputKeyboardShow(boolean z, String str, C1347310lAH c1347310lAH) {
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
        InterfaceC1349040lD4 interfaceC1349040lD4 = this.LLIZ;
        if (interfaceC1349040lD4 != null) {
            interfaceC1349040lD4.LIZIZ();
        }
        AbstractBottomPriorityComponent abstractBottomPriorityComponentLIZ = this.LLILLL.LIZ();
        if (abstractBottomPriorityComponentLIZ != null) {
            LIZ(abstractBottomPriorityComponentLIZ, AFwS259S0000000_21.get$arr$(387));
        }
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishFailed(Exception exc, int i, Comment comment) {
        AbstractBottomPriorityComponent abstractBottomPriorityComponentLIZ;
        if (this.LL != null && (abstractBottomPriorityComponentLIZ = this.LLILLL.LIZ()) != null) {
            LIZ(abstractBottomPriorityComponentLIZ, new AwS387S0200000_21(exc, i, comment, 84));
        }
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishSuccess(Comment comment, boolean z, CommentResponse commentResponse) {
        BottomBarViewAbility bottomBarViewAbilityLIZJ = LIZJ();
        if ((bottomBarViewAbilityLIZJ != null && !bottomBarViewAbilityLIZJ.isViewValid()) || this.LL == null) {
            return;
        }
        if (comment.getPublishScenario() != 1) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
            c1389890mGx.LJIIIZ(2131829203);
            c1389890mGx.LJIIJJI();
        }
        BottomBarViewAbility bottomBarViewAbilityLIZJ2 = LIZJ();
        if (bottomBarViewAbilityLIZJ2 != null) {
            bottomBarViewAbilityLIZJ2.W3();
        }
        AbstractBottomPriorityComponent abstractBottomPriorityComponentLIZ = this.LLILLL.LIZ();
        if (abstractBottomPriorityComponentLIZ != null) {
            LIZ(abstractBottomPriorityComponentLIZ, new AwS600S0100000_21(comment, 325));
        }
    }

    @Override // X.InterfaceC1348780lCe
    public final void onEmojiClick(String str, int i, int i2) {
        String str2 = this.LLILZLL;
        Aweme awemeLIZIZ = LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("eventType", str2);
        linkedHashMap.put("aweme", awemeLIZIZ);
        CommentContextSource commentContextSourceLIZ = C1347300lAG.LIZ(linkedHashMap);
        C1350920lG6.LIZ.getClass();
        C1350920lG6.LJLJJL(commentContextSourceLIZ, str, i, false, i2);
    }

    @Override // X.InterfaceC1348780lCe
    public final void publishCommentPost(Comment comment, Bitmap bitmap, String str) {
        Context context;
        View view = this.LLILZIL;
        if (view != null && (context = view.getContext()) != null) {
            C1354600lM2 c1354600lM2 = C1354600lM2.LIZ;
            Aweme awemeLIZIZ = LIZIZ();
            String str2 = this.LLILZLL;
            c1354600lM2.getClass();
            C1354600lM2.LJFF(awemeLIZIZ, comment, context, str2, "check_box", null, null);
        }
    }

    public C1348990lCz(C19EG c19eg, InterfaceC1254640iko interfaceC1254640iko, C1349000lD0 c1349000lD0, InterfaceC665370Q7z interfaceC665370Q7z, View view, String str, InterfaceC1349040lD4 interfaceC1349040lD4) {
        this.LL = c19eg;
        this.LLILLJJLI = interfaceC1254640iko;
        this.LLILLL = c1349000lD0;
        this.LLILZ = interfaceC665370Q7z;
        this.LLILZIL = view;
        this.LLILZLL = str;
        this.LLIZ = interfaceC1349040lD4;
        EventBus.LIZLLL().LJIJJ(this);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1406));
        this.LLJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1524));
    }

    @Override // X.InterfaceC1348780lCe
    public final void onCommentInputPublishClick(int i, int i2, CharSequence charSequence, String str, String str2, boolean z, C1347310lAH c1347310lAH) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_recommendation", false);
        if (TextUtils.equals(str, "button_send")) {
            C0HTT c0htt = this.LLILLJJLI;
            if (c0htt != null) {
                C737030Svd c737030Svd = new C737030Svd(57, charSequence.toString());
                c737030Svd.LIZJ = bundle;
                ((BaseListFragmentPanel) c0htt).LLIIL(c737030Svd);
            }
        } else {
            C0HTT c0htt2 = this.LLILLJJLI;
            if (c0htt2 != null) {
                C737030Svd c737030Svd2 = new C737030Svd(11, charSequence.toString());
                c737030Svd2.LIZJ = bundle;
                ((BaseListFragmentPanel) c0htt2).LLIIL(c737030Svd2);
            }
        }
        AbstractBottomPriorityComponent abstractBottomPriorityComponentLIZ = this.LLILLL.LIZ();
        if (abstractBottomPriorityComponentLIZ != null) {
            LIZ(abstractBottomPriorityComponentLIZ, new C1349020lD2(str, i, i2, charSequence, c1347310lAH));
        }
    }
}
