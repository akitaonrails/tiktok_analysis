package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Poa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656220Poa implements InterfaceC657870PrF {
    public final Function1<C656240Poc, Unit> LIZ;
    public final C656240Poc LIZIZ;

    @Override // X.InterfaceC657870PrF
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LIZ() {
        SearchComponentCenter.LIZ.getClass();
        return C657530Pqh.LIZ().LJIJJ();
    }

    @Override // X.InterfaceC657780Pr6
    public final InterfaceC111300bX getConfig() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C656220Poa(Function1<? super C656240Poc, Unit> function1) {
        this.LIZ = function1;
        C656240Poc c656240Poc = new C656240Poc(null);
        function1.invoke(c656240Poc);
        this.LIZIZ = c656240Poc;
    }
}
