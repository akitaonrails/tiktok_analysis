package X;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rbu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C699320Rbu extends C2217421BqW implements Function1<C700400Rde, Unit> {
    public final /* synthetic */ LinkedHashMap<String, Set<String>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C699320Rbu(LinkedHashMap<String, Set<String>> linkedHashMap) {
        super(1, C1449605lu.class, "visit", "deriveSlotChildrenMap$visit(Ljava/util/LinkedHashMap;Lcom/tiktok/kmp/fcp/slotstrategy/tree/SlotTreeNode;)V", 0);
        this.LL = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C700400Rde c700400Rde) {
        C699340Rbw.LJFF(c700400Rde, this.LL);
        return Unit.LIZ;
    }
}
