package X;

import Y.AObserverS230S0100000_28;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS420S0200000_19;

/* JADX INFO: renamed from: X.0zeE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904040zeE extends AbstractC1903730zdj implements InterfaceC1263010iyJ {
    public final InterfaceC1904060zeG LL;
    public boolean LLILLJJLI;
    public Function0<Unit> LLILLL;
    public List<? extends InterfaceC1891350zJl> LLILZ;
    public String LLIZLLLIL;
    public final List<InterfaceC1891350zJl> LLILZIL = new ArrayList();
    public final Map<Type, Class<? extends PowerCell<?>>> LLILZLL = new LinkedHashMap();
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(235));
    public final C20600815jK<InterfaceC1891350zJl> LLJ = new C20600815jK<>();

    @Override // X.InterfaceC1262810ixz
    public final void Eg(InterfaceC1261750iwH interfaceC1261750iwH) {
        this.LL.Eg(interfaceC1261750iwH);
    }

    @Override // X.AbstractC1903730zdj
    public final List<C13IQ<? extends InterfaceC1891350zJl>> LJIIJ() {
        return C1697810uHb.LJIIJJI(C13LE.LIZ(C1262040iwk.class), C13LE.LIZ(C1262000iwg.class), C13LE.LIZ(C1261650iw7.class), C13LE.LIZ(C1261760iwI.class), C13LE.LIZ(C1261920iwY.class));
    }

    @Override // X.InterfaceC1262810ixz
    public final void LJJLIIIJILLIZJL(String str, String str2, List list) {
        this.LL.LJJLIIIJILLIZJL(str, str2, list);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LJJLL(InterfaceC1262660ixk interfaceC1262660ixk) {
        this.LL.LJJLL(interfaceC1262660ixk);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LLFZ(boolean z) {
        this.LL.LLFZ(z);
    }

    @Override // X.InterfaceC1262810ixz
    public final void LLILLIZIL() {
        this.LL.LLILLIZIL();
    }

    @Override // X.InterfaceC1262810ixz
    public final C1075800e6M getCurrentState() {
        return this.LL.getCurrentState();
    }

    @Override // X.InterfaceC1262810ixz
    public final AbstractC21673719rz getItemAnimator() {
        return this.LL.getItemAnimator();
    }

    @Override // X.InterfaceC1262810ixz
    public final void ng(InterfaceC1261750iwH interfaceC1261750iwH) {
        this.LL.ng(interfaceC1261750iwH);
    }

    @Override // X.InterfaceC1262810ixz
    public final void reset() {
        this.LL.reset();
    }

    @Override // X.AbstractC1903730zdj
    public final List<C13IQ<? extends PowerCell<?>>> LIZ() {
        Map<Type, Class<? extends PowerCell<?>>> map = this.LLILZLL;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(C13LE.LIZ((Class) ((Map.Entry) it2.next()).getValue()));
        }
        return arrayList;
    }

    @Override // X.InterfaceC1263010iyJ
    public final C1262300ixA getConfig() {
        return this.LL.getConfig();
    }

    @Override // X.InterfaceC1263010iyJ
    public final String LJJJLIIL() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1263010iyJ
    public final C20600815jK<InterfaceC1891350zJl> LJJZZI() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1263010iyJ
    public final boolean LJLJI() {
        return this.LLILLJJLI;
    }

    public C1904040zeE(C1262980iyG c1262980iyG) {
        this.LL = c1262980iyG;
    }

    @Override // X.AbstractC1903730zdj
    public final void LIZIZ(RecyclerView recyclerView) {
        this.LL.LLIIZ(recyclerView);
        this.LLILLJJLI = true;
        Function0<Unit> function0 = this.LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
        observe(this.LL.getLifecycleOwner(), new AObserverS230S0100000_28(this, 75));
    }

    @Override // X.AbstractC1903730zdj
    public final void LIZJ(RecyclerView recyclerView) {
        removeObservers(this.LL.getLifecycleOwner());
    }

    @Override // X.InterfaceC1262810ixz
    public final void LJI(AbstractC1264080j02<C1261860iwS> abstractC1264080j02) {
        this.LL.LJJLIIIJJIZ(this);
        this.LL.LJI(abstractC1264080j02);
    }

    @Override // X.AbstractC1903730zdj
    public final void LJII(RecyclerView.ViewHolder viewHolder) {
        PowerCell powerCell;
        if ((viewHolder instanceof PowerCell) && (powerCell = (PowerCell) viewHolder) != null) {
            powerCell.onViewAttachedToWindow();
        }
    }

    @Override // X.AbstractC1903730zdj
    public final void LJIIIIZZ(RecyclerView.ViewHolder viewHolder) {
        PowerCell powerCell;
        if ((viewHolder instanceof PowerCell) && (powerCell = (PowerCell) viewHolder) != null) {
            powerCell.onViewDetachedFromWindow();
        }
    }

    @Override // X.AbstractC1903730zdj
    public final void LJIIIZ(RecyclerView.ViewHolder viewHolder) {
        PowerCell powerCell;
        if ((viewHolder instanceof PowerCell) && (powerCell = (PowerCell) viewHolder) != null) {
            powerCell.unBind();
        }
    }

    @Override // X.InterfaceC1263010iyJ
    public final void LJJLIIIJLJLI(AwS420S0200000_19 awS420S0200000_19) {
        this.LLILLL = awS420S0200000_19;
    }

    @Override // X.InterfaceC1263010iyJ
    public final void LJLJJLL(Class<? extends PowerCell<?>>... clsArr) {
        for (Class<? extends PowerCell<?>> cls : clsArr) {
            Object objLJIL = C13LQ.LJIL(((ParameterizedType) cls.getGenericSuperclass()).getActualTypeArguments());
            if (objLJIL != null && ((LinkedHashMap) this.LLILZLL).get(objLJIL) == null) {
                this.LLILZLL.put((Type) objLJIL, cls);
            }
        }
    }

    @Override // X.InterfaceC1263010iyJ
    public final void LLJJ(String str) {
        this.LLIZLLLIL = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    @Override // X.AbstractC1903730zdj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder LJFF(android.view.ViewGroup r6, X.C13IQ<? extends X.InterfaceC1891350zJl> r7) throws java.lang.IllegalAccessException {
        /*
            r5 = this;
            java.util.Map<java.lang.reflect.Type, java.lang.Class<? extends com.bytedance.ies.powerlist.PowerCell<?>>> r1 = r5.LLILZLL
            java.lang.Class r0 = X.C09R7.LIZ(r7)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r0)
            java.lang.Class r1 = (java.lang.Class) r1
            r0 = 0
            if (r1 != 0) goto L12
            return r0
        L12:
            java.lang.Object r4 = r1.newInstance()
            com.bytedance.ies.powerlist.PowerCell r4 = (com.bytedance.ies.powerlist.PowerCell) r4
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell
            if (r0 == 0) goto L23
            r0 = r4
            com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell r0 = (com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell) r0
            if (r0 == 0) goto L23
            r0.LL = r5
        L23:
            X.0zeG r0 = r5.LL
            androidx.lifecycle.LifecycleOwner r0 = r0.getLifecycleOwner()
            r4.setParent(r0)
            int r3 = r4.getLayoutId()
            if (r3 <= 0) goto L5d
            android.content.Context r2 = r6.getContext()
            X.C20673215v0.LIZ(r3, r2)
            android.app.Activity r0 = X.C1388190mED.LIZ(r2)
            if (r0 == 0) goto L48
            android.view.View r1 = X.C1600630rkr.LIZ(r3, r0)
            X.C20673215v0.LJI(r3, r2)
        L46:
            if (r1 != 0) goto L4c
        L48:
            android.view.View r1 = r4.onCreateItemView(r6)
        L4c:
            X.01GW r0 = r5.LLIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r0 == 0) goto L59
            r0.set(r4, r1)
        L59:
            r4.onItemViewCreated()
            return r4
        L5d:
            android.view.View r1 = r4.onCreateItemView(r6)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1904040zeE.LJFF(android.view.ViewGroup, X.13IQ):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    @Override // X.AbstractC1903730zdj
    public final void LJ(RecyclerView.ViewHolder viewHolder, InterfaceC1891350zJl interfaceC1891350zJl, int i) {
        PowerCell powerCell;
        if ((viewHolder instanceof PowerCell) && (powerCell = (PowerCell) viewHolder) != null) {
            powerCell.onBindItemView(interfaceC1891350zJl);
        }
    }
}
