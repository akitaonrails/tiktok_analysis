package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0trh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681750trh extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ Function0<Float> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681750trh(Function0<Float> function0) {
        super(0);
        this.LL = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.LL.invoke().floatValue() < 0.25f);
    }
}
