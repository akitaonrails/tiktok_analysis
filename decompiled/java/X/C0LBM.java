package X;

import android.app.Application;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.CutSourceType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LBM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.restore.DraftCreativeRestoreHandlerKt$restoreAutoCutTemplate$2$templateResult$1", f = "DraftCreativeRestoreHandler.kt", l = {832}, m = "invokeSuspend")
public final class C0LBM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DraftFileRestoreResult>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ AutoCutThemeData LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LBM(String str, int i, AutoCutThemeData autoCutThemeData, InterfaceC1364105Vn<? super C0LBM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = autoCutThemeData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LBM(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIJ = obj;
        C1C7U.LIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutTemplate$2$templateResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            String str = this.LLILLJJLI;
            int i2 = this.LLILLL;
            AutoCutThemeData autoCutThemeData = this.LLILZ;
            this.LL = 1;
            List<String> list = C570200MXy.LIZ;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C0FGC.LIZ(2);
            C1419810n3D.LIZJ(null);
            C1418000n0I c1418000n0I = C1418000n0I.LIZ;
            CutSource cutSource = new CutSource(str, CutSourceType.URL);
            Application application = C0CHQ.LIZ;
            boolean zLIZ = C1417320mzC.LIZ(autoCutThemeData);
            NLEPrepareListener nLEPrepareListener = new NLEPrepareListener() { // from class: X.0FQ4
                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onProgress(float f, String str2) {
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onSuccess(NLETemplateModel nLETemplateModel) {
                    if (nLETemplateModel != null) {
                        s.LIZ.getClass();
                        s.LJIIJJI(nLETemplateModel);
                    }
                    InterfaceC20236714Gf<DraftFileRestoreResult> interfaceC20236714Gf = c2252611DEt;
                    DraftFileRestoreResult draftFileRestoreResult = new DraftFileRestoreResult(4, LSPassThroughRecordSizeConfig.DEFAULT, null, false, new DraftFileRestoreException(0, null, "Unknown"));
                    C189200o6.m2constructorimpl(draftFileRestoreResult);
                    interfaceC20236714Gf.resumeWith(draftFileRestoreResult);
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onError(int i3, String str2) {
                    InterfaceC20236714Gf<DraftFileRestoreResult> interfaceC20236714Gf = c2252611DEt;
                    DraftFileRestoreResult draftFileRestoreResult = new DraftFileRestoreResult(4, LSPassThroughRecordSizeConfig.DEFAULT, 2131832448, true, new DraftFileRestoreException(-3004, null, "AutoCut"));
                    C189200o6.m2constructorimpl(draftFileRestoreResult);
                    interfaceC20236714Gf.resumeWith(draftFileRestoreResult);
                }
            };
            c1418000n0I.getClass();
            C1418000n0I.LIZ(cutSource, application, "", false, i2, zLIZ, nLEPrepareListener, null, null);
            objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutTemplate$2$templateResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutTemplate$2$templateResult$1");
        return objLJIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DraftFileRestoreResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
