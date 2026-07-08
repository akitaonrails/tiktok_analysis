package X;

/* JADX INFO: renamed from: X.19JE, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public enum C19JE {
    TRANSLATE("translate", "translation", "point"),
    TRANSLATE_X("translateX", "translationX", "float"),
    TRANSLATE_Y("translateY", "translationY", "float"),
    ROTATE_X("rotateX", "rotationX", "float"),
    ROTATE_Y("rotateY", "rotationY", "float"),
    ROTATE_Z("rotateZ", "rotation", "float"),
    SCALE("scale", "scale", "point"),
    SCALE_X("scaleX", "scaleX", "float"),
    SCALE_Y("scaleY", "scaleY", "float"),
    ALPHA("opacity", "alpha", "float"),
    BACKGROUND_COLOR("backgroundColor", "backgroundColor", "int"),
    BORDER_RADIUS("borderRadius", "borderRadius", "float"),
    RIPPLE("ripple", "ripple", "float"),
    SHINE("shine", "shine", "float");

    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public String nameValue() {
        return this.LL;
    }

    public String propertyValue() {
        return this.LLILLJJLI;
    }

    public String typeValue() {
        return this.LLILLL;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C19JE fromName(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1721943862:
                if (str.equals("translateX")) {
                    return TRANSLATE_X;
                }
                break;
            case -1721943861:
                if (str.equals("translateY")) {
                    return TRANSLATE_Y;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    return ALPHA;
                }
                break;
            case -930826704:
                if (str.equals("ripple")) {
                    return RIPPLE;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    return SCALE_X;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    return SCALE_Y;
                }
                break;
            case 109250890:
                if (str.equals("scale")) {
                    return SCALE;
                }
                break;
            case 1052832078:
                if (str.equals("translate")) {
                    return TRANSLATE;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    return BACKGROUND_COLOR;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    return BORDER_RADIUS;
                }
                break;
            case 1384173149:
                if (str.equals("rotateX")) {
                    return ROTATE_X;
                }
                break;
            case 1384173150:
                if (str.equals("rotateY")) {
                    return ROTATE_Y;
                }
                break;
            case 1384173151:
                if (str.equals("rotateZ")) {
                    return ROTATE_Z;
                }
                break;
        }
        return TRANSLATE_X;
    }

    public static C19JE valueOf(String str) {
        return (C19JE) C08FF.LIZ(C19JE.class, str);
    }

    C19JE(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
