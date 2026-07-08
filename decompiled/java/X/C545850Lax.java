package X;

import com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.draft.IAIGCArchNewFrameworkDraftService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ugc.ProfileDraftTaskProgress$updateFirstDraftAsyncProgressForNewAIGCAIGC$1", f = "ProfileDraftTaskProgress.kt", l = {90}, m = "invokeSuspend")
public final class C545850Lax extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AwemeDraft LLILLJJLI;
    public final /* synthetic */ C545930Lb5 LLILLL;
    public final /* synthetic */ C553680Lna LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C545850Lax(AwemeDraft awemeDraft, C545930Lb5 c545930Lb5, C553680Lna c553680Lna, InterfaceC1364105Vn<? super C545850Lax> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeDraft;
        this.LLILLL = c545930Lb5;
        this.LLILZ = c553680Lna;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C545850Lax(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("ProfileDraftTaskProgress@1fb5.updateFirstDraftAsyncProgressForNewAIGCAIGC$1");
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
            IAIGCArchNewFrameworkDraftService iAIGCArchNewFrameworkDraftService = (IAIGCArchNewFrameworkDraftService) PluggableExtentionKt.pluggableSpi$default(IAIGCArchNewFrameworkDraftService.class, false, false, false, 14, null);
            if (iAIGCArchNewFrameworkDraftService != null) {
                String strLIZ = this.LLILLJJLI.LIZ();
                this.LL = 1;
                obj = iAIGCArchNewFrameworkDraftService.LIZIZ(strLIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ProfileDraftTaskProgress@1fb5.updateFirstDraftAsyncProgressForNewAIGCAIGC$1");
                    return objLJFF;
                }
            }
            unit = null;
            C1C7U.LIZIZ("ProfileDraftTaskProgress@1fb5.updateFirstDraftAsyncProgressForNewAIGCAIGC$1");
            return unit;
        }
        C539070LCf c539070LCf = (C539070LCf) obj;
        if (c539070LCf != null) {
            C545930Lb5 c545930Lb5 = this.LLILLL;
            AwemeDraft awemeDraft = this.LLILLJJLI;
            C553680Lna c553680Lna = this.LLILZ;
            AIGCBusinessModelSet aIGCBusinessModelSet = awemeDraft.LIZ.aigcBusinessModel;
            c545930Lb5.getClass();
            C545930Lb5.LIZJ(aIGCBusinessModelSet, c553680Lna, c539070LCf);
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("ProfileDraftTaskProgress@1fb5.updateFirstDraftAsyncProgressForNewAIGCAIGC$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
