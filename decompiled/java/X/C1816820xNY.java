package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xNY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816820xNY extends C09AY implements Function2<Long, Throwable, Unit> {
    public final /* synthetic */ C1816900xNg LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816820xNY(C1816900xNg c1816900xNg) {
        super(2);
        this.LL = c1816900xNg;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Long l, Throwable th) {
        this.LL.LJIIJJI(l.longValue(), "overlay_image", th);
        return Unit.LIZ;
    }
}
