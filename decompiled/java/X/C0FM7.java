package X;

/* JADX INFO: renamed from: X.0FM7, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FM7 {
    public static final boolean LIZ() {
        return !(LIZIZ(null) == 0.0f);
    }

    public static final float LIZIZ(Float f) {
        float fFloatValue;
        float fFloatValue2;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        if (fFloatValue > 0.0f) {
            if (f != null) {
                fFloatValue2 = f.floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
            return Math.min(fFloatValue2, C0C64.LJIILLIIL().LJIILL(31744, "studio_text_sticker_min_font_size_sp", true, 0.0f));
        }
        return C0C64.LJIILLIIL().LJIILL(31744, "studio_text_sticker_min_font_size_sp", true, 0.0f);
    }
}
