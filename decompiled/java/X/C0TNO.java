package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TNO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TNO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1233330iCR LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TNO(C1233330iCR c1233330iCR, long j, C013C c013c, boolean z) {
        super(0);
        this.LL = c1233330iCR;
        this.LLILLJJLI = j;
        this.LLILLL = c013c;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZIZ(this.LLILLJJLI, "video_views_banner_show", this.LLILLL.element, this.LLILZ);
        return Unit.LIZ;
    }
}
