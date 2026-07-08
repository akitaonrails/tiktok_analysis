package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateMobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0Dzs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357460Dzs extends C2239131CkR {
    public boolean LIZ;
    public final /* synthetic */ InterfaceC357510Dzx LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ long LIZLLL;
    public final /* synthetic */ C357450Dzr LJ;
    public final /* synthetic */ C0FQS LJFF;
    public final /* synthetic */ boolean LJI;
    public final /* synthetic */ InterfaceC1364105Vn<C358620E4e> LJII;

    @Override // X.C2239131CkR, X.InterfaceC20343514iv
    public final void onStart() {
        this.LIZ = true;
        System.currentTimeMillis();
    }

    @Override // X.C2239131CkR, X.InterfaceC20343514iv
    public final void LIZ(NLETimeSpaceNode nLETimeSpaceNode) {
        NLEResourceAV aVFile;
        String resourceFile;
        NLETemplateModel nLETemplateModelDynamicCast = NLETemplateModel.dynamicCast((NLENode) nLETimeSpaceNode);
        if (nLETemplateModelDynamicCast != null) {
            C357450Dzr c357450Dzr = this.LJ;
            VecNLETrackSPtr tracks = nLETemplateModelDynamicCast.getTracks();
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (nLETrack2.getTrackType() == NLETrackType.VIDEO && nLETrack2.getEnable()) {
                    arrayList.add(nLETrack);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((NLETrackSlot) obj).getRenderProxy() != null) {
                    arrayList3.add(obj);
                }
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                NLERenderProxySegment nLERenderProxySegmentDynamicCast = NLERenderProxySegment.dynamicCast(((NLETrackSlot) it3.next()).getRenderProxy().getMainSegment());
                if (nLERenderProxySegmentDynamicCast != null && (aVFile = nLERenderProxySegmentDynamicCast.getAVFile()) != null && (resourceFile = aVFile.getResourceFile()) != null && resourceFile.length() != 0) {
                    c357450Dzr.LJFF.pugcTemplateData.magicDependencyRes.add(resourceFile);
                }
            }
        }
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Template_Consume: UpdateProgress magic v1 cost=");
        sbLIZ.append(System.currentTimeMillis() - this.LIZLLL);
        C201955140j.LIZLLL(c563650M8t, "TemplateMagicApplyTask", C2188811AlT.LIZIZ(sbLIZ));
        this.LJ.LJJIIJZLJL(this.LJFF, System.currentTimeMillis() - this.LIZLLL, true, -1, "");
        if (!this.LJI && !this.LIZJ) {
            this.LIZIZ.LIZ(true);
            InterfaceC1364105Vn<C358620E4e> interfaceC1364105Vn = this.LJII;
            C358620E4e c358620E4e = new C358620E4e(true, null, 0, 62);
            C189200o6.m2constructorimpl(c358620E4e);
            interfaceC1364105Vn.resumeWith(c358620E4e);
            return;
        }
        C383980F3s.LIZIZ(new C357520Dzy(true, this.LJ, this.LJFF, this.LIZIZ, this.LIZLLL, this.LJII, this));
    }

    @Override // X.C2239131CkR, X.InterfaceC20343514iv
    public final void onProgress(int i) {
        float f;
        InterfaceC357510Dzx interfaceC357510Dzx = this.LIZIZ;
        float f2 = i;
        if (this.LIZJ) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        interfaceC357510Dzx.onProgress((f2 * f) / 100);
    }

    @Override // X.C2239131CkR, X.InterfaceC20343514iv
    public final void onError(int i, String str) {
        if (!this.LIZJ) {
            this.LIZIZ.LIZ(true);
            this.LJ.LJJIIJZLJL(this.LJFF, System.currentTimeMillis() - this.LIZLLL, false, i, str);
            C0L9D c0l9d = C0L9D.HANDLE_TEMPLATE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TemplateMagicApplyTask");
            sbLIZ.append(" Magic: errorCode=");
            sbLIZ.append(i);
            sbLIZ.append(", errorMsg=");
            sbLIZ.append(str);
            C533100KvU.LIZ(c0l9d, C2188811AlT.LIZIZ(sbLIZ));
            InterfaceC1364105Vn<C358620E4e> interfaceC1364105Vn = this.LJII;
            C358620E4e c358620E4e = new C358620E4e(false, null, 0, 62);
            C189200o6.m2constructorimpl(c358620E4e);
            interfaceC1364105Vn.resumeWith(c358620E4e);
            return;
        }
        C383980F3s.LIZIZ(new C357520Dzy(false, this.LJ, this.LJFF, this.LIZIZ, this.LIZLLL, this.LJII, this));
    }

    @Override // X.C2239131CkR
    public final void LIZIZ(int i, String str, String str2, boolean z) {
        int i2 = i;
        ITemplateMobService iTemplateMobService = (ITemplateMobService) ServiceManager.get().getService(ITemplateMobService.class);
        C357450Dzr c357450Dzr = this.LJ;
        String str3 = c357450Dzr.LIZIZ;
        Integer num = c357450Dzr.LIZJ;
        String str4 = c357450Dzr.LIZLLL;
        String str5 = c357450Dzr.LJ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZLLL;
        if (z) {
            i2 = 0;
        }
        iTemplateMobService.LJI(str3, num, str4, str5, "task_magic_v1", jCurrentTimeMillis, z, i2, false, str2, str, "", this.LJ.LIZ.getCreationId(), new LinkedHashMap());
    }

    public C357460Dzs(InterfaceC357510Dzx interfaceC357510Dzx, boolean z, long j, C357450Dzr c357450Dzr, C0FQS c0fqs, boolean z2, C23260099m c23260099m) {
        this.LIZIZ = interfaceC357510Dzx;
        this.LIZJ = z;
        this.LIZLLL = j;
        this.LJ = c357450Dzr;
        this.LJFF = c0fqs;
        this.LJI = z2;
        this.LJII = c23260099m;
    }
}
