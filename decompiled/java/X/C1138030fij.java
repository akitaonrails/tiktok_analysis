package X;

import com.bytedance.android.live.base.model.ImageModel;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0fij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138030fij {
    public final int[] LIZ;
    public final int[] LIZIZ;
    public final ImageModel LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftTrayIconInfo(iconLocation=");
        sbLIZ.append(Arrays.toString(this.LIZ));
        sbLIZ.append(", iconSize=");
        sbLIZ.append(Arrays.toString(this.LIZIZ));
        sbLIZ.append(", iconImage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1138030fij(int[] iArr, int[] iArr2, ImageModel imageModel) {
        this.LIZ = iArr;
        this.LIZIZ = iArr2;
        this.LIZJ = imageModel;
    }
}
