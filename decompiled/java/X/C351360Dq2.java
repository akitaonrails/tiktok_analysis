package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Dq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351360Dq2 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(List list) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : (ArrayList) list) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append((String) obj);
                if (i != r5.size() - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return sb.toString();
    }

    public static boolean LIZJ(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack == null || (slots = mainTrack.getSlots()) == null || slots.isEmpty()) {
            return false;
        }
        for (NLETrackSlot nLETrackSlot : slots) {
            if (nLETrackSlot.hasExtra("slot_extra_source_type") && CastIntegerProtector.parseInt(nLETrackSlot.getExtra("slot_extra_source_type")) == EnumC356140Dxk.UploadFromEditorPro.getValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZLLL(NLEModel nLEModel) {
        String extra;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && mainTrack.hasExtra("track_extra_is_adjust_range")) {
            NLETrack mainTrack2 = nLEModel.getMainTrack();
            if (mainTrack2 != null) {
                extra = mainTrack2.getExtra("track_extra_is_adjust_range");
            } else {
                extra = null;
            }
            if (Boolean.parseBoolean(extra)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(com.bytedance.ies.nle.editor_jni.NLEModel r10) {
        /*
            Method dump skipped, instruction units count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351360Dq2.LJ(com.bytedance.ies.nle.editor_jni.NLEModel):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF(com.bytedance.ies.nle.editor_jni.NLEModel r4) {
        /*
            r3 = 0
            if (r4 != 0) goto L4
            return r3
        L4:
            boolean r0 = LIZLLL(r4)
            r2 = 1
            if (r0 != 0) goto L2f
            boolean r0 = LJIIIIZZ(r4)
            if (r0 != 0) goto L2f
            boolean r0 = LJIIJ(r4)
            if (r0 != 0) goto L2f
            boolean r0 = LJI(r4)
            if (r0 != 0) goto L2f
            java.lang.String r1 = "model_extra_is_video_deleted"
            boolean r0 = r4.hasExtra(r1)
            if (r0 == 0) goto L31
            java.lang.String r0 = r4.getExtra(r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L31
        L2f:
            r3 = 1
        L30:
            return r3
        L31:
            boolean r0 = LJII(r4)
            if (r0 != 0) goto L2f
            boolean r0 = LJIIIZ(r4)
            if (r0 != 0) goto L2f
            boolean r0 = LIZJ(r4)
            if (r0 != 0) goto L2f
            boolean r0 = LJIIJJI(r4)
            if (r0 != 0) goto L2f
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r4.getMainTrack()
            java.lang.String r1 = "is_editorpro_touch_main_track"
            if (r0 == 0) goto L6a
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L6a
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r4.getMainTrack()
            if (r0 == 0) goto L68
            java.lang.String r0 = r0.getExtra(r1)
        L61:
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L6a
            goto L2f
        L68:
            r0 = 0
            goto L61
        L6a:
            boolean r0 = LJIIL(r4, r2)
            if (r0 != 0) goto L2f
            boolean r0 = X.C357540E0a.LJIJI(r4)
            if (r0 == 0) goto L30
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351360Dq2.LJFF(com.bytedance.ies.nle.editor_jni.NLEModel):boolean");
    }

    public static boolean LJI(NLEModel nLEModel) {
        String extra;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && mainTrack.hasExtra("track_extra_is_rotated")) {
            NLETrack mainTrack2 = nLEModel.getMainTrack();
            if (mainTrack2 != null) {
                extra = mainTrack2.getExtra("track_extra_is_rotated");
            } else {
                extra = null;
            }
            if (Boolean.parseBoolean(extra)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJII(NLEModel nLEModel) {
        String extra;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && mainTrack.hasExtra("track_extra_is_video_adjust_duration")) {
            NLETrack mainTrack2 = nLEModel.getMainTrack();
            if (mainTrack2 != null) {
                extra = mainTrack2.getExtra("track_extra_is_video_adjust_duration");
            } else {
                extra = null;
            }
            if (Boolean.parseBoolean(extra)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIIIZZ(NLEModel nLEModel) {
        String extra;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && mainTrack.hasExtra("track_extra_is_video_divided")) {
            NLETrack mainTrack2 = nLEModel.getMainTrack();
            if (mainTrack2 != null) {
                extra = mainTrack2.getExtra("track_extra_is_video_divided");
            } else {
                extra = null;
            }
            if (Boolean.parseBoolean(extra)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIIZ(NLEModel nLEModel) {
        String extra;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && mainTrack.hasExtra("track_extra_is_video_edit_location")) {
            NLETrack mainTrack2 = nLEModel.getMainTrack();
            if (mainTrack2 != null) {
                extra = mainTrack2.getExtra("track_extra_is_video_edit_location");
            } else {
                extra = null;
            }
            if (Boolean.parseBoolean(extra)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIJ(NLEModel nLEModel) {
        String extra;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && mainTrack.hasExtra("track_extra_is_video_edit_speed")) {
            NLETrack mainTrack2 = nLEModel.getMainTrack();
            if (mainTrack2 != null) {
                extra = mainTrack2.getExtra("track_extra_is_video_edit_speed");
            } else {
                extra = null;
            }
            if (Boolean.parseBoolean(extra)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIJJI(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = it2.next().getSlots();
                if (slots != null) {
                    for (NLETrackSlot nLETrackSlot : slots) {
                        if (nLETrackSlot.hasExtra("is_editorpro_copy_video_clip") || nLETrackSlot.hasExtra("is_editorpro_replace_video_clip")) {
                            if (nLETrackSlot.getExtra("is_editorpro_copy_video_clip").length() > 0 || nLETrackSlot.getExtra("is_editorpro_replace_video_clip").length() > 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static Pair LIZIZ(NLEModel nLEModel, int i) {
        int size = nLEModel.getMainTrack().getSlots().size();
        VecNLETrackSlotSPtr slots = nLEModel.getMainTrack().getSlots();
        ArrayList arrayList = new ArrayList();
        for (NLETrackSlot nLETrackSlot : slots) {
            if (C351220Dpo.LLLL(nLETrackSlot)) {
                arrayList.add(nLETrackSlot);
            }
        }
        int size2 = arrayList.size();
        int i2 = size - size2;
        VecNLETrackSlotSPtr slots2 = nLEModel.getMainTrack().getSlots();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrackSlot nLETrackSlot2 : slots2) {
            if (C351220Dpo.LLLIILIL(nLETrackSlot2)) {
                arrayList2.add(nLETrackSlot2);
            }
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        if (size2 != 0 || size3 != 0) {
            if (i2 == size) {
                i = 1;
            } else if (size2 != size ? !(1 > size2 || size2 >= size) : i == 1) {
                i = 2;
            }
        }
        if (size2 != size) {
            i3 = i;
        }
        return new Pair(Integer.valueOf(i), Integer.valueOf(i3));
    }

    public static boolean LJIIL(NLEModel nLEModel, boolean z) {
        NLESegmentVideo nLESegmentVideoDynamicCast;
        VecNLETrackSlotSPtr slots;
        NLESegmentVideo nLESegmentVideoDynamicCast2;
        if (z) {
            NLETrack mainTrack = nLEModel.getMainTrack();
            if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
                for (NLETrackSlot nLETrackSlot : slots) {
                    if (nLETrackSlot.hasExtra("is_editorpro_crop_video") && (nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null && nLESegmentVideoDynamicCast2.getCrop() != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots2 = it2.next().getSlots();
                if (slots2 != null) {
                    for (NLETrackSlot nLETrackSlot2 : slots2) {
                        if (nLETrackSlot2.hasExtra("is_editorpro_crop_video") && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment())) != null && nLESegmentVideoDynamicCast.getCrop() != null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
