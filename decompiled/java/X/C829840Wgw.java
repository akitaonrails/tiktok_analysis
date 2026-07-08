package X;

import com.tiktok.ttm.TTMParamData;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import com.tiktok.ttm.ttmparam.TTMCollectionParam;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wgw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829840Wgw extends ITTMParamData {
    public final String LIZIZ;
    public final C2269851Dst LIZJ;
    public final List<C169A> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C829840Wgw)) {
            return false;
        }
        C829840Wgw c829840Wgw = (C829840Wgw) obj;
        return Intrinsics.LJFF(this.LIZIZ, c829840Wgw.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c829840Wgw.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c829840Wgw.LIZLLL);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final Object getInputData() {
        return this;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final int getType() {
        return 2;
    }

    public final int hashCode() {
        return (((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConvContextModel(convId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", basicInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", contextETModelList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final String[] getDictKeys() {
        return new String[]{"convId", "basicInfo", "contextETModelList"};
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final boolean containsKey(String str) {
        return C13LP.LJJJJ(str, C1697810uHb.LJIIJJI("convId", "basicInfo", "contextETModelList"));
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final ITTMParamData getObjectItem(String str) {
        if (Intrinsics.LJFF(str, "basicInfo")) {
            return this.LIZJ;
        }
        if (Intrinsics.LJFF(str, "contextETModelList")) {
            List<C169A> list = this.LIZLLL;
            if (list == null) {
                return null;
            }
            return new TTMCollectionParam((List<Object>) list);
        }
        return new TTMParamData("").getActualParamData();
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final String getStringValue(String str, int i) {
        if (Intrinsics.LJFF(str, "convId")) {
            return this.LIZIZ;
        }
        return "";
    }

    public C829840Wgw(String str, C2269851Dst c2269851Dst, List<C169A> list) {
        this.LIZIZ = str;
        this.LIZJ = c2269851Dst;
        this.LIZLLL = list;
    }
}
