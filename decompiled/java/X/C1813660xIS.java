package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS39S0010000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0xIS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel$changeAutoPostLivingState$2", f = "LiveReplySettingViewModel.kt", l = {171}, m = "invokeSuspend")
public final class C1813660xIS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveReplySettingViewModel LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813660xIS(LiveReplySettingViewModel liveReplySettingViewModel, boolean z, InterfaceC1364105Vn<? super C1813660xIS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveReplySettingViewModel;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1813660xIS c1813660xIS = new C1813660xIS(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1813660xIS.LLILLJJLI = obj;
        return c1813660xIS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        int i;
        C1C7U.LIZ("LiveReplySettingViewModel@8dc8.changeAutoPostLivingState$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                LiveReplySettingViewModel liveReplySettingViewModel = this.LLILLL;
                boolean z = this.LLILZ;
                C1813680xIU c1813680xIU = liveReplySettingViewModel.LL.LLILLJJLI;
                if (z) {
                    i = 1;
                } else {
                    i = 2;
                }
                EnumC1813530xIF enumC1813530xIF = liveReplySettingViewModel.LLILLJJLI;
                if (enumC1813530xIF == null) {
                    enumC1813530xIF = EnumC1813530xIF.PUBLIC;
                }
                int value = enumC1813530xIF.getValue();
                this.LL = 1;
                obj = ((LiveReplySettingApi) c1813680xIU.LL.LL.getValue()).updateReplaySetting(5, i, value, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveReplySettingViewModel@8dc8.changeAutoPostLivingState$2");
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
        boolean z2 = this.LLILZ;
        LiveReplySettingViewModel liveReplySettingViewModel2 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeAutoPostLivingState Success isOpen:");
            sbLIZ.append(z2);
            C20441214yg.LIZIZ("LiveReplySettingViewModel", C2188811AlT.LIZIZ(sbLIZ));
            liveReplySettingViewModel2.setState(new AwS39S0010000_27(z2, 12));
        }
        LiveReplySettingViewModel liveReplySettingViewModel3 = this.LLILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("changeAutoPostLivingState Failure ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getCause());
            C20441214yg.LIZIZ("LiveReplySettingViewModel", C2188811AlT.LIZIZ(sbLIZ2));
            liveReplySettingViewModel3.setState(new AwS606S0100000_27(thM5exceptionOrNullimpl, 154));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveReplySettingViewModel@8dc8.changeAutoPostLivingState$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
