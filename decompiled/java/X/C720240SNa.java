package X;

import android.graphics.Rect;
import android.widget.ImageView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0SNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720240SNa extends C720260SNc {
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(334));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(335));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(333));
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;

    public C720240SNa() {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        this.LJI = iLIZIZ;
        this.LJII = iLIZIZ;
        this.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        this.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        this.LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    }

    public static ImageView.ScaleType LIZLLL(int i, int i2, int i3, int i4, int i5, float f) {
        if (i != 1) {
            if (i != 2) {
                return C720310SNh.LJFF(i5, i2, i3, i4);
            }
            if (f > 0.0f) {
                return ImageView.ScaleType.CENTER_CROP;
            }
            return C720310SNh.LJFF(i5, i2, i3, i4);
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public final Map<String, String> LJ(int i, int i2, int i3, int i4, int i5, int i6) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (i == 2) {
            linkedHashMap.put("container_view_type", "B");
            linkedHashMap.put("target_container_height", String.valueOf(i3 - this.LJII));
            linkedHashMap.put("target_container_width", String.valueOf(LIZIZ()));
        } else {
            linkedHashMap.put("container_view_type", "C");
            linkedHashMap.put("target_container_height", String.valueOf((i4 - this.LJIIIIZZ) - this.LJIIIZ));
            linkedHashMap.put("target_container_width", String.valueOf(LIZIZ()));
        }
        linkedHashMap.put("container_height", String.valueOf(i2));
        linkedHashMap.put("container_width", String.valueOf(LIZIZ()));
        linkedHashMap.put("video_container_height", String.valueOf(i5));
        linkedHashMap.put("video_container_width", String.valueOf(LIZIZ()));
        linkedHashMap.put("video_view_height", String.valueOf(i6));
        linkedHashMap.put("video_view_width", String.valueOf(LIZIZ()));
        return linkedHashMap;
    }

    public final int LJFF(float f, float f2, int i, int i2, int i3, int i4) {
        float f3 = f + i;
        float f4 = i3;
        if (f3 <= f4) {
            return 3;
        }
        if (f3 > f4 && f3 < i2 && f3 < i2 - this.LJIIJ && i4 > 0 && i + i4 <= i3 && f2 / i4 < 1.3f) {
            return 3;
        }
        return 2;
    }

    public static Rect LIZJ(int i, int i2, int i3, float f, float f2, int i4, int i5, ImageView.ScaleType scaleType) {
        int i6;
        int i7;
        float f3;
        if (i != 1) {
            if (i != 2) {
                if (scaleType != ImageView.ScaleType.CENTER_CROP && f2 >= 0.0f) {
                    i7 = i3 + i5 + i4;
                    f3 = i7 - f2;
                } else {
                    i6 = i3 + i5 + i4;
                }
            } else if (scaleType != ImageView.ScaleType.CENTER_CROP && f2 >= 0.0f) {
                if (scaleType == ImageView.ScaleType.FIT_START) {
                    f3 = f + i5;
                } else {
                    i7 = i3 + i5;
                    f3 = i7 - f2;
                }
            } else {
                i6 = i3 + i5;
            }
            i6 = (int) f3;
        } else {
            i6 = i3;
        }
        if (i != 1) {
            if (i != 2) {
                if (scaleType != ImageView.ScaleType.CENTER_CROP && f2 >= 0.0f) {
                    return new Rect(0, (int) (i5 + i4 + f2), i2, i6);
                }
                return new Rect(0, i5 + i4, i2, i6);
            }
            if (scaleType != ImageView.ScaleType.CENTER_CROP && scaleType != ImageView.ScaleType.FIT_START && f2 >= 0.0f) {
                return new Rect(0, (int) (i5 + f2), i2, i6);
            }
            return new Rect(0, i5, i2, i6);
        }
        return new Rect(0, 0, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0265 A[PHI: r9
      0x0265: PHI (r9v21 int) = (r9v3 int), (r9v3 int), (r9v23 int) binds: [B:39:0x011b, B:41:0x0121, B:37:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[PHI: r9
      0x0118: PHI (r9v3 int) = (r9v2 int), (r9v22 int), (r9v23 int) binds: [B:33:0x010f, B:35:0x0112, B:37:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0225 A[PHI: r11
      0x0225: PHI (r11v10 int) = (r11v8 int), (r11v19 int) binds: [B:91:0x0224, B:64:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C720260SNc, X.InterfaceC720270SNd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0SL3 LIZ(com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo r73, int r74, int r75, int r76, int r77, int r78, int r79, boolean r80, X.C0SN0 r81) {
        /*
            Method dump skipped, instruction units count: 1293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C720240SNa.LIZ(com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo, int, int, int, int, int, int, boolean, X.0SN0):X.0SL3");
    }
}
