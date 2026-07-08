package X;

import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06fS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1664406fS implements InterfaceC898340ZMa {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;

    public C1664406fS() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1664406fS)) {
            return false;
        }
        C1664406fS c1664406fS = (C1664406fS) obj;
        return this.LIZ == c1664406fS.LIZ && this.LIZIZ == c1664406fS.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1664406fS.LIZJ);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        return iY2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultStrategyMetaData(currentLocaleTimeSecond=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentServerTimeSecond=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromPath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC898340ZMa
    public final long LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC898340ZMa
    public final long LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC898340ZMa
    public final String LIZJ() {
        return this.LIZJ;
    }

    public C1664406fS(int i) {
        Long lValueOf;
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        IMHostApi.LIZ.getClass();
        if (C1419705h5.LIZ() != null) {
            lValueOf = Long.valueOf(r0.getServerTime());
        } else {
            lValueOf = null;
        }
        long jLIZIZ = C1527905yX.LIZIZ(lValueOf);
        this.LIZ = jCurrentTimeMillis;
        this.LIZIZ = jLIZIZ;
        this.LIZJ = null;
    }
}
