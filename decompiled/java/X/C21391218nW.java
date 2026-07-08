package X;

import Y.ARunnableS102S0100000_2;
import android.graphics.Bitmap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.18nW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21391218nW {
    public static final ConcurrentHashMap<String, C21391318nX> LIZ = new ConcurrentHashMap<>();
    public static final AtomicLong LIZIZ = new AtomicLong(0);

    public static C21391318nX LIZIZ(String str) {
        if (str != null) {
            return LIZ.get(str);
        }
        return null;
    }

    public static void LIZJ(String str) {
        C21391318nX c21391318nXRemove;
        if (str != null && (c21391318nXRemove = LIZ.remove(str)) != null) {
            c21391318nXRemove.LIZLLL();
            C21391618na c21391618na = c21391318nXRemove.LJIIIZ;
            if (c21391618na != null) {
                c21391618na.LIZIZ.setImageBitmap(null);
                c21391618na.LIZIZ();
            }
            c21391318nXRemove.LJIIIZ = null;
            c21391318nXRemove.LIZJ = null;
            c21391318nXRemove.LIZLLL = null;
            c21391318nXRemove.LIZ();
            Bitmap bitmap = c21391318nXRemove.LIZ;
            if (bitmap != null && (!bitmap.isRecycled())) {
                c21391318nXRemove.LIZ = null;
                C786410Ut5.LJJZZIII(C21391318nX.LJIIJJI, new ARunnableS102S0100000_2(c21391318nXRemove, bitmap, 3));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:5:0x0013, B:7:0x002d, B:8:0x0030, B:9:0x0039, B:11:0x0051, B:17:0x005d, B:19:0x0063, B:29:0x0076, B:30:0x007b, B:32:0x007f, B:33:0x0083, B:35:0x008b, B:37:0x0091, B:39:0x0097, B:40:0x009b, B:42:0x009f, B:48:0x00aa, B:49:0x00ae), top: B:68:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[Catch: all -> 0x00b7, TryCatch #0 {all -> 0x00b7, blocks: (B:5:0x0013, B:7:0x002d, B:8:0x0030, B:9:0x0039, B:11:0x0051, B:17:0x005d, B:19:0x0063, B:29:0x0076, B:30:0x007b, B:32:0x007f, B:33:0x0083, B:35:0x008b, B:37:0x0091, B:39:0x0097, B:40:0x009b, B:42:0x009f, B:48:0x00aa, B:49:0x00ae), top: B:68:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(X.C427660Gpo r9, android.view.View r10, android.view.View r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21391218nW.LIZ(X.0Gpo, android.view.View, android.view.View, java.lang.String):java.lang.String");
    }
}
