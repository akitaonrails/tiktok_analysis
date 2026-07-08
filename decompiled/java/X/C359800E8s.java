package X;

import androidx.fragment.app.Fragment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.base.bottombar.ShowPanelFragmentEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359800E8s implements C0E90 {
    public final InterfaceC359860E8y LIZ;
    public final InterfaceC359850E8x LIZIZ;
    public final C0E5S LIZJ;
    public final C0EB6 LIZLLL;
    public final C19EG LJ;
    public final C0E48 LJFF;
    public final C1DRG LJI;
    public final C01GW LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 923));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(274));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 922));
    public String LJIIJ;

    public static VideoPublishEditModel LIZLLL() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    public final ArrayList<C361980EHc> LJ() {
        return (ArrayList) this.LJII.getValue();
    }

    public final boolean LJI() {
        InterfaceC377410Eqx interfaceC377410Eqx = (InterfaceC377410Eqx) this.LJIIIZ.getValue();
        return interfaceC377410Eqx != null && interfaceC377410Eqx.LJLILLLLZI();
    }

    public final void LIZIZ(List<String> list) {
        C0E2C c0e2cLIZIZ;
        String value;
        Fragment fragmentLJJJJZI;
        C0E48 c0e48 = this.LJFF;
        if (c0e48 != null && (c0e2cLIZIZ = C0EB5.LIZIZ(c0e48, this.LIZLLL)) != null && c0e2cLIZIZ.LIZ) {
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(c0e2cLIZIZ.LIZJ, it2.next())) {
                    C0EB6 c0eb6 = this.LIZLLL;
                    if ((c0eb6 != null && c0eb6.LIZIZ()) || (value = ((ShowPanelFragmentEvent) this.LJIIIIZZ.getValue()).LL.getValue()) == null || (fragmentLJJJJZI = this.LJ.getSupportFragmentManager().LJJJJZI(value)) == null) {
                        return;
                    }
                    C362580EJk.LIZ(fragmentLJJJJZI);
                    C350870DpF.LJIIIZ(this.LJFF, "panel_bounce_event", new C0E2C(c0e2cLIZIZ.LIZIZ, c0e2cLIZIZ.LIZJ, false));
                    C350870DpF.LJIIIZ(this.LJFF, "is_bottom_panel_showing", Boolean.FALSE);
                    return;
                }
            }
        }
    }

    public final List<C361980EHc> LJFF(NLETrackSlot nLETrackSlot) {
        boolean z;
        boolean z2;
        int size;
        VideoPublishEditModel videoPublishEditModelLIZLLL;
        VideoPublishEditModel videoPublishEditModelLIZLLL2;
        VideoPublishEditModel videoPublishEditModelLIZLLL3;
        InterfaceC359850E8x interfaceC359850E8x;
        ArrayList<C361980EHc> arrayListLJ = LJ();
        AIGCBusinessType aIGCBusinessType = null;
        if (C0E5J.LJ(nLETrackSlot)) {
            arrayListLJ = this.LIZ.LIZJ(EnumC359810E8t.AI_GENERATING, null);
        } else if (C351220Dpo.LLJZ(nLETrackSlot)) {
            arrayListLJ = this.LIZ.LIZJ(EnumC359810E8t.MAGIC_GENERATING, null);
        } else if (!C0E5J.LJ(nLETrackSlot) && !C351220Dpo.LLJZ(nLETrackSlot)) {
            arrayListLJ = LJ();
        }
        ArrayList<C361980EHc> arrayList = new ArrayList(arrayListLJ);
        String strLIZIZ = C377740ErU.LIZIZ(nLETrackSlot);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        C377150EqX c377150EqX = C377150EqX.LIZ;
        boolean z3 = !((ArrayList) C377150EqX.LJIIZILJ(c377150EqX, LIZLLL(), strLIZIZ)).isEmpty();
        boolean z4 = !((ArrayList) C377150EqX.LJIILL(c377150EqX, LIZLLL(), strLIZIZ)).isEmpty();
        if (z3 && z4) {
            z = true;
        } else {
            z = false;
        }
        C19719612Di.LJJIIJ(arrayList, AFwS234S0000000_5.get$arr$(386), true);
        C19719612Di.LJJIIJ(arrayList, AFwS234S0000000_5.get$arr$(387), true);
        C19719612Di.LJJIIJ(arrayList, AFwS234S0000000_5.get$arr$(388), true);
        VideoPublishEditModel videoPublishEditModelLIZLLL4 = LIZLLL();
        if (videoPublishEditModelLIZLLL4 != null && u4.LJJIJIIJI(videoPublishEditModelLIZLLL4)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C0E5J.LIZ(nLETrackSlot) && z2 && (interfaceC359850E8x = this.LIZIZ) != null) {
            interfaceC359850E8x.LJIIIZ("bottom_item_overlay_edit_magic");
        }
        if (C379370Eu7.LIZIZ(LIZLLL()) && !C351220Dpo.LLJZ(nLETrackSlot)) {
            if (C0E5J.LJ(nLETrackSlot)) {
                if (z4 && !z3) {
                    C361980EHc c361980EHcLIZJ = LIZJ(this, "bottom_item_edit_ai_image", true, false, null, false, 28);
                    if (c361980EHcLIZJ != null) {
                        ListProtector.add(arrayList, 0, c361980EHcLIZJ);
                    }
                } else {
                    EditorProAIGCMediaItemModel editorProAIGCMediaItemModelLJIIJJI = C377150EqX.LJIIJJI(LIZLLL(), strLIZIZ, null, C1697810uHb.LJIIJJI(EditorProAIGCMediaItemModelStatus.LOADING, EditorProAIGCMediaItemModelStatus.COMPLETE, EditorProAIGCMediaItemModelStatus.ERROR));
                    if (editorProAIGCMediaItemModelLJIIJJI != null) {
                        aIGCBusinessType = editorProAIGCMediaItemModelLJIIJJI.businessType;
                    }
                    if (aIGCBusinessType == AIGCBusinessType.AI_EXTEND) {
                        C361980EHc c361980EHcLIZJ2 = LIZJ(this, "bottom_item_edit_ai_extend_modify", true, false, aIGCBusinessType, true, 4);
                        if (c361980EHcLIZJ2 != null) {
                            ListProtector.add(arrayList, 0, c361980EHcLIZJ2);
                        }
                    } else {
                        C361980EHc c361980EHcLIZJ3 = LIZJ(this, "bottom_item_edit_ai_video", true, false, aIGCBusinessType, false, 20);
                        if (c361980EHcLIZJ3 != null) {
                            ListProtector.add(arrayList, 0, c361980EHcLIZJ3);
                        }
                    }
                }
            } else if (C0E5J.LIZ(nLETrackSlot) && !C0E5J.LIZIZ(nLETrackSlot)) {
                if (z4) {
                    if (!LJI() && (videoPublishEditModelLIZLLL3 = LIZLLL()) != null) {
                        C377120EqU c377120EqU = C377120EqU.LIZ;
                        C0E48 c0e48 = this.LJFF;
                        c377120EqU.getClass();
                        C377120EqU.LJFF(videoPublishEditModelLIZLLL3, c0e48, "edit_toolbar", true);
                    }
                    if (z) {
                        if (C351220Dpo.LLJJIJIL(nLETrackSlot)) {
                            C361980EHc c361980EHcLIZJ4 = LIZJ(this, "bottom_item_edit_ai_image", true, false, null, false, 28);
                            if (c361980EHcLIZJ4 != null) {
                                ListProtector.add(arrayList, 0, c361980EHcLIZJ4);
                            }
                        } else {
                            C361980EHc c361980EHcLIZJ5 = LIZJ(this, "bottom_item_edit_ai_video", true, false, null, true, 12);
                            if (c361980EHcLIZJ5 != null) {
                                ListProtector.add(arrayList, 0, c361980EHcLIZJ5);
                            }
                        }
                    } else {
                        C361980EHc c361980EHcLIZJ6 = LIZJ(this, "bottom_item_edit_ai_image", true, false, null, false, 28);
                        if (c361980EHcLIZJ6 != null) {
                            ListProtector.add(arrayList, 0, c361980EHcLIZJ6);
                        }
                        if (((Boolean) C0BE0.LIZ.getValue()).booleanValue()) {
                            int i = 0;
                            C361980EHc c361980EHcLIZJ7 = LIZJ(this, "bottom_item_edit_ai_video", false, true, null, true, 8);
                            if (c361980EHcLIZJ7 != null) {
                                Iterator it2 = arrayList.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (Intrinsics.LJFF(((C361980EHc) it2.next()).LJI, "bottom_item_overlay_edit_crop")) {
                                            break;
                                        }
                                        i++;
                                    } else {
                                        i = -1;
                                        break;
                                    }
                                }
                                ListProtector.add(arrayList, i + 1, c361980EHcLIZJ7);
                            }
                        }
                    }
                } else if (z3) {
                    if (!LJI() && (videoPublishEditModelLIZLLL2 = LIZLLL()) != null) {
                        C377120EqU c377120EqU2 = C377120EqU.LIZ;
                        C0E48 c0e482 = this.LJFF;
                        c377120EqU2.getClass();
                        C377120EqU.LJFF(videoPublishEditModelLIZLLL2, c0e482, "edit_toolbar", true);
                    }
                    C19719612Di.LJJIIJ(arrayList, AFwS234S0000000_5.get$arr$(385), true);
                    C361980EHc c361980EHcLIZJ8 = LIZJ(this, "bottom_item_edit_ai_video", true, false, null, true, 12);
                    if (c361980EHcLIZJ8 != null) {
                        ListProtector.add(arrayList, 0, c361980EHcLIZJ8);
                    }
                }
            } else {
                InterfaceC359850E8x interfaceC359850E8x2 = this.LIZIZ;
                if (interfaceC359850E8x2 != null && interfaceC359850E8x2.LJ("bottom_item_root_edit") != null && ((Boolean) C0BE0.LIZ.getValue()).booleanValue()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext() && !Intrinsics.LJFF(((C361980EHc) it3.next()).LJI, "bottom_item_edit_adjust_filter")) {
                    }
                    if (C379370Eu7.LIZIZ(LIZLLL()) && C351220Dpo.LLJJIJIL(nLETrackSlot)) {
                        if (!LJI() && (videoPublishEditModelLIZLLL = LIZLLL()) != null) {
                            C377120EqU c377120EqU3 = C377120EqU.LIZ;
                            C0E48 c0e483 = this.LJFF;
                            c377120EqU3.getClass();
                            C377120EqU.LJFF(videoPublishEditModelLIZLLL, c0e483, "edit_toolbar", true);
                        }
                        Iterator it4 = arrayList.iterator();
                        int i2 = 0;
                        while (true) {
                            if (it4.hasNext()) {
                                if (Intrinsics.LJFF(((C361980EHc) it4.next()).LJI, "bottom_item_overlay_edit_crop")) {
                                    break;
                                }
                                i2++;
                            } else {
                                i2 = -1;
                                break;
                            }
                        }
                        ListProtector.add(arrayList, i2 + 1, C359830E8v.LIZIZ(this.LJ));
                    }
                }
            }
        }
        C369780Eee c369780Eee = C369780Eee.LIZ;
        VideoPublishEditModel videoPublishEditModelLIZLLL5 = LIZLLL();
        c369780Eee.getClass();
        if (C369780Eee.LIZ(videoPublishEditModelLIZLLL5) && !C351220Dpo.LLJJIJIL(nLETrackSlot) && !C0E5J.LJ(nLETrackSlot) && !C351220Dpo.LLJZ(nLETrackSlot)) {
            Iterator it5 = arrayList.iterator();
            int i3 = 0;
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((C361980EHc) it5.next()).LJI, "bottom_item_overlay_edit_crop")) {
                    if (i3 >= 0) {
                        size = i3 + 1;
                    }
                } else {
                    i3++;
                }
            }
            size = arrayList.size();
            C361980EHc c361980EHcLIZJ9 = C359830E8v.LIZJ(this.LJ, false, false);
            if (!arrayList.isEmpty()) {
                for (C361980EHc c361980EHc : arrayList) {
                    if (Intrinsics.LJFF(c361980EHc.LJI, "bottom_item_edit_ai_extend") || Intrinsics.LJFF(c361980EHc.LJI, "ai_extend")) {
                    }
                }
            }
            ListProtector.add(arrayList, size, c361980EHcLIZJ9);
            return arrayList;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:259:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x056c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ce  */
    @Override // X.C0E90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C361980EHc LIZ(com.bytedance.ies.nle.editor_jni.NLETrack r16, com.bytedance.ies.nle.editor_jni.NLETrackSlot r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 1431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C359800E8s.LIZ(com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETrackSlot, boolean, boolean):X.0EHc");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0504 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C361980EHc LJII(com.bytedance.ies.nle.editor_jni.NLETrack r40, com.bytedance.ies.nle.editor_jni.NLETrackSlot r41, boolean r42, boolean r43) {
        /*
            Method dump skipped, instruction units count: 2351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C359800E8s.LJII(com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETrackSlot, boolean, boolean):X.0EHc");
    }

    public C359800E8s(InterfaceC359860E8y interfaceC359860E8y, InterfaceC359850E8x interfaceC359850E8x, C0E5S c0e5s, C0EB6 c0eb6, C19EG c19eg, C0E48 c0e48, C1DRG c1drg) {
        this.LIZ = interfaceC359860E8y;
        this.LIZIZ = interfaceC359850E8x;
        this.LIZJ = c0e5s;
        this.LIZLLL = c0eb6;
        this.LJ = c19eg;
        this.LJFF = c0e48;
        this.LJI = c1drg;
    }

    public static C361980EHc LIZJ(C359800E8s c359800E8s, String str, boolean z, boolean z2, AIGCBusinessType aIGCBusinessType, boolean z3, int i) {
        List listLIZLLL;
        Object next;
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            aIGCBusinessType = AIGCBusinessType.AI_CREATE;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        c359800E8s.getClass();
        if (z) {
            if (aIGCBusinessType == AIGCBusinessType.AI_EXTEND) {
                listLIZLLL = Collections.singletonList(C359830E8v.LIZJ(c359800E8s.LJ, z3, true));
            } else {
                listLIZLLL = C359830E8v.LIZLLL(c359800E8s.LJ, true, true, false, 38);
            }
        } else {
            listLIZLLL = C359830E8v.LIZLLL(c359800E8s.LJ, false, false, z2, 30);
        }
        Iterator it2 = listLIZLLL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C361980EHc) next).LJI, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (C361980EHc) next;
    }
}
