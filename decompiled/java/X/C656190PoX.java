package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PoX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656190PoX implements InterfaceC657870PrF {
    public final Function1<C656210PoZ, Unit> LIZ;

    @Override // X.InterfaceC657870PrF
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LIZ() {
        SearchComponentCenter.LIZ.getClass();
        return C657530Pqh.LIZ().LJIILL();
    }

    @Override // X.InterfaceC657780Pr6
    public final InterfaceC111300bX getConfig() {
        Function1<C656210PoZ, Unit> function1 = this.LIZ;
        if (function1 == null) {
            return null;
        }
        C656210PoZ c656210PoZ = new C656210PoZ(0);
        function1.invoke(c656210PoZ);
        return c656210PoZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C656190PoX(Function1<? super C656210PoZ, Unit> function1) {
        this.LIZ = function1;
    }
}
