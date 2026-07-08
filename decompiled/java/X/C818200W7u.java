package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0W7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818200W7u {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public C818200W7u() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C818200W7u)) {
            return false;
        }
        C818200W7u c818200W7u = (C818200W7u) obj;
        return this.LIZ == c818200W7u.LIZ && this.LIZIZ == c818200W7u.LIZIZ && this.LIZJ == c818200W7u.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NxRewordMonitorConfig(coreSampling=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hotFixSampling=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", resourceSampling=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C818200W7u(int i) {
        this(LSPassThroughRecordSizeConfig.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public C818200W7u(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
