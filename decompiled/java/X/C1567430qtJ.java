package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qtJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567430qtJ extends C09AY implements Function2<InterfaceC1567440qtK, Object, Object> {
    public final /* synthetic */ Function2<InterfaceC1567440qtK, Object, List<Object>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1567430qtJ(Function2<? super InterfaceC1567440qtK, Object, ? extends List<Object>> function2) {
        super(2);
        this.LL = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1567440qtK interfaceC1567440qtK, Object obj) {
        InterfaceC1567440qtK interfaceC1567440qtK2 = interfaceC1567440qtK;
        List<Object> listInvoke = this.LL.invoke(interfaceC1567440qtK2, obj);
        int size = listInvoke.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = ListProtector.get(listInvoke, i);
            if (obj2 != null && !interfaceC1567440qtK2.LIZ(obj2)) {
                "Failed requirement.".toString();
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        if (!listInvoke.isEmpty()) {
            return new ArrayList(listInvoke);
        }
        return null;
    }
}
