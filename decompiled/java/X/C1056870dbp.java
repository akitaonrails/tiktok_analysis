package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dbp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056870dbp extends C09AY implements Function1<C1196804mE, Long> {
    public C1056870dbp() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(C1196804mE c1196804mE) throws C1023680ckI {
        if (c1196804mE.LIZ(InterfaceC1017050cZb.class) != null) {
            return Long.valueOf(((InterfaceC1017050cZb) r0).LJIL());
        }
        throw new C1023680ckI(InterfaceC1017050cZb.class);
    }
}
