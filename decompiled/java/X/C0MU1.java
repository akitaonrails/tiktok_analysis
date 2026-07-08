package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.common.UsageStatus;
import com.ss.android.ugc.aweme.theater.model.AITheaterContextModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterExtraModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterSessionModel;
import com.ss.android.ugc.aweme.theater.model.WritableAITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import java.util.Collections;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0MU1, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.config.AITheaterConfigKt$AI_THEATER_CONFIG$11$5", f = "AITheaterConfig.kt", l = {}, m = "invokeSuspend")
public final class C0MU1 extends C09AX implements InterfaceC1631620sYq<Context, AIGCDraft, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ AIGCDraft LLILLJJLI;

    public C0MU1(InterfaceC1364105Vn<? super C0MU1> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        C1C7U.LIZ("AITheaterConfigKt@24ae.AI_THEATER_CONFIG$11$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = (Context) this.LL;
        AIGCDraft aIGCDraft = this.LLILLJJLI;
        C546340Lbk.LIZ.getClass();
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) != null && interfaceC558600LvWLIZIZ.isFeatureEnabled()) {
            Intent intent = new Intent();
            String str = aIGCDraft.localFilePath;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            CameoDraft cameoDraft = aIGCDraft.cameoDraft;
            if (cameoDraft == null) {
                C0LOG.LIZ(context);
            } else {
                int i = -1;
                CreativeModel creativeModel = new CreativeModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, i, i, i, i, 2097151, 0 == true ? 1 : 0);
                AITheaterContextModel aITheaterContextModelLIZJ = C549430Lgj.LIZJ(aIGCDraft);
                AITheaterSessionModel aITheaterSessionModel = new AITheaterSessionModel(null, creativeModel.creativeInfo.getCreationId(), creativeModel.creativeInfo.getVersion(), Source.AI_THEATER.getSource(), 1, null);
                WritableAITheaterGenerationModel writableAITheaterGenerationModel = new WritableAITheaterGenerationModel(C549410Lgh.LIZ(cameoDraft), null, null, null, null, null, null, null, null, null, null, 0, 0L, 0L, null, null, 0L, 0, null, null, null, null, 4194302, null);
                writableAITheaterGenerationModel.mediaPathList = C13BV.INSTANCE;
                String str3 = cameoDraft.promptText;
                if (str3 != null) {
                    str2 = str3;
                }
                writableAITheaterGenerationModel.promptText = str2;
                writableAITheaterGenerationModel.replaceMentionItemMap = null;
                writableAITheaterGenerationModel.status = UsageStatus.SUCCESS_APPLY;
                writableAITheaterGenerationModel.serverTaskId = aIGCDraft.serverTaskId;
                writableAITheaterGenerationModel.results = Collections.singletonList(str);
                creativeModel.aigcBusinessModel.aiTheaterModel = new AITheaterModel(new AITheaterCreationModel(aITheaterSessionModel, writableAITheaterGenerationModel), null, new AITheaterExtraModel(null, true, true, null, null, null, false), aITheaterContextModelLIZJ, 2, null);
                creativeModel.eventData.enterFrom = aITheaterContextModelLIZJ.aigcEntranceInfo.refPageName.value;
                C0MUK.LJIIIZ(intent, creativeModel);
                intent.putExtra("shoot_way", aIGCDraft.aigcEntranceInfo.shootWay);
                intent.putExtra("enter_from", aIGCDraft.aigcEntranceInfo.enterFrom);
                intent.putExtra("file_path", str);
                intent.putExtra("extra_saa_scene_force_disable_translucent", true);
                C546010LbD.LIZ(aIGCDraft, creativeModel, Boolean.TRUE);
                C1660680tJi.LIZ().LJIJ(context, intent, null);
            }
        } else {
            C547860LeC.LIZ.getClass();
            C547860LeC.LIZJ().LIZIZ(8012, context.getString(2131826241), false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterConfigKt@24ae.AI_THEATER_CONFIG$11$5");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Context context, AIGCDraft aIGCDraft, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C0MU1 c0mu1 = new C0MU1(interfaceC1364105Vn);
        c0mu1.LL = context;
        c0mu1.LLILLJJLI = aIGCDraft;
        return c0mu1.invokeSuspend(Unit.LIZ);
    }
}
