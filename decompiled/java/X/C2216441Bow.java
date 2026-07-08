package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS613S0100000_34;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216441Bow {
    public final C2216331Bol LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<C0W11> LIZLLL;
    public final Map<Class<?>, Object> LJ;
    public final Map<Class<?>, C2216431Bov<?>> LJFF = new HashMap();
    public final Map<Class<?>, List<InterfaceC2216421Bou>> LJI = new HashMap();
    public final Map<Class<?>, C19717612Co<?>> LJII = new HashMap();
    public final HashSet<LifecycleOwner> LJIIIIZZ = new HashSet<>();
    public final C2216461Boy LJIIIZ;

    public final void LIZJ() {
        Map<Class<?>, C2216431Bov<?>> map = this.LJFF;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<Class<?>, C2216431Bov<?>> entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue().LIZ));
        }
        List<? extends Pair<? extends Class<?>, ? extends Object>> listLLIIII = C13LP.LLIIII(arrayList);
        Iterator<C0W11> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(this.LIZIZ, this.LIZJ, listLLIIII);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onLifecycleDestroy() {
        HashSet<LifecycleOwner> hashSet = this.LJIIIIZZ;
        if (!(hashSet instanceof Collection) || !hashSet.isEmpty()) {
            Iterator<LifecycleOwner> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                if (it2.next().getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                    return;
                }
            }
        }
        C2216331Bol c2216331Bol = this.LIZ;
        ((HashMap) c2216331Bol.LIZLLL).remove(this.LIZJ);
    }

    public final <A> A LIZ(Class<A> cls) {
        C2216431Bov<A> c2216431BovLIZ;
        C2216461Boy c2216461Boy = this.LJIIIZ;
        synchronized (c2216461Boy) {
            c2216431BovLIZ = c2216461Boy.LIZ.LIZ(cls);
        }
        if (c2216431BovLIZ != null) {
            return c2216431BovLIZ.LIZ;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, androidx.lifecycle.MutableLiveData] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, androidx.lifecycle.MutableLiveData<T>] */
    public final C2216491Bp1 LIZIZ(C1555850qad c1555850qad) {
        C2216431Bov c2216431BovLIZIZ;
        C2216461Boy c2216461Boy = this.LJIIIZ;
        c2216461Boy.getClass();
        synchronized (c2216461Boy) {
            c2216431BovLIZIZ = c2216461Boy.LIZ.LIZIZ(null);
        }
        ?? r0 = c2216431BovLIZIZ.LIZIZ;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = r0;
        for (final C2216581BpA c2216581BpA : C13LP.LLIIII(null)) {
            c259800zU.element = C2216641BpG.LIZ((LiveData) c259800zU.element, new InterfaceC2287108xh() { // from class: X.1Bp2
                @Override // X.InterfaceC2287108xh
                public final Object apply(Object obj) {
                    C2216581BpA c2216581BpA2 = c2216581BpA;
                    if (obj == null) {
                        return null;
                    }
                    return c2216581BpA2.LIZIZ.get(obj);
                }
            });
        }
        C2216391Bor c2216391Bor = InterfaceC2216401Bos.LIZ;
        C5182020e c5182020e = new C5182020e(c259800zU, (C259800zU<JSONObject>) 417);
        AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3(c259800zU, (C259800zU<LiveData<Object>>) 137);
        c2216391Bor.getClass();
        return new C2216491Bp1(c5182020e, awS547S0100000_3);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.1Box] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public C2216441Bow(C2216331Bol c2216331Bol, String str, String str2, Map map, List list, Map map2) {
        this.LIZ = c2216331Bol;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = list;
        this.LJ = map2;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            final C0FQ0 c0fq0 = (C0FQ0) entry.getValue();
            C2216431Bov c2216431Bov = new C2216431Bov(c0fq0);
            final AwS613S0100000_34 awS613S0100000_34 = new AwS613S0100000_34(c2216431Bov, (C2216431Bov<Object>) 132);
            Object obj = new Object(c0fq0, awS613S0100000_34) { // from class: X.12Co
                public final T LIZ;
                public final Function1<T, Unit> LIZIZ;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LIZ = c0fq0;
                    this.LIZIZ = awS613S0100000_34;
                    new ArrayList();
                    new ArrayList();
                    new Object() { // from class: X.12Cn
                        {
                            new LinkedHashMap();
                        }
                    };
                }
            };
            ((HashMap) this.LJFF).put(key, c2216431Bov);
            ((HashMap) this.LJII).put(key, obj);
        }
        LIZJ();
        for (Map.Entry entry2 : ((HashMap) this.LJFF).entrySet()) {
            ((C2216431Bov) entry2.getValue()).LIZIZ.observeForever(new C11HJ(new AwS400S0200000_34(this, (C2216441Bow) entry2, (Map.Entry<? extends Class<?>, ? extends C2216431Bov<?>>) 38)));
        }
        this.LJIIIZ = new C2216461Boy(new InterfaceC2216481Bp0() { // from class: X.1Box
            @Override // X.InterfaceC2216481Bp0
            public final <A> C2216431Bov<A> LIZ(Class<A> cls) {
                return (C2216431Bov) ((HashMap) this.LIZ.LJFF).get(cls);
            }

            @Override // X.InterfaceC2216481Bp0
            public final <A> C2216431Bov<A> LIZIZ(Class<A> cls) {
                C2216431Bov<A> c2216431Bov2 = (C2216431Bov) ((HashMap) this.LIZ.LJFF).get(cls);
                if (c2216431Bov2 == null) {
                    C2216431Bov<A> c2216431Bov3 = new C2216431Bov<>();
                    c2216431Bov3.LIZIZ.observeForever(new C11HJ(new AwS613S0100000_34(this.LIZ, cls, 131)));
                    ((HashMap) this.LIZ.LJFF).put(cls, c2216431Bov3);
                    return c2216431Bov3;
                }
                return c2216431Bov2;
            }
        });
    }
}
