package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.camerabtn.DefaultCameraAndAlbumButtonAbility$getAlbumBtnState$1", f = "CameraInputVM.kt", l = {89}, m = "invokeSuspend")
public final class C456650HvT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C456720Hva LLILLJJLI;
    public final /* synthetic */ InterfaceC332260D0u<C433880Gzq> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456650HvT(C456720Hva c456720Hva, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC332260D0u interfaceC332260D0u) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c456720Hva;
        this.LLILLL = interfaceC332260D0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C456650HvT(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252321DDq c2252321DDqLIZ;
        C1C7U.LIZ("DefaultCameraAndAlbumButtonAbility@4f12.getAlbumBtnState$1");
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
            C05YD<C0IBF> c05ydJw2 = this.LLILLJJLI.LIZIZ.Jw2();
            InterfaceC346201Wa interfaceC346201Wa = (InterfaceC346201Wa) this.LLILLJJLI.LJII.getValue();
            C0HV6 c0hv6 = this.LLILLJJLI.LIZLLL;
            if (c0hv6 == null || (c2252321DDqLIZ = c0hv6.LJFF()) == null) {
                c2252321DDqLIZ = C1BNE.LIZ(false);
            }
            C515901zh c515901zhLJIIIIZZ = C09IC.LJIIIIZZ(c05ydJw2, interfaceC346201Wa, c2252321DDqLIZ, new C456640HvS(this.LLILLJJLI, null, this.LLILLL));
            this.LL = 1;
            if (C09IC.LJI(c515901zhLJIIIIZZ, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultCameraAndAlbumButtonAbility@4f12.getAlbumBtnState$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultCameraAndAlbumButtonAbility@4f12.getAlbumBtnState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
