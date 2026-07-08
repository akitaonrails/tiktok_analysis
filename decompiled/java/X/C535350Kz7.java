package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.event.StoryLogger$publishStoryRetry$1", f = "StoryLogger.kt", l = {}, m = "invokeSuspend")
public final class C535350Kz7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535350Kz7(String str, String str2, String str3, InterfaceC1364105Vn<? super C535350Kz7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C535350Kz7(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryLogger@4196.publishStoryRetry$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(this.LL, 0, null, 6, null), true, false, false, 12));
        if (awemeDraftLJI == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryLogger@4196.publishStoryRetry$1");
            return unit;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", this.LL);
        c0lab.LJ("enter_from", this.LLILLJJLI);
        c0lab.LJ("action_type", this.LLILLL);
        C559510Lwz.LIZ(c0lab, awemeDraftLJI, "story");
        C20684815ws.LJIILLIIL("publish_retry", c0lab.LIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryLogger@4196.publishStoryRetry$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
