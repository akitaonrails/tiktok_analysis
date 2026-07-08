package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I6E, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I6E implements C0I6G {
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0I6E) && Intrinsics.LJFF(this.LIZIZ, ((C0I6E) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomTag(tag=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I6E(String str) {
        this.LIZIZ = str;
    }

    @Override // X.C0I6G
    public final void LIZ(View view, C03IT c03it) {
        view.setTag(50331663, this.LIZIZ);
    }
}
