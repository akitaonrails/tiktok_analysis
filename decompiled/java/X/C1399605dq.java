package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.detail.api.DetailApiProxyImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05dq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorVM$getStoryNoteAweme$2", f = "StoryNotePanelAuthorVM.kt", l = {}, m = "invokeSuspend")
public final class C1399605dq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Aweme>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1399605dq(String str, InterfaceC1364105Vn<? super C1399605dq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1399605dq(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryNotePanelAuthorVM@8a90.getStoryNoteAweme$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Aweme awemeLIZ = DetailApiProxyImpl.LIZIZ().LIZ(this.LL);
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(awemeLIZ);
            C1C7U.LIZIZ("StoryNotePanelAuthorVM@8a90.getStoryNoteAweme$2");
            return awemeLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1C7U.LIZIZ("StoryNotePanelAuthorVM@8a90.getStoryNoteAweme$2");
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Aweme> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
