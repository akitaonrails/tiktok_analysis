package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.keva.Keva;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Dou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350660Dou {
    public static final Keva LIZ = Keva.getRepo("video_anim_clip_toast_repo");

    public static boolean LIZJ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_add_anim_sub_menu_in_effect", true, false) || C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_enable_anim_in_edit_panel", true, false);
    }

    public static boolean LIZIZ(NLEModel nLEModel) {
        boolean z;
        boolean z2;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null && !tracks.isEmpty()) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                if (C351220Dpo.LLLLILI(it2.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_add_anim_tab_at_effect_panel", true, false);
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_add_anim_tab_at_effect_panel", true, false) && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_add_anim_sub_menu_in_effect", true, false) && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_enable_anim_in_edit_panel", true, false)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (zLJIIIZ || (!z2 && z)) {
            return true;
        }
        return false;
    }

    public static void LIZ(NLETrackSlot nLETrackSlot, NLEModel nLEModel, C0E48 c0e48) {
        NLETrackSlot nLETrackSlotLIZJ;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        if (nLEModel != null && (nLETrackSlotLIZJ = C350700Doy.LIZJ(nLEModel, nLETrackSlot)) != null) {
            String strLJIIZILJ = C351220Dpo.LJIIZILJ(nLETrackSlot);
            if (strLJIIZILJ == null) {
                strLJIIZILJ = "";
            }
            C350650Dot c350650Dot = new C350650Dot(nLETrackSlotLIZJ, strLJIIZILJ);
            if (c0e48 != null && (interfaceC351350Dq1LLFII = c0e48.LLFII()) != null) {
                interfaceC351350Dq1LLFII.LJ(c350650Dot, EnumC356070Dxd.COMMIT);
            }
            C351510DqH.LIZ.getClass();
            C351510DqH.LJIIIIZZ(nLEModel);
            C351510DqH.LJIIJJI(nLEModel, NLETrackType.EFFECT, "");
            C0E1X c0e1x = new C0E1X(C0E1V.DELETE.getNameId(), null, null, null, null, 30);
            if (c0e48 != null) {
                C350870DpF.LIZJ(c0e48, C051R.LIZIZ(c0e1x));
                C0E55 player = c0e48.getPlayer();
                if (player != null) {
                    player.pause(false);
                }
            }
        }
    }

    public static void LIZLLL(List list, NLETrackSlot nLETrackSlot, long j, long j2, NLEModel nLEModel, NLEEditor nLEEditor) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                NLETrackSlot nLETrackSlot2 = (NLETrackSlot) it2.next();
                if (j2 < 0) {
                    long j3 = -j2;
                    long endTime = j - nLETrackSlot2.getEndTime();
                    long duration = (nLETrackSlot2.getDuration() + endTime) - 100000;
                    if (1 + endTime <= j3 && j3 <= duration) {
                        long duration2 = nLETrackSlot2.getDuration() - (j3 - endTime);
                        nLETrackSlot2.setDuration(duration2);
                        nLETrackSlot2.setEndTime(nLETrackSlot2.getStartTime() + duration2);
                        C350640Dos.LIZLLL(nLEModel, nLETrackSlot2);
                    } else if (j3 > duration) {
                        NLETrack trackBySlot = nLEModel.getTrackBySlot(nLETrackSlot2);
                        if (trackBySlot != null) {
                            trackBySlot.removeSlot(nLETrackSlot2);
                        }
                        C350640Dos.LIZJ(nLETrackSlot2, nLETrackSlot, nLEModel, nLEEditor);
                    }
                } else {
                    if (C351220Dpo.LLJJL(nLETrackSlot2)) {
                        long duration3 = nLETrackSlot2.getDuration();
                        long startTime = nLETrackSlot.getStartTime();
                        C351510DqH c351510DqH = C351510DqH.LIZ;
                        NLETrack mainTrack = nLEModel.getMainTrack();
                        c351510DqH.getClass();
                        nLETrackSlot2.setStartTime(startTime + C351510DqH.LJJIJ(mainTrack, nLETrackSlot));
                        nLETrackSlot2.setEndTime(nLETrackSlot2.getStartTime() + duration3);
                    }
                    C350640Dos.LIZ(nLETrackSlot2, nLETrackSlot);
                    C350640Dos.LIZLLL(nLEModel, nLETrackSlot2);
                }
            }
        }
    }

    public static void LJ(List list, NLETrackSlot nLETrackSlot, long j, long j2, NLEModel nLEModel, NLEEditor nLEEditor) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                NLETrackSlot nLETrackSlot2 = (NLETrackSlot) it2.next();
                if (j2 > 0) {
                    long startTime = nLETrackSlot2.getStartTime() - j;
                    long duration = (nLETrackSlot2.getDuration() + startTime) - 100000;
                    if (j2 <= startTime) {
                        C351220Dpo.LLLIIIIL(nLETrackSlot2);
                        C351220Dpo.LLJILJIL(nLETrackSlot2);
                        C350640Dos.LIZLLL(nLEModel, nLETrackSlot2);
                    } else if (startTime + 1 <= j2 && j2 <= duration) {
                        nLETrackSlot2.setStartTime(nLETrackSlot2.getStartTime() + j2);
                    } else if (j2 > duration) {
                        nLEModel.getTrackBySlot(nLETrackSlot2).removeSlot(nLETrackSlot2);
                        C350640Dos.LIZJ(nLETrackSlot2, nLETrackSlot, nLEModel, nLEEditor);
                    }
                } else {
                    if (C351220Dpo.LLJJL(nLETrackSlot2)) {
                        nLETrackSlot2.setStartTime(nLETrackSlot2.getStartTime() + j2);
                        nLETrackSlot2.setEndTime(nLETrackSlot2.getEndTime() + j2);
                    }
                    C351220Dpo.LLLIIIIL(nLETrackSlot2);
                    C351220Dpo.LLJILJIL(nLETrackSlot2);
                    C350640Dos.LIZLLL(nLEModel, nLETrackSlot2);
                }
            }
        }
    }
}
