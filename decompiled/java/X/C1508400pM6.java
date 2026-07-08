package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pM6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.video.PdpHeaderPlayerController$setSurface$1", f = "PdpHeaderPlayerController.kt", l = {555}, m = "invokeSuspend")
public final class C1508400pM6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1508390pM5 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508400pM6(C1508390pM5 c1508390pM5, InterfaceC1364105Vn<? super C1508400pM6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1508390pM5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1508400pM6(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpHeaderPlayerController@2aea.setSurface$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("PdpHeaderPlayerController@2aea.setSurface$1");
                return objLJFF;
            }
        }
        C1508390pM5 c1508390pM5 = this.LLILLJJLI;
        if (c1508390pM5.LJIILLIIL == EnumC1508950pMz.PLAYER_IDLE) {
            c1508390pM5.LJIIJJI();
            this.LLILLJJLI.mute();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpHeaderPlayerController@2aea.setSurface$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
