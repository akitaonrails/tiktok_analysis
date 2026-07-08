package X;

import com.ss.android.ugc.aweme.ecommerce.pictureinpicture.EcPiPViewModel;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pM9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.pictureinpicture.EcPiPViewModel$onVideoPause$1", f = "EcPiPViewModel.kt", l = {85}, m = "invokeSuspend")
public final class C1508430pM9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EcPiPViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508430pM9(EcPiPViewModel ecPiPViewModel, InterfaceC1364105Vn<? super C1508430pM9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ecPiPViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1508430pM9(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcPiPViewModel@7771.onVideoPause$1");
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
            if (!this.LLILLJJLI.LL) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                    C1C7U.LIZIZ("EcPiPViewModel@7771.onVideoPause$1");
                    return objLJFF;
                }
            }
        }
        WeakReference<C20738716Dh> weakReference = C20738716Dh.LJIIIIZZ;
        InterfaceC1508380pM4 interfaceC1508380pM4LIZ = C1508320pLy.LIZ();
        if (interfaceC1508380pM4LIZ == null || !interfaceC1508380pM4LIZ.isPlaying()) {
            EcPiPViewModel.xQ2(this.LLILLJJLI, null, true, null, 5);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcPiPViewModel@7771.onVideoPause$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
