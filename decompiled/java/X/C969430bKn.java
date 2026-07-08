package X;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969430bKn {
    public String LIZ;
    public String LIZIZ;
    public List<C1276580jKC> LIZJ;
    public List<C1276580jKC> LIZLLL;
    public JSONObject LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisposableMixParams{updateLayout=");
        sbLIZ.append(true);
        sbLIZ.append(", updateImage=");
        sbLIZ.append(false);
        sbLIZ.append(", updateAlternate=");
        sbLIZ.append(true);
        sbLIZ.append(", sei='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", effectID='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", regions=");
        sbLIZ.append(C216900sZ.LIZIZ(this.LIZJ));
        sbLIZ.append(", regionsBeforeEffect=");
        sbLIZ.append(C216900sZ.LIZIZ(this.LIZLLL));
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", alternateImageRegions=");
        sbLIZ.append((Object) null);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
