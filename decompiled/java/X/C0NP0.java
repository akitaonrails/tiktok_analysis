package X;

import com.ss.android.ugc.aweme.im.common.experiment.ImSpecialEffectsFrequencyControlSettings;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NP0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.IMEffectNoticeViewModel$tryTriggerEffectForNewMessage$1", f = "IMEffectNoticeViewModel.kt", l = {251, 260}, m = "invokeSuspend")
public final class C0NP0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ IMEffectNoticeViewModel LLILLL;
    public final /* synthetic */ C0NPA LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NP0(IMEffectNoticeViewModel iMEffectNoticeViewModel, C0NPA c0npa, String str, String str2, InterfaceC1364105Vn<? super C0NP0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = iMEffectNoticeViewModel;
        this.LLILZ = c0npa;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NP0(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        Object objVQ2 = obj;
        C1C7U.LIZ("IMEffectNoticeViewModel@2d.tryTriggerEffectForNewMessage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objVQ2);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMEffectNoticeViewModel@2d.tryTriggerEffectForNewMessage$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = this.LL;
            C155000ia.LIZIZ(objVQ2);
        } else {
            C155000ia.LIZIZ(objVQ2);
            jCurrentTimeMillis = System.currentTimeMillis();
            long jLIZ = C0NP2.LIZ(ImSpecialEffectsFrequencyControlSettings.LIZ().shareAgainValidityWindow);
            IMEffectNoticeViewModel iMEffectNoticeViewModel = this.LLILLL;
            C0NPA c0npa = this.LLILZ;
            String str = this.LLILZIL;
            String str2 = this.LLILZLL;
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            objVQ2 = iMEffectNoticeViewModel.vQ2(c0npa, str, jCurrentTimeMillis, jLIZ, str2, this);
            if (objVQ2 == objLJFF) {
                C1C7U.LIZIZ("IMEffectNoticeViewModel@2d.tryTriggerEffectForNewMessage$1");
                return objLJFF;
            }
        }
        if (!((Boolean) objVQ2).booleanValue()) {
            IMEffectNoticeViewModel iMEffectNoticeViewModel2 = this.LLILLL;
            String str3 = this.LLILZIL;
            String str4 = this.LLILZLL;
            this.LLILLJJLI = 2;
            if (iMEffectNoticeViewModel2.wQ2(str3, jCurrentTimeMillis, str4, this) == objLJFF) {
                C1C7U.LIZIZ("IMEffectNoticeViewModel@2d.tryTriggerEffectForNewMessage$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMEffectNoticeViewModel@2d.tryTriggerEffectForNewMessage$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
