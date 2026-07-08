package X;

import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TTEPEffectServiceUtilKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cdl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$deleteDraftEffect$1", f = "MyEffectsViewModel.kt", l = {466}, m = "invokeSuspend")
public final class C318270Cdl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftEffect LLILLJJLI;
    public final /* synthetic */ IEffectCreatorService LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318270Cdl(DraftEffect draftEffect, IEffectCreatorService iEffectCreatorService, InterfaceC1364105Vn<? super C318270Cdl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftEffect;
        this.LLILLL = iEffectCreatorService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318270Cdl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MyEffectsViewModel@4e1b.deleteDraftEffect$1");
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
                String effectId = this.LLILLJJLI.getEffectId();
                this.LL = 1;
                obj = TTEPEffectServiceUtilKt.deleteMobileEffect(effectId, -2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MyEffectsViewModel@4e1b.deleteDraftEffect$1");
                    return objLJFF;
                }
            }
            IEffectCreatorService iEffectCreatorService = this.LLILLL;
            DraftEffect draftEffect = this.LLILLJJLI;
            MobileEffectResponse mobileEffectResponse = (MobileEffectResponse) obj;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Delete effect status code: ");
            sbLIZ.append(mobileEffectResponse.statusCode);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", C2188811AlT.LIZIZ(sbLIZ));
            if (mobileEffectResponse.statusCode == 0) {
                Application application = C0CHQ.LIZ;
                InterfaceC318260Cdk interfaceC318260CdkDraftService = iEffectCreatorService.draftService();
                if (interfaceC318260CdkDraftService != null) {
                    interfaceC318260CdkDraftService.LJIIIIZZ(application, draftEffect.getDraft().getDraftId());
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MyEffectsViewModel@4e1b.deleteDraftEffect$1");
                return unit;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("DiyProp", e.getMessage());
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MyEffectsViewModel@4e1b.deleteDraftEffect$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
