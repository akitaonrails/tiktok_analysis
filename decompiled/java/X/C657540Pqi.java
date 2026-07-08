package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Pqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C657540Pqi implements InterfaceC657860PrE {
    public final Function1<C657880PrG, Unit> LIZ;

    @Override // X.InterfaceC657860PrE
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LIZLLL() {
        SearchComponentCenter.LIZ.getClass();
        return C657530Pqh.LIZ().LIZIZ();
    }

    @Override // X.InterfaceC657780Pr6
    public final InterfaceC111300bX getConfig() {
        C657880PrG c657880PrG = new C657880PrG(null);
        this.LIZ.invoke(c657880PrG);
        return c657880PrG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C657540Pqi(Function1<? super C657880PrG, Unit> function1) {
        this.LIZ = function1;
    }
}
