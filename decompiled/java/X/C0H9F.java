package X;

import com.bytedance.lighten.loader.SmartImageView;

/* JADX INFO: renamed from: X.0H9F, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H9F {
    public static final Float LIZ(SmartImageView smartImageView) {
        float[] fArr;
        Float fLJJ;
        C1331100kk8 c1331100kk8 = smartImageView.getHierarchy().LIZJ;
        if (c1331100kk8 == null || (fArr = c1331100kk8.LIZJ) == null || (fLJJ = C13LQ.LJJ(fArr)) == null) {
            return null;
        }
        float fFloatValue = fLJJ.floatValue();
        smartImageView.getHierarchy().LJJIII(null);
        smartImageView.getHierarchy().LJIJ(null, 1);
        smartImageView.setBackgroundColor(-16777216);
        smartImageView.setClipToOutline(true);
        smartImageView.setOutlineProvider(new C0IDA(fFloatValue, 7));
        return Float.valueOf(fFloatValue);
    }
}
