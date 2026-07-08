package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectApiModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MyEffectsResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TemplateEffectsService;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$fetchSubmittedEffects$2", f = "MyEffectsViewModel.kt", l = {255}, m = "invokeSuspend")
public final class C318900Cem extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends MobileEffect>>, Object> {
    public int LL;
    public final /* synthetic */ MyEffectsViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318900Cem(MyEffectsViewModel myEffectsViewModel, InterfaceC1364105Vn<? super C318900Cem> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = myEffectsViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318900Cem(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MyEffectsResponse myEffectsResponse;
        int i;
        List<MobileEffectApiModel> list;
        File effectDir;
        C1C7U.LIZ("MyEffectsViewModel@4e1b.fetchSubmittedEffects$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        String absolutePath = null;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                TemplateEffectsService templateEffectsService = this.LLILLJJLI.LLJJLIIIJLLLLLLLZ;
                this.LL = 1;
                obj = templateEffectsService.getMyEffects(C19221910Hx.LIZIZ(), this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MyEffectsViewModel@4e1b.fetchSubmittedEffects$2");
                    return objLJFF;
                }
            }
            myEffectsResponse = (MyEffectsResponse) obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            myEffectsResponse = null;
        }
        StringBuilder sb = new StringBuilder("Load myEffect list: ");
        int i3 = -1;
        if (myEffectsResponse != null) {
            i = myEffectsResponse.status_code;
        } else {
            i = -1;
        }
        sb.append(i);
        sb.append(", ");
        if (myEffectsResponse != null) {
            i3 = myEffectsResponse.error_code;
        }
        sb.append(i3);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("DiyProp", sb.toString());
        if (myEffectsResponse != null) {
            list = myEffectsResponse.effects;
        } else {
            list = null;
        }
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (MobileEffectApiModel mobileEffectApiModel : list) {
            MobileEffect.Companion.getClass();
            arrayList.add(new MobileEffect(mobileEffectApiModel.effect, mobileEffectApiModel.moderationStatus, mobileEffectApiModel.templateInfo, 2));
        }
        EffectConfiguration effectConfigurationLJJIIZ = this.LLILLJJLI.LL.getStickerRepository().LJIJJ().LJJIIZ();
        if (effectConfigurationLJJIIZ != null && (effectDir = effectConfigurationLJJIIZ.getEffectDir()) != null) {
            absolutePath = effectDir.getAbsolutePath();
        }
        if (absolutePath != null) {
            C13LD c13ld = C13LD.LIZ;
            String strLIZIZ = C1630860sXc.LIZIZ();
            c13ld.getClass();
            C13LD.LJIILIIL(absolutePath, strLIZIZ, "", arrayList);
        }
        C1C7U.LIZIZ("MyEffectsViewModel@4e1b.fetchSubmittedEffects$2");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends MobileEffect>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
