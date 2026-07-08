package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C361560EFm extends C2217421BqW implements Function1<Integer, Unit> {
    public C361560EFm(C361590EFp c361590EFp) {
        super(1, c361590EFp, C361590EFp.class, "onFadeOutSliderChanging", "onFadeOutSliderChanging(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C361590EFp) this.receiver).d5(num.intValue());
        return Unit.LIZ;
    }
}
