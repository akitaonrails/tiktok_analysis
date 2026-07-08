package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344380Dem extends AbstractC1585810rMx implements InterfaceC497601wk {
    public static final AtomicInteger LLILZLL = new AtomicInteger(0);
    public final OptimizeAbility LL;
    public final RecyclerView LLILLJJLI;
    public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> LLILLL;
    public final C1DFK LLILZ = C23118094a.LIZ();
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 500));

    public final void LJJIL() {
        PowerAdapter powerAdapter;
        AbstractC21673619ry adapter = this.LLILLJJLI.getAdapter();
        if (!(adapter instanceof PowerAdapter) || (powerAdapter = (PowerAdapter) adapter) == null) {
            return;
        }
        C23250099c.LIZLLL(this, null, null, new C343100Dci(this, powerAdapter, null), 3);
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return (CoroutineContext) this.LLILZIL.getValue();
    }

    public final void LJJIJIIJIL(PowerAdapter powerAdapter) {
        int iIntValue;
        powerAdapter.getClass();
        HashMap map = new HashMap();
        for (PowerStub powerStub : (ArrayList) powerAdapter.LLLLLJIL()) {
            for (Map.Entry entry : ((HashMap) powerStub.LLIZLLLIL).entrySet()) {
                int iIntValue2 = ((Number) entry.getKey()).intValue();
                Integer num = (Integer) ((HashMap) powerAdapter.LLIZ).get(powerStub);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                map.put(Integer.valueOf(iIntValue2 + iIntValue), entry.getValue());
            }
        }
        C23250099c.LIZLLL(this, null, null, new C343090Dch(this, map, powerAdapter, null), 3);
    }

    public final void LJJJ(int i, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) throws Throwable {
        int size;
        RecyclerView.ViewHolder viewHolderCreateViewHolder;
        AbstractC21673619ry adapter = viewOnAttachStateChangeListenerC20604515jv.getAdapter();
        if (adapter == null) {
            return;
        }
        int itemViewType = adapter.getItemViewType(i);
        CopyOnWriteArrayList<RecyclerView.ViewHolder> copyOnWriteArrayList = this.LLILLL.get(Integer.valueOf(itemViewType));
        if (copyOnWriteArrayList != null) {
            size = copyOnWriteArrayList.size();
        } else {
            size = 0;
        }
        if (size >= this.LL.preloadCount) {
            return;
        }
        if (viewOnAttachStateChangeListenerC20604515jv.getRecycledViewPool().getRecycledViewCount(itemViewType) > 1) {
            viewHolderCreateViewHolder = viewOnAttachStateChangeListenerC20604515jv.getRecycledViewPool().getRecycledView(itemViewType);
            Class<?> superclass = viewHolderCreateViewHolder.getClass();
            while (true) {
                if (superclass == null) {
                    break;
                }
                if (Intrinsics.LJFF(superclass, RecyclerView.ViewHolder.class)) {
                    Method[] declaredMethods = superclass.getDeclaredMethods();
                    int length = declaredMethods.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        Method method = declaredMethods[i2];
                        if (Intrinsics.LJFF(method.getName(), "resetInternal")) {
                            method.setAccessible(true);
                            C2204961BRm.a0(method, viewHolderCreateViewHolder, new Object[0], new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtWRf5Sn8defrWucGAu86nwth5dGSSnmH8smPGU/j4WLJSLv8qUEgRLYAeA==", null));
                            break;
                        }
                        i2++;
                    }
                } else {
                    superclass = superclass.getSuperclass();
                }
            }
        } else {
            viewHolderCreateViewHolder = adapter.createViewHolder(viewOnAttachStateChangeListenerC20604515jv, itemViewType);
        }
        LJJJJ(viewHolderCreateViewHolder, itemViewType, 0);
    }

    public C344380Dem(OptimizeAbility optimizeAbility, RecyclerView recyclerView, ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> concurrentHashMap) {
        this.LL = optimizeAbility;
        this.LLILLJJLI = recyclerView;
        this.LLILLL = concurrentHashMap;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        C23250099c.LIZLLL(this, null, null, new C506001y6(recyclerView, this, null), 3);
    }

    public final void LJJIZ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, int i, int i2) throws Throwable {
        int itemCount;
        int i3 = (i - this.LL.preloadCount) - 1;
        if (i3 <= 0) {
            i3 = 0;
        }
        AbstractC21673619ry adapter = viewOnAttachStateChangeListenerC20604515jv.getAdapter();
        if (adapter != null) {
            itemCount = adapter.getItemCount();
        } else {
            itemCount = -1;
        }
        int i4 = (this.LL.preloadCount + i2) - 1;
        if (itemCount > i4) {
            itemCount = i4;
        }
        Pair pair = new Pair(Integer.valueOf(i3), Integer.valueOf(i - 1));
        Pair pair2 = new Pair(Integer.valueOf(i2 + 1), Integer.valueOf(itemCount));
        try {
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            if (iIntValue <= iIntValue2) {
                while (true) {
                    LJJJ(iIntValue, viewOnAttachStateChangeListenerC20604515jv);
                    if (iIntValue == iIntValue2) {
                        break;
                    } else {
                        iIntValue++;
                    }
                }
            }
            int iIntValue3 = ((Number) pair2.getFirst()).intValue();
            int iIntValue4 = ((Number) pair2.getSecond()).intValue();
            if (iIntValue3 > iIntValue4) {
                return;
            }
            while (true) {
                LJJJ(iIntValue3, viewOnAttachStateChangeListenerC20604515jv);
                if (iIntValue3 != iIntValue4) {
                    iIntValue3++;
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJJJ(RecyclerView.ViewHolder viewHolder, int i, int i2) {
        int size;
        RecyclerView.LayoutParams layoutParamsGenerateLayoutParams;
        synchronized (this.LLILLL) {
            try {
                int i3 = this.LL.preloadCount;
                if (i2 <= 0) {
                    i2 = i3;
                }
                CopyOnWriteArrayList<RecyclerView.ViewHolder> copyOnWriteArrayList = this.LLILLL.get(Integer.valueOf(i));
                if (copyOnWriteArrayList != null) {
                    size = copyOnWriteArrayList.size();
                } else {
                    size = 0;
                }
                if (size >= i2) {
                    return;
                }
                CopyOnWriteArrayList<RecyclerView.ViewHolder> copyOnWriteArrayList2 = this.LLILLL.get(Integer.valueOf(i));
                if (copyOnWriteArrayList2 == null) {
                    copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    this.LLILLL.put(Integer.valueOf(i), copyOnWriteArrayList2);
                }
                copyOnWriteArrayList2.add(viewHolder);
                try {
                    RecyclerView.LayoutManager layoutManager = this.LLILLJJLI.getLayoutManager();
                    if (layoutManager != null && (!(viewHolder.itemView.getLayoutParams() instanceof RecyclerView.LayoutParams)) && (layoutParamsGenerateLayoutParams = layoutManager.generateLayoutParams(viewHolder.itemView.getLayoutParams())) != null) {
                        C786410Ut5.W5(viewHolder.itemView, layoutParamsGenerateLayoutParams);
                    }
                    Reflect.on(viewHolder.itemView.getLayoutParams()).set("mViewHolder", viewHolder);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
