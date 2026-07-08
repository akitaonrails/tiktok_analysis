package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12S4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C12S4 extends C2217421BqW implements Function1<Integer, Unit> {
    public C12S4(C19756712Rp c19756712Rp) {
        super(1, c19756712Rp, C19756712Rp.class, "onMusicProgressBarSeek", "onMusicProgressBarSeek(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C19756712Rp) this.receiver).d6(num.intValue());
        return Unit.LIZ;
    }
}
