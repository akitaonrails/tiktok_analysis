package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092680eXa {
    public final C1092720eXe LIZ;
    public final Text LIZIZ;
    public final ImageModel LIZJ;
    public final Text LIZLLL;
    public final String LJ;
    public final ImageModel LJFF;
    public final JSONObject LJI;
    public final boolean LJII;

    public C1092680eXa() {
        this(null, null, null, null, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1092680eXa)) {
            return false;
        }
        C1092680eXa c1092680eXa = (C1092680eXa) obj;
        return Intrinsics.LJFF(this.LIZ, c1092680eXa.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1092680eXa.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1092680eXa.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1092680eXa.LIZLLL) && Intrinsics.LJFF(this.LJ, c1092680eXa.LJ) && Intrinsics.LJFF(this.LJFF, c1092680eXa.LJFF) && Intrinsics.LJFF(this.LJI, c1092680eXa.LJI) && this.LJII == c1092680eXa.LJII;
    }

    public final int hashCode() {
        C1092720eXe c1092720eXe = this.LIZ;
        int iHashCode = (c1092720eXe == null ? 0 : c1092720eXe.hashCode()) * 31;
        Text text = this.LIZIZ;
        int iHashCode2 = (iHashCode + (text == null ? 0 : text.hashCode())) * 31;
        ImageModel imageModel = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        Text text2 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (text2 == null ? 0 : text2.hashCode())) * 31;
        String str = this.LJ;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        ImageModel imageModel2 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (imageModel2 == null ? 0 : imageModel2.hashCode())) * 31;
        JSONObject jSONObject = this.LJI;
        return ((iHashCode6 + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentConfiguration(effectResource=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", contentText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", contentIcon=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", leftTuxIcon=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", leftIcon=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", raw=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", contentNeedAnchorName=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1092680eXa(C1092720eXe c1092720eXe, Text text, ImageModel imageModel, Text text2, String str, ImageModel imageModel2, JSONObject jSONObject, boolean z) {
        this.LIZ = c1092720eXe;
        this.LIZIZ = text;
        this.LIZJ = imageModel;
        this.LIZLLL = text2;
        this.LJ = str;
        this.LJFF = imageModel2;
        this.LJI = jSONObject;
        this.LJII = z;
    }
}
