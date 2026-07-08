package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12S5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C12S5 extends C2217421BqW implements Function1<Integer, Unit> {
    public C12S5(C19756812Rq c19756812Rq) {
        super(1, c19756812Rq, C19756812Rq.class, "onMusicProgressBarSeek", "onMusicProgressBarSeek(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C19756812Rq) this.receiver).S5(num.intValue());
        return Unit.LIZ;
    }
}
