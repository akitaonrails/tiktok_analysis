package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690540R6u extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C690530R6t LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C690540R6u(C690530R6t c690530R6t) {
        super(0);
        this.LL = c690530R6t;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C690530R6t c690530R6t = this.LL;
        c690530R6t.getClass();
        return Boolean.valueOf(AbstractC19994813Le.Default.nextDouble() < c690530R6t.LIZ);
    }
}
