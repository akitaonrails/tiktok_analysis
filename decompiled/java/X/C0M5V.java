package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.story.SimplePublishModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M5V, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.StoryDraftServiceImpl$deleteDraft$1", f = "StoryDraftServiceImpl.kt", l = {144}, m = "invokeSuspend")
public final class C0M5V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SimplePublishModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M5V(SimplePublishModel simplePublishModel, InterfaceC1364105Vn<? super C0M5V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = simplePublishModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M5V(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryDraftServiceImpl@50ac.deleteDraft$1");
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
            AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(this.LLILLJJLI.creationId, 0, null, 6, null), false, false, false, 14));
            if (awemeDraftLJI == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StoryDraftServiceImpl@50ac.deleteDraft$1");
                return unit;
            }
            C0CHQ.LIZ().getPublishService().LJIIL();
            C1436830nUf.LJIJI(new C572660Md6(awemeDraftLJI));
            InterfaceC545580LaW interfaceC545580LaWLIZIZ = C0CHQ.LIZ().LJI().LIZIZ();
            C570330MYl c570330MYl = new C570330MYl(awemeDraftLJI, new C560950LzJ("delete from CreativeNowDraftService", "deleteStory"), false, null, null, 124);
            this.LL = 1;
            if (interfaceC545580LaWLIZIZ.LIZJ(c570330MYl, this) == objLJFF) {
                C1C7U.LIZIZ("StoryDraftServiceImpl@50ac.deleteDraft$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryDraftServiceImpl@50ac.deleteDraft$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
