package X;

import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.view.AliveButtonView$cancelAnimationTask$2$2$1", f = "AliveButtonView.kt", l = {523}, m = "invokeSuspend")
public final class C440780HQe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C440750HQb LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C440780HQe(C440750HQb c440750HQb, InterfaceC1364105Vn<? super C440780HQe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c440750HQb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C440780HQe(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C440800HQg c440800HQg;
        String str;
        MixStudioStatusRepository taskStatusDataService;
        StickerItem stickerItem;
        StickerBase stickerBase;
        Long l;
        C1C7U.LIZ("AliveButtonView@476a.cancelAnimationTask$2$2$1");
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
            C440750HQb c440750HQb = this.LLILLJJLI;
            C440830HQj c440830HQj = c440750HQb.LLILLL;
            AbstractC440840HQk abstractC440840HQk = null;
            if (c440830HQj != null) {
                abstractC440840HQk = c440830HQj.LIZJ;
            }
            if ((abstractC440840HQk instanceof C440800HQg) && (c440800HQg = (C440800HQg) abstractC440840HQk) != null && (str = c440800HQg.LIZ) != null && (taskStatusDataService = c440750HQb.getTaskStatusDataService()) != null) {
                this.LL = 1;
                if (taskStatusDataService.LJIILIIL(str, this) == objLJFF) {
                    C1C7U.LIZIZ("AliveButtonView@476a.cancelAnimationTask$2$2$1");
                    return objLJFF;
                }
            }
        }
        C440750HQb c440750HQb2 = this.LLILLJJLI;
        C440830HQj c440830HQj2 = c440750HQb2.LLILLL;
        if (c440830HQj2 != null && (stickerItem = c440830HQj2.LIZ) != null && (stickerBase = stickerItem.stickerBase) != null && (l = stickerBase.id) != null) {
            long jLongValue = l.longValue();
            MixStudioStatusRepository taskStatusDataService2 = c440750HQb2.getTaskStatusDataService();
            if (taskStatusDataService2 != null) {
                taskStatusDataService2.LJIIIZ(jLongValue, C440850HQl.LIZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AliveButtonView@476a.cancelAnimationTask$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
