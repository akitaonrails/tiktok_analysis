package X;

import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C391500FWq extends C19IN {
    public final int $t;
    public Object l0;

    @Override // X.C19IN
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C391500FWq(Object obj, int i) {
        super(800, true);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C391500FWq c391500FWq, View view) {
        NLEEditor nLEEditorLIZ;
        NLESegment mainSegment;
        String extra;
        EffectPointModel next;
        C348100Dkm c348100DkmLIZIZ;
        C365100ETc c365100ETc = (C365100ETc) c391500FWq.l0;
        c365100ETc.getClass();
        int id = view.getId();
        if (id == R.id.video_layout) {
            c365100ETc.LLLLIL().LIZIZ.invoke();
            return;
        }
        if (id == R.id.rr0) {
            c365100ETc.LLLLIL().LJIIIIZZ.invoke();
            return;
        }
        if (id == R.id.lr1) {
            c365100ETc.LLLLIL().LIZIZ.invoke();
            return;
        }
        if (id == R.id.tv_save) {
            c365100ETc.LLLLIL().LIZ.invoke(Boolean.TRUE);
            return;
        }
        if (id == R.id.zbp) {
            c365100ETc.LLLLIL().LIZ.invoke(Boolean.FALSE);
            return;
        }
        if (id == R.id.lea) {
            C375830EoP<NLETrackSlot> c375830EoP = c365100ETc.LLLLILI().LIZ.LJIIIZ;
            if (c375830EoP != null) {
                C1428470nHB.LLILZIL(c365100ETc.LLJJJIL);
                c365100ETc.LLLLIL().LJ.invoke(c375830EoP.LIZ);
                return;
            }
            C1412870ms1 c1412870ms1 = C1412870ms1.LIZ;
            InterfaceC1452170ntP interfaceC1452170ntP = c365100ETc.LLJJLIIIJLLLLLLLZ;
            if (interfaceC1452170ntP == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP)) == null || (nLEEditorLIZ = c348100DkmLIZIZ.LIZ) == null) {
                nLEEditorLIZ = C346630DiP.LIZ();
            }
            VideoPublishEditModel videoPublishEditModel = c365100ETc.LLJJJIL;
            c1412870ms1.getClass();
            NLETrackSlot nLETrackSlotLIZ = C1412870ms1.LIZ(nLEEditorLIZ);
            if (nLETrackSlotLIZ == null || (mainSegment = nLETrackSlotLIZ.getMainSegment()) == null || (extra = mainSegment.getExtra("nleExtraEffectKey")) == null) {
                return;
            }
            Iterator<EffectPointModel> it2 = videoPublishEditModel.creativeModel.editEffectModel.effectList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getKey(), extra)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EffectPointModel effectPointModel = next;
            if (effectPointModel == null || !effectPointModel.fromMixMaterialPanel) {
                return;
            }
            c365100ETc.LLLLIL().LJ.invoke(nLETrackSlotLIZ);
            C201955140j.LIZ("EditEffectComponentV2 -> effectSlotSelected = null, find current effect slot");
            return;
        }
        if (id == R.id.llj) {
            C375830EoP<NLETrackSlot> c375830EoP2 = c365100ETc.LLLLILI().LIZ.LJIIIZ;
            if (c375830EoP2 == null) {
                return;
            }
            c365100ETc.LLLLIL().LJFF.invoke(c375830EoP2.LIZ);
            return;
        }
        if (id == R.id.lys) {
            c365100ETc.LLLLIL().LIZJ.invoke(Boolean.TRUE);
        } else {
            if (id != R.id.lt4) {
                return;
            }
            c365100ETc.LLLLIL().LIZJ.invoke(Boolean.FALSE);
        }
    }

    public static final void LIZ$1(C391500FWq c391500FWq, View view) {
        ((C374400Em6) c391500FWq.l0).LLLLIL().LIZIZ.invoke();
    }

    public static final void LIZ$2(C391500FWq c391500FWq, View view) {
        NLEAIMatting aIMatting;
        VideoPublishEditModel videoPublishEditModel;
        boolean zContains;
        VecNLETrackSlotSPtr slots;
        C355090Dw3.LIZIZ("-----AIMattingManager", "--cancelMattingView--");
        C0E6Y c0e6y = (C0E6Y) c391500FWq.l0;
        NLETrackSlot nLETrackSlotLLLLLLIL = c0e6y.LIZ.LLLLLLIL();
        if (nLETrackSlotLLLLLLIL != null && (aIMatting = nLETrackSlotLLLLLLIL.getAIMatting()) != null && (videoPublishEditModel = (VideoPublishEditModel) c0e6y.LJI.getValue()) != null) {
            NLETrack nLETrackRn = c0e6y.LIZ.Rn();
            if (nLETrackRn != null && (slots = nLETrackRn.getSlots()) != null) {
                zContains = slots.contains(nLETrackSlotLLLLLLIL);
            } else {
                zContains = false;
            }
            C0EI4 c0ei4 = C0EI4.LIZ;
            String extra = aIMatting.getExtra("ai_matting_from");
            if (extra == null) {
                extra = "click_button";
            }
            boolean zLJFF = Intrinsics.LJFF(extra, "long_press");
            EnumC373350EkP enumC373350EkP = EnumC373350EkP.INTERRUPTED;
            C0EI5 c0ei5 = C0EI5.AUTO_CUTOUT;
            c0ei4.getClass();
            C0EI4.LIZLLL(videoPublishEditModel, zLJFF, zContains, c0ei5, enumC373350EkP);
        }
        VecNLETrackSPtr tracks = ((C0E6Y) c391500FWq.l0).LIZ.LLFII().LLZ().getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
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
            if (((NLETrackSlot) obj).getAIMatting() != null) {
                arrayList3.add(obj);
            }
        }
        ArrayList<NLETrackSlot> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
            if (C354090DuR.LJI.contains(((NLENode) obj2).getUUID())) {
                arrayList4.add(obj2);
            }
        }
        for (NLETrackSlot nLETrackSlot : arrayList4) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("--cancelMattingView-- ");
            sbLIZ.append(nLETrackSlot.getUUID());
            C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ));
            ((C0E6Y) c391500FWq.l0).LIZ.LLFII().LLIIIJ(nLETrackSlot, EnumC356070Dxd.DONE);
        }
        CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet2 = C354090DuR.LIZ;
        C354090DuR.LJIILL(((C0E6Y) c391500FWq.l0).LIZ);
        View view2 = ((C0E6Y) c391500FWq.l0).LIZLLL;
        if (view2 != null) {
            C337180DJs.LIZ(view2);
        }
        ((C0E6Y) c391500FWq.l0).LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C391500FWq(C365100ETc c365100ETc, int i) {
        super(0, 3);
        this.$t = i;
        this.l0 = c365100ETc;
    }
}
