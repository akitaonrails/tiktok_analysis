package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EYQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EYQ {
    public static final String LIZ(NLEModel nLEModel) {
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            return mainTrack.getExtra("using_template_type");
        }
        return null;
    }

    public static final NLETrack LIZIZ(NLEModel nLEModel) {
        NLETrack next;
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C351220Dpo.LLILLL(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public static final boolean LIZJ(NLEModel nLEModel) {
        String extra;
        NLETrack mainTrack = nLEModel.getMainTrack();
        String strLJIL = null;
        if (mainTrack != null && (extra = mainTrack.getExtra("biz_template_biz_data")) != null) {
            try {
                new p();
                k kVarLIZJ = p.LIZJ(extra);
                if (kVarLIZJ instanceof n) {
                    k kVarLJJIIZ = kVarLIZJ.LJIILIIL().LJJIIZ("resize_optimized");
                    if (kVarLJJIIZ != null) {
                        strLJIL = kVarLJJIIZ.LJIL();
                    }
                    return Intrinsics.LJFF(strLJIL, "true");
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }

    public static final boolean LIZLLL(NLEModel nLEModel) {
        String extra;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            extra = mainTrack.getExtra("is_template_has_original_sound");
        } else {
            extra = null;
        }
        return Intrinsics.LJFF(extra, "true");
    }

    public static final void LJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getTrackType() != NLETrackType.VIDEO && nLETrack2.getTrackType() != NLETrackType.MV) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((NLENode) it2.next()).setExtra("is_from_template", "true");
        }
        VecNLETrackSPtr tracks2 = nLEModel.getTracks();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrack nLETrack3 : tracks2) {
            NLETrack nLETrack4 = nLETrack3;
            if (nLETrack4.getTrackType() != NLETrackType.VIDEO && nLETrack4.getTrackType() != NLETrackType.MV) {
                arrayList2.add(nLETrack3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList3);
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((NLENode) it4.next()).setExtra("is_from_template", "true");
        }
    }

    public static final int LJIIIIZZ(NLEModel nLEModel) {
        String extra;
        if (nLEModel.getMainTrack() == null) {
            return 0;
        }
        VecNLETrackSlotSPtr slots = nLEModel.getMainTrack().getSlots();
        ArrayList arrayList = new ArrayList();
        for (NLETrackSlot nLETrackSlot : slots) {
            NLETrackSlot nLETrackSlot2 = nLETrackSlot;
            if (nLETrackSlot2 != null) {
                extra = nLETrackSlot2.getExtra("is_from_template");
            } else {
                extra = null;
            }
            if (!Intrinsics.LJFF(extra, "true")) {
                arrayList.add(nLETrackSlot);
            }
        }
        return arrayList.size();
    }

    public static final boolean LJIIIZ(InterfaceC1452170ntP interfaceC1452170ntP) {
        NLEModel nLEModelLIZ;
        String strLIZ;
        if (interfaceC1452170ntP == null || (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) == null || (strLIZ = LIZ(nLEModelLIZ)) == null || !Intrinsics.LJFF(strLIZ, String.valueOf(EnumC1412640mre.AI_ALIVE_TEMPLATE.getValue()))) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIJ(NLEModel nLEModel) {
        return Intrinsics.LJFF(LIZ(nLEModel), String.valueOf(EnumC1412640mre.AIGT.getValue()));
    }

    public static final boolean LJIIJJI(NLEModel nLEModel) {
        String strLIZ = LIZ(nLEModel);
        if (strLIZ != null) {
            if (Intrinsics.LJFF(strLIZ, String.valueOf(EnumC1412640mre.ALGORITHM_TEMPLATE.getValue())) || Intrinsics.LJFF(strLIZ, String.valueOf(EnumC1412640mre.DESIGNER_FIXED_TEMPLATE.getValue()))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIIL(NLEModel nLEModel) {
        if (C294050Bfn.LIZ()) {
            return C13LP.LJJJJ(LIZ(nLEModel), C1697810uHb.LJIIJJI(String.valueOf(EnumC1412640mre.CUT_SAME.getValue()), String.valueOf(EnumC1412640mre.PUGC_TEMPLATE.getValue()), String.valueOf(EnumC1412640mre.ALGORITHM_TEMPLATE.getValue()), String.valueOf(EnumC1412640mre.DESIGNER_FIXED_TEMPLATE.getValue()), String.valueOf(EnumC1412640mre.AIGT.getValue()), String.valueOf(EnumC1412640mre.SGT.getValue()), String.valueOf(EnumC1412640mre.UGC_TEMPLATE.getValue())));
        }
        return C13LP.LJJJJ(LIZ(nLEModel), C1697810uHb.LJIIJJI(String.valueOf(EnumC1412640mre.CUT_SAME.getValue()), String.valueOf(EnumC1412640mre.PUGC_TEMPLATE.getValue()), String.valueOf(EnumC1412640mre.ALGORITHM_TEMPLATE.getValue()), String.valueOf(EnumC1412640mre.DESIGNER_FIXED_TEMPLATE.getValue()), String.valueOf(EnumC1412640mre.UGC_TEMPLATE.getValue())));
    }

    public static final boolean LJIILIIL(NLEModel nLEModel) {
        return Intrinsics.LJFF(LIZ(nLEModel), String.valueOf(EnumC1412640mre.AUTO_PICK_TEMPLATE.getValue()));
    }

    public static final boolean LJIILJJIL(NLEModel nLEModel) {
        return Intrinsics.LJFF(LIZ(nLEModel), String.valueOf(EnumC1412640mre.CUT_SAME.getValue()));
    }

    public static final boolean LJIILL(NLEModel nLEModel) {
        return Intrinsics.LJFF(LIZ(nLEModel), String.valueOf(EnumC1412640mre.PUGC_TEMPLATE.getValue()));
    }

    public static final boolean LJIILLIIL(NLEModel nLEModel) {
        return Intrinsics.LJFF(LIZ(nLEModel), String.valueOf(EnumC1412640mre.SGT.getValue()));
    }

    public static final String LJIIZILJ(NLEModel nLEModel) {
        NLETrack mainTrack;
        if ((LJIILJJIL(nLEModel) || LJIILL(nLEModel) || LJIIJ(nLEModel) || LJIILLIIL(nLEModel) || Intrinsics.LJFF(LIZ(nLEModel), String.valueOf(EnumC1412640mre.UGC_TEMPLATE.getValue()))) && (mainTrack = nLEModel.getMainTrack()) != null) {
            return mainTrack.getExtra("using_template_id");
        }
        return null;
    }

    public static final void LJFF(NLEModel nLEModel, int i, String str) {
        if (nLEModel.getMainTrack() == null) {
            return;
        }
        nLEModel.getMainTrack().setExtra("using_template_type", String.valueOf(i));
        if (C123100dR.LIZ(str)) {
            nLEModel.getMainTrack().setExtra("using_template_id", str);
        }
        LJ(nLEModel);
    }

    public static final void LJI(NLETemplateModel nLETemplateModel, int i, String str) {
        if (nLETemplateModel.getMainTrack() == null) {
            return;
        }
        nLETemplateModel.getMainTrack().setExtra("using_template_type", String.valueOf(i));
        if (C123100dR.LIZ(str)) {
            nLETemplateModel.getMainTrack().setExtra("using_template_id", str);
        }
        VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.VIDEO) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            for (NLETrackSlot nLETrackSlot : ((NLETrack) it2.next()).getSlots()) {
                VecNLETrackSlotSPtr mutableAssetItems = nLETemplateModel.getMutableAssetItems();
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(mutableAssetItems, 10));
                Iterator<NLETrackSlot> it3 = mutableAssetItems.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(it3.next().getUUID());
                }
                if (!arrayList2.contains(nLETrackSlot.getUUID())) {
                    nLETrackSlot.setExtra("is_from_template", "true");
                }
            }
        }
        LJ(nLETemplateModel);
    }

    public static final void LJII(NLETemplateModel nLETemplateModel, int i, String str, boolean z) {
        if (nLETemplateModel.getMainTrack() == null) {
            return;
        }
        nLETemplateModel.getMainTrack().setExtra("is_template_has_original_sound", String.valueOf(z));
        LJI(nLETemplateModel, i, str);
    }
}
