package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0BeU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C293240BeU extends C09AY implements Function1<String, Boolean> {
    public final /* synthetic */ C293230BeT LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C293240BeU(C293230BeT c293230BeT) {
        super(1);
        this.LL = c293230BeT;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        return Boolean.valueOf(!this.LL.LIZIZ.contains(str));
    }
}
