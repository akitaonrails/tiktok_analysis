package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aigc.NavigateServiceImpl;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LO6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.NavigateServiceImpl$navigateCloudDraftPreview$1", f = "NavigateServiceImpl.kt", l = {144, 146, 148}, m = "invokeSuspend")
public final class C0LO6 extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NavigateServiceImpl LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ AIGCDraft LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LO6(NavigateServiceImpl navigateServiceImpl, Context context, AIGCDraft aIGCDraft, InterfaceC1364105Vn<? super C0LO6> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = navigateServiceImpl;
        this.LLILLL = context;
        this.LLILZ = aIGCDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LO6(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AIGCDraft aIGCDraft;
        CameoDraft cameoDraft;
        C1C7U.LIZ("NavigateServiceImpl@832b.navigateCloudDraftPreview$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("NavigateServiceImpl@832b.navigateCloudDraftPreview$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            NavigateServiceImpl navigateServiceImpl = this.LLILLJJLI;
            Context context = this.LLILLL;
            AIGCDraft aIGCDraft2 = this.LLILZ;
            this.LL = 1;
            obj = navigateServiceImpl.LJ(context, aIGCDraft2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("NavigateServiceImpl@832b.navigateCloudDraftPreview$1");
                return objLJFF;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("NavigateServiceImpl@832b.navigateCloudDraftPreview$1");
            return unit2;
        }
        if (this.LLILZ.serverTaskId.length() == 0 && (cameoDraft = (aIGCDraft = this.LLILZ).cameoDraft) != null) {
            NavigateServiceImpl navigateServiceImpl2 = this.LLILLJJLI;
            Context context2 = this.LLILLL;
            this.LL = 2;
            navigateServiceImpl2.getClass();
            if (NavigateServiceImpl.LJI(context2, aIGCDraft, cameoDraft, this) == objLJFF) {
                C1C7U.LIZIZ("NavigateServiceImpl@832b.navigateCloudDraftPreview$1");
                return objLJFF;
            }
        } else {
            NavigateServiceImpl navigateServiceImpl3 = this.LLILLJJLI;
            Context context3 = this.LLILLL;
            AIGCDraft aIGCDraft3 = this.LLILZ;
            this.LL = 3;
            if (navigateServiceImpl3.LJIIJ(context3, aIGCDraft3, this) == objLJFF) {
                C1C7U.LIZIZ("NavigateServiceImpl@832b.navigateCloudDraftPreview$1");
                return objLJFF;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("NavigateServiceImpl@832b.navigateCloudDraftPreview$1");
        return unit3;
    }
}
