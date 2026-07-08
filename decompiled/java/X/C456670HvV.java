package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.camerabtn.DefaultCameraAndAlbumButtonAbility$getCameraBtnState$1", f = "CameraInputVM.kt", l = {134}, m = "invokeSuspend")
public final class C456670HvV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C456720Hva LLILLL;
    public final /* synthetic */ InterfaceC332260D0u<InterfaceC456750Hvd> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456670HvV(C456720Hva c456720Hva, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC332260D0u interfaceC332260D0u) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c456720Hva;
        this.LLILZ = interfaceC332260D0u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C456670HvV c456670HvV = new C456670HvV(this.LLILLL, interfaceC1364105Vn, this.LLILZ);
        c456670HvV.LLILLJJLI = obj;
        return c456670HvV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252321DDq c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2;
        InterfaceC456690HvX interfaceC456690HvX;
        C1C7U.LIZ("DefaultCameraAndAlbumButtonAbility@4f12.getCameraBtnState$1");
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
            Object obj2 = this.LLILLJJLI;
            C05YD<C0IBF> c05ydJw2 = this.LLILLL.LIZIZ.Jw2();
            InterfaceC346201Wa interfaceC346201Wa = (InterfaceC346201Wa) this.LLILLL.LJII.getValue();
            C0HV6 c0hv6 = this.LLILLL.LIZLLL;
            if (c0hv6 == null || (c2252321DDqLIZ = c0hv6.LJFF()) == null) {
                c2252321DDqLIZ = C1BNE.LIZ(false);
            }
            if (!this.LLILLL.LIZIZ.El2() || obj2 == null || (interfaceC456690HvX = this.LLILLL.LJ) == null || (c2252321DDqLIZ2 = interfaceC456690HvX.mk0()) == null) {
                c2252321DDqLIZ2 = C1BNE.LIZ(new C452480Hok(System.currentTimeMillis()));
            }
            C515901zh c515901zhLJIIIZ = C09IC.LJIIIZ(c05ydJw2, interfaceC346201Wa, c2252321DDqLIZ, c2252321DDqLIZ2, new C456710HvZ(this.LLILLL, null, this.LLILZ));
            this.LL = 1;
            if (C09IC.LJI(c515901zhLJIIIZ, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultCameraAndAlbumButtonAbility@4f12.getCameraBtnState$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultCameraAndAlbumButtonAbility@4f12.getCameraBtnState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
