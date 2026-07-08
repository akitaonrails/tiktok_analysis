package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS604S0100000_25;
import njp.a;

/* JADX INFO: renamed from: X.0tJH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.biz.reveal.camera.RevealFakeDualCameraComponent$takeSecondPhoto$1", f = "RevealFakeDualCameraComponent.kt", l = {228}, m = "invokeSuspend")
public final class C1660410tJH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1660390tJF LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1660410tJH(C1660390tJF c1660390tJF, InterfaceC1364105Vn<? super C1660410tJH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1660390tJF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1660410tJH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RevealFakeDualCameraComponent@f872.takeSecondPhoto$1");
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
            C1660390tJF c1660390tJF = this.LLILLJJLI;
            this.LL = 1;
            obj = c1660390tJF.S5(true, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RevealFakeDualCameraComponent@f872.takeSecondPhoto$1");
                return objLJFF;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RevealFakeDualCameraComponent@f872.takeSecondPhoto$1");
            return unit;
        }
        this.LLILLJJLI.i3(new AwS604S0100000_25(bitmap, 255));
        this.LLILLJJLI.D5();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RevealFakeDualCameraComponent@f872.takeSecondPhoto$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
