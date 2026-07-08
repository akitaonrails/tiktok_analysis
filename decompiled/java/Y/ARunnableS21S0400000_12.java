package Y;

import X.AbstractC19994813Le;
import X.AbstractC848400XPy;
import X.AnonymousClass1855;
import X.C0T89;
import X.C0TL3;
import X.C0TNP;
import X.C0TNQ;
import X.C0XQ7;
import X.C1097950eg5;
import X.C10GR;
import X.C118300cf;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1391990mKL;
import X.C13LZ;
import X.C185F;
import X.C19EG;
import X.C1C7U;
import X.C2189821An6;
import X.C259800zU;
import X.C354710DvR;
import X.C418440Gaw;
import X.C473410IhP;
import X.C497740JfY;
import X.C500260Jjc;
import X.C729510SjV;
import X.C745190TKz;
import X.C782920UnS;
import X.C783810Uot;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.InterfaceC472150IfN;
import X.InterfaceC782930UnT;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewHistoryAuthorizationFragment;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewHistoryAuthorizationFragmentV2;
import com.ss.android.ugc.aweme.feed.adapter.widget.aisummary.AlphaSpan;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem;
import com.ss.android.ugc.aweme.story.experiment.viewlist.DisablePostViewerListExp;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS221S0300000_12;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.LivePodcastResponse;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS21S0400000_12 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ((ArrayList) ((C0T89) this.l0).LLILZIL).remove((ViewPropertyAnimator) this.l1);
        C786410Ut5.T4((View) this.l2, 1.0f);
        C786410Ut5.LJLLLLLL(8, (View) this.l2);
        Function0 function0 = (Function0) ((C259800zU) this.l3).element;
        if (function0 != null) {
            function0.invoke();
        }
        ((C259800zU) this.l3).element = null;
    }

    public final void LIZ$1() {
        User author;
        String aid;
        Context context = (Context) this.l0;
        Aweme aweme = (Aweme) this.l1;
        final String eventType = ((C2189821An6) this.l2).getEventType();
        final String str = "";
        if (eventType == null) {
            eventType = "";
        }
        int pageType = ((C2189821An6) this.l2).getPageType();
        if (C729510SjV.LJJ(aweme) || !DisablePostViewerListExp.INSTANCE.disable() || VideoViewHistoryAuthorizationFragment.LLJILJILJ.getValue().booleanValue()) {
            if (C0TNQ.LIZJ()) {
                if (!C0TNQ.LJFF()) {
                    boolean zLIZJ = ((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(aweme != null ? AwemeExtKt.getAuthorUid(aweme) : null);
                    boolean z = Intrinsics.LJFF(eventType, "personal_homepage") && (pageType == 1000 || pageType == 40) && zLIZJ && C0TNQ.LJIIIIZZ(aweme) && C0TNQ.LIZLLL(aweme) > 0;
                    if ((Intrinsics.LJFF(eventType, "homepage_friends") || Intrinsics.LJFF(eventType, "others_homepage")) && !zLIZJ && aweme != null && (author = aweme.getAuthor()) != null && author.getFollowStatus() == 2) {
                        z = true;
                    }
                    if (C0TNQ.LIZ() && z) {
                        if (PopupManager.LJI()) {
                            return;
                        }
                        final C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                        if (aweme != null && (aid = aweme.getAid()) != null) {
                            str = aid;
                        }
                        PopupManager.LJIJI(new C10GR(c19egLIZIZ, eventType, str) { // from class: X.0TMs
                            public final C19EG LL;
                            public final String LLILLJJLI;
                            public final String LLILLL;
                            public final int LLILZ = 380;

                            @Override // X.InterfaceC20660415sw
                            public final C688120Qyw i2() {
                                C19EG c19eg = this.LL;
                                return new C688120Qyw(c19eg, c19eg, null);
                            }

                            @Override // X.InterfaceC20660515sx
                            public final int getPriority() {
                                return this.LLILZ;
                            }

                            @Override // X.InterfaceC20659015si
                            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                if (((Number) C18011073p.LIZ.getValue()).intValue() == 2) {
                                    C19EG c19eg = this.LL;
                                    String str2 = this.LLILLJJLI;
                                    String str3 = this.LLILLL;
                                    DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY = new DialogInterfaceOnDismissListenerC786080UsY(c20656615sK, 22);
                                    Activity activityLIZ = C1388190mED.LIZ(c19eg);
                                    if (activityLIZ instanceof C19EG) {
                                        VideoViewHistoryAuthorizationFragmentV2 videoViewHistoryAuthorizationFragmentV2 = new VideoViewHistoryAuthorizationFragmentV2();
                                        Bundle bundle = new Bundle();
                                        C786410Ut5.LJJJI("page_type", str2, bundle);
                                        bundle.putBoolean("is_auto_pop", true);
                                        C786410Ut5.LJJJI("aid", str3, bundle);
                                        videoViewHistoryAuthorizationFragmentV2.setArguments(bundle);
                                        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                                        TuxSheet tuxSheet = c1390920mIc.LIZ;
                                        tuxSheet.LLJJIJI = videoViewHistoryAuthorizationFragmentV2;
                                        tuxSheet.LLJLILLLLZIIL = false;
                                        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC786070UsX(dialogInterfaceOnDismissListenerC786080UsY, videoViewHistoryAuthorizationFragmentV2, 2);
                                        c1390920mIc.LJIIIIZZ(0);
                                        c1390920mIc.LIZ.show(((C19EG) activityLIZ).getSupportFragmentManager(), "VideoViewHistoryPopV2");
                                    }
                                } else {
                                    C745610TMp.LIZ(this.LL, this.LLILLJJLI, true, this.LLILLL, new DialogInterfaceOnDismissListenerC786080UsY(c20656615sK, 21));
                                }
                                int iIntValue = ((Number) C074P.LIZ.getValue()).intValue();
                                C0TNQ.LIZIZ = false;
                                C0TNQ.LIZ.getClass();
                                C0TSK.LJFF(C0TNQ.LJ("local_pop_up_show_frequency"), Integer.valueOf(iIntValue));
                                C622680Oba.LIZIZ(new Object() { // from class: X.0TMt
                                });
                            }

                            {
                                this.LL = c19egLIZIZ;
                                this.LLILLJJLI = eventType;
                                this.LLILLL = str;
                            }
                        }, true);
                        return;
                    }
                }
                C844470XAv.LIZ.getClass();
                if (!TextUtils.equals(C844470XAv.LJIILL, "local_test") || C1388190mED.LIZ(context) != null) {
                }
            } else {
                C844470XAv.LIZ.getClass();
                if (!TextUtils.equals(C844470XAv.LJIILL, "local_test") || C1388190mED.LIZ(context) != null) {
                }
            }
        }
        C0TNP.LIZ.getClass();
        if (C0TNP.LIZ()) {
            ((Function0) this.l3).invoke();
        }
    }

    public final void LIZ$2() {
        C745190TKz c745190TKz = (C745190TKz) this.l0;
        if (c745190TKz.LIZIZ >= ((ArrayList) c745190TKz.LIZJ).size()) {
            C0TL3 c0tl3 = (C0TL3) this.l2;
            if (c0tl3 != null) {
                c0tl3.LIZ();
                return;
            }
            return;
        }
        C745190TKz c745190TKz2 = (C745190TKz) this.l0;
        ((AlphaSpan) ListProtector.get(c745190TKz2.LIZJ, c745190TKz2.LIZIZ)).alpha = 225;
        ((C745190TKz) this.l0).LIZIZ++;
        ((TextView) this.l1).invalidate();
        ARunnableS21S0400000_12 aRunnableS21S0400000_12 = ((C745190TKz) this.l0).LIZ;
        if (aRunnableS21S0400000_12 != null) {
            C786410Ut5.LJLIIL(C13LZ.LJIIJJI(AbstractC19994813Le.Default, (C354710DvR) this.l3), C473410IhP.LIZ(), aRunnableS21S0400000_12);
        }
    }

    public final void LIZ$3() {
        int width = ((View) this.l0).getWidth();
        int[] iArr = new int[2];
        ((View) this.l0).getLocationOnScreen(iArr);
        int i = iArr[0];
        int[] iArr2 = new int[2];
        ((View) this.l1).getLocationOnScreen(iArr2);
        int width2 = iArr2[0] + (((View) this.l1).getWidth() / 2);
        int i2 = ((C1097950eg5) this.l2).LLIZLLLIL;
        int i3 = C497740JfY.LJJ() ? ((i + width) - width2) - (i2 / 2) : (width2 - i) - (i2 / 2);
        int i4 = i2 / 2;
        C1097950eg5 c1097950eg5 = (C1097950eg5) this.l2;
        int i5 = c1097950eg5.LLJ;
        if (i3 + i4 + i5 > width) {
            i3 = (width - i4) - i5;
        }
        if (i3 - i4 < i5) {
            i3 = i5 + i4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1097950eg5.getMountainPointer().getLayoutParams();
        marginLayoutParams.setMarginStart(i3);
        C786410Ut5.c6(((C1097950eg5) this.l2).getMountainPointer(), marginLayoutParams);
        C500260Jjc.LLFFF(((C1097950eg5) this.l2).getMountainPointer());
        ((Function0) this.l3).invoke();
    }

    public final void LIZ$4() {
        C118300cf c118300cf = (C118300cf) this.l0;
        int i = c118300cf.element;
        if (i > 0) {
            c118300cf.element = i - 1;
            ((C1391990mKL) this.l1).LIZ(C786410Ut5.j4(C497740JfY.LJIJI(2131854421), Arrays.copyOf(new Object[]{Integer.valueOf(((C118300cf) this.l0).element)}, 1)));
            Runnable runnable = (Runnable) ((C259800zU) this.l2).element;
            if (runnable != null) {
                C786410Ut5.LJLIIL(1000L, (Handler) this.l3, runnable);
            }
        }
    }

    public static final void run$0(ARunnableS21S0400000_12 aRunnableS21S0400000_12) {
        boolean zLIZ;
        C1C7U.LIZ("BannerParentLayout@e264.animateHideGallery$1$1$2");
        try {
            aRunnableS21S0400000_12.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BannerParentLayout@e264.animateHideGallery$1$1$2");
    }

    public static final void run$1(ARunnableS21S0400000_12 aRunnableS21S0400000_12) {
        boolean zLIZ;
        C1C7U.LIZ("CommentServiceImpl@82e3.tryPopUpVideoViewsAuthWindow$1");
        try {
            aRunnableS21S0400000_12.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentServiceImpl@82e3.tryPopUpVideoViewsAuthWindow$1");
    }

    public static final void run$2(ARunnableS21S0400000_12 aRunnableS21S0400000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveAiTextByWordsAnimator@4ca5.animateTextByWords$1");
        try {
            aRunnableS21S0400000_12.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveAiTextByWordsAnimator@4ca5.animateTextByWords$1");
    }

    public static final void run$3(ARunnableS21S0400000_12 aRunnableS21S0400000_12) {
        boolean zLIZ;
        C1C7U.LIZ("RssIntroAssem@3b99.setUpIntroSheet$2");
        try {
            final Context context = (Context) aRunnableS21S0400000_12.l0;
            final RssIntroAssem rssIntroAssem = (RssIntroAssem) aRunnableS21S0400000_12.l1;
            rssIntroAssem.getActualLifecycleOwner();
            final AwS221S0300000_12 awS221S0300000_12 = new AwS221S0300000_12((C1390920mIc) aRunnableS21S0400000_12.l2, (RssIntroAssem) aRunnableS21S0400000_12.l1, (FragmentManager) aRunnableS21S0400000_12.l3, 15);
            PopupManager.LJIJI(new C10GR(context, rssIntroAssem, awS221S0300000_12) { // from class: X.0TMv
                public final Context LL;
                public final LifecycleOwner LLILLJJLI;
                public final Function1<C20656615sK, Unit> LLILLL;
                public final int LLILZ = 2541;

                @Override // X.InterfaceC20660415sw
                public final C688120Qyw i2() {
                    return new C688120Qyw(this.LL, this.LLILLJJLI, null);
                }

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return this.LLILZ;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    this.LLILLL.invoke(c20656615sK);
                }

                {
                    this.LL = context;
                    this.LLILLJJLI = rssIntroAssem;
                    this.LLILLL = awS221S0300000_12;
                }
            }, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RssIntroAssem@3b99.setUpIntroSheet$2");
    }

    public static final void run$4(ARunnableS21S0400000_12 aRunnableS21S0400000_12) {
        boolean zLIZ;
        int iLIZIZ;
        C1C7U.LIZ("SeaFlashSaleEnhancementTagController@6718.createStockContentView$1$1");
        try {
            AnonymousClass1855 anonymousClass1855 = (AnonymousClass1855) aRunnableS21S0400000_12.l0;
            View view = (View) aRunnableS21S0400000_12.l1;
            Integer numValueOf = Integer.valueOf(((FrameLayout) aRunnableS21S0400000_12.l2).getWidth());
            if (numValueOf.intValue() > 0) {
                iLIZIZ = numValueOf.intValue();
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90));
            }
            float f = ((C185F) aRunnableS21S0400000_12.l3).LJII;
            anonymousClass1855.getClass();
            AnonymousClass1855.LJJIFFI(f, iLIZIZ, view);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeaFlashSaleEnhancementTagController@6718.createStockContentView$1$1");
    }

    public static final void run$5(ARunnableS21S0400000_12 aRunnableS21S0400000_12) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewBannerArenaView@9140.pointToAnchorView$1");
        try {
            aRunnableS21S0400000_12.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewBannerArenaView@9140.pointToAnchorView$1");
    }

    public static final void run$6(ARunnableS21S0400000_12 aRunnableS21S0400000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LetsDanceDialogHelper@e61b.showTurnOnCameraPanel$1");
        try {
            aRunnableS21S0400000_12.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LetsDanceDialogHelper@e61b.showTurnOnCameraPanel$1");
    }

    public static final void run$7(ARunnableS21S0400000_12 aRunnableS21S0400000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LivePreviewTabScene@198f.initLivePreview$1$1$6");
        try {
            C782920UnS c782920UnS = (C782920UnS) aRunnableS21S0400000_12.l0;
            if (!c782920UnS.LLJJ || c782920UnS.LLJJJIL) {
                C500260Jjc.LLFFF((SurfaceView) aRunnableS21S0400000_12.l1);
            }
            SurfaceView surfaceView = (SurfaceView) aRunnableS21S0400000_12.l1;
            ((InterfaceC782930UnT) aRunnableS21S0400000_12.l3).setVideoSize(surfaceView.getWidth(), surfaceView.getHeight());
            ((Function0) aRunnableS21S0400000_12.l2).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePreviewTabScene@198f.initLivePreview$1$1$6");
    }

    public static final void run$8(ARunnableS21S0400000_12 aRunnableS21S0400000_12) {
        C783810Uot c783810Uot = (C783810Uot) aRunnableS21S0400000_12.l0;
        InterfaceC472150IfN interfaceC472150IfN = (InterfaceC472150IfN) aRunnableS21S0400000_12.l1;
        LivePodcastResponse.ResponseData responseData = (LivePodcastResponse.ResponseData) aRunnableS21S0400000_12.l2;
        Boolean bool = (Boolean) aRunnableS21S0400000_12.l3;
        c783810Uot.getClass();
        C1C7U.LIZ("LiveServiceAdapter@4348.requestLivePermissionFromCache$1L");
        c783810Uot.LJIILLIIL(interfaceC472150IfN, responseData, bool, Boolean.TRUE);
        c783810Uot.LJIIL();
        C1C7U.LIZIZ("LiveServiceAdapter@4348.requestLivePermissionFromCache$1L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS21S0400000_12(Object obj, Context context, Aweme aweme, C2189821An6 c2189821An6, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = obj;
        this.l1 = context;
        this.l2 = aweme;
        this.l3 = c2189821An6;
    }
}
