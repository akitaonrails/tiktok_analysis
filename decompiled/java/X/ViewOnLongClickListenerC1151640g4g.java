package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.aireply.IAIReplyWatcherManagerService;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.list.AnchorGiftCell;
import com.bytedance.android.livesdk.model.message.CommentReplyMessage;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0g4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class ViewOnLongClickListenerC1151640g4g implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            case 5:
                return onLongClick$5(this, view);
            case 6:
                return onLongClick$6(this, view);
            case 7:
                return onLongClick$7(this, view);
            case 8:
                return onLongClick$8(this, view);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onLongClick$9(this, view);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return onLongClick$10(this, view);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return onLongClick$11(this, view);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return onLongClick$12(this, view);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return onLongClick$13(this, view);
            default:
                return false;
        }
    }

    public ViewOnLongClickListenerC1151640g4g(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(ViewOnLongClickListenerC1151640g4g viewOnLongClickListenerC1151640g4g, View view) {
        C1109850ezH c1109850ezH = (C1109850ezH) viewOnLongClickListenerC1151640g4g.l0;
        C1109770ez9 c1109770ez9 = c1109850ezH.LL;
        if (c1109770ez9 != null) {
            AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o = c1109850ezH.LLJ;
            C1111350f1h c1111350f1h = new C1111350f1h();
            C1109850ezH c1109850ezH2 = (C1109850ezH) viewOnLongClickListenerC1151640g4g.l0;
            c1111350f1h.LJFF = "avatar";
            c1109850ezH2.getClass();
            c1111350f1h.LIZ = "report_user";
            c1111350f1h.LIZIZ = "long_press";
            c1109770ez9.LJII(abstractC1110800f0o, c1111350f1h);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$1(ViewOnLongClickListenerC1151640g4g viewOnLongClickListenerC1151640g4g, View view) {
        ((CommentWidget) viewOnLongClickListenerC1151640g4g.l0).LLLLLJIL = true;
        return false;
    }

    public static final boolean onLongClick$10(ViewOnLongClickListenerC1151640g4g viewOnLongClickListenerC1151640g4g, View view) {
        ((AbstractC1109880ezK) viewOnLongClickListenerC1151640g4g.l0).r6("avatar");
        return true;
    }

    public static final boolean onLongClick$11(ViewOnLongClickListenerC1151640g4g viewOnLongClickListenerC1151640g4g, View view) {
        AbstractC1109840ezG abstractC1109840ezG = (AbstractC1109840ezG) viewOnLongClickListenerC1151640g4g.l0;
        C1109770ez9 c1109770ez9 = abstractC1109840ezG.LL;
        if (c1109770ez9 != null) {
            AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o = abstractC1109840ezG.LLJ;
            C1111350f1h c1111350f1h = new C1111350f1h();
            AbstractC1109840ezG abstractC1109840ezG2 = (AbstractC1109840ezG) viewOnLongClickListenerC1151640g4g.l0;
            c1111350f1h.LJFF = "comment";
            c1111350f1h.LIZ = abstractC1109840ezG2.d6();
            c1111350f1h.LIZIZ = "long_press";
            c1109770ez9.LJII(abstractC1110800f0o, c1111350f1h);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$12(ViewOnLongClickListenerC1151640g4g viewOnLongClickListenerC1151640g4g, View view) {
        AbstractC1110800f0o abstractC1110800f0o;
        CommentReplyMessage commentReplyMessage;
        DataChannel dataChannel;
        FragmentManager fragmentManager;
        C1111140f1M c1111140f1M = (C1111140f1M) viewOnLongClickListenerC1151640g4g.l0;
        C1109770ez9 c1109770ez9 = c1111140f1M.LL;
        if (c1109770ez9 == null || !c1109770ez9.LIZLLL || (abstractC1110800f0o = c1111140f1M.LLILLJJLI) == null || (commentReplyMessage = (CommentReplyMessage) abstractC1110800f0o.LJIL) == null || c1109770ez9 == null || (dataChannel = c1109770ez9.LJIIIZ) == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
            return false;
        }
        IAIReplyWatcherManagerService.Companion.getClass();
        C378201dU.LIZ().showFeedbackDialog(fragmentManager, commentReplyMessage);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ai_reply_audience_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(commentReplyMessage.getMessageId()), "msg_id");
        c474500IjALIZ.LJJII("long_press", "click_position");
        c474500IjALIZ.LIZ();
        return true;
    }

    public static final boolean onLongClick$13(ViewOnLongClickListenerC1151640g4g viewOnLongClickListenerC1151640g4g, View view) {
        ((C1111150f1N) viewOnLongClickListenerC1151640g4g.l0).R5("avatar");
        return true;
    }

    public static final boolean onLongClick$2(ViewOnLongClickListenerC1151640g4g viewOnLongClickListenerC1151640g4g, View view) {
        ((CommentWidget) viewOnLongClickListenerC1151640g4g.l0).LLLLLJIL = true;
        return false;
    }

    public static final boolean onLongClick$3(ViewOnLongClickListenerC1151640g4g viewOnLongClickListenerC1151640g4g, View view) {
        return ((InterfaceViewOnClickListenerC1102800enu) viewOnLongClickListenerC1151640g4g.l0).x0(view);
    }

    public static final boolean onLongClick$4(ViewOnLongClickListenerC1151640g4g viewOnLongClickListenerC1151640g4g, View view) {
        AnchorGiftCell anchorGiftCell = (AnchorGiftCell) viewOnLongClickListenerC1151640g4g.l0;
        C1146350fw9 c1146350fw9 = anchorGiftCell.LLJIJIL;
        if (c1146350fw9 != null && !C1146560fwU.LIZ(c1146350fw9, anchorGiftCell.itemView.getContext())) {
            AssemVMLazy assemVMLazy = anchorGiftCell.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = AnchorGiftCell.LLJILLL;
            ((GiftAnchorPanelGiftPageCenterViewModel) assemVMLazy.getValue()).GQ2(c1146350fw9.LL, null);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$5(ViewOnLongClickListenerC1151640g4g viewOnLongClickListenerC1151640g4g, View view) {
        return ((InterfaceViewOnClickListenerC1102800enu) viewOnLongClickListenerC1151640g4g.l0).x0(view);
    }

    public static final boolean onLongClick$6(ViewOnLongClickListenerC1151640g4g viewOnLongClickListenerC1151640g4g, View view) {
        return ((InterfaceC1102810env) viewOnLongClickListenerC1151640g4g.l0).x0(view);
    }

    public static final boolean onLongClick$7(ViewOnLongClickListenerC1151640g4g viewOnLongClickListenerC1151640g4g, View view) {
        return ((InterfaceC1102810env) viewOnLongClickListenerC1151640g4g.l0).x0(view);
    }

    public static final boolean onLongClick$8(ViewOnLongClickListenerC1151640g4g viewOnLongClickListenerC1151640g4g, View view) {
        ((AbstractC1109880ezK) viewOnLongClickListenerC1151640g4g.l0).r6("user_name");
        return true;
    }

    public static final boolean onLongClick$9(ViewOnLongClickListenerC1151640g4g viewOnLongClickListenerC1151640g4g, View view) {
        ((AbstractC1109880ezK) viewOnLongClickListenerC1151640g4g.l0).r6("comment");
        return true;
    }
}
