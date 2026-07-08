package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.api.FeedActionApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05DI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM$deleteStoryNote$1", f = "StoryNotePanelAuthorVM.kt", l = {}, m = "invokeSuspend")
public final class C05DI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05DI(String str, InterfaceC1364105Vn<? super C05DI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05DI(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("StoryNotePanelAuthorVM@8a90.deleteStoryNote$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C727870Sgr.LIZ(this.LL);
        String str = this.LL;
        try {
            FeedActionApi.LIZ(str);
            C189200o6.m2constructorimpl(str);
            obj2 = str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        C189200o6.m5exceptionOrNullimpl(obj2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryNotePanelAuthorVM@8a90.deleteStoryNote$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
