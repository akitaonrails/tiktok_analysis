package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import njp.a;

/* JADX INFO: renamed from: X.0xoq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.data.LiveReplayListViewModel$subscribeInbox$1", f = "LiveReplayListViewModel.kt", l = {270}, m = "invokeSuspend")
public final class C1833740xoq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveReplayListViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833740xoq(LiveReplayListViewModel liveReplayListViewModel, InterfaceC1364105Vn<? super C1833740xoq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveReplayListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1833740xoq c1833740xoq = new C1833740xoq(this.LLILLL, interfaceC1364105Vn);
        c1833740xoq.LLILLJJLI = obj;
        return c1833740xoq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("LiveReplayListViewModel@885a.subscribeInbox$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1833900xp6 c1833900xp6 = this.LLILLL.LL.LLILLL;
                this.LL = 1;
                obj = ((LiveReplySettingApi) c1833900xp6.LL.LLILLJJLI.getValue()).subscribeInbox(1, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveReplayListViewModel@885a.subscribeInbox$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C470590Icr) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        LiveReplayListViewModel liveReplayListViewModel = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            liveReplayListViewModel.getClass();
            liveReplayListViewModel.setState(AFwS269S0000000_27.get$arr$(366));
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveReplayListViewModel@885a.subscribeInbox$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
