package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.story.inbox.SkylightHighlightsItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0rkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600450rkZ extends ViewOnAttachStateChangeListenerC20604515jv {
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final BPEAHandler LLIZLLLIL;
    public final RunnableC1599400ris LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C786880Utq LLJILLL;

    private final AbstractC21674919sB getAnimator() {
        return (AbstractC21674919sB) this.LLILZ.getValue();
    }

    private final Runnable getAnimatorRunnable() {
        return (Runnable) this.LLILZIL.getValue();
    }

    private final C367100EaK getDecoration() {
        return (C367100EaK) this.LLJILJILJ.getValue();
    }

    private final C1591410rVz getViewPagerParent() {
        return (C1591410rVz) this.LLIZ.getValue();
    }

    public final void LJJII() {
        AbstractC20603615jm abstractC20603615jm;
        if (this.LLJIJIL) {
            AbstractC21673619ry adapter = getAdapter();
            if (!(adapter instanceof AbstractC20603615jm) || (abstractC20603615jm = (AbstractC20603615jm) adapter) == null) {
                return;
            }
            List<InterfaceC1891350zJl> listLLLIIIIL = abstractC20603615jm.LLLIIIIL();
            if (listLLLIIIIL != null) {
                Iterator<InterfaceC1891350zJl> it2 = listLLLIIIIL.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!(it2.next() instanceof SkylightHighlightsItem)) {
                        i++;
                    } else if (i >= 0) {
                        getDecoration().LJ(i, getContext());
                        invalidateItemDecorations();
                        return;
                    }
                }
            }
            removeItemDecoration(getDecoration());
            this.LLJIJIL = false;
        }
    }

    public final void LJJIII() {
        AbstractC20603615jm abstractC20603615jm;
        List<InterfaceC1891350zJl> listLLLIIIIL;
        if (((Number) C281220B0m.LIZ.getValue()).intValue() == 1 && C1256440ini.LIZ() && !this.LLJI) {
            AbstractC21673619ry adapter = getAdapter();
            if (!(adapter instanceof AbstractC20603615jm) || (abstractC20603615jm = (AbstractC20603615jm) adapter) == null || (listLLLIIIIL = abstractC20603615jm.LLLIIIIL()) == null) {
                return;
            }
            Iterator<InterfaceC1891350zJl> it2 = listLLLIIIIL.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else if (it2.next() instanceof SkylightHighlightsItem) {
                    break;
                } else {
                    i++;
                }
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf == null || numValueOf.intValue() == -1) {
                return;
            }
            C01GW c01gw = C281220B0m.LIZIZ;
            if (((InterfaceC1600460rka) c01gw.getValue()).getInt("total_show_times_v2", 0) <= 5) {
                if (!this.LLJILJIL) {
                    AbstractC21673619ry adapter2 = getAdapter();
                    if (adapter2 != null) {
                        adapter2.registerAdapterDataObserver(this.LLJILLL);
                    }
                    this.LLJILJIL = true;
                }
                removeItemDecoration(getDecoration());
                getDecoration().LJ(numValueOf.intValue(), getContext());
                ((InterfaceC1600460rka) c01gw.getValue()).LIZJ("total_show_times_v2", ((InterfaceC1600460rka) c01gw.getValue()).getInt("total_show_times_v2", 0) + 1);
                addItemDecoration(getDecoration());
                this.LLJIJIL = true;
            }
            this.LLJI = true;
        }
    }

    public final void LJJI() {
        if (getItemAnimator() == null) {
            setItemAnimator(getAnimator());
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("SkylightList", " itemAnimator = animator");
        }
    }

    public final void LJJIFFI() {
        if (getItemAnimator() == null) {
            HandlerHook.viewPostDelay(this, getAnimatorRunnable(), 3000L);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (((Boolean) this.LLILZLL.getValue()).booleanValue() && motionEvent != null && motionEvent.getAction() == 2) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        C1591410rVz viewPagerParent;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.LLIZLLLIL.removeCallbacks(this.LLJ);
            C1598660rhg.LIZ.getClass();
            C1598660rhg.LJ.LIZJ(5);
            C786410Ut5.LJLIIL(3000L, this.LLIZLLLIL, this.LLJ);
        }
        if (((Boolean) this.LLILZLL.getValue()).booleanValue() && motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (numValueOf.intValue() != 0 && numValueOf.intValue() != 2) {
                if ((numValueOf.intValue() == 1 || numValueOf.intValue() == 3) && (viewPagerParent = getViewPagerParent()) != null) {
                    viewPagerParent.requestDisallowInterceptTouchEvent(false);
                }
            } else {
                C1591410rVz viewPagerParent2 = getViewPagerParent();
                if (viewPagerParent2 != null) {
                    viewPagerParent2.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0Utq] */
    public C1600450rkZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(544));
        this.LLILZIL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 167));
        this.LLILZLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(546));
        this.LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1749));
        this.LLIZLLLIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJ = RunnableC1599400ris.LL;
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("SkylightList", "SkylightList init");
        setItemAnimator(null);
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(545));
        this.LLJILLL = new AbstractC471570IeR() { // from class: X.0Utq
            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i3, int i4) {
                C1600450rkZ c1600450rkZ = this.LIZ;
                HandlerHook.viewPost(c1600450rkZ, new ARunnableS113S0100000_13(c1600450rkZ, 224));
            }

            @Override // X.AbstractC471570IeR
            public final void LJ(int i3, int i4) {
                C1600450rkZ c1600450rkZ = this.LIZ;
                HandlerHook.viewPost(c1600450rkZ, new ARunnableS113S0100000_13(c1600450rkZ, 227));
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i3, int i4) {
                C1600450rkZ c1600450rkZ = this.LIZ;
                HandlerHook.viewPost(c1600450rkZ, new ARunnableS113S0100000_13(c1600450rkZ, 225));
            }
        };
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightList onSizeChanged= ");
        sbLIZ.append(i);
        sbLIZ.append(',');
        sbLIZ.append(i2);
        sbLIZ.append(',');
        sbLIZ.append(i3);
        sbLIZ.append(',');
        sbLIZ.append(i4);
        C1618770sE7.LJ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
