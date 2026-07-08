package X;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* JADX INFO: renamed from: X.0GRf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415570GRf extends C415560GRe {
    @Override // X.C415560GRe
    public final int[] LIZ() {
        return new int[]{ColorProtector.parseColor("#00000000"), ColorProtector.parseColor("#80000000"), ColorProtector.parseColor("#B2000000"), ColorProtector.parseColor("#CC000000"), ColorProtector.parseColor("#E5000000")};
    }

    @Override // X.C415560GRe
    public final float[] LIZIZ() {
        return new float[]{0.0f, 0.17f, 0.3f, 0.42f, 0.73f};
    }

    public C415570GRf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
