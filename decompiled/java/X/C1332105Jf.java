package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Jf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.celebration.CelebrationFetcher$onFetchSuccess$allSuccess$1", f = "CelebrationFetcher.kt", l = {146}, m = "invokeSuspend")
public final class C1332105Jf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<Pair<String, Boolean>> LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ C1420270n3x LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1332105Jf(List<Pair<String, Boolean>> list, List<String> list2, C1420270n3x c1420270n3x, InterfaceC1364105Vn<? super C1332105Jf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = c1420270n3x;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1332105Jf c1332105Jf = new C1332105Jf(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1332105Jf.LLILLJJLI = obj;
        return c1332105Jf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CelebrationFetcher@b7ac.onFetchSuccess$allSuccess$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<Pair<String, Boolean>> list = this.LLILLL;
            List<String> list2 = this.LLILZ;
            C1420270n3x c1420270n3x = this.LLILZIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (Pair<String, Boolean> pair : list) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1332205Jg(list2, pair.getFirst(), pair.getSecond().booleanValue(), c1420270n3x, null), 3));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CelebrationFetcher@b7ac.onFetchSuccess$allSuccess$1");
                return objLJFF;
            }
        }
        Iterable iterable = (Iterable) obj;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it2 = iterable.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!((Boolean) it2.next()).booleanValue()) {
                    z = false;
                    break;
                }
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("CelebrationFetcher@b7ac.onFetchSuccess$allSuccess$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
