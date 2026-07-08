package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0WJ2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WJ2 implements InterfaceC821090WIx {
    @Override // X.InterfaceC821090WIx
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.InterfaceC821090WIx
    public final String LIZJ() {
        return "persistent";
    }

    @Override // X.InterfaceC821090WIx
    public final String LIZ(Context context, C821110WIz c821110WIz) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0CHQ.LIZ().LJJIIJZLJL().getPathService().getPersistentRoot());
        sbLIZ.append(c821110WIz.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC821090WIx
    public final Object LIZLLL(Context context, C821110WIz c821110WIz, InterfaceC1364105Vn<? super C821100WIy> interfaceC1364105Vn) {
        if (new C0VSJ(LIZ(context, c821110WIz)).exists()) {
            return new C821100WIy(C0WJ1.SUCCESS, "");
        }
        return new C821100WIy(C0WJ1.NOT_EXIST, "not exist");
    }
}
