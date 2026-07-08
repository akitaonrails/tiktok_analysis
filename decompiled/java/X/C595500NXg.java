package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NXg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C595500NXg extends C09AY implements Function0<C0NXG> {
    public final /* synthetic */ C595510NXh LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595500NXg(C595510NXh c595510NXh) {
        super(0);
        this.LL = c595510NXh;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0NXG invoke() {
        C595680NXy c595680NXy = this.LL.LIZ;
        return new C0NXG(c595680NXy.LIZIZ, c595680NXy.LIZ.LJFF, c595680NXy);
    }
}
