package X;

import X.InterfaceC339570DSx;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DSv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339550DSv<T extends InterfaceC339570DSx> extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public Map<Class<? extends T>, ? extends C0DVN<?, ?>> LL;
    public final List<T> LLILLJJLI = new ArrayList();
    public final LinkedHashMap<Class<? extends T>, Integer> LLILLL = new LinkedHashMap<>();
    public final LinkedHashMap<Integer, C0DVN<?, ?>> LLILZ = new LinkedHashMap<>();

    public final void LLLFZ() {
        this.LLILLL.clear();
        this.LLILZ.clear();
        int i = 0;
        for (Object obj : this.LL.keySet()) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            this.LLILLL.put((Class<? extends T>) obj, Integer.valueOf(i));
            this.LLILZ.put(Integer.valueOf(i), (C0DVN<?, ?>) C2097608Jq.LJFF(obj, this.LL));
            i = i2;
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C339550DSv(Map<Class<? extends T>, ? extends C0DVN<?, ?>> map) {
        this.LL = map;
        LLLFZ();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object next;
        Integer num;
        Class<?> cls = ListProtector.get(this.LLILLJJLI, i).getClass();
        Integer num2 = this.LLILLL.get(cls);
        if (num2 != null) {
            return num2.intValue();
        }
        Iterator<T> it2 = this.LLILLL.entrySet().iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (!((Class) ((Map.Entry) next).getKey()).isAssignableFrom(cls));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null && (num = (Integer) entry.getValue()) != null) {
            return num.intValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No flash binder registered for ");
        sbLIZ.append(cls.getName());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        AbstractC339560DSw abstractC339560DSw;
        super.onViewDetachedFromWindow(viewHolder);
        if ((viewHolder instanceof AbstractC339560DSw) && (abstractC339560DSw = (AbstractC339560DSw) viewHolder) != null) {
            abstractC339560DSw.L5();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        AbstractC339560DSw abstractC339560DSw;
        if ((viewHolder instanceof AbstractC339560DSw) && (abstractC339560DSw = (AbstractC339560DSw) viewHolder) != null) {
            abstractC339560DSw.L5();
        }
        super.onViewRecycled(viewHolder);
    }

    public final void LLLI(List<? extends T> list, Function1<? super String, Boolean> function1) {
        ((ArrayList) this.LLILLJJLI).clear();
        List<T> list2 = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (function1 == null || function1.invoke(t2.LJJJ()).booleanValue()) {
                arrayList.add(t);
            }
        }
        ((ArrayList) list2).addAll(arrayList);
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((AbstractC339560DSw) viewHolder).I5((InterfaceC339570DSx) ListProtector.get(this.LLILLJJLI, i));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0DVN<?, ?> c0dvn = this.LLILZ.get(Integer.valueOf(i));
        if (c0dvn != null) {
            AbstractC339560DSw abstractC339560DSwLIZJ = c0dvn.LIZJ(C786410Ut5.ne(viewGroup.getContext()), viewGroup);
            if (abstractC339560DSwLIZJ != null) {
                try {
                    View view = abstractC339560DSwLIZJ.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            abstractC339560DSwLIZJ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
            try {
                if (abstractC339560DSwLIZJ.itemView.getParent() != null) {
                    try {
                        SettingsManager.LIZLLL().getClass();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(abstractC339560DSwLIZJ.getClass().getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(viewGroup.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C1AF0.LIZJ(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) abstractC339560DSwLIZJ.itemView.getParent();
                        if (viewGroup2 != null) {
                            C786410Ut5.LJJJLZIJ(abstractC339560DSwLIZJ.itemView, viewGroup2);
                        }
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C2081408Dk.LIZ(e2);
                C2344809Gs.LIZ(e2);
            }
            C20612085q.LIZ = abstractC339560DSwLIZJ.getClass().getName();
            return abstractC339560DSwLIZJ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No flash binder found for viewType=");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }
}
