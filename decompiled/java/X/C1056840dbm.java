package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dbm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056840dbm extends C09AY implements Function1<C1196804mE, Long> {
    public C1056840dbm() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(C1196804mE c1196804mE) throws C1023680ckI {
        Object objLIZ = c1196804mE.LIZ(InterfaceC1017050cZb.class);
        if (objLIZ != null) {
            return Long.valueOf((long) ((InterfaceC1017050cZb) objLIZ).getPriority());
        }
        throw new C1023680ckI(InterfaceC1017050cZb.class);
    }
}
