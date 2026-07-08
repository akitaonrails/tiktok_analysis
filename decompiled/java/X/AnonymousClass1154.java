package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1154, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class AnonymousClass1154 extends C2217421BqW implements Function1<Pair<? extends Integer, ? extends String>, Unit> {
    public AnonymousClass1154(C194431114z c194431114z) {
        super(1, c194431114z, C194431114z.class, "setCurrentTab", "setCurrentTab(Lkotlin/Pair;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Integer, ? extends String> pair) {
        ((C194431114z) this.receiver).LLJZIJLIL = pair;
        return Unit.LIZ;
    }
}
