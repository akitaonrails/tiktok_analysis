package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iMW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1239580iMW extends C2217421BqW implements Function1<String, Unit> {
    public C1239580iMW(C101N c101n) {
        super(1, c101n, C101N.class, "onLoginButtonClick", "onLoginButtonClick(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        C101N c101n = (C101N) this.receiver;
        c101n.LJFF(1, "log_in");
        C0XPD.LIZIZ(c101n.LIZ, "maturity_mask_layer", "click", null, new C1620940sHc(c101n, 0));
        return Unit.LIZ;
    }
}
