package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.prop.presenter.MobileEffectViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TTEPEffectServiceUtilKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CeC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.presenter.MobileEffectViewModel$deleteEffect$1", f = "MobileEffectViewModel.kt", l = {48}, m = "invokeSuspend")
public final class C318540CeC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MobileEffectViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318540CeC(MobileEffectViewModel mobileEffectViewModel, String str, int i, InterfaceC1364105Vn<? super C318540CeC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mobileEffectViewModel;
        this.LLILLL = str;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318540CeC(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MobileEffectViewModel@3d13.deleteEffect$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    this.LLILLJJLI.LLILZIL.setValue(C318570CeF.LIZ);
                    String str = this.LLILLL;
                    int i2 = this.LLILZ;
                    this.LL = 1;
                    obj = TTEPEffectServiceUtilKt.deleteMobileEffect(str, i2, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("MobileEffectViewModel@3d13.deleteEffect$1");
                        return objLJFF;
                    }
                }
                MobileEffectResponse mobileEffectResponse = (MobileEffectResponse) obj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Delete effect status code: ");
                sbLIZ.append(mobileEffectResponse.statusCode);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", C2188811AlT.LIZIZ(sbLIZ));
                if (mobileEffectResponse.statusCode == 0) {
                    this.LLILLJJLI.LLILLL.LJIIJ(C318600CeI.LIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Delete effect status code: ");
                    sbLIZ2.append(mobileEffectResponse.errorCode);
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", C2188811AlT.LIZIZ(sbLIZ2));
                    this.LLILLJJLI.LLILLL.LJIIJ(new AbstractC318590CeH() { // from class: X.0CeG
                    });
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILLJJLI.LLILLL.LJIIJ(new AbstractC318590CeH() { // from class: X.0CeG
                });
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("error: ");
                sbLIZ3.append(e);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("DiyProp", C2188811AlT.LIZIZ(sbLIZ3));
            }
            this.LLILLJJLI.LLILZIL.setValue(new AbstractC318560CeE() { // from class: X.0CeD
            });
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MobileEffectViewModel@3d13.deleteEffect$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LLILZIL.setValue(new AbstractC318560CeE() { // from class: X.0CeD
            });
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
