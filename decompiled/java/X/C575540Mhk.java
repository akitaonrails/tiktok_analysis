package X;

import com.ss.ugc.aweme.creation.base.PointLengthInfo;

/* JADX INFO: renamed from: X.0Mhk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C575540Mhk {
    public static float LIZIZ(PointLengthInfo pointLengthInfo, int i) {
        if (pointLengthInfo == null) {
            return 0.0f;
        }
        if (pointLengthInfo.getType() == EnumC575380MhU.PointLengthType_ABSOLUTE) {
            return pointLengthInfo.getValue() / i;
        }
        return pointLengthInfo.getValue();
    }

    public static final float LIZ(PointLengthInfo pointLengthInfo, int i, float f) {
        if (pointLengthInfo == null) {
            return f;
        }
        if (pointLengthInfo.getType() == EnumC575380MhU.PointLengthType_ABSOLUTE) {
            return pointLengthInfo.getValue();
        }
        return pointLengthInfo.getValue() * i;
    }
}
