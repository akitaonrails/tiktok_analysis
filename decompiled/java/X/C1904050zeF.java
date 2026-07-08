package X;

import Y.AObserverS230S0100000_28;
import Y.ARunnableS30S0101000_19;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AdapterLoadingCell;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS420S0200000_19;

/* JADX INFO: renamed from: X.0zeF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904050zeF extends AbstractC1890380zIC implements InterfaceC1263010iyJ {
    public final InterfaceC1904060zeG LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public C20603715jn LLILZIL;
    public Pair<C1271704yJ, Class<AdapterLoadingCell>> LLILZLL;
    public int LLIZ;
    public final Map<Integer, Class<? extends PowerCell<?>>> LLIZLLLIL;
    public final Map<Type, Integer> LLJ;
    public final List<InterfaceC1891350zJl> LLJI;
    public Function0<Unit> LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public final C20600815jK<InterfaceC1891350zJl> LLJILLL;

    @Override // X.InterfaceC1262810ixz
    public final void Eg(InterfaceC1261750iwH interfaceC1261750iwH) {
        this.LLILLJJLI.Eg(interfaceC1261750iwH);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LJJLIIIJILLIZJL(String str, String str2, List list) {
        this.LLILLJJLI.LJJLIIIJILLIZJL(str, str2, list);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LLFZ(boolean z) {
        this.LLILLJJLI.LLFZ(z);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LLILLIZIL() {
        this.LLILLJJLI.LLILLIZIL();
    }

    @Override // X.InterfaceC1262810ixz
    public final C1075800e6M getCurrentState() {
        return this.LLILLJJLI.getCurrentState();
    }

    @Override // X.InterfaceC1262810ixz
    public final void ng(InterfaceC1261750iwH interfaceC1261750iwH) {
        this.LLILLJJLI.ng(interfaceC1261750iwH);
    }

    @Override // X.InterfaceC1263010iyJ
    public final C1262300ixA getConfig() {
        return this.LLILLJJLI.getConfig();
    }

    @Override // X.InterfaceC1263010iyJ
    public final String LJJJLIIL() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1263010iyJ
    public final C20600815jK<InterfaceC1891350zJl> LJJZZI() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1263010iyJ
    public final boolean LJLJI() {
        return this.LLJILJIL;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0zIB] */
    public C1904050zeF(C1262980iyG c1262980iyG) {
        super(new AbstractC339510DSr<InterfaceC1891350zJl>() { // from class: X.0zIB
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(InterfaceC1891350zJl interfaceC1891350zJl, InterfaceC1891350zJl interfaceC1891350zJl2) {
                return interfaceC1891350zJl.areContentsTheSame(interfaceC1891350zJl2);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(InterfaceC1891350zJl interfaceC1891350zJl, InterfaceC1891350zJl interfaceC1891350zJl2) {
                return interfaceC1891350zJl.areItemTheSame(interfaceC1891350zJl2);
            }
        });
        this.LLILLJJLI = c1262980iyG;
        this.LLILLL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(234));
        this.LLILZ = C447550Hgn.LJII(AFwS195S0000000_9.get$arr$(518));
        this.LLIZ = 996;
        this.LLIZLLLIL = new LinkedHashMap();
        this.LLJ = new LinkedHashMap();
        this.LLJI = new ArrayList();
        this.LLJILLL = new C20600815jK<>();
    }

    @Override // X.InterfaceC1262810ixz
    public final void LJI(AbstractC1264080j02<C1261860iwS> abstractC1264080j02) {
        this.LLILLJJLI.LJJLIIIJJIZ(this);
        this.LLILLJJLI.LJI(abstractC1264080j02);
        C20603715jn c20603715jnLLFII = this.LLILLJJLI.LLFII();
        this.LLILZIL = c20603715jnLLFII;
        if (c20603715jnLLFII == null) {
            c20603715jnLLFII = null;
        }
        if (c20603715jnLLFII.LIZLLL != null) {
            this.LLILZLL = new Pair<>(new C1271704yJ(), AdapterLoadingCell.class);
            this.LLIZLLLIL.put(-2000, AdapterLoadingCell.class);
        }
    }

    @Override // X.InterfaceC1263010iyJ
    public final void LJJLIIIJLJLI(AwS420S0200000_19 awS420S0200000_19) {
        this.LLJIJIL = awS420S0200000_19;
    }

    @Override // X.InterfaceC1263010iyJ
    public final void LJLJJLL(Class<? extends PowerCell<?>>... clsArr) {
        for (Class<? extends PowerCell<?>> cls : clsArr) {
            Object objLJIL = C13LQ.LJIL(((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments());
            if (objLJIL != null && ((LinkedHashMap) this.LLJ).get(objLJIL) == null) {
                int i = this.LLIZ;
                this.LLIZ = i + 1;
                this.LLJ.put((Type) objLJIL, Integer.valueOf(i));
                this.LLIZLLLIL.put(Integer.valueOf(i), cls);
            }
        }
    }

    @Override // X.InterfaceC1263010iyJ
    public final void LLJJ(String str) {
        this.LLJILJILJ = str;
    }

    @Override // X.AbstractC2172971A2l
    public final void LLLI(List<InterfaceC1891350zJl> list) {
        Pair<C1271704yJ, Class<AdapterLoadingCell>> pair;
        C1271704yJ first;
        ArrayList arrayList = new ArrayList(list);
        if ((!arrayList.isEmpty()) && getCurrentState().LIZ() && (pair = this.LLILZLL) != null && (first = pair.getFirst()) != null) {
            arrayList.add(first);
        }
        super.LLLI(arrayList);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        InterfaceC1891350zJl interfaceC1891350zJlLLLFZ = LLLFZ(i);
        if (interfaceC1891350zJlLLLFZ instanceof C423460Gj2) {
            return ((C423460Gj2) interfaceC1891350zJlLLLFZ).LLILLJJLI;
        }
        if (interfaceC1891350zJlLLLFZ instanceof C1271704yJ) {
            return ((C1271704yJ) interfaceC1891350zJlLLLFZ).LL;
        }
        Class<?> cls = interfaceC1891350zJlLLLFZ.getClass();
        Integer num = (Integer) ((LinkedHashMap) this.LLJ).get(cls);
        if (num != null) {
            return num.intValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("not registerCells for: ");
        sbLIZ.append(cls.getName());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLILLJJLI.LLIIZ(recyclerView);
        this.LLJILJIL = true;
        Function0<Unit> function0 = this.LLJIJIL;
        if (function0 != null) {
            function0.invoke();
        }
        observe(this.LLILLJJLI.getLifecycleOwner(), new AObserverS230S0100000_28(this, 74));
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        removeObservers(this.LLILLJJLI.getLifecycleOwner());
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        PowerCell powerCell = (PowerCell) viewHolder;
        super.onViewAttachedToWindow(powerCell);
        powerCell.onViewAttachedToWindow();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        PowerCell powerCell = (PowerCell) viewHolder;
        super.onViewDetachedFromWindow(powerCell);
        powerCell.onViewDetachedFromWindow();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        PowerCell powerCell = (PowerCell) viewHolder;
        super.onViewRecycled(powerCell);
        powerCell.unBind();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean zLJI = MethodIDManager.LJI(202401);
        boolean zLJI2 = MethodIDManager.LJI(202401);
        ((PowerCell) viewHolder).onBindItemView(LLLFZ(i));
        ((Handler) this.LLILZ.getValue()).removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(100L, (Handler) this.LLILZ.getValue(), new ARunnableS30S0101000_19(i, this, 9));
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) throws IllegalAccessException {
        View viewOnCreateItemView;
        Class cls = (Class) ((LinkedHashMap) this.LLIZLLLIL).get(Integer.valueOf(i));
        if (cls != null) {
            PowerCell powerCell = (PowerCell) cls.newInstance();
            powerCell.setParent(this.LLILLJJLI.getLifecycleOwner());
            int layoutId = powerCell.getLayoutId();
            if (layoutId > 0) {
                Context context = viewGroup.getContext();
                C20673215v0.LIZ(layoutId, context);
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    viewOnCreateItemView = C1600630rkr.LIZ(layoutId, activityLIZ);
                    C20673215v0.LJI(layoutId, context);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                viewOnCreateItemView = powerCell.onCreateItemView(viewGroup);
            }
            Field field = (Field) this.LLILLL.getValue();
            if (field != null) {
                field.set(powerCell, viewOnCreateItemView);
            }
            powerCell.onItemViewCreated();
            try {
                View view = powerCell.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            powerCell.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
            try {
                if (powerCell.itemView.getParent() != null) {
                    try {
                        SettingsManager.LIZLLL().getClass();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(powerCell.getClass().getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(viewGroup.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C1AF0.LIZJ(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) powerCell.itemView.getParent();
                        if (viewGroup2 != null) {
                            C786410Ut5.LJJJLZIJ(powerCell.itemView, viewGroup2);
                        }
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C2081408Dk.LIZ(e2);
                C2344809Gs.LIZ(e2);
            }
            C20612085q.LIZ = powerCell.getClass().getName();
            return powerCell;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("not registerCells viewType: ");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }
}
