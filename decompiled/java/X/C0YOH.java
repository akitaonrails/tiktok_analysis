package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YOH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YOH extends C09AY implements Function0<C874160YRa> {
    public final /* synthetic */ C0YOG LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YOH(C0YOG c0yog) {
        super(0);
        this.LL = c0yog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C874160YRa invoke() {
        C0YOG c0yog = this.LL;
        return new C874160YRa(c0yog.LIZ, (C0YHF) c0yog.LIZJ.getValue());
    }
}
