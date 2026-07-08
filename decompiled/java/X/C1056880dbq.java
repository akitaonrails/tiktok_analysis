package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0dbq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1056880dbq extends AbstractC1023470cjx {
    public final C1023630ckD<?>[] LIZ;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public C1056880dbq(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        for (Object obj : objArr) {
            if (obj instanceof InterfaceC1017050cZb) {
                withContextByType(InterfaceC1017050cZb.class, obj);
            }
        }
        C1056900dbs.LIZ.getClass();
        this.LIZ = new C1023630ckD[]{new C1023630ckD<>(C1056900dbs.LIZLLL, new C1056870dbp()), new C1023630ckD<>(C1056900dbs.LIZJ, new C1056910dbt()), new C1023630ckD<>(C1056900dbs.LIZIZ, new C1056920dbu()), new C1023630ckD<>(C1056900dbs.LJ, new C1056840dbm())};
    }
}
