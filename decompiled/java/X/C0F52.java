package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F52, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F52 {
    public final C0F5K LIZ;

    public final void LIZ() {
        C0EJ3 c0ej3;
        List<TextStickerModel> listSb;
        C0E48 c0e48;
        Object next;
        NLETrack trackBySlot;
        C0E48 c0e482;
        NLEEditor nLEEditorLJI;
        NLEModel model;
        NLEModel nLEModelLIZJ = this.LIZ.LIZJ();
        if (nLEModelLIZJ == null || (c0ej3 = this.LIZ.LJ) == null || (listSb = c0ej3.Sb()) == null) {
            return;
        }
        ArrayList<TextStickerModel> arrayList = new ArrayList();
        for (TextStickerModel textStickerModel : listSb) {
            if (!textStickerModel.isNotEmptyModel()) {
                arrayList.add(textStickerModel);
            }
        }
        if (arrayList != null) {
            boolean z = false;
            for (TextStickerModel textStickerModel2 : arrayList) {
                C0EOK c0eok = this.LIZ.LJIILIIL;
                if (c0eok != null) {
                    c0eok.gN1(C364540EQy.LIZ(textStickerModel2), true, EnumC356070Dxd.COMMIT);
                }
                VecNLETrackSPtr tracks = nLEModelLIZJ.getTracks();
                if (tracks != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<NLETrack> it2 = tracks.iterator();
                    while (it2.hasNext()) {
                        C19719612Di.LJJI(it2.next().getSlots(), arrayList2);
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (Intrinsics.LJFF(((NLENode) next).getUUID(), textStickerModel2.getUuid())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    NLETrackSlot nLETrackSlot = (NLETrackSlot) next;
                    if (nLETrackSlot != null && (trackBySlot = nLEModelLIZJ.getTrackBySlot(nLETrackSlot)) != null) {
                        trackBySlot.removeSlot(nLETrackSlot);
                        if (trackBySlot.getSlots().isEmpty() && (c0e482 = this.LIZ.LIZIZ) != null && (nLEEditorLJI = c0e482.LLFII().LJI()) != null && (model = nLEEditorLJI.getModel()) != null) {
                            model.removeTrack(trackBySlot);
                        }
                        z = true;
                    }
                }
            }
            if (!z || (c0e48 = this.LIZ.LIZIZ) == null) {
                return;
            }
            C350870DpF.LIZ(c0e48, false);
        }
    }

    public final void LIZIZ() {
        C0E55 player;
        VecNLETrackSlotSPtr slots;
        C0E48 c0e48;
        C0E55 player2;
        VideoPublishEditModel videoPublishEditModel = this.LIZ.LIZJ;
        NLETrackSlot nLETrackSlot = null;
        if (!(videoPublishEditModel != null && C1416310mxZ.LJIILL(videoPublishEditModel))) {
            C0E48 c0e482 = this.LIZ.LIZIZ;
            NLETrack nLETrackLIZ = C349560Dn8.LIZ(c0e482 != null ? C350870DpF.LJI(c0e482) : null);
            if (nLETrackLIZ != null && (slots = nLETrackLIZ.getSlots()) != null) {
                nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots);
            }
            C0E48 c0e483 = this.LIZ.LIZIZ;
            if (c0e483 == null || (player = c0e483.getPlayer()) == null) {
                return;
            }
            player.ba(nLETrackSlot != null ? C352310DrZ.LIZ(nLETrackSlot.getStartTime()) : 0L, new C0FX2(this, nLETrackSlot, 1));
            return;
        }
        NLEModel nLEModelLIZJ = this.LIZ.LIZJ();
        if (nLEModelLIZJ != null) {
            Iterator<NLETrackSlot> it2 = C349550Dn7.LIZJ(nLEModelLIZJ).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                NLETrackSlot next = it2.next();
                NLETrackSlot nLETrackSlot2 = next;
                if (nLETrackSlot2.hasExtra("text") && !TextUtils.isEmpty(nLETrackSlot2.getExtra("text"))) {
                    nLETrackSlot = next;
                    break;
                }
            }
            NLETrackSlot nLETrackSlot3 = nLETrackSlot;
            if (nLETrackSlot3 == null || (c0e48 = this.LIZ.LIZIZ) == null || (player2 = c0e48.getPlayer()) == null) {
                return;
            }
            player2.ba(C352310DrZ.LIZ(nLETrackSlot3.getStartTime()), new C0FX2(this, nLETrackSlot3, 0));
        }
    }

    public C0F52(C0F5K c0f5k) {
        this.LIZ = c0f5k;
    }
}
