package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vhj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.utils.ImpressionUtil$push$1", f = "ImpressionUtil.kt", l = {35}, m = "invokeSuspend")
public final class C1752450vhj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1752460vhk LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1752450vhj(C1752460vhk c1752460vhk, InterfaceC1364105Vn<? super C1752450vhj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1752460vhk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1752450vhj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImpressionUtil@30d0.push$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("ImpressionUtil@30d0.push$1");
                return objLJFF;
            }
        }
        C1752460vhk c1752460vhk = this.LLILLJJLI;
        c1752460vhk.LIZIZ.addAll(c1752460vhk.LIZJ);
        if (c1752460vhk.LIZJ.size() > 0) {
            CopyOnWriteArrayList<String> copyOnWriteArrayList = c1752460vhk.LIZJ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
            Iterator<String> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                arrayList.add(new Feed(it2.next(), 1, null, null, null, null, null, null));
            }
            C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1752470vhl(c1752460vhk, arrayList, null), 3);
        }
        c1752460vhk.LIZJ.clear();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImpressionUtil@30d0.push$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
