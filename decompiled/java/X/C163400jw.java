package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00jw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C163400jw extends C09AY implements Function0<C00EF> {
    public final /* synthetic */ Function0<Float> LL;
    public final /* synthetic */ Function0<Boolean> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C163400jw(Function0<Float> function0, Function0<Boolean> function02) {
        super(0);
        this.LL = function0;
        this.LLILLJJLI = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C00EF invoke() {
        return new C00EF(C13LZ.LIZLLL(this.LL.invoke().floatValue(), 0.0f, 1.0f), this.LLILLJJLI.invoke().booleanValue());
    }
}
