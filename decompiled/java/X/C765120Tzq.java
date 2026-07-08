package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tzq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeQueueMessageActionHandler$onQueueOpen$1", f = "KaraokeQueueMessageActionHandler.kt", l = {207}, m = "invokeSuspend")
public final class C765120Tzq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C765260U0e LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765120Tzq(C765260U0e c765260U0e, InterfaceC1364105Vn<? super C765120Tzq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c765260U0e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C765120Tzq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeQueueMessageActionHandler@e96f.onQueueOpen$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C765260U0e c765260U0e = this.LLILLJJLI;
            C097O c097o = c765260U0e.LIZ;
            C765110Tzp c765110Tzp = new C765110Tzp(c765260U0e.LJIIIZ.size(), Math.max(this.LLILLJJLI.LJIIIZ.size(), this.LLILLJJLI.LJI));
            this.LL = 1;
            if (c097o.LIZ(c765110Tzp, this) == objLJFF) {
                C1C7U.LIZIZ("KaraokeQueueMessageActionHandler@e96f.onQueueOpen$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LJIIIZ.clear();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KaraokeQueueMessageActionHandler@e96f.onQueueOpen$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
