package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YOF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YOF extends C09AY implements Function0<C0YO0> {
    public final /* synthetic */ C0YOG LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YOF(C0YOG c0yog) {
        super(0);
        this.LL = c0yog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0YO0 invoke() {
        C0YOG c0yog = this.LL;
        return new C0YO0(c0yog.LIZ, (C0YHF) c0yog.LIZJ.getValue());
    }
}
