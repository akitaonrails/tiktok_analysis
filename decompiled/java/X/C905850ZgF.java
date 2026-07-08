package X;

import com.ss.android.ugc.aweme.im.streaming.api.BlockUIData;
import com.ss.android.ugc.aweme.im.streaming.api.StreamingResponseData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZgF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905850ZgF implements InterfaceC905820ZgC {
    public final List<BlockUIData> LIZ;
    public final C1622006Ws<StreamingResponseData> LIZIZ;
    public final C1622006Ws<C905880ZgI> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C905850ZgF)) {
            return false;
        }
        C905850ZgF c905850ZgF = (C905850ZgF) obj;
        return Intrinsics.LJFF(this.LIZ, c905850ZgF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c905850ZgF.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c905850ZgF.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        this.LIZIZ.getClass();
        int i = iHashCode * 31;
        this.LIZJ.getClass();
        return i;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Complete(blocks=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rawData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extraData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC905820ZgC
    public final List<BlockUIData> LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC905820ZgC
    public final C1622006Ws<C905880ZgI> getExtraData() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC905820ZgC
    public final C1622006Ws<StreamingResponseData> getRawData() {
        return this.LIZIZ;
    }

    public /* synthetic */ C905850ZgF(List list) {
        this(list, new C1622006Ws(null), new C1622006Ws(new C905880ZgI(null)));
    }

    public C905850ZgF(List<BlockUIData> list, C1622006Ws<StreamingResponseData> c1622006Ws, C1622006Ws<C905880ZgI> c1622006Ws2) {
        this.LIZ = list;
        this.LIZIZ = c1622006Ws;
        this.LIZJ = c1622006Ws2;
    }
}
