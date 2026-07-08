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

/* JADX INFO: renamed from: X.0EWI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EWI implements IFetchEffectListByIdsListener {
    public final /* synthetic */ C0EWJ LIZ;
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
        sbLIZ.append(25);
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
        C0EWJ c0ewj = this.LIZ;
        if (exceptionResult != null) {
            errorCode = exceptionResult.getErrorCode();
        } else {
            errorCode = -1;
        }
        int i = errorCode - 60000;
        if (exceptionResult != null) {
            exception = exceptionResult.getException();
        }
        draftFileRestoreResultArr[0] = c0ewj.LJI(2131832433, false, new DraftFileRestoreException(i, exception, "CutoutBlend"));
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
        EffectListResponse effectListResponse2 = effectListResponse;
        if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && !data.isEmpty()) {
            InterfaceC1635410sex interfaceC1635410sex = this.LIZ.LIZIZ;
            ArrayList arrayList = new ArrayList(effectListResponse2.getData());
            final C0EWJ c0ewj = this.LIZ;
            final InterfaceC20236714Gf<List<DraftFileRestoreResult>> interfaceC20236714Gf = this.LIZIZ;
            interfaceC1635410sex.og(arrayList, new IFetchEffectListListener() { // from class: X.0EWH
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                public final void onFail(ExceptionResult exceptionResult) {
                    this.LIZ.LIZ(exceptionResult);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(List<Effect> list) {
                    EditorProEffectInfo blendCutoutEffect;
                    EditorProEffectInfo blendMaskEffect;
                    String second;
                    String resourceId;
                    CreativeFlowData creativeFlowData;
                    EditorProModel editorProModel;
                    String resourceId2;
                    CreativeFlowData creativeFlowData2;
                    EditorProModel editorProModel2;
                    String key;
                    Pair<String, String> pairLIZJ;
                    String second2;
                    String key2;
                    Pair<String, String> pairLIZJ2;
                    EditorProModel editorProModel3;
                    EditorProModel editorProModel4;
                    List<Effect> list2 = list;
                    if (list2 == null) {
                        this.LIZ.LIZ(new ExceptionResult(new IllegalArgumentException("response is null")));
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DraftCutoutStrokeRestoreHandler ; fileType : ");
                    c0ewj.getClass();
                    sbLIZ.append(25);
                    sbLIZ.append(" ; restore success ...");
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    CreativeFlowData creativeFlowData3 = c0ewj.LIZ.LJ.LJJJJIZL.creativeFlowData;
                    if (creativeFlowData3 != null && (editorProModel4 = creativeFlowData3.getEditorProModel()) != null) {
                        blendCutoutEffect = editorProModel4.getBlendCutoutEffect();
                    } else {
                        blendCutoutEffect = null;
                    }
                    CreativeFlowData creativeFlowData4 = c0ewj.LIZ.LJ.LJJJJIZL.creativeFlowData;
                    if (creativeFlowData4 != null && (editorProModel3 = creativeFlowData4.getEditorProModel()) != null) {
                        blendMaskEffect = editorProModel3.getBlendMaskEffect();
                    } else {
                        blendMaskEffect = null;
                    }
                    if (blendCutoutEffect != null && (key2 = blendCutoutEffect.getKey()) != null && (pairLIZJ2 = C0FGD.LIZJ(key2)) != null) {
                        second = pairLIZJ2.getSecond();
                    } else {
                        second = null;
                    }
                    String str = "";
                    if (second == null) {
                        second = "";
                    }
                    if (blendMaskEffect != null && (key = blendMaskEffect.getKey()) != null && (pairLIZJ = C0FGD.LIZJ(key)) != null && (second2 = pairLIZJ.getSecond()) != null) {
                        str = second2;
                    }
                    C0EWJ c0ewj2 = c0ewj;
                    for (Effect effect : list2) {
                        if (blendCutoutEffect != null) {
                            if (effect != null) {
                                resourceId2 = effect.getResourceId();
                            } else {
                                resourceId2 = null;
                            }
                            if (Intrinsics.LJFF(second, resourceId2) && (creativeFlowData2 = c0ewj2.LIZ.LJ.LJJJJIZL.creativeFlowData) != null && (editorProModel2 = creativeFlowData2.getEditorProModel()) != null) {
                                editorProModel2.setBlendCutoutEffect(new EditorProEffectInfo(blendCutoutEffect.getKey(), blendCutoutEffect.getName(), effect.getUnzipPath()));
                            }
                        }
                        if (blendMaskEffect != null) {
                            if (effect != null) {
                                resourceId = effect.getResourceId();
                            } else {
                                resourceId = null;
                            }
                            if (Intrinsics.LJFF(str, resourceId) && (creativeFlowData = c0ewj2.LIZ.LJ.LJJJJIZL.creativeFlowData) != null && (editorProModel = creativeFlowData.getEditorProModel()) != null) {
                                editorProModel.setBlendMaskEffect(new EditorProEffectInfo(blendMaskEffect.getKey(), blendMaskEffect.getName(), effect.getUnzipPath()));
                            }
                        }
                    }
                    InterfaceC20236714Gf<List<DraftFileRestoreResult>> interfaceC20236714Gf2 = interfaceC20236714Gf;
                    ArrayList arrayListLJ = C1697810uHb.LJ(c0ewj.LJI(null, false, new DraftFileRestoreException(0, null, "Unknown")));
                    C189200o6.m2constructorimpl(arrayListLJ);
                    interfaceC20236714Gf2.resumeWith(arrayListLJ);
                }
            });
            return;
        }
        LIZ(new ExceptionResult(new IllegalArgumentException("response is null")));
    }

    public C0EWI(C0EWJ c0ewj, C2252611DEt c2252611DEt) {
        this.LIZ = c0ewj;
        this.LIZIZ = c2252611DEt;
    }
}
