package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Ge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21255818Ge extends C09AY implements Function0<Object> {
    public final /* synthetic */ Thread LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21255818Ge(Thread thread) {
        super(0);
        this.LL = thread;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.LL.getName();
    }
}
