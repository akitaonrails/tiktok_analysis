package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.agegate.data.BirthdayCelebrationSettingsApi;
import com.ss.android.ugc.aweme.compliance.agegate.data.TikTokAgeCelebrateBirthdayUpdateRequest;
import com.ss.android.ugc.aweme.compliance.agegate.view.BirthdaySettingsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wYY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.agegate.view.BirthdaySettingsViewModel$updateSetting$1$1", f = "BirthdaySettingsViewModel.kt", l = {38}, m = "invokeSuspend")
public final class C1785200wYY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ BirthdaySettingsViewModel LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785200wYY(int i, BirthdaySettingsViewModel birthdaySettingsViewModel, boolean z, InterfaceC1364105Vn<? super C1785200wYY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = birthdaySettingsViewModel;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1785200wYY c1785200wYY = new C1785200wYY(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1785200wYY.LLILLJJLI = obj;
        return c1785200wYY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("BirthdaySettingsViewModel@f953.updateSetting$1$1");
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
                int i2 = this.LLILLL;
                C1785210wYZ c1785210wYZ = BirthdayCelebrationSettingsApi.LIZ;
                this.LL = 1;
                c1785210wYZ.getClass();
                obj = C1785210wYZ.LIZIZ.getValue().updateCelebrateBirthday(new TikTokAgeCelebrateBirthdayUpdateRequest(C2286608xc.LJ(i2)), this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BirthdaySettingsViewModel@f953.updateSetting$1$1");
                    return objLJFF;
                }
            }
            c098200Yq = (BaseResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        BirthdaySettingsViewModel birthdaySettingsViewModel = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            birthdaySettingsViewModel.LLJIJIL.setValue(new C1836600xtS(thM5exceptionOrNullimpl.getMessage()));
        }
        BirthdaySettingsViewModel birthdaySettingsViewModel2 = this.LLILZ;
        boolean z = this.LLILZIL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            birthdaySettingsViewModel2.LLJIJIL.setValue(new C1836590xtR(z));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BirthdaySettingsViewModel@f953.updateSetting$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
