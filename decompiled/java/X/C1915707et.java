package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07et, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1915707et extends C09AY implements Function0<Unit> {
    public final /* synthetic */ List<Function1<C696930RVj<Object>, C696930RVj<Object>>> LL;
    public final /* synthetic */ Function1<C696930RVj<Object>, C696930RVj<Object>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1915707et(List<Function1<C696930RVj<Object>, C696930RVj<Object>>> list, Function1<? super C696930RVj<Object>, C696930RVj<Object>> function1) {
        super(0);
        this.LL = list;
        this.LLILLJJLI = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ListProtector.remove(this.LL, this.LL.indexOf(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
