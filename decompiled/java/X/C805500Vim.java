package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Vim, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.loader.RecentSharedSortManager$storeRecentSend$2", f = "RecentSharedSortManager.kt", l = {}, m = "invokeSuspend")
public final class C805500Vim extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ C805520Vio LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C805500Vim(C869590Y9l c869590Y9l, C805520Vio c805520Vio, InterfaceC1364105Vn<? super C805500Vim> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = c805520Vio;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C805500Vim c805500Vim = new C805500Vim(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c805500Vim.LL = obj;
        return c805500Vim;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strValueOf;
        C1C7U.LIZ("RecentSharedSortManager@1185.storeRecentSend$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        if (this.LLILLJJLI.getConversationType() == AbstractC1711506n3.LIZIZ) {
            strValueOf = this.LLILLJJLI.getConversationId();
        } else {
            strValueOf = String.valueOf(C0YNP.LJII(this.LLILLJJLI.getConversationId()));
        }
        synchronized (obj2) {
            try {
                ArrayList<String> arrayList = C805520Vio.LIZJ;
                if (arrayList.contains(strValueOf)) {
                    arrayList.remove(strValueOf);
                }
                arrayList.add(0, strValueOf);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C0I0B.LJFF.LIZJ();
        InterfaceC805460Vii interfaceC805460ViiLIZ = C797560VQk.LIZIZ(C894660Z7w.LIZ()).LIZ();
        C805520Vio c805520Vio = this.LLILLL;
        C869590Y9l c869590Y9l = this.LLILLJJLI;
        c805520Vio.getClass();
        if (interfaceC805460ViiLIZ.LIZIZ() >= 2000) {
            interfaceC805460ViiLIZ.LIZJ(C805520Vio.LIZ());
        }
        interfaceC805460ViiLIZ.LIZ(c869590Y9l.getCreatedAt(), C805520Vio.LIZ(), strValueOf);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecentSharedSortManager@1185.storeRecentSend$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
