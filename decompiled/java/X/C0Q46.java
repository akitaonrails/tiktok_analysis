package X;

import X.InterfaceC663970Q2p;
import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q46, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0Q46<T extends InterfaceC663970Q2p> {
    public static final C650990Pg9 LJ = new C650990Pg9();
    public static final ArrayList<C0Q46<?>> LJFF = new ArrayList<>();
    public static volatile boolean LJI;
    public final HashMap<C0Q4F, C0Q4A<T>> LIZ;
    public final ArrayList<C0Q4F> LIZIZ;
    public final Map<String, T> LIZJ;
    public final C0Q48<T> LIZLLL;

    public abstract T LIZ();

    public C0Q46() {
        LJFF.add(this);
        this.LIZ = new HashMap<>();
        this.LIZIZ = new ArrayList<>();
        this.LIZJ = Collections.synchronizedMap(new C2093108Hx(100));
        this.LIZLLL = new C0Q48<>();
    }

    private final void LIZJ$redex$base(InterfaceC663910Q2j interfaceC663910Q2j, C650960Pg6 c650960Pg6) {
        Object objInvoke;
        Function1<C650960Pg6, Object> signalBinder;
        ArrayList<C0Q4F> arrayList = this.LIZIZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator<C0Q4F> it2 = arrayList.iterator();
        while (true) {
            Object objInvoke2 = null;
            if (!it2.hasNext()) {
                break;
            }
            C0Q4F next = it2.next();
            if (next != null && (signalBinder = next.getSignalBinder()) != null) {
                objInvoke2 = signalBinder.invoke(c650960Pg6);
            }
            arrayList2.add(String.valueOf(objInvoke2));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!Intrinsics.LJFF(obj, "")) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!Intrinsics.LJFF(obj2, CardStruct.IStatusCode.DEFAULT)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
        for (Object obj3 : arrayList4) {
            if (!this.LIZJ.containsKey(obj3)) {
                this.LIZJ.put((String) obj3, (T) LIZ());
            }
            C0Q48<T> c0q48 = this.LIZLLL;
            Object objLIZ = this.LIZJ.get(obj3);
            if (objLIZ == null) {
                objLIZ = LIZ();
            }
            Function2 function2 = c0q48.LIZ.get(C13LE.LIZ(interfaceC663910Q2j.getClass()).LIZLLL());
            if (function2 != null && (objInvoke = function2.invoke(objLIZ, interfaceC663910Q2j)) != null) {
                objLIZ = objInvoke;
            }
            arrayList5.add(new Pair(obj3, objLIZ));
        }
        C2097608Jq.LJIILJJIL(arrayList5, this.LIZJ);
    }

    private final void LIZJ$redex$opt(InterfaceC663910Q2j interfaceC663910Q2j, C650960Pg6 c650960Pg6) {
        Object objInvoke;
        Function1<C650960Pg6, Object> signalBinder;
        ArrayList<C0Q4F> arrayList = this.LIZIZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        int i = 0;
        int size = arrayList.size();
        while (true) {
            Object objInvoke2 = null;
            if (i >= size) {
                break;
            }
            C0Q4F c0q4f = arrayList.get(i);
            i++;
            C0Q4F c0q4f2 = c0q4f;
            if (c0q4f2 != null && (signalBinder = c0q4f2.getSignalBinder()) != null) {
                objInvoke2 = signalBinder.invoke(c650960Pg6);
            }
            arrayList2.add(String.valueOf(objInvoke2));
        }
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj = arrayList2.get(i2);
            i2++;
            if (!Intrinsics.LJFF(obj, "")) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int i3 = 0;
        int size3 = arrayList3.size();
        while (i3 < size3) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            if (!Intrinsics.LJFF(obj2, CardStruct.IStatusCode.DEFAULT)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
        int i4 = 0;
        int size4 = arrayList4.size();
        while (i4 < size4) {
            Object obj3 = arrayList4.get(i4);
            i4++;
            if (!this.LIZJ.containsKey(obj3)) {
                this.LIZJ.put((String) obj3, (T) LIZ());
            }
            C0Q48<T> c0q48 = this.LIZLLL;
            Object objLIZ = this.LIZJ.get(obj3);
            if (objLIZ == null) {
                objLIZ = LIZ();
            }
            Function2 function2 = c0q48.LIZ.get(C13LE.LIZ(interfaceC663910Q2j.getClass()).LIZLLL());
            if (function2 != null && (objInvoke = function2.invoke(objLIZ, interfaceC663910Q2j)) != null) {
                objLIZ = objInvoke;
            }
            arrayList5.add(new Pair(obj3, objLIZ));
        }
        C2097608Jq.LJIILJJIL(arrayList5, this.LIZJ);
    }

    public final C0Q47<T> LIZIZ(C0Q4F c0q4f, C650960Pg6 c650960Pg6) {
        C650960Pg6 c650960Pg62 = c650960Pg6;
        C0Q4A<T> c0q4a = this.LIZ.get(c0q4f);
        if (c0q4a == null) {
            synchronized (this) {
                if (!this.LIZIZ.contains(c0q4f)) {
                    this.LIZIZ.add(c0q4f);
                }
                c0q4a = new C0Q4A<>(c0q4f, this);
            }
            this.LIZ.put(c0q4f, c0q4a);
        }
        if (c650960Pg62 == null) {
            c650960Pg62 = new C650960Pg6(new C664000Q2s("discovery", null, true, true, "", "", 0, 0, false, "", "", ""), new C0Q8L(null, null, null), new C664030Q2v(null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE), new C650940Pg4(null, "", Boolean.FALSE, ""), new C0PYE(0L), new C669560QOc(new C672110QXx(null, null, null, null, null), false, "", false, false, "", "", "", "", "", "", "", null, "", null, "", null, null, false, null, null, false, null, "", null), new C0QJN("", null, null, null, null, null));
        }
        return new C0Q47<>(c650960Pg62, c0q4a.LIZ, c0q4a.LIZIZ);
    }

    public final void LIZJ(InterfaceC663910Q2j interfaceC663910Q2j, C650960Pg6 c650960Pg6) {
        if (!ReDexExperimentOpt.getAbTest()) {
            LIZJ$redex$base(interfaceC663910Q2j, c650960Pg6);
        } else {
            LIZJ$redex$opt(interfaceC663910Q2j, c650960Pg6);
        }
    }
}
