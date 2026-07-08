package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1862190yYj extends C2217421BqW implements Function0<Unit> {
    public C1862190yYj(C1862130yYd c1862130yYd) {
        super(0, c1862130yYd, C1862130yYd.class, "onEventFirstAckReceived", "onEventFirstAckReceived()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.receiver.getClass();
        C1862180yYi c1862180yYi = C1862130yYd.LJFF;
        if (c1862180yYi.LIZIZ != -1 && c1862180yYi.LJII == null) {
            Long lValueOf = Long.valueOf(System.currentTimeMillis() - c1862180yYi.LIZJ);
            c1862180yYi.LJII = lValueOf;
            c1862180yYi.LIZ(Long.valueOf(lValueOf != null ? lValueOf.longValue() : 0L), "first_chunk_cost");
        }
        return Unit.LIZ;
    }
}
