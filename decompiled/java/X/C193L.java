package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.h0;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.component.option.manager.n;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS276S0300000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS464S0200000_29;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.193L, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C193L extends AbstractC2255721DQs<C193M> implements C193M, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final int LLJJI;
    public final C1DRG LL;
    public final C193T LLILLJJLI;
    public final C193M LLILLL = this;
    public final String LLILZ = "PublishOptionsManagerComponent";
    public int LLILZIL = 100000;
    public final Map<C193Q, C193R> LLILZLL = new LinkedHashMap();
    public final Map<AbstractC1738640vLS, AnonymousClass1931<AbstractC1738640vLS, Object, Object>> LLIZ = new LinkedHashMap();
    public final Map<AbstractC1738640vLS, C10J0> LLIZLLLIL = new LinkedHashMap();
    public final Map<String, InterfaceC214777193n> LLJ = new LinkedHashMap();
    public final Map<InterfaceC214777193n, List<C193Z>> LLJI = new LinkedHashMap();
    public final Map<InterfaceC214777193n, h0<List<C193Z>>> LLJIJIL = new LinkedHashMap();
    public final Map<InterfaceC214777193n, List<Function1<Pair<Integer, C193Z>, Unit>>> LLJILJIL = new LinkedHashMap();
    public final Map<InterfaceC214777193n, Set<String>> LLJILJILJ = new LinkedHashMap();
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C193L.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJI = 8;
    }

    private final void G2() {
        AnonymousClass1931<C192V, C190Z, C19224710Iz> anonymousClass1931 = new AnonymousClass1931<C192V, C190Z, C19224710Iz>() { // from class: X.192e
            public static final /* synthetic */ int LIZJ = 0;

            @Override // X.AnonymousClass1931
            public final void LJI(AbstractC1738640vLS abstractC1738640vLS) {
                Unit unit;
                View view = ((C11GO) ((AbstractC214739192b) abstractC1738640vLS).L5()).LIZIZ.LIZIZ;
                if (!view.isLaidOut()) {
                    try {
                        C21411818qq c21411818qqLIZ = C0TLB.LIZ(view);
                        if (c21411818qqLIZ != null) {
                            Field declaredField = View.class.getDeclaredField("mPrivateFlags3");
                            declaredField.setAccessible(true);
                            declaredField.set(c21411818qqLIZ, Integer.valueOf(((Integer) declaredField.get(c21411818qqLIZ)).intValue() | 4));
                            unit = Unit.LIZ;
                        } else {
                            unit = null;
                        }
                        C189200o6.m2constructorimpl(unit);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }

            @Override // X.AnonymousClass1931
            public final AbstractC1738640vLS LJ(Context context, ViewGroup viewGroup) {
                return new C192V(C344790DfR.LIZ(context));
            }

            @Override // X.AnonymousClass1931
            public final void LIZLLL(AbstractC1738640vLS abstractC1738640vLS, C193X c193x, C1664690tQB c1664690tQB, Object obj) {
                AwS276S0300000_32 awS276S0300000_32;
                AwS433S0200000_32 awS433S0200000_32;
                C192V c192v = (C192V) abstractC1738640vLS;
                C19224710Iz c19224710Iz = (C19224710Iz) obj;
                new Object() { // from class: X.11GP
                }.getClass();
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192i
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Integer.valueOf(((InterfaceC214749192l) obj2).getVisibility());
                    }
                }), c192v, Lifecycle.State.STARTED, new AwS611S0100000_32(c192v, 271));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192k
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((InterfaceC214749192l) obj2).isEnabled());
                    }
                }), c192v, Lifecycle.State.STARTED, new AwS611S0100000_32(c192v, 273));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192m
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((InterfaceC214749192l) obj2).LJ());
                    }
                }), c192v, Lifecycle.State.STARTED, new AwS611S0100000_32(c192v, 275));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192o
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Integer.valueOf(((InterfaceC214749192l) obj2).LIZIZ());
                    }
                }), c192v, Lifecycle.State.STARTED, new AwS611S0100000_32(c192v, 277));
                AnonymousClass1931.LIZJ(this, c1664690tQB.LIZ(new C2217381BqS() { // from class: X.1930
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((InterfaceC214749192l) obj2).LIZ();
                    }
                }), c192v, new AwS611S0100000_32(c192v, 261));
                AnonymousClass1931.LIZJ(this, c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192u
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((InterfaceC214749192l) obj2).LIZLLL();
                    }
                }), c192v, new AwS611S0100000_32(c192v, 263));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192w
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((InterfaceC214749192l) obj2).LIZJ();
                    }
                }), c192v, Lifecycle.State.STARTED, new AwS611S0100000_32(c192v, 265));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.191n
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((InterfaceC214749192l) obj2).isChecked());
                    }
                }), c192v, Lifecycle.State.STARTED, new AwS611S0100000_32(c192v, 267));
                AnonymousClass1931.LIZJ(this, c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192y
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((InterfaceC214749192l) obj2).LJI();
                    }
                }), c192v, new AwS611S0100000_32(c192v, 268));
                AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(c193x, 500);
                C127A c127aL5 = c192v.L5();
                Function0<Boolean> function0 = c19224710Iz.LIZIZ;
                C12YG c12yg = null;
                if (function0 != null) {
                    awS276S0300000_32 = new AwS276S0300000_32(c192v, awS576S0100000_32, function0, 13);
                } else {
                    awS276S0300000_32 = null;
                }
                c127aL5.LJIILL(awS276S0300000_32);
                C127A c127aL52 = c192v.L5();
                Function0<Unit> function02 = c19224710Iz.LIZ;
                if (function02 != null) {
                    awS433S0200000_32 = new AwS433S0200000_32(awS576S0100000_32, function02, 45);
                } else {
                    awS433S0200000_32 = null;
                }
                c127aL52.LJI(awS433S0200000_32);
                C127A c127aL53 = c192v.L5();
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = c19224710Iz.LIZJ;
                if (onCheckedChangeListener != null) {
                    c12yg = new C12YG(new AwS464S0200000_29(awS576S0100000_32, onCheckedChangeListener, 9), 4);
                }
                c127aL53.LJIILLIIL(c12yg);
            }
        };
        C19223210Ik c19223210Ik = C19223210Ik.LIZ;
        LW(C190Z.class, C19224710Iz.class, anonymousClass1931, c19223210Ik);
        LW(C190T.class, C10J1.class, new AnonymousClass1931<C192U, C190T, C10J1>() { // from class: X.190K
            public static final /* synthetic */ int LIZJ = 0;

            @Override // X.AnonymousClass1931
            public final AbstractC1738640vLS LJ(Context context, ViewGroup viewGroup) {
                return new C192U(C10FP.LIZ(context, viewGroup));
            }

            @Override // X.AnonymousClass1931
            public final void LIZLLL(AbstractC1738640vLS abstractC1738640vLS, C193X c193x, C1664690tQB c1664690tQB, Object obj) {
                C214743192f.LIZ.getClass();
                C214743192f.LIZ(this, (C192U) abstractC1738640vLS, c193x, c1664690tQB, (C10J1) obj);
            }
        }, c19223210Ik);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJILLL.getValue(this, LLJJ[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        G2();
    }

    public C193M Z1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public String getComponentName() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    private final h0<List<C193Z>> o2(InterfaceC214777193n interfaceC214777193n) {
        Map<InterfaceC214777193n, h0<List<C193Z>>> map = this.LLJIJIL;
        h0<List<C193Z>> h0Var = map.get(interfaceC214777193n);
        if (h0Var == null) {
            h0Var = new h0<>(C13BV.INSTANCE);
            map.put(interfaceC214777193n, h0Var);
        }
        return h0Var;
    }

    @Override // X.C193M
    public void JF1(AbstractC1738640vLS abstractC1738640vLS) {
        Function1<View, Unit> function1LIZ;
        C10J0 c10j0 = this.LLIZLLLIL.get(abstractC1738640vLS);
        if (c10j0 != null && (function1LIZ = c10j0.LIZ()) != null) {
            function1LIZ.invoke(abstractC1738640vLS.itemView);
        }
        AnonymousClass1931<AbstractC1738640vLS, Object, Object> anonymousClass1931 = this.LLIZ.get(abstractC1738640vLS);
        if (anonymousClass1931 != null) {
            anonymousClass1931.LJI(abstractC1738640vLS);
        }
    }

    @Override // X.C193M
    public void M42(AbstractC1738640vLS abstractC1738640vLS) {
        this.LLIZLLLIL.remove(abstractC1738640vLS);
        AnonymousClass1931<AbstractC1738640vLS, Object, Object> anonymousClass1931 = this.LLIZ.get(abstractC1738640vLS);
        if (anonymousClass1931 != null) {
            anonymousClass1931.LIZ = null;
            List<Function0<Unit>> listRemove = anonymousClass1931.LIZIZ.remove(abstractC1738640vLS);
            if (listRemove != null) {
                Iterator<Function0<Unit>> it2 = listRemove.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke();
                }
            }
            anonymousClass1931.LJFF(abstractC1738640vLS);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recycleViewHolder viewFactory is null, viewHolder=");
        sbLIZ.append(abstractC1738640vLS);
        C193S.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C193M
    public C385670FAf<List<C193Z>> yg2(InterfaceC214777193n interfaceC214777193n) {
        return o2(interfaceC214777193n);
    }

    public C193L(C1DRG c1drg, C193T c193t) {
        this.LL = c1drg;
        this.LLILLJJLI = c193t;
    }

    private final AbstractC1738640vLS X1(AnonymousClass1931<AbstractC1738640vLS, Object, Object> anonymousClass1931, ViewGroup viewGroup) {
        AbstractC1738640vLS abstractC1738640vLSLJ = anonymousClass1931.LJ(viewGroup.getContext(), viewGroup);
        this.LLIZ.put(abstractC1738640vLSLJ, anonymousClass1931);
        return abstractC1738640vLSLJ;
    }

    @Override // X.C193M
    public void F02(InterfaceC214777193n interfaceC214777193n, Function1<? super Pair<Integer, C193Z>, Unit> function1) {
        Map<InterfaceC214777193n, List<Function1<Pair<Integer, C193Z>, Unit>>> map = this.LLJILJIL;
        List<Function1<Pair<Integer, C193Z>, Unit>> arrayList = map.get(interfaceC214777193n);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(interfaceC214777193n, arrayList);
        }
        arrayList.add(function1);
    }

    @Override // X.C193M
    public AbstractC1738640vLS ke1(int i, ViewGroup viewGroup) {
        Object next;
        AnonymousClass1931<AbstractC1738640vLS, Object, Object> anonymousClass1931;
        Iterator<T> it2 = this.LLILZLL.values().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C193R) next).LIZ == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C193R c193r = (C193R) next;
        if (c193r == null || (anonymousClass1931 = c193r.LIZIZ) == null) {
            return null;
        }
        return X1(anonymousClass1931, viewGroup);
    }

    private final List<C193Z> W1(List<C193Z> list, C193Z c193z, final InterfaceC214777193n interfaceC214777193n) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(c193z);
        return C13LP.LJLLLL(new Comparator() { // from class: X.193P
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return this.LL.LLILLJJLI.LIZ(((C193Z) obj).LIZ, ((C193Z) obj2).LIZ, interfaceC214777193n);
            }
        }, arrayList);
    }

    private final C193R w2(Class<Object> cls, Class<Object> cls2, InterfaceC19223310Il interfaceC19223310Il) {
        C193R c193r = this.LLILZLL.get(new C193Q(cls, cls2, interfaceC19223310Il));
        if (c193r != null) {
            return c193r;
        }
        C19223210Ik c19223210Ik = C19223210Ik.LIZ;
        if (!Intrinsics.LJFF(interfaceC19223310Il, c19223210Ik)) {
            return w2(cls, cls2, c19223210Ik);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Not register PublishOptionViewFactory for <");
        sbLIZ.append(cls);
        sbLIZ.append(", ");
        sbLIZ.append(cls2);
        sbLIZ.append('>');
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C193M
    public int IN(Class<Object> cls, Class<Object> cls2, InterfaceC19223310Il interfaceC19223310Il) {
        return w2(cls, cls2, interfaceC19223310Il).LIZ;
    }

    @Override // X.C193M
    public <VIEW_HOLDER extends n, STATE, ACTION> void LW(Class<STATE> cls, Class<ACTION> cls2, AnonymousClass1931<VIEW_HOLDER, STATE, ACTION> anonymousClass1931, InterfaceC19223310Il interfaceC19223310Il) {
        C19223210Ik c19223210Ik = C19223210Ik.LIZ;
        if (!Intrinsics.LJFF(interfaceC19223310Il, c19223210Ik) && !this.LLILZLL.containsKey(new C193Q(cls, cls2, c19223210Ik))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Must register Default scenario PublishOptionViewFactory for <");
            sbLIZ.append(cls);
            sbLIZ.append(", ");
            sbLIZ.append(cls2);
            sbLIZ.append("> first!");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        C193Q c193q = new C193Q(cls, cls2, interfaceC19223310Il);
        if (this.LLILZLL.containsKey(c193q)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("register PublishOptionViewFactory duplicate for <");
            sbLIZ2.append(cls);
            sbLIZ2.append(", ");
            sbLIZ2.append(cls2);
            sbLIZ2.append('>');
            C201955140j.LJIJI(C193V.LIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        Map<C193Q, C193R> map = this.LLILZLL;
        int i = this.LLILZIL;
        this.LLILZIL = i + 1;
        map.put(c193q, new C193R(i, anonymousClass1931));
    }

    @Override // X.C193M
    public AbstractC1738640vLS TJ2(Class<Object> cls, Class<Object> cls2, InterfaceC19223310Il interfaceC19223310Il, ViewGroup viewGroup) {
        return X1(w2(cls, cls2, interfaceC19223310Il).LIZIZ, viewGroup);
    }

    @Override // X.C193M
    public void q61(LifecycleOwner lifecycleOwner, InterfaceC1738600vLO interfaceC1738600vLO, AbstractC1738640vLS abstractC1738640vLS, C1664690tQB<Object> c1664690tQB, Object obj) {
        if ((obj instanceof C10J0) && obj != null) {
            this.LLIZLLLIL.put(abstractC1738640vLS, obj);
        } else {
            this.LLIZLLLIL.remove(abstractC1738640vLS);
        }
        C193X c193x = new C193X(interfaceC1738600vLO, getEditModel(), this.LLJ.get(interfaceC1738600vLO.getKey()));
        AnonymousClass1931<AbstractC1738640vLS, Object, Object> anonymousClass1931 = this.LLIZ.get(abstractC1738640vLS);
        if (anonymousClass1931 != null) {
            anonymousClass1931.LIZ = lifecycleOwner;
            anonymousClass1931.LIZLLL(abstractC1738640vLS, c193x, c1664690tQB, obj);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bindViewHolder viewFactory is null, viewHolder=");
            sbLIZ.append(abstractC1738640vLS);
            C193S.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.C193M
    public <STATE, ACTION> void KL1(InterfaceC1738600vLO interfaceC1738600vLO, Class<STATE> cls, Class<ACTION> cls2, C1664690tQB<STATE> c1664690tQB, ACTION action, C10J3 c10j3) {
        c10j3.LIZJ();
        C193Z c193z = new C193Z(interfaceC1738600vLO, 0, cls, cls2, c10j3.LIZIZ(), c1664690tQB, action);
        InterfaceC214777193n interfaceC214777193nLIZ = c10j3.LIZ();
        Map<InterfaceC214777193n, Set<String>> map = this.LLJILJILJ;
        Set<String> linkedHashSet = map.get(interfaceC214777193nLIZ);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            map.put(interfaceC214777193nLIZ, linkedHashSet);
        }
        if (linkedHashSet.add(interfaceC1738600vLO.getKey())) {
            this.LLJ.put(interfaceC1738600vLO.getKey(), interfaceC214777193nLIZ);
            List<C193Z> list = this.LLJI.get(interfaceC214777193nLIZ);
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            List<C193Z> listW1 = W1(list, c193z, interfaceC214777193nLIZ);
            this.LLJI.put(interfaceC214777193nLIZ, listW1);
            o2(interfaceC214777193nLIZ).LJII(listW1);
            List<Function1<Pair<Integer, C193Z>, Unit>> list2 = this.LLJILJIL.get(interfaceC214777193nLIZ);
            if (list2 != null) {
                Iterator<Function1<Pair<Integer, C193Z>, Unit>> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke(new Pair<>(Integer.valueOf(listW1.indexOf(c193z)), c193z));
                }
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Already register option type key ");
        sbLIZ.append(interfaceC1738600vLO.getKey());
        sbLIZ.append(" in ");
        sbLIZ.append(interfaceC214777193nLIZ);
        sbLIZ.append('!');
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
