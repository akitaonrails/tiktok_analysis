package X;

import Y.ARunnableS30S0110000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarRightAssem;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeEntranceFeature;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandTextViewModel;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.utils.FixedKeyboardMonitor;
import com.ss.android.ugc.aweme.video.hashtag.feedback.KeyboardStateViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0ZtK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC913960ZtK implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC913960ZtK viewTreeObserverOnGlobalLayoutListenerC913960ZtK) {
        String secUid;
        if (((TuxAlertBadgeLayout) viewTreeObserverOnGlobalLayoutListenerC913960ZtK.l0).isShown() && ((SingleTitleBarRightAssem) viewTreeObserverOnGlobalLayoutListenerC913960ZtK.l1).LLJJL) {
            C425710Gmf.LIZ.getClass();
            if (!C425710Gmf.LIZIZ && ((TuxAlertBadgeLayout) viewTreeObserverOnGlobalLayoutListenerC913960ZtK.l0).getVisibility() == 0) {
                SingleTitleBarRightAssem singleTitleBarRightAssem = (SingleTitleBarRightAssem) viewTreeObserverOnGlobalLayoutListenerC913960ZtK.l1;
                singleTitleBarRightAssem.LLJJL = false;
                C909290Zln c909290ZlnHp = singleTitleBarRightAssem.hp();
                if (c909290ZlnHp != null) {
                    TuxAlertBadgeLayout tuxAlertBadgeLayout = (TuxAlertBadgeLayout) viewTreeObserverOnGlobalLayoutListenerC913960ZtK.l0;
                    UIAssem uIAssem = (UIAssem) viewTreeObserverOnGlobalLayoutListenerC913960ZtK.l2;
                    VibeEntranceFeature vibeEntranceFeatureLIZ = VibeEntranceFeature.LIZ.LIZ();
                    if (vibeEntranceFeatureLIZ != null) {
                        String conversationId = c909290ZlnHp.getConversationId();
                        String singleChatFromUserId = c909290ZlnHp.getSingleChatFromUserId();
                        if (singleChatFromUserId == null) {
                            singleChatFromUserId = "";
                        }
                        IMUser singleChatFromUser = c909290ZlnHp.getSingleChatFromUser();
                        if (singleChatFromUser != null) {
                            secUid = singleChatFromUser.getSecUid();
                        } else {
                            secUid = null;
                        }
                        vibeEntranceFeatureLIZ.LJIIIIZZ(conversationId, singleChatFromUserId, secUid, tuxAlertBadgeLayout, EnumC2007507th.TOP_TITLE_BAR, c909290ZlnHp.getUuid(), new AwS558S0100000_14(uIAssem, 495));
                    }
                }
                C786410Ut5.C3(((TuxAlertBadgeLayout) viewTreeObserverOnGlobalLayoutListenerC913960ZtK.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC913960ZtK);
            }
        }
    }

    public static final void onGlobalLayout$1(final ViewTreeObserverOnGlobalLayoutListenerC913960ZtK viewTreeObserverOnGlobalLayoutListenerC913960ZtK) {
        ((VideoPublishContainerScene) viewTreeObserverOnGlobalLayoutListenerC913960ZtK.l2).LLLLIIL = viewTreeObserverOnGlobalLayoutListenerC913960ZtK;
        View viewFindViewById = ((View) viewTreeObserverOnGlobalLayoutListenerC913960ZtK.l0).findViewById(R.id.mez);
        Context context = ((VideoPublishContainerScene) viewTreeObserverOnGlobalLayoutListenerC913960ZtK.l2).getContext();
        if (context == null) {
            return;
        }
        if (viewFindViewById == null) {
            final View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.d7o, null);
            RelativeLayout relativeLayout = (RelativeLayout) viewTreeObserverOnGlobalLayoutListenerC913960ZtK.l1;
            relativeLayout.addView(viewLJLLJ, relativeLayout.getWidth(), ((RelativeLayout) viewTreeObserverOnGlobalLayoutListenerC913960ZtK.l1).getHeight());
            C786410Ut5.T4(viewLJLLJ, 0.196f);
            final View viewFindViewById2 = ((View) viewTreeObserverOnGlobalLayoutListenerC913960ZtK.l0).findViewById(R.id.aff);
            C786410Ut5.T4(viewFindViewById2, 0.196f);
            C786410Ut5.I7(new C0IJO(), viewLJLLJ);
            C786410Ut5.I7(new C0IJO(), viewFindViewById2);
            C1443400nfG.LJIIJ(viewLJLLJ);
            C856850XjP c856850XjP = ((VideoPublishContainerScene) viewTreeObserverOnGlobalLayoutListenerC913960ZtK.l2).LLLF;
            InterfaceC459810I1j interfaceC459810I1j = new InterfaceC459810I1j() { // from class: X.0XgV
                public final ExpandTextViewModel LL;

                @Override // X.InterfaceC459810I1j
                public final void V3() {
                    ViewGroup viewGroup;
                    ((VideoPublishContainerScene) this.LLILZ.l2).LLLLIILL.creativeModel.transientPostPageModel.getClass();
                    KeyboardStateViewModel keyboardStateViewModel = ((VideoPublishContainerScene) this.LLILZ.l2).LLLJIL;
                    if (keyboardStateViewModel != null) {
                        keyboardStateViewModel.runOnUiThread(new ARunnableS30S0110000_11(keyboardStateViewModel, true, 11));
                    }
                    if (C291360BbS.LIZ() && !C1428470nHB.LJJZZI(((VideoPublishContainerScene) this.LLILZ.l2).LLLLIILL)) {
                        this.LL.LLILZ.setValue(new Pair<>(Boolean.TRUE, Boolean.FALSE));
                    }
                    ViewGroup viewGroup2 = ((VideoPublishContainerScene) this.LLILZ.l2).LLLLII;
                    if ((viewGroup2 == null || viewGroup2.getVisibility() != 0) && ((viewGroup = ((VideoPublishContainerScene) this.LLILZ.l2).LLLFF.LJII) == null || viewGroup.getVisibility() != 0)) {
                        ExpandedTitleModule expandedTitleModule = ((VideoPublishContainerScene) this.LLILZ.l2).LLLLLLIL.LJIILIIL;
                        if (expandedTitleModule == null || !expandedTitleModule.LLLLLZIL) {
                            C786410Ut5.LJLLLLLL(0, viewLJLLJ);
                        }
                    } else {
                        C786410Ut5.LJLLLLLL(8, viewLJLLJ);
                    }
                    ((VideoPublishContainerScene) this.LLILZ.l2).LLLF.getClass();
                }

                @Override // X.InterfaceC459810I1j
                public final void ub() {
                    ((VideoPublishContainerScene) this.LLILZ.l2).LLLLIILL.creativeModel.transientPostPageModel.getClass();
                    KeyboardStateViewModel keyboardStateViewModel = ((VideoPublishContainerScene) this.LLILZ.l2).LLLJIL;
                    if (keyboardStateViewModel != null) {
                        keyboardStateViewModel.runOnUiThread(new ARunnableS30S0110000_11(keyboardStateViewModel, false, 11));
                    }
                    if (C291360BbS.LIZ() && !C1428470nHB.LJJZZI(((VideoPublishContainerScene) this.LLILZ.l2).LLLLIILL)) {
                        MutableLiveData<Pair<Boolean, Boolean>> mutableLiveData = this.LL.LLILZ;
                        Boolean bool = Boolean.FALSE;
                        mutableLiveData.setValue(new Pair<>(bool, bool));
                    }
                    C786410Ut5.LJLLLLLL(8, viewLJLLJ);
                    C0LAB c0lab = new C0LAB();
                    C580270MpN.LIZJ(((VideoPublishContainerScene) this.LLILZ.l2).LLLLIILL, c0lab, "video_post_page");
                    C0ZI0 c0zi0 = ((VideoPublishContainerScene) this.LLILZ.l2).LLLILZJ;
                    c0zi0.getClass();
                    String str = (String) new C856400Xig(c0zi0).LIZ(false);
                    str.toString();
                    c0lab.LIZ(!str.isEmpty() ? 1 : 0, "has_text");
                    C20684815ws.LJIILLIIL("keyboard_swipe_down", c0lab.LIZ);
                }

                {
                    this.LL = (ExpandTextViewModel) C1659630tI1.LJFF((VideoPublishContainerScene) this.LLILZ.l2).get(ExpandTextViewModel.class);
                }
            };
            c856850XjP.getClass();
            new FixedKeyboardMonitor(c856850XjP.LIZ.LJJJJ()).LIZ(c856850XjP.LIZIZ, interfaceC459810I1j);
            return;
        }
        if (viewFindViewById.getHeight() >= ((RelativeLayout) viewTreeObserverOnGlobalLayoutListenerC913960ZtK.l1).getHeight()) {
            return;
        }
        viewFindViewById.getLayoutParams().height = ((RelativeLayout) viewTreeObserverOnGlobalLayoutListenerC913960ZtK.l1).getHeight();
    }

    public ViewTreeObserverOnGlobalLayoutListenerC913960ZtK(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
