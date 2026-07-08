package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.aikit.api.create.AICreateService;
import com.ss.android.ugc.aweme.aikit.api.create.generation.AICreateBusinessExtra;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Le7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547810Le7 extends AbstractC548230Len {
    public static final C547890LeF LLJJIJIIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C05YF LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public DialogC1389620mGW LLJJIII;
    public C09AE LLJJIJI;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0LeF] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C547810Le7.class, "enterParams", "getEnterParams()Lcom/ss/android/ugc/aweme/theater/service/IAITheaterCreationLauncher$EnterParams;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C547810Le7.class, "creativeModel", "getCreativeModel()Lcom/ss/android/ugc/aweme/creative/model/CreativeModel;", 0), new C2217381BqS(C547810Le7.class, "aiTheaterModel", "getAiTheaterModel()Lcom/ss/android/ugc/aweme/theater/model/AITheaterModel;", 0)};
        LLJJIJIIJIL = new Object() { // from class: X.0LeF
        };
    }

    private final CreativeModel H2() {
        return (CreativeModel) this.LLJJ.getValue(this, LLJJIJIL[1]);
    }

    private final IAITheaterCreationLauncher.EnterParams T2() {
        return (IAITheaterCreationLauncher.EnterParams) this.LLJILLL.getValue(this, LLJJIJIL[0]);
    }

    private final void e4() {
        C09AE c09ae = this.LLJJIJI;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLJJIJI = null;
        DialogC1389620mGW dialogC1389620mGW = this.LLJJIII;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
    }

    private final AITheaterModel o2() {
        return (AITheaterModel) this.LLJJI.getValue(this, LLJJIJIL[2]);
    }

    public final AICreateService o4() {
        C546890Lcd.LIZ.getClass();
        return C546890Lcd.LIZ();
    }

    private final void O4() {
        e4();
        this.LL.finish();
    }

    public final void H4() {
        E3();
        e4();
    }

    @Override // X.AbstractC548230Len, X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLJILJILJ;
    }

    private final boolean z4(List<MentionDataItem> list) {
        List<MentionDataItem> list2;
        MentionDataItem mentionDataItem;
        AIGCSocialModel aIGCSocialModel = T2().socialParams;
        if (aIGCSocialModel == null || (list2 = aIGCSocialModel.peerCameoInfo) == null || (mentionDataItem = (MentionDataItem) C13LP.LJJJLL(list2)) == null || list == null) {
            return false;
        }
        Iterator<MentionDataItem> it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().uid, mentionDataItem.uid)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC548230Len
    public void v3(C548260Leq c548260Leq) {
        AIGCBusinessModelSet aIGCBusinessModelSet;
        AITheaterModel aITheaterModel;
        AITheaterCreationModel creationModel;
        AITheaterGenerationModel aITheaterGenerationModel;
        String clientTaskId;
        AIGCSocialModel aIGCSocialModel = T2().socialParams;
        if (aIGCSocialModel != null) {
            aIGCSocialModel.participantCameoInfo = c548260Leq.LIZLLL;
            aIGCSocialModel.promptBlocks = c548260Leq.LIZ;
        }
        C569160MTy c569160MTy = C569160MTy.LIZ;
        CreativeModel creativeModelH2 = H2();
        AIGCSocialModel aIGCSocialModel2 = T2().socialParams;
        c569160MTy.getClass();
        C569160MTy.LIZLLL(creativeModelH2, c548260Leq, aIGCSocialModel2);
        boolean zZ4 = z4(c548260Leq.LIZLLL);
        CreativeModel creativeModelT4 = T4(c548260Leq, zZ4);
        if (creativeModelT4 != null && (aIGCBusinessModelSet = creativeModelT4.aigcBusinessModel) != null && (aITheaterModel = aIGCBusinessModelSet.aiTheaterModel) != null && (creationModel = aITheaterModel.getCreationModel()) != null && (aITheaterGenerationModel = creationModel.generationModel) != null && (clientTaskId = aITheaterGenerationModel.getClientTaskId()) != null) {
            P4(clientTaskId, creationModel);
            F4(creativeModelT4, zZ4);
        } else {
            C546820LcW.LIZ.LIZIZ("AITheaterDMGenerationLaunchComponent", "failed to submit task, taskId is null", null);
            C547860LeC.LIZ.getClass();
            C547860LeC.LIZJ().LIZJ(8011, 2131826227);
        }
    }

    public C547810Le7(AbstractC214814194y abstractC214814194y, C1DRG c1drg) {
        super(abstractC214814194y, c1drg);
        this.LLJILJILJ = this;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), IAITheaterCreationLauncher.EnterParams.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), CreativeModel.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), AITheaterModel.class, null);
    }

    private final void F4(CreativeModel creativeModel, boolean z) {
        AITheaterCreationModel creationModel;
        AITheaterModel aITheaterModel = creativeModel.aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel != null && (creationModel = aITheaterModel.getCreationModel()) != null) {
            String clientTaskId = creationModel.generationModel.getClientTaskId();
            if (clientTaskId == null) {
                H4();
                return;
            }
            C09AE c09ae = this.LLJJIJI;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh = C0PEM.LIZ;
            this.LLJJIJI = C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C546840LcY(this, clientTaskId, creationModel, creativeModel, z, null), 2);
        }
    }

    private final void P4(final String str, final AIGCCreationModel aIGCCreationModel) {
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(C1664590tQ1.LJIIIZ(this));
        dialogC1389620mGW.LJJLIIJ(false);
        dialogC1389620mGW.LJJLL(true);
        dialogC1389620mGW.setCancelable(true);
        dialogC1389620mGW.LJJLJ(R.string.txr);
        dialogC1389620mGW.LLILZLL = new InterfaceC1389630mGX() { // from class: X.0LeA
            @Override // X.InterfaceC1389630mGX
            public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                AICreateService aICreateServiceO4 = this.LIZ.o4();
                if (aICreateServiceO4 != null) {
                    aICreateServiceO4.nw(str, aIGCCreationModel);
                }
                this.LIZ.LLJI.set(false);
            }
        };
        this.LLJJIII = dialogC1389620mGW;
        C786410Ut5.J4(dialogC1389620mGW);
    }

    private final CreativeModel T4(C548260Leq c548260Leq, boolean z) {
        String str;
        C547860LeC.LIZ.getClass();
        C546230LbZ c546230LbZLJ = C547860LeC.LIZIZ().LJ(C0LOK.LIZ);
        AIGCSocialModel aIGCSocialModel = null;
        if (c546230LbZLJ == null) {
            return null;
        }
        C546290Lbf c546290LbfLJI = c546230LbZLJ.LJI();
        if (c546290LbfLJI == null || (str = c546290LbfLJI.LIZJ) == null) {
            str = "";
        }
        if (z) {
            aIGCSocialModel = T2().socialParams;
        }
        InterfaceC546090LbL interfaceC546090LbL = c546230LbZLJ.LIZ;
        String creationId = H2().creativeInfo.getCreationId();
        AITheaterCreationModel creationModel = o2().getCreationModel();
        C547670Ldt c547670Ldt = C547670Ldt.LIZ;
        AITheaterModel aITheaterModelO2 = o2();
        IAITheaterCreationLauncher.EnterParams enterParamsT2 = T2();
        c547670Ldt.getClass();
        C546750LcP c546750LcP = new C546750LcP(interfaceC546090LbL, str, creationId, creationModel, new AICreateBusinessExtra(aIGCSocialModel, EnumC547830Le9.IM_CREATE.getScene(), null, null), C547670Ldt.LIZIZ(aITheaterModelO2, enterParamsT2));
        AICreateService aICreateServiceO4 = o4();
        if (aICreateServiceO4 != null) {
            aICreateServiceO4.iw(c546750LcP);
        }
        return H2();
    }

    public final void K4(CreativeModel creativeModel, boolean z) {
        if (z) {
            O4();
        } else {
            e4();
            B3(creativeModel);
        }
    }
}
