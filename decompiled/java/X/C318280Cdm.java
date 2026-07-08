package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.effectcreator.IEffectCreatorService;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TTEPEffectServiceUtilKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Cdm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$deleteMyEffectData$1", f = "MyEffectsViewModel.kt", l = {442}, m = "invokeSuspend")
public final class C318280Cdm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ MyEffectsViewModel LLILLL;
    public final /* synthetic */ Pair<Effect, Integer> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C318280Cdm(Effect effect, MyEffectsViewModel myEffectsViewModel, Pair<? extends Effect, Integer> pair, InterfaceC1364105Vn<? super C318280Cdm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effect;
        this.LLILLL = myEffectsViewModel;
        this.LLILZ = pair;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318280Cdm(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MobileEffect mobileEffect;
        boolean z;
        int source;
        InterfaceC318260Cdk interfaceC318260CdkDraftService;
        DraftEffect next;
        CKEDraftInfo draft;
        C1C7U.LIZ("MyEffectsViewModel@4e1b.deleteMyEffectData$1");
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
                Effect effect = this.LLILLJJLI;
                String draftId = null;
                if (effect instanceof MobileEffect) {
                    mobileEffect = (MobileEffect) effect;
                } else {
                    mobileEffect = null;
                }
                if (mobileEffect != null && mobileEffect.getModerationStatus() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    List<DraftEffect> value = this.LLILLL.LLJJL.getValue();
                    if (value != null) {
                        Effect effect2 = this.LLILLJJLI;
                        Iterator<DraftEffect> it2 = value.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(next.getDraft().getEffectId(), effect2.getEffectId())) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        DraftEffect draftEffect = next;
                        if (draftEffect != null && (draft = draftEffect.getDraft()) != null) {
                            draftId = draft.getDraftId();
                        }
                    }
                    if (draftId != null) {
                        this.LLILLL.getClass();
                        IEffectCreatorService iEffectCreatorServiceEQ2 = MyEffectsViewModel.EQ2();
                        if (iEffectCreatorServiceEQ2 != null && (interfaceC318260CdkDraftService = iEffectCreatorServiceEQ2.draftService()) != null) {
                            interfaceC318260CdkDraftService.LJIIIIZZ(C0CHQ.LIZ, draftId);
                        }
                    }
                    source = -1;
                } else {
                    source = this.LLILLJJLI.getSource();
                }
                String effectId = this.LLILLJJLI.getEffectId();
                this.LL = 1;
                obj = TTEPEffectServiceUtilKt.deleteMobileEffect(effectId, source, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MyEffectsViewModel@4e1b.deleteMyEffectData$1");
                    return objLJFF;
                }
            }
            MobileEffectResponse mobileEffectResponse = (MobileEffectResponse) obj;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Delete effect status code: ");
            sbLIZ.append(mobileEffectResponse.statusCode);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", C2188811AlT.LIZIZ(sbLIZ));
            if (mobileEffectResponse.statusCode == 0) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MyEffectsViewModel@4e1b.deleteMyEffectData$1");
                return unit;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("DiyProp", e.getMessage());
        }
        this.LLILLL.LLJJJJLIIL.setValue(this.LLILZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MyEffectsViewModel@4e1b.deleteMyEffectData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
