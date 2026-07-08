package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0UZC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0UZC extends C1696260uF6 implements Function2<String, String, Unit> {
    public C0UZC(Object obj) {
        super(2, obj, C0UZN.class, "onSuccess", "onSuccess(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;", 8);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        ((C0UZN) this.receiver).LJJI(str, str2);
        return Unit.LIZ;
    }
}
