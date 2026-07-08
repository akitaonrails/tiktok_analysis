package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0a1T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C919010a1T extends C2217421BqW implements Function2<String, Function1<? super String, ? extends Unit>, Boolean> {
    public C919010a1T(C921520a5W c921520a5W) {
        super(2, c921520a5W, C921520a5W.class, "checkIncreaseGuestMaxCount", "checkIncreaseGuestMaxCount(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Z", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(String str, Function1<? super String, ? extends Unit> function1) {
        return Boolean.valueOf(((C921520a5W) this.receiver).LJJIIZ(str, function1));
    }
}
