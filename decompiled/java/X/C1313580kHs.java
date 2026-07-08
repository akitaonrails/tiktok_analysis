package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0kHs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1313580kHs {
    public float LIZ;
    public float LIZIZ;
    public final LinkedHashMap<String, Float> LIZJ;

    public final float LIZ() {
        Float f = this.LIZJ.get("rotate");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LIZIZ() {
        Float f = this.LIZJ.get("rotateX");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LIZJ() {
        Float f = this.LIZJ.get("rotateY");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LIZLLL() {
        Float f = this.LIZJ.get("scaleX");
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public final float LJ() {
        Float f = this.LIZJ.get("scaleY");
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public final float LJFF() {
        Float f = this.LIZJ.get("translateX");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LJI() {
        Float f = this.LIZJ.get("translateY");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public final float LJII() {
        Float f = this.LIZJ.get("translateZ");
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public C1313580kHs() {
        LinkedHashMap<String, Float> linkedHashMap = new LinkedHashMap<>();
        this.LIZJ = linkedHashMap;
        linkedHashMap.clear();
    }

    public static C1313580kHs LJIIIIZZ(List list, float f, float f2) {
        float f3;
        C1313580kHs c1313580kHs = new C1313580kHs();
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C1313650kHz c1313650kHz = (C1313650kHz) it2.next();
                int i = c1313650kHz.LIZ;
                boolean z = true;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            if (i != 8) {
                                if (i != 16) {
                                    if (i != 32) {
                                        if (i != 64) {
                                            if (i != 128) {
                                                if (i != 256) {
                                                    if (i != 512) {
                                                        if (i != 1024) {
                                                            if (i == 2048) {
                                                                c1313580kHs.LIZJ.put("scaleY", Float.valueOf(c1313650kHz.LIZIZ));
                                                            } else {
                                                                C1314420kJE.LIZIZ(null);
                                                                throw null;
                                                            }
                                                        } else {
                                                            c1313580kHs.LIZJ.put("scaleX", Float.valueOf(c1313650kHz.LIZIZ));
                                                        }
                                                    } else {
                                                        c1313580kHs.LIZJ.put("scaleX", Float.valueOf(c1313650kHz.LIZIZ));
                                                        c1313580kHs.LIZJ.put("scaleY", Float.valueOf(c1313650kHz.LIZLLL));
                                                    }
                                                }
                                            } else {
                                                c1313580kHs.LIZJ.put("rotateY", Float.valueOf(c1313650kHz.LIZIZ));
                                            }
                                        } else {
                                            c1313580kHs.LIZJ.put("rotateX", Float.valueOf(c1313650kHz.LIZIZ));
                                        }
                                    }
                                    c1313580kHs.LIZJ.put("rotate", Float.valueOf(c1313650kHz.LIZIZ));
                                }
                            } else {
                                c1313580kHs.LIZJ.put("translateZ", Float.valueOf(c1313650kHz.LIZIZ));
                            }
                        } else {
                            boolean zLIZIZ = c1313650kHz.LIZIZ();
                            float f4 = c1313650kHz.LIZIZ;
                            if (zLIZIZ) {
                                f4 *= f2;
                            }
                            c1313580kHs.LIZJ.put("translateY", Float.valueOf(f4));
                        }
                    } else {
                        boolean zLIZIZ2 = c1313650kHz.LIZIZ();
                        float f5 = c1313650kHz.LIZIZ;
                        if (zLIZIZ2) {
                            f5 *= f;
                        }
                        c1313580kHs.LIZJ.put("translateX", Float.valueOf(f5));
                    }
                }
                if (c1313650kHz.LIZIZ()) {
                    f3 = c1313650kHz.LIZIZ * f;
                } else {
                    f3 = c1313650kHz.LIZIZ;
                }
                c1313580kHs.LIZJ.put("translateX", Float.valueOf(f3));
                if (c1313650kHz.LJ != 1) {
                    z = false;
                }
                float f6 = c1313650kHz.LIZLLL;
                if (z) {
                    f6 *= f2;
                }
                c1313580kHs.LIZJ.put("translateY", Float.valueOf(f6));
                c1313580kHs.LIZJ.put("translateZ", Float.valueOf(c1313650kHz.LJFF));
            }
        }
        return c1313580kHs;
    }
}
