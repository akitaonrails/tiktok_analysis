package X;

import Y.AgS299S0100000_18;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cnw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.slowmo.SlowMoStickerHandler$6", f = "SlowMoStickerHandler.kt", l = {259}, m = "invokeSuspend")
public final class C324580Cnw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1665030tQj LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324580Cnw(C1665030tQj c1665030tQj, InterfaceC1364105Vn<? super C324580Cnw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1665030tQj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324580Cnw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SlowMoStickerHandler@8ab3.<init>$6");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1665030tQj c1665030tQj = this.LLILLJJLI;
            C2252321DDq c2252321DDq = c1665030tQj.LLJI;
            AgS299S0100000_18 agS299S0100000_18 = new AgS299S0100000_18(c1665030tQj, 0);
            this.LL = 1;
            if (c2252321DDq.collect(agS299S0100000_18, this) == objLJFF) {
                C1C7U.LIZIZ("SlowMoStickerHandler@8ab3.<init>$6");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
