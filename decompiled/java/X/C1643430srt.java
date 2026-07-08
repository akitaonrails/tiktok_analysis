package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0srt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643430srt extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1643420srs LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1643430srt(int i, int i2, C1643420srs c1643420srs) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = c1643420srs;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = this.LL;
        if (i == 0) {
            if (this.LLILLJJLI == 0) {
                this.LLILLL.LL.setValue(Boolean.TRUE);
                this.LLILLL.getClass();
                C201955140j.LIZIZ("DiyProp", "EffectChangedObserver#onMessageReceived effectChanged: true");
            }
        } else if (i == 1 && this.LLILLJJLI == 1) {
            this.LLILLL.LL.setValue(Boolean.FALSE);
            this.LLILLL.getClass();
            C201955140j.LIZIZ("DiyProp", "EffectChangedObserver#onMessageReceived effectChanged: false");
        }
        return Unit.LIZ;
    }
}
