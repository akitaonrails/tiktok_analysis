package X;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00bs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C113400bs extends C09AY implements Function1<Object, Object> {
    public final /* synthetic */ List<Function1<Object, Object>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C113400bs(List<? extends Function1<Object, Object>> list) {
        super(1);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<Function1<Object, Object>> list = this.LL;
        if (!list.isEmpty()) {
            ListIterator<Function1<Object, Object>> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                obj = listIterator.previous().invoke(obj);
            }
        }
        return obj;
    }
}
