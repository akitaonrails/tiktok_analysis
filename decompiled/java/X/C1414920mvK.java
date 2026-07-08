package X;

import com.ss.android.ugc.gamora.editor.mixediting.resource.model.MixEditingCategoryData;

/* JADX INFO: renamed from: X.0mvK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414920mvK {
    public final C00BT LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final MixEditingCategoryData LIZLLL = null;
    public final boolean LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixEditingErrorInfo(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorMsg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", category=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", preload=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1414920mvK(C00BT c00bt, int i, String str, boolean z) {
        this.LIZ = c00bt;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LJ = z;
    }
}
