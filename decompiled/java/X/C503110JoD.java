package X;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JoD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503110JoD extends C09AY implements Function0<C503120JoE> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C503110JoD(View view) {
        super(0);
        this.LL = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C503120JoE invoke() {
        return new C503120JoE(this.LL);
    }
}
