package X;

import android.graphics.Rect;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HN0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraViewModel$captureWithDirection$1", f = "AimeCameraViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0HN0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC439810HMl LLILLJJLI;
    public final /* synthetic */ AimeCameraViewModel LLILLL;
    public final /* synthetic */ EnumC1684470tw5 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HN0(InterfaceC439810HMl interfaceC439810HMl, AimeCameraViewModel aimeCameraViewModel, EnumC1684470tw5 enumC1684470tw5, InterfaceC1364105Vn<? super C0HN0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC439810HMl;
        this.LLILLL = aimeCameraViewModel;
        this.LLILZ = enumC1684470tw5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HN0 c0hn0 = new C0HN0(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0hn0.LL = obj;
        return c0hn0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Rect rect;
        final boolean z;
        C1C7U.LIZ("AimeCameraViewModel@c2fb.captureWithDirection$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C2296808zG.LJI((InterfaceC497601wk) this.LL)) {
            InterfaceC439810HMl interfaceC439810HMl = this.LLILLJJLI;
            EnumC1684560twE enumC1684560twE = EnumC1684560twE.FRONT_DETECTION;
            AimeCameraViewModel aimeCameraViewModel = this.LLILLL;
            InterfaceC1692950u9l interfaceC1692950u9l = aimeCameraViewModel.LLJI;
            if (interfaceC1692950u9l != null) {
                aimeCameraViewModel.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (C1692940u9k.LJFF(interfaceC1692950u9l) >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (C1692940u9k.LJFF(interfaceC1692950u9l) & 4294967295L));
                rect = new Rect((int) fIntBitsToFloat, (int) fIntBitsToFloat2, (int) (((int) (interfaceC1692950u9l.LIZ() >> 32)) + fIntBitsToFloat), (int) (((int) (4294967295L & interfaceC1692950u9l.LIZ())) + fIntBitsToFloat2));
            } else {
                rect = null;
            }
            final AimeCameraViewModel aimeCameraViewModel2 = this.LLILLL;
            C1684860twi c1684860twi = new C1684860twi(enumC1684560twE, false, rect, true, aimeCameraViewModel2.LLILLJJLI);
            final InterfaceC439810HMl interfaceC439810HMl2 = this.LLILLJJLI;
            if (this.LLILZ == EnumC1684470tw5.FRONT_CAPTURE) {
                z = true;
            } else {
                z = false;
            }
            aimeCameraViewModel2.getClass();
            interfaceC439810HMl.LIZ(c1684860twi, new InterfaceC1684790twb() { // from class: X.0twA
                @Override // X.InterfaceC1684790twb
                public final boolean LIZLLL() {
                    return false;
                }

                @Override // X.InterfaceC1684790twb
                public final boolean LIZIZ(C1684540twC c1684540twC) {
                    Object value;
                    EnumC1684560twE enumC1684560twE2;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    boolean z5;
                    boolean z6;
                    int i;
                    Rect rect2;
                    Rect rect3;
                    int i2;
                    C1684440tw2 c1684440tw2;
                    float f;
                    float f2;
                    float f3;
                    C2252321DDq c2252321DDq = aimeCameraViewModel2.LLIZLLLIL;
                    do {
                        value = c2252321DDq.getValue();
                        enumC1684560twE2 = c1684540twC.LIZ;
                        z2 = c1684540twC.LIZLLL;
                        z3 = c1684540twC.LJ;
                        z4 = c1684540twC.LJI;
                        z5 = c1684540twC.LJII;
                        z6 = c1684540twC.LIZIZ;
                        i = c1684540twC.LJIIIIZZ.LIZ;
                        rect2 = c1684540twC.LJIIIZ;
                        rect3 = c1684540twC.LJIIJ;
                        i2 = c1684540twC.LJFF;
                        c1684440tw2 = c1684540twC.LIZJ;
                        f = c1684540twC.LJIIJJI;
                        f2 = c1684540twC.LJIILIIL;
                        f3 = c1684540twC.LJIIL;
                        value.getClass();
                    } while (!c2252321DDq.compareAndSet(value, new C1684430tw1(enumC1684560twE2, z3, i2, z4, z5, rect2, rect3, z2, z6, c1684440tw2, i, f, f2, f3)));
                    return false;
                }

                @Override // X.InterfaceC1684790twb
                public final void LIZJ(C439610HLr c439610HLr) {
                    Object value;
                    EnumC1684470tw5 enumC1684470tw5 = ((C1684510tw9) aimeCameraViewModel2.LLILZLL.getValue()).LIZ;
                    int i = 1;
                    if (enumC1684470tw5 != EnumC1684470tw5.DONE && enumC1684470tw5 != EnumC1684470tw5.FRONT_COUNTDOWN) {
                        if (z) {
                            C2252321DDq c2252321DDq = aimeCameraViewModel2.LLILZLL;
                            do {
                                value = c2252321DDq.getValue();
                            } while (!c2252321DDq.compareAndSet(value, C1684510tw9.LIZ((C1684510tw9) value, null, c439610HLr.LJI, 1)));
                            int i2 = C1684550twD.LIZ[c439610HLr.LJFF.ordinal()];
                            if (i2 != 1) {
                                i = 2;
                                if (i2 != 2) {
                                    i = 3;
                                    if (i2 != 3) {
                                        throw new C1954807lC();
                                    }
                                }
                            }
                            C566110MIf c566110MIf = C566110MIf.LIZ;
                            Integer numValueOf = Integer.valueOf(i);
                            AimeCameraViewModel aimeCameraViewModel3 = aimeCameraViewModel2;
                            boolean z2 = aimeCameraViewModel3.LLILLL;
                            boolean z3 = aimeCameraViewModel3.LLILZ;
                            String str = aimeCameraViewModel3.LLILZIL;
                            c566110MIf.getClass();
                            C566110MIf.LJFF(numValueOf, str, z2, z3);
                        }
                        aimeCameraViewModel2.vQ2(interfaceC439810HMl2);
                    }
                }

                @Override // X.InterfaceC1684790twb
                public final void LIZ(EnumC439820HMm enumC439820HMm, C1684540twC c1684540twC) {
                    if (enumC439820HMm == EnumC439820HMm.FACE_NOT_MATCH && ((C1684510tw9) aimeCameraViewModel2.LLILZLL.getValue()).LIZ == EnumC1684470tw5.FRONT_CAPTURE) {
                        AimeCameraViewModel aimeCameraViewModel3 = aimeCameraViewModel2;
                        InterfaceC439810HMl interfaceC439810HMl3 = interfaceC439810HMl2;
                        aimeCameraViewModel3.LLILZLL.setValue(new C1684510tw9(EnumC1684470tw5.INIT, null));
                        aimeCameraViewModel3.vQ2(interfaceC439810HMl3);
                    }
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AimeCameraViewModel@c2fb.captureWithDirection$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
