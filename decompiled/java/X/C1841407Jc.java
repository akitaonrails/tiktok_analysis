package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Jc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1841407Jc extends C09AY implements Function0<Float> {
    public C1841407Jc() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "feed_viewpager_scroll_page_offset_opt", true);
        return Float.valueOf(iLJIJ == 1 ? 0.05f : iLJIJ == 2 ? 0.1f : iLJIJ == 3 ? 0.15f : iLJIJ == 4 ? 0.2f : 0.0f);
    }
}
