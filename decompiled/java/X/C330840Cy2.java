package X;

import com.ss.android.ugc.aweme.prop.fragment.ame.AmeProfileFrameActivityBannerTTEPResController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cy2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.fragment.ame.AmeProfileFrameActivityBannerTTEPResController$onCreate$1", f = "AmeProfileFrameActivityBannerTTEPResController.kt", l = {51}, m = "invokeSuspend")
public final class C330840Cy2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AmeProfileFrameActivityBannerTTEPResController LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330840Cy2(AmeProfileFrameActivityBannerTTEPResController ameProfileFrameActivityBannerTTEPResController, InterfaceC1364105Vn<? super C330840Cy2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ameProfileFrameActivityBannerTTEPResController;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330840Cy2(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AmeProfileFrameActivityBannerTTEPResController@578f.onCreate$1");
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
            C2252321DDq c2252321DDq = C323950Cmv.LIZJ;
            C330850Cy3 c330850Cy3 = new C330850Cy3(this.LLILLJJLI, null);
            this.LL = 1;
            if (C09IC.LJII(c2252321DDq, this, c330850Cy3) == objLJFF) {
                C1C7U.LIZIZ("AmeProfileFrameActivityBannerTTEPResController@578f.onCreate$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AmeProfileFrameActivityBannerTTEPResController@578f.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
