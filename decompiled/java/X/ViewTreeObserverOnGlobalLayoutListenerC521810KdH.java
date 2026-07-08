package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteNewSinglePhotoWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteTextWidget;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem.FeedEmptyAssem;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS22S0001000_7;
import webcast.api.room.EncourageGoLiveCard;

/* JADX INFO: renamed from: X.0KdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC521810KdH implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH) {
        C0K0Q c0k0q = (C0K0Q) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l1;
        List listLJIIJJI = C1697810uHb.LJIIJJI(c0k0q.LLILLJJLI, c0k0q.LLILLL, c0k0q.LLILZ);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIIJJI) {
            if (((View) obj).getWidth() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 3) {
            C0K0Q.S5(c0k0q, ((C511520K4g.LJI() - ((int) C511520K4g.LIZ(64.0f))) - ((c0k0q.LLILLJJLI.getMeasuredWidth() + c0k0q.LLILLL.getMeasuredWidth()) + c0k0q.LLILZ.getMeasuredWidth())) / 2);
        }
        C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC521810KdH);
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH) {
        int measuredHeight;
        int measuredHeight2;
        ViewGroup.LayoutParams layoutParams;
        C19ME c19me;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int measuredHeight3;
        ViewGroup.LayoutParams layoutParams3;
        C19ME c19me2;
        LiveIconView liveIconView;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.LayoutParams layoutParams6;
        ViewGroup.LayoutParams layoutParams7;
        ViewTreeObserver viewTreeObserver;
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH2 = ((LivePromoteNewSinglePhotoWidget) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l1).LLJJJJ;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC521810KdH2);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC521810KdH2, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        LivePromoteNewSinglePhotoWidget livePromoteNewSinglePhotoWidget = (LivePromoteNewSinglePhotoWidget) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l1;
        View view2 = (View) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0;
        livePromoteNewSinglePhotoWidget.getClass();
        if (view2 != null) {
            int measuredHeight4 = view2.getMeasuredHeight();
            ViewGroup viewGroup = livePromoteNewSinglePhotoWidget.LLIZ;
            if (viewGroup != null) {
                measuredHeight = viewGroup.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            View view3 = livePromoteNewSinglePhotoWidget.LLIZLLLIL;
            if (view3 != null) {
                measuredHeight2 = view3.getMeasuredHeight();
            } else {
                measuredHeight2 = 0;
            }
            int iLIZIZ = ((measuredHeight4 - measuredHeight) - measuredHeight2) - ((int) C497740JfY.LIZIZ(41.0f));
            int iLIZIZ2 = (int) C497740JfY.LIZIZ(36.0f);
            C19ME c19me3 = null;
            ViewGroup.MarginLayoutParams marginLayoutParams4 = null;
            ViewGroup.MarginLayoutParams marginLayoutParams5 = null;
            if (iLIZIZ > iLIZIZ2) {
                View view4 = livePromoteNewSinglePhotoWidget.LLIZLLLIL;
                if (view4 != null) {
                    layoutParams7 = view4.getLayoutParams();
                } else {
                    layoutParams7 = null;
                }
                if ((layoutParams7 instanceof C19ME) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams7) != null) {
                    marginLayoutParams4.bottomMargin = (int) C497740JfY.LIZIZ(40.0f);
                }
                View view5 = livePromoteNewSinglePhotoWidget.LLIZLLLIL;
                if (view5 != null) {
                    C786410Ut5.W5(view5, marginLayoutParams4);
                }
                View view6 = livePromoteNewSinglePhotoWidget.LLIZLLLIL;
                if (view6 != null) {
                    view6.requestLayout();
                    return;
                }
                return;
            }
            int iLIZIZ3 = iLIZIZ2 - ((int) C497740JfY.LIZIZ(8.0f));
            if (iLIZIZ > iLIZIZ3) {
                View view7 = livePromoteNewSinglePhotoWidget.LLIZLLLIL;
                if (view7 != null) {
                    layoutParams5 = view7.getLayoutParams();
                } else {
                    layoutParams5 = null;
                }
                if (layoutParams5 instanceof C19ME) {
                    marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    if (marginLayoutParams3 != null) {
                        marginLayoutParams3.height = (int) C497740JfY.LIZIZ(40.0f);
                    }
                } else {
                    marginLayoutParams3 = null;
                }
                View view8 = livePromoteNewSinglePhotoWidget.LLIZLLLIL;
                if (view8 != null) {
                    C786410Ut5.W5(view8, marginLayoutParams3);
                }
                View view9 = livePromoteNewSinglePhotoWidget.LLIZLLLIL;
                if (view9 != null) {
                    view9.requestLayout();
                }
                View view10 = livePromoteNewSinglePhotoWidget.LLJ;
                if (view10 != null) {
                    layoutParams6 = view10.getLayoutParams();
                } else {
                    layoutParams6 = null;
                }
                if ((layoutParams6 instanceof C19ME) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                    marginLayoutParams5.height = (int) C497740JfY.LIZIZ(40.0f);
                }
                View view11 = livePromoteNewSinglePhotoWidget.LLJ;
                if (view11 == null) {
                    return;
                }
                C786410Ut5.W5(view11, marginLayoutParams5);
                return;
            }
            View view12 = livePromoteNewSinglePhotoWidget.LLIZLLLIL;
            if (view12 != null) {
                layoutParams = view12.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof C19ME) {
                c19me = (C19ME) layoutParams;
                if (c19me != null) {
                    ((ViewGroup.MarginLayoutParams) c19me).height = (int) C497740JfY.LIZIZ(40.0f);
                }
            } else {
                c19me = null;
            }
            int iLIZIZ4 = (int) C497740JfY.LIZIZ(10.0f);
            if (c19me != null) {
                ((ViewGroup.MarginLayoutParams) c19me).topMargin = iLIZIZ4;
            }
            int iLIZIZ5 = (int) C497740JfY.LIZIZ(12.0f);
            if (c19me != null) {
                c19me.bottomToBottom = -1;
            }
            View view13 = livePromoteNewSinglePhotoWidget.LLIZLLLIL;
            if (view13 != null) {
                C426750GoL.LJIIL(view13, Integer.valueOf(iLIZIZ5), Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ5), Integer.valueOf(iLIZIZ4), 16);
            }
            View view14 = livePromoteNewSinglePhotoWidget.LLIZLLLIL;
            if (view14 != null) {
                C786410Ut5.W5(view14, c19me);
            }
            View view15 = livePromoteNewSinglePhotoWidget.LLIZLLLIL;
            if (view15 != null) {
                view15.requestLayout();
            }
            View view16 = livePromoteNewSinglePhotoWidget.LLJ;
            if (view16 != null) {
                layoutParams2 = view16.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if (layoutParams2 instanceof C19ME) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams != null) {
                    marginLayoutParams.height = (int) C497740JfY.LIZIZ(40.0f);
                }
            } else {
                marginLayoutParams = null;
            }
            View view17 = livePromoteNewSinglePhotoWidget.LLJ;
            if (view17 != null) {
                C426750GoL.LJIIL(view17, Integer.valueOf(iLIZIZ5), Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ5), Integer.valueOf(iLIZIZ4), 16);
            }
            View view18 = livePromoteNewSinglePhotoWidget.LLJ;
            if (view18 != null) {
                C786410Ut5.W5(view18, marginLayoutParams);
            }
            int iAbs = iLIZIZ3 - Math.abs(iLIZIZ);
            C19R6 c19r6 = livePromoteNewSinglePhotoWidget.LLJJJJJIL;
            if (c19r6 != null) {
                measuredHeight3 = c19r6.getMeasuredHeight();
            } else {
                measuredHeight3 = -1;
            }
            if (iAbs > 0 && measuredHeight3 > iAbs) {
                C19R6 c19r62 = livePromoteNewSinglePhotoWidget.LLJJJJJIL;
                if (c19r62 != null) {
                    layoutParams4 = c19r62.getLayoutParams();
                } else {
                    layoutParams4 = null;
                }
                if (layoutParams4 instanceof C19ME) {
                    marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.height = measuredHeight3 - iAbs;
                        marginLayoutParams2.width = (int) (((double) (measuredHeight3 - iAbs)) * 0.8d);
                    }
                } else {
                    marginLayoutParams2 = null;
                }
                C19R6 c19r63 = livePromoteNewSinglePhotoWidget.LLJJJJJIL;
                if (c19r63 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19r63);
                    c19r63.setLayoutParams(marginLayoutParams2);
                }
            }
            ViewGroup viewGroup2 = livePromoteNewSinglePhotoWidget.LLIZ;
            if (viewGroup2 != null) {
                layoutParams3 = viewGroup2.getLayoutParams();
            } else {
                layoutParams3 = null;
            }
            if (layoutParams3 instanceof C19ME) {
                c19me2 = (C19ME) layoutParams3;
                if (c19me2 != null) {
                    c19me2.verticalChainStyle = 0;
                    c19me2.bottomToTop = -1;
                }
            } else {
                c19me2 = null;
            }
            ViewGroup viewGroup3 = livePromoteNewSinglePhotoWidget.LLIZ;
            if (viewGroup3 != null) {
                C786410Ut5.X5(c19me2, viewGroup3);
            }
            EncourageGoLiveCard encourageGoLiveCard = livePromoteNewSinglePhotoWidget.LLILZLL;
            if (!encourageGoLiveCard.showNotifyLaterButtonV2 && !encourageGoLiveCard.showNotifyLaterButton && (liveIconView = (LiveIconView) view2.findViewById(R.id.dg7)) != null) {
                ViewGroup.LayoutParams layoutParams8 = liveIconView.getLayoutParams();
                if ((layoutParams8 instanceof C19ME) && (c19me3 = (C19ME) layoutParams8) != null) {
                    c19me3.topToBottom = R.id.csh;
                    ((ViewGroup.MarginLayoutParams) c19me3).bottomMargin = 0;
                    ((ViewGroup.MarginLayoutParams) c19me3).topMargin = (int) C497740JfY.LIZIZ(12.0f);
                }
                C786410Ut5.w6(liveIconView, c19me3);
                liveIconView.requestLayout();
            }
            ViewGroup viewGroup4 = livePromoteNewSinglePhotoWidget.LLIZ;
            if (viewGroup4 == null) {
                return;
            }
            viewGroup4.requestLayout();
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH) {
        int measuredHeight;
        int measuredHeight2;
        ViewGroup.LayoutParams layoutParams;
        C19ME c19me;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams4;
        C19ME c19me2;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams6;
        C19ME c19me3;
        LiveIconView liveIconView;
        ViewTreeObserver viewTreeObserver;
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH2 = ((LivePromoteTextWidget) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l1).LLJZ;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC521810KdH2);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC521810KdH2, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        LivePromoteTextWidget livePromoteTextWidget = (LivePromoteTextWidget) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l1;
        View view2 = (View) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0;
        livePromoteTextWidget.getClass();
        if (view2 != null) {
            int measuredHeight3 = view2.getMeasuredHeight();
            ViewGroup viewGroup = livePromoteTextWidget.LLIZ;
            if (viewGroup != null) {
                measuredHeight = viewGroup.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            int iLIZIZ = (int) C497740JfY.LIZIZ(48.0f);
            View view3 = livePromoteTextWidget.LLIZLLLIL;
            if (view3 != null) {
                measuredHeight2 = view3.getMeasuredHeight();
            } else {
                measuredHeight2 = 0;
            }
            int iLIZIZ2 = (((measuredHeight3 - measuredHeight) - ((int) C497740JfY.LIZIZ(41.0f))) - measuredHeight2) - iLIZIZ;
            int iMax = Math.max(0, iLIZIZ2);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = null;
            if (iMax < ((int) C497740JfY.LIZIZ(176.0f))) {
                ImageView imageView = livePromoteTextWidget.LLJJJJLIIL;
                if (imageView != null) {
                    layoutParams3 = imageView.getLayoutParams();
                } else {
                    layoutParams3 = null;
                }
                if (layoutParams3 instanceof C19ME) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(28.0f);
                    }
                } else {
                    marginLayoutParams = null;
                }
                ImageView imageView2 = livePromoteTextWidget.LLJJJJLIIL;
                if (imageView2 != null) {
                    C786410Ut5.c6(imageView2, marginLayoutParams);
                }
                View view4 = livePromoteTextWidget.LLIZLLLIL;
                if (view4 != null) {
                    layoutParams4 = view4.getLayoutParams();
                } else {
                    layoutParams4 = null;
                }
                if (layoutParams4 instanceof C19ME) {
                    c19me2 = (C19ME) layoutParams4;
                    if (c19me2 != null) {
                        ((ViewGroup.MarginLayoutParams) c19me2).topMargin = (int) C497740JfY.LIZIZ(36.0f);
                    }
                } else {
                    c19me2 = null;
                }
                int iMax2 = Math.max(0, iLIZIZ2 + ((int) C497740JfY.LIZIZ(40.0f)));
                if (c19me2 != null) {
                    ((ViewGroup.MarginLayoutParams) c19me2).bottomMargin = (int) (((double) iMax2) * 0.6d);
                    ((ViewGroup.MarginLayoutParams) c19me2).height = (int) C497740JfY.LIZIZ(40.0f);
                    c19me2.bottomToBottom = -1;
                }
                int iLIZIZ3 = (int) C497740JfY.LIZIZ(10.0f);
                int iLIZIZ4 = (int) C497740JfY.LIZIZ(12.0f);
                View view5 = livePromoteTextWidget.LLIZLLLIL;
                if (view5 != null) {
                    C426750GoL.LJIIL(view5, Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ3), Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ3), 16);
                }
                View view6 = livePromoteTextWidget.LLIZLLLIL;
                if (view6 != null) {
                    C786410Ut5.W5(view6, c19me2);
                }
                View view7 = livePromoteTextWidget.LLJ;
                if (view7 != null) {
                    layoutParams5 = view7.getLayoutParams();
                } else {
                    layoutParams5 = null;
                }
                if (layoutParams5 instanceof C19ME) {
                    marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.height = (int) C497740JfY.LIZIZ(40.0f);
                    }
                } else {
                    marginLayoutParams2 = null;
                }
                View view8 = livePromoteTextWidget.LLJ;
                if (view8 != null) {
                    C426750GoL.LJIIL(view8, Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ3), Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ3), 16);
                }
                View view9 = livePromoteTextWidget.LLJ;
                if (view9 != null) {
                    C786410Ut5.W5(view9, marginLayoutParams2);
                }
                ViewGroup viewGroup2 = livePromoteTextWidget.LLIZ;
                if (viewGroup2 != null) {
                    layoutParams6 = viewGroup2.getLayoutParams();
                } else {
                    layoutParams6 = null;
                }
                if (layoutParams6 instanceof C19ME) {
                    c19me3 = (C19ME) layoutParams6;
                    if (c19me3 != null) {
                        c19me3.verticalChainStyle = 0;
                        c19me3.bottomToTop = -1;
                        ((ViewGroup.MarginLayoutParams) c19me3).topMargin = (int) (((double) iMax2) * 0.4d);
                    }
                } else {
                    c19me3 = null;
                }
                ViewGroup viewGroup3 = livePromoteTextWidget.LLIZ;
                if (viewGroup3 != null) {
                    C786410Ut5.X5(c19me3, viewGroup3);
                }
                EncourageGoLiveCard encourageGoLiveCard = livePromoteTextWidget.LLILZLL;
                if (!encourageGoLiveCard.showNotifyLaterButtonV2 && !encourageGoLiveCard.showNotifyLaterButton && (liveIconView = (LiveIconView) view2.findViewById(R.id.dg7)) != null) {
                    ViewGroup.LayoutParams layoutParams7 = liveIconView.getLayoutParams();
                    if ((layoutParams7 instanceof C19ME) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams7) != null) {
                        marginLayoutParams3.bottomMargin = 0;
                        marginLayoutParams3.topMargin = (int) C497740JfY.LIZIZ(12.0f);
                    }
                    C786410Ut5.w6(liveIconView, marginLayoutParams3);
                    liveIconView.requestLayout();
                }
                ViewGroup viewGroup4 = livePromoteTextWidget.LLIZ;
                if (viewGroup4 != null) {
                    viewGroup4.requestLayout();
                    return;
                }
                return;
            }
            ViewGroup viewGroup5 = livePromoteTextWidget.LLIZ;
            if (viewGroup5 != null) {
                layoutParams = viewGroup5.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof C19ME) {
                c19me = (C19ME) layoutParams;
                if (c19me != null) {
                    c19me.verticalChainStyle = 0;
                    c19me.bottomToTop = -1;
                }
            } else {
                c19me = null;
            }
            int iLIZIZ5 = (int) C497740JfY.LIZIZ(88.0f);
            if (c19me != null) {
                ((ViewGroup.MarginLayoutParams) c19me).topMargin = iLIZIZ5;
            }
            ViewGroup viewGroup6 = livePromoteTextWidget.LLIZ;
            if (viewGroup6 != null) {
                C786410Ut5.X5(c19me, viewGroup6);
            }
            ViewGroup viewGroup7 = livePromoteTextWidget.LLIZ;
            if (viewGroup7 != null) {
                viewGroup7.requestLayout();
            }
            View view10 = livePromoteTextWidget.LLIZLLLIL;
            if (view10 != null) {
                layoutParams2 = view10.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if ((layoutParams2 instanceof C19ME) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams3.topMargin = (int) C497740JfY.LIZIZ(64.0f);
                marginLayoutParams3.bottomMargin = iMax - iLIZIZ5;
            }
            View view11 = livePromoteTextWidget.LLIZLLLIL;
            if (view11 == null) {
                return;
            }
            C786410Ut5.W5(view11, marginLayoutParams3);
        }
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH) {
        ArrayList<AbstractC511160K2w> arrayList;
        Integer numValueOf;
        ArrayList<AbstractC511160K2w> arrayList2;
        ArrayList<AbstractC511160K2w> arrayList3;
        SubSpaceFeedVM subSpaceFeedVMIp = ((FeedEmptyAssem) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0).ip();
        int height = ((View) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l1).getHeight();
        C511110K2r c511110K2r = subSpaceFeedVMIp.LLILZIL;
        if (c511110K2r != null) {
            C0K2Z c0k2z = c511110K2r.LLILLL;
            if (c0k2z != null && (arrayList3 = c0k2z.LL) != null) {
                Iterator<AbstractC511160K2w> it2 = arrayList3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC511160K2w next = it2.next();
                    if (next instanceof C0K2N) {
                        if (next == null) {
                            break;
                        }
                    }
                }
            } else {
                C0K2Z c0k2z2 = c511110K2r.LLILLL;
                if (c0k2z2 != null && (arrayList2 = c0k2z2.LL) != null) {
                    arrayList2.add(new C0K2N(height));
                }
                C0K2Z c0k2z3 = c511110K2r.LLILLL;
                if (c0k2z3 != null && (arrayList = c0k2z3.LL) != null && (numValueOf = Integer.valueOf(arrayList.size())) != null) {
                    numValueOf.intValue();
                    C0K2Z c0k2z4 = c511110K2r.LLILLL;
                    if (c0k2z4 != null) {
                        c0k2z4.notifyItemInserted(numValueOf.intValue() - 1);
                    }
                }
            }
        }
        C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l1).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC521810KdH);
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH) {
        boolean z;
        boolean z2;
        Rect rect = new Rect();
        ((View) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0).getWindowVisibleDisplayFrame(rect);
        View rootView = ((View) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0).getRootView();
        if (rootView == null) {
            rootView = (View) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0;
        }
        int height = rootView.getHeight();
        C0K8U c0k8u = (C0K8U) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l1;
        if (height > c0k8u.LJIIL) {
            c0k8u.LJIIL = height;
        }
        int i = c0k8u.LJIIL;
        if (i <= 0) {
            return;
        }
        int i2 = i - rect.bottom;
        if (i2 < 0) {
            i2 = 0;
        }
        boolean z3 = true;
        if (i2 > ((double) i) * 0.15d) {
            z = true;
        } else {
            z = false;
            i2 = 0;
        }
        if (c0k8u.LJIIIZ == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Math.abs(c0k8u.LJIIJ - i2) > c0k8u.LJIILIIL) {
            z3 = false;
        }
        if (z2 && z3) {
            return;
        }
        c0k8u.LJIIIZ = z;
        c0k8u.LJIIJ = i2;
        c0k8u.LJII.invoke(0);
        C0K8Z c0k8z = c0k8u.LIZLLL;
        if (c0k8z == null) {
            return;
        }
        c0k8z.q31(i2, z);
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH) {
        int height = ((C0K2V) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0).LL.getHeight();
        Integer num = ((C511370K3r) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l1).LLIZLLLIL;
        if (num == null || height != num.intValue()) {
            ((C511370K3r) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l1).LLIZLLLIL = Integer.valueOf(height);
            SubSpaceFeedVM subSpaceFeedVM = ((C0K2V) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0).LLILLJJLI;
            subSpaceFeedVM.getClass();
            subSpaceFeedVM.setState(new AwS22S0001000_7(height, 4));
        }
        C786410Ut5.C3(((C0K2V) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0).LL.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC521810KdH);
    }

    public static final void onGlobalLayout$6(ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0).getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && linearLayoutManager.findLastVisibleItemPosition() > 0) {
            C786410Ut5.C3(((RecyclerView) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC521810KdH);
            ((C0K2E) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l1).LIZ((RecyclerView) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0);
        }
    }

    public static final void onGlobalLayout$7(ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH) {
        int measuredHeight;
        int measuredHeight2;
        ViewGroup.LayoutParams layoutParams;
        C19ME c19me;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int measuredHeight3;
        ViewGroup.LayoutParams layoutParams3;
        C19ME c19me2;
        LiveIconView liveIconView;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.LayoutParams layoutParams6;
        ViewGroup.LayoutParams layoutParams7;
        ViewTreeObserver viewTreeObserver = ((View) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0).getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH2 = ((C470060Ic0) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l1).LLJJJJJIL;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC521810KdH2);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC521810KdH2, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C470060Ic0 c470060Ic0 = (C470060Ic0) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l1;
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0;
        c470060Ic0.getClass();
        if (view != null) {
            int measuredHeight4 = view.getMeasuredHeight();
            ViewGroup viewGroup = c470060Ic0.LLJJIII;
            if (viewGroup != null) {
                measuredHeight = viewGroup.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            View view2 = c470060Ic0.LLJJIJI;
            if (view2 != null) {
                measuredHeight2 = view2.getMeasuredHeight();
            } else {
                measuredHeight2 = 0;
            }
            int iLIZIZ = ((measuredHeight4 - measuredHeight) - measuredHeight2) - ((int) C497740JfY.LIZIZ(41.0f));
            int iLIZIZ2 = (int) C497740JfY.LIZIZ(36.0f);
            C19ME c19me3 = null;
            ViewGroup.MarginLayoutParams marginLayoutParams4 = null;
            ViewGroup.MarginLayoutParams marginLayoutParams5 = null;
            if (iLIZIZ > iLIZIZ2) {
                View view3 = c470060Ic0.LLJJIJI;
                if (view3 != null) {
                    layoutParams7 = view3.getLayoutParams();
                } else {
                    layoutParams7 = null;
                }
                if ((layoutParams7 instanceof C19ME) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams7) != null) {
                    marginLayoutParams4.bottomMargin = (int) C497740JfY.LIZIZ(40.0f);
                }
                View view4 = c470060Ic0.LLJJIJI;
                if (view4 != null) {
                    C786410Ut5.W5(view4, marginLayoutParams4);
                }
                View view5 = c470060Ic0.LLJJIJI;
                if (view5 != null) {
                    view5.requestLayout();
                    return;
                }
                return;
            }
            int iLIZIZ3 = iLIZIZ2 - ((int) C497740JfY.LIZIZ(8.0f));
            if (iLIZIZ > iLIZIZ3) {
                View view6 = c470060Ic0.LLJJIJI;
                if (view6 != null) {
                    layoutParams5 = view6.getLayoutParams();
                } else {
                    layoutParams5 = null;
                }
                if (layoutParams5 instanceof C19ME) {
                    marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    if (marginLayoutParams3 != null) {
                        marginLayoutParams3.height = (int) C497740JfY.LIZIZ(40.0f);
                    }
                } else {
                    marginLayoutParams3 = null;
                }
                View view7 = c470060Ic0.LLJJIJI;
                if (view7 != null) {
                    C786410Ut5.W5(view7, marginLayoutParams3);
                }
                View view8 = c470060Ic0.LLJJIJI;
                if (view8 != null) {
                    view8.requestLayout();
                }
                View view9 = c470060Ic0.LLJJIJIIJIL;
                if (view9 != null) {
                    layoutParams6 = view9.getLayoutParams();
                } else {
                    layoutParams6 = null;
                }
                if ((layoutParams6 instanceof C19ME) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                    marginLayoutParams5.height = (int) C497740JfY.LIZIZ(40.0f);
                }
                View view10 = c470060Ic0.LLJJIJIIJIL;
                if (view10 == null) {
                    return;
                }
                C786410Ut5.W5(view10, marginLayoutParams5);
                return;
            }
            View view11 = c470060Ic0.LLJJIJI;
            if (view11 != null) {
                layoutParams = view11.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof C19ME) {
                c19me = (C19ME) layoutParams;
                if (c19me != null) {
                    ((ViewGroup.MarginLayoutParams) c19me).height = (int) C497740JfY.LIZIZ(40.0f);
                }
            } else {
                c19me = null;
            }
            int iLIZIZ4 = (int) C497740JfY.LIZIZ(10.0f);
            if (c19me != null) {
                ((ViewGroup.MarginLayoutParams) c19me).topMargin = iLIZIZ4;
            }
            int iLIZIZ5 = (int) C497740JfY.LIZIZ(12.0f);
            if (c19me != null) {
                c19me.bottomToBottom = -1;
            }
            View view12 = c470060Ic0.LLJJIJI;
            if (view12 != null) {
                C426750GoL.LJIIL(view12, Integer.valueOf(iLIZIZ5), Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ5), Integer.valueOf(iLIZIZ4), 16);
            }
            View view13 = c470060Ic0.LLJJIJI;
            if (view13 != null) {
                C786410Ut5.W5(view13, c19me);
            }
            View view14 = c470060Ic0.LLJJIJI;
            if (view14 != null) {
                view14.requestLayout();
            }
            View view15 = c470060Ic0.LLJJIJIIJIL;
            if (view15 != null) {
                layoutParams2 = view15.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if (layoutParams2 instanceof C19ME) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (marginLayoutParams != null) {
                    marginLayoutParams.height = (int) C497740JfY.LIZIZ(40.0f);
                }
            } else {
                marginLayoutParams = null;
            }
            View view16 = c470060Ic0.LLJJIJIIJIL;
            if (view16 != null) {
                C426750GoL.LJIIL(view16, Integer.valueOf(iLIZIZ5), Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ5), Integer.valueOf(iLIZIZ4), 16);
            }
            View view17 = c470060Ic0.LLJJIJIIJIL;
            if (view17 != null) {
                C786410Ut5.W5(view17, marginLayoutParams);
            }
            int iAbs = iLIZIZ3 - Math.abs(iLIZIZ);
            C19R6 c19r6 = c470060Ic0.LLJJJJLIIL;
            if (c19r6 != null) {
                measuredHeight3 = c19r6.getMeasuredHeight();
            } else {
                measuredHeight3 = -1;
            }
            if (iAbs > 0 && measuredHeight3 > iAbs) {
                C19R6 c19r62 = c470060Ic0.LLJJJJLIIL;
                if (c19r62 != null) {
                    layoutParams4 = c19r62.getLayoutParams();
                } else {
                    layoutParams4 = null;
                }
                if (layoutParams4 instanceof C19ME) {
                    marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.height = measuredHeight3 - iAbs;
                        marginLayoutParams2.width = (int) (((double) (measuredHeight3 - iAbs)) * 0.8d);
                    }
                } else {
                    marginLayoutParams2 = null;
                }
                C19R6 c19r63 = c470060Ic0.LLJJJJLIIL;
                if (c19r63 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19r63);
                    c19r63.setLayoutParams(marginLayoutParams2);
                }
            }
            ViewGroup viewGroup2 = c470060Ic0.LLJJIII;
            if (viewGroup2 != null) {
                layoutParams3 = viewGroup2.getLayoutParams();
            } else {
                layoutParams3 = null;
            }
            if (layoutParams3 instanceof C19ME) {
                c19me2 = (C19ME) layoutParams3;
                if (c19me2 != null) {
                    c19me2.verticalChainStyle = 0;
                    c19me2.bottomToTop = -1;
                }
            } else {
                c19me2 = null;
            }
            ViewGroup viewGroup3 = c470060Ic0.LLJJIII;
            if (viewGroup3 != null) {
                C786410Ut5.X5(c19me2, viewGroup3);
            }
            if (c470060Ic0.LLILZ != null && (!r5.showNotifyLaterButtonV2) && (!r5.showNotifyLaterButton) && (liveIconView = (LiveIconView) view.findViewById(R.id.dg7)) != null) {
                ViewGroup.LayoutParams layoutParams8 = liveIconView.getLayoutParams();
                if ((layoutParams8 instanceof C19ME) && (c19me3 = (C19ME) layoutParams8) != null) {
                    c19me3.topToBottom = R.id.csh;
                    ((ViewGroup.MarginLayoutParams) c19me3).bottomMargin = 0;
                    ((ViewGroup.MarginLayoutParams) c19me3).topMargin = (int) C497740JfY.LIZIZ(12.0f);
                }
                C786410Ut5.w6(liveIconView, c19me3);
                liveIconView.requestLayout();
            }
            ViewGroup viewGroup4 = c470060Ic0.LLJJIII;
            if (viewGroup4 == null) {
                return;
            }
            viewGroup4.requestLayout();
        }
    }

    public static final void onGlobalLayout$8(ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH) {
        int measuredHeight;
        int measuredHeight2;
        ViewGroup.LayoutParams layoutParams;
        C19ME c19me;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams4;
        C19ME c19me2;
        ViewGroup.LayoutParams layoutParams5;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.LayoutParams layoutParams6;
        C19ME c19me3;
        LiveIconView liveIconView;
        ViewTreeObserver viewTreeObserver = ((View) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0).getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH2 = ((C470050Ibz) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l1).LLJZIJLIL;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC521810KdH2);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC521810KdH2, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C470050Ibz c470050Ibz = (C470050Ibz) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l1;
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC521810KdH.l0;
        c470050Ibz.getClass();
        if (view != null) {
            int measuredHeight3 = view.getMeasuredHeight();
            ViewGroup viewGroup = c470050Ibz.LLJJIII;
            if (viewGroup != null) {
                measuredHeight = viewGroup.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            int iLIZIZ = (int) C497740JfY.LIZIZ(48.0f);
            View view2 = c470050Ibz.LLJJIJI;
            if (view2 != null) {
                measuredHeight2 = view2.getMeasuredHeight();
            } else {
                measuredHeight2 = 0;
            }
            int iLIZIZ2 = (((measuredHeight3 - measuredHeight) - ((int) C497740JfY.LIZIZ(41.0f))) - measuredHeight2) - iLIZIZ;
            int iMax = Math.max(0, iLIZIZ2);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = null;
            if (iMax < ((int) C497740JfY.LIZIZ(176.0f))) {
                ImageView imageView = c470050Ibz.LLJJL;
                if (imageView != null) {
                    layoutParams3 = imageView.getLayoutParams();
                } else {
                    layoutParams3 = null;
                }
                if (layoutParams3 instanceof C19ME) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(28.0f);
                    }
                } else {
                    marginLayoutParams = null;
                }
                ImageView imageView2 = c470050Ibz.LLJJL;
                if (imageView2 != null) {
                    C786410Ut5.c6(imageView2, marginLayoutParams);
                }
                View view3 = c470050Ibz.LLJJIJI;
                if (view3 != null) {
                    layoutParams4 = view3.getLayoutParams();
                } else {
                    layoutParams4 = null;
                }
                if (layoutParams4 instanceof C19ME) {
                    c19me2 = (C19ME) layoutParams4;
                    if (c19me2 != null) {
                        ((ViewGroup.MarginLayoutParams) c19me2).topMargin = (int) C497740JfY.LIZIZ(36.0f);
                    }
                } else {
                    c19me2 = null;
                }
                int iMax2 = Math.max(0, iLIZIZ2 + ((int) C497740JfY.LIZIZ(40.0f)));
                if (c19me2 != null) {
                    ((ViewGroup.MarginLayoutParams) c19me2).bottomMargin = (int) (((double) iMax2) * 0.6d);
                    ((ViewGroup.MarginLayoutParams) c19me2).height = (int) C497740JfY.LIZIZ(40.0f);
                    c19me2.bottomToBottom = -1;
                }
                int iLIZIZ3 = (int) C497740JfY.LIZIZ(10.0f);
                int iLIZIZ4 = (int) C497740JfY.LIZIZ(12.0f);
                View view4 = c470050Ibz.LLJJIJI;
                if (view4 != null) {
                    C426750GoL.LJIIL(view4, Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ3), Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ3), 16);
                }
                View view5 = c470050Ibz.LLJJIJI;
                if (view5 != null) {
                    C786410Ut5.W5(view5, c19me2);
                }
                View view6 = c470050Ibz.LLJJIJIIJIL;
                if (view6 != null) {
                    layoutParams5 = view6.getLayoutParams();
                } else {
                    layoutParams5 = null;
                }
                if (layoutParams5 instanceof C19ME) {
                    marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.height = (int) C497740JfY.LIZIZ(40.0f);
                    }
                } else {
                    marginLayoutParams2 = null;
                }
                View view7 = c470050Ibz.LLJJIJIIJIL;
                if (view7 != null) {
                    C426750GoL.LJIIL(view7, Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ3), Integer.valueOf(iLIZIZ4), Integer.valueOf(iLIZIZ3), 16);
                }
                View view8 = c470050Ibz.LLJJIJIIJIL;
                if (view8 != null) {
                    C786410Ut5.W5(view8, marginLayoutParams2);
                }
                ViewGroup viewGroup2 = c470050Ibz.LLJJIII;
                if (viewGroup2 != null) {
                    layoutParams6 = viewGroup2.getLayoutParams();
                } else {
                    layoutParams6 = null;
                }
                if (layoutParams6 instanceof C19ME) {
                    c19me3 = (C19ME) layoutParams6;
                    if (c19me3 != null) {
                        c19me3.verticalChainStyle = 0;
                        c19me3.bottomToTop = -1;
                        ((ViewGroup.MarginLayoutParams) c19me3).topMargin = (int) (((double) iMax2) * 0.4d);
                    }
                } else {
                    c19me3 = null;
                }
                ViewGroup viewGroup3 = c470050Ibz.LLJJIII;
                if (viewGroup3 != null) {
                    C786410Ut5.X5(c19me3, viewGroup3);
                }
                if (c470050Ibz.LLILZ != null && (!r6.showNotifyLaterButtonV2) && (!r6.showNotifyLaterButton) && (liveIconView = (LiveIconView) view.findViewById(R.id.dg7)) != null) {
                    ViewGroup.LayoutParams layoutParams7 = liveIconView.getLayoutParams();
                    if ((layoutParams7 instanceof C19ME) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams7) != null) {
                        marginLayoutParams3.bottomMargin = 0;
                        marginLayoutParams3.topMargin = (int) C497740JfY.LIZIZ(12.0f);
                    }
                    C786410Ut5.w6(liveIconView, marginLayoutParams3);
                    liveIconView.requestLayout();
                }
                ViewGroup viewGroup4 = c470050Ibz.LLJJIII;
                if (viewGroup4 != null) {
                    viewGroup4.requestLayout();
                    return;
                }
                return;
            }
            ViewGroup viewGroup5 = c470050Ibz.LLJJIII;
            if (viewGroup5 != null) {
                layoutParams = viewGroup5.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof C19ME) {
                c19me = (C19ME) layoutParams;
                if (c19me != null) {
                    c19me.verticalChainStyle = 0;
                    c19me.bottomToTop = -1;
                }
            } else {
                c19me = null;
            }
            int iLIZIZ5 = (int) C497740JfY.LIZIZ(88.0f);
            if (c19me != null) {
                ((ViewGroup.MarginLayoutParams) c19me).topMargin = iLIZIZ5;
            }
            ViewGroup viewGroup6 = c470050Ibz.LLJJIII;
            if (viewGroup6 != null) {
                C786410Ut5.X5(c19me, viewGroup6);
            }
            ViewGroup viewGroup7 = c470050Ibz.LLJJIII;
            if (viewGroup7 != null) {
                viewGroup7.requestLayout();
            }
            View view9 = c470050Ibz.LLJJIJI;
            if (view9 != null) {
                layoutParams2 = view9.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if ((layoutParams2 instanceof C19ME) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                marginLayoutParams3.topMargin = (int) C497740JfY.LIZIZ(64.0f);
                marginLayoutParams3.bottomMargin = iMax - iLIZIZ5;
            }
            View view10 = c470050Ibz.LLJJIJI;
            if (view10 == null) {
                return;
            }
            C786410Ut5.W5(view10, marginLayoutParams3);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC521810KdH(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
