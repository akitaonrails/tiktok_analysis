package X;

import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0t6C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1652300t6C extends C2217421BqW implements Function0<Unit> {
    public C1652300t6C(C1652290t6B c1652290t6B) {
        super(0, c1652290t6B, C1652290t6B.class, "showLoading", "showLoading()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1652290t6B c1652290t6B = (C1652290t6B) this.receiver;
        ((Handler) c1652290t6B.LLJJIJI.getValue()).postDelayed((Runnable) c1652290t6B.LLJJIJIL.getValue(), 300L);
        return Unit.LIZ;
    }
}
