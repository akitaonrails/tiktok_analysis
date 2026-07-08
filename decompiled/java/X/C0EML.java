package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0EML, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EML implements InterfaceC379610EuV, InterfaceC350220DoC, InterfaceC350250DoF, C0EMV {
    public final C1DRG LL;
    public final List<InterfaceC350240DoE> LLILLJJLI;

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C0EML(C1DRG c1drg) {
        this.LL = c1drg;
        ArrayList arrayList = new ArrayList();
        this.LLILLJJLI = arrayList;
        arrayList.add(new C361840EGo(c1drg));
        arrayList.add(new C0EX9(c1drg));
        arrayList.add(new C0ERE(c1drg));
        arrayList.add(new C0EPD(c1drg));
    }

    @Override // X.C0EMV
    public final void LIZ(C0EMO c0emo) {
        C0EMV c0emv;
        for (InterfaceC350240DoE interfaceC350240DoE : (ArrayList) this.LLILLJJLI) {
            if ((interfaceC350240DoE instanceof C0EMV) && (c0emv = (C0EMV) interfaceC350240DoE) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                c0emv.LIZ(c0emo);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                String simpleName = c0emv.getClass().getSimpleName();
                C563650M8t c563650M8t = C563650M8t.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(simpleName);
                sbLIZ.append(" [render] ");
                sbLIZ.append(jCurrentTimeMillis2);
                C201955140j.LIZLLL(c563650M8t, "EPSyncTask", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // X.C0EMV
    public final void LIZJ(C0EMO c0emo) {
        LIZ(c0emo);
    }

    @Override // X.InterfaceC350220DoC
    public final void LIZLLL(C0EMN c0emn) {
        NLEModel nLEModelLIZ;
        VideoPublishEditModel videoPublishEditModel;
        if (c0emn.LIZ == null || (nLEModelLIZ = c0emn.LIZ()) == null || c0emn.LIZIZ == null || (videoPublishEditModel = c0emn.LIZJ) == null) {
            return;
        }
        if (!videoPublishEditModel.creativeModel.postPageModel.isEnterFromEPDirectly) {
            u4.LJJL(videoPublishEditModel, nLEModelLIZ, "ep_to_edit_save", true);
        }
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            C350200DoA.LIZJ((InterfaceC350240DoE) it2.next(), c0emn);
        }
    }

    @Override // X.C0EMV
    public final void LJ(C0EMO c0emo) {
        LIZ(c0emo);
    }

    @Override // X.InterfaceC350250DoF
    public final void LJFF(C348820Dlw c348820Dlw) {
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            C350200DoA.LIZIZ((InterfaceC350240DoE) it2.next(), c348820Dlw);
        }
    }
}
