package X;

import com.ss.android.ugc.aweme.autopick.model.AssetAnalysisResult;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00cl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C118900cl {
    public static final /* synthetic */ int LJII = 0;
    public final MediaModel LIZ;
    public AssetAnalysisResult LIZIZ = null;
    public EnumC119000cm LIZJ = EnumC119000cm.OTHER;
    public String LIZLLL;
    public String LJ;
    public boolean LJFF;
    public String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C118900cl)) {
            return false;
        }
        C118900cl c118900cl = (C118900cl) obj;
        return Intrinsics.LJFF(this.LIZ, c118900cl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c118900cl.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        AssetAnalysisResult assetAnalysisResult = this.LIZIZ;
        return iHashCode + (assetAnalysisResult == null ? 0 : assetAnalysisResult.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickAsset(mediaModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", analysisResult=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long LIZ() {
        MediaModel mediaModel = this.LIZ;
        long j = mediaModel.dateTaken;
        return j <= 0 ? mediaModel.date : j;
    }

    public final String LIZIZ() {
        return a0.LJJJJZ("file://", this.LIZ.LJFF());
    }

    public C118900cl(MediaModel mediaModel) {
        this.LIZ = mediaModel;
        this.LJ = C118800ck.LIZIZ(mediaModel.albumClass);
    }
}
