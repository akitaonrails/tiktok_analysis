package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2VM;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffectIconResponse;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.service.TTEPEffectServiceUtilKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0CyL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2VM$getIconInfo$1", f = "EffectEditV2VM.kt", l = {192}, m = "invokeSuspend")
public final class C331030CyL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public EffectEditV2VM LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ EffectEditV2VM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331030CyL(String str, EffectEditV2VM effectEditV2VM, InterfaceC1364105Vn<? super C331030CyL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = effectEditV2VM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331030CyL(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        EffectEditV2VM effectEditV2VM;
        MobileEffectIconResponse mobileEffectIconResponse;
        C1C7U.LIZ("EffectEditV2VM@5973.getIconInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    effectEditV2VM = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                String str = this.LLILLL;
                effectEditV2VM = this.LLILZ;
                this.LL = effectEditV2VM;
                this.LLILLJJLI = 1;
                obj = TTEPEffectServiceUtilKt.fetchEffectIconInfo(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EffectEditV2VM@5973.getIconInfo$1");
                    return objLJFF;
                }
            }
            mobileEffectIconResponse = (MobileEffectIconResponse) obj;
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get icon info ");
            sbLIZ.append(mobileEffectIconResponse);
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (mobileEffectIconResponse.errorCode != 0) {
            effectEditV2VM.setState(AFwS232S0000000_4.get$arr$(56));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EffectEditV2VM@5973.getIconInfo$1");
            return unit;
        }
        effectEditV2VM.setState(new AwS583S0100000_4(mobileEffectIconResponse, 105));
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        EffectEditV2VM effectEditV2VM2 = this.LLILZ;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            effectEditV2VM2.setState(AFwS232S0000000_4.get$arr$(57));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EffectEditV2VM@5973.getIconInfo$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
