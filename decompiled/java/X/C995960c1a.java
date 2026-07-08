package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995960c1a implements InterfaceC0148002o {
    public final String LL;

    public C995960c1a() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C995960c1a) && Intrinsics.LJFF(this.LL, ((C995960c1a) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopBagTemplateEditState(content=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C995960c1a(int i) {
        this("");
    }

    public C995960c1a(String str) {
        this.LL = str;
    }
}
