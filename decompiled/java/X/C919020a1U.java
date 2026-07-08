package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0a1U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C919020a1U extends C2217421BqW implements Function2<String, Function1<? super String, ? extends Unit>, Boolean> {
    public C919020a1U(AbstractC921450a5P abstractC921450a5P) {
        super(2, abstractC921450a5P, AbstractC921450a5P.class, "checkIncreaseGuestMaxCount", "checkIncreaseGuestMaxCount(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Z", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(String str, Function1<? super String, ? extends Unit> function1) {
        return Boolean.valueOf(((AbstractC921450a5P) this.receiver).LJJIIZ(str, function1));
    }
}
