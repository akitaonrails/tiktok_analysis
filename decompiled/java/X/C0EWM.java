package X;

import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreException;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EWM, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EWM implements IFetchEffectListByIdsListener {
    public final /* synthetic */ C0EWN LIZ;
    public final /* synthetic */ InterfaceC20236714Gf<List<DraftFileRestoreResult>> LIZIZ;

    public final void LIZ(ExceptionResult exceptionResult) {
        Integer numValueOf;
        String msg;
        String logId;
        int errorCode;
        C13RX c13rx = C13RX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftCutoutStrokeRestoreHandler ; fileType : ");
        this.LIZ.getClass();
        sbLIZ.append(24);
        sbLIZ.append(" ; restore failed ... ; e : ");
        Exception exception = null;
        if (exceptionResult != null) {
            numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(' ');
        if (exceptionResult != null) {
            msg = exceptionResult.getMsg();
        } else {
            msg = null;
        }
        sbLIZ.append(msg);
        sbLIZ.append(' ');
        if (exceptionResult != null) {
            logId = exceptionResult.getLogId();
        } else {
            logId = null;
        }
        sbLIZ.append(logId);
        C201955140j.LIZJ(c13rx, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC20236714Gf<List<DraftFileRestoreResult>> interfaceC20236714Gf = this.LIZIZ;
        DraftFileRestoreResult[] draftFileRestoreResultArr = new DraftFileRestoreResult[1];
        C0EWN c0ewn = this.LIZ;
        if (exceptionResult != null) {
            errorCode = exceptionResult.getErrorCode();
        } else {
            errorCode = -1;
        }
        int i = errorCode - 50000;
        if (exceptionResult != null) {
            exception = exceptionResult.getException();
        }
        draftFileRestoreResultArr[0] = c0ewn.LJI(2131832433, false, new DraftFileRestoreException(i, exception, "stroke"));
        ArrayList arrayListLJ = C1697810uHb.LJ(draftFileRestoreResultArr);
        C189200o6.m2constructorimpl(arrayListLJ);
        interfaceC20236714Gf.resumeWith(arrayListLJ);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult exceptionResult) {
        LIZ(exceptionResult);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        List<Effect> data;
        ArrayList arrayList;
        List<Effect> data2;
        EffectListResponse effectListResponse2 = effectListResponse;
        if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && !data.isEmpty()) {
            InterfaceC1635410sex interfaceC1635410sex = this.LIZ.LIZIZ;
            if (effectListResponse2 != null && (data2 = effectListResponse2.getData()) != null) {
                arrayList = new ArrayList(data2);
            } else {
                arrayList = new ArrayList();
            }
            final C0EWN c0ewn = this.LIZ;
            final InterfaceC20236714Gf<List<DraftFileRestoreResult>> interfaceC20236714Gf = this.LIZIZ;
            interfaceC1635410sex.og(arrayList, new IFetchEffectListListener() { // from class: X.0EWL
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                public final void onFail(ExceptionResult exceptionResult) {
                    this.LIZ.LIZ(exceptionResult);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(List<Effect> list) {
                    EditorProModel editorProModel;
                    List<EditorProEffectInfo> cutoutStrokeEffects;
                    String second;
                    String resourceId;
                    List<Effect> list2 = list;
                    if (list2 == null) {
                        this.LIZ.LIZ(new ExceptionResult(new IllegalArgumentException("response is null")));
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DraftCutoutStrokeRestoreHandler ; fileType : ");
                    c0ewn.getClass();
                    sbLIZ.append(24);
                    sbLIZ.append(" ; restore success ...");
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    CreativeFlowData creativeFlowData = c0ewn.LIZ.LJ.LJJJJIZL.creativeFlowData;
                    if (creativeFlowData == null || (editorProModel = creativeFlowData.getEditorProModel()) == null || (cutoutStrokeEffects = editorProModel.getCutoutStrokeEffects()) == null) {
                        return;
                    }
                    for (Effect effect : list2) {
                        for (EditorProEffectInfo editorProEffectInfo : C13LP.LLIIII(cutoutStrokeEffects)) {
                            Pair<String, String> pairLIZJ = C0FGD.LIZJ(editorProEffectInfo.getKey());
                            if (pairLIZJ != null && (second = pairLIZJ.getSecond()) != null) {
                                if (effect != null) {
                                    resourceId = effect.getResourceId();
                                } else {
                                    resourceId = null;
                                }
                                if (Intrinsics.LJFF(second, resourceId)) {
                                    cutoutStrokeEffects.remove(editorProEffectInfo);
                                    cutoutStrokeEffects.add(new EditorProEffectInfo(editorProEffectInfo.getKey(), editorProEffectInfo.getName(), effect.getUnzipPath()));
                                }
                            }
                        }
                    }
                    InterfaceC20236714Gf<List<DraftFileRestoreResult>> interfaceC20236714Gf2 = interfaceC20236714Gf;
                    ArrayList arrayListLJ = C1697810uHb.LJ(c0ewn.LJI(null, false, new DraftFileRestoreException(0, null, "Unknown")));
                    C189200o6.m2constructorimpl(arrayListLJ);
                    interfaceC20236714Gf2.resumeWith(arrayListLJ);
                }
            });
            return;
        }
        LIZ(new ExceptionResult(new IllegalArgumentException("response is null")));
    }

    public C0EWM(C0EWN c0ewn, C2252611DEt c2252611DEt) {
        this.LIZ = c0ewn;
        this.LIZIZ = c2252611DEt;
    }
}
