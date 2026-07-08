package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14gc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20329214gc extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C20398214rk LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20329214gc(C20398214rk c20398214rk) {
        super(1);
        this.LL = c20398214rk;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C20398214rk c20398214rk = this.LL;
        if (!zBooleanValue) {
            C500260Jjc.LJLJLJ((View) c20398214rk.LLJJIJIL.getValue(), false);
        } else {
            C500260Jjc.LJLJLJ((View) c20398214rk.LLJJIJIL.getValue(), true);
        }
        return Unit.LIZ;
    }
}
