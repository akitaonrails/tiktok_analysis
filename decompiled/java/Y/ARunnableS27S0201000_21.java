package Y;

import X.C01GW;
import X.C0P0T;
import X.C1340200kyo;
import X.C1340820kzo;
import X.C1341860l1U;
import X.C1343170l3b;
import X.C1344540l5o;
import X.C1345700l7g;
import X.C1354730lMF;
import X.C1356320lOo;
import X.C1357700lR2;
import X.C1361840lXi;
import X.C1362360lYY;
import X.C1364620lcC;
import X.C1366200lek;
import X.C1391600mJi;
import X.C1396820mS8;
import X.C1C7U;
import X.C20600815jK;
import X.C21146717pB;
import X.C21674119s3;
import X.C2188811AlT;
import X.C2250431D6j;
import X.C450720Hlu;
import X.C563400M7u;
import X.C653210Pjj;
import X.C653230Pjl;
import X.C718860SHs;
import X.C719150SIv;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1235690iGF;
import X.InterfaceC1340660kzY;
import X.InterfaceC1362600lYw;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sidesheet.SideSheetBehavior;
import com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.CommentItemCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem;
import com.ss.android.ugc.aweme.commentv2.title.TitlePanelNavAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.aweme.minis.page.main.fragment.ShareSheetPanelFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class ARunnableS27S0201000_21 implements Runnable {
    public final int $t;
    public int i2;
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
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C450720Hlu c450720Hlu = new C450720Hlu(((CommentItemCell) this.l0).itemView.getContext());
        ViewGroup visibleAddCell = ((C1340200kyo) this.l1).getVisibleAddCell();
        if (visibleAddCell == null) {
            visibleAddCell = (C1340200kyo) this.l1;
        }
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = visibleAddCell;
        c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
        c1391600mJi.LJFF = this.i2;
        c1391600mJi.LJIIIZ = true;
        c450720Hlu.LJIIJ(2131821425);
        c450720Hlu.LLILLJJLI.LJII = 3000L;
        C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
        c0p0tLIZIZ.LJIIIZ(new InterfaceC1340660kzY() { // from class: X.0kyb
            @Override // X.InterfaceC1340660kzY
            public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
                if (iTextToImageService != null) {
                    iTextToImageService.LJJIJLIJ();
                }
            }
        });
        c0p0tLIZIZ.show();
    }

    public final void LIZ$1() {
        TuxTextView tuxTextView;
        C1366200lek c1366200lek = (C1366200lek) this.l0;
        if (c1366200lek != null && (tuxTextView = (TuxTextView) c1366200lek.findViewById(R.id.ofa)) != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        C1366200lek c1366200lek2 = (C1366200lek) this.l0;
        int measuredHeight = c1366200lek2 != null ? c1366200lek2.getMeasuredHeight() : 0;
        FrameLayout frameLayout = ((ShareSheetPanelFragment) this.l1).LLJJ;
        int measuredHeight2 = frameLayout != null ? frameLayout.getMeasuredHeight() : 0;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.i2, 0);
        ShareSheetPanelFragment shareSheetPanelFragment = (ShareSheetPanelFragment) this.l1;
        valueAnimatorOfInt.setDuration(100L);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS17S0102000_21(shareSheetPanelFragment, measuredHeight, measuredHeight2, 2));
        valueAnimatorOfInt.start();
    }

    public final void LIZ$2() {
        String strLJIIIZ;
        String strLIZJ;
        IMUser iMUser;
        HashMap<String, String> map = new HashMap<>();
        ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
        Object objValueOf = "";
        if (contactFeatureLIZ == null || (strLJIIIZ = contactFeatureLIZ.LJIIIZ((IMContact) this.l0)) == null) {
            strLJIIIZ = "";
        }
        map.put("to_user_id", strLJIIIZ);
        map.put("rank_index", String.valueOf(this.i2));
        IMContact iMContact = (IMContact) this.l0;
        map.put("icon_type", iMContact instanceof IMUser ? "private" : iMContact instanceof IMConversation ? "group" : "");
        IMContact iMContact2 = (IMContact) this.l0;
        if (iMContact2 instanceof IMUser) {
            C1364620lcC.LIZ.getClass();
            strLIZJ = C1364620lcC.LIZJ(iMContact2, "");
        } else {
            strLIZJ = "";
        }
        map.put("share_relation_type", strLIZJ);
        map.put("panel_source", "share_panel");
        IMContact iMContact3 = (IMContact) this.l0;
        if ((iMContact3 instanceof IMUser) && (iMUser = (IMUser) iMContact3) != null) {
            objValueOf = Integer.valueOf(iMUser.getFollowStatus());
        }
        map.put("share_follow_status", objValueOf.toString());
        InterfaceC1362600lYw interfaceC1362600lYw = ((C1362360lYY) this.l1).LIZ.LJ;
        if (interfaceC1362600lYw != null) {
            interfaceC1362600lYw.LIZLLL(map);
        }
    }

    public final void LIZ$3() {
        View view;
        View viewFindViewById;
        int height;
        Fragment fragmentLJI;
        View view2;
        View viewFindViewById2;
        View view3;
        View viewFindViewById3;
        View view4;
        View viewFindViewById4;
        if (this.i2 <= 0 && !C1343170l3b.LIZ) {
            C786410Ut5.LJLLLLLL(4, (View) this.l0);
            return;
        }
        C718860SHs.LIZ.getClass();
        boolean z = C719150SIv.LIZ;
        if (z || C1343170l3b.LIZ) {
            C786410Ut5.LJLLLLLL(0, (View) this.l0);
        }
        TitlePanelNavAssem titlePanelNavAssem = (TitlePanelNavAssem) this.l1;
        titlePanelNavAssem.getClass();
        boolean z2 = C1343170l3b.LIZ;
        boolean z3 = true;
        if (z2) {
            Fragment fragmentLJI2 = C724240Sb0.LJI(titlePanelNavAssem);
            if (fragmentLJI2 != null && (view3 = fragmentLJI2.getView()) != null && (viewFindViewById3 = view3.findViewById(R.id.y2i)) != null) {
                int iLIZ = C653230Pjl.LIZ(viewFindViewById3);
                Fragment fragmentLJI3 = C724240Sb0.LJI(titlePanelNavAssem);
                height = iLIZ + ((fragmentLJI3 == null || (view4 = fragmentLJI3.getView()) == null || (viewFindViewById4 = view4.findViewById(R.id.mh9)) == null) ? 0 : viewFindViewById4.getHeight()) + titlePanelNavAssem.LLJJIII;
                fragmentLJI = C724240Sb0.LJI(titlePanelNavAssem);
                if (fragmentLJI != null || (view2 = fragmentLJI.getView()) == null || (viewFindViewById2 = view2.findViewById(R.id.t0h)) == null || C653230Pjl.LIZ(viewFindViewById2) > height) {
                }
            }
            z3 = false;
        } else {
            Fragment fragmentLJI4 = C724240Sb0.LJI(titlePanelNavAssem);
            if (fragmentLJI4 != null && (view = fragmentLJI4.getView()) != null && (viewFindViewById = view.findViewById(R.id.y2i)) != null) {
                int[] iArr = C653210Pjj.LIZIZ;
                viewFindViewById.getLocationOnScreen(iArr);
                height = viewFindViewById.getHeight() + iArr[1];
                fragmentLJI = C724240Sb0.LJI(titlePanelNavAssem);
                if (fragmentLJI != null) {
                }
            }
            z3 = false;
        }
        if (!z3) {
            TuxTextView tuxTextView = ((TitlePanelNavAssem) this.l1).LLJIJIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            TuxIconView tuxIconView = ((TitlePanelNavAssem) this.l1).LLJILJIL;
            if (tuxIconView != null) {
                C786410Ut5.LJLLLLLL(8, tuxIconView);
            }
            TuxIconView tuxIconView2 = ((TitlePanelNavAssem) this.l1).LLJILJILJ;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            }
            if (z || z2) {
                return;
            }
            C786410Ut5.LJLLLLLL(4, (View) this.l0);
            return;
        }
        TuxTextView tuxTextView2 = ((TitlePanelNavAssem) this.l1).LLJIJIL;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
        }
        TitlePanelNavAssem titlePanelNavAssem2 = (TitlePanelNavAssem) this.l1;
        if (titlePanelNavAssem2.LLJJI) {
            TuxIconView tuxIconView3 = titlePanelNavAssem2.LLJILJIL;
            if (tuxIconView3 != null) {
                C786410Ut5.LJLLLLLL(0, tuxIconView3);
            }
        } else {
            TuxIconView tuxIconView4 = titlePanelNavAssem2.LLJILJIL;
            if (tuxIconView4 != null) {
                C786410Ut5.LJLLLLLL(8, tuxIconView4);
            }
        }
        ((TitlePanelNavAssem) this.l1).Go();
        if (z) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, (View) this.l0);
    }

    public final void LIZ$4() {
        Context context = (Context) this.l0;
        Context contextLIZIZ = context != null ? C1354730lMF.LIZIZ(context) : null;
        if (contextLIZIZ == null) {
            C21146717pB.LJFF(null, "comment_refactor_group_1234567", (List) this.l1);
        } else {
            C01GW<Map<String, Integer>> c01gw = C1357700lR2.LJFF;
            for (Pair pair : C1356320lOo.LIZIZ(contextLIZIZ, (List) this.l1)) {
                C21146717pB.LJFF((Context) pair.getFirst(), "comment_refactor_group_1234567", (List) pair.getSecond());
            }
        }
        C1344540l5o.LIZ.getClass();
        ((C563400M7u) C1344540l5o.LJIIL.getValue()).LJ(this.i2 + 3);
    }

    public final void LIZ$5() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> c20600815jKLIZJ;
        RecyclerView recyclerView = (RecyclerView) this.l0;
        if (!(recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) || (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView) == null || (c20600815jKLIZJ = C1345700l7g.LIZJ(viewOnAttachStateChangeListenerC20604515jv)) == null) {
            return;
        }
        Aweme aweme = (Aweme) this.l1;
        int i = this.i2;
        C2250431D6j c2250431D6j = C2250431D6j.LIZ;
        String aid = aweme != null ? aweme.getAid() : null;
        c2250431D6j.getClass();
        Comment commentLIZIZ = C2250431D6j.LIZIZ(aweme, aid);
        List<InterfaceC1891350zJl> listLJII = c20600815jKLIZJ.LJII();
        if (i < ((ArrayList) listLJII).size() && (ListProtector.get(listLJII, i) instanceof C1340820kzo)) {
            i++;
        }
        C1341860l1U c1341860l1U = new C1341860l1U(commentLIZIZ, i, aweme);
        C1361840lXi c1361840lXi = C1361840lXi.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addDataInternalV2 realPos=");
        sbLIZ.append(i);
        sbLIZ.append(", size=");
        sbLIZ.append(c20600815jKLIZJ.LJIIIIZZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1361840lXi.getClass();
        C1361840lXi.LIZ(strLIZIZ);
        if (i >= c20600815jKLIZJ.LJIIIIZZ()) {
            C20600815jK.LIZJ(c20600815jKLIZJ, c1341860l1U);
        } else {
            C20600815jK.LIZIZ(c20600815jKLIZJ, i, c1341860l1U);
        }
    }

    public static final void run$0(ARunnableS27S0201000_21 aRunnableS27S0201000_21) {
        boolean zLIZ;
        C1C7U.LIZ("AsyncDanmakuController@3623.clear$1");
        try {
            ((C1396820mS8) aRunnableS27S0201000_21.l0).LJIIIIZZ.LIZIZ(aRunnableS27S0201000_21.i2, (Function1) aRunnableS27S0201000_21.l1);
            if (aRunnableS27S0201000_21.i2 == 1000) {
                ((C1396820mS8) aRunnableS27S0201000_21.l0).LJJIIZI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AsyncDanmakuController@3623.clear$1");
    }

    public static final void run$1(ARunnableS27S0201000_21 aRunnableS27S0201000_21) {
        boolean zLIZ;
        C1C7U.LIZ("SideSheetBehavior@b35f.setState$2");
        try {
            ((SideSheetBehavior) aRunnableS27S0201000_21.l1).LIZ(aRunnableS27S0201000_21.i2, (View) aRunnableS27S0201000_21.l0, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SideSheetBehavior@b35f.setState$2");
    }

    public static final void run$10(ARunnableS27S0201000_21 aRunnableS27S0201000_21) {
        boolean zLIZ;
        C1C7U.LIZ("CommentPerfOptV2@e9fe.onViewMoreReplyClicked$1");
        try {
            aRunnableS27S0201000_21.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentPerfOptV2@e9fe.onViewMoreReplyClicked$1");
    }

    public static final void run$11(ARunnableS27S0201000_21 aRunnableS27S0201000_21) {
        boolean zLIZ;
        C1C7U.LIZ("LynxPreLayoutManager@ebe2.addDataInternalV2$1");
        try {
            aRunnableS27S0201000_21.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxPreLayoutManager@ebe2.addDataInternalV2$1");
    }

    public static final void run$2(ARunnableS27S0201000_21 aRunnableS27S0201000_21) {
        boolean zLIZ;
        C1C7U.LIZ("CommentItemCell@9539.updateAddAsPostButton$1$3");
        try {
            aRunnableS27S0201000_21.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentItemCell@9539.updateAddAsPostButton$1$3");
    }

    public static final void run$3(ARunnableS27S0201000_21 aRunnableS27S0201000_21) {
        boolean zLIZ;
        C1C7U.LIZ("CommentPowerListAssem@dc7a.onViewCreated$1$2$onScrolled$1$1");
        try {
            CommentPowerListAssem commentPowerListAssem = (CommentPowerListAssem) aRunnableS27S0201000_21.l0;
            IPageActionBarAbility iPageActionBarAbility = commentPowerListAssem.LLLJIL;
            if (iPageActionBarAbility != null) {
                int i = aRunnableS27S0201000_21.i2;
                commentPowerListAssem.mp();
                iPageActionBarAbility.Li1(((View) aRunnableS27S0201000_21.l1).getBottom(), i, null, Integer.valueOf(((View) aRunnableS27S0201000_21.l1).getBottom()));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentPowerListAssem@dc7a.onViewCreated$1$2$onScrolled$1$1");
    }

    public static final void run$4(ARunnableS27S0201000_21 aRunnableS27S0201000_21) {
        boolean zLIZ;
        C1C7U.LIZ("CommentPowerListAssem@dc7a.onViewCreated$1$2$onScrolled$1$2");
        try {
            CommentPowerListAssem commentPowerListAssem = (CommentPowerListAssem) aRunnableS27S0201000_21.l0;
            IPageActionBarAbility iPageActionBarAbility = commentPowerListAssem.LLLJIL;
            if (iPageActionBarAbility != null) {
                int i = aRunnableS27S0201000_21.i2;
                commentPowerListAssem.mp();
                iPageActionBarAbility.Li1(((View) aRunnableS27S0201000_21.l1).getY(), i, null, Integer.valueOf(((CommentPowerListAssem) aRunnableS27S0201000_21.l0).LLLJL.height()));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentPowerListAssem@dc7a.onViewCreated$1$2$onScrolled$1$2");
    }

    public static final void run$5(ARunnableS27S0201000_21 aRunnableS27S0201000_21) {
        boolean zLIZ;
        C1C7U.LIZ("ShareSheetPanelFragment@267a.onClosed$3$1");
        try {
            aRunnableS27S0201000_21.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShareSheetPanelFragment@267a.onClosed$3$1");
    }

    public static final void run$6(ARunnableS27S0201000_21 aRunnableS27S0201000_21) {
        boolean zLIZ;
        C1C7U.LIZ("ShareSheetPanelFragment@267a.onClosed$3");
        try {
            C1366200lek c1366200lek = (C1366200lek) aRunnableS27S0201000_21.l0;
            if (c1366200lek != null) {
                HandlerHook.viewPost(c1366200lek, new ARunnableS27S0201000_21(aRunnableS27S0201000_21.i2, c1366200lek, (ShareSheetPanelFragment) aRunnableS27S0201000_21.l1, 5));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShareSheetPanelFragment@267a.onClosed$3");
    }

    public static final void run$7(ARunnableS27S0201000_21 aRunnableS27S0201000_21) {
        boolean zLIZ;
        C1C7U.LIZ("NormalContactClickHandler@3dec.reportIconShow$1");
        try {
            aRunnableS27S0201000_21.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NormalContactClickHandler@3dec.reportIconShow$1");
    }

    public static final void run$8(ARunnableS27S0201000_21 aRunnableS27S0201000_21) {
        boolean zLIZ;
        C21674119s3 c21674119s3;
        C1C7U.LIZ("InboxFragmentV2@d7b5.scrollToTopPosition$1");
        try {
            C21674119s3 c21674119s32 = ((InboxFragmentV2) aRunnableS27S0201000_21.l0).LLJLL;
            if (c21674119s32 == null) {
                c21674119s3 = null;
            } else {
                c21674119s3 = c21674119s32;
            }
            c21674119s3.LIZ = aRunnableS27S0201000_21.i2;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) aRunnableS27S0201000_21.l1;
            if (c21674119s32 == null) {
                c21674119s32 = null;
            }
            linearLayoutManager.startSmoothScroll(c21674119s32);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InboxFragmentV2@d7b5.scrollToTopPosition$1");
    }

    public static final void run$9(ARunnableS27S0201000_21 aRunnableS27S0201000_21) {
        boolean zLIZ;
        C1C7U.LIZ("TitlePanelNavAssem@9357.handleScrollVisibility$1");
        try {
            aRunnableS27S0201000_21.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TitlePanelNavAssem@9357.handleScrollVisibility$1");
    }

    public ARunnableS27S0201000_21(View view, SideSheetBehavior sideSheetBehavior, int i) {
        this.$t = i;
        this.l0 = view;
        this.l1 = sideSheetBehavior;
        this.i2 = 3;
    }

    public ARunnableS27S0201000_21(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
