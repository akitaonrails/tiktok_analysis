package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11xo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19671411xo extends C2217421BqW implements Function1<Boolean, Unit> {
    public C19671411xo(C12PJ c12pj) {
        super(1, c12pj, C12PJ.class, "playButtonClick", "playButtonClick(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((C12PJ) this.receiver).t5(bool.booleanValue());
        return Unit.LIZ;
    }
}
