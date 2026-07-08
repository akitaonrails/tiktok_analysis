package X;

import Y.AComparatorS44S0000000_25;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0smj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1640230smj<DATA> extends AbstractC1640350smv {
    public final AbstractC21673619ry<RecyclerView.ViewHolder> LL;
    public final List<Pair<Integer, DATA>> LLILLJJLI = new ArrayList();
    public final Map<Integer, DATA> LLILLL = new LinkedHashMap();

    public abstract void LLLI(RecyclerView.ViewHolder viewHolder, DATA data);

    public abstract RecyclerView.ViewHolder LLLII(ViewGroup viewGroup);

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return LLLIIIIL(this.LL.getItemCount() - 1) + 1;
    }

    public AbstractC1640230smj(AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry) {
        this.LL = abstractC21673619ry;
        abstractC21673619ry.registerAdapterDataObserver(new AbstractC471570IeR(this) { // from class: X.0smk
            public final /* synthetic */ AbstractC1640230smj<DATA> LIZ;

            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                this.LIZ.notifyDataSetChanged();
            }

            {
                this.LIZ = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.AbstractC471570IeR
            public final void LIZIZ(int i, int i2) {
                int iLLLIIIIL = this.LIZ.LLLIIIIL(i);
                this.LIZ.notifyItemRangeChanged(iLLLIIIIL, this.LIZ.LLLIIIIL(i + i2) - iLLLIIIIL);
            }

            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i, int i2) {
                this.LIZ.notifyDataSetChanged();
            }

            @Override // X.AbstractC471570IeR
            public final void LJ(int i, int i2) {
                this.LIZ.notifyDataSetChanged();
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i, int i2) {
                this.LIZ.notifyDataSetChanged();
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.AbstractC471570IeR
            public final void LIZJ(int i, int i2, Object obj) {
                int iLLLIIIIL = this.LIZ.LLLIIIIL(i);
                this.LIZ.notifyItemRangeChanged(iLLLIIIIL, this.LIZ.LLLIIIIL(i + i2) - iLLLIIIIL, obj);
            }
        });
    }

    public final int LLLIIIIL(int i) {
        List<Pair<Integer, DATA>> list = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (Pair<Integer, DATA> pair : list) {
            if (pair.getFirst().intValue() < i) {
                arrayList.add(pair);
            }
        }
        return i + arrayList.size();
    }

    public final int LLLIILIL(int i) {
        Map<Integer, DATA> map = this.LLILLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (((Number) entry.getKey()).intValue() < i) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return i - linkedHashMap.size();
    }

    public final void LLLIL(List<? extends Pair<Integer, ? extends DATA>> list) {
        ((ArrayList) this.LLILLJJLI).clear();
        List<Pair<Integer, DATA>> list2 = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (((Number) ((Pair) obj).getFirst()).intValue() >= 0) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(Integer.valueOf(((Number) ((Pair) obj2).getFirst()).intValue()))) {
                arrayList2.add(obj2);
            }
        }
        ((ArrayList) list2).addAll(arrayList2);
        ArrayList arrayList3 = (ArrayList) this.LLILLJJLI;
        if (arrayList3.size() > 1) {
            C08XD.LJJ(arrayList3, new AComparatorS44S0000000_25(7));
        }
        ((LinkedHashMap) this.LLILLL).clear();
        for (Pair pair : (ArrayList) this.LLILLJJLI) {
            this.LLILLL.put(Integer.valueOf(((Number) pair.getFirst()).intValue() + this.LLILLL.size() + 1), (DATA) pair.getSecond());
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public int getItemViewType(int i) {
        if (((LinkedHashMap) this.LLILLL).keySet().contains(Integer.valueOf(i))) {
            return -2147483647;
        }
        return this.LL.getItemViewType(LLLIILIL(i));
    }

    @Override // X.AbstractC1640350smv
    public int LLLFZ(int i, GridLayoutManager gridLayoutManager) {
        if (getItemViewType(i) == -2147483647) {
            return gridLayoutManager.LLILLJJLI;
        }
        AbstractC21673619ry<RecyclerView.ViewHolder> abstractC21673619ry = this.LL;
        if (abstractC21673619ry instanceof AbstractC1640350smv) {
            return ((AbstractC1640350smv) abstractC21673619ry).LLLFZ(LLLIILIL(i), gridLayoutManager);
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == -2147483647) {
            LLLI(viewHolder, ((LinkedHashMap) this.LLILLL).get(Integer.valueOf(i)));
            return;
        }
        this.LL.onBindViewHolder(viewHolder, LLLIILIL(i));
    }

    @Override // X.AbstractC21673619ry
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderOnCreateViewHolder;
        if (-2147483647 == i) {
            viewHolderOnCreateViewHolder = LLLII(viewGroup);
        } else {
            viewHolderOnCreateViewHolder = this.LL.onCreateViewHolder(viewGroup, i);
        }
        if (viewHolderOnCreateViewHolder != null) {
            try {
                View view = viewHolderOnCreateViewHolder.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        viewHolderOnCreateViewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderOnCreateViewHolder.itemView.getParent() != null) {
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderOnCreateViewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderOnCreateViewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderOnCreateViewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderOnCreateViewHolder.getClass().getName();
        return viewHolderOnCreateViewHolder;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (getItemViewType(i) == -2147483647) {
            onBindViewHolder(viewHolder, i);
        } else {
            this.LL.onBindViewHolder(viewHolder, LLLIILIL(i), list);
        }
    }
}
