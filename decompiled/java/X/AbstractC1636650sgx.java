package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0sgx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1636650sgx<T> extends AbstractC21673619ry<C1636260sgK<T>> {
    public final InterfaceC1631540sYi<T> LL;
    public final C1636520sgk LLILLJJLI;
    public final C1636690sh1<T, C1636260sgK<T>> LLILLL;
    public List<T> LLILZ;
    public int LLILZIL;
    public T LLILZLL;

    public abstract void LLLFZ(C1636260sgK<T> c1636260sgK);

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ.size() + 2;
    }

    public int LLLI(T t) {
        return this.LL.Gp(t);
    }

    public T LLLII(int i) {
        if (i >= getItemCount()) {
            return null;
        }
        List<T> list = this.LLILZ;
        int i2 = 0;
        if (list == null || list.isEmpty()) {
            return null;
        }
        int iMin = Math.min(i - 1, this.LLILZ.size() - 1);
        List<T> list2 = this.LLILZ;
        if (iMin >= 0) {
            i2 = iMin;
        }
        return (T) ListProtector.get(list2, i2);
    }

    public boolean LLLIIIIL(int i) {
        if (i == 0 || i == getItemCount() - 1) {
            return true;
        }
        return false;
    }

    public C1636260sgK<T> LLLILZ(ViewGroup viewGroup) {
        Function1<? super ViewGroup, ? extends View> function1;
        C1636520sgk c1636520sgk = this.LLILLJJLI;
        if (c1636520sgk != null && (function1 = c1636520sgk.LJIIL) != null) {
            return new C1636260sgK<>(function1.invoke(viewGroup));
        }
        return new C1631750sZ3(10, viewGroup);
    }

    public C1636260sgK<T> LLLILZLLLI(ViewGroup viewGroup) {
        Function1<? super ViewGroup, ? extends View> function1;
        C1636520sgk c1636520sgk = this.LLILLJJLI;
        if (c1636520sgk != null && (function1 = c1636520sgk.LJIIJJI) != null) {
            return new C1636260sgK<>(function1.invoke(viewGroup));
        }
        return new C1631750sZ3(5, viewGroup);
    }

    public void LLLJ(C1636690sh1 c1636690sh1) {
        c1636690sh1.LIZ(AnonymousClass0207.get$arr$(154), new AwS604S0100000_25((AbstractC1636650sgx) this, (AbstractC1636650sgx<Object>) 845));
        c1636690sh1.LIZ(new AwS604S0100000_25((AbstractC1636650sgx) this, (AbstractC1636650sgx<Object>) 847), new AwS604S0100000_25((AbstractC1636650sgx) this, (AbstractC1636650sgx<Object>) 849));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object next;
        C1636690sh1<T, C1636260sgK<T>> c1636690sh1 = this.LLILLL;
        Iterator it2 = c1636690sh1.LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C1636730sh5) next).LIZIZ.invoke(Integer.valueOf(i)).booleanValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1636730sh5 c1636730sh5 = (C1636730sh5) next;
        if (c1636730sh5 != null) {
            Function1<ViewGroup, VH> function1 = c1636730sh5.LIZ;
            int i2 = c1636730sh5.LIZJ;
            if (c1636690sh1.LIZIZ.get(i2) == null) {
                c1636690sh1.LIZIZ.put(i2, (Function1<ViewGroup, VH>) function1);
            }
            return i2;
        }
        "no factory is registered for this item type".toString();
        throw new IllegalArgumentException("no factory is registered for this item type");
    }

    @Override // X.AbstractC21673619ry
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        C1636520sgk c1636520sgk = this.LLILLJJLI;
        if (c1636520sgk != null && c1636520sgk.LJIILIIL) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LJIJI(new C1698040uHy(this, layoutManager, 1));
        }
    }

    public AbstractC1636650sgx(InterfaceC1631540sYi<T> interfaceC1631540sYi, C1636520sgk c1636520sgk) {
        this.LL = interfaceC1631540sYi;
        this.LLILLJJLI = c1636520sgk;
        C1636690sh1<T, C1636260sgK<T>> c1636690sh1 = new C1636690sh1<>();
        LLLJ(c1636690sh1);
        this.LLILLL = c1636690sh1;
        this.LLILZ = new ArrayList();
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLIILIL, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C1636260sgK<T> c1636260sgK, int i) {
        T tLLLII = LLLII(i);
        if (tLLLII == null) {
            return;
        }
        Pair<EnumC1641420soe, Integer> pairNl0 = this.LL.Nl0(tLLLII, true);
        c1636260sgK.I5(tLLLII, pairNl0.getFirst(), pairNl0.getSecond(), i, this.LLILZIL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1636690sh1<T, C1636260sgK<T>> c1636690sh1 = this.LLILLL;
        if (c1636690sh1.LIZIZ.indexOfKey(i) >= 0) {
            C1636260sgK<T> c1636260sgK = (C1636260sgK) ((Function1) c1636690sh1.LIZIZ.get(i)).invoke(viewGroup);
            LLLFZ(c1636260sgK);
            if (c1636260sgK != null) {
                try {
                    View view = c1636260sgK.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            c1636260sgK.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
            try {
                if (c1636260sgK.itemView.getParent() != null) {
                    try {
                        SettingsManager.LIZLLL().getClass();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(c1636260sgK.getClass().getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(viewGroup.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C1AF0.LIZJ(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) c1636260sgK.itemView.getParent();
                        if (viewGroup2 != null) {
                            C786410Ut5.LJJJLZIJ(c1636260sgK.itemView, viewGroup2);
                        }
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C2081408Dk.LIZ(e2);
                C2344809Gs.LIZ(e2);
            }
            C20612085q.LIZ = c1636260sgK.getClass().getName();
            return c1636260sgK;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("no factory for viewType ");
        sbLIZ.append(i);
        sbLIZ.append(" is registered");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [DATA, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLIL, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C1636260sgK<T> c1636260sgK, int i, List<Object> list) {
        if (!list.isEmpty()) {
            ?? LJJJLL = C13LP.LJJJLL(list);
            if (LJJJLL instanceof Boolean) {
                c1636260sgK.S5(((Boolean) LJJJLL).booleanValue());
                return;
            }
            Pair<EnumC1641420soe, Integer> pairNl0 = this.LL.Nl0(LJJJLL, true);
            EnumC1641420soe first = pairNl0.getFirst();
            Integer second = pairNl0.getSecond();
            c1636260sgK.LL = LJJJLL;
            c1636260sgK.N5(c1636260sgK.getPosition(), first, second, LJJJLL);
            return;
        }
        super.onBindViewHolder(c1636260sgK, i, list);
    }
}
