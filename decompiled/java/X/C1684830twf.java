package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.DetectRange;

/* JADX INFO: renamed from: X.0twf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684830twf {
    public static final C0F28 LIZIZ(DetectRange detectRange) {
        return new C0F28(detectRange.min, detectRange.max);
    }

    public static final int LIZ(float f, C0F28 c0f28) {
        if (f < ((Number) c0f28.getStart()).floatValue()) {
            return -1;
        }
        if (f <= ((Number) c0f28.LJFF()).floatValue()) {
            return 0;
        }
        return 1;
    }
}
