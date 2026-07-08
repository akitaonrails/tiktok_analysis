package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZQO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.IMMediaRefactorUtils$buildPrivateVideo2Sticker$1$1", f = "IMMediaRefactorUtils.kt", l = {395}, m = "invokeSuspend")
public final class C0ZQO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ InterfaceC889250YuZ LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ Photo2StickerViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZQO(C869590Y9l c869590Y9l, InterfaceC889250YuZ interfaceC889250YuZ, Activity activity, Photo2StickerViewModel photo2StickerViewModel, InterfaceC1364105Vn<? super C0ZQO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = interfaceC889250YuZ;
        this.LLILZ = activity;
        this.LLILZIL = photo2StickerViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZQO(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IVideo2StickerService iVideo2StickerServiceVideo2StickerService;
        IAbilityService iAbilityServiceAbilityService;
        C1C7U.LIZ("IMMediaRefactorUtils@4f43.buildPrivateVideo2Sticker$1$1");
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
            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
            if (iExternalService != null && (iAbilityServiceAbilityService = iExternalService.abilityService()) != null) {
                iVideo2StickerServiceVideo2StickerService = iAbilityServiceAbilityService.video2StickerService();
            } else {
                iVideo2StickerServiceVideo2StickerService = null;
            }
            String strLJIIIIZZ = C912070ZqH.LIZIZ.LJIILJJIL().LJIIIIZZ(this.LLILLJJLI);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0ZQP c0zqp = new C0ZQP(iVideo2StickerServiceVideo2StickerService, this.LLILLL, this.LLILZ, strLJIIIIZZ, this.LLILZIL, this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c0zqp) == objLJFF) {
                C1C7U.LIZIZ("IMMediaRefactorUtils@4f43.buildPrivateVideo2Sticker$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMMediaRefactorUtils@4f43.buildPrivateVideo2Sticker$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
