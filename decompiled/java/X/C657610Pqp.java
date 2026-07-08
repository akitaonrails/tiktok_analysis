package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Pqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C657610Pqp implements InterfaceC657870PrF {
    public final Function1<C665230Q7l, Unit> LIZ;

    @Override // X.InterfaceC657870PrF
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LIZ() {
        SearchComponentCenter.LIZ.getClass();
        return C657530Pqh.LIZ().LJII();
    }

    @Override // X.InterfaceC657780Pr6
    public final InterfaceC111300bX getConfig() {
        Function1<C665230Q7l, Unit> function1 = this.LIZ;
        if (function1 == null) {
            return null;
        }
        C665230Q7l c665230Q7l = new C665230Q7l(null);
        function1.invoke(c665230Q7l);
        return c665230Q7l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C657610Pqp(Function1<? super C665230Q7l, Unit> function1) {
        this.LIZ = function1;
    }
}
