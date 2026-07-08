package X;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.115V, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C115V extends C2217421BqW implements Function1<Function0<? extends Unit>, Unit> {
    public C115V(Object obj) {
        super(1, obj, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Function0<? extends Unit> function0) {
        ((AndroidComposeView) this.receiver).LJJI(function0);
        return Unit.LIZ;
    }
}
