package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00HQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00HQ extends C09AY implements Function1<Integer, Object> {
    public final /* synthetic */ Function1 LL;
    public final /* synthetic */ List LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C00HQ(Function1 function1, List list) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return this.LL.invoke(ListProtector.get(this.LLILLJJLI, num.intValue()));
    }
}
