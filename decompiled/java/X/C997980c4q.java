package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C997980c4q extends C2217421BqW implements Function0<Boolean> {
    public C997980c4q(C1630020sWG c1630020sWG) {
        super(0, c1630020sWG, C1630020sWG.class, "isScrolling", "isScrolling()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((C1630020sWG) this.receiver).LLLLLLLLLL().getScrollState() != 0);
    }
}
