package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.17ox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21145317ox extends C09AY implements Function1<InterfaceC21144717or, Unit> {
    public final /* synthetic */ List LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21145317ox(List list) {
        super(1);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC21144717or interfaceC21144717or) {
        this.LL.add(interfaceC21144717or);
        return Unit.LIZ;
    }
}
