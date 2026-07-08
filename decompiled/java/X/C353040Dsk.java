package X;

import android.content.Context;
import com.bytedance.ies.cutsame.util.MediaUtil;
import com.bytedance.ies.nle.editor_jni.NLEPoint;
import com.bytedance.ies.nle.editor_jni.NLEStyClip;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.ss.android.ugc.cut_ui.ItemCrop;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dsk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C353040Dsk {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZLLL(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public static ItemCrop LIZ(NLEStyClip nLEStyClip) {
        return new ItemCrop((nLEStyClip.getLeftUpper().getX() * 0.5f) + 0.5f, ((-nLEStyClip.getLeftUpper().getY()) * 0.5f) + 0.5f, (nLEStyClip.getRightLower().getX() * 0.5f) + 0.5f, ((-nLEStyClip.getRightLower().getY()) * 0.5f) + 0.5f);
    }

    public static ItemCrop LIZJ(NLEStyCrop nLEStyCrop) {
        return new ItemCrop(nLEStyCrop.getXLeftUpper(), nLEStyCrop.getYLeftUpper(), nLEStyCrop.getXRightLower(), nLEStyCrop.getYRightLower());
    }

    public static NLEStyClip LJ(ItemCrop itemCrop) {
        NLEStyClip nLEStyClip = new NLEStyClip();
        NLEPoint nLEPoint = new NLEPoint();
        float f = 2;
        nLEPoint.setX((itemCrop.upperLeftX - 0.5f) * f);
        nLEPoint.setY((0.5f - itemCrop.upperLeftY) * f);
        nLEStyClip.setLeftUpper(nLEPoint);
        NLEPoint nLEPoint2 = new NLEPoint();
        nLEPoint2.setX((itemCrop.lowerRightX - 0.5f) * f);
        nLEPoint2.setY((0.5f - itemCrop.upperLeftY) * f);
        nLEStyClip.setRightUpper(nLEPoint2);
        NLEPoint nLEPoint3 = new NLEPoint();
        nLEPoint3.setX((itemCrop.upperLeftX - 0.5f) * f);
        nLEPoint3.setY((0.5f - itemCrop.lowerRightY) * f);
        nLEStyClip.setLeftLower(nLEPoint3);
        NLEPoint nLEPoint4 = new NLEPoint();
        nLEPoint4.setX((itemCrop.lowerRightX - 0.5f) * f);
        nLEPoint4.setY((0.5f - itemCrop.lowerRightY) * f);
        nLEStyClip.setRightLower(nLEPoint4);
        return nLEStyClip;
    }

    public static NLEStyCrop LJFF(ItemCrop itemCrop) {
        NLEStyCrop nLEStyCrop = new NLEStyCrop();
        nLEStyCrop.setXLeftUpper(itemCrop.upperLeftX);
        nLEStyCrop.setYLeftUpper(itemCrop.upperLeftY);
        nLEStyCrop.setXRightUpper(itemCrop.lowerRightX);
        nLEStyCrop.setYRightUpper(itemCrop.upperLeftY);
        nLEStyCrop.setXLeftLower(itemCrop.upperLeftX);
        nLEStyCrop.setYLeftLower(itemCrop.lowerRightY);
        nLEStyCrop.setXRightLower(itemCrop.lowerRightX);
        nLEStyCrop.setYRightLower(itemCrop.lowerRightY);
        return nLEStyCrop;
    }

    public static ItemCrop LIZIZ(Context context, ItemCrop itemCrop, String str, String str2, int i, int i2) {
        if (Intrinsics.LJFF("align_video", str) && itemCrop.upperLeftX == 0.0f && itemCrop.upperLeftY == 0.0f) {
            float fMax = 1.0f;
            if (itemCrop.lowerRightX == 1.0f && itemCrop.lowerRightY == 1.0f) {
                C539280LDa c539280LDaLIZ = MediaUtil.LIZ.LIZ(context, str2);
                int i3 = c539280LDaLIZ.LIZIZ;
                int i4 = c539280LDaLIZ.LIZJ;
                int i5 = c539280LDaLIZ.LIZLLL;
                if (i5 == 90 || i5 == 270) {
                    i4 = i3;
                    i3 = i4;
                }
                if (i3 > 0 && i4 > 0) {
                    fMax = Math.max(i / i3, i2 / i4);
                }
                float f = i3 * fMax;
                float f2 = i;
                float f3 = i4 * fMax;
                float f4 = i2;
                return new ItemCrop(LIZLLL((((int) (f - f2)) * 0.5f) / f), LIZLLL((((int) (f3 - f4)) * 0.5f) / f3), LIZLLL((((int) (f2 + f)) * 0.5f) / f), LIZLLL((((int) (f4 + f3)) * 0.5f) / f3));
            }
            return itemCrop;
        }
        return itemCrop;
    }
}
