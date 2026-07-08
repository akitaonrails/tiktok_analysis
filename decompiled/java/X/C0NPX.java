package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NPX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NPX implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final C291001Au<Bitmap> LLILLJJLI;
    public final Uri LLILLL;
    public final C291001Au<List<Uri>> LLILZ;
    public final C291001Au<Boolean> LLILZIL;

    public C0NPX() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NPX)) {
            return false;
        }
        C0NPX c0npx = (C0NPX) obj;
        return Intrinsics.LJFF(this.LL, c0npx.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0npx.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0npx.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0npx.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c0npx.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        Uri uri = this.LLILLL;
        return ((((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoRecordFragmentState(keyboardState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", photoPreviewState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", photoPreviewUri=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onPicSelectFinishedByUri=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onGalleryClose=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0NPX(int i) {
        Boolean bool = Boolean.FALSE;
        this(new C291001Au(bool), new C291001Au(null), null, new C291001Au(null), new C291001Au(bool));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0NPX(C291001Au<Boolean> c291001Au, C291001Au<Bitmap> c291001Au2, Uri uri, C291001Au<? extends List<Uri>> c291001Au3, C291001Au<Boolean> c291001Au4) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = uri;
        this.LLILZ = c291001Au3;
        this.LLILZIL = c291001Au4;
    }

    public static C0NPX LIZ(C0NPX c0npx, C291001Au c291001Au, Uri uri, C291001Au c291001Au2, C291001Au c291001Au3, int i) {
        C291001Au<Boolean> c291001Au4;
        C291001Au c291001Au5 = c291001Au3;
        C291001Au c291001Au6 = c291001Au2;
        Uri uri2 = uri;
        C291001Au c291001Au7 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au4 = c0npx.LL;
        } else {
            c291001Au4 = null;
        }
        if ((i & 2) != 0) {
            c291001Au7 = c0npx.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            uri2 = c0npx.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au6 = c0npx.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au5 = c0npx.LLILZIL;
        }
        c0npx.getClass();
        return new C0NPX(c291001Au4, c291001Au7, uri2, c291001Au6, c291001Au5);
    }
}
