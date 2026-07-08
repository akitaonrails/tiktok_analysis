package X;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.099r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23265099r {
    public static C19482711Kf LIZ(final Function2 function2) {
        final C23271099x c23271099x = C23271099x.INSTANCE;
        if (c23271099x.get(C09AE.LJJLJ) == null) {
            return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.099q
                public final /* synthetic */ InterfaceC497601wk LIZ = C817503Hh.LL;

                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ c09aj) {
                    InterfaceC497601wk interfaceC497601wk = this.LIZ;
                    CoroutineContext coroutineContext = c23271099x;
                    Function2 function22 = function2;
                    C23257099j c23257099j = new C23257099j(C23252099e.LIZIZ(interfaceC497601wk, coroutineContext), (C19482611Ke) c09aj);
                    c09aj.setCancellable(new C23266099s(c23257099j));
                    C099V.DEFAULT.invoke(function22, c23257099j, c23257099j);
                }
            });
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Observable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ");
        sbLIZ.append(c23271099x);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
