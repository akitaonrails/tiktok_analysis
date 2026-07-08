package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C364070EPd extends C2217421BqW implements Function1<String, Unit> {
    public C364070EPd(C364040EPa c364040EPa) {
        super(1, c364040EPa, C364040EPa.class, "onEffectSelected", "onEffectSelected(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        ((C364040EPa) this.receiver).d6(str);
        return Unit.LIZ;
    }
}
