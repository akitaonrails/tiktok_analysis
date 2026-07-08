package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Viq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.loader.RecentSharedSortManager$sortEditShare$1", f = "RecentSharedSortManager.kt", l = {228}, m = "invokeSuspend")
public final class C805540Viq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Set<String> LLILLJJLI;
    public final /* synthetic */ C805520Vio LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C805540Viq(Set<String> set, C805520Vio c805520Vio, InterfaceC1364105Vn<? super C805540Viq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = set;
        this.LLILLL = c805520Vio;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C805540Viq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecentSharedSortManager@1185.sortEditShare$1");
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
            C1382070m4L c1382070m4L = new C1382060m4K().LIZ;
            this.LL = 1;
            obj = c1382070m4L.LIZLLL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RecentSharedSortManager@1185.sortEditShare$1");
                return objLJFF;
            }
        }
        Set<String> set = this.LLILLJJLI;
        C805520Vio c805520Vio = this.LLILLL;
        for (IMContact iMContact : (Iterable) obj) {
            c805520Vio.getClass();
            set.add(C805520Vio.LIZIZ(iMContact));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecentSharedSortManager@1185.sortEditShare$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
