package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ability.AVProcessServiceImpl$calculateGradientBackground$background$1", f = "AVProcessServiceImpl.kt", l = {158}, m = "invokeSuspend")
public final class C567080MLy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CanvasBackground>, Object> {
    public int LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567080MLy(Bitmap bitmap, InterfaceC1364105Vn<? super C567080MLy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C567080MLy(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("AVProcessServiceImpl@2a5.calculateGradientBackground$background$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0MOP c0mop = new C0MOP();
            Bitmap bitmap = this.LLILLJJLI;
            if (C295690BiR.LIZ()) {
                i = 3;
            } else {
                i = 1;
            }
            C0MM1 c0mm1 = new C0MM1(bitmap, i);
            this.LL = 1;
            obj = C1D7S.LIZ(c0mop, c0mm1, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AVProcessServiceImpl@2a5.calculateGradientBackground$background$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AVProcessServiceImpl@2a5.calculateGradientBackground$background$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CanvasBackground> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
