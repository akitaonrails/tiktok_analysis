package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.livesdk.game.playtogether.fragment.GameLivePlayTogetherPickedFragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.LiveRepostVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.RepostPanelFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.components.interaction.TakoNewInteractionAssem;
import com.ss.android.ugc.aweme.tako.otherpage.waiting.TakoWaitingListActivity;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;
import webcast.api.room.WebcastRoomRepostRepostersResponse;

/* JADX INFO: renamed from: X.0yct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1864770yct implements ViewTreeObserver.OnGlobalLayoutListener {
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
            case 4:
                onGlobalLayout$4(this);
                break;
            case 5:
                onGlobalLayout$5(this);
                break;
            case 6:
                onGlobalLayout$6(this);
                break;
            case 7:
                onGlobalLayout$7(this);
                break;
            case 8:
                onGlobalLayout$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onGlobalLayout$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onGlobalLayout$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onGlobalLayout$11(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct) {
        ((TakoWaitingListActivity) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLLLLZL().getWindowVisibleDisplayFrame(new Rect());
        if (r1 - r2.bottom > ((double) ((TakoWaitingListActivity) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLLLLZL().getRootView().getHeight()) * 0.15d) {
            ((TakoWaitingListActivity) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLLLLZL().setCursorVisible(true);
        } else {
            ((TakoWaitingListActivity) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLLLLZL().clearFocus();
            ((TakoWaitingListActivity) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLLLLZL().setCursorVisible(false);
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct) {
        int height;
        RechargeDialogNew rechargeDialogNew = (RechargeDialogNew) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0;
        View viewFindViewById = rechargeDialogNew.LLJJ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view = rechargeDialogNew.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.cao);
            } else {
                viewFindViewById = null;
            }
            rechargeDialogNew.LLJJ = viewFindViewById;
        }
        if (C500260Jjc.LJJJJIZL(viewFindViewById)) {
            return;
        }
        RechargeDialogNew rechargeDialogNew2 = (RechargeDialogNew) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0;
        View viewFindViewById3 = rechargeDialogNew2.LLJJI;
        if (viewFindViewById3 == null) {
            View view2 = rechargeDialogNew2.getView();
            if (view2 != null) {
                viewFindViewById3 = view2.findViewById(R.id.m7k);
            } else {
                viewFindViewById3 = null;
            }
            rechargeDialogNew2.LLJJI = (LinearLayout) viewFindViewById3;
        }
        if (viewFindViewById3 != null) {
            height = viewFindViewById3.getHeight();
        } else {
            height = 0;
        }
        if (((RechargeDialogNew) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).ZR().getHeight() < height + ((RechargeDialogNew) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).ZR().getPaddingTop() + ((RechargeDialogNew) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).ZR().getPaddingBottom()) {
            RechargeDialogNew rechargeDialogNew3 = (RechargeDialogNew) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0;
            View view3 = rechargeDialogNew3.LLJJ;
            if (view3 == null) {
                View view4 = rechargeDialogNew3.getView();
                if (view4 != null) {
                    viewFindViewById2 = view4.findViewById(R.id.cao);
                }
                rechargeDialogNew3.LLJJ = viewFindViewById2;
                view3 = viewFindViewById2;
                if (viewFindViewById2 == null) {
                    return;
                }
            }
            C500260Jjc.LLFFF(view3);
        }
    }

    public static final void onGlobalLayout$10(ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct) {
        ViewTreeObserver viewTreeObserver;
        ImageView imageView = ((GameLivePlayTogetherPickedFragment) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLILLL;
        if (imageView != null && (viewTreeObserver = imageView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1864770yct);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1864770yct, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        GameLivePlayTogetherPickedFragment gameLivePlayTogetherPickedFragment = (GameLivePlayTogetherPickedFragment) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0;
        gameLivePlayTogetherPickedFragment.getClass();
        C086F c086f = C086F.LIZ;
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(gameLivePlayTogetherPickedFragment, 1170);
        c086f.getClass();
        C086F.LJI(awS571S0100000_27);
    }

    public static final void onGlobalLayout$11(ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct) {
        C786410Ut5.C3(((RecyclerView) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1864770yct);
        C1803550x29.LJII = C158B.LIZ();
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct) {
        ((TakoNewInteractionAssem) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).tp();
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct) {
        Layout layout;
        ViewGroup.LayoutParams layoutParams;
        int iLJIIZILJ;
        ViewTreeObserver viewTreeObserver;
        TextView textView = ((C20412314u1) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLJILJILJ;
        if (textView != null && (viewTreeObserver = textView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1864770yct);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1864770yct, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        TextView textView2 = ((C20412314u1) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLJILJILJ;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (textView2 != null && (layout = textView2.getLayout()) != null && layout.getLineCount() > 0) {
            LiveIconView liveIconView = ((C20412314u1) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLJILLL;
            if (liveIconView != null) {
                layoutParams = liveIconView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            }
            if (marginLayoutParams != null) {
                if (C497740JfY.LJJ()) {
                    iLJIIZILJ = (C497740JfY.LJIIZILJ() - ((int) (layout.getLineRight(0) - layout.getLineLeft(0)))) - ((int) C497740JfY.LIZIZ(145.0f));
                } else {
                    iLJIIZILJ = (C497740JfY.LJIIZILJ() - ((int) layout.getLineRight(0))) - ((int) C497740JfY.LIZIZ(145.0f));
                }
                marginLayoutParams.setMarginEnd(iLJIIZILJ);
            }
            LiveIconView liveIconView2 = ((C20412314u1) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLJILLL;
            if (liveIconView2 != null) {
                C786410Ut5.w6(liveIconView2, marginLayoutParams);
            }
            LiveIconView liveIconView3 = ((C20412314u1) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLJILLL;
            if (liveIconView3 != null) {
                C12ES.LJIILL(0, liveIconView3);
            }
        }
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct) {
        ViewTreeObserver viewTreeObserver;
        TuxTextView tuxTextView;
        Layout layout;
        TuxTextView tuxTextView2 = ((C21372418kU) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLILLL;
        if (tuxTextView2 != null && tuxTextView2.getLayout() != null && (tuxTextView = ((C21372418kU) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLILLL) != null && (layout = tuxTextView.getLayout()) != null && layout.getEllipsisCount(0) > 0) {
            TuxTextView tuxTextView3 = ((C21372418kU) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLILLL;
            if (tuxTextView3 != null) {
                tuxTextView3.setMaxLines(Integer.MAX_VALUE);
            }
            TuxTextView tuxTextView4 = ((C21372418kU) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLILLL;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextSize(1, 10.0f);
            }
        }
        TuxTextView tuxTextView5 = ((C21372418kU) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLILLL;
        if (tuxTextView5 != null && (viewTreeObserver = tuxTextView5.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1864770yct);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1864770yct, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct) {
        Rect rect = new Rect();
        View view = ((C1793720wmI) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LIZ;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        }
        int iHeight = rect.height();
        C1793720wmI c1793720wmI = (C1793720wmI) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0;
        int i = c1793720wmI.LIZIZ;
        if (i != iHeight && i != 0) {
            InterfaceC1793740wmK interfaceC1793740wmK = c1793720wmI.LIZJ;
            if (interfaceC1793740wmK != null) {
                int i2 = i - iHeight;
                if (i2 > 200) {
                    interfaceC1793740wmK.LJJIIJ(i2);
                } else if (i > iHeight) {
                    interfaceC1793740wmK.LIZIZ();
                } else {
                    int i3 = iHeight - i;
                    if (i3 > 200) {
                        interfaceC1793740wmK.LJZI(i3);
                    } else if (i < iHeight) {
                        interfaceC1793740wmK.LIZIZ();
                    }
                }
            }
            ((C1793720wmI) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LIZIZ = iHeight;
        }
    }

    public static final void onGlobalLayout$6(ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct) {
        Rect rect = new Rect();
        View view = ((C1862740yZc) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LIZ;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        }
        int iHeight = rect.height();
        C1862740yZc c1862740yZc = (C1862740yZc) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0;
        int i = c1862740yZc.LIZIZ;
        if (i == 0) {
            c1862740yZc.LIZIZ = iHeight;
            return;
        }
        if (i == iHeight) {
            return;
        }
        C0H23 c0h23 = c1862740yZc.LIZJ;
        if (c0h23 != null) {
            int i2 = i - iHeight;
            int i3 = c1862740yZc.LIZLLL;
            if (i2 > i3) {
                c0h23.LJJIIJ(i2);
            } else if (i > iHeight) {
                c0h23.LIZIZ();
            } else if (iHeight - i > i3) {
                c0h23.LIZ();
            } else if (i < iHeight) {
                c0h23.LIZIZ();
            }
        }
        ((C1862740yZc) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LIZIZ = iHeight;
    }

    public static final void onGlobalLayout$7(ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct) {
        int iLIZ;
        int height;
        LiveRepostVM liveRepostVM;
        MutableLiveData<List<WebcastRoomRepostRepostersResponse.Reposter>> mutableLiveDataXQ2;
        List<WebcastRoomRepostRepostersResponse.Reposter> value;
        int size;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewTreeObserver viewTreeObserver;
        LinearLayout linearLayout = ((RepostPanelFragment) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLIZLLLIL;
        if (linearLayout != null && (viewTreeObserver = linearLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1864770yct);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1864770yct, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        Context context = ((RepostPanelFragment) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).getContext();
        if (context != null) {
            iLIZ = C497820Jfg.LIZ(context);
        } else {
            iLIZ = 0;
        }
        double d = ((double) iLIZ) * 0.73d;
        LinearLayout linearLayout2 = ((RepostPanelFragment) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLIZLLLIL;
        if (linearLayout2 != null) {
            height = linearLayout2.getHeight();
        } else {
            height = 0;
        }
        double d2 = d - ((double) height);
        if (d2 > 0.0d && (liveRepostVM = ((RepostPanelFragment) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLIZ) != null && (mutableLiveDataXQ2 = liveRepostVM.xQ2()) != null && (value = mutableLiveDataXQ2.getValue()) != null && (size = value.size()) != 0) {
            int iLIZIZ = size * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(76));
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((RepostPanelFragment) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLJILJIL;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (layoutParams2 = viewOnAttachStateChangeListenerC20604515jv.getLayoutParams()) != null) {
                layoutParams2.height = iLIZIZ;
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = ((RepostPanelFragment) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLJILJIL;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                    C786410Ut5.E6(viewOnAttachStateChangeListenerC20604515jv2, layoutParams2);
                }
            }
            double dMin = Math.min(d2, iLIZIZ);
            C21578619ce c21578619ce = ((RepostPanelFragment) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLJIJIL;
            if (c21578619ce != null && (layoutParams = c21578619ce.getLayoutParams()) != null) {
                layoutParams.height = (int) dMin;
                C21578619ce c21578619ce2 = ((RepostPanelFragment) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLJIJIL;
                if (c21578619ce2 != null) {
                    C786410Ut5.o6(c21578619ce2, layoutParams);
                }
            }
        }
    }

    public static final void onGlobalLayout$8(ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct) {
        TuxTextView tuxTextView = (TuxTextView) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0;
        int i = 1;
        if (tuxTextView.getLineCount() > 1) {
            i = 8388611;
        }
        tuxTextView.setGravity(i);
    }

    public static final void onGlobalLayout$9(ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct) {
        int width;
        int i;
        ViewTreeObserver viewTreeObserver;
        C197039127h c197039127hLLLLLL = ((C18XI) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLLLLL();
        if (c197039127hLLLLLL != null && (viewTreeObserver = c197039127hLLLLLL.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1864770yct);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1864770yct, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        AbstractC1776520wKY abstractC1776520wKY = ((C18XI) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLLLILI().LIZ.LJIIIIZZ;
        if (abstractC1776520wKY instanceof C1776510wKX) {
            i = ((C1776510wKX) abstractC1776520wKY).LIZ;
        } else if (abstractC1776520wKY instanceof C1776530wKZ) {
            C197039127h c197039127hLLLLLL2 = ((C18XI) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLLLLL();
            int width2 = 0;
            if (c197039127hLLLLLL2 != null) {
                width = c197039127hLLLLLL2.getWidth();
            } else {
                width = 0;
            }
            C197039127h c197039127hLLLLLJLJLL = ((C18XI) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLLLLJLJLL();
            if (c197039127hLLLLLJLJLL != null) {
                width2 = c197039127hLLLLLJLJLL.getWidth();
            }
            i = (int) ((width + width2) * ((C1776530wKZ) abstractC1776520wKY).LIZ);
        } else {
            throw new C1954807lC();
        }
        C197039127h c197039127hLLLLLL3 = ((C18XI) viewTreeObserverOnGlobalLayoutListenerC1864770yct.l0).LLLLLL();
        if (c197039127hLLLLLL3 != null) {
            c197039127hLLLLLL3.setMinWidth(i);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1864770yct(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
