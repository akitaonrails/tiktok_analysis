package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import njp.a;

/* JADX INFO: renamed from: X.0NKS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.shortcut.InboxShortcutGuideTrigger$showShortcutGuide$1$1", f = "InboxShortcutGuideTrigger.kt", l = {42}, m = "invokeSuspend")
public final class C0NKS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Fragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NKS(Fragment fragment, InterfaceC1364105Vn<? super C0NKS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NKS(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxShortcutGuideTrigger@cc51.showShortcutGuide$1$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("InboxShortcutGuideTrigger@cc51.showShortcutGuide$1$1");
                return objLJFF;
            }
        }
        Fragment fragment = this.LLILLJJLI;
        if ((fragment instanceof InterfaceC20658015sY) && fragment != null) {
            ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJIIJ(this.LLILLJJLI, "inbox", AFwS217S0000000_28.get$arr$(580), AFwS271S0000000_28.get$arr$(298), null, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxShortcutGuideTrigger@cc51.showShortcutGuide$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
