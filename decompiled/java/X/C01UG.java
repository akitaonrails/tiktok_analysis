package X;

import com.ss.android.ugc.aweme.pipo.component.nativecamera.NativeCameraPictureTakingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01UG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.component.nativecamera.NativeCameraPictureTakingFragment$captureCallback$1$process$1", f = "NativeCameraPictureTakingFragment.kt", l = {621}, m = "invokeSuspend")
public final class C01UG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NativeCameraPictureTakingFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01UG(NativeCameraPictureTakingFragment nativeCameraPictureTakingFragment, InterfaceC1364105Vn<? super C01UG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = nativeCameraPictureTakingFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01UG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NativeCameraPictureTakingFragment@9b39.captureCallback$1$process$1");
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
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("NativeCameraPictureTakingFragment@9b39.captureCallback$1$process$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.aS();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NativeCameraPictureTakingFragment@9b39.captureCallback$1$process$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
