package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.experiment.PhotoModeFullBitmapModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0SNh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720310SNh {
    public static Bitmap LIZ;
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2133));
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final Map<String, Float> LJ;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        LIZJ = C452501pT.LIZ(enumC452301pR, AFwS190S0000000_4.get$arr$(2134));
        LIZLLL = C452501pT.LIZ(enumC452301pR, AFwS190S0000000_4.get$arr$(2135));
        LJ = new LinkedHashMap();
    }

    public static int LJ() {
        return ((Number) LIZJ.getValue()).intValue();
    }

    public static float LJI(double d) {
        return ((int) Math.rint(d * ((double) 100))) / 100;
    }

    public static void LJII(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            if ((((PhotoModeFullBitmapModel) C720320SNi.LIZIZ.getValue()).f65switch & 1) != 1) {
                bitmap = Bitmap.createBitmap(bitmap);
            }
        } else {
            bitmap = null;
        }
        LIZ = bitmap;
    }

    public static float LIZ(Integer num, Integer num2) {
        int iIntValue;
        int iIntValue2 = 1;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        if (num2 != null && num2.intValue() != 0) {
            iIntValue2 = num2.intValue();
        }
        return LJI(((double) iIntValue) / ((double) iIntValue2));
    }

    public static ImageView.ScaleType LIZIZ(float f, EnumC308670C8b enumC308670C8b) {
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJLJLLL()) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (enumC308670C8b == EnumC308670C8b.CASE_C) {
            if (f < 0.75f) {
                return ImageView.ScaleType.CENTER_CROP;
            }
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (f <= ((Number) C310590CFl.LIZJ.getValue()).floatValue()) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        return ImageView.ScaleType.FIT_CENTER;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[PHI: r1
      0x0029: PHI (r1v4 int) = (r1v2 int), (r1v5 int) binds: [B:14:0x0027, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r2, boolean r3) {
        /*
            if (r2 == 0) goto L70
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r1 = r2.getPhotoModeImageInfo()
            if (r1 == 0) goto L70
            if (r3 == 0) goto L61
            X.01GW r0 = X.C1107904Uz.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L61
            X.C720360SNm.LIZLLL(r1)
            com.ss.android.ugc.aweme.feed.model.PhotoModeImage r0 = r1.getMinImage()
        L1f:
            r3 = 1
            if (r0 == 0) goto L26
            int r1 = r0.width
            if (r1 >= r3) goto L29
        L26:
            r1 = 1
            if (r0 == 0) goto L2e
        L29:
            int r0 = r0.height
            if (r0 < r3) goto L2e
            r3 = r0
        L2e:
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            int r2 = X.C12ES.LJIIJ(r0)
            int r2 = r2 * r3
            int r2 = r2 / r1
        L3d:
            int r0 = LJ()
            if (r2 <= r0) goto L48
            int r2 = LJ()
        L47:
            return r2
        L48:
            X.01GW r1 = X.C720310SNh.LIZLLL
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r2 >= r0) goto L47
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            return r2
        L61:
            java.util.List r0 = r1.getPhotoModeImageList()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.feed.model.PhotoModeImage r0 = (com.ss.android.ugc.aweme.feed.model.PhotoModeImage) r0
            goto L1f
        L6e:
            r0 = 0
            goto L1f
        L70:
            int r2 = LJ()
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C720310SNh.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme, boolean):int");
    }

    public static ImageView.ScaleType LJFF(int i, int i2, int i3, int i4) {
        float fLIZ = LIZ(Integer.valueOf(i4), Integer.valueOf(i));
        float fLIZ2 = LIZ(Integer.valueOf(i3), Integer.valueOf(i2));
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJLJLLL()) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (fLIZ2 <= fLIZ) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        return ImageView.ScaleType.FIT_CENTER;
    }

    public static float LIZJ(ImageView.ScaleType scaleType, EnumC308670C8b enumC308670C8b, int i, Aweme aweme, int i2) {
        String aid;
        float fFloatValue = 1.0f;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            EnumC308670C8b enumC308670C8b2 = EnumC308670C8b.CASE_C;
            if (enumC308670C8b != enumC308670C8b2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(aid);
                sbLIZ.append('_');
                sbLIZ.append(i2);
                aid = C2188811AlT.LIZIZ(sbLIZ);
            }
            Map<String, Float> map = LJ;
            if (map.containsKey(aid)) {
                Float f = (Float) ((LinkedHashMap) map).get(aid);
                if (f == null) {
                    return 1.0f;
                }
                return f.floatValue();
            }
            if (i == 0) {
                i = 1;
            }
            if (enumC308670C8b == enumC308670C8b2) {
                fFloatValue = ((Number) LIZIZ.getValue()).floatValue() / i;
            } else if (scaleType == ImageView.ScaleType.FIT_CENTER) {
                fFloatValue = 0.83f;
            }
            if (!Float.isNaN(fFloatValue)) {
                map.put(aid, Float.valueOf(fFloatValue));
            }
        }
        return fFloatValue;
    }
}
