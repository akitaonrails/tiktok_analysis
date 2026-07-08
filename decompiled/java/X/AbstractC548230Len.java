package X;

import Y.AObserverS212S0100000_8;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.aigc.proto.Level;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCreationInputInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aikit.api.common.AIAlertService;
import com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS59S1000000_8;

/* JADX INFO: renamed from: X.0Len, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC548230Len extends AbstractC2255721DQs<C05YF> implements C05YF, InterfaceC379610EuV {
    public static final C548350Lez LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AbstractC214814194y LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C549540Lgu.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC549370Lgd.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), AITheaterModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), CreativeModel.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), IAITheaterCreationLauncher.EnterParams.class, null);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(220));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(219));
    public final AtomicBoolean LLJI = new AtomicBoolean(false);

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0Lez] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC548230Len.class, "creationSlotHolder", "getCreationSlotHolder()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/creation/AICreationScene$CreationSlotHolder;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(AbstractC548230Len.class, "mobApi", "getMobApi()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/creation/mob/AICreationMobApi;", 0), new C2217381BqS(AbstractC548230Len.class, "aiTheaterModel", "getAiTheaterModel()Lcom/ss/android/ugc/aweme/theater/model/AITheaterModel;", 0), new C2217381BqS(AbstractC548230Len.class, "creativeModel", "getCreativeModel()Lcom/ss/android/ugc/aweme/creative/model/CreativeModel;", 0), new C2217381BqS(AbstractC548230Len.class, "enterParams", "getEnterParams()Lcom/ss/android/ugc/aweme/theater/service/IAITheaterCreationLauncher$EnterParams;", 0)};
        LLJIJIL = new Object() { // from class: X.0Lez
        };
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this;
    }

    public abstract void v3(C548260Leq c548260Leq);

    private final IAITheaterCreationLauncher.EnterParams T2() {
        return (IAITheaterCreationLauncher.EnterParams) this.LLIZ.getValue(this, LLJILJIL[4]);
    }

    private final InterfaceC549370Lgd c3() {
        return (InterfaceC549370Lgd) this.LLILZ.getValue(this, LLJILJIL[1]);
    }

    private final AITheaterModel o2() {
        return (AITheaterModel) this.LLILZIL.getValue(this, LLJILJIL[2]);
    }

    private final C547180Ld6 q3() {
        return (C547180Ld6) this.LLIZLLLIL.getValue();
    }

    private final C0LOK w2() {
        return (C0LOK) this.LLJ.getValue();
    }

    public void E3() {
        InterfaceC549370Lgd interfaceC549370LgdC3;
        this.LLJI.set(false);
        AITheaterGenerationModel aITheaterGenerationModel = o2().getCreationModel().generationModel;
        int errorCode = aITheaterGenerationModel.getErrorCode();
        String step = aITheaterGenerationModel.getStep();
        String failReasonMsg = aITheaterGenerationModel.getFailReasonMsg();
        C547860LeC.LIZ.getClass();
        AIAlertService aIAlertServiceLIZJ = C547860LeC.LIZJ();
        C547670Ldt c547670Ldt = C547670Ldt.LIZ;
        Integer numValueOf = Integer.valueOf(errorCode);
        c547670Ldt.getClass();
        aIAlertServiceLIZJ.LIZIZ(8011, C547670Ldt.LIZ(numValueOf, step, failReasonMsg), false);
        InterfaceC549370Lgd interfaceC549370LgdC32 = c3();
        if (interfaceC549370LgdC32 != null) {
            interfaceC549370LgdC32.x22();
        }
        Keva keva = C548360Lf0.LIZ;
        if (!C548360Lf0.LIZ(aITheaterGenerationModel.getClientTaskId(), aITheaterGenerationModel.getServerTaskId()) || (interfaceC549370LgdC3 = c3()) == null) {
            return;
        }
        interfaceC549370LgdC3.EP0(true, "", 0);
    }

    public final C549540Lgu G2() {
        return (C549540Lgu) this.LLILLL.getValue(this, LLJILJIL[0]);
    }

    public final AIQuotaService m3() {
        C546890Lcd.LIZ.getClass();
        return C546890Lcd.LIZIZ();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        AIGCEntranceInfo aIGCEntranceInfo;
        AITheaterModel aITheaterModel;
        AITheaterCreationModel creationModel;
        AITheaterGenerationModel aITheaterGenerationModel;
        InterfaceC549200LgM interfaceC549200LgM;
        LiveData<C548260Leq> liveDataVs;
        super.onCreate();
        m3().LJFF(Source.AI_THEATER, new AwS587S0100000_8(this, 308));
        InterfaceC549570Lgx<InterfaceC549200LgM> interfaceC549570LgxLIZ = G2().LIZ();
        if (interfaceC549570LgxLIZ != null && (interfaceC549200LgM = (InterfaceC549200LgM) interfaceC549570LgxLIZ.getApi()) != null && (liveDataVs = interfaceC549200LgM.vs()) != null) {
            liveDataVs.observe(this, new AObserverS212S0100000_8(this, 56));
        }
        AIGCEntranceInfo aIGCEntranceInfo2 = T2().entranceInfo;
        if (((aIGCEntranceInfo2 == null || !aIGCEntranceInfo2.isFollowChange) && (aIGCEntranceInfo = T2().entranceInfo) != null && aIGCEntranceInfo.fromGenerateFailure) || !((aITheaterModel = H2(this).aigcBusinessModel.aiTheaterModel) == null || (creationModel = aITheaterModel.getCreationModel()) == null || (aITheaterGenerationModel = creationModel.generationModel) == null || !C546670LcH.LIZ(aITheaterGenerationModel))) {
            E3();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        this.LLJI.set(false);
    }

    public final AtomicBoolean W2() {
        return this.LLJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final AbstractC214814194y i3() {
        return this.LL;
    }

    public static final CreativeModel H2(AbstractC548230Len abstractC548230Len) {
        return (CreativeModel) abstractC548230Len.LLILZLL.getValue(abstractC548230Len, LLJILJIL[3]);
    }

    private final AbstractC548250Lep X1(C548260Leq c548260Leq) {
        List<Pair<MentionDataItem, MentionDataItem>> list;
        View view = this.LL.mView;
        if (view == null) {
            return C548340Ley.LIZIZ;
        }
        if (!c548260Leq.LJ) {
            List<InputBlock> list2 = c548260Leq.LIZ;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<InputBlock> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (it2.next().userItem != null) {
                    }
                }
            }
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIIZ(2131826224);
            c1389890mGx.LJIIJJI();
            return C548300Leu.LIZIZ;
        }
        if (!c548260Leq.LJFF && c548260Leq.LJ && c548260Leq.LIZ.isEmpty() && ((list = c548260Leq.LIZJ) == null || list.isEmpty())) {
            C1389890mGx c1389890mGx2 = new C1389890mGx(view);
            c1389890mGx2.LJIIIZ(2131826208);
            c1389890mGx2.LJIIJJI();
            return C548310Lev.LIZIZ;
        }
        List<MentionDataItem> list3 = c548260Leq.LIZLLL;
        if (list3 != null && !list3.isEmpty()) {
            Iterator<MentionDataItem> it3 = list3.iterator();
            while (it3.hasNext()) {
                if (!C549450Lgl.LIZIZ(it3.next())) {
                    C1389890mGx c1389890mGx3 = new C1389890mGx(view);
                    c1389890mGx3.LJIIIZ(2131826175);
                    c1389890mGx3.LJIIJJI();
                    return C548330Lex.LIZIZ;
                }
            }
            return null;
        }
        return null;
    }

    public void B3(CreativeModel creativeModel) {
        IAITheaterCreationLauncher iAITheaterCreationLauncherLIZ;
        AITheaterCreationModel creationModel;
        CreativeModel creativeModelLIZIZ = CreativeModel.LIZIZ(creativeModel, null, null, null, null, -1, -1, -1, 2097151);
        AITheaterModel aITheaterModel = creativeModel.aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel != null && (creationModel = aITheaterModel.getCreationModel()) != null) {
            AFwS239S0000000_8.get$arr$(147).invoke(creationModel.sessionModel);
        }
        IAITheaterCreationLauncher.EnterParams enterParamsLIZ = IAITheaterCreationLauncher.EnterParams.LIZ(T2(), creativeModelLIZIZ.creativeInfo, creativeModelLIZIZ, null, 28);
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (iAITheaterCreationLauncherLIZ = iAITheaterFeatureServiceLIZ.LIZ()) != null) {
            iAITheaterCreationLauncherLIZ.LJ(enterParamsLIZ, (Context) getDiContainer().LJII(C19EG.class, null));
        }
    }

    public final void H3(AbstractC548250Lep abstractC548250Lep) {
        String str;
        Level level;
        if (abstractC548250Lep instanceof C548340Ley) {
            str = "view_null";
        } else if (abstractC548250Lep instanceof C548300Leu) {
            str = "no_actor";
        } else if (abstractC548250Lep instanceof C548310Lev) {
            str = "no_input_in_follow";
        } else if (abstractC548250Lep instanceof C548330Lex) {
            str = "unauthorized_user";
        } else if (abstractC548250Lep instanceof C548290Let) {
            str = "network_unavailable";
        } else if (abstractC548250Lep instanceof C548320Lew) {
            str = "no_quota";
        } else if (abstractC548250Lep instanceof C548270Ler) {
            str = "button_not_enabled";
        } else if (abstractC548250Lep instanceof C548280Les) {
            str = "duplicate_guard";
        } else {
            throw new C1954807lC();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("generationPrecheck failed: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (abstractC548250Lep.LIZ) {
            C546820LcW.LIZ.LIZIZ("generationPrecheck", strLIZIZ, null);
        } else {
            C546820LcW.LIZ.LIZJ("generationPrecheck", strLIZIZ);
        }
        if (abstractC548250Lep instanceof C548320Lew) {
            C546030LbF.LIZJ(C546030LbF.LIZ, H2(this), EnumC548240Leo.QUOTA_INSUFFICIENT, 0, 0, null, C2097908Jt.LIZJ(new Pair("fail_reason", str)), 24);
        } else if (abstractC548250Lep instanceof C548270Ler) {
            C546030LbF.LIZJ(C546030LbF.LIZ, H2(this), EnumC548240Leo.BUTTON_NOT_ENABLED, 0, 0, null, C2097908Jt.LIZJ(new Pair("fail_reason", str)), 24);
        } else if (abstractC548250Lep instanceof C548280Les) {
            C546030LbF.LIZJ(C546030LbF.LIZ, H2(this), EnumC548240Leo.GENERATE_DUPLICATE_GUARD, 0, 0, null, C2097908Jt.LIZJ(new Pair("fail_reason", str)), 24);
        } else {
            C546030LbF.LIZJ(C546030LbF.LIZ, H2(this), EnumC548240Leo.PRECHECK_FAIL, 0, 0, null, C2097908Jt.LIZJ(new Pair("fail_reason", str)), 24);
        }
        AwS59S1000000_8 awS59S1000000_8 = new AwS59S1000000_8(strLIZIZ, 8);
        if (abstractC548250Lep.LIZ) {
            level = Level.ERROR;
        } else {
            level = Level.INFO;
        }
        O3("precheck_failed", awS59S1000000_8, level);
    }

    public AbstractC548250Lep Z1(C548260Leq c548260Leq) {
        View view = this.LL.mView;
        if (view == null) {
            return C548340Ley.LIZIZ;
        }
        C569160MTy.LIZ.getClass();
        AIGCCreationInputInfo aIGCCreationInputInfoLIZJ = C569160MTy.LIZJ(c548260Leq);
        InterfaceC549370Lgd interfaceC549370LgdC3 = c3();
        if (interfaceC549370LgdC3 != null) {
            interfaceC549370LgdC3.Os0(aIGCCreationInputInfoLIZJ);
        }
        AbstractC548250Lep abstractC548250LepX1 = X1(c548260Leq);
        if (abstractC548250LepX1 != null) {
            return abstractC548250LepX1;
        }
        C1519805xE c1519805xE = InterfaceC1519705xD.LIZ;
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        c1519805xE.getClass();
        if (!C0XF1.LIZLLL(contextLJIIIZ)) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIJ(C547930LeJ.LIZ(2131826231, new Object[0]));
            c1389890mGx.LJIIJJI();
            InterfaceC549370Lgd interfaceC549370LgdC32 = c3();
            if (interfaceC549370LgdC32 != null) {
                interfaceC549370LgdC32.CG2();
            }
            return C548290Let.LIZIZ;
        }
        C546030LbF c546030LbF = C546030LbF.LIZ;
        C546030LbF.LIZJ(c546030LbF, H2(this), EnumC548240Leo.PRECHECK_PASS, 1, 0, null, null, 56);
        if (!m3().LIZ(Source.AI_THEATER)) {
            String strLIZ = C547930LeJ.LIZ(2131826232, Arrays.copyOf(new Object[0], 0));
            if (strLIZ != null) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(view);
                c1389890mGx2.LJIIJ(strLIZ);
                c1389890mGx2.LJIIJJI();
            }
            InterfaceC549370Lgd interfaceC549370LgdC33 = c3();
            if (interfaceC549370LgdC33 != null) {
                interfaceC549370LgdC33.FC();
            }
            return C548320Lew.LIZIZ;
        }
        C546030LbF.LIZJ(c546030LbF, H2(this), EnumC548240Leo.QUOTA_PASS, 1, 0, null, null, 56);
        if (!c548260Leq.LJFF) {
            return C548270Ler.LIZIZ;
        }
        if (this.LLJI.getAndSet(true)) {
            return C548280Les.LIZIZ;
        }
        C546820LcW.LIZ.LIZJ("generationPrecheck", "generationPrecheck passed all checks");
        return null;
    }

    public AbstractC548230Len(AbstractC214814194y abstractC214814194y, C1DRG c1drg) {
        this.LL = abstractC214814194y;
        this.LLILLJJLI = c1drg;
    }

    private final void O3(String str, Function1<? super Map<String, String>, Unit> function1, Level level) {
        C547250LdD c547250LdD;
        Function1<CreativeModel, String> function12;
        String strInvoke;
        C546230LbZ c546230LbZLIZ = C546330Lbj.LIZ(w2());
        if (c546230LbZLIZ != null && (c547250LdD = (C547250LdD) c546230LbZLIZ.LJ.getValue()) != null && (function12 = c547250LdD.LIZIZ) != null && (strInvoke = function12.invoke(H2(this))) != null) {
            C01GW c01gw = C547160Ld4.LIZ;
            C547160Ld4.LJ(level, strInvoke, C546330Lbj.LIZIZ(w2()), C547180Ld6.LIZ(q3(), str), function1);
        }
    }
}
