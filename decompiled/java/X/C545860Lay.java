package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lay, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ugc.ProfileDraftTaskProgress$updateFirstDraftAsyncProgress$1", f = "ProfileDraftTaskProgress.kt", l = {75, 76}, m = "invokeSuspend")
public final class C545860Lay extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ICreationAsyncTaskManager LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ AwemeDraft LLILZ;
    public final /* synthetic */ C545930Lb5 LLILZIL;
    public final /* synthetic */ C553680Lna LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C545860Lay(ICreationAsyncTaskManager iCreationAsyncTaskManager, List<String> list, AwemeDraft awemeDraft, C545930Lb5 c545930Lb5, C553680Lna c553680Lna, InterfaceC1364105Vn<? super C545860Lay> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iCreationAsyncTaskManager;
        this.LLILLL = list;
        this.LLILZ = awemeDraft;
        this.LLILZIL = c545930Lb5;
        this.LLILZLL = c553680Lna;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C545860Lay(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileDraftTaskProgress@1fb5.updateFirstDraftAsyncProgress$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C545930Lb5 c545930Lb5 = this.LLILZIL;
                    AIGCBusinessModelSet aIGCBusinessModelSet = this.LLILZ.LIZ.aigcBusinessModel;
                    C553680Lna c553680Lna = this.LLILZLL;
                    c545930Lb5.getClass();
                    C545930Lb5.LIZJ(aIGCBusinessModelSet, c553680Lna, (C539070LCf) obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ProfileDraftTaskProgress@1fb5.updateFirstDraftAsyncProgress$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ICreationAsyncTaskManager iCreationAsyncTaskManager = this.LLILLJJLI;
            List<String> list = this.LLILLL;
            this.LL = 1;
            obj = iCreationAsyncTaskManager.LJIJJ(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ProfileDraftTaskProgress@1fb5.updateFirstDraftAsyncProgress$1");
                return objLJFF;
            }
        }
        C0LCT c0lctLJIILIIL = this.LLILLJJLI.LJIILIIL();
        String strLIZ = this.LLILZ.LIZ();
        this.LL = 2;
        obj = c0lctLJIILIIL.LIZ(strLIZ, (List) obj, this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("ProfileDraftTaskProgress@1fb5.updateFirstDraftAsyncProgress$1");
            return objLJFF;
        }
        C545930Lb5 c545930Lb52 = this.LLILZIL;
        AIGCBusinessModelSet aIGCBusinessModelSet2 = this.LLILZ.LIZ.aigcBusinessModel;
        C553680Lna c553680Lna2 = this.LLILZLL;
        c545930Lb52.getClass();
        C545930Lb5.LIZJ(aIGCBusinessModelSet2, c553680Lna2, (C539070LCf) obj);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ProfileDraftTaskProgress@1fb5.updateFirstDraftAsyncProgress$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
