package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C657420PqW implements InterfaceC657870PrF {
    public final Function1<C657430PqX, Unit> LIZ;

    @Override // X.InterfaceC657870PrF
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LIZ() {
        SearchComponentCenter.LIZ.getClass();
        return C657530Pqh.LIZ().LJIIJJI();
    }

    @Override // X.InterfaceC657780Pr6
    public final InterfaceC111300bX getConfig() {
        Function1<C657430PqX, Unit> function1 = this.LIZ;
        if (function1 == null) {
            return null;
        }
        C657430PqX c657430PqX = new C657430PqX(null);
        function1.invoke(c657430PqX);
        return c657430PqX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C657420PqW(Function1<? super C657430PqX, Unit> function1) {
        this.LIZ = function1;
    }
}
