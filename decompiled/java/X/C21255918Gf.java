package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Gf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21255918Gf extends C09AY implements Function0<Object> {
    public final /* synthetic */ Exception LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21255918Gf(Exception exc) {
        super(0);
        this.LL = exc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.LL.toString();
    }
}
