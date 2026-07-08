package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aigc.NavigateServiceImpl;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LNG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.NavigateServiceImpl$navigateCloudDraftEdit$1", f = "NavigateServiceImpl.kt", l = {165, 168}, m = "invokeSuspend")
public final class C0LNG extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NavigateServiceImpl LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ AIGCDraft LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LNG(NavigateServiceImpl navigateServiceImpl, Context context, AIGCDraft aIGCDraft, InterfaceC1364105Vn<? super C0LNG> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = navigateServiceImpl;
        this.LLILLL = context;
        this.LLILZ = aIGCDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LNG(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NavigateServiceImpl@832b.navigateCloudDraftEdit$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("NavigateServiceImpl@832b.navigateCloudDraftEdit$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            NavigateServiceImpl navigateServiceImpl = this.LLILLJJLI;
            Context context = this.LLILLL;
            AIGCDraft aIGCDraft = this.LLILZ;
            this.LL = 1;
            obj = navigateServiceImpl.LJ(context, aIGCDraft, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("NavigateServiceImpl@832b.navigateCloudDraftEdit$1");
                return objLJFF;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("NavigateServiceImpl@832b.navigateCloudDraftEdit$1");
            return unit2;
        }
        NavigateServiceImpl navigateServiceImpl2 = this.LLILLJJLI;
        Context context2 = this.LLILLL;
        AIGCDraft aIGCDraft2 = this.LLILZ;
        this.LL = 2;
        if (navigateServiceImpl2.LJII(context2, aIGCDraft2, null, this) == objLJFF) {
            C1C7U.LIZIZ("NavigateServiceImpl@832b.navigateCloudDraftEdit$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("NavigateServiceImpl@832b.navigateCloudDraftEdit$1");
        return unit3;
    }
}
