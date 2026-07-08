package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.18yN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public enum EnumC21458518yN {
    /* JADX INFO: Fake field, exist only in values array */
    clip,
    /* JADX INFO: Fake field, exist only in values array */
    clip_path,
    /* JADX INFO: Fake field, exist only in values array */
    clipPathUnits,
    /* JADX INFO: Fake field, exist only in values array */
    clip_rule,
    /* JADX INFO: Fake field, exist only in values array */
    color,
    /* JADX INFO: Fake field, exist only in values array */
    cx,
    /* JADX INFO: Fake field, exist only in values array */
    cy,
    /* JADX INFO: Fake field, exist only in values array */
    direction,
    /* JADX INFO: Fake field, exist only in values array */
    dx,
    /* JADX INFO: Fake field, exist only in values array */
    dy,
    /* JADX INFO: Fake field, exist only in values array */
    fx,
    /* JADX INFO: Fake field, exist only in values array */
    fy,
    /* JADX INFO: Fake field, exist only in values array */
    d,
    /* JADX INFO: Fake field, exist only in values array */
    display,
    /* JADX INFO: Fake field, exist only in values array */
    fill,
    /* JADX INFO: Fake field, exist only in values array */
    fill_rule,
    /* JADX INFO: Fake field, exist only in values array */
    fill_opacity,
    /* JADX INFO: Fake field, exist only in values array */
    gradientTransform,
    /* JADX INFO: Fake field, exist only in values array */
    gradientUnits,
    /* JADX INFO: Fake field, exist only in values array */
    height,
    /* JADX INFO: Fake field, exist only in values array */
    href,
    /* JADX INFO: Fake field, exist only in values array */
    image_rendering,
    /* JADX INFO: Fake field, exist only in values array */
    offset,
    /* JADX INFO: Fake field, exist only in values array */
    opacity,
    /* JADX INFO: Fake field, exist only in values array */
    orient,
    /* JADX INFO: Fake field, exist only in values array */
    overflow,
    /* JADX INFO: Fake field, exist only in values array */
    pathLength,
    /* JADX INFO: Fake field, exist only in values array */
    patternContentUnits,
    /* JADX INFO: Fake field, exist only in values array */
    patternTransform,
    /* JADX INFO: Fake field, exist only in values array */
    patternUnits,
    points,
    /* JADX INFO: Fake field, exist only in values array */
    preserveAspectRatio,
    /* JADX INFO: Fake field, exist only in values array */
    r,
    /* JADX INFO: Fake field, exist only in values array */
    refX,
    /* JADX INFO: Fake field, exist only in values array */
    refY,
    /* JADX INFO: Fake field, exist only in values array */
    rx,
    /* JADX INFO: Fake field, exist only in values array */
    ry,
    /* JADX INFO: Fake field, exist only in values array */
    solid_color,
    /* JADX INFO: Fake field, exist only in values array */
    solid_opacity,
    /* JADX INFO: Fake field, exist only in values array */
    spreadMethod,
    /* JADX INFO: Fake field, exist only in values array */
    startOffset,
    /* JADX INFO: Fake field, exist only in values array */
    stop_color,
    /* JADX INFO: Fake field, exist only in values array */
    stop_opacity,
    /* JADX INFO: Fake field, exist only in values array */
    stroke,
    /* JADX INFO: Fake field, exist only in values array */
    stroke_dasharray,
    /* JADX INFO: Fake field, exist only in values array */
    stroke_dashoffset,
    /* JADX INFO: Fake field, exist only in values array */
    stroke_linecap,
    /* JADX INFO: Fake field, exist only in values array */
    stroke_linejoin,
    /* JADX INFO: Fake field, exist only in values array */
    stroke_miterlimit,
    /* JADX INFO: Fake field, exist only in values array */
    stroke_opacity,
    /* JADX INFO: Fake field, exist only in values array */
    stroke_width,
    /* JADX INFO: Fake field, exist only in values array */
    style,
    transform,
    /* JADX INFO: Fake field, exist only in values array */
    type,
    /* JADX INFO: Fake field, exist only in values array */
    vector_effect,
    /* JADX INFO: Fake field, exist only in values array */
    version,
    /* JADX INFO: Fake field, exist only in values array */
    viewBox,
    /* JADX INFO: Fake field, exist only in values array */
    width,
    /* JADX INFO: Fake field, exist only in values array */
    x,
    /* JADX INFO: Fake field, exist only in values array */
    y,
    /* JADX INFO: Fake field, exist only in values array */
    x1,
    /* JADX INFO: Fake field, exist only in values array */
    y1,
    /* JADX INFO: Fake field, exist only in values array */
    x2,
    /* JADX INFO: Fake field, exist only in values array */
    y2,
    /* JADX INFO: Fake field, exist only in values array */
    viewport_fill,
    /* JADX INFO: Fake field, exist only in values array */
    viewport_fill_opacity,
    /* JADX INFO: Fake field, exist only in values array */
    visibility,
    UNSUPPORTED;

    public static final Map<String, EnumC21458518yN> LLILZ = new HashMap();

    static {
        for (EnumC21458518yN enumC21458518yN : values()) {
            if (enumC21458518yN != UNSUPPORTED) {
                ((HashMap) LLILZ).put(enumC21458518yN.name().replace('_', '-'), enumC21458518yN);
            }
        }
    }

    public static EnumC21458518yN LIZJ(String str) {
        EnumC21458518yN enumC21458518yN = (EnumC21458518yN) ((HashMap) LLILZ).get(str);
        if (enumC21458518yN != null) {
            return enumC21458518yN;
        }
        return UNSUPPORTED;
    }

    public static EnumC21458518yN valueOf(String str) {
        return (EnumC21458518yN) C08FF.LIZ(EnumC21458518yN.class, str);
    }
}
