package X;

import android.content.Context;
import android.util.SparseArray;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.103c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191834103c extends AbstractC21673619ry<C191838103g> implements InterfaceC191845103n {
    public final Context LL;
    public final List<AbstractC191843103l> LLILLJJLI;
    public final Map<Object, InterfaceC191837103f> LLILLL;
    public List<? extends AbstractC191840103i> LLILZ;
    public final List<AbstractC191832103a> LLILZIL = new ArrayList();
    public final Map<Object, Integer> LLILZLL;
    public final SparseArray<InterfaceC191837103f> LLIZ;
    public int LLIZLLLIL;

    @Override // X.InterfaceC191845103n
    public final void LJJIJIIJIL() {
        Iterator<AbstractC191832103a> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(this.LLILLJJLI);
        }
        final List<? extends AbstractC191840103i> list = this.LLILZ;
        final List<AbstractC191840103i> listLLLFZ = LLLFZ();
        this.LLILZ = listLLLFZ;
        C21342318fd.LIZ(new AbstractC21342018fa() { // from class: X.103d
            @Override // X.AbstractC21342018fa
            public final Object LIZJ(int i, int i2) {
                return null;
            }

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return listLLLFZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return list.size();
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                return Intrinsics.LJFF(ListProtector.get(list, i), ListProtector.get(listLLLFZ, i2));
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                if (this.LLLII((AbstractC191840103i) ListProtector.get(list, i)) == this.LLLII((AbstractC191840103i) ListProtector.get(listLLLFZ, i2))) {
                    return true;
                }
                return false;
            }
        }, true).LIZJ(this);
    }

    public final List<AbstractC191840103i> LLLFZ() {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC191843103l> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            arrayList.addAll(it2.next().LJ(this.LL));
        }
        Iterator it3 = ((ArrayList) this.LLILZIL).iterator();
        while (it3.hasNext()) {
            ((AbstractC191832103a) it3.next()).LIZIZ(arrayList);
        }
        if (arrayList.isEmpty()) {
            C1913480ztS.LIZ("pns_tpsc_exception_page_empty", null, null, 14);
        }
        return arrayList;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ.size();
    }

    @Override // X.InterfaceC191845103n
    public final void LLJI() {
        LJJIJIIJIL();
    }

    @Override // X.InterfaceC191845103n
    public final void LJJZZIII(C10AP c10ap) {
        notifyItemChanged(((ArrayList) this.LLILZ).indexOf(c10ap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC191837103f LLLI(AbstractC191840103i abstractC191840103i) {
        InterfaceC191837103f interfaceC191837103f;
        InterfaceC191837103f interfaceC191837103f2;
        Map<Object, InterfaceC191837103f> map = this.LLILLL;
        if (map == null || (interfaceC191837103f2 = map.get(abstractC191840103i.getClass())) == null) {
            if (!(abstractC191840103i instanceof InterfaceC191837103f) || (interfaceC191837103f = (InterfaceC191837103f) abstractC191840103i) == null) {
                return C191836103e.LIZ(abstractC191840103i.getClass());
            }
            return interfaceC191837103f;
        }
        return interfaceC191837103f2;
    }

    public final int LLLII(AbstractC191840103i abstractC191840103i) {
        Class<?> cls = abstractC191840103i.getClass();
        Integer num = (Integer) ((LinkedHashMap) this.LLILZLL).get(cls);
        if (num != null) {
            return num.intValue();
        }
        this.LLILZLL.put(cls, Integer.valueOf(this.LLIZLLLIL));
        this.LLIZ.put(this.LLIZLLLIL, LLLI(abstractC191840103i));
        int i = this.LLIZLLLIL;
        this.LLIZLLLIL = i + 1;
        return i;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return LLLII((AbstractC191840103i) ListProtector.get(this.LLILZ, i));
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        Function0<Unit> function0;
        C191838103g c191838103g = (C191838103g) viewHolder;
        super.onViewAttachedToWindow(c191838103g);
        AbstractC191840103i abstractC191840103i = c191838103g.LL;
        if (abstractC191840103i != null && (function0 = abstractC191840103i.LIZ) != null) {
            function0.invoke();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        Function0<Unit> function0;
        C191838103g c191838103g = (C191838103g) viewHolder;
        super.onViewDetachedFromWindow(c191838103g);
        AbstractC191840103i abstractC191840103i = c191838103g.LL;
        if (abstractC191840103i != null && (function0 = abstractC191840103i.LIZIZ) != null) {
            function0.invoke();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C191838103g c191838103g = (C191838103g) viewHolder;
        AbstractC191840103i abstractC191840103i = (AbstractC191840103i) ListProtector.get(this.LLILZ, i);
        LLLI(abstractC191840103i).LIZIZ(abstractC191840103i, c191838103g);
        c191838103g.LL = abstractC191840103i;
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C191838103g c191838103gLIZ = this.LLIZ.get(i).LIZ(this.LL, viewGroup);
        if (c191838103gLIZ != null) {
            try {
                View view = c191838103gLIZ.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        c191838103gLIZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c191838103gLIZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C191838103g.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c191838103gLIZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c191838103gLIZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C191838103g.class.getName();
        return c191838103gLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C191834103c(Context context, List<? extends AbstractC191843103l> list, Map<Object, ? extends InterfaceC191837103f> map) {
        this.LL = context;
        this.LLILLJJLI = list;
        this.LLILLL = map;
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            ((AbstractC191843103l) it2.next()).LIZLLL(this);
        }
        this.LLILZ = LLLFZ();
        this.LLILZLL = new LinkedHashMap();
        this.LLIZ = new SparseArray<>();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C191838103g c191838103g = (C191838103g) viewHolder;
        AbstractC191840103i abstractC191840103i = (AbstractC191840103i) ListProtector.get(this.LLILZ, i);
        LLLI(abstractC191840103i).LJ(abstractC191840103i, c191838103g, i);
        c191838103g.LL = abstractC191840103i;
    }
}
