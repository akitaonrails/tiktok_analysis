package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.effectlogic.AMEDraftEffectExportLogic$saveIcon$2", f = "AMEDraftEffectExportLogic.kt", l = {}, m = "invokeSuspend")
public final class C1626080sPu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1624760sNm LL;
    public final /* synthetic */ UploadableMobileEffect2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626080sPu(UploadableMobileEffect2 uploadableMobileEffect2, C1624760sNm c1624760sNm, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1624760sNm;
        this.LLILLJJLI = uploadableMobileEffect2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626080sPu(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AMEDraftEffectExportLogic@8ac0.saveIcon$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C08QA.LJIILLIIL(new C0VSJ(C1736660vIG.LIZJ(this.LL.LIZ.getDraft())), new C0VSJ(this.LLILLJJLI.iconFilePath), false, 6);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AMEDraftEffectExportLogic@8ac0.saveIcon$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
