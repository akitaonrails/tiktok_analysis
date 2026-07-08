package X;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.BoardAddEvent;
import com.bytedance.android.live.BoardRemoveEvent;
import com.bytedance.android.live.GetDecorationBoardBitmapEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsBoardsDebugSetting;
import com.bytedance.android.livesdk.model.BoardItemLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eWd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1092090eWd extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public boolean LLILZ;
    public LifecycleOwner LLILZIL;
    public DataChannel LLILZLL;
    public Fragment LLIZ;
    public long LLIZLLLIL;
    public EnumC1092110eWf LLJ;
    public final C1818740xQe LLJI;
    public final BPEAHandler LLJIJIL;
    public final List<C1092100eWe> LLJILJIL;
    public final RunnableC1092020eWW LLJILJILJ;
    public final Map<View, Integer> LLJILLL;

    private final View getBottomBlackBg() {
        return (View) this.LLILLJJLI.getValue();
    }

    private final C459801qe getDeleteToast() {
        return (C459801qe) this.LLILLL.getValue();
    }

    private final View getTopBlackBg() {
        return (View) this.LL.getValue();
    }

    public void LIZIZ() {
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LLILZIL, BoardAddEvent.class, new C1092050eWZ(this));
            dataChannel.BQ2(this.LLILZIL, BoardRemoveEvent.class, new C1092140eWi(this));
            dataChannel.BQ2(this.LLILZIL, GetDecorationBoardBitmapEvent.class, new C1092400eX8(this));
        }
    }

    public final void LJFF() {
        C500260Jjc.LJIILIIL(getTopBlackBg());
        this.LLJ = null;
        Fragment fragment = this.LLIZ;
        if (fragment != null) {
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(fragment);
            tuxImmersionBarLIZLLL.LIZIZ.LJIIL();
            tuxImmersionBarLIZLLL.LIZLLL();
        }
        C500260Jjc.LJIILIIL(getBottomBlackBg());
        C500260Jjc.LJIILIIL(getDeleteToast());
    }

    public final long getAudienceRenderRoomId() {
        return this.LLIZLLLIL;
    }

    public final DataChannel getDataChannel() {
        return this.LLILZLL;
    }

    public final boolean getEnableShow() {
        return this.LLILZ;
    }

    public final Fragment getFragment() {
        return this.LLIZ;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.LLILZIL;
    }

    public final void LIZ(final C1092100eWe c1092100eWe) {
        final C1092220eWq c1092220eWq;
        Function0<Boolean> c1092040eWY;
        int iIntValue;
        ViewGroup viewGroup;
        setLayoutDirection(0);
        LJ(c1092100eWe.LIZ);
        if (c1092100eWe.LJFF) {
            return;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.g0q, this, false);
        if ((viewTd instanceof C1092220eWq) && (c1092220eWq = (C1092220eWq) viewTd) != null) {
            if (c1092100eWe.LIZJ.getParent() != null) {
                ViewParent parent = c1092100eWe.LIZJ.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(c1092100eWe.LIZJ, viewGroup);
                }
            }
            if (c1092100eWe.LJJI) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1092220eWq);
                c1092220eWq.setAlpha(1.0f);
            } else if (LivePcsBoardsDebugSetting.INSTANCE.isDebugGroup()) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1092220eWq);
                c1092220eWq.setAlpha(0.5f);
            } else {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1092220eWq);
                c1092220eWq.setAlpha(0.0f);
            }
            c1092220eWq.setBoardItemType(c1092100eWe.LIZIZ);
            c1092220eWq.addView(c1092100eWe.LIZJ, new ViewGroup.LayoutParams(c1092100eWe.LIZJ.getMeasuredWidth(), c1092100eWe.LIZJ.getMeasuredHeight()));
            c1092220eWq.setContentId(Long.valueOf(c1092100eWe.LIZ));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Add LiveBoardDraggableLayout:");
            sbLIZ.append(c1092100eWe.LIZ);
            C20441214yg.LIZIZ("LiveBoardsTipView", C2188811AlT.LIZIZ(sbLIZ));
            float f = c1092100eWe.LJII;
            float f2 = c1092100eWe.LJIIIIZZ;
            float f3 = c1092100eWe.LJIIIZ;
            float f4 = c1092100eWe.LJIIJ;
            c1092220eWq.LLILLL = f;
            c1092220eWq.LLILZ = f2;
            c1092220eWq.LLILZIL = f3;
            c1092220eWq.LLILZLL = f4;
            c1092220eWq.setOnPositionChangeListener(new C1092010eWV(c1092100eWe, this));
            c1092220eWq.setOnDragStatusChange(new C1092120eWg(c1092100eWe, this));
            float f5 = c1092100eWe.LJIJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1092220eWq);
            c1092220eWq.setScaleX(f5);
            float f6 = c1092100eWe.LJIJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1092220eWq);
            c1092220eWq.setScaleY(f6);
            if (c1092100eWe.LJIIZILJ) {
                c1092220eWq.setOnScaleChange(c1092100eWe.LJIILL);
                c1092220eWq.setOnScaleStatusChange(new C1092000eWU(c1092100eWe, this));
            }
            if (c1092100eWe.LJI) {
                c1092040eWY = new C1092040eWY();
            } else {
                c1092040eWY = c1092100eWe.LJIJI;
            }
            c1092220eWq.setCanDrag(c1092040eWY);
            HandlerHook.viewPost(c1092220eWq, new RunnableC1092230eWr(c1092100eWe.LIZLLL, c1092220eWq, c1092100eWe.LJIJJLI, c1092100eWe.LJ, null));
            if (c1092100eWe.LJJI && c1092100eWe.LIZIZ == 6) {
                addView(c1092220eWq, 0);
            } else {
                int i = c1092100eWe.LJJ;
                if (i < 0) {
                    this.LLJILLL.put(c1092220eWq, Integer.MAX_VALUE);
                    addView(c1092220eWq);
                } else {
                    int iLJ = C13LZ.LJ(i, 0, 999);
                    this.LLJILLL.put(c1092220eWq, Integer.valueOf(iLJ));
                    int childCount = getChildCount();
                    int childCount2 = getChildCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= childCount2) {
                            break;
                        }
                        Integer num = (Integer) ((LinkedHashMap) this.LLJILLL).get(getChildAt(i2));
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (iIntValue > iLJ) {
                            childCount = i2;
                            break;
                        }
                        i2++;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("addViewByZIndex zIndex:");
                    sbLIZ2.append(i);
                    sbLIZ2.append(" insertIndex:");
                    sbLIZ2.append(childCount);
                    C20441214yg.LIZIZ("LiveBoardsTipView", C2188811AlT.LIZIZ(sbLIZ2));
                    addView(c1092220eWq, childCount);
                }
            }
            if (c1092100eWe.LJJI) {
                final long j = this.LLIZLLLIL;
                if (j > 0) {
                    C786410Ut5.y3(c1092220eWq.getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0eWh
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public final boolean onPreDraw() {
                            C786410Ut5.D3(c1092220eWq.getViewTreeObserver(), this);
                            long j2 = j;
                            long j3 = c1092100eWe.LIZ;
                            try {
                                C1145500fum c1145500fumLJII = C1145410fud.LJII(j2, j3);
                                if (c1145500fumLJII == null) {
                                    return true;
                                }
                                c1145500fumLJII.LJIIJJI(j3);
                                return true;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                return true;
                            }
                        }
                    });
                }
            }
        }
    }

    public final void LJ(long j) {
        Long contentId;
        C19719612Di.LJJIIJ(this.LLJILJIL, new C1092160eWk(j), true);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof C1092220eWq) && (contentId = ((C1092220eWq) childAt).getContentId()) != null && contentId.longValue() == j) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, childAt);
                removeView(childAt);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Remove LiveBoardDraggableLayout:");
                sbLIZ.append(j);
                C20441214yg.LIZIZ("LiveBoardsTipView", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
    }

    public final void LJI(EnumC1092110eWf enumC1092110eWf) {
        if (enumC1092110eWf != this.LLJ) {
            View topBlackBg = getTopBlackBg();
            if (topBlackBg != null) {
                topBlackBg.setBackgroundColor(C20736316Cj.LIZIZ(enumC1092110eWf.getAttr(), getContext()));
            }
            Fragment fragment = this.LLIZ;
            if (fragment != null) {
                TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(fragment);
                tuxImmersionBarLIZLLL.LJIIIIZZ(enumC1092110eWf.getAttr());
                tuxImmersionBarLIZLLL.LIZLLL();
            }
            this.LLJ = enumC1092110eWf;
        }
        C500260Jjc.LLFFF(getTopBlackBg());
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view != null) {
            this.LLJILLL.remove(view);
        }
        super.removeView(view);
    }

    public final void setAudienceRenderRoomId(long j) {
        this.LLIZLLLIL = j;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LLILZLL = dataChannel;
        LIZIZ();
    }

    public final void setEnableShow(boolean z) {
        this.LLILZ = z;
    }

    public final void setFragment(Fragment fragment) {
        this.LLIZ = fragment;
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.LLILZIL = lifecycleOwner;
    }

    public C1092090eWd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZJ(C1092100eWe c1092100eWe, boolean z) {
        if (z) {
            C500260Jjc.LLFFF(this);
            C500260Jjc.LLFFF(getBottomBlackBg());
            C500260Jjc.LLFFF(getDeleteToast());
            LJI(EnumC1092110eWf.BLACK);
            return;
        }
        LJFF();
        if (!c1092100eWe.LJIJJ.LIZIZ) {
            return;
        }
        InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
        if (effectBoardService != null) {
            effectBoardService.LIZIZ(c1092100eWe.LIZ, true);
        }
        this.LLJI.LIZIZ(c1092100eWe.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0eWW] */
    public C1092090eWd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new C1092070eWb(this));
        this.LLILLJJLI = C452501pT.LIZIZ(new C1092060eWa(this));
        this.LLILLL = C452501pT.LIZIZ(new C1092080eWc(this));
        this.LLILZ = true;
        this.LLJI = new C1818740xQe();
        this.LLJIJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJILJIL = new ArrayList();
        this.LLJILJILJ = new Runnable() { // from class: X.0eWW
            public final void LIZ() {
                C1092090eWd c1092090eWd = this.LL;
                if (((ArrayList) c1092090eWd.LLJILJIL).isEmpty()) {
                    return;
                }
                List listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0eWX
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        long j;
                        BoardItemLayout boardItemLayout = ((C1092100eWe) t).LJIL;
                        long j2 = Long.MAX_VALUE;
                        if (boardItemLayout != null) {
                            j = boardItemLayout.layoutOrder;
                        } else {
                            j = Long.MAX_VALUE;
                        }
                        Long lValueOf = Long.valueOf(j);
                        BoardItemLayout boardItemLayout2 = ((C1092100eWe) t2).LJIL;
                        if (boardItemLayout2 != null) {
                            j2 = boardItemLayout2.layoutOrder;
                        }
                        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(j2));
                    }
                }, c1092090eWd.LLJILJIL);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Flushing ");
                sbLIZ.append(listLJLLLL.size());
                sbLIZ.append(" batched layout items by layoutOrder");
                C20441214yg.LIZIZ("LiveBoardsTipView", C2188811AlT.LIZIZ(sbLIZ));
                Iterator it2 = listLJLLLL.iterator();
                while (it2.hasNext()) {
                    c1092090eWd.LIZ((C1092100eWe) it2.next());
                }
                ((ArrayList) c1092090eWd.LLJILJIL).clear();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveBoardsTipView@1523.flushLayoutBatchRunnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveBoardsTipView@1523.flushLayoutBatchRunnable$1");
            }
        };
        C786410Ut5.Sd(R.layout.g0z, C786410Ut5.ne(C1834150xpV.LJII(context)), this);
        setClipChildren(false);
        this.LLJILLL = new LinkedHashMap();
    }

    public final void LIZLLL(C1092100eWe c1092100eWe, float f, MotionEvent motionEvent) {
        boolean z;
        if (!c1092100eWe.LJIJJ.LIZ) {
            return;
        }
        if (motionEvent != null && motionEvent.getY() + f < c1092100eWe.LJIIJJI) {
            z = true;
        } else {
            z = false;
        }
        c1092100eWe.LJIJJ.LIZIZ = z;
        if (z) {
            LJI(EnumC1092110eWf.ERROR);
            C500260Jjc.LLFFF(getDeleteToast());
        } else {
            LJI(EnumC1092110eWf.BLACK);
            C500260Jjc.LLFFF(getDeleteToast());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        C1818740xQe c1818740xQe = this.LLJI;
        float f = C488301vF.LJ;
        c1818740xQe.LIZ = f;
        c1818740xQe.LIZIZ = f;
    }
}
