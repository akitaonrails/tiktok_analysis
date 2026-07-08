package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rd7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C700070Rd7 extends C2217421BqW implements Function1<C700400Rde, Unit> {
    public final /* synthetic */ LinkedHashMap<String, C700400Rde> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C700070Rd7(LinkedHashMap<String, C700400Rde> linkedHashMap) {
        super(1, C1449605lu.class, "visit", "nodesBySlotId_delegate$lambda$0$visit(Ljava/util/LinkedHashMap;Lcom/tiktok/kmp/fcp/slotstrategy/tree/SlotTreeNode;)V", 0);
        this.LL = linkedHashMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C700400Rde c700400Rde) {
        C700400Rde c700400Rde2 = c700400Rde;
        LinkedHashMap<String, C700400Rde> linkedHashMap = this.LL;
        linkedHashMap.put(c700400Rde2.LIZ, c700400Rde2);
        c700400Rde2.LIZIZ(new C700070Rd7(linkedHashMap));
        return Unit.LIZ;
    }
}
