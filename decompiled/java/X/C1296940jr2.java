package X;

/* JADX INFO: renamed from: X.0jr2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296940jr2 extends AbstractC1296960jr4<Object> {
    public final /* synthetic */ AbstractC1296960jr4 LIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(".nullSafe()");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1296940jr2(AbstractC1296960jr4 abstractC1296960jr4) {
        this.LIZ = abstractC1296960jr4;
    }

    @Override // X.AbstractC1296960jr4
    public final Object LIZ(AbstractC1296450jqF abstractC1296450jqF) {
        if (abstractC1296450jqF.LJJIL() == EnumC1296400jqA.NULL) {
            abstractC1296450jqF.LJIJJLI();
            return null;
        }
        return this.LIZ.LIZ(abstractC1296450jqF);
    }

    @Override // X.AbstractC1296960jr4
    public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Object obj) {
        if (obj == null) {
            abstractC1297000jr8.LIZIZ();
        } else {
            this.LIZ.LIZIZ(abstractC1297000jr8, obj);
        }
    }
}
