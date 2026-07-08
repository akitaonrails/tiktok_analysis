package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21349018gi {
    public final MediaModel LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    public C21349018gi() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21349018gi)) {
            return false;
        }
        C21349018gi c21349018gi = (C21349018gi) obj;
        return Intrinsics.LJFF(this.LIZ, c21349018gi.LIZ) && this.LIZIZ == c21349018gi.LIZIZ && this.LIZJ == c21349018gi.LIZJ && Intrinsics.LJFF(this.LIZLLL, c21349018gi.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomToolbarStates(mediaModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isNextButtonEnable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isShow=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ctaText=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C21349018gi(String str, int i) {
        MediaModel mediaModel;
        boolean z;
        if ((i & 1) != 0) {
            mediaModel = new MediaModel(-1L);
            mediaModel.LJIILL("");
        } else {
            mediaModel = null;
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(mediaModel, false, z, (i & 8) != 0 ? null : str);
    }

    public C21349018gi(MediaModel mediaModel, boolean z, boolean z2, String str) {
        this.LIZ = mediaModel;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = str;
    }

    public static C21349018gi LIZ(C21349018gi c21349018gi, MediaModel mediaModel, boolean z, boolean z2, int i) {
        String str;
        if ((i & 1) != 0) {
            mediaModel = c21349018gi.LIZ;
        }
        if ((i & 2) != 0) {
            z = c21349018gi.LIZIZ;
        }
        if ((i & 4) != 0) {
            z2 = c21349018gi.LIZJ;
        }
        if ((i & 8) != 0) {
            str = c21349018gi.LIZLLL;
        } else {
            str = null;
        }
        c21349018gi.getClass();
        return new C21349018gi(mediaModel, z, z2, str);
    }
}
