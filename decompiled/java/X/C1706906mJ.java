package X;

import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06mJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1706906mJ implements InterfaceC898340ZMa {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1706906mJ)) {
            return false;
        }
        C1706906mJ c1706906mJ = (C1706906mJ) obj;
        return this.LIZ == c1706906mJ.LIZ && this.LIZIZ == c1706906mJ.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1706906mJ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1706906mJ.LIZLLL) && Intrinsics.LJFF(this.LJ, c1706906mJ.LJ);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        String str = this.LIZJ;
        return ((((iY2 + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreshownStickerActionMetaData(currentLocaleTimeSecond=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentServerTimeSecond=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromPath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sceneId=");
        sbLIZ.append(this.LJ);
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

    public C1706906mJ(String str, String str2) {
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
        this.LIZLLL = str;
        this.LJ = str2;
    }
}
