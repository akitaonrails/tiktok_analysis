package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Bk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.publish.StoryPublishLandingLogger$mobStoryPublishLanding$1", f = "StoryPublishLandingLogger.kt", l = {}, m = "invokeSuspend")
public final class C1311805Bk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1311805Bk(String str, String str2, String str3, InterfaceC1364105Vn<? super C1311805Bk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1311805Bk(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryPublishLandingLogger@4afc.mobStoryPublishLanding$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", this.LL);
        c0lab.LJ("landing_tab", this.LLILLJJLI);
        c0lab.LJ("enter_method", this.LLILLL);
        C20684815ws.LJIILLIIL("story_publish_landing", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryPublishLandingLogger@4afc.mobStoryPublishLanding$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
