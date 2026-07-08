package X;

import com.ss.android.ugc.aweme.im.streaming.api.BlockUIData;
import com.ss.android.ugc.aweme.im.streaming.api.StreamingResponseData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905830ZgD implements InterfaceC905820ZgC {
    public final Throwable LIZ;
    public final List<BlockUIData> LIZIZ;
    public final C1622006Ws<StreamingResponseData> LIZJ;
    public final C1622006Ws<C905880ZgI> LIZLLL;

    public C905830ZgD() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C905830ZgD)) {
            return false;
        }
        C905830ZgD c905830ZgD = (C905830ZgD) obj;
        return Intrinsics.LJFF(this.LIZ, c905830ZgD.LIZ) && Intrinsics.LJFF(this.LIZIZ, c905830ZgD.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c905830ZgD.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c905830ZgD.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        this.LIZJ.getClass();
        int i = iHashCode * 31;
        this.LIZLLL.getClass();
        return i;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(throwable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", blocks=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rawData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extraData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC905820ZgC
    public final List<BlockUIData> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC905820ZgC
    public final C1622006Ws<C905880ZgI> getExtraData() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC905820ZgC
    public final C1622006Ws<StreamingResponseData> getRawData() {
        return this.LIZJ;
    }

    public C905830ZgD(Throwable th, List list) {
        C1622006Ws<StreamingResponseData> c1622006Ws = new C1622006Ws<>(null);
        C1622006Ws<C905880ZgI> c1622006Ws2 = new C1622006Ws<>(new C905880ZgI(null));
        this.LIZ = th;
        this.LIZIZ = list;
        this.LIZJ = c1622006Ws;
        this.LIZLLL = c1622006Ws2;
    }
}
