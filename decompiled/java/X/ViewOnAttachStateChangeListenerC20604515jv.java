package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.ies.powerlist.header.HeaderAndFooterViewCell;
import com.bytedance.ies.powerlist.layout.core.PowerLayoutManager;
import com.bytedance.ies.powerlist.page.PowerPageLoader;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS72S0100100_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15jv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class ViewOnAttachStateChangeListenerC20604515jv extends RecyclerView implements View.OnAttachStateChangeListener {
    public PowerAdapter LL;
    public boolean LLILLJJLI;
    public C1160490gIx LLILLL;

    public ViewOnAttachStateChangeListenerC20604515jv() {
        throw null;
    }

    private PowerStub getPrimaryStub() {
        return this.LL.LLLLJI();
    }

    public final void LJIIIIZZ() {
        if (!this.LLILLJJLI) {
            throw new IllegalStateException("Enable Layout-Engine first");
        }
        C1160490gIx c1160490gIx = this.LLILLL;
        ((ArrayList) c1160490gIx.LIZJ).clear();
        PowerLayoutManager powerLayoutManager = c1160490gIx.LIZIZ;
        if (powerLayoutManager != null) {
            powerLayoutManager.LJJII(c1160490gIx.LIZJ);
        }
    }

    public final void LJIIIZ() {
        if (this.LLILLJJLI) {
            return;
        }
        PowerLayoutManager powerLayoutManager = new PowerLayoutManager(getContext(), 0);
        setLayoutManager(powerLayoutManager);
        C1160490gIx c1160490gIx = new C1160490gIx(this);
        this.LLILLL = c1160490gIx;
        c1160490gIx.LIZIZ = powerLayoutManager;
        PowerLayoutManager powerLayoutManager2 = c1160490gIx.LIZIZ;
        if (powerLayoutManager2 != null) {
            powerLayoutManager2.LJJII(c1160490gIx.LIZJ);
        }
        this.LLILLJJLI = true;
    }

    public final void LJIIJ() {
        PowerAdapter powerAdapter = this.LL;
        C20603715jn c20603715jn = powerAdapter.LLJJJ;
        if (c20603715jn == null || !c20603715jn.LJIILL) {
            powerAdapter.LLLLLLLLL(new C20604915jz(powerAdapter));
        } else {
            C991830buv.LIZ(powerAdapter.LL, new AwS575S0100000_31(powerAdapter, 205));
        }
    }

    public List<Integer> getAdapterViewTypes() {
        return this.LL.LLLLLL();
    }

    public List<AbstractC1906720ziY> getAllChunks() {
        List<PowerStub> list = this.LL.LLILLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            arrayList.add(((PowerStub) it2.next()).LLILLJJLI);
        }
        return arrayList;
    }

    public List<InterfaceC1891350zJl> getListItems() {
        return this.LL.LLJJJJLIIL;
    }

    public C20600815jK<InterfaceC1891350zJl> getState() {
        return this.LL.LLLIILIL();
    }

    public final void LJIJI() {
        getPrimaryStub().LJI();
    }

    public final void LJIJJ() {
        getPrimaryStub().LIZLLL();
    }

    public int getFooterCount() {
        return getPrimaryStub().LLJILLL.size();
    }

    public int getHeaderCount() {
        return getPrimaryStub().LIZJ();
    }

    public C1160490gIx getLayoutHandlerRegistry() {
        return this.LLILLL;
    }

    public final void LIZJ(AbstractC1906720ziY abstractC1906720ziY) {
        this.LL.LLLL(null, abstractC1906720ziY);
    }

    public final void LIZLLL(View view) {
        PowerStub primaryStub = getPrimaryStub();
        if (view == null) {
            primaryStub.getClass();
            return;
        }
        int i = primaryStub.LLIZ;
        primaryStub.LLIZ = i + 1;
        CopyOnWriteArrayList<C423460Gj2> copyOnWriteArrayList = primaryStub.LLJILLL;
        copyOnWriteArrayList.add(copyOnWriteArrayList.size(), new C423460Gj2(i, view));
        ((HashMap) primaryStub.LLIZLLLIL).put(Integer.valueOf(i), HeaderAndFooterViewCell.class);
        primaryStub.LJIILLIIL();
    }

    public final void LJFF(AbstractC21685919tx abstractC21685919tx) {
        if (this.LLILLJJLI) {
            this.LLILLL.LIZ(abstractC21685919tx);
            return;
        }
        throw new IllegalStateException("Enable Layout-Engine first");
    }

    public final void LJII(InterfaceC20605815k8 interfaceC20605815k8) {
        this.LL.LLLFZ(interfaceC20605815k8);
    }

    public final void LJIIL(AbstractC329610Cw3<?> abstractC329610Cw3) {
        PowerAdapter powerAdapter = this.LL;
        powerAdapter.LLLIL(abstractC329610Cw3, null, (C20600815jK) powerAdapter.LLLLJI().LLJI.getValue());
    }

    public final void LJIILJJIL(Class<? extends PowerCell<?>>... clsArr) {
        this.LL.LLLILZ(clsArr);
    }

    public final void LJIJ(C1723500ux2... c1723500ux2Arr) {
        this.LL.LLLILZLLLI(c1723500ux2Arr);
    }

    public final void LJIJJLI(AbstractC1906720ziY abstractC1906720ziY) {
        C20605415k4 c20605415k4;
        Function1<C20607615kQ, Unit> function1;
        Function1<C20607615kQ, Unit> function12;
        PowerAdapter powerAdapter = this.LL;
        powerAdapter.getClass();
        InterfaceC1906710ziX interfaceC1906710ziXLJIIJ = abstractC1906720ziY.LJIIJ();
        C19719512Dh.LIZ(powerAdapter.LLILLL).remove(interfaceC1906710ziXLJIIJ);
        C19719512Dh.LIZJ(powerAdapter.LLIZ).remove(interfaceC1906710ziXLJIIJ);
        abstractC1906720ziY.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        abstractC1906720ziY.onDestroy();
        interfaceC1906710ziXLJIIJ.LJII();
        abstractC1906720ziY.LLILLL = false;
        PowerPageLoader<?> powerPageLoader = powerAdapter.LLIZLLLIL;
        if (powerPageLoader != null && Intrinsics.LJFF(powerPageLoader.LLIZLLLIL, abstractC1906720ziY.LJIIJ())) {
            C20605415k4 c20605415k42 = powerPageLoader.LLJILLL;
            if (c20605415k42 != null && (function12 = c20605415k42.LIZIZ) != null) {
                function12.invoke(C20607615kQ.LIZJ);
            }
            PowerPageLoader<?> powerPageLoader2 = powerAdapter.LLIZLLLIL;
            if (powerPageLoader2 != null) {
                powerPageLoader2.onDestroy();
            }
            PowerPageLoader<?> powerPageLoader3 = powerAdapter.LLIZLLLIL;
            if (powerPageLoader3 != null && (c20605415k4 = powerPageLoader3.LLJILLL) != null && (function1 = c20605415k4.LIZIZ) != null) {
                function1.invoke(C20607615kQ.LIZJ);
            }
            powerAdapter.LLIZLLLIL = null;
        }
        PowerAdapter.LLLLLLIL(powerAdapter);
        powerAdapter.LLLLLLLLLL();
    }

    public final void LJIL(View view) {
        PowerStub primaryStub = getPrimaryStub();
        primaryStub.getClass();
        if (view != null) {
            primaryStub.LJIIL(Collections.singletonList(view));
        }
    }

    public final void LJJ(View view) {
        PowerStub primaryStub = getPrimaryStub();
        primaryStub.getClass();
        if (view != null) {
            primaryStub.LJIIIIZZ(Collections.singletonList(view));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.LL.LLLI();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.LL.LLLII();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(AbstractC21673619ry abstractC21673619ry) {
        if (abstractC21673619ry instanceof PowerAdapter) {
            super.setAdapter(abstractC21673619ry);
            return;
        }
        throw new RuntimeException("Not Allow setAdapter in PowerList");
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.LL.LLLJL(lifecycleOwner);
    }

    public void setListConfig(C20603715jn c20603715jn) {
        this.LL.LLLJIL(c20603715jn, EnumC995420c0i.Direct);
    }

    public void setOrientation(int i) {
        setLayoutManager(new LinearLayoutManager(getContext(), i, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setViewCacheExtension(AbstractC1343480l46 abstractC1343480l46) {
        super.setViewCacheExtension(abstractC1343480l46);
    }

    public void setViewTypeMap(Map<Class<? extends PowerCell<?>>, Object> map) {
        PowerAdapter powerAdapter = this.LL;
        powerAdapter.getClass();
        if (map != null) {
            for (Map.Entry<Class<? extends PowerCell<?>>, Object> entry : map.entrySet()) {
                ((Map) powerAdapter.LLJILLL.getValue()).put(entry.getKey(), entry.getValue());
            }
        }
    }

    public ViewOnAttachStateChangeListenerC20604515jv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJ(int i, View view) {
        getPrimaryStub().LJFF(i, view);
    }

    public final int LJIIJJI(Class<? extends InterfaceC1891350zJl> cls, Class<? extends AbstractC1906720ziY> cls2) {
        boolean z;
        Integer numLLLLL;
        PowerStub next;
        Integer numLLLLL2;
        PowerAdapter powerAdapter = this.LL;
        powerAdapter.getClass();
        if (!Intrinsics.LJFF(cls, C423460Gj2.class)) {
            List<PowerStub> list = powerAdapter.LLILLL;
            if (cls2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                list = null;
            }
            if (list != null) {
                Iterator<PowerStub> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.LLILLJJLI.getClass(), cls2)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                PowerStub powerStub = next;
                if (powerStub != null && (numLLLLL2 = powerAdapter.LLLLL(powerStub, cls, null)) != null && numLLLLL2.intValue() != -1) {
                    return numLLLLL2.intValue();
                }
            }
            PowerStub powerStubLLLLJI = powerAdapter.LLLLJI();
            if (powerStubLLLLJI != null && cls2 == null && (numLLLLL = powerAdapter.LLLLL(powerStubLLLLJI, cls, null)) != null && numLLLLL.intValue() != -1 && numLLLLL != null) {
                return numLLLLL.intValue();
            }
            Integer num = (Integer) ((HashMap) powerAdapter.LLILZLL).get(cls);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }
        "Forbid get type of FixedViewItem".toString();
        throw new IllegalStateException("Forbid get type of FixedViewItem");
    }

    public final void LJIILIIL(AbstractC329610Cw3<?> abstractC329610Cw3, AbstractC1906720ziY abstractC1906720ziY) {
        this.LL.LLLIL(abstractC329610Cw3, abstractC1906720ziY, abstractC1906720ziY.LLILZLL);
    }

    public ViewOnAttachStateChangeListenerC20604515jv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        PowerAdapter powerAdapter = new PowerAdapter(this);
        this.LL = powerAdapter;
        setAdapter(powerAdapter);
        setLayoutManager(new LinearLayoutManager(getContext()));
        addOnAttachStateChangeListener(this);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        long jElapsedRealtimeNanos;
        C1558530qex c1558530qexLLLLLJLJLL = this.LL.LLLLLJLJLL();
        try {
            c1558530qexLLLLLJLJLL.getClass();
            c1558530qexLLLLLJLJLL.LIZ(C1562080qkg.LIZ);
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jElapsedRealtimeNanos = 0;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (jElapsedRealtimeNanos > 0) {
            try {
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                RecyclerView.LayoutManager layoutManager = getLayoutManager();
                long j = jElapsedRealtimeNanos2 - jElapsedRealtimeNanos;
                c1558530qexLLLLLJLJLL.getClass();
                if (layoutManager != null) {
                    c1558530qexLLLLLJLJLL.LIZIZ(C1562080qkg.LIZ, new AwS72S0100100_24(layoutManager, j, 3));
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
