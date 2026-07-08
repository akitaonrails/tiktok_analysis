package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.api.LiveReplySettingApi;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS606S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0xIR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.setting.viewmodel.LiveReplySettingViewModel$changeAutoPostVisibility$2", f = "LiveReplySettingViewModel.kt", l = {200}, m = "invokeSuspend")
public final class C1813650xIR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveReplySettingViewModel LLILLL;
    public final /* synthetic */ EnumC1813530xIF LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813650xIR(LiveReplySettingViewModel liveReplySettingViewModel, EnumC1813530xIF enumC1813530xIF, InterfaceC1364105Vn<? super C1813650xIR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveReplySettingViewModel;
        this.LLILZ = enumC1813530xIF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1813650xIR c1813650xIR = new C1813650xIR(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1813650xIR.LLILLJJLI = obj;
        return c1813650xIR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC1813530xIF enumC1813530xIF;
        C1C7U.LIZ("LiveReplySettingViewModel@8dc8.changeAutoPostVisibility$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    EnumC1813530xIF enumC1813530xIF2 = (EnumC1813530xIF) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    enumC1813530xIF = enumC1813530xIF2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                LiveReplySettingViewModel liveReplySettingViewModel = this.LLILLL;
                EnumC1813530xIF enumC1813530xIF3 = this.LLILZ;
                C1813680xIU c1813680xIU = liveReplySettingViewModel.LL.LLILLJJLI;
                int value = enumC1813530xIF3.getValue();
                this.LLILLJJLI = enumC1813530xIF3;
                this.LL = 1;
                enumC1813530xIF = enumC1813530xIF3;
                if (((LiveReplySettingApi) c1813680xIU.LL.LL.getValue()).updateReplaySetting(5, 1, value, this) == objLJFF) {
                    C1C7U.LIZIZ("LiveReplySettingViewModel@8dc8.changeAutoPostVisibility$2");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl(enumC1813530xIF);
            obj2 = enumC1813530xIF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj2 = c098200Yq;
        }
        LiveReplySettingViewModel liveReplySettingViewModel2 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(obj2)) {
            EnumC1813530xIF enumC1813530xIF4 = (EnumC1813530xIF) obj2;
            C20441214yg.LIZIZ("LiveReplySettingViewModel", "changeAutoPostVisibility Success visibility:" + enumC1813530xIF4);
            liveReplySettingViewModel2.LLILLJJLI = enumC1813530xIF4;
            liveReplySettingViewModel2.setState(new AwS606S0100000_27(enumC1813530xIF4, 561));
        }
        LiveReplySettingViewModel liveReplySettingViewModel3 = this.LLILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj2);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeAutoPostVisibility Failure ");
            sbLIZ.append(thM5exceptionOrNullimpl.getCause());
            C20441214yg.LIZIZ("LiveReplySettingViewModel", C2188811AlT.LIZIZ(sbLIZ));
            liveReplySettingViewModel3.setState(new AwS606S0100000_27(thM5exceptionOrNullimpl, 562));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveReplySettingViewModel@8dc8.changeAutoPostVisibility$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
