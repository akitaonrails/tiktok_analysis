package X;

import Y.AObjectS241S0100000_8;
import android.content.Intent;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.aikit.api.camera.ability.EditService;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet;
import com.ss.android.ugc.aweme.creative.model.record.RecordData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.draft.OnStartEditDraftListener;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterExtraModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C548470LfB extends AbstractC548480LfC {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AbstractC214814194y LLJIJIL;
    public final InterfaceC548570LfL LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C548470LfB.class, "navApi", "getNavApi()Lcom/ss/android/ugc/aweme/aikit/api/create/generation/AIGCGenerationNavApi;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    private final EditService<Object, Object, Object> H3() {
        C548590LfN.LIZ.getClass();
        return C548590LfN.LIZIZ();
    }

    private final void e4() {
        AITheaterExtraModel extraModel;
        C19GS c19gsRequireAppCompatActivity = this.LLJIJIL.requireAppCompatActivity();
        CreativeModel creativeModel = G2().creativeModel;
        CreativeInfo creativeInfo = G2().creativeInfo;
        if (creativeInfo == null) {
            throw new IllegalArgumentException("null creative info from draft");
        }
        AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(creativeInfo, false, false, false, 14));
        if (awemeDraftLJI == null) {
            C546030LbF.LIZJ(C546030LbF.LIZ, creativeModel, EnumC548240Leo.QUERY_DRAFT_DB_MISS, 0, 0, null, C2097908Jt.LIZJ(new Pair("fail_reason", "not_found")), 24);
            throw new IllegalArgumentException("failed to find draft");
        }
        C546030LbF.LIZJ(C546030LbF.LIZ, creativeModel, EnumC548240Leo.QUERY_DRAFT_DB_HIT, 1, 0, null, null, 56);
        List<String> listDP2 = o2().DP2();
        C0FGC.LIZ(2);
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        nLEEditorLIZ.restore(awemeDraftLJI.LJIIJJI);
        try {
            EditService<Object, Object, Object> editServiceH3 = H3();
            if (editServiceH3 != null) {
                editServiceH3.LIZ(awemeDraftLJI, nLEEditorLIZ, listDP2);
            }
            AITheaterModel aITheaterModel = awemeDraftLJI.LIZ.aigcBusinessModel.aiTheaterModel;
            if (aITheaterModel != null && (extraModel = aITheaterModel.getExtraModel()) != null) {
                extraModel.aigcEditSource = "creation";
                extraModel.aigcFirstEdit = true;
            }
            C546030LbF c546030LbF = C546030LbF.LIZ;
            C546030LbF.LIZJ(c546030LbF, creativeModel, EnumC548240Leo.NLE_REPLACE_SUCCESS, 1, 0, null, null, 56);
            C546030LbF.LIZJ(c546030LbF, creativeModel, EnumC548240Leo.SHOW_EDIT_PAGE_FROM_DRAFT, 1, 0, null, null, 56);
            awemeDraftLJI.LJIJI = 17;
            C570560MZi.LJ(c19gsRequireAppCompatActivity, awemeDraftLJI, 13, System.currentTimeMillis(), null, new OnStartEditDraftListener() { // from class: X.0LfG
                @Override // com.ss.android.ugc.aweme.services.draft.OnStartEditDraftListener
                public final void onStart(Intent intent) {
                }

                @Override // com.ss.android.ugc.aweme.services.draft.OnStartEditDraftListener
                public final void onEnd() {
                    InterfaceC548440Lf8 interfaceC548440Lf8O3 = this.LIZ.O3();
                    if (interfaceC548440Lf8O3 != null) {
                        interfaceC548440Lf8O3.Sn(true);
                    }
                }
            }, "page");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message == null) {
                message = "NLE exception";
            }
            C537540L6i.LIZ.LIZIZ("AITheaterGenerationLogicComponent", "replaceDraftMedia failed in creation path", th);
            C546030LbF.LIZJ(C546030LbF.LIZ, creativeModel, EnumC548240Leo.NLE_REPLACE_FAIL, 0, 200303, message, null, 32);
        }
    }

    public final InterfaceC548440Lf8 O3() {
        return (InterfaceC548440Lf8) this.LLJILJILJ.getValue(this, LLJILLL[0]);
    }

    public final void O() {
        InterfaceC548460LfA interfaceC548460LfAW2 = w2();
        if (interfaceC548460LfAW2 != null) {
            interfaceC548460LfAW2.O();
        }
    }

    @Override // X.AbstractC548480LfC
    public void Xi() {
        InterfaceC549570Lgx<InterfaceC548550LfJ> interfaceC549570LgxLIZ;
        InterfaceC548550LfJ interfaceC548550LfJ;
        LiveEvent<Unit> liveEventLLLLIILLL;
        InterfaceC549570Lgx<API> interfaceC549570LgxLLLLLJIL;
        InterfaceC548540LfI interfaceC548540LfI;
        LiveEvent<Unit> liveEventLLLLIILLL2;
        InterfaceC549570Lgx<API> interfaceC549570LgxLLLLLJIL2;
        InterfaceC548540LfI interfaceC548540LfI2;
        LiveEvent<Unit> liveEventV2;
        C549550Lgv c549550LgvH2 = H2();
        if (c549550LgvH2 != null && (interfaceC549570LgxLLLLLJIL2 = c549550LgvH2.LIZ.LLLLLJIL("title_bar")) != 0 && (interfaceC548540LfI2 = (InterfaceC548540LfI) interfaceC549570LgxLLLLLJIL2.getApi()) != null && (liveEventV2 = interfaceC548540LfI2.v2()) != null) {
            liveEventV2.LIZ(this, new AObjectS241S0100000_8(this, 35));
        }
        C549550Lgv c549550LgvH22 = H2();
        if (c549550LgvH22 != null && (interfaceC549570LgxLLLLLJIL = c549550LgvH22.LIZ.LLLLLJIL("title_bar")) != 0 && (interfaceC548540LfI = (InterfaceC548540LfI) interfaceC549570LgxLLLLLJIL.getApi()) != null && (liveEventLLLLIILLL2 = interfaceC548540LfI.LLLLIILLL()) != null) {
            liveEventLLLLIILLL2.LIZ(this, new AObjectS241S0100000_8(this, 36));
        }
        C549550Lgv c549550LgvH23 = H2();
        if (c549550LgvH23 == null || (interfaceC549570LgxLIZ = c549550LgvH23.LIZ()) == null || (interfaceC548550LfJ = (InterfaceC548550LfJ) interfaceC549570LgxLIZ.getApi()) == null || (liveEventLLLLIILLL = interfaceC548550LfJ.LLLLIILLL()) == null) {
            return;
        }
        liveEventLLLLIILLL.LIZ(this, new AObjectS241S0100000_8(this, 37));
    }

    @Override // X.AbstractC548480LfC, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        String clientTaskId = o2().getClientTaskId();
        C547140Ld2 c547140Ld2 = C537540L6i.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate, taskId=");
        sbLIZ.append(clientTaskId);
        c547140Ld2.LIZJ("AITheaterGenerationLogicComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (clientTaskId == null || clientTaskId.length() == 0) {
            qk();
        } else {
            W1();
        }
    }

    public InterfaceC548570LfL E3() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJILJIL;
    }

    private final Intent B3(String str) {
        String str2;
        AIGCEntranceInfo aIGCEntranceInfo;
        int iIntValue;
        Integer num;
        CreativeModel creativeModel = G2().creativeModel;
        String str3 = null;
        if (creativeModel == null) {
            return null;
        }
        Intent intent = new Intent();
        C0MUK.LJIIIZ(intent, creativeModel);
        C537520L6g.LIZLLL(intent, creativeModel.creativeInfo);
        if (C0BUD.LIZ() && (aIGCEntranceInfo = G2().entranceInfo) != null && aIGCEntranceInfo.shootMode != null) {
            RecordData recordData = C0MUK.LIZIZ(intent).recordData;
            AIGCEntranceInfo aIGCEntranceInfo2 = G2().entranceInfo;
            if (aIGCEntranceInfo2 != null && (num = aIGCEntranceInfo2.shootMode) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            recordData.shootMode = iIntValue;
        }
        AIGCEntranceInfo aIGCEntranceInfo3 = G2().entranceInfo;
        if (aIGCEntranceInfo3 != null) {
            str2 = aIGCEntranceInfo3.shootWay;
        } else {
            str2 = null;
        }
        intent.putExtra("shoot_way", str2);
        AIGCEntranceInfo aIGCEntranceInfo4 = G2().entranceInfo;
        if (aIGCEntranceInfo4 != null) {
            str3 = aIGCEntranceInfo4.enterFrom;
        }
        intent.putExtra("enter_from", str3);
        intent.putExtra("file_path", str);
        intent.putExtra("extra_saa_scene_force_disable_translucent", true);
        return intent;
    }

    public final void Q3(List<String> list) {
        AIGCBusinessModelSet aIGCBusinessModelSet;
        AITheaterModel aITheaterModel;
        AITheaterExtraModel extraModel;
        String str = (String) C13LP.LJJJLL(list);
        if (str == null) {
            return;
        }
        CreativeModel creativeModel = G2().creativeModel;
        if (creativeModel != null && (aIGCBusinessModelSet = creativeModel.aigcBusinessModel) != null && (aITheaterModel = aIGCBusinessModelSet.aiTheaterModel) != null && (extraModel = aITheaterModel.getExtraModel()) != null) {
            extraModel.aigcEditSource = "generation";
            extraModel.aigcFirstEdit = true;
        }
        Intent intentB3 = B3(str);
        if (intentB3 == null) {
            return;
        }
        C546030LbF.LIZJ(C546030LbF.LIZ, G2().creativeModel, EnumC548240Leo.SHOW_EDIT_PAGE, 1, 0, null, null, 56);
        C0FGC.LIZ(2);
        C1660680tJi.LIZ().LJIJ(C1664590tQ1.LJIIIZ(this), intentB3, new AwS552S0100000_8(this, 420));
    }

    @Override // X.AbstractC548480LfC
    public void i3(String str) {
        int errorCode;
        String errorMsg;
        AITheaterGenerationModel aITheaterGenerationModel;
        AITheaterGenerationModel aITheaterGenerationModel2;
        super.i3(str);
        CreativeModel creativeModelZ1 = Z1();
        AITheaterCreationModel aITheaterCreationModelX1 = X1();
        if (aITheaterCreationModelX1 != null && (aITheaterGenerationModel2 = aITheaterCreationModelX1.generationModel) != null) {
            errorCode = aITheaterGenerationModel2.getErrorCode();
        } else {
            errorCode = 0;
        }
        AITheaterCreationModel aITheaterCreationModelX12 = X1();
        if (aITheaterCreationModelX12 == null || (aITheaterGenerationModel = aITheaterCreationModelX12.generationModel) == null || (errorMsg = aITheaterGenerationModel.getErrorMsg()) == null) {
            errorMsg = "";
        }
        C546030LbF c546030LbF = C546030LbF.LIZ;
        C546030LbF.LIZJ(c546030LbF, creativeModelZ1, EnumC548240Leo.WORKFLOW_FAILED, 0, errorCode, errorMsg, null, 32);
        InterfaceC548440Lf8 interfaceC548440Lf8O3 = O3();
        if (interfaceC548440Lf8O3 != null) {
            interfaceC548440Lf8O3.zG2();
        }
        v3();
        C546030LbF.LIZJ(c546030LbF, creativeModelZ1, EnumC548240Leo.FAIL_RETRY_TOAST, 0, errorCode, errorMsg, null, 32);
    }

    @Override // X.AbstractC548480LfC
    public void m3(String str) {
        super.m3(str);
        CreativeModel creativeModelZ1 = Z1();
        if (str.length() == 0) {
            C546030LbF.LIZJ(C546030LbF.LIZ, creativeModelZ1, EnumC548240Leo.SUBMIT_FAIL, 0, 0, null, C2097908Jt.LIZJ(new Pair("fail_reason", "empty_task_id")), 24);
        } else {
            C546030LbF.LIZJ(C546030LbF.LIZ, creativeModelZ1, EnumC548240Leo.SUBMIT_SUCCESS, 1, 0, null, C2097908Jt.LIZJ(new Pair("client_task_id", str)), 24);
        }
    }

    @Override // X.AbstractC548480LfC
    public void q3(String str) {
        AIGC.AICreationSceneName aICreationSceneName;
        AIGCBusinessModelSet aIGCBusinessModelSet;
        AITheaterModel aITheaterModel;
        super.q3(str);
        CreativeModel creativeModelZ1 = Z1();
        C546030LbF c546030LbF = C546030LbF.LIZ;
        C546030LbF.LIZJ(c546030LbF, creativeModelZ1, EnumC548240Leo.WORKFLOW_FINISHED, 1, 0, null, null, 56);
        AIGCEntranceInfo aIGCEntranceInfo = G2().entranceInfo;
        if (aIGCEntranceInfo != null) {
            aICreationSceneName = aIGCEntranceInfo.sceneName;
        } else {
            aICreationSceneName = null;
        }
        if (Intrinsics.LJFF(aICreationSceneName, AIGC.AICreationSceneName.DRAFT.INSTANCE)) {
            C546030LbF.LIZJ(c546030LbF, creativeModelZ1, EnumC548240Leo.ENTRY_SOURCE_DRAFT, 1, 0, null, null, 56);
            e4();
            return;
        }
        C546030LbF.LIZJ(c546030LbF, creativeModelZ1, EnumC548240Leo.ENTRY_SOURCE_DIRECT, 1, 0, null, null, 56);
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJIIIZ() && !creativeToolsPluginService.LIZJ(C1664590tQ1.LJIIIZ(this), "ai_theater_creation", true)) {
            C537540L6i.LIZ.LIZJ("AITheaterGenerationLogicComponent", "ve plugin not installed, wait for download");
            C546030LbF.LIZJ(c546030LbF, creativeModelZ1, EnumC548240Leo.VE_PLUGIN_MISSING, 1, 0, null, null, 56);
            if (creativeModelZ1 != null && (aIGCBusinessModelSet = creativeModelZ1.aigcBusinessModel) != null && (aITheaterModel = aIGCBusinessModelSet.aiTheaterModel) != null) {
                AITheaterCreationModel creationModel = aITheaterModel.getCreationModel();
                AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(146);
                creationModel.getClass();
                C546900Lce.LIZ(creationModel, aFwS239S0000000_8);
            }
            creativeToolsPluginService.LIZIZ(C1664590tQ1.LJIIIZ(this), false, new AwS552S0100000_8(this, 421));
            return;
        }
        C546030LbF.LIZJ(c546030LbF, creativeModelZ1, EnumC548240Leo.VE_PLUGIN_INSTALLED, 1, 0, null, null, 56);
        Q3(o2().DP2());
    }

    public C548470LfB(AbstractC214814194y abstractC214814194y, C1DRG c1drg) {
        super(c1drg);
        this.LLJIJIL = abstractC214814194y;
        this.LLJILJIL = this;
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC548440Lf8.class, null);
    }
}
