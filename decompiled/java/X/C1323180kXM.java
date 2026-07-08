package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0kXM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323180kXM {
    public final boolean LIZ;
    public final int LIZIZ;

    public C1323180kXM() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1323180kXM)) {
            return false;
        }
        C1323180kXM c1323180kXM = (C1323180kXM) obj;
        return this.LIZ == c1323180kXM.LIZ && this.LIZIZ == c1323180kXM.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoImageLoadingConfig(useStaticStub=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", staticStubResId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1323180kXM(int i) {
        this(false, R.drawable.df5);
    }

    public C1323180kXM(boolean z, int i) {
        this.LIZ = z;
        this.LIZIZ = i;
    }
}
