package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.ImageListViewModel$disableCurrentEffectAndAutoDisplay$1", f = "ImageListViewModel.kt", l = {234}, m = "invokeSuspend")
public final class C1728300v4m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ImageListViewModel LLILLJJLI;
    public final /* synthetic */ InterfaceC1728700v5Q LLILLL;
    public final /* synthetic */ LiveEffect LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728300v4m(ImageListViewModel imageListViewModel, InterfaceC1728700v5Q interfaceC1728700v5Q, LiveEffect liveEffect, InterfaceC1364105Vn<? super C1728300v4m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = imageListViewModel;
        this.LLILLL = interfaceC1728700v5Q;
        this.LLILZ = liveEffect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728300v4m(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        RootData rootData;
        C1728990v5t c1728990v5tUm1;
        C1C7U.LIZ("ImageListViewModel@65ae.disableCurrentEffectAndAutoDisplay$1");
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
            ImageListViewModel imageListViewModel = this.LLILLJJLI;
            C1728720v5S c1728720v5S = imageListViewModel.LLILZ;
            InterfaceC1728700v5Q interfaceC1728700v5Q = this.LLILLL;
            LiveEffect liveEffect = this.LLILZ;
            InterfaceC1729810v7D interfaceC1729810v7D = imageListViewModel.LLILZIL;
            if (interfaceC1729810v7D != null && (c1728990v5tUm1 = interfaceC1729810v7D.Um1()) != null) {
                rootData = c1728990v5tUm1.LL;
            } else {
                rootData = null;
            }
            this.LL = 1;
            if (c1728720v5S.LIZ(interfaceC1728700v5Q, liveEffect, rootData, this) == objLJFF) {
                C1C7U.LIZIZ("ImageListViewModel@65ae.disableCurrentEffectAndAutoDisplay$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageListViewModel@65ae.disableCurrentEffectAndAutoDisplay$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
