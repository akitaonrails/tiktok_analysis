package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zKX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C1891830zKX extends C2217421BqW implements Function1<Long, Unit> {
    public C1891830zKX(InterfaceC730350Skr interfaceC730350Skr) {
        super(1, interfaceC730350Skr, C1891820zKW.class, "loadMore", "loadMore(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        ((C1891820zKW) this.receiver).LIZ(l.longValue());
        return Unit.LIZ;
    }
}
