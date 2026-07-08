package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05Pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.features.UnconsumedVideoRecorderV2$handleUpdate$1", f = "UnconsumedVideoRecorderV2.kt", l = {}, m = "invokeSuspend")
public final class C1347405Pc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<Aweme> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1347405Pc(List<? extends Aweme> list, InterfaceC1364105Vn<? super C1347405Pc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1347405Pc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        C1C7U.LIZ("UnconsumedVideoRecorderV2@bd31.handleUpdate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1347505Pd c1347505Pd = C1347505Pd.LIZ;
        C1347505Pd.LJFF = true;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        ((ArrayList) C1347505Pd.LJ).clear();
        if (C1347505Pd.LJIIJJI != null) {
            List<Aweme> list = this.LL;
            ListIterator<Aweme> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                String aid2 = listIterator.previous().getAid();
                Aweme aweme = C1347505Pd.LJIIJJI;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid2, aid)) {
                    int iNextIndex = listIterator.nextIndex();
                    if (iNextIndex >= 0 && iNextIndex <= this.LL.size() - 1) {
                        List<Aweme> list2 = this.LL;
                        List<Aweme> listSubList = list2.subList(iNextIndex, list2.size());
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
                        Iterator<Aweme> it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(C710650RuB.LIZ(it2.next(), jCurrentTimeMillis));
                        }
                        ((ArrayList) C1347505Pd.LJ).addAll(arrayList);
                    }
                }
            }
        }
        C1347505Pd c1347505Pd2 = C1347505Pd.LIZ;
        List<Aweme> list3 = this.LL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        Iterator<Aweme> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().getAid());
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList2);
        c1347505Pd2.getClass();
        C19719612Di.LJJIIJ(C1347505Pd.LIZJ, new C1347305Pb(setLLIIJI), true);
        C1347505Pd.LIZ.getClass();
        C1347505Pd.LJ();
        C1347505Pd.LIZLLL(C1347505Pd.LJ);
        C1347505Pd.LJFF = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnconsumedVideoRecorderV2@bd31.handleUpdate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
