package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi;
import com.ss.android.ugc.aweme.aigc.graph.nodes.slot.DownloadItemResult;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitResultItem;
import com.ss.android.ugc.aweme.portrait.service.IPortraitWorkflowService;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LnK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C553520LnK extends AbstractC2255721DQs<InterfaceC550170Lhv> implements InterfaceC550170Lhv, InterfaceC379610EuV {
    public static final C553600LnS LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), CreativeModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), CreativeInfo.class, null);
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(106));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(105));
    public InterfaceC553590LnR LLILZLL;
    public String LLIZ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0LnS] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C553520LnK.class, "creativeModel", "getCreativeModel()Lcom/ss/android/ugc/aweme/creative/model/CreativeModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C553520LnK.class, "creativeInfo", "getCreativeInfo()Lcom/ss/android/ugc/aweme/creative/model/CreativeInfo;", 0)};
        LLIZLLLIL = new Object() { // from class: X.0LnS
        };
        LLJI = 8;
    }

    public InterfaceC550170Lhv Z1() {
        return this;
    }

    public final IPortraitWorkflowService G2() {
        return (IPortraitWorkflowService) this.LLILZ.getValue();
    }

    public final AIGCWorkflowManagementApi X1() {
        return (AIGCWorkflowManagementApi) this.LLILZIL.getValue();
    }

    public final CreativeInfo o2() {
        return (CreativeInfo) this.LLILLL.getValue(this, LLJ[1]);
    }

    public final CreativeModel w2() {
        return (CreativeModel) this.LLILLJJLI.getValue(this, LLJ[0]);
    }

    @Override // X.InterfaceC550170Lhv
    public void Jw0() {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C553560LnO(this, null), 2);
    }

    @Override // X.InterfaceC550170Lhv
    public void eB2() {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C553530LnL(this, null), 2);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        AIPortraitModel aIPortraitModel;
        AIPortraitContextModel aIPortraitContextModel;
        AIPortraitGeneratingModel aIPortraitGeneratingModel;
        super.onCreate();
        CreativeModel creativeModelW2 = w2();
        String str = null;
        if (creativeModelW2 != null && (aIPortraitModel = creativeModelW2.aigcBusinessModel.aiPortraitModel) != null && (aIPortraitContextModel = aIPortraitModel.contextModel) != null && (aIPortraitGeneratingModel = aIPortraitContextModel.generatingModel) != null) {
            str = aIPortraitGeneratingModel.clientWorkflowId;
        }
        this.LLIZ = str;
    }

    @Override // X.InterfaceC550170Lhv
    public void xl1() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C553540LnM(this, null), 3);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C553520LnK(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC550170Lhv
    public void KW(String str) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C553440LnC(this, str, null), 2);
        Ok0(str);
    }

    @Override // X.InterfaceC550170Lhv
    public void Ok0(String str) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C553550LnN(this, str, null), 2);
    }

    @Override // X.InterfaceC550170Lhv
    public void oc1(InterfaceC553590LnR interfaceC553590LnR) {
        this.LLILZLL = interfaceC553590LnR;
    }

    public final void W1(String str, InterfaceC1264504x9 interfaceC1264504x9) {
        if (interfaceC1264504x9 instanceof C1264804xC) {
            String str2 = C545870Laz.LIZIZ.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AIPortraitWorkflowComponent -> onProgress, workflowId=");
            sbLIZ.append(str);
            sbLIZ.append(", progress=");
            C1264804xC c1264804xC = (C1264804xC) interfaceC1264504x9;
            sbLIZ.append(c1264804xC.LIZ);
            C201955140j.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC553590LnR interfaceC553590LnR = this.LLILZLL;
            if (interfaceC553590LnR != null) {
                interfaceC553590LnR.onProgress(c1264804xC.LIZ);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(interfaceC1264504x9, C1264704xB.LIZ)) {
            String str3 = C545870Laz.LIZIZ.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("AIPortraitWorkflowComponent -> onStop, workflowId=");
            sbLIZ2.append(str);
            C201955140j.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ2));
            InterfaceC553590LnR interfaceC553590LnR2 = this.LLILZLL;
            if (interfaceC553590LnR2 == null) {
                return;
            }
            interfaceC553590LnR2.onStop();
            return;
        }
        if (interfaceC1264504x9 instanceof C1259604wM) {
            String str4 = C545870Laz.LIZIZ.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("AIPortraitWorkflowComponent -> onFail, workflowId=");
            sbLIZ3.append(str);
            sbLIZ3.append(", code=");
            C1259604wM c1259604wM = (C1259604wM) interfaceC1264504x9;
            sbLIZ3.append(c1259604wM.LIZ);
            sbLIZ3.append(", msg=");
            sbLIZ3.append(c1259604wM.LIZIZ);
            C201955140j.LIZIZ(str4, C2188811AlT.LIZIZ(sbLIZ3));
            InterfaceC553590LnR interfaceC553590LnR3 = this.LLILZLL;
            if (interfaceC553590LnR3 == null) {
                return;
            }
            interfaceC553590LnR3.onFail(c1259604wM.LIZ, c1259604wM.LIZIZ);
            return;
        }
        if (!(interfaceC1264504x9 instanceof C1259204wI)) {
            return;
        }
        List<DownloadItemResult> list = ((C1259204wI) interfaceC1264504x9).LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (DownloadItemResult downloadItemResult : list) {
            arrayList.add(new AIPortraitResultItem(downloadItemResult.url, downloadItemResult.localFilePath, downloadItemResult.thumbnailUrl, downloadItemResult.thumbnailLocalFilePath));
        }
        String str5 = C545870Laz.LIZIZ.LIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("AIPortraitWorkflowComponent -> onSuccess, workflowId=");
        sbLIZ4.append(str);
        sbLIZ4.append(", resultSize=");
        sbLIZ4.append(arrayList.size());
        C201955140j.LIZIZ(str5, C2188811AlT.LIZIZ(sbLIZ4));
        InterfaceC553590LnR interfaceC553590LnR4 = this.LLILZLL;
        if (interfaceC553590LnR4 == null) {
            return;
        }
        interfaceC553590LnR4.onSuccess(arrayList);
    }
}
