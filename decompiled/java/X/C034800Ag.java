package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;

/* JADX INFO: renamed from: X.00Ag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C034800Ag {
    public final Fragment LIZ;
    public final TuxSheet LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumV2Output(contentFragment=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tuxSheet=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C034800Ag(Fragment fragment, TuxSheet tuxSheet) {
        this.LIZ = fragment;
        this.LIZIZ = tuxSheet;
    }
}
