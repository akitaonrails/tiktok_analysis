package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yfm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1866560yfm extends C09AY implements Function0<Float> {
    public C1866560yfm() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_viewpager_scroll_fling_velocity", true);
        return Float.valueOf(iLJIJ == 1 ? 0.95f : iLJIJ == 2 ? 0.9f : iLJIJ == 3 ? 0.85f : iLJIJ == 4 ? 0.8f : iLJIJ == 5 ? 0.75f : iLJIJ == 6 ? 0.7f : 1.0f);
    }
}
