package X;

import com.ss.android.ugc.gamora.recorder.greenscreen.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0t7A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1652900t7A extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1652900t7A(e0 e0Var) {
        super(1, e0Var, e0.class, "onPanelVisibilityChanged", "onPanelVisibilityChanged(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((e0) this.receiver).t5(bool.booleanValue());
        return Unit.LIZ;
    }
}
