package X;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.INLEMattingRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEAIMattingType;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.ui.VideoAnimFragment;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.SpeedFragment;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.jvm.internal.AwS283S0300000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS441S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.AwS91S0201000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E6L, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E6L extends C0E94 {
    public final List<String> LLJJIJI;

    public static void LJJIFFI(C0E6L c0e6l) {
        Long l;
        long j;
        C0E48 c0e48LJIIJ;
        C0E55 player;
        C0E55 player2;
        C0E48 c0e48LJIIJ2 = c0e6l.LJIIJ();
        if (c0e48LJIIJ2 != null && (player2 = c0e48LJIIJ2.getPlayer()) != null) {
            player2.pause(false);
        }
        C0E48 c0e48LJIIJ3 = c0e6l.LJIIJ();
        if (c0e48LJIIJ3 != null && (l = (Long) c0e48LJIIJ3.S7().LIZJ("video_position_event", null)) != null) {
            l.longValue();
            long[] jArr = new long[2];
            C0E48 c0e48LJIIJ4 = c0e6l.LJIIJ();
            if (c0e48LJIIJ4 != null) {
                c0e48LJIIJ4.Bq(jArr);
            }
            long j2 = jArr[0];
            long j3 = jArr[1];
            if (j2 >= l.longValue()) {
                j = j2 + ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            } else if (l.longValue() < j3) {
                return;
            } else {
                j = j3 - ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            }
            if (j != -1 && (c0e48LJIIJ = c0e6l.LJIIJ()) != null && (player = c0e48LJIIJ.getPlayer()) != null) {
                player.LJIJI(j, C351110Dpd.LIZ);
            }
        }
    }

    @Override // X.C0EHG
    public final boolean LJ(C361980EHc c361980EHc) {
        return this.LLJJIJI.contains(c361980EHc.LJI);
    }

    @Override // X.C0E96, X.C0EHG
    public final boolean LJII(C361980EHc c361980EHc) {
        if (TextUtils.equals(c361980EHc.LJI, "bottom_item_root_overlay")) {
            return true;
        }
        return false;
    }

    public final void LJJ(NLETrackSlot nLETrackSlot) {
        C0E48 c0e48LJIIJ = LJIIJ();
        if (c0e48LJIIJ == null) {
            return;
        }
        Pair<NLETrack, NLETrackSlot> pairLLIIII = c0e48LJIIJ.LLFII().LLIIII(nLETrackSlot, EnumC356070Dxd.DONE, true);
        NLETrackType nLETrackType = NLETrackType.NONE;
        c0e48LJIIJ.S7().LIZIZ(new C0EB9(pairLLIIII.getFirst(), pairLLIIII.getSecond()), "delete_slot_event", false);
        EditModelProvider.Companion.getClass();
        if (C0E1T.LIZ().getFilterController$tools_camera_edit_release() != null) {
            C355510Dwj.LIZIZ(C350870DpF.LJI(c0e48LJIIJ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(X.C1DRG r6) {
        /*
            r5 = this;
            X.19A3 r0 = r5.LL
            if (r0 != 0) goto L5
            return
        L5:
            X.0EI4 r4 = X.C0EI4.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r5.LJIILLIIL()
            X.0E48 r0 = r5.LJIIJ()
            r2 = 0
            if (r0 == 0) goto L45
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r0.Pt()
            if (r0 == 0) goto L45
            boolean r1 = r0.getMainTrack()
            r0 = 1
            if (r1 != r0) goto L45
        L1f:
            r4.getClass()
            X.C0EI4.LJII(r3, r0)
            X.0E5S r0 = r5.LJIIZILJ()
            if (r0 == 0) goto L2e
            r0.QD2(r2, r2)
        L2e:
            X.0E48 r4 = r5.LJIIJ()
            if (r4 == 0) goto L44
            X.19A3 r3 = r5.LL
            java.lang.Class<com.ss.android.ugc.gamora.editorpro.capabilities.portrait.cutout.CutoutRootScene> r2 = com.ss.android.ugc.gamora.editorpro.capabilities.portrait.cutout.CutoutRootScene.class
            X.0DzZ r1 = new X.0DzZ
            X.19A3 r0 = r5.LL
            r1.<init>(r0, r6, r4)
            r0 = 16
            X.C375820EoO.LIZ(r3, r4, r2, r1, r0)
        L44:
            return
        L45:
            r0 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E6L.LJJI(X.1DRG):void");
    }

    public C0E6L(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJIJI = C1697810uHb.LJIILJJIL("bottom_item_root_overlay", "bottom_item_overlay_add_overlay", "bottom_item_overlay_edit_split", "bottom_item_overlay_edit_copy", "bottom_item_overlay_edit_speed", "bottom_item_overlay_edit_volume", "bottom_item_overlay_edit_reduce_noise", "bottom_item_overlay_edit_replace", "bottom_item_overlay_edit_crop", "bottom_item_overlay_edit_rotate", "bottom_item_overlay_edit_delete", "bottom_item_overlay_edit_cutout", "bottom_item_overlay_edit_segment_effect", "bottom_item_overlay_edit_animation", "bottom_item_overlay_edit_mask", "bottom_item_overlay_edit_retouch", "bottom_item_overlay_edit_filter", "ai_extend");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C0EHG
    public final void LIZJ(C361980EHc c361980EHc, View view, Map<String, String> map) {
        int i;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        long maxEnd;
        NLESegmentAIMatting segment;
        int i2;
        Object next;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot next2;
        NLETrackSlot nLETrackSlotDynamicCast;
        Object next3;
        INLEMattingRuntime mattingApi;
        C0E48 c0e48LJIIJ;
        List listLJJLIIIJLJLI;
        C0E48 c0e48LJIIJ2;
        String extra;
        String str;
        VideoPublishEditModel videoPublishEditModel;
        boolean z;
        C0EGC c0egcLJIILL;
        VecNLETrackSlotSPtr sortedSlots;
        int iIndexOf;
        boolean zLIZ;
        NLETrackSlot nLETrackSlotLLLLLLIL2;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        VideoPublishEditModel videoPublishEditModelLJIILLIIL;
        EnumC373350EkP enumC373350EkP;
        NLETrack nLETrackRn;
        VecNLETrackSlotSPtr slots2;
        NLETrackSlot nLETrackSlotLLLLLLIL3;
        if (!c361980EHc.LJII) {
            if (Intrinsics.LJFF("bottom_item_overlay_edit_cutout", c361980EHc.LJI)) {
                C0E0S c0e0s = C0E0S.LIZ;
                C19EG c19egLJIIJJI = LJIIJJI();
                c0e0s.getClass();
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLJIIJJI);
                c1389890mGx.LJIIIZ(2131830441);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0E48 c0e48LJIIJ3 = LJIIJ();
        if (c0e48LJIIJ3 == null) {
            return;
        }
        NLETrackSlot nLETrackSlotLLLLLLIL4 = c0e48LJIIJ3.LLLLLLIL();
        String str2 = c361980EHc.LJI;
        boolean zContains = false;
        switch (str2.hashCode()) {
            case -1411365959:
                if (!str2.equals("bottom_item_overlay_edit_speed")) {
                    return;
                }
                c0e48LJIIJ3.getPlayer().pause(false);
                LJIIL(new SpeedFragment());
                VideoPublishEditModel videoPublishEditModelLJIILLIIL2 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL2 == null) {
                    return;
                }
                C361680EFy.LJJJI("speed", videoPublishEditModelLJIILLIIL2, c0e48LJIIJ3, null, false, true, null, null, 888);
                return;
            case -1411359092:
                if (!str2.equals("bottom_item_overlay_edit_split")) {
                    return;
                }
                if (nLETrackSlotLLLLLLIL4 != null) {
                    nLETrackSlotLLLLLLIL4.setExtra("is_editor_pro_split_used", "true");
                }
                c0e48LJIIJ3.getPlayer().pause(false);
                c0e48LJIIJ3.LLFII().LJJJJLL(EnumC356070Dxd.DONE);
                VideoPublishEditModel videoPublishEditModelLJIILLIIL3 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL3 == null) {
                    return;
                }
                C361680EFy.LJJJI("split", videoPublishEditModelLJIILLIIL3, c0e48LJIIJ3, null, false, true, null, null, 888);
                return;
            case -1255663462:
                if (!str2.equals("bottom_item_overlay_edit_cutout")) {
                    return;
                }
                if (c361980EHc.LJII && !C0OBG.LIZIZ(LJIIIZ().findViewById(this.LLILLL))) {
                    LJJIFFI(this);
                    if (u4.LJJIJIIJI(LJIILLIIL())) {
                        zLIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_editor_pro_enable_custom_cutout_in_pugc", true, false);
                    } else {
                        zLIZ = C301700Bs8.LIZ();
                    }
                    if (zLIZ) {
                        C0E48 c0e48LJIIJ4 = LJIIJ();
                        if (c0e48LJIIJ4 != null && (nLETrackSlotLLLLLLIL3 = c0e48LJIIJ4.LLLLLLIL()) != null) {
                            C0E0S c0e0s2 = C0E0S.LIZ;
                            VideoPublishEditModel videoPublishEditModelLJIILLIIL4 = LJIILLIIL();
                            C19EG c19egLJIIJJI2 = LJIIJJI();
                            AwS441S0200000_5 awS441S0200000_5 = new AwS441S0200000_5(this, nLETrackSlotLLLLLLIL3, 13);
                            c0e0s2.getClass();
                            C0E0S.LIZLLL(videoPublishEditModelLJIILLIIL4, c19egLJIIJJI2, nLETrackSlotLLLLLLIL3, awS441S0200000_5);
                        }
                    } else {
                        CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
                        List listLJIIIZ = C354090DuR.LJIIIZ(LJIIJ());
                        C0E48 c0e48LJIIJ5 = LJIIJ();
                        if (c0e48LJIIJ5 != null && (nLETrackSlotLLLLLLIL2 = c0e48LJIIJ5.LLLLLLIL()) != null) {
                            if (nLETrackSlotLLLLLLIL2.getAIMatting() != null) {
                                NLEAIMatting aIMatting = nLETrackSlotLLLLLLIL2.getAIMatting();
                                if (aIMatting != null && (videoPublishEditModelLJIILLIIL = LJIILLIIL()) != null) {
                                    if (!listLJIIIZ.contains(nLETrackSlotLLLLLLIL2.getUUID())) {
                                        enumC373350EkP = EnumC373350EkP.UNLIKE;
                                    } else {
                                        enumC373350EkP = EnumC373350EkP.INTERRUPTED;
                                    }
                                    C0E48 c0e48LJIIJ6 = LJIIJ();
                                    if (c0e48LJIIJ6 != null && (nLETrackRn = c0e48LJIIJ6.Rn()) != null && (slots2 = nLETrackRn.getSlots()) != null) {
                                        zContains = slots2.contains(nLETrackSlotLLLLLLIL2);
                                    }
                                    C0EI4 c0ei4 = C0EI4.LIZ;
                                    String extra2 = aIMatting.getExtra("ai_matting_from");
                                    if (extra2 == null) {
                                        extra2 = "click_button";
                                    }
                                    boolean zLJFF = Intrinsics.LJFF(extra2, "long_press");
                                    C0EI5 c0ei5 = C0EI5.AUTO_CUTOUT;
                                    c0ei4.getClass();
                                    C0EI4.LIZLLL(videoPublishEditModelLJIILLIIL, zLJFF, zContains, c0ei5, enumC373350EkP);
                                }
                                C0E48 c0e48LJIIJ7 = LJIIJ();
                                if (c0e48LJIIJ7 != null && (interfaceC351350Dq1LLFII = c0e48LJIIJ7.LLFII()) != null) {
                                    interfaceC351350Dq1LLFII.LJZL(nLETrackSlotLLLLLLIL2, EnumC356070Dxd.DONE, null);
                                }
                                C354090DuR.LJIILL(LJIIJ());
                            } else {
                                C0E0S c0e0s3 = C0E0S.LIZ;
                                VideoPublishEditModel videoPublishEditModelLJIILLIIL5 = LJIILLIIL();
                                C19EG c19egLJIIJJI3 = LJIIJJI();
                                C0E48 c0e48LJIIJ8 = LJIIJ();
                                AwS371S0200000_5 awS371S0200000_5 = new AwS371S0200000_5(this, nLETrackSlotLLLLLLIL2, 293);
                                c0e0s3.getClass();
                                C0E0S.LIZLLL(videoPublishEditModelLJIILLIIL5, c19egLJIIJJI3, nLETrackSlotLLLLLLIL2, new AwS283S0300000_5(c19egLJIIJJI3, c0e48LJIIJ8, awS371S0200000_5, 3));
                            }
                        }
                    }
                }
                VideoPublishEditModel videoPublishEditModelLJIILLIIL6 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL6 == null) {
                    return;
                }
                C361680EFy.LJJJI("cutout", videoPublishEditModelLJIILLIIL6, c0e48LJIIJ3, null, false, true, null, null, 888);
                return;
            case -1242058631:
                if (!str2.equals("bottom_item_overlay_edit_delete")) {
                    return;
                }
                VideoPublishEditModel videoPublishEditModelLJIILLIIL7 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL7 != null) {
                    z = false;
                    C361680EFy.LJJJI("delete", videoPublishEditModelLJIILLIIL7, c0e48LJIIJ3, null, false, true, null, null, 888);
                } else {
                    z = false;
                }
                C0E48 c0e48LJIIJ9 = LJIIJ();
                if (c0e48LJIIJ9 == null) {
                    return;
                }
                if (C351220Dpo.LLLILZ(c0e48LJIIJ9)) {
                    LJJ(null);
                    return;
                }
                NLETrack nLETrackPt = c0e48LJIIJ9.Pt();
                if (nLETrackPt != null && !nLETrackPt.getMainTrack()) {
                    return;
                }
                VecNLETrackSlotSPtr slots3 = c0e48LJIIJ9.Rn().getSlots();
                if (slots3 != null) {
                    int size = slots3.size();
                    if (size == 1) {
                        VideoPublishEditModel videoPublishEditModelLJIILLIIL8 = LJIILLIIL();
                        if (videoPublishEditModelLJIILLIIL8 != null) {
                            C361680EFy.LJJJJL(videoPublishEditModelLJIILLIIL8, c0e48LJIIJ9);
                        }
                        Activity activityLJIIIZ = LJIIIZ();
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.messageRes(2131833394);
                        C1390380mHk.LIZ(activityLJIIIZ, 1062, creativeToastBuilder);
                        return;
                    }
                    if (size == 2 && ((c0egcLJIILL = LJIILL()) == null || c0egcLJIILL.a1())) {
                        NLETrack nLETrackPt2 = c0e48LJIIJ9.Pt();
                        NLETrackSlot nLETrackSlotLLLLLLIL5 = c0e48LJIIJ9.LLLLLLIL();
                        if (nLETrackPt2 == null || (sortedSlots = nLETrackPt2.getSortedSlots()) == null || (iIndexOf = sortedSlots.indexOf(nLETrackSlotLLLLLLIL5)) == -1) {
                            return;
                        }
                        C1397580mTM c1397580mTM = new C1397580mTM(LJIIIZ());
                        c1397580mTM.LJII = z;
                        c1397580mTM.LIZ(2131850353);
                        C985403tE.LIZ(c1397580mTM, new AwS91S0201000_5(iIndexOf, this, c0e48LJIIJ9, 7));
                        new C1397510mTF(c1397580mTM).LIZLLL();
                        return;
                    }
                }
                LJJ(null);
                return;
            case -1181092282:
                if (!str2.equals("bottom_item_overlay_edit_filter")) {
                    return;
                }
                c0e48LJIIJ3.getPlayer().pause(false);
                VideoPublishEditModel videoPublishEditModelLJIILLIIL9 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL9 != null) {
                    C362710EJx c362710EJx = C362710EJx.LIZ;
                    C0E48 c0e48LJIIJ10 = LJIIJ();
                    c362710EJx.getClass();
                    C362710EJx.LIZ(videoPublishEditModelLJIILLIIL9, c0e48LJIIJ10, "editorpro_pip");
                }
                C355530Dwl c355530Dwl = new C355530Dwl((EnumC356350Dy5) null, (NLETrack) null, 0L, "editorpro_pip", 15);
                C0E48 c0e48LJIIJ11 = LJIIJ();
                if (c0e48LJIIJ11 != null) {
                    C375820EoO.LIZ(this.LL, c0e48LJIIJ11, C364870ESf.class, new C360010E9n(c355530Dwl, c0e48LJIIJ11), 16);
                }
                VideoPublishEditModel videoPublishEditModelLJIILLIIL10 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL10 == null) {
                    return;
                }
                C361680EFy.LJJJI("filters", videoPublishEditModelLJIILLIIL10, c0e48LJIIJ3, null, false, true, null, null, 888);
                return;
            case -831780823:
                if (!str2.equals("bottom_item_overlay_edit_rotate")) {
                    return;
                }
                LJJIFFI(this);
                if (nLETrackSlotLLLLLLIL4 != null) {
                    nLETrackSlotLLLLLLIL4.setExtra("is_editor_pro_rotate_used", "true");
                    nLETrackSlotLLLLLLIL4.setExtra("is_editorpro_rotate_video", "1");
                }
                c0e48LJIIJ3.LLFII().LJJJI(EnumC356070Dxd.DONE);
                LJIJ();
                VideoPublishEditModel videoPublishEditModelLJIILLIIL11 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL11 == null) {
                    return;
                }
                C361680EFy.LJJJI("rotate", videoPublishEditModelLJIILLIIL11, c0e48LJIIJ3, null, false, true, null, null, 888);
                return;
            case -717483544:
                if (!str2.equals("bottom_item_overlay_edit_volume")) {
                    return;
                }
                c0e48LJIIJ3.getPlayer().pause(false);
                LJIL();
                VideoPublishEditModel videoPublishEditModelLJIILLIIL12 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL12 == null) {
                    return;
                }
                C361680EFy.LJJJI("volume", videoPublishEditModelLJIILLIIL12, c0e48LJIIJ3, null, false, true, null, null, 888);
                return;
            case -305077850:
                NLEModel nLEModelLJI = null;
                if (!str2.equals("bottom_item_overlay_edit_replace")) {
                    return;
                }
                c0e48LJIIJ3.getPlayer().pause(false);
                VideoPublishEditModel videoPublishEditModelLJIILLIIL13 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL13 != null) {
                    C361680EFy.LJJJI("replace", videoPublishEditModelLJIILLIIL13, c0e48LJIIJ3, null, false, true, null, null, 888);
                }
                if (nLETrackSlotLLLLLLIL4 == null) {
                    return;
                }
                C0E6V.LIZ = c0e48LJIIJ3;
                float measuredEndTime = ((nLETrackSlotLLLLLLIL4.getMeasuredEndTime() - nLETrackSlotLLLLLLIL4.getMeasuredStartTime()) * C351220Dpo.LIZ(NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLLLLLLIL4.getMainSegment()))) / LSPassThroughRecordSizeConfig.DEFAULT;
                if (C351220Dpo.LLLIILIL(nLETrackSlotLLLLLLIL4)) {
                    C0F1Z c0f1z = C0F1Z.LIZ;
                    C0E48 c0e48LJIIJ12 = LJIIJ();
                    c0f1z.getClass();
                    RetakeVideoContext retakeVideoContextLIZJ = C0F1Z.LIZJ(c0e48LJIIJ12, true, true);
                    if (retakeVideoContextLIZJ == null || (videoPublishEditModel = C0F1Z.LIZLLL) == null) {
                        return;
                    }
                    C0E48 c0e48LJIIJ13 = LJIIJ();
                    c0f1z.getClass();
                    C0F1Z.LJ(c0e48LJIIJ13, retakeVideoContextLIZJ);
                    C0E48 c0e48LJIIJ14 = LJIIJ();
                    if (c0e48LJIIJ14 != null) {
                        C350870DpF.LJI(c0e48LJIIJ14);
                        C361680EFy.LJLJI("enter_reshoot_video_time", String.valueOf(System.currentTimeMillis()));
                    }
                    C1438840nXu c1438840nXu = C1438840nXu.LIZ;
                    Activity activityLJIIIZ2 = LJIIIZ();
                    C0E48 c0e48LJIIJ15 = LJIIJ();
                    if (c0e48LJIIJ15 != null) {
                        nLEModelLJI = C350870DpF.LJI(c0e48LJIIJ15);
                    }
                    C1438900nY0 c1438900nY0 = new C1438900nY0(activityLJIIIZ2, retakeVideoContextLIZJ, videoPublishEditModel, true, nLEModelLJI);
                    c1438840nXu.getClass();
                    C1438840nXu.LIZ(c1438900nY0);
                    return;
                }
                C0E6J.LIZJ(LJIIJJI(), c0e48LJIIJ3, (long) measuredEndTime, true, C351220Dpo.LLLIILIL(nLETrackSlotLLLLLLIL4), new AwS549S0100000_5(this, 1551));
                return;
            case -301275170:
                if (!str2.equals("bottom_item_overlay_edit_retouch")) {
                    return;
                }
                c0e48LJIIJ3.getPlayer().pause(false);
                LJIJJLI();
                VideoPublishEditModel videoPublishEditModelLJIILLIIL14 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL14 == null) {
                    return;
                }
                C361680EFy.LJJJI("retouch", videoPublishEditModelLJIILLIIL14, c0e48LJIIJ3, null, false, true, null, null, 888);
                return;
            case -133847829:
                if (!str2.equals("bottom_item_overlay_edit_segment_effect")) {
                    return;
                }
                C19A3 c19a3 = this.LL;
                EnumC359100E6a enumC359100E6a = EnumC359100E6a.SEGMENT_EFFECT;
                EnumC356350Dy5 enumC356350Dy5 = EnumC356350Dy5.ADD;
                Pair pairLIZJ = C356600DyU.LIZJ(c0e48LJIIJ3.LLLLLLIL());
                if (pairLIZJ != null) {
                    str = (String) pairLIZJ.getFirst();
                } else {
                    str = null;
                }
                C375820EoO.LIZ(c19a3, c0e48LJIIJ3, C0ET8.class, new C360020E9o(c0e48LJIIJ3, "effect_panel", new C361270EEj(enumC359100E6a, enumC356350Dy5, str, 0L, 0L, 56), 8), 16);
                VideoPublishEditModel videoPublishEditModelLJIILLIIL15 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL15 == null) {
                    return;
                }
                videoPublishEditModelLJIILLIIL15.creativeModel.effectEntrancePosition = "editor_pro_clip_select_pip";
                VideoPublishEditModel videoPublishEditModelLJIILLIIL16 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL16 != null) {
                    C361680EFy.LJJJI("effect", videoPublishEditModelLJIILLIIL16, c0e48LJIIJ3, null, false, true, null, null, 888);
                }
                C361680EFy.LJJIJIIJI(videoPublishEditModelLJIILLIIL15, c0e48LJIIJ3, null, "");
                return;
            case 283352715:
                if (!str2.equals("bottom_item_root_overlay")) {
                    return;
                }
                break;
            case 369636803:
                if (!str2.equals("bottom_item_overlay_edit_copy")) {
                    return;
                }
                c0e48LJIIJ3.getPlayer().pause(false);
                C0E48 c0e48LJIIJ16 = LJIIJ();
                if (c0e48LJIIJ16 == null || (nLETrackSlotLLLLLLIL = c0e48LJIIJ16.LLLLLLIL()) == null) {
                    return;
                }
                NLEModel nLEModelLJI2 = C350870DpF.LJI(c0e48LJIIJ16);
                NLETrack mainTrack = nLEModelLJI2.getMainTrack();
                if (mainTrack != null) {
                    maxEnd = mainTrack.getMaxEnd();
                } else {
                    maxEnd = 0;
                }
                List<NLETrack> listLJJLIIIJLJLI2 = C351220Dpo.LJJLIIIJLJLI(nLEModelLJI2);
                ArrayList arrayList = new ArrayList();
                for (NLETrack nLETrack : listLJJLIIIJLJLI2) {
                    VecNLETrackSlotSPtr slots4 = nLETrack.getSlots();
                    if (slots4 != null && !slots4.isEmpty()) {
                        arrayList.add(nLETrack);
                    }
                }
                if (arrayList.size() >= ((Number) C0E5G.LIZIZ(EnumC357850E1f.MAX_PIP_TRACK_COUNT, Integer.MAX_VALUE)).intValue()) {
                    Activity activityLJIIIZ3 = LJIIIZ();
                    CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                    creativeToastBuilder2.messageRes(2131850358);
                    C1390380mHk.LIZ(activityLJIIIZ3, 1061, creativeToastBuilder2);
                    return;
                }
                nLETrackSlotLLLLLLIL.setExtra("is_editor_pro_copy_used", "true");
                NLETrackSlot nLETrackSlotDynamicCast2 = NLETrackSlot.dynamicCast(nLETrackSlotLLLLLLIL.deepClone(true));
                if (nLETrackSlotDynamicCast2 == null) {
                    return;
                }
                nLETrackSlotDynamicCast2.setStartTime(nLETrackSlotLLLLLLIL.getStartTime());
                nLETrackSlotDynamicCast2.setEndTime(Math.min(nLETrackSlotLLLLLLIL.getEndTime(), maxEnd));
                nLETrackSlotDynamicCast2.setExtra("is_editorpro_copy_video_clip", "1");
                NLEAIMatting aIMatting2 = nLETrackSlotLLLLLLIL.getAIMatting();
                if (aIMatting2 != null) {
                    segment = aIMatting2.getSegment();
                } else {
                    segment = null;
                }
                if (nLETrackSlotLLLLLLIL.getAIMatting() != null && nLETrackSlotDynamicCast2.getAIMatting() != null && segment != null) {
                    NLEAIMattingType nLEAIMattingType = NLEAIMattingType.TYPE_CUSTOM;
                    if ((nLEAIMattingType.swigValue() & segment.getMattingType()) > 0) {
                        int iSwigValue = nLEAIMattingType.swigValue() | NLEAIMattingType.TYPE_INTERACTIVE.swigValue();
                        INLEMediaSession iNLEMediaSessionF1 = c0e48LJIIJ16.f1();
                        if (iNLEMediaSessionF1 != null && (mattingApi = iNLEMediaSessionF1.getMattingApi()) != null) {
                            mattingApi.copyMattingFile(segment.getWorkSpace(), nLETrackSlotLLLLLLIL.getUUID(), nLETrackSlotDynamicCast2.getUUID(), iSwigValue);
                        }
                    }
                }
                if (C377150EqX.LIZ.LJIJI(LJIILLIIL(), nLETrackSlotLLLLLLIL)) {
                    C377150EqX.LIZJ(LJIILLIIL(), nLETrackSlotLLLLLLIL, nLETrackSlotDynamicCast2);
                }
                if (arrayList.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        int layer = ((NLETimeSpaceNode) it2.next()).getLayer();
                        while (it2.hasNext()) {
                            int layer2 = ((NLETimeSpaceNode) it2.next()).getLayer();
                            if (layer < layer2) {
                                layer = layer2;
                            }
                        }
                        i2 = layer + 1;
                    } else {
                        throw new NoSuchElementException();
                    }
                }
                int i3 = i2 + 1;
                nLETrackSlotDynamicCast2.setTransformZ(i3);
                NLETrack nLETrack2 = new NLETrack();
                nLETrack2.setLayer(i2);
                nLETrack2.setExtra("track_type", "video");
                nLETrack2.setExtraTrackType(NLETrackType.VIDEO);
                nLETrack2.setMainTrack(false);
                nLETrack2.addSlot(nLETrackSlotDynamicCast2);
                nLETrack2.setExtra("track_layer", String.valueOf(i2));
                nLETrack2.setExtra("track_extra_pip", "true");
                nLEModelLJI2.addTrack(nLETrack2);
                NLETrack nLETrackPt3 = c0e48LJIIJ16.Pt();
                if (nLETrackPt3 != null && nLETrackSlotLLLLLLIL.hasExtra("original_audio_uuid")) {
                    String extra3 = nLETrackSlotLLLLLLIL.getExtra("original_audio_uuid");
                    Iterator it3 = ((ArrayList) C346780Die.LIZIZ(nLEModelLJI2)).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (((NLETimeSpaceNode) next).getLayer() == nLETrackPt3.getLayer() + 1) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    NLETrack nLETrack3 = (NLETrack) next;
                    if (nLETrack3 != null && (slots = nLETrack3.getSlots()) != null) {
                        Iterator<NLETrackSlot> it4 = slots.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next2 = it4.next();
                                if (Intrinsics.LJFF(next2.getUUID(), extra3)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        NLETrackSlot nLETrackSlot = next2;
                        if (nLETrackSlot != null && (nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone(true))) != null) {
                            nLETrackSlotDynamicCast.setStartTime(nLETrackSlotDynamicCast2.getStartTime());
                            nLETrackSlotDynamicCast.setEndTime(nLETrackSlotDynamicCast2.getEndTime());
                            nLETrackSlotDynamicCast2.setExtra("original_audio_uuid", nLETrackSlotDynamicCast.getUUID());
                            Iterator it5 = ((ArrayList) C346780Die.LIZIZ(nLEModelLJI2)).iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    next3 = it5.next();
                                    if (((NLETimeSpaceNode) next3).getLayer() == i3) {
                                    }
                                } else {
                                    next3 = null;
                                }
                            }
                            NLETrack nLETrack4 = (NLETrack) next3;
                            if (nLETrack4 != null) {
                                nLETrack4.addSlot(nLETrackSlotDynamicCast);
                            } else {
                                NLETrack nLETrack5 = new NLETrack();
                                nLETrack5.setMainTrack(false);
                                nLETrack5.setLayer(i3);
                                nLETrack5.setExtra("track_type", "audio");
                                nLETrack5.setExtraTrackType(NLETrackType.AUDIO);
                                nLETrack5.setExtra("track_layer", String.valueOf(nLETrack5.getLayer()));
                                nLETrack5.setExtra("AudioTrackType", "ORIGIN");
                                nLETrack5.addSlot(nLETrackSlotDynamicCast);
                                nLEModelLJI2.addTrack(nLETrack5);
                            }
                        }
                    }
                }
                NLEEditor nLEEditorLJI = c0e48LJIIJ16.LLFII().LJI();
                if (nLEEditorLJI != null) {
                    C350410DoV.LIZLLL(nLEEditorLJI, true, C051R.LIZIZ(new C0E1X(C0E1V.COPY.getNameId(), null, null, null, null, 30)), false, true);
                }
                c0e48LJIIJ16.S7().LIZIZ(new C358740E4q(C354870Dvh.LIZJ(C350870DpF.LJI(c0e48LJIIJ16), nLETrackSlotDynamicCast2.getUUID()), 0, null, false, 0, 254), "select_slot_event", false);
                VideoPublishEditModel videoPublishEditModelLJIILLIIL17 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL17 == null) {
                    return;
                }
                C361680EFy.LJJJI("copy", videoPublishEditModelLJIILLIIL17, c0e48LJIIJ16, null, false, true, null, null, 888);
                return;
            case 369639646:
                if (!str2.equals("bottom_item_overlay_edit_crop")) {
                    return;
                }
                c0e48LJIIJ3.getPlayer().pause(false);
                VideoPublishEditModel videoPublishEditModelLJIILLIIL18 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL18 != null) {
                    C361680EFy.LJJJI("crop", videoPublishEditModelLJIILLIIL18, c0e48LJIIJ3, null, false, true, null, null, 888);
                }
                LJIJI(new AwS619S0100000_5(this, 62));
                return;
            case 369921338:
                if (!str2.equals("bottom_item_overlay_edit_mask")) {
                    return;
                }
                LJIJJ();
                VideoPublishEditModel videoPublishEditModelLJIILLIIL19 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL19 == null) {
                    return;
                }
                C361680EFy.LJJJI("mask", videoPublishEditModelLJIILLIIL19, c0e48LJIIJ3, null, false, true, null, null, 888);
                return;
            case 451892726:
                if (!str2.equals("bottom_item_overlay_edit_animation")) {
                    return;
                }
                c0e48LJIIJ3.getPlayer().pause(false);
                VideoPublishEditModel videoPublishEditModelLJIILLIIL20 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL20 != null) {
                    i = 1;
                    C361680EFy.LJJJI("animation", videoPublishEditModelLJIILLIIL20, c0e48LJIIJ3, null, false, true, null, null, 888);
                } else {
                    i = 1;
                }
                C0E48 c0e48LJIIJ17 = LJIIJ();
                if (c0e48LJIIJ17 == null || c0e48LJIIJ17.LLLLLLIL() == null) {
                    return;
                }
                LJIIL(new VideoAnimFragment("edit_panel", i));
                return;
            case 501494545:
                if (!str2.equals("ai_extend")) {
                    return;
                }
                c0e48LJIIJ3.getPlayer().pause(false);
                C378370EsV c378370EsV = C378370EsV.LIZ;
                VideoPublishEditModel videoPublishEditModelLJIILLIIL21 = LJIILLIIL();
                c378370EsV.getClass();
                if (videoPublishEditModelLJIILLIIL21 != null) {
                    C369780Eee.LIZ.getClass();
                    if (C369780Eee.LIZ(videoPublishEditModelLJIILLIIL21)) {
                        C378370EsV.LJFF(videoPublishEditModelLJIILLIIL21, C359200E6k.LIZIZ, C359280E6s.LIZIZ, true, EnumC359320E6w.AI_EXTEND);
                    }
                }
                if (nLETrackSlotLLLLLLIL4 == null) {
                    return;
                }
                C359140E6e.LIZIZ(this.LL, LJIIIZ(), c0e48LJIIJ3, LJIILLIIL(), nLETrackSlotLLLLLLIL4, true, jCurrentTimeMillis);
                return;
            case 979546959:
                if (!str2.equals("bottom_item_overlay_edit_reduce_noise") || nLETrackSlotLLLLLLIL4 == null) {
                    return;
                }
                Keva keva = C358960E5m.LIZ;
                boolean zLIZLLL = C358960E5m.LIZLLL(nLETrackSlotLLLLLLIL4, this.LL);
                VideoPublishEditModel videoPublishEditModelLJIILLIIL22 = LJIILLIIL();
                if (videoPublishEditModelLJIILLIIL22 == null) {
                    return;
                }
                C361680EFy.LJJIZ(videoPublishEditModelLJIILLIIL22, c0e48LJIIJ3, true, zLIZLLL);
                return;
            case 1689505195:
                if (!str2.equals("bottom_item_overlay_add_overlay")) {
                    return;
                }
                break;
            default:
                return;
        }
        c0e48LJIIJ3.getPlayer().pause(false);
        if (C0OBG.LIZIZ(LJIIIZ().findViewById(this.LLILLL)) || (c0e48LJIIJ = LJIIJ()) == null) {
            return;
        }
        if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue() && !C357540E0a.LJIIL(c0e48LJIIJ)) {
            Activity activityLJIIIZ4 = LJIIIZ();
            CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
            creativeToastBuilder3.messageRes(2131827574);
            C1390380mHk.LIZ(activityLJIIIZ4, 1060, creativeToastBuilder3);
            return;
        }
        AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 1547);
        C0E48 c0e48LJIIJ18 = LJIIJ();
        if (c0e48LJIIJ18 == null || (listLJJLIIIJLJLI = C351220Dpo.LJJLIIIJLJLI(C350870DpF.LJI(c0e48LJIIJ18))) == null) {
            listLJJLIIIJLJLI = C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listLJJLIIIJLJLI) {
            VecNLETrackSlotSPtr slots5 = ((NLETrack) obj).getSlots();
            if (slots5 != null && !slots5.isEmpty()) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        C0E6O c0e6o = C0E6O.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("activePipTrackCount=");
        sbLIZ.append(size2);
        C356530DyN.LJ(c0e6o, C2188811AlT.LIZIZ(sbLIZ));
        int iIntValue = ((Number) C0E5G.LIZIZ(EnumC357850E1f.MAX_PIP_TRACK_COUNT, Integer.MAX_VALUE)).intValue();
        C0E48 c0e48LJIIJ19 = LJIIJ();
        if (c0e48LJIIJ19 != null && (extra = C350870DpF.LJI(c0e48LJIIJ19).getExtra("model_extra_is_pip_count_limit_remind_toasted")) != null) {
            zContains = Boolean.parseBoolean(extra);
        }
        if (size2 < iIntValue) {
            if (size2 == 2 && !zContains) {
                Activity activityLJIIIZ5 = LJIIIZ();
                CreativeToastBuilder creativeToastBuilder4 = new CreativeToastBuilder();
                creativeToastBuilder4.messageRes(2131850357);
                creativeToastBuilder4.acrossActivities(true);
                C1390380mHk.LIZ(activityLJIIIZ5, 1061, creativeToastBuilder4);
                if (C289180BVc.LIZ(LJIILLIIL()) && (c0e48LJIIJ2 = LJIIJ()) != null) {
                    C350870DpF.LJI(c0e48LJIIJ2).setExtra("model_extra_is_pip_count_limit_remind_toasted", "true");
                }
            }
            awS549S0100000_5.invoke();
            return;
        }
        Activity activityLJIIIZ6 = LJIIIZ();
        CreativeToastBuilder creativeToastBuilder5 = new CreativeToastBuilder();
        creativeToastBuilder5.messageRes(2131850358);
        C1390380mHk.LIZ(activityLJIIIZ6, 1061, creativeToastBuilder5);
    }
}
