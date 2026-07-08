package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.FeatureExtraction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08tg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutHelperKt$getFeaturesExtraction$3$1", f = "AutoCutHelper.kt", l = {2441}, m = "invokeSuspend")
public final class C2262208tg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends FeatureExtraction>>, Object> {
    public long LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C259800zU<List<Pair<FeatureExtraction, Integer>>> LLILZ;
    public final /* synthetic */ C118300cf LLILZIL;
    public final /* synthetic */ List<C2262608tk> LLILZLL;
    public final /* synthetic */ Set<String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2262208tg(C259800zU<List<Pair<FeatureExtraction, Integer>>> c259800zU, C118300cf c118300cf, List<C2262608tk> list, Set<String> set, InterfaceC1364105Vn<? super C2262208tg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c259800zU;
        this.LLILZIL = c118300cf;
        this.LLILZLL = list;
        this.LLIZ = set;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2262208tg(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3;
        long jCurrentTimeMillis;
        C259800zU<List<Pair<FeatureExtraction, Integer>>> c259800zU;
        T t;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj2 = obj;
        C1C7U.LIZ("AutoCutHelperKt@3851.getFeaturesExtraction$3$1");
        Object objLJFF = C099R.LJFF();
        int i7 = this.LLILLL;
        ArrayList arrayList3 = null;
        boolean z5 = true;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    jCurrentTimeMillis = this.LL;
                    c259800zU = this.LLILLJJLI;
                    try {
                        C155000ia.LIZIZ(obj2);
                        t = obj2;
                    } catch (CancellationException e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LLILZIL.element = 1;
                        throw e;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj2);
                jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    c259800zU = this.LLILZ;
                    C2262308th c2262308th = new C2262308th(this.LLILZLL, this.LLIZ, null);
                    this.LLILLJJLI = c259800zU;
                    this.LL = jCurrentTimeMillis;
                    this.LLILLL = 1;
                    Object objLIZIZ = C099A.LIZIZ(10000L, c2262308th, this);
                    t = objLIZIZ;
                    if (objLIZIZ == objLJFF) {
                        C1C7U.LIZIZ("AutoCutHelperKt@3851.getFeaturesExtraction$3$1");
                        return objLJFF;
                    }
                } catch (CancellationException e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    this.LLILZIL.element = 1;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (this.LLILZ.element != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    List<C2262608tk> list = this.LLILZLL;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator<C2262608tk> it2 = list.iterator();
                        i = 0;
                        while (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next().LIZJ, false) && (i = i + 1) < 0) {
                                C1697810uHb.LJIJ();
                                throw null;
                            }
                        }
                    }
                    List<C2262608tk> list2 = this.LLILZLL;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        i2 = 0;
                    } else {
                        Iterator<C2262608tk> it3 = list2.iterator();
                        i2 = 0;
                        while (it3.hasNext()) {
                            if (Intrinsics.LJFF(it3.next().LIZJ, true) && (i2 = i2 + 1) < 0) {
                                C1697810uHb.LJIJ();
                                throw null;
                            }
                        }
                    }
                    if (this.LLILZ.element != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i3 = 0;
                    } else {
                        i3 = this.LLILZIL.element;
                    }
                    C1417710mzp.LJIIL(i, i2, i3, jCurrentTimeMillis2, z);
                    StringBuilder sb = new StringBuilder("success: ");
                    if (this.LLILZ.element == null) {
                        z5 = false;
                    }
                    sb.append(z5);
                    sb.append(", mobAutoCutFetchFeature duration:");
                    sb.append(jCurrentTimeMillis2);
                    C201955140j.LJFF("wangp", sb.toString());
                    throw th;
                }
            }
            c259800zU.element = t;
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (this.LLILZ.element != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            List<C2262608tk> list3 = this.LLILZLL;
            if ((list3 instanceof Collection) && list3.isEmpty()) {
                i4 = 0;
            } else {
                Iterator<C2262608tk> it4 = list3.iterator();
                i4 = 0;
                while (it4.hasNext()) {
                    if (Intrinsics.LJFF(it4.next().LIZJ, false) && (i4 = i4 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            List<C2262608tk> list4 = this.LLILZLL;
            if ((list4 instanceof Collection) && list4.isEmpty()) {
                i5 = 0;
            } else {
                Iterator<C2262608tk> it5 = list4.iterator();
                i5 = 0;
                while (it5.hasNext()) {
                    if (Intrinsics.LJFF(it5.next().LIZJ, true) && (i5 = i5 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            if (this.LLILZ.element != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                i6 = 0;
            } else {
                i6 = this.LLILZIL.element;
            }
            C1417710mzp.LJIIL(i4, i5, i6, jCurrentTimeMillis3, z3);
            StringBuilder sb2 = new StringBuilder("success: ");
            if (this.LLILZ.element == null) {
                z5 = false;
            }
            sb2.append(z5);
            sb2.append(", mobAutoCutFetchFeature duration:");
            sb2.append(jCurrentTimeMillis3);
            C201955140j.LJFF("wangp", sb2.toString());
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sb3 = new StringBuilder("getFeaturesExtraction, result: ");
            List<Pair<FeatureExtraction, Integer>> list5 = this.LLILZ.element;
            if (list5 != null) {
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list5, 10));
                Iterator<Pair<FeatureExtraction, Integer>> it6 = list5.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(it6.next().getFirst());
                }
                arrayList = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                Iterator it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    arrayList.add(((FeatureExtraction) it7.next()).path);
                }
            } else {
                arrayList = null;
            }
            sb3.append(arrayList);
            sb3.append(',');
            List<Pair<FeatureExtraction, Integer>> list6 = this.LLILZ.element;
            if (list6 != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(list6, 10));
                Iterator<Pair<FeatureExtraction, Integer>> it8 = list6.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(C2286608xc.LJ(it8.next().getSecond().intValue()));
                }
            } else {
                arrayList2 = null;
            }
            sb3.append(arrayList2);
            C201955140j.LIZLLL(c1398350mUb, "msg-log", sb3.toString());
            List<Pair<FeatureExtraction, Integer>> list7 = this.LLILZ.element;
            if (list7 != null) {
                arrayList3 = new ArrayList(C15438062q.LJIJJ(list7, 10));
                Iterator<Pair<FeatureExtraction, Integer>> it9 = list7.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(it9.next().getFirst());
                }
            }
            C1C7U.LIZIZ("AutoCutHelperKt@3851.getFeaturesExtraction$3$1");
            return arrayList3;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends FeatureExtraction>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
