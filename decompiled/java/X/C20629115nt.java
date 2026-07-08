package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15nt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20629115nt extends C09AY implements Function0<Integer> {
    public final /* synthetic */ AbstractC20628015ni LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20629115nt(AbstractC20628015ni abstractC20628015ni) {
        super(0);
        this.LL = abstractC20628015ni;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.LL.getThemeConfig().LIZIZ);
    }
}
