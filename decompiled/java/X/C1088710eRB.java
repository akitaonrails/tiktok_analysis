package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eRB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1088710eRB extends C2217421BqW implements Function0<Unit> {
    public C1088710eRB(C1088730eRD c1088730eRD) {
        super(0, c1088730eRD, C1088730eRD.class, "dismissEffect", "dismissEffect()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1088730eRD c1088730eRD = (C1088730eRD) this.receiver;
        C1088660eR6 c1088660eR6 = c1088730eRD.LJ;
        if (c1088660eR6 != null) {
            c1088660eR6.LIZ(true);
        }
        c1088730eRD.LJ = null;
        return Unit.LIZ;
    }
}
