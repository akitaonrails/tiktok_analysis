package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitInputInfo;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitDraftService;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitFeatureService;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder$updateCameoAvatar$1", f = "DraftBoxTaskItemViewHolder.kt", l = {434, 443}, m = "invokeSuspend")
public final class C551520Lk6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftBoxTaskItemViewHolder LLILLJJLI;
    public final /* synthetic */ C0M0P LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C551520Lk6(DraftBoxTaskItemViewHolder draftBoxTaskItemViewHolder, C0M0P c0m0p, InterfaceC1364105Vn<? super C551520Lk6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftBoxTaskItemViewHolder;
        this.LLILLL = c0m0p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C551520Lk6(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        IAIPortraitDraftService iAIPortraitDraftServiceLJI;
        AIPortraitContextModel aIPortraitContextModel;
        AIPortraitInputInfo aIPortraitInputInfo;
        List<String> list;
        String str;
        C1C7U.LIZ("DraftBoxTaskItemViewHolder@8ae8.updateCameoAvatar$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.updateCameoAvatar$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            DraftBoxTaskItemViewHolder draftBoxTaskItemViewHolder = this.LLILLJJLI;
            C0M0P c0m0p = this.LLILLL;
            this.LL = 1;
            draftBoxTaskItemViewHolder.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C551540Lk8(draftBoxTaskItemViewHolder, c0m0p, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.updateCameoAvatar$1");
                return objLJFF;
            }
        }
        AwemeDraft awemeDraft = (AwemeDraft) obj;
        if (awemeDraft == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.updateCameoAvatar$1");
            return unit2;
        }
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ != null && (iAIPortraitDraftServiceLJI = iAIPortraitFeatureServiceLIZ.LJI()) != null && iAIPortraitDraftServiceLJI.LIZIZ(awemeDraft)) {
            AIPortraitModel aIPortraitModel = awemeDraft.LIZ.aigcBusinessModel.aiPortraitModel;
            if (aIPortraitModel != null && (aIPortraitContextModel = aIPortraitModel.contextModel) != null && (aIPortraitInputInfo = aIPortraitContextModel.inputInfo) != null && (list = aIPortraitInputInfo.cameoImageList) != null && (str = (String) C13LP.LJJJLL(list)) != null) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C551530Lk7 c551530Lk7 = new C551530Lk7(this.LLILLJJLI, str, null);
                this.LL = 2;
                if (C23250099c.LJI(this, abstractC2238408pq, c551530Lk7) == objLJFF) {
                    C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.updateCameoAvatar$1");
                    return objLJFF;
                }
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.updateCameoAvatar$1");
                return unit3;
            }
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.updateCameoAvatar$1");
            return unit4;
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.updateCameoAvatar$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
