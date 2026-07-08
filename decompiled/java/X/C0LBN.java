package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LBN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.restore.DraftCreativeRestoreHandlerKt$restoreAutoCutTemplate$2", f = "DraftCreativeRestoreHandler.kt", l = {841, 842}, m = "invokeSuspend")
public final class C0LBN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DraftFileRestoreResult>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AwemeDraft LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LBN(AwemeDraft awemeDraft, InterfaceC1364105Vn<? super C0LBN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = awemeDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0LBN c0lbn = new C0LBN(this.LLILLL, interfaceC1364105Vn);
        c0lbn.LLILLJJLI = obj;
        return c0lbn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i;
        String str;
        String str2;
        boolean z2;
        AnonymousClass0957 anonymousClass0957LIZIZ;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutTemplate$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    C155000ia.LIZIZ(objLJLIIIL);
                    C1C7U.LIZIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutTemplate$2");
                    return objLJLIIIL;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anonymousClass0957LIZIZ = (AnonymousClass0957) this.LLILLJJLI;
            C155000ia.LIZIZ(objLJLIIIL);
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "DraftCreativeRestoreHandler#restoreAutoCutCCAndPUGCTemplate");
            if (s.LJIIIIZZ(this.LLILLL.LIZ.pugcTemplateData.isFromCreateTemplate) && this.LLILLL.LJIIIIZZ()) {
                String str3 = this.LLILLL.LJIIJJI;
                boolean zLIZIZ = false;
                if (str3 != null && str3.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    AutoCutModel autoCutModel = this.LLILLL.LIZ.autoCutModel;
                    AutoCutThemeData autoCutThemeDataLJJIII = s.LJJIII(autoCutModel.curIndexFromSource, this.LLILLL.LIZ.autoCutModel, C1416110mxF.LJIIJJI(autoCutModel.curSource));
                    if (autoCutThemeDataLJJIII != null) {
                        i = autoCutThemeDataLJJIII.templateType;
                    } else {
                        i = -1;
                    }
                    List<String> list = C570200MXy.LIZ;
                    C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                    c13dvLIZIZ.add(Integer.valueOf(EnumC1412640mre.CUT_SAME.getValue()));
                    c13dvLIZIZ.add(Integer.valueOf(EnumC1412640mre.PUGC_TEMPLATE.getValue()));
                    c13dvLIZIZ.add(Integer.valueOf(EnumC1412640mre.AIGT.getValue()));
                    c13dvLIZIZ.add(Integer.valueOf(EnumC1412640mre.SGT.getValue()));
                    if (((Boolean) C267560AeA.LIZ.getValue()).booleanValue()) {
                        c13dvLIZIZ.add(Integer.valueOf(EnumC1412640mre.UGC_TEMPLATE.getValue()));
                    }
                    if (!C1697820uHc.LIZ(c13dvLIZIZ).contains(C2286608xc.LJ(i))) {
                        DraftFileRestoreResult draftFileRestoreResult = new DraftFileRestoreResult(4, LSPassThroughRecordSizeConfig.DEFAULT, null, false, new DraftFileRestoreException(0, null, "Unknown"));
                        C1C7U.LIZIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutTemplate$2");
                        return draftFileRestoreResult;
                    }
                    if (autoCutThemeDataLJJIII != null) {
                        str = autoCutThemeDataLJJIII.templateUrl;
                    } else {
                        str = null;
                    }
                    if (autoCutThemeDataLJJIII != null) {
                        str2 = autoCutThemeDataLJJIII.templateId;
                    } else {
                        str2 = null;
                    }
                    if (str != null && str.length() != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        try {
                            zLIZIZ = C036E.LIZ.LIZIZ();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (zLIZIZ) {
                            anonymousClass0957LIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C0LBM(str, i, autoCutThemeDataLJJIII, null), 3);
                            C0LCY.LIZ.getClass();
                            C0LCY.LIZJ(autoCutThemeDataLJJIII, "draft_recover");
                            if (!C1417320mzC.LIZ(autoCutThemeDataLJJIII)) {
                                autoCutThemeDataLJJIII = null;
                            }
                            if (autoCutThemeDataLJJIII != null) {
                                C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C537660L6u(str2, autoCutThemeDataLJJIII, null), 3);
                                this.LLILLJJLI = anonymousClass0957LIZIZ;
                                this.LL = 1;
                                if (c099gLIZIZ.LJLIIIL(this) == objLJFF) {
                                    C1C7U.LIZIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutTemplate$2");
                                    return objLJFF;
                                }
                            }
                        }
                    }
                    DraftFileRestoreResult draftFileRestoreResult2 = new DraftFileRestoreResult(4, LSPassThroughRecordSizeConfig.DEFAULT, C2286608xc.LJ(2131832448), true, new DraftFileRestoreException(-3004, null, "AutoCut"));
                    C1C7U.LIZIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutTemplate$2");
                    return draftFileRestoreResult2;
                }
            }
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "DraftCreativeRestoreHandler#restoreAutoCutCCAndPUGCTemplate no need to restore");
            DraftFileRestoreResult draftFileRestoreResult3 = new DraftFileRestoreResult(4, LSPassThroughRecordSizeConfig.DEFAULT, null, false, new DraftFileRestoreException(0, null, "Unknown"));
            C1C7U.LIZIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutTemplate$2");
            return draftFileRestoreResult3;
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        objLJLIIIL = anonymousClass0957LIZIZ.LJLIIIL(this);
        if (objLJLIIIL == objLJFF) {
            C1C7U.LIZIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutTemplate$2");
            return objLJFF;
        }
        C1C7U.LIZIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutTemplate$2");
        return objLJLIIIL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DraftFileRestoreResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
