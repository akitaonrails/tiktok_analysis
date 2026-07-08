package X;

import Y.ARunnableS118S0100000_18;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.layout.core.PowerLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS167S1100000_18;
import kotlin.jvm.internal.AwS23S0002000_18;
import kotlin.jvm.internal.AwS45S0102000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0gIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160360gIk extends AbstractC471570IeR {
    public static final /* synthetic */ int LJIIJ = 0;
    public final ViewOnAttachStateChangeListenerC20604515jv LIZ;
    public final String LIZIZ = "RavenFragment";
    public boolean LIZJ;
    public boolean LIZLLL;
    public AwS562S0100000_18 LJ;
    public boolean LJFF;
    public long LJI;
    public long LJII;
    public String LJIIIIZZ;
    public C21686019ty LJIIIZ;

    @Override // X.AbstractC471570IeR
    public final void LIZ() {
        String str = this.LIZIZ;
        if (str != null) {
            new C1043010dFT();
            C1043010dFT.LIZIZ(str, new AwS562S0100000_18(this, 2641));
        }
        if (this.LJFF) {
            String str2 = this.LIZIZ;
            if (str2 != null) {
                new C1043010dFT();
                C1043010dFT.LIZIZ(str2, AFwS206S0000000_18.get$arr$(743));
            }
            this.LJFF = false;
            return;
        }
        if (LJII()) {
            String str3 = this.LIZIZ;
            if (str3 != null) {
                new C1043010dFT();
                C1043010dFT.LIZIZ(str3, AFwS206S0000000_18.get$arr$(744));
                return;
            }
            return;
        }
        String str4 = this.LIZIZ;
        if (str4 != null) {
            new C1043010dFT();
            C1043010dFT.LIZIZ(str4, AFwS206S0000000_18.get$arr$(745));
        }
        LJIIJ();
        LJIILJJIL();
    }

    public final boolean LJII() {
        return this.LJI > 0 && System.currentTimeMillis() - this.LJI < 750;
    }

    public final void LJIIJ() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LIZ;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return;
        }
        if (viewOnAttachStateChangeListenerC20604515jv.getScrollState() != 0) {
            String str = this.LIZIZ;
            if (str != null) {
                new C1043010dFT();
                C1043010dFT.LIZIZ(str, new AwS562S0100000_18(viewOnAttachStateChangeListenerC20604515jv, 2642));
                return;
            }
            return;
        }
        RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            ((StaggeredGridLayoutManager) layoutManager).LJJIIZ();
        }
        if (layoutManager != null) {
            layoutManager.scrollToPosition(0);
        }
    }

    public final void LJIIL() {
        C1160490gIx layoutHandlerRegistry;
        AbstractC21673619ry adapter;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LIZ;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (layoutHandlerRegistry = viewOnAttachStateChangeListenerC20604515jv.getLayoutHandlerRegistry()) == null || (adapter = viewOnAttachStateChangeListenerC20604515jv.getAdapter()) == null) {
            return;
        }
        int itemCount = adapter.getItemCount();
        List<AbstractC21686119tz> list = layoutHandlerRegistry.LIZJ;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        for (Object obj : arrayList2) {
            if (obj != this.LJIIIZ) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        int iLJI = 0;
        while (it2.hasNext()) {
            iLJI += ((AbstractC21686119tz) it2.next()).LJI();
        }
        int i = itemCount - iLJI;
        if (i > 0) {
            C21686019ty c21686019ty = this.LJIIIZ;
            if (c21686019ty == null || !arrayList2.contains(c21686019ty)) {
                C21686019ty c21686019ty2 = new C21686019ty(0, i);
                this.LJIIIZ = c21686019ty2;
                layoutHandlerRegistry.LIZ(c21686019ty2);
            } else {
                layoutHandlerRegistry.LIZIZ(c21686019ty, i);
            }
            String str = this.LIZIZ;
            if (str != null) {
                new C1043010dFT();
                C1043010dFT.LIZIZ(str, new C1160380gIm(i, iLJI, itemCount));
                return;
            }
            return;
        }
        if (i == 0) {
            C21686019ty c21686019ty3 = this.LJIIIZ;
            if (c21686019ty3 != null && arrayList2.contains(c21686019ty3)) {
                int iIndexOf = ((ArrayList) layoutHandlerRegistry.LIZJ).indexOf(c21686019ty3);
                if (iIndexOf >= 0) {
                    ListProtector.remove(layoutHandlerRegistry.LIZJ, iIndexOf);
                    layoutHandlerRegistry.LIZJ(iIndexOf);
                }
                PowerLayoutManager powerLayoutManager = layoutHandlerRegistry.LIZIZ;
                if (powerLayoutManager != null) {
                    powerLayoutManager.LJJII(layoutHandlerRegistry.LIZJ);
                }
                String str2 = this.LIZIZ;
                if (str2 != null) {
                    new C1043010dFT();
                    C1043010dFT.LIZIZ(str2, new AwS23S0002000_18(iLJI, itemCount, 9));
                }
            }
            this.LJIIIZ = null;
        }
    }

    public final void LJIILIIL() {
        C20600815jK<InterfaceC1891350zJl> state;
        List<AbstractC21686119tz> list;
        int iLJI;
        Object next;
        View view;
        C1160490gIx layoutHandlerRegistry;
        View view2;
        View view3;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LIZ;
        if (viewOnAttachStateChangeListenerC20604515jv == null || (state = viewOnAttachStateChangeListenerC20604515jv.getState()) == null) {
            return;
        }
        int iLJIIIIZZ = state.LJIIIIZZ();
        C1160490gIx layoutHandlerRegistry2 = viewOnAttachStateChangeListenerC20604515jv.getLayoutHandlerRegistry();
        if (layoutHandlerRegistry2 == null || (list = layoutHandlerRegistry2.LIZJ) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it2 = arrayList2.iterator();
        while (true) {
            iLJI = 0;
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (next2 != this.LJIIIZ) {
                arrayList.add(next2);
            }
        }
        int size = arrayList.size();
        if (size <= 1) {
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it3.next();
                    if (next != this.LJIIIZ) {
                        break;
                    }
                }
            }
            AbstractC21686119tz abstractC21686119tz = (AbstractC21686119tz) next;
            if (abstractC21686119tz != null && (layoutHandlerRegistry = viewOnAttachStateChangeListenerC20604515jv.getLayoutHandlerRegistry()) != null) {
                layoutHandlerRegistry.LIZIZ(abstractC21686119tz, iLJIIIIZZ);
            }
            LJIIL();
            viewOnAttachStateChangeListenerC20604515jv.requestLayout();
            Object parent = viewOnAttachStateChangeListenerC20604515jv.getParent();
            if (!(parent instanceof View) || (view = (View) parent) == null) {
                return;
            }
            view.requestLayout();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.LJIIIIZZ;
        if (str != null && jCurrentTimeMillis <= this.LJII) {
            this.LJIIIIZZ = null;
            this.LJII = 0L;
            String str2 = this.LIZIZ;
            if (str2 != null) {
                new C1043010dFT();
                C1043010dFT.LIZIZ(str2, new C1156900gDA(str, jCurrentTimeMillis));
            }
            LJIIL();
            viewOnAttachStateChangeListenerC20604515jv.requestLayout();
            Object parent2 = viewOnAttachStateChangeListenerC20604515jv.getParent();
            if (!(parent2 instanceof View) || (view3 = (View) parent2) == null) {
                return;
            }
            view3.requestLayout();
            return;
        }
        this.LJIIIIZZ = null;
        this.LJII = 0L;
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            iLJI += ((AbstractC21686119tz) it4.next()).LJI();
        }
        if (iLJIIIIZZ < iLJI) {
            String str3 = this.LIZIZ;
            if (str3 != null) {
                new C1043010dFT();
                C1043010dFT.LIZIZ(str3, new C1156910gDB(size, iLJI, iLJIIIIZZ, jCurrentTimeMillis));
            }
            AwS562S0100000_18 awS562S0100000_18 = this.LJ;
            if (awS562S0100000_18 != null) {
                awS562S0100000_18.invoke();
            }
            LJIIL();
            return;
        }
        int i = iLJIIIIZZ - iLJI;
        if (i > 0) {
            AbstractC21686119tz abstractC21686119tz2 = (AbstractC21686119tz) C13LP.LJJLIIIJJI(arrayList);
            C1160490gIx layoutHandlerRegistry3 = viewOnAttachStateChangeListenerC20604515jv.getLayoutHandlerRegistry();
            if (layoutHandlerRegistry3 != null) {
                layoutHandlerRegistry3.LIZIZ(abstractC21686119tz2, abstractC21686119tz2.LJI() + i);
            }
        }
        String str4 = this.LIZIZ;
        if (str4 != null) {
            new C1043010dFT();
            C1043010dFT.LIZIZ(str4, new C1156920gDC(i, size, iLJI, iLJIIIIZZ, jCurrentTimeMillis));
        }
        LJIIL();
        viewOnAttachStateChangeListenerC20604515jv.requestLayout();
        Object parent3 = viewOnAttachStateChangeListenerC20604515jv.getParent();
        if (!(parent3 instanceof View) || (view2 = (View) parent3) == null) {
            return;
        }
        view2.requestLayout();
    }

    public final void LJIILJJIL() {
        Unit unit;
        AbstractC21673619ry adapter;
        if (this.LIZLLL && this.LIZJ) {
            try {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LIZ;
                if (viewOnAttachStateChangeListenerC20604515jv == null || (adapter = viewOnAttachStateChangeListenerC20604515jv.getAdapter()) == null) {
                    unit = null;
                } else {
                    adapter.unregisterAdapterDataObserver(this);
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            this.LIZJ = false;
        }
    }

    public C1160360gIk(C18Z8 c18z8) {
        this.LIZ = c18z8;
    }

    public final void LJIIJJI(String str) {
        this.LJII = System.currentTimeMillis() + 750;
        this.LJIIIIZZ = str;
        String str2 = this.LIZIZ;
        if (str2 != null) {
            new C1043010dFT();
            C1043010dFT.LIZIZ(str2, new AwS167S1100000_18(str, this, 24));
        }
    }

    @Override // X.AbstractC471570IeR
    public final void LIZIZ(int i, int i2) {
        String str = this.LIZIZ;
        if (str != null) {
            new C1043010dFT();
            C1043010dFT.LIZIZ(str, new AwS45S0102000_18(i, i2, this, 4));
        }
        if (this.LJFF) {
            String str2 = this.LIZIZ;
            if (str2 != null) {
                new C1043010dFT();
                C1043010dFT.LIZIZ(str2, new AwS23S0002000_18(i, i2, 3));
            }
            this.LJFF = false;
            return;
        }
        if (LJII()) {
            String str3 = this.LIZIZ;
            if (str3 != null) {
                new C1043010dFT();
                C1043010dFT.LIZIZ(str3, new AwS23S0002000_18(i, i2, 4));
                return;
            }
            return;
        }
        if (i == 0 && i2 > 0) {
            String str4 = this.LIZIZ;
            if (str4 != null) {
                new C1043010dFT();
                C1043010dFT.LIZIZ(str4, new AwS23S0002000_18(i, i2, 5));
            }
            LJIIJ();
            LJIILJJIL();
        }
    }

    @Override // X.AbstractC471570IeR
    public final void LIZLLL(int i, int i2) {
        String str = this.LIZIZ;
        if (str != null) {
            new C1043010dFT();
            C1043010dFT.LIZIZ(str, new AwS45S0102000_18(i, i2, this, 5));
        }
        if (i == 0 && i2 > 0) {
            String str2 = this.LIZIZ;
            if (str2 != null) {
                new C1043010dFT();
                C1043010dFT.LIZIZ(str2, new AwS23S0002000_18(i, i2, 6));
            }
            this.LJFF = false;
            LJIIJ();
            LJIILJJIL();
            return;
        }
        if (this.LJFF) {
            String str3 = this.LIZIZ;
            if (str3 != null) {
                new C1043010dFT();
                C1043010dFT.LIZIZ(str3, new AwS23S0002000_18(i, i2, 7));
            }
            this.LJFF = false;
            LJIILIIL();
            LJIIIZ(i, i2);
            return;
        }
        if (LJII()) {
            String str4 = this.LIZIZ;
            if (str4 != null) {
                new C1043010dFT();
                C1043010dFT.LIZIZ(str4, new AwS23S0002000_18(i, i2, 8));
            }
            LJIILIIL();
            LJIIIZ(i, i2);
        }
    }

    public final void LJIIIIZZ(boolean z, boolean z2) {
        AbstractC21673619ry adapter;
        this.LIZLLL = z;
        this.LJFF = z2;
        if (z2) {
            this.LJI = System.currentTimeMillis();
        }
        String str = this.LIZIZ;
        if (str != null) {
            new C1043010dFT();
            C1043010dFT.LIZIZ(str, new C1156890gD9(z, z2));
        }
        if (!this.LIZJ) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LIZ;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (adapter = viewOnAttachStateChangeListenerC20604515jv.getAdapter()) != null) {
                adapter.registerAdapterDataObserver(this);
            }
            this.LIZJ = true;
        }
    }

    public final void LJIIIZ(int i, int i2) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C1160490gIx layoutHandlerRegistry;
        List<AbstractC21686119tz> list;
        C21685719tv c21685719tv;
        LinearLayoutManager linearLayoutManager;
        int i3;
        if (i > 0 && i2 > 0 && (viewOnAttachStateChangeListenerC20604515jv = this.LIZ) != null && (layoutHandlerRegistry = viewOnAttachStateChangeListenerC20604515jv.getLayoutHandlerRegistry()) != null && (list = layoutHandlerRegistry.LIZJ) != null && (c21685719tv = (C21685719tv) C09RB.LJIIL(C09RB.LJIIIZ(C09RB.LJIIIZ(new C1939607ik(list), new AwS597S0100000_18(this, 947)), new Function1<Object, Boolean>() { // from class: X.0gIn
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof C21685719tv);
            }
        }))) != null) {
            Integer numValueOf = Integer.valueOf(c21685719tv.LJIIJJI);
            if (numValueOf.intValue() > 0) {
                int iIntValue = numValueOf.intValue();
                RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1 || iFindLastVisibleItemPosition > (i3 = (iIntValue * 2) + 1) || i < iFindLastVisibleItemPosition) {
                        return;
                    }
                    int i4 = iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition;
                    String str = this.LIZIZ;
                    if (str != null) {
                        new C1043010dFT();
                        C1043010dFT.LIZIZ(str, new C1160370gIl(i, i2, iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition, i4, iIntValue, i3));
                    }
                    HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS118S0100000_18(viewOnAttachStateChangeListenerC20604515jv, 83));
                }
            }
        }
    }

    @Override // X.AbstractC471570IeR
    public final void LIZJ(int i, int i2, Object obj) {
        LIZIZ(i, i2);
        String str = this.LIZIZ;
        if (str != null) {
            new C1043010dFT();
            C1043010dFT.LIZIZ(str, new AwS45S0102000_18(i, i2, this, 3));
        }
        if (this.LJFF) {
            String str2 = this.LIZIZ;
            if (str2 != null) {
                new C1043010dFT();
                C1043010dFT.LIZIZ(str2, new AwS23S0002000_18(i, i2, 0));
            }
            this.LJFF = false;
            return;
        }
        if (LJII()) {
            String str3 = this.LIZIZ;
            if (str3 != null) {
                new C1043010dFT();
                C1043010dFT.LIZIZ(str3, new AwS23S0002000_18(i, i2, 1));
                return;
            }
            return;
        }
        if (i == 0 && i2 > 0) {
            String str4 = this.LIZIZ;
            if (str4 != null) {
                new C1043010dFT();
                C1043010dFT.LIZIZ(str4, new AwS23S0002000_18(i, i2, 2));
            }
            LJIIJ();
            LJIILJJIL();
        }
    }
}
