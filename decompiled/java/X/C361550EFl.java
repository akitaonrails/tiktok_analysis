package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C361550EFl extends C2217421BqW implements Function1<Integer, Unit> {
    public C361550EFl(C361590EFp c361590EFp) {
        super(1, c361590EFp, C361590EFp.class, "onFadeInSliderChanging", "onFadeInSliderChanging(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C361590EFp) this.receiver).T4(num.intValue());
        return Unit.LIZ;
    }
}
