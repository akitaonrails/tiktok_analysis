package X;

import androidx.activity.OnBackPressedDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1A5x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C2173871A5x extends C2217421BqW implements Function0<Unit> {
    public C2173871A5x(Object obj) {
        super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((OnBackPressedDispatcher) this.receiver).LJI();
        return Unit.LIZ;
    }
}
