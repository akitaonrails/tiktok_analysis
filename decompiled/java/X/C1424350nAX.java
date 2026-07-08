package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0nAX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1424350nAX extends C2217421BqW implements Function2<String, Integer, Unit> {
    public C1424350nAX(C1424300nAS c1424300nAS) {
        super(2, c1424300nAS, C1424300nAS.class, "search", "search(Ljava/lang/String;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Integer num) {
        int iIntValue = num.intValue();
        ((C1424300nAS) this.receiver).d5(str, iIntValue);
        return Unit.LIZ;
    }
}
