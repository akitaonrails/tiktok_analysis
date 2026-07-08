package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yYX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1862070yYX extends C2217421BqW implements Function0<Unit> {
    public C1862070yYX(C1862130yYd c1862130yYd) {
        super(0, c1862130yYd, C1862130yYd.class, "onEventStartStream", "onEventStartStream()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.receiver.getClass();
        C1862180yYi c1862180yYi = C1862130yYd.LJFF;
        if (c1862180yYi.LIZIZ != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1862180yYi.LIZJ = jCurrentTimeMillis;
            c1862180yYi.LIZ(Long.valueOf(jCurrentTimeMillis - c1862180yYi.LIZIZ), "pre_request_client_cost");
        }
        return Unit.LIZ;
    }
}
