package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949670aov extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C949690aox LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C949670aov(C949690aox c949690aox) {
        super(1);
        this.LL = c949690aox;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        this.LL.LL.ab();
        C978360bZC.LJIJ("playbook_original", "create_entrance", null, "create", false, null, null);
        return Unit.LIZ;
    }
}
