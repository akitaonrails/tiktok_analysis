package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00H6, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00H6 {
    public final String LIZ;
    public final Long LIZIZ;
    public final Bitmap LIZJ;
    public final String LIZLLL;
    public final byte[] LJ;
    public final String LJFF;

    public final Bitmap LIZIZ() {
        Bitmap bitmap = this.LIZJ;
        if (bitmap == null || !bitmap.isRecycled()) {
            return this.LIZJ;
        }
        return null;
    }

    public final boolean LIZJ(long j, String str) {
        Long l;
        Bitmap bitmap = this.LIZJ;
        if (bitmap == null || bitmap.isRecycled() || !Intrinsics.LJFF(str, this.LIZ) || j <= -1 || (l = this.LIZIZ) == null || j != l.longValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C00H6(String str, Long l, Bitmap bitmap, int i) {
        String str2;
        Bitmap bitmap2 = bitmap;
        Long l2 = l;
        String str3 = (i & 1) != 0 ? "" : str;
        l2 = (i & 2) != 0 ? -1L : l2;
        bitmap2 = (i & 4) != 0 ? null : bitmap2;
        if ((i & 8) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        this(str3, l2, bitmap2, str2, null, (i & 32) == 0 ? null : "");
    }

    public static C00H6 LIZ(C00H6 c00h6, Bitmap bitmap, byte[] bArr, int i) {
        String str;
        Long l;
        String str2;
        byte[] bArr2 = bArr;
        Bitmap bitmap2 = bitmap;
        String str3 = null;
        if ((i & 1) != 0) {
            str = c00h6.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            l = c00h6.LIZIZ;
        } else {
            l = null;
        }
        if ((i & 4) != 0) {
            bitmap2 = c00h6.LIZJ;
        }
        if ((i & 8) != 0) {
            str2 = c00h6.LIZLLL;
        } else {
            str2 = null;
        }
        if ((i & 16) != 0) {
            bArr2 = c00h6.LJ;
        }
        if ((i & 32) != 0) {
            str3 = c00h6.LJFF;
        }
        return new C00H6(str, l, bitmap2, str2, bArr2, str3);
    }

    public C00H6(String str, Long l, Bitmap bitmap, String str2, byte[] bArr, String str3) {
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = bitmap;
        this.LIZLLL = str2;
        this.LJ = bArr;
        this.LJFF = str3;
    }
}
