package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0e4V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1074650e4V extends C2217421BqW implements Function0<Unit> {
    public C1074650e4V(Object obj) {
        super(0, obj, C1074610e4R.class, "onLoading", "onLoading()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1074610e4R c1074610e4R = (C1074610e4R) this.receiver;
        C1749280vcc c1749280vcc = c1074610e4R.LLILZIL;
        if (c1749280vcc != null) {
            if (c1749280vcc.getVisibility() == 0) {
                c1749280vcc.LJ();
            } else {
                C481090Itn c481090Itn = c1074610e4R.LLILZ;
                if (c481090Itn != null) {
                    c481090Itn.setRefreshing(true);
                }
            }
        }
        return Unit.LIZ;
    }
}
