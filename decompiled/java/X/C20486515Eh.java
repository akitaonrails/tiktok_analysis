package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Eh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20486515Eh {
    public final EnumC1154880g9u LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final ImageModel LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20486515Eh)) {
            return false;
        }
        C20486515Eh c20486515Eh = (C20486515Eh) obj;
        return this.LIZ == c20486515Eh.LIZ && this.LIZIZ == c20486515Eh.LIZIZ && Intrinsics.LJFF(this.LIZJ, c20486515Eh.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c20486515Eh.LIZLLL) && Intrinsics.LJFF(this.LJ, c20486515Eh.LJ);
    }

    public C20486515Eh(EnumC1154880g9u enumC1154880g9u, int i, String str, String str2, ImageModel imageModel, int i2) {
        i = (i2 & 2) != 0 ? 0 : i;
        str = (i2 & 4) != 0 ? null : str;
        str2 = (i2 & 8) != 0 ? null : str2;
        imageModel = (i2 & 16) != 0 ? null : imageModel;
        this.LIZ = enumC1154880g9u;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = imageModel;
    }
}
