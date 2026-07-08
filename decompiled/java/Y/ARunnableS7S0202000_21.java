package Y;

import X.C04WI;
import X.C0QQT;
import X.C1324840ka2;
import X.C1345760l7m;
import X.C1353060lJY;
import X.C1366200lek;
import X.C1393420mMe;
import X.C1558360qeg;
import X.C1C7U;
import X.C667180QEy;
import X.C786410Ut5;
import X.InterfaceC1350190lEv;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.DefaultCommentPageContainerFragment;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.SubscribeMaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.paidevent.PaidEventMaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.pause.LivePreviewPausedWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minis.page.main.fragment.ShareSheetPanelFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public class ARunnableS7S0202000_21 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C0QQT c0qqtHS;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        CommentCommonModel commonModel3;
        CommentCommonModel commonModel4;
        InterfaceC1350190lEv interfaceC1350190lEv;
        CommentCommonModel commonModel5;
        InterfaceC1350190lEv interfaceC1350190lEv2;
        int i = this.i2;
        String str = null;
        if (i == 2 || i == 1 || i == 4) {
            ICommentListAssemAbility iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL((DefaultCommentPageContainerFragment) this.l1, C1558360qeg.LJ((C1353060lJY) this.l0, null));
            if (iCommentListAssemAbilityLIZLLL != null) {
                iCommentListAssemAbilityLIZLLL.if1();
            }
        }
        CommentContextSource commentContextSourceGL = ((DefaultCommentPageContainerFragment) this.l1).GL();
        if (commentContextSourceGL != null && (commonModel5 = commentContextSourceGL.getCommonModel()) != null && (interfaceC1350190lEv2 = commonModel5.scrollStateChangedListener) != null) {
            interfaceC1350190lEv2.LIZ(this.i3, this.i2);
        }
        if (!C04WI.LIZ() || (c0qqtHS = ((DefaultCommentPageContainerFragment) this.l1).hS()) == null) {
            return;
        }
        int i2 = this.i3;
        int i3 = this.i2;
        CommentContextSource commentContextSourceGL2 = ((DefaultCommentPageContainerFragment) this.l1).GL();
        Boolean boolLIZIZ = (commentContextSourceGL2 == null || (commonModel4 = commentContextSourceGL2.getCommonModel()) == null || (interfaceC1350190lEv = commonModel4.scrollStateChangedListener) == null) ? null : interfaceC1350190lEv.LIZIZ();
        CommentContextSource commentContextSourceGL3 = ((DefaultCommentPageContainerFragment) this.l1).GL();
        String str2 = (commentContextSourceGL3 == null || (commonModel3 = commentContextSourceGL3.getCommonModel()) == null) ? null : commonModel3.enterFrom;
        CommentContextSource commentContextSourceGL4 = ((DefaultCommentPageContainerFragment) this.l1).GL();
        Aweme aweme = (commentContextSourceGL4 == null || (commonModel2 = commentContextSourceGL4.getCommonModel()) == null) ? null : commonModel2.aweme;
        CommentContextSource commentContextSourceGL5 = ((DefaultCommentPageContainerFragment) this.l1).GL();
        if (commentContextSourceGL5 != null && (commonModel = commentContextSourceGL5.getCommonModel()) != null) {
            str = commonModel.enterMethod;
        }
        c0qqtHS.e3(i2, i3, boolLIZIZ, new C667180QEy(aweme, str2, str));
    }

    public static final void run$0(ARunnableS7S0202000_21 aRunnableS7S0202000_21) {
        boolean zLIZ;
        C1C7U.LIZ("DefaultCommentPageContainerFragment@bdd4.onViewCreated$2$4$onStateChanged$1");
        try {
            aRunnableS7S0202000_21.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DefaultCommentPageContainerFragment@bdd4.onViewCreated$2$4$onStateChanged$1");
    }

    public static final void run$1(ARunnableS7S0202000_21 aRunnableS7S0202000_21) {
        boolean zLIZ;
        TuxTextView tuxTextView;
        C1C7U.LIZ("ShareSheetPanelFragment@267a.onKeyboardHeightChange$3");
        try {
            C1366200lek c1366200lek = (C1366200lek) aRunnableS7S0202000_21.l0;
            if (c1366200lek != null && (tuxTextView = (TuxTextView) c1366200lek.findViewById(R.id.ofa)) != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            C1366200lek c1366200lek2 = (C1366200lek) aRunnableS7S0202000_21.l0;
            if (c1366200lek2 != null) {
                HandlerHook.viewPost(c1366200lek2, new ARunnableS8S0102000_21((ShareSheetPanelFragment) aRunnableS7S0202000_21.l1, aRunnableS7S0202000_21.i2, aRunnableS7S0202000_21.i3, 2));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShareSheetPanelFragment@267a.onKeyboardHeightChange$3");
    }

    public static final void run$2(ARunnableS7S0202000_21 aRunnableS7S0202000_21) {
        boolean zLIZ;
        C1C7U.LIZ("SubscribeMaskLayerWidget@b038.bindViewHolderData$3$1");
        try {
            int i = aRunnableS7S0202000_21.i2;
            int i2 = aRunnableS7S0202000_21.i3;
            C1324840ka2.LJI(((SubscribeMaskLayerWidget) aRunnableS7S0202000_21.l0).LLJILJIL, (UrlModel) aRunnableS7S0202000_21.l1, i, i2, C1393420mMe.LIZ((i * 1.0f) / i2));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SubscribeMaskLayerWidget@b038.bindViewHolderData$3$1");
    }

    public static final void run$3(ARunnableS7S0202000_21 aRunnableS7S0202000_21) {
        boolean zLIZ;
        C1C7U.LIZ("PaidEventMaskLayerWidget@d98a.bindViewHolderData$2$1");
        try {
            int i = aRunnableS7S0202000_21.i2;
            int i2 = aRunnableS7S0202000_21.i3;
            C1324840ka2.LJI(((PaidEventMaskLayerWidget) aRunnableS7S0202000_21.l0).LLJILJILJ, (UrlModel) aRunnableS7S0202000_21.l1, i, i2, C1393420mMe.LIZ((i * 1.0f) / i2));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PaidEventMaskLayerWidget@d98a.bindViewHolderData$2$1");
    }

    public static final void run$4(ARunnableS7S0202000_21 aRunnableS7S0202000_21) {
        boolean zLIZ;
        C1C7U.LIZ("LivePreviewPausedWidget@78b.bindPauseView$1$1");
        try {
            C1324840ka2.LJI(((LivePreviewPausedWidget) aRunnableS7S0202000_21.l0).M1(), (UrlModel) aRunnableS7S0202000_21.l1, aRunnableS7S0202000_21.i2, aRunnableS7S0202000_21.i3, C1393420mMe.LIZ((aRunnableS7S0202000_21.i2 * 1.0f) / aRunnableS7S0202000_21.i3));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePreviewPausedWidget@78b.bindPauseView$1$1");
    }

    public ARunnableS7S0202000_21(int i, int i2, Object obj, Object obj2, int i3) {
        this.$t = i3;
        this.i2 = i;
        this.i3 = i2;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
