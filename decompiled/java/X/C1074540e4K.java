package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0e4K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1074540e4K extends C2217421BqW implements Function0<Unit> {
    public C1074540e4K(Object obj) {
        super(0, obj, C1074580e4O.class, "onLoading", "onLoading()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C481090Itn c481090Itn;
        C1074580e4O c1074580e4O = (C1074580e4O) this.receiver;
        C1749280vcc c1749280vcc = c1074580e4O.LLILZ;
        if (c1749280vcc != null && (c481090Itn = c1074580e4O.LLILLL) != null) {
            if (c1749280vcc.getVisibility() == 0) {
                c1749280vcc.LJ();
            } else {
                c481090Itn.setRefreshing(true);
            }
        }
        return Unit.LIZ;
    }
}
