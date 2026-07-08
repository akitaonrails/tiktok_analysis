package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0e6L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075790e6L extends C09AY implements Function0<Integer> {
    public final /* synthetic */ C1075800e6M LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1075790e6L(C1075800e6M c1075800e6M) {
        super(0);
        this.LL = c1075800e6M;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int size;
        List<InterfaceC1891350zJl> listLIZ = this.LL.LIZJ.LIZ();
        if (listLIZ != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : listLIZ) {
                if (interfaceC1891350zJl instanceof C1261650iw7) {
                    arrayList.add(interfaceC1891350zJl);
                }
            }
            size = arrayList.size();
        } else {
            size = 0;
        }
        return Integer.valueOf(size);
    }
}
