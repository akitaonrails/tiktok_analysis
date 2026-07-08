package X;

/* JADX INFO: renamed from: X.1Doh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2267251Doh {
    LEFT_TO_LEFT,
    LEFT_TO_RIGHT,
    RIGHT_TO_LEFT,
    RIGHT_TO_RIGHT,
    START_TO_START,
    START_TO_END,
    END_TO_START,
    END_TO_END,
    TOP_TO_TOP,
    TOP_TO_BOTTOM,
    BOTTOM_TO_TOP,
    BOTTOM_TO_BOTTOM,
    BASELINE_TO_BASELINE,
    BASELINE_TO_TOP,
    BASELINE_TO_BOTTOM,
    CENTER_HORIZONTALLY,
    CENTER_VERTICALLY,
    CIRCULAR_CONSTRAINT;

    public static EnumC2267251Doh valueOf(String str) {
        return (EnumC2267251Doh) C08FF.LIZ(EnumC2267251Doh.class, str);
    }
}
