package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jdw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496740Jdw extends C09AY implements Function1<C496720Jdu, C496720Jdu> {
    public final /* synthetic */ C496700Jds LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496740Jdw(C496700Jds c496700Jds) {
        super(1);
        this.LL = c496700Jds;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C496720Jdu invoke(C496720Jdu c496720Jdu) {
        C496700Jds c496700Jds = this.LL;
        c496720Jdu.getClass();
        return new C496720Jdu(c496700Jds);
    }
}
