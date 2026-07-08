package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0HvS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatroom.input.components.camerabtn.DefaultCameraAndAlbumButtonAbility$getAlbumBtnState$1$1", f = "CameraInputVM.kt", l = {}, m = "invokeSuspend")
public final class C456640HvS extends C09AX implements InterfaceC1631630sYr<C0IBF, Boolean, Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ C0IBF LL;
    public /* synthetic */ boolean LLILLJJLI;
    public /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC332260D0u<C433880Gzq> LLILZ;
    public final /* synthetic */ C456720Hva LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456640HvS(C456720Hva c456720Hva, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC332260D0u interfaceC332260D0u) {
        super(4, interfaceC1364105Vn);
        this.LLILZ = interfaceC332260D0u;
        this.LLILZIL = c456720Hva;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C433880Gzq value;
        C433880Gzq c433880Gzq;
        boolean z;
        boolean z2;
        boolean z3;
        InterfaceC458280Hy6 interfaceC458280Hy6LJIILL;
        InterfaceC458280Hy6 interfaceC458280Hy6LJIILL2;
        C433880Gzq value2;
        C1C7U.LIZ("DefaultCameraAndAlbumButtonAbility@4f12.getAlbumBtnState$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0IBF c0ibf = this.LL;
        boolean z4 = this.LLILLJJLI;
        boolean z5 = this.LLILLL;
        if (C456660HvU.LIZ[c0ibf.ordinal()] == 1) {
            InterfaceC332260D0u<C433880Gzq> interfaceC332260D0u = this.LLILZ;
            do {
                value2 = interfaceC332260D0u.getValue();
            } while (!interfaceC332260D0u.compareAndSet(value2, C433880Gzq.LIZ(value2, null, false, false, false, 47)));
        } else {
            InterfaceC332260D0u<C433880Gzq> interfaceC332260D0u2 = this.LLILZ;
            C456720Hva c456720Hva = this.LLILZIL;
            do {
                value = interfaceC332260D0u2.getValue();
                c433880Gzq = value;
                C0HV6 c0hv6 = c456720Hva.LIZLLL;
                if (c0hv6 != null && (interfaceC458280Hy6LJIILL2 = c0hv6.LJIILL()) != null && interfaceC458280Hy6LJIILL2.LIZ()) {
                    if (!z5) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = z4;
                }
                C0HV6 c0hv62 = c456720Hva.LIZLLL;
                if (c0hv62 != null && (interfaceC458280Hy6LJIILL = c0hv62.LJIILL()) != null && interfaceC458280Hy6LJIILL.LIZ()) {
                    z2 = z4;
                } else {
                    z2 = c433880Gzq.LJ;
                }
                if (c0ibf != C0IBF.FEATURE_STATUS_DISABLED) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } while (!interfaceC332260D0u2.compareAndSet(value, C433880Gzq.LIZ(c433880Gzq, null, z, z3, z2, 35)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultCameraAndAlbumButtonAbility@4f12.getAlbumBtnState$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(C0IBF c0ibf, Boolean bool, Boolean bool2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        InterfaceC332260D0u<C433880Gzq> interfaceC332260D0u = this.LLILZ;
        C456640HvS c456640HvS = new C456640HvS(this.LLILZIL, interfaceC1364105Vn, interfaceC332260D0u);
        c456640HvS.LL = c0ibf;
        c456640HvS.LLILLJJLI = zBooleanValue;
        c456640HvS.LLILLL = zBooleanValue2;
        return c456640HvS.invokeSuspend(Unit.LIZ);
    }
}
