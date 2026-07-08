package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS39S0001000_27;
import njp.a;

/* JADX INFO: renamed from: X.0xIT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel$updateSetting$1", f = "LiveReplySettingViewModel.kt", l = {132}, m = "invokeSuspend")
public final class C1813670xIT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveReplySettingViewModel LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813670xIT(LiveReplySettingViewModel liveReplySettingViewModel, int i, int i2, InterfaceC1364105Vn<? super C1813670xIT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveReplySettingViewModel;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1813670xIT c1813670xIT = new C1813670xIT(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1813670xIT.LLILLJJLI = obj;
        return c1813670xIT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("LiveReplySettingViewModel@8dc8.updateSetting$1");
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
                int i3 = this.LLILZIL;
                C1813680xIU c1813680xIU = liveReplySettingViewModel.LL.LLILLJJLI;
                this.LL = 1;
                obj = ((LiveReplySettingApi) c1813680xIU.LL.LL.getValue()).updateReplaySetting(i2, i3, EnumC1813530xIF.PUBLIC.getValue(), this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveReplySettingViewModel@8dc8.updateSetting$1");
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
        LiveReplySettingViewModel liveReplySettingViewModel2 = this.LLILLL;
        int i4 = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            liveReplySettingViewModel2.setState(new AwS39S0001000_27(i4, 3));
        }
        LiveReplySettingViewModel liveReplySettingViewModel3 = this.LLILLL;
        int i5 = this.LLILZ;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            liveReplySettingViewModel3.setState(new AwS39S0001000_27(i5, 4));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveReplySettingViewModel@8dc8.updateSetting$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
