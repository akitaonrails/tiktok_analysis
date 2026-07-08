package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1862120yYc extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1862120yYc(C1862130yYd c1862130yYd) {
        super(1, c1862130yYd, C1862130yYd.class, "onUpdateDeepThink", "onUpdateDeepThink(Ljava/lang/Boolean;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        this.receiver.getClass();
        C1862170yYh c1862170yYh = C1862130yYd.LJI;
        c1862170yYh.getClass();
        if (bool2 != null) {
            c1862170yYh.LIZ(Integer.valueOf(bool2.booleanValue() ? 1 : 0), "is_deep_think");
        }
        return Unit.LIZ;
    }
}
