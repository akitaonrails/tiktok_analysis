package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1364030lbF extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1364030lbF(Object obj) {
        super(1, obj, C1363950lb7.class, "onStreakBadgeViewVisibilityChanged", "onStreakBadgeViewVisibilityChanged(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C1363950lb7 c1363950lb7 = (C1363950lb7) this.receiver;
        if (zBooleanValue) {
            c1363950lb7.LLJ.setMaxLines(1);
            C786410Ut5.LLIL(c1363950lb7.LLJI, 8);
        } else {
            c1363950lb7.LLJ.setMaxLines(2);
        }
        return Unit.LIZ;
    }
}
