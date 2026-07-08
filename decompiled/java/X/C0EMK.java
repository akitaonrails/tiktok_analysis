package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.android.ugc.gamora.editorpro.model.EditorProSaveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;
import l5a.a;

/* JADX INFO: renamed from: X.0EMK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EMK implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C1DRG LL;
    public final C372480Ej0 LLILLJJLI;
    public final C1664750tQH LLJ;
    public final C1664750tQH LLJI;
    public final C1664740tQG LLJIJIL;
    public final C1664750tQH LLJILJIL;
    public C0EXL LLJILLL;
    public final C0EMT LLILLL = new C0EMM<AbstractC350210DoB, NLEModel>() { // from class: X.0EMT
    };
    public final C0EMU LLILZ = new C0EMM<InterfaceC350250DoF, C348820Dlw>() { // from class: X.0EMU
    };
    public final C0EMR LLILZIL = new C0EMM<InterfaceC350230DoD, C348820Dlw>() { // from class: X.0EMR
    };
    public final C0EMW LLILZLL = new C0EMM<InterfaceC350220DoC, C0EMN>() { // from class: X.0EMW
    };
    public final C0EMS LLIZ = new C0EMS();
    public final List<InterfaceC350240DoE> LLIZLLLIL = new ArrayList();
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1069));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EMK.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0EMK.class, "oldModel", "getOldModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0EMK.class, "editProSaveApi", "getEditProSaveApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0EMK.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public final VideoPublishEditModel LIZ() {
        return (VideoPublishEditModel) this.LLJI.getValue(this, LLJJ[1]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C0EMQ r7) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EMK.LIZJ(X.0EMQ):void");
    }

    public final void LIZLLL(InterfaceC350240DoE interfaceC350240DoE) {
        ((ArrayList) this.LLIZLLLIL).add(interfaceC350240DoE);
        LIZ(interfaceC350240DoE);
        LIZ(interfaceC350240DoE);
        LIZ(interfaceC350240DoE);
        LIZ(interfaceC350240DoE);
        this.LLIZ.LIZ(interfaceC350240DoE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0EMT] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0EMU] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0EMR] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0EMW] */
    public C0EMK(C1DRG c1drg, C372480Ej0 c372480Ej0) {
        this.LL = c1drg;
        this.LLILLJJLI = c372480Ej0;
        this.LLJ = C1664770tQJ.LIZ(c1drg, C0EY2.class, null);
        this.LLJI = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC377540ErA.class, null);
        this.LLJILJIL = C1664770tQJ.LIZ(c1drg, C0E5S.class, null);
    }

    public final void LIZIZ(C0EMQ c0emq, boolean z) {
        VideoPublishEditModel editModel;
        C0EHJ c0ehj;
        VecNLETrackSlotSPtr slots;
        C0EMT c0emt = this.LLILLL;
        NLEModel nLEModelLLZ = c0emq.LLZ();
        c0emt.getClass();
        VecNLETrackSPtr tracks = nLEModelLLZ.getTracks();
        if (tracks != null) {
            for (NLETrack nLETrack : tracks) {
                if (nLETrack != null && (slots = nLETrack.getSlots()) != null) {
                    for (NLETrackSlot nLETrackSlot : slots) {
                        Iterator it2 = ((ArrayList) c0emt.LIZIZ).iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = ((ArrayList) ((AbstractC350210DoB) it2.next()).LL).iterator();
                            while (it3.hasNext()) {
                                ((InterfaceC347150DjF) it3.next()).LIZIZ(nLETrack, nLETrackSlot);
                            }
                        }
                    }
                }
            }
        }
        C366310EXt c366310EXtLIZLLL = c0emq.LIZLLL();
        if (c366310EXtLIZLLL == null) {
            return;
        }
        C0EHI value = ((C0EY2) this.LLJ.getValue(this, LLJJ[0])).zu2().getValue();
        if (value == null || (c0ehj = value.LIZ) == null || (editModel = c0ehj.LIZ) == null) {
            EditModelProvider.Companion.getClass();
            editModel = C0E1T.LIZ().getEditModel();
        }
        C348820Dlw c348820Dlw = new C348820Dlw();
        c348820Dlw.LIZ = (C0E48) this.LLJILJILJ.getValue();
        c348820Dlw.LIZIZ = editModel;
        for (InterfaceC350250DoF interfaceC350250DoF : (ArrayList) this.LLILZ.LIZIZ) {
            if ((interfaceC350250DoF instanceof InterfaceC350250DoF) && interfaceC350250DoF != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                interfaceC350250DoF.LJFF(c348820Dlw);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                String simpleName = interfaceC350250DoF.getClass().getSimpleName();
                C563650M8t c563650M8t = C563650M8t.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(simpleName);
                sbLIZ.append(" [nle-update] ");
                sbLIZ.append(jCurrentTimeMillis2);
                C201955140j.LIZLLL(c563650M8t, "EPSyncTask", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        C0EMR c0emr = this.LLILZIL;
        c0emr.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it4 = ((ArrayList) c0emr.LIZIZ).iterator();
        while (it4.hasNext()) {
            arrayList.add(new C095D(new C353420DtM((InterfaceC350230DoD) it4.next(), c348820Dlw, null)));
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
        C201955140j.LIZLLL(c563650M8t2, "EPSyncTask", "EPModelUpdateExecutor [process] flow start");
        C23250099c.LJ(C23271099x.INSTANCE, new C415101jR(arrayList, null));
        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("EPModelUpdateExecutor [process] flow end ");
        sbLIZ2.append(jCurrentTimeMillis4);
        C201955140j.LIZLLL(c563650M8t2, "EPSyncTask", C2188811AlT.LIZIZ(sbLIZ2));
        C0EMN c0emn = new C0EMN();
        c0emn.LIZ = (C0E48) this.LLJILJILJ.getValue();
        c0emn.LIZLLL = c366310EXtLIZLLL;
        c0emn.LIZIZ = editModel;
        c0emn.LIZJ = LIZ();
        C0EXL c0exl = this.LLJILLL;
        if (c0exl != null) {
            c0exl.LIZLLL(c0emn);
        }
        Iterator it5 = ((ArrayList) this.LLILZLL.LIZIZ).iterator();
        while (it5.hasNext()) {
            C350200DoA.LIZJ((InterfaceC350240DoE) it5.next(), c0emn);
        }
        C0EMO c0emo = new C0EMO();
        c0emo.LIZ = (C0E48) this.LLJILJILJ.getValue();
        c0emo.LIZLLL = c366310EXtLIZLLL;
        c0emo.LIZIZ = editModel;
        c0emo.LIZJ = LIZ();
        C0EMS c0ems = this.LLIZ;
        c0ems.LIZJ = !z;
        for (C0EMV c0emv : (ArrayList) c0ems.LIZIZ) {
            if (c0ems.LIZJ) {
                if ((c0emv instanceof C0EMV) && c0emv != null) {
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    c0emv.LIZJ(c0emo);
                    long jCurrentTimeMillis6 = System.currentTimeMillis() - jCurrentTimeMillis5;
                    String simpleName2 = c0emv.getClass().getSimpleName();
                    C563650M8t c563650M8t3 = C563650M8t.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(simpleName2);
                    sbLIZ3.append(" [goPublish] ");
                    sbLIZ3.append(jCurrentTimeMillis6);
                    C201955140j.LIZLLL(c563650M8t3, "EPSyncTask", C2188811AlT.LIZIZ(sbLIZ3));
                }
            } else if ((c0emv instanceof C0EMV) && c0emv != null) {
                long jCurrentTimeMillis7 = System.currentTimeMillis();
                c0emv.LJ(c0emo);
                long jCurrentTimeMillis8 = System.currentTimeMillis() - jCurrentTimeMillis7;
                String simpleName3 = c0emv.getClass().getSimpleName();
                C563650M8t c563650M8t4 = C563650M8t.LIZIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(simpleName3);
                sbLIZ4.append(" [safeBackToEdit] ");
                sbLIZ4.append(jCurrentTimeMillis8);
                C201955140j.LIZLLL(c563650M8t4, "EPSyncTask", C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
        a.LIZIZ.LIZIZ(LIZ().getCreationId(), new C1429980nJc(EnumC1429920nJW.EDIT_PRO_ADJUST_CLIP, LIZ(), null), this.LLILLJJLI.requireActivity());
        InterfaceC377540ErA interfaceC377540ErA = (InterfaceC377540ErA) this.LLJIJIL.getValue(this, LLJJ[2]);
        if (interfaceC377540ErA != null) {
            interfaceC377540ErA.Vc0(null, new EditorProSaveData(), c0emq.LIZ(), true);
        }
    }
}
