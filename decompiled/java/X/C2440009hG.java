package X;

import Y.ARunnableS37S1200000_35;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.09hG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.exportutils.AnnotationExportUtils$Companion$saveSticker$result$1", f = "AnnotationExportUtils.kt", l = {31}, m = "invokeSuspend")
public final class C2440009hG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super UIAnnotationErrorCode>, Object> {
    public int LL;
    public final /* synthetic */ C1DPK LLILLJJLI;
    public final /* synthetic */ UploadableMobileEffect2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2440009hG(C1DPK c1dpk, UploadableMobileEffect2 uploadableMobileEffect2, InterfaceC1364105Vn<? super C2440009hG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1dpk;
        this.LLILLL = uploadableMobileEffect2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2440009hG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnnotationExportUtils$Companion@9867.saveSticker$result$1");
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
            C1DPK c1dpk = this.LLILLJJLI;
            UploadableMobileEffect2 uploadableMobileEffect2 = this.LLILLL;
            this.LL = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            String str = uploadableMobileEffect2.zipFilePath;
            if (c1dpk == null) {
                UIAnnotationErrorCode uIAnnotationErrorCode = UIAnnotationErrorCode.UIAnnotationErrorCode_ParseFailed;
                C189200o6.m2constructorimpl(uIAnnotationErrorCode);
                c23260099m.resumeWith(uIAnnotationErrorCode);
            } else {
                final AwS582S0100000_3 awS582S0100000_3 = new AwS582S0100000_3(c23260099m, 17);
                C823050WQl.LIZJ().execute(new ARunnableS37S1200000_35(c1dpk, str, new C1DO8() { // from class: X.09hF
                    @Override // X.C1DO9
                    public final void onSuccess() {
                        awS582S0100000_3.invoke(null);
                    }

                    @Override // X.C1DO7
                    public final void LIZ(UIAnnotationErrorCode uIAnnotationErrorCode2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("DiyPropParser#saveSticker errorCode:");
                        sbLIZ.append(uIAnnotationErrorCode2);
                        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("DiyProp", C2188811AlT.LIZIZ(sbLIZ));
                        if (uIAnnotationErrorCode2 != UIAnnotationErrorCode.UIAnnotationErrorCode_RemoveTempPathFailed) {
                            awS582S0100000_3.invoke(uIAnnotationErrorCode2);
                        }
                    }
                }, 2));
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AnnotationExportUtils$Companion@9867.saveSticker$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AnnotationExportUtils$Companion@9867.saveSticker$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super UIAnnotationErrorCode> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
