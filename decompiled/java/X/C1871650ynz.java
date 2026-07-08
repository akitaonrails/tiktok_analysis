package X;

import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ynz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1871650ynz {
    public final SchemaParserData LIZ;
    public final MinisMetaResp LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1871650ynz)) {
            return false;
        }
        C1871650ynz c1871650ynz = (C1871650ynz) obj;
        return Intrinsics.LJFF(this.LIZ, c1871650ynz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1871650ynz.LIZIZ);
    }

    public final int hashCode() {
        SchemaParserData schemaParserData = this.LIZ;
        int iHashCode = (schemaParserData == null ? 0 : schemaParserData.hashCode()) * 31;
        MinisMetaResp minisMetaResp = this.LIZIZ;
        return iHashCode + (minisMetaResp != null ? minisMetaResp.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchemaResolveResult(schemaData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", metaResp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1871650ynz(SchemaParserData schemaParserData, MinisMetaResp minisMetaResp) {
        this.LIZ = schemaParserData;
        this.LIZIZ = minisMetaResp;
    }
}
