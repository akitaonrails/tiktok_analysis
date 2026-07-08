package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bIM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967920bIM extends C09AY implements Function1<InterfaceC965990bFF, Unit> {
    public final /* synthetic */ List<Pair<String, Integer>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967920bIM(List<Pair<String, Integer>> list) {
        super(1);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC965990bFF interfaceC965990bFF) {
        interfaceC965990bFF.LLIIII(this.LL);
        return Unit.LIZ;
    }
}
