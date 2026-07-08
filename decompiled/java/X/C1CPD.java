package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1CPD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public enum C1CPD {
    /* JADX INFO: Fake field, exist only in values array */
    svg,
    /* JADX INFO: Fake field, exist only in values array */
    circle,
    /* JADX INFO: Fake field, exist only in values array */
    clipPath,
    /* JADX INFO: Fake field, exist only in values array */
    defs,
    /* JADX INFO: Fake field, exist only in values array */
    ellipse,
    /* JADX INFO: Fake field, exist only in values array */
    g,
    /* JADX INFO: Fake field, exist only in values array */
    image,
    /* JADX INFO: Fake field, exist only in values array */
    line,
    /* JADX INFO: Fake field, exist only in values array */
    linearGradient,
    /* JADX INFO: Fake field, exist only in values array */
    path,
    /* JADX INFO: Fake field, exist only in values array */
    pattern,
    /* JADX INFO: Fake field, exist only in values array */
    polygon,
    /* JADX INFO: Fake field, exist only in values array */
    polyline,
    /* JADX INFO: Fake field, exist only in values array */
    radialGradient,
    /* JADX INFO: Fake field, exist only in values array */
    rect,
    /* JADX INFO: Fake field, exist only in values array */
    solidColor,
    /* JADX INFO: Fake field, exist only in values array */
    stop,
    /* JADX INFO: Fake field, exist only in values array */
    use,
    UNSUPPORTED;

    public static final Map<String, C1CPD> LLILLJJLI = new HashMap();

    static {
        for (C1CPD c1cpd : values()) {
            if (c1cpd != UNSUPPORTED) {
                ((HashMap) LLILLJJLI).put(c1cpd.name(), c1cpd);
            }
        }
    }

    public static C1CPD valueOf(String str) {
        return (C1CPD) C08FF.LIZ(C1CPD.class, str);
    }
}
