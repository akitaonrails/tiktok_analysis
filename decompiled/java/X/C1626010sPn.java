package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.MobileEffectExportWorkflowImpl$exportIconOnly$1", f = "MobileEffectExportWorkflowImpl.kt", l = {309, 311}, m = "invokeSuspend")
public final class C1626010sPn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1622410sJz LLILLJJLI;
    public final /* synthetic */ UploadableMobileEffect2 LLILLL;
    public final /* synthetic */ InterfaceC1622430sK1 LLILZ;
    public final /* synthetic */ Effect LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626010sPn(C1622410sJz c1622410sJz, UploadableMobileEffect2 uploadableMobileEffect2, InterfaceC1622430sK1 interfaceC1622430sK1, Effect effect, InterfaceC1364105Vn<? super C1626010sPn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1622410sJz;
        this.LLILLL = uploadableMobileEffect2;
        this.LLILZ = interfaceC1622430sK1;
        this.LLILZIL = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626010sPn(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MobileEffectExportWorkflowImpl@479.exportIconOnly$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MobileEffectExportWorkflowImpl@479.exportIconOnly$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1622410sJz c1622410sJz = this.LLILLJJLI;
            String str = this.LLILLL.effectId;
            this.LL = 1;
            c1622410sJz.getClass();
            if (C23250099c.LJI(this, C0PEM.LIZJ, new C1626020sPo(c1622410sJz, str, true, null)) == objLJFF) {
                C1C7U.LIZIZ("MobileEffectExportWorkflowImpl@479.exportIconOnly$1");
                return objLJFF;
            }
        }
        InterfaceC1622430sK1 interfaceC1622430sK1 = this.LLILZ;
        Effect effect = this.LLILZIL;
        UploadableMobileEffect2 uploadableMobileEffect2 = this.LLILLL;
        this.LL = 2;
        if (interfaceC1622430sK1.LIZ(effect, uploadableMobileEffect2, null, this) == objLJFF) {
            C1C7U.LIZIZ("MobileEffectExportWorkflowImpl@479.exportIconOnly$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MobileEffectExportWorkflowImpl@479.exportIconOnly$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
