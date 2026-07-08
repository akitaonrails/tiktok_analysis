package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.v2.base.AvailableWaysViewModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iEw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.v2.base.AvailableWaysViewModel$getAvailableWaysForPhoneLoginEntrypointInEmailLogin$1", f = "AvailableWaysViewModel.kt", l = {84}, m = "invokeSuspend")
public final class C1234880iEw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ Map<String, AvailableWaysViewModel.AvailableWays> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ AvailableWaysViewModel LLILZIL;
    public final /* synthetic */ C118300cf LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1234880iEw(C118300cf c118300cf, Map<String, AvailableWaysViewModel.AvailableWays> map, String str, AvailableWaysViewModel availableWaysViewModel, C118300cf c118300cf2, String str2, String str3, String str4, String str5, String str6, InterfaceC1364105Vn<? super C1234880iEw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c118300cf;
        this.LLILLL = map;
        this.LLILZ = str;
        this.LLILZIL = availableWaysViewModel;
        this.LLILZLL = c118300cf2;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = str5;
        this.LLJIJIL = str6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1234880iEw(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AvailableWaysViewModel@9c.getAvailableWaysForPhoneLoginEntrypointInEmailLogin$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    C1234870iEv c1234870iEv = new C1234870iEv(this.LLJIJIL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZLL, null);
                    this.LL = 1;
                    if (C099A.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, c1234870iEv, this) == objLJFF) {
                        C1C7U.LIZIZ("AvailableWaysViewModel@9c.getAvailableWaysForPhoneLoginEntrypointInEmailLogin$1");
                        return objLJFF;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILLJJLI.element = 2;
                this.LLILLL.put(this.LLILZ, new AvailableWaysViewModel.AvailableWays(false, null, true, false));
            }
            AvailableWaysViewModel availableWaysViewModel = this.LLILZIL;
            int i2 = this.LLILLJJLI.element;
            int i3 = this.LLILZLL.element;
            String str = this.LLIZ;
            String str2 = this.LLIZLLLIL;
            String str3 = this.LLJ;
            String str4 = this.LLJI;
            availableWaysViewModel.getClass();
            AvailableWaysViewModel.xQ2(i2, i3, str, str2, str3, str4);
            this.LLILZIL.LL.postValue(this.LLILLL);
            Keva keva = AvailableWaysViewModel.LLILLL;
            String str5 = this.LLILZ;
            C1227904rF c1227904rF = C1227904rF.LIZ;
            AvailableWaysViewModel.AvailableWays availableWays = this.LLILLL.get(str5);
            c1227904rF.getClass();
            keva.storeString(str5, C1227904rF.LJI(availableWays));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AvailableWaysViewModel@9c.getAvailableWaysForPhoneLoginEntrypointInEmailLogin$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AvailableWaysViewModel availableWaysViewModel2 = this.LLILZIL;
            int i4 = this.LLILLJJLI.element;
            int i5 = this.LLILZLL.element;
            String str6 = this.LLIZ;
            String str7 = this.LLIZLLLIL;
            String str8 = this.LLJ;
            String str9 = this.LLJI;
            availableWaysViewModel2.getClass();
            AvailableWaysViewModel.xQ2(i4, i5, str6, str7, str8, str9);
            this.LLILZIL.LL.postValue(this.LLILLL);
            Keva keva2 = AvailableWaysViewModel.LLILLL;
            String str10 = this.LLILZ;
            C1227904rF c1227904rF2 = C1227904rF.LIZ;
            AvailableWaysViewModel.AvailableWays availableWays2 = this.LLILLL.get(str10);
            c1227904rF2.getClass();
            keva2.storeString(str10, C1227904rF.LJI(availableWays2));
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
