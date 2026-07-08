package X;

import defpackage.g9;

/* JADX INFO: renamed from: X.10MR, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10MR extends C10QI {
    public C10MR() {
        this(false);
    }

    public static final String LJFF() {
        C10MT.LIZ.getClass();
        if (((Boolean) C10MT.LIZIZ.getValue()).booleanValue()) {
            return "revamp";
        }
        C10MU.LIZ.getClass();
        if (((Number) C10MU.LIZIZ.getValue()).intValue() > 0) {
            return "revamp";
        }
        C1911490zqF.LIZ.getClass();
        if (C1911490zqF.LIZ()) {
            return "revamp";
        }
        C10MS.LIZ.getClass();
        return !C10MS.LIZ() ? "online" : "revamp";
    }

    public C10MR(boolean z) {
        super(g9.STRATEGY_SCENE_SLOGAN_PAGE, z);
    }
}
