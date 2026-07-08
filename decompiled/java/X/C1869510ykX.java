package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ykX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869510ykX extends C09AY implements Function0<C1869500ykW> {
    public final /* synthetic */ C20564615dU LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1869510ykX(C20564615dU c20564615dU) {
        super(0);
        this.LL = c20564615dU;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0ykW] */
    @Override // kotlin.jvm.functions.Function0
    public final C1869500ykW invoke() {
        final C20564615dU c20564615dU = this.LL;
        return new InterfaceC1869390ykL() { // from class: X.0ykW
            @Override // X.InterfaceC1869390ykL
            public final List LIZ(InterfaceC1869460ykS interfaceC1869460ykS) {
                ArrayList arrayList = new ArrayList();
                C20564615dU c20564615dU2 = c20564615dU;
                if (interfaceC1869460ykS instanceof C1869440ykQ) {
                    arrayList.add(c20564615dU2.getSpotLightTopviewHandler((C1869440ykQ) interfaceC1869460ykS));
                }
                return arrayList;
            }
        };
    }
}
