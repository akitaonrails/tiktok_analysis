package X;

import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.vesdk.VESize;
import com.ss.ugc.aweme.creation.base.PointLengthInfo;
import com.ss.ugc.aweme.creation.base.StickerResModel;
import java.util.Locale;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Mhc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C575460Mhc implements InterfaceC575170Mh9<StickerResModel, C575270MhJ<?>> {
    public static int LIZ = 1;

    public static int LJI(String str) {
        boolean z;
        long jLongValue;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return -1;
        }
        try {
            if (str.charAt(0) == '#') {
                return Color.parseColor(str);
            }
            if (!u.LJJIIJZLJL(str.toLowerCase(Locale.ROOT), "0x", false)) {
                return -1;
            }
            Long lDecode = Long.decode(str);
            if (str.length() == 8) {
                jLongValue = lDecode.longValue() | 4278190080L;
            } else {
                jLongValue = lDecode.longValue();
            }
            return (int) jLongValue;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    public static float[] LIZIZ(PointLengthInfo[] pointLengthInfoArr, VESize vESize) {
        return new float[]{C575540Mhk.LIZ((PointLengthInfo) C13LQ.LJJIIZ(0, pointLengthInfoArr), vESize.width, 0.0f), C575540Mhk.LIZ((PointLengthInfo) C13LQ.LJJIIZ(1, pointLengthInfoArr), vESize.height, 0.0f)};
    }

    public static float[] LIZJ(PointLengthInfo[] pointLengthInfoArr, VESize vESize) {
        return new float[]{C575540Mhk.LIZIZ((PointLengthInfo) C13LQ.LJJIIZ(0, pointLengthInfoArr), vESize.width), C575540Mhk.LIZIZ((PointLengthInfo) C13LQ.LJJIIZ(1, pointLengthInfoArr), vESize.height)};
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0107 A[PHI: r66
      0x0107: PHI (r66v9 java.lang.String) = (r66v1 java.lang.String), (r66v10 java.lang.String) binds: [B:36:0x0105, B:34:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111 A[PHI: r66
      0x0111: PHI (r66v2 java.lang.String) = (r66v1 java.lang.String), (r66v9 java.lang.String), (r66v9 java.lang.String) binds: [B:36:0x0105, B:38:0x0109, B:40:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115 A[PHI: r66 r67
      0x0115: PHI (r66v8 java.lang.String) = (r66v2 java.lang.String), (r66v9 java.lang.String) binds: [B:42:0x0113, B:40:0x010f] A[DONT_GENERATE, DONT_INLINE]
      0x0115: PHI (r67v7 java.lang.String) = (r67v1 java.lang.String), (r67v8 java.lang.String) binds: [B:42:0x0113, B:40:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119 A[PHI: r66 r67
      0x0119: PHI (r66v7 java.lang.String) = (r66v2 java.lang.String), (r66v8 java.lang.String) binds: [B:42:0x0113, B:44:0x0117] A[DONT_GENERATE, DONT_INLINE]
      0x0119: PHI (r67v6 java.lang.String) = (r67v1 java.lang.String), (r67v7 java.lang.String) binds: [B:42:0x0113, B:44:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d A[PHI: r4 r66 r67
      0x011d: PHI (r4v16 java.lang.String) = (r4v24 java.lang.String), (r4v25 java.lang.String) binds: [B:46:0x011b, B:44:0x0117] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r66v3 java.lang.String) = (r66v7 java.lang.String), (r66v8 java.lang.String) binds: [B:46:0x011b, B:44:0x0117] A[DONT_GENERATE, DONT_INLINE]
      0x011d: PHI (r67v2 java.lang.String) = (r67v6 java.lang.String), (r67v7 java.lang.String) binds: [B:46:0x011b, B:44:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121 A[PHI: r4 r66 r67
      0x0121: PHI (r4v23 java.lang.String) = (r4v16 java.lang.String), (r4v24 java.lang.String) binds: [B:48:0x011f, B:46:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r66v6 java.lang.String) = (r66v3 java.lang.String), (r66v7 java.lang.String) binds: [B:48:0x011f, B:46:0x011b] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r67v5 java.lang.String) = (r67v2 java.lang.String), (r67v6 java.lang.String) binds: [B:48:0x011f, B:46:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125 A[PHI: r1 r4 r66 r67
      0x0125: PHI (r1v29 java.lang.String) = (r1v6 java.lang.String), (r1v30 java.lang.String) binds: [B:48:0x011f, B:50:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r4v22 java.lang.String) = (r4v16 java.lang.String), (r4v23 java.lang.String) binds: [B:48:0x011f, B:50:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r66v5 java.lang.String) = (r66v3 java.lang.String), (r66v6 java.lang.String) binds: [B:48:0x011f, B:50:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x0125: PHI (r67v4 java.lang.String) = (r67v2 java.lang.String), (r67v5 java.lang.String) binds: [B:48:0x011f, B:50:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0276  */
    @Override // X.InterfaceC575170Mh9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.Object r89, X.C569090MTr r90, X.C575700Mi0 r91) throws X.C0MTS {
        /*
            Method dump skipped, instruction units count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C575460Mhc.LIZ(java.lang.Object, X.0MTr, X.0Mi0):java.lang.Object");
    }

    public static final StickerItemModel LJ(String str, VESize vESize, int[] iArr, float[] fArr) {
        StickerItemModel stickerItemModel = new StickerItemModel();
        stickerItemModel.type = 11;
        stickerItemModel.path = str;
        stickerItemModel.startTime = 0;
        stickerItemModel.endTime = -2;
        stickerItemModel.normalizedWidth = (iArr[0] * 1.0f) / vESize.width;
        stickerItemModel.normalizedHeight = (iArr[1] * 1.0f) / vESize.height;
        stickerItemModel.currentOffsetX = fArr[0] + 0.5f;
        stickerItemModel.currentOffsetY = fArr[1] + 0.5f;
        return stickerItemModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.ss.ugc.aweme.creation.base.StickerResModel r18, com.ss.ugc.aweme.creation.base.ImageStickerExtraModel r19, X.C569090MTr r20, X.InterfaceC1364105Vn r21) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C575460Mhc.LIZLLL(com.ss.ugc.aweme.creation.base.StickerResModel, com.ss.ugc.aweme.creation.base.ImageStickerExtraModel, X.0MTr, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0MTp, X.0MTr] */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.0MTp] */
    /* JADX WARN: Type inference failed for: r12v2, types: [X.0MTp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(com.ss.ugc.aweme.creation.base.StickerResModel r10, com.ss.ugc.aweme.creation.base.EffectStickerExtraModel r11, X.C569090MTr r12, X.InterfaceC1364105Vn r13) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C575460Mhc.LJFF(com.ss.ugc.aweme.creation.base.StickerResModel, com.ss.ugc.aweme.creation.base.EffectStickerExtraModel, X.0MTr, X.05Vn):java.lang.Object");
    }
}
