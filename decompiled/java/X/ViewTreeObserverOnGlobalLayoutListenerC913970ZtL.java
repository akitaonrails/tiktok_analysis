package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.perf.cls.MessageListCLSTrackerImpl;
import com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.image.ExpandedTitleModule;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.utils.FixedKeyboardMonitor;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ZtL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC913970ZtL implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC913970ZtL viewTreeObserverOnGlobalLayoutListenerC913970ZtL) {
        ChatLinearLayoutManager chatLinearLayoutManager;
        MessageListCLSTrackerImpl messageListCLSTrackerImpl = (MessageListCLSTrackerImpl) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0;
        RecyclerView recyclerView = messageListCLSTrackerImpl.LLILZIL;
        if (recyclerView == null) {
            return;
        }
        if (messageListCLSTrackerImpl.LLILLL <= 0 && messageListCLSTrackerImpl.LLILZ <= 0) {
            recyclerView.getGlobalVisibleRect(messageListCLSTrackerImpl.LLIZ);
            MessageListCLSTrackerImpl messageListCLSTrackerImpl2 = (MessageListCLSTrackerImpl) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0;
            ((ArrayList) messageListCLSTrackerImpl2.LLILLJJLI).add(Integer.valueOf(messageListCLSTrackerImpl2.LLIZ.height()));
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof ChatLinearLayoutManager) && (chatLinearLayoutManager = (ChatLinearLayoutManager) layoutManager) != null) {
                MessageListCLSTrackerImpl messageListCLSTrackerImpl3 = (MessageListCLSTrackerImpl) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (RecyclerView.ViewHolder viewHolder : chatLinearLayoutManager.LJIILL(recyclerView)) {
                    View view = viewHolder.itemView;
                    view.getGlobalVisibleRect(messageListCLSTrackerImpl3.LLIZ);
                    linkedHashMap.put(Integer.valueOf(viewHolder.hashCode()), new Pair(Float.valueOf(view.getY()), Integer.valueOf(messageListCLSTrackerImpl3.LLIZ.height())));
                }
                if (!linkedHashMap.isEmpty()) {
                    ((ArrayList) messageListCLSTrackerImpl3.LL).add(linkedHashMap);
                    return;
                }
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC913970ZtL);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC913970ZtL, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC913970ZtL viewTreeObserverOnGlobalLayoutListenerC913970ZtL) {
        ViewTreeObserver viewTreeObserver;
        View viewFindViewById;
        ViewGroup.LayoutParams layoutParams;
        View view = ((InboxFragmentV2) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0).getView();
        if (view != null && view.getWidth() > 0) {
            C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
            c19252910Tv.LIZLLL().LJIIL().LJFF(view.getWidth(), view.getHeight() + C14KQ.LIZLLL(((InboxFragmentV2) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0).getContext()));
            if (!c19252910Tv.LIZLLL().LJIIL().LJI()) {
                ((InboxFragmentV2) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0).getClass();
                try {
                    viewFindViewById = view.findViewById(R.id.kj5);
                    layoutParams = viewFindViewById.getLayoutParams();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (layoutParams != null) {
                    layoutParams.width = -1;
                    C786410Ut5.W5(viewFindViewById, layoutParams);
                    C786410Ut5.LJLLLLLL(8, view.findViewById(R.id.kj4));
                    View view2 = ((InboxFragmentV2) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0).getView();
                    if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) ((InboxFragmentV2) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0).LLLLII.getValue();
                        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                        C2187701Ajg.LIZIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC913970ZtL viewTreeObserverOnGlobalLayoutListenerC913970ZtL) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0;
        if (!videoPublishContainerScene.LLLLIILL.creativeModel.postPageModel.draftPanelModel.draftIconHidden && videoPublishContainerScene.LLLIILIL.getLayout() != null && videoPublishContainerScene.LLLIILIL.getLayout().getEllipsisCount(0) > 0) {
            videoPublishContainerScene.LLLIILIL.setButtonStartIcon(null);
            videoPublishContainerScene.LLLIIL.setButtonStartIcon(null);
            videoPublishContainerScene.LLLLIILL.creativeModel.postPageModel.draftPanelModel.draftIconHidden = true;
        }
        if (videoPublishContainerScene.LLLLIILL.creativeModel.postPageModel.draftPanelModel.draftIconHidden) {
            videoPublishContainerScene.LLLIILIL.setMinTextSize(10.0f);
        }
        videoPublishContainerScene.LLLIIL.setTextSize(0, videoPublishContainerScene.LLLIILIL.getTextSize());
        videoPublishContainerScene.LLLIILIL.requestLayout();
        videoPublishContainerScene.LLLIILIL.invalidate();
        videoPublishContainerScene.LLLIIL.requestLayout();
        videoPublishContainerScene.LLLIIL.invalidate();
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC913970ZtL viewTreeObserverOnGlobalLayoutListenerC913970ZtL) {
        RelativeLayout relativeLayout;
        C1445410niV c1445410niV = (C1445410niV) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0;
        if (c1445410niV.LLJJIJI == null) {
            C856850XjP c856850XjP = null;
            c1445410niV.LLJJIJI = C786410Ut5.LJLLJ(c1445410niV.mActivity, R.layout.d7o, null);
            C1445410niV c1445410niV2 = (C1445410niV) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0;
            RelativeLayout relativeLayout2 = c1445410niV2.LLJJIII;
            if (relativeLayout2 == null) {
                relativeLayout = null;
            } else {
                relativeLayout = relativeLayout2;
            }
            View view = c1445410niV2.LLJJIJI;
            if (relativeLayout2 == null) {
                relativeLayout2 = null;
            }
            int width = relativeLayout2.getWidth();
            C1318700kQ8 c1318700kQ8 = ((C1445410niV) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0).LLJLL;
            if (c1318700kQ8 == null) {
                c1318700kQ8 = null;
            }
            int height = c1318700kQ8.getHeight();
            C1002460cC4 c1002460cC4 = ((C1445410niV) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0).LLJLLIL;
            if (c1002460cC4 == null) {
                c1002460cC4 = null;
            }
            relativeLayout.addView(view, width, height - c1002460cC4.getHeight());
            View view2 = ((C1445410niV) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0).LLJJIJI;
            if (view2 != null) {
                C786410Ut5.T4(view2, 0.196f);
            }
            View view3 = ((C1445410niV) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0).LLJJIJI;
            if (view3 != null) {
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Xjs
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        C857150Xjt.LIZ.getClass();
                        C0LAB c0lab = new C0LAB();
                        C857150Xjt.LIZIZ(c0lab);
                        c0lab.LJ("enter_method", "click_blank");
                        C20684815ws.LJIILLIIL("draft_done_in_edit_post", c0lab.LIZ);
                    }
                }, view3);
            }
            View view4 = ((C1445410niV) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0).LLJJIJI;
            if (view4 != null) {
                C1443400nfG.LJIIJ(view4);
                final C1445410niV c1445410niV3 = (C1445410niV) viewTreeObserverOnGlobalLayoutListenerC913970ZtL.l0;
                C856850XjP c856850XjP2 = c1445410niV3.LLJILJIL;
                if (c856850XjP2 != null) {
                    c856850XjP = c856850XjP2;
                }
                InterfaceC459810I1j interfaceC459810I1j = new InterfaceC459810I1j() { // from class: X.0Xjr
                    @Override // X.InterfaceC459810I1j
                    public final void V3() {
                        C11VI c11vi;
                        View view5;
                        ViewGroup viewGroup;
                        Activity activity = c1445410niV3.mActivity;
                        EditPostedVideoPublishActivity editPostedVideoPublishActivity = activity instanceof EditPostedVideoPublishActivity ? (EditPostedVideoPublishActivity) activity : null;
                        if (editPostedVideoPublishActivity != null) {
                            editPostedVideoPublishActivity.LLLLZLLLI(true);
                        }
                        C1445410niV c1445410niV4 = c1445410niV3;
                        if (c1445410niV4.LLJJIJI != null) {
                            ViewGroup viewGroup2 = c1445410niV4.LLJLILLLLZIIL;
                            if (viewGroup2 == null) {
                                viewGroup2 = null;
                            }
                            if (viewGroup2.getVisibility() == 0 || !((c11vi = c1445410niV3.LLLIIII) == null || (viewGroup = c11vi.LJII) == null || viewGroup.getVisibility() != 0)) {
                                View view6 = c1445410niV3.LLJJIJI;
                                if (view6 != null) {
                                    C786410Ut5.LJLLLLLL(8, view6);
                                    return;
                                }
                                return;
                            }
                            C1445410niV c1445410niV5 = c1445410niV3;
                            C214848196g c214848196g = c1445410niV5.LLLILZ;
                            ExpandedTitleModule expandedTitleModule = (c214848196g != null ? c214848196g : null).LJIILIIL;
                            if ((expandedTitleModule == null || !expandedTitleModule.LLLLLZIL) && (view5 = c1445410niV5.LLJJIJI) != null) {
                                C786410Ut5.LJLLLLLL(0, view5);
                            }
                        }
                    }

                    @Override // X.InterfaceC459810I1j
                    public final void ub() {
                        EditPostedVideoPublishActivity editPostedVideoPublishActivity;
                        Activity activity = c1445410niV3.mActivity;
                        if ((activity instanceof EditPostedVideoPublishActivity) && (editPostedVideoPublishActivity = (EditPostedVideoPublishActivity) activity) != null) {
                            editPostedVideoPublishActivity.LLLLZLLLI(false);
                        }
                        View view5 = c1445410niV3.LLJJIJI;
                        if (view5 != null) {
                            C786410Ut5.LJLLLLLL(8, view5);
                        }
                    }
                };
                c856850XjP.getClass();
                new FixedKeyboardMonitor(c856850XjP.LIZ.LJJJJ()).LIZ(c856850XjP.LIZIZ, interfaceC459810I1j);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC913970ZtL(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
