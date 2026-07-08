package X;

import com.bytedance.retrofit2.mime.TypedOutput;

/* JADX INFO: renamed from: X.0p9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1500650p9b<T> extends AbstractC1500610p9X<T> {
    public final InterfaceC1501660pBE<T, TypedOutput> LIZ;

    public C1500650p9b(InterfaceC1501660pBE interfaceC1501660pBE) {
        this.LIZ = interfaceC1501660pBE;
    }

    @Override // X.AbstractC1500610p9X
    public final void LIZ(C1500660p9c c1500660p9c, T t) {
        if (t != null) {
            c1500660p9c.LIZLLL.put("content-type", "application/json; charset=UTF-8");
            c1500660p9c.LIZJ = "application/json; charset=UTF-8";
            c1500660p9c.LJI = new C1500670p9d(this, t);
            return;
        }
        throw new IllegalArgumentException("Body parameter value must not be null.");
    }
}
