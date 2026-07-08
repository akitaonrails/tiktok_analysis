package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.MobileEffectExportWorkflowImpl$exportEffect$1$defferedSaveIcon$1", f = "MobileEffectExportWorkflowImpl.kt", l = {348}, m = "invokeSuspend")
public final class C1626040sPq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1622430sK1 LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ UploadableMobileEffect2 LLILZ;
    public final /* synthetic */ Bitmap LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626040sPq(InterfaceC1622430sK1 interfaceC1622430sK1, Effect effect, UploadableMobileEffect2 uploadableMobileEffect2, Bitmap bitmap, long j, InterfaceC1364105Vn<? super C1626040sPq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1622430sK1;
        this.LLILLL = effect;
        this.LLILZ = uploadableMobileEffect2;
        this.LLILZIL = bitmap;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626040sPq(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MobileEffectExportWorkflowImpl@479.exportEffect$1$defferedSaveIcon$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C201955140j.LIZIZ("MET-JEFF", "icon export started");
            InterfaceC1622430sK1 interfaceC1622430sK1 = this.LLILLJJLI;
            Effect effect = this.LLILLL;
            UploadableMobileEffect2 uploadableMobileEffect2 = this.LLILZ;
            Bitmap bitmap = this.LLILZIL;
            this.LL = 1;
            if (interfaceC1622430sK1.LIZ(effect, uploadableMobileEffect2, bitmap, this) == objLJFF) {
                C1C7U.LIZIZ("MobileEffectExportWorkflowImpl@479.exportEffect$1$defferedSaveIcon$1");
                return objLJFF;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("icon export time = ");
        sbLIZ.append((System.currentTimeMillis() - this.LLILZLL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        sbLIZ.append(" seconds");
        C201955140j.LIZIZ("MET-JEFF", C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MobileEffectExportWorkflowImpl@479.exportEffect$1$defferedSaveIcon$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
