package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18CP, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18CP extends C09AY implements Function0<Object> {
    public final /* synthetic */ C18EK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18CP(C18EK c18ek) {
        super(0);
        this.LL = c18ek;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return String.valueOf(this.LL);
    }
}
