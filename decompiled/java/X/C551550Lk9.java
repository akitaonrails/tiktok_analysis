package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder$onProgressUpdate$1", f = "DraftBoxTaskItemViewHolder.kt", l = {318}, m = "invokeSuspend")
public final class C551550Lk9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftBoxTaskItemViewHolder LLILLJJLI;
    public final /* synthetic */ C0M0P LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C551550Lk9(DraftBoxTaskItemViewHolder draftBoxTaskItemViewHolder, C0M0P c0m0p, InterfaceC1364105Vn<? super C551550Lk9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftBoxTaskItemViewHolder;
        this.LLILLL = c0m0p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C551550Lk9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        CreativeModel creativeModel;
        PUgcTemplateData pUgcTemplateData;
        C1C7U.LIZ("DraftBoxTaskItemViewHolder@8ae8.onProgressUpdate$1");
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
            DraftBoxTaskItemViewHolder draftBoxTaskItemViewHolder = this.LLILLJJLI;
            C0M0P c0m0p = this.LLILLL;
            this.LL = 1;
            draftBoxTaskItemViewHolder.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C551540Lk8(draftBoxTaskItemViewHolder, c0m0p, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.onProgressUpdate$1");
                return objLJFF;
            }
        }
        AwemeDraft awemeDraft = (AwemeDraft) obj;
        if (awemeDraft != null && (creativeModel = awemeDraft.LIZ) != null && (pUgcTemplateData = creativeModel.pugcTemplateData) != null && pUgcTemplateData.needHandleAICreate && this.LLILLL.LJIILIIL == EnumC545550LaT.COMPLETE) {
            DraftBoxTaskItemViewHolder draftBoxTaskItemViewHolder2 = this.LLILLJJLI;
            String creationId = awemeDraft.LIZIZ().getCreationId();
            CreativeModel creativeModel2 = awemeDraft.LIZ;
            String str = creativeModel2.ugcTemplateData.ugcTemplateId;
            String str2 = awemeDraft.LJJJJIZL.shootWay;
            PUgcTemplateData pUgcTemplateData2 = creativeModel2.pugcTemplateData;
            draftBoxTaskItemViewHolder2.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", creationId);
            c0lab.LJ("tt_template_id", str);
            c0lab.LJ("shoot_way", str2);
            c0lab.LIZ(pUgcTemplateData2.aiCreateI2ICnt, "ai_create_i2i_cnt");
            c0lab.LIZ(pUgcTemplateData2.aiCreateI2VCnt, "ai_create_i2v_cnt");
            c0lab.LIZ(pUgcTemplateData2.aiCreateFL2VCnt, "ai_create_fl2v_cnt");
            c0lab.LIZ(pUgcTemplateData2.aiCreateStylizedI2VCnt, "ai_create_stylized_i2v_cnt");
            c0lab.LIZ(pUgcTemplateData2.aiCreateStylizedFL2VCnt, "ai_create_stylized_fl2v_cnt");
            C20684815ws.LJIILLIIL("ai_create_template_apply", c0lab.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxTaskItemViewHolder@8ae8.onProgressUpdate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
