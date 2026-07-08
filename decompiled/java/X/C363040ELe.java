package X;

import android.util.LruCache;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLECommitSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ELe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363040ELe {
    public final Function0<VideoPublishEditModel> LIZ;
    public final NLEEditor LIZIZ;
    public final C0E48 LIZJ;
    public final InterfaceC363160ELq LIZLLL;
    public final Lifecycle LJ;
    public final InterfaceC360800ECo LJFF;
    public final Map<String, Pair<String, String>> LJI = new LinkedHashMap();
    public final LruCache<String, C558340Lv6> LJII = new LruCache<>(10);
    public boolean LJIIIIZZ;

    public static C0E1X LIZIZ(AIGCGenerationParam aIGCGenerationParam) {
        if (aIGCGenerationParam.mediaType != AIGCGenerationParamType.T2V_TYPE) {
            return new C0E1X(C0E1V.EDITOR_AIGC_IMAGE.getNameId(), "editor_pro_aigc", null, null, null, 28);
        }
        return new C0E1X(C0E1V.EDITOR_AIGC_VIDEO.getNameId(), "editor_pro_aigc", null, null, null, 28);
    }

    public final void LIZLLL(NLEEditor nLEEditor) {
        Boolean boolValueOf;
        if (nLEEditor == null) {
            return;
        }
        nLEEditor.trim(0L, 0L);
        InterfaceC360800ECo interfaceC360800ECo = this.LJFF;
        Boolean boolValueOf2 = null;
        if (interfaceC360800ECo != null) {
            EnumC373450EkZ[] enumC373450EkZArr = {EnumC373450EkZ.UNDO};
            C0E48 c0e48 = this.LIZJ;
            if (c0e48 != null) {
                boolValueOf = Boolean.valueOf(c0e48.Bo().LIZ());
            } else {
                boolValueOf = null;
            }
            C0EB4.LIZIZ(interfaceC360800ECo, enumC373450EkZArr, null, boolValueOf, null, null, 26);
        }
        InterfaceC360800ECo interfaceC360800ECo2 = this.LJFF;
        if (interfaceC360800ECo2 != null) {
            EnumC373450EkZ[] enumC373450EkZArr2 = {EnumC373450EkZ.REDO};
            C0E48 c0e482 = this.LIZJ;
            if (c0e482 != null) {
                boolValueOf2 = Boolean.valueOf(c0e482.Bo().LJFF());
            }
            C0EB4.LIZIZ(interfaceC360800ECo2, enumC373450EkZArr2, null, boolValueOf2, null, null, 26);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x031f A[PHI: r4
      0x031f: PHI (r4v31 long) = (r4v9 long), (r4v32 long) binds: [B:105:0x020b, B:103:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.ies.nle.editor_jni.NLETrackSlot r44, boolean r45) {
        /*
            Method dump skipped, instruction units count: 829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363040ELe.LIZJ(com.bytedance.ies.nle.editor_jni.NLETrackSlot, boolean):void");
    }

    public C363040ELe(AwS549S0100000_5 awS549S0100000_5, NLEEditor nLEEditor, C0E48 c0e48, InterfaceC363160ELq interfaceC363160ELq, Lifecycle lifecycle, InterfaceC360800ECo interfaceC360800ECo) {
        this.LIZ = awS549S0100000_5;
        this.LIZIZ = nLEEditor;
        this.LIZJ = c0e48;
        this.LIZLLL = interfaceC363160ELq;
        this.LJ = lifecycle;
        this.LJFF = interfaceC360800ECo;
    }

    public final void LIZ(String str, String str2, NLEEditor nLEEditor, String str3, boolean z, boolean z2, String str4) {
        NLEModel model;
        long size;
        C354710DvR c354710DvR;
        String uuid;
        boolean z3;
        boolean z4;
        boolean z5;
        NLECommit head;
        String uuid2;
        NLECommit head2;
        NLECommit headPrev;
        long size2;
        NLEBranch branch;
        VecNLECommitSPtr commits;
        NLECommit nLECommit;
        NLEModel model2;
        VecNLETrackSPtr tracks;
        NLEBranch branch2;
        VecNLECommitSPtr commits2;
        NLEBranch branch3;
        VecNLECommitSPtr commits3;
        C385300F8u c385300F8u = C385300F8u.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("doneFinishAsyncTask asyncTaskId ");
        sbLIZ.append(str2);
        sbLIZ.append("isSuccess: ");
        sbLIZ.append(z);
        sbLIZ.append("  epId: ");
        sbLIZ.append(str);
        C201955140j.LIZJ(c385300F8u, C2188811AlT.LIZIZ(sbLIZ));
        if (nLEEditor == null || (model = nLEEditor.getModel()) == null) {
            return;
        }
        NLEEditor nLEEditor2 = this.LIZIZ;
        if (nLEEditor2 != null && (branch3 = nLEEditor2.getBranch()) != null && (commits3 = branch3.getCommits()) != null) {
            size = commits3.size();
            if (size > 0 && !this.LJ.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                this.LJIIIIZZ = true;
            }
        } else {
            size = 0;
        }
        if (size <= Long.MIN_VALUE) {
            C354710DvR.LLILZIL.getClass();
            c354710DvR = C354710DvR.LLILZLL;
        } else {
            c354710DvR = new C354710DvR(0, size - 1);
        }
        Iterator<Long> it2 = c354710DvR.iterator();
        while (true) {
            String description = null;
            if (((C1932707hd) it2).LLILLL) {
                long jNextLong = ((AbstractC1902407ck) it2).nextLong();
                NLEEditor nLEEditor3 = this.LIZIZ;
                if (nLEEditor3 != null && (branch2 = nLEEditor3.getBranch()) != null && (commits2 = branch2.getCommits()) != null) {
                    size2 = commits2.size();
                } else {
                    size2 = -1;
                }
                if (jNextLong > size2 - 1) {
                    return;
                }
                NLEEditor nLEEditor4 = this.LIZIZ;
                if (nLEEditor4 != null && (branch = nLEEditor4.getBranch()) != null && (commits = branch.getCommits()) != null && (nLECommit = commits.getitem((int) jNextLong)) != null && (model2 = nLECommit.getModel()) != null && (tracks = model2.getTracks()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (NLETrack nLETrack : tracks) {
                        NLETrack nLETrack2 = nLETrack;
                        if (nLETrack2.getMainTrack() || C351220Dpo.LLLIIL(nLETrack2)) {
                            arrayList.add(nLETrack);
                        }
                    }
                    ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList2);
                    }
                    for (NLETrackSlot nLETrackSlot : arrayList2) {
                        if (Intrinsics.LJFF(C377740ErU.LIZIZ(nLETrackSlot), str) && Intrinsics.LJFF(C352250DrT.LJII(nLETrackSlot), str2)) {
                            C201955140j.LIZJ(C385300F8u.LIZIZ, "doneFinishAsyncTask editor oldModel");
                            LIZJ(nLETrackSlot, z);
                            C377740ErU.LJIIJ(nLETrackSlot, str4);
                        }
                    }
                }
                C201955140j.LIZJ(C559380Lwm.LIZIZ, "____________________________");
            } else {
                if (!z2) {
                    return;
                }
                NLEBranch branch4 = nLEEditor.getBranch();
                String str5 = "";
                if (branch4 == null || (headPrev = branch4.getHeadPrev()) == null || (uuid = headPrev.getUUID()) == null) {
                    uuid = "";
                }
                NLEBranch branch5 = nLEEditor.getBranch();
                if (branch5 != null && (head2 = branch5.getHead()) != null) {
                    description = head2.getDescription();
                }
                VecNLETrackSPtr tracks2 = model.getTracks();
                if (tracks2 != null) {
                    ArrayList<NLETrack> arrayList3 = new ArrayList();
                    for (NLETrack nLETrack3 : tracks2) {
                        NLETrack nLETrack4 = nLETrack3;
                        if (nLETrack4.getMainTrack() || C351220Dpo.LLLIIL(nLETrack4)) {
                            arrayList3.add(nLETrack3);
                        }
                    }
                    z4 = false;
                    z3 = false;
                    for (NLETrack nLETrack5 : arrayList3) {
                        for (NLETrackSlot nLETrackSlot2 : nLETrack5.getSlots()) {
                            if (Intrinsics.LJFF(C377740ErU.LIZIZ(nLETrackSlot2), str) && Intrinsics.LJFF(C352250DrT.LJII(nLETrackSlot2), str2)) {
                                C201955140j.LIZJ(C385300F8u.LIZIZ, "replace current slot");
                                LIZJ(nLETrackSlot2, z);
                                C377740ErU.LJIIJ(nLETrackSlot2, str4);
                                if (nLETrack5.getMainTrack()) {
                                    z3 = true;
                                } else {
                                    z4 = true;
                                }
                            }
                        }
                    }
                } else {
                    z3 = false;
                    z4 = false;
                }
                if (uuid.length() == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                NLEEditor nLEEditor5 = this.LIZIZ;
                if (nLEEditor5 != null) {
                    C350410DoV.LIZLLL(nLEEditor5, true, description, false, true);
                }
                InterfaceC363160ELq interfaceC363160ELq = this.LIZLLL;
                if (interfaceC363160ELq != null) {
                    interfaceC363160ELq.P50(z3, z4);
                }
                NLEBranch branch6 = nLEEditor.getBranch();
                if (branch6 != null && (head = branch6.getHead()) != null && (uuid2 = head.getUUID()) != null) {
                    str5 = uuid2;
                }
                if (z5) {
                    LIZLLL(this.LIZIZ);
                } else {
                    NLEBranch branch7 = nLEEditor.getBranch();
                    if (branch7 != null) {
                        branch7.trimRange(uuid, str5);
                    }
                }
                InterfaceC363160ELq interfaceC363160ELq2 = this.LIZLLL;
                if (interfaceC363160ELq2 != null) {
                    interfaceC363160ELq2.dd0(str3);
                    return;
                }
                return;
            }
        }
    }
}
