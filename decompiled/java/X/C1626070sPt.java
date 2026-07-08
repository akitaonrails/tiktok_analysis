package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.effectlogic.AMEDraftEffectExportLogic$saveZip$2", f = "AMEDraftEffectExportLogic.kt", l = {}, m = "invokeSuspend")
public final class C1626070sPt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super UIAnnotationErrorCode>, Object> {
    public final /* synthetic */ UploadableMobileEffect2 LL;
    public final /* synthetic */ C1624760sNm LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1626070sPt(UploadableMobileEffect2 uploadableMobileEffect2, C1624760sNm c1624760sNm, InterfaceC1364105Vn<? super C1626070sPt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = uploadableMobileEffect2;
        this.LLILLJJLI = c1624760sNm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1626070sPt(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        UIAnnotationErrorCode uIAnnotationErrorCode;
        C1C7U.LIZ("AMEDraftEffectExportLogic@8ac0.saveZip$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C08SB.LJ(this.LL.zipFilePath, C1736660vIG.LIZIZ(this.LLILLJJLI.LIZ.getDraft()))) {
            uIAnnotationErrorCode = null;
        } else {
            uIAnnotationErrorCode = UIAnnotationErrorCode.UIAnnotationErrorCode_ZipFailed;
        }
        C1C7U.LIZIZ("AMEDraftEffectExportLogic@8ac0.saveZip$2");
        return uIAnnotationErrorCode;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super UIAnnotationErrorCode> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
