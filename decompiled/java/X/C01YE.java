package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01YE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.plugin.micemoji.MultiGuestMicSeatEmojiPlayer$addEmojiToMicSeat$1$playNext$2", f = "MultiGuestMicSeatEmojiPlayer.kt", l = {104}, m = "invokeSuspend")
public final class C01YE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C942410adD LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01YE(long j, long j2, C942410adD c942410adD, InterfaceC1364105Vn<? super C01YE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = c942410adD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01YE(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiGuestMicSeatEmojiPlayer@e495.addEmojiToMicSeat$1$playNext$2");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("MultiGuestMicSeatEmojiPlayer@e495.addEmojiToMicSeat$1$playNext$2");
                return objLJFF;
            }
        }
        long j2 = this.LLILLL;
        C942410adD c942410adD = this.LLILZ;
        if (j2 == c942410adD.LJIIIZ) {
            c942410adD.LIZLLL(true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiGuestMicSeatEmojiPlayer@e495.addEmojiToMicSeat$1$playNext$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
