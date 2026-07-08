package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UZD, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0UZD extends C1696260uF6 implements Function1<String, Unit> {
    public C0UZD(Object obj) {
        super(1, obj, C0UZN.class, "onFailed", "onFailed(Ljava/lang/String;)Lkotlin/Unit;", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        ((C0UZN) this.receiver).onFailed(str);
        return Unit.LIZ;
    }
}
