package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C657290PqJ implements InterfaceC657870PrF {
    public final Function1<C657280PqI, Unit> LIZ;

    @Override // X.InterfaceC657870PrF
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LIZ() {
        SearchComponentCenter.LIZ.getClass();
        return C657530Pqh.LIZ().LJIJI();
    }

    @Override // X.InterfaceC657780Pr6
    public final InterfaceC111300bX getConfig() {
        C657280PqI c657280PqI = new C657280PqI(null);
        this.LIZ.invoke(c657280PqI);
        return c657280PqI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C657290PqJ(Function1<? super C657280PqI, Unit> function1) {
        this.LIZ = function1;
    }
}
