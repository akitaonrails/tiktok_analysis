package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18J0, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18J0 extends C09AY implements Function0<Object> {
    public final /* synthetic */ C18EW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18J0(C18EW c18ew) {
        super(0);
        this.LL = c18ew;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return String.valueOf(this.LL);
    }
}
