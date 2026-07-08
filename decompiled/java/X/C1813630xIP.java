package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS606S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0xIP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel$shareToGuests$1", f = "LiveReplySettingViewModel.kt", l = {115}, m = "invokeSuspend")
public final class C1813630xIP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveReplySettingViewModel LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813630xIP(LiveReplySettingViewModel liveReplySettingViewModel, int i, InterfaceC1364105Vn<? super C1813630xIP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveReplySettingViewModel;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1813630xIP c1813630xIP = new C1813630xIP(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1813630xIP.LLILLJJLI = obj;
        return c1813630xIP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("LiveReplySettingViewModel@8dc8.shareToGuests$1");
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
                LiveReplySettingViewModel liveReplySettingViewModel = this.LLILLL;
                int i2 = this.LLILZ;
                C1813680xIU c1813680xIU = liveReplySettingViewModel.LL.LLILLJJLI;
                this.LL = 1;
                obj = ((LiveReplySettingApi) c1813680xIU.LL.LL.getValue()).shareToGuests(i2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveReplySettingViewModel@8dc8.shareToGuests$1");
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
        C189200o6.m8isSuccessimpl(c098200Yq);
        LiveReplySettingViewModel liveReplySettingViewModel2 = this.LLILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            liveReplySettingViewModel2.setState(new AwS606S0100000_27(thM5exceptionOrNullimpl, 569));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveReplySettingViewModel@8dc8.shareToGuests$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
