package X;

import android.util.Log;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ei9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.restore.DraftAlgorithmModelRestoreHandler$restoreWithNet$2$3", f = "DraftAlgorithmModelRestoreHandler.kt", l = {105}, m = "invokeSuspend")
public final class C371950Ei9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DraftFileRestoreResult>, Object> {
    public int LL;
    public final /* synthetic */ C371970EiB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C371950Ei9(C371970EiB c371970EiB, InterfaceC1364105Vn<? super C371950Ei9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c371970EiB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C371950Ei9(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftAlgorithmModelRestoreHandler@5648.restoreWithNet$2$3");
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
            final C371970EiB c371970EiB = this.LLILLJJLI;
            this.LL = 1;
            c371970EiB.getClass();
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DraftAlgorithmModelRestoreHandler");
            sbLIZ.append(" ; restore requirement and model start ...");
            C0M7M.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames((String[]) c371970EiB.LJ.getFirst().toArray(new String[0]), c371970EiB.LJ.getSecond(), new IFetchResourceListener() { // from class: X.0EiC
                @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                public final void onFailure(Exception exc) {
                    AudioEnhanceParam audioEnhanceParamCopy;
                    if (!c2252611DEt.isActive()) {
                        return;
                    }
                    AwemeDraft awemeDraft = c371970EiB.LIZ.LJ;
                    AudioEnhanceParam audioEnhanceParam = awemeDraft.LJJJJIZL.audioEnhanceParam;
                    if (audioEnhanceParam != null) {
                        audioEnhanceParamCopy = audioEnhanceParam.copy(audioEnhanceParam.supportOriginEnhance, audioEnhanceParam.supportMusicEnhance, false, false);
                    } else {
                        audioEnhanceParamCopy = null;
                    }
                    awemeDraft.LJJJJIZL.audioEnhanceParam = audioEnhanceParamCopy;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    c371970EiB.getClass();
                    sbLIZ2.append("DraftAlgorithmModelRestoreHandler");
                    sbLIZ2.append(" ; restore requirement and model failed ..., exception : ");
                    sbLIZ2.append(Log.getStackTraceString(exc));
                    C0M7M.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    InterfaceC20236714Gf<DraftFileRestoreResult> interfaceC20236714Gf = c2252611DEt;
                    DraftFileRestoreResult draftFileRestoreResultLJI = c371970EiB.LJI(2131832433, false, new DraftFileRestoreException(-3001, exc, "Algorithm"));
                    C189200o6.m2constructorimpl(draftFileRestoreResultLJI);
                    interfaceC20236714Gf.resumeWith(draftFileRestoreResultLJI);
                }

                @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                public final void onSuccess(long j) {
                    if (!c2252611DEt.isActive()) {
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    c371970EiB.getClass();
                    sbLIZ2.append("DraftAlgorithmModelRestoreHandler");
                    sbLIZ2.append(" ; restore requirement and model success ...");
                    C0M7M.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    InterfaceC20236714Gf<DraftFileRestoreResult> interfaceC20236714Gf = c2252611DEt;
                    DraftFileRestoreResult draftFileRestoreResultLJI = c371970EiB.LJI(null, false, new DraftFileRestoreException(0, null, "Unknown"));
                    C189200o6.m2constructorimpl(draftFileRestoreResultLJI);
                    interfaceC20236714Gf.resumeWith(draftFileRestoreResultLJI);
                }
            });
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DraftAlgorithmModelRestoreHandler@5648.restoreWithNet$2$3");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DraftAlgorithmModelRestoreHandler@5648.restoreWithNet$2$3");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DraftFileRestoreResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
