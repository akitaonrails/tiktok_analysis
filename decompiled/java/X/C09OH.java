package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09OH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController$selectMediaMode$5", f = "VideoImageMixedController.kt", l = {}, m = "invokeSuspend")
public final class C09OH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TikTokMediaModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09OH(TikTokMediaModel tikTokMediaModel, InterfaceC1364105Vn<? super C09OH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = tikTokMediaModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09OH(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoImageMixedController@1fe.selectMediaMode$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TikTokMediaModel tikTokMediaModel = this.LL;
        if (tikTokMediaModel != null) {
            C140D.LIZ.getClass();
            String strLJIJJ = C140D.LJIJJ(tikTokMediaModel);
            if (strLJIJJ != null) {
                C2471909mP.LJIJJLI(strLJIJJ, false);
                C23203097h.LIZ(strLJIJJ);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("VideoImageMixedController@1fe.selectMediaMode$5");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("VideoImageMixedController@1fe.selectMediaMode$5");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
