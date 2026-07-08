package X;

import Y.AgS284S0100000_3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import wuk.f;

/* JADX INFO: renamed from: X.091u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerRepository$observePanelFlow$1$1$1", f = "DefaultStickerRepository.kt", l = {229}, m = "invokeSuspend")
public final class C23060091u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ f LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23060091u(f fVar, InterfaceC1364105Vn<? super C23060091u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23060091u(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerRepository@bad7.observePanelFlow$1$1$1");
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
            InterfaceC332260D0u interfaceC332260D0u = C1633270sbV.LIZIZ.LIZ.LJIIJJI;
            AgS284S0100000_3 agS284S0100000_3 = new AgS284S0100000_3(this.LLILLJJLI, 35);
            this.LL = 1;
            if (interfaceC332260D0u.collect(agS284S0100000_3, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultStickerRepository@bad7.observePanelFlow$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerRepository@bad7.observePanelFlow$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
