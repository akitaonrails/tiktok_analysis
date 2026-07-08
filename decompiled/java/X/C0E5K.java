package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS154S1100000_5;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0E5K, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E5K {
    public final C19EG LIZ;
    public final C19A3 LIZIZ;
    public final Function0<C0E48> LIZJ;
    public final Function0<VideoPublishEditModel> LIZLLL;
    public final Function0<InterfaceC377540ErA> LJ;
    public final Function0<InterfaceC377410Eqx> LJFF;
    public final Function0<C0EB6> LJI;
    public final C0E5S LJII;
    public final C0E53 LJIIIIZZ;
    public final InterfaceC359850E8x LJIIIZ;
    public final FrameCacheViewModel LJIIJ;
    public final InterfaceC351060DpY LJIIJJI;
    public final InterfaceC361710EGb LJIIL;
    public final Function0<Unit> LJIILIIL;
    public final InterfaceC497601wk LJIILJJIL;
    public final Function0<Integer> LJIILL;
    public AnonymousClass0956 LJIILLIIL;

    public final void LIZLLL(Intent intent) {
        VideoPublishEditModel videoPublishEditModelInvoke;
        C0E48 c0e48Invoke;
        if (C0E5N.LIZ() && (videoPublishEditModelInvoke = this.LIZLLL.invoke()) != null && (c0e48Invoke = this.LIZJ.invoke()) != null && intent != null) {
            C361680EFy.LJL(videoPublishEditModelInvoke, c0e48Invoke, System.currentTimeMillis() - intent.getLongExtra("key_start_go_cut_activity_time", 0L), "import_video_footage", intent.getIntExtra("key_video_count", 0), intent.getIntExtra("key_photo_count", 0), intent.getLongExtra("key_total_import_duration", 0L));
        }
    }

    public final boolean LJFF(Bundle bundle) {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        NLETrack mainTrack;
        NLETrackSlot slotByIndex;
        C0E53 c0e53;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        if (bundle == null || (multiEditVideoStatusRecordData = (MultiEditVideoStatusRecordData) bundle.getParcelable("key_editor_pro_record_data")) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList;
        if (list != null) {
            int i = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                int i2 = i + 1;
                TimeSpeedModelExtension timeSpeedModelExtension = null;
                if (i >= 0) {
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = multiEditVideoSegmentRecordData;
                    ArrayList<TimeSpeedModelExtension> arrayList2 = multiEditVideoStatusRecordData.editSegments;
                    if (arrayList2 != null && !arrayList2.isEmpty() && i < multiEditVideoStatusRecordData.editSegments.size()) {
                        timeSpeedModelExtension = (TimeSpeedModelExtension) ListProtector.get(multiEditVideoStatusRecordData.editSegments, i);
                    }
                    arrayList.add(C0EB7.LIZ(multiEditVideoSegmentRecordData2, timeSpeedModelExtension));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        boolean z = ((C350130Do3) ListProtector.get(arrayList, 0)).LIZIZ;
        String str = ((C350130Do3) ListProtector.get(arrayList, 0)).LIZ;
        if (z) {
            C0CNO.LIZ(C15O7.LJI, new AwS154S1100000_5(str, this, 4));
        }
        int iIntValue = this.LJIILL.invoke().intValue();
        long jLongValue = ((Number) C0E5G.LIZIZ(EnumC357850E1f.PICTURE_TRACK_TIME, 4000L)).longValue();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0E48 c0e48Invoke = this.LIZJ.invoke();
        if (c0e48Invoke != null && (interfaceC351350Dq1LLFII = c0e48Invoke.LLFII()) != null) {
            interfaceC351350Dq1LLFII.LJLLLLLL(arrayList, new C350990DpR(null, Long.valueOf(jLongValue), Integer.valueOf(iIntValue), null, false, false, false, null, 4089));
        }
        C0E48 c0e48Invoke2 = this.LIZJ.invoke();
        if (c0e48Invoke2 != null && (mainTrack = C350870DpF.LJI(c0e48Invoke2).getMainTrack()) != null && (slotByIndex = mainTrack.getSlotByIndex(iIntValue)) != null && (c0e53 = this.LJIIIIZZ) != null) {
            c0e53.R30(slotByIndex, NLEEditorJniJNI.NLEFilterName_getAUDIO_VOICE_BEAUTIFY_FILTER());
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(jCurrentTimeMillis2, "acc_advanced_edit_add_video_clip_duration");
        C20684815ws.LJIILLIIL("acc_advanced_edit_add_video_clip_duration", c0lab.LIZ);
        LJ(bundle, "record");
        C0F1Z.LIZ.getClass();
        C0F1Z.LJIIIZ.addAll(multiEditVideoStatusRecordData.editSegments);
        C0F1Z.LJII();
        LIZ(iIntValue, arrayList.size());
        return true;
    }

    public final boolean LJII(Bundle bundle) {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        ArrayList arrayList = null;
        if (bundle != null && (multiEditVideoStatusRecordData = (MultiEditVideoStatusRecordData) bundle.getParcelable("key_editor_pro_record_data")) != null) {
            arrayList = new ArrayList();
            List<MultiEditVideoSegmentRecordData> list = multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList;
            if (list != null) {
                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                    String str = multiEditVideoSegmentRecordData.videoPath;
                    arrayList.add(new EditMedia(str, true, str, null, 0L, Long.valueOf(multiEditVideoSegmentRecordData.getEndTime()), null, Boolean.FALSE, ""));
                }
            }
        }
        return LJI(bundle, arrayList, true);
    }

    public final void LIZ(int i, int i2) {
        long jCurrentTimeMillis;
        Long lLJIILIIL;
        int size;
        NLETrack nLETrackRn;
        NLETrackSlot slotByIndex;
        NLETrack nLETrackRn2;
        VecNLETrackSlotSPtr slots;
        FrameCacheViewModel.yQ2(this.LJIIJ);
        for (int i3 = i; i3 < i + i2; i3++) {
            C0E48 c0e48Invoke = this.LIZJ.invoke();
            if (c0e48Invoke != null && (nLETrackRn2 = c0e48Invoke.Rn()) != null && (slots = nLETrackRn2.getSlots()) != null) {
                size = slots.size();
            } else {
                size = 0;
            }
            if (i3 >= size) {
                break;
            }
            C0E48 c0e48Invoke2 = this.LIZJ.invoke();
            if (c0e48Invoke2 != null && (nLETrackRn = c0e48Invoke2.Rn()) != null && (slotByIndex = nLETrackRn.getSlotByIndex(i3)) != null) {
                slotByIndex.setExtra("is_editorpro_add_video_material", "1");
            }
        }
        C0E48 c0e48Invoke3 = this.LIZJ.invoke();
        if (c0e48Invoke3 != null) {
            C350870DpF.LJI(c0e48Invoke3);
            ConcurrentHashMap<String, String> concurrentHashMap = C0E5L.LIZ;
            String str = concurrentHashMap.get("enter_add_video_time");
            if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                jCurrentTimeMillis = System.currentTimeMillis() - lLJIILIIL.longValue();
            } else {
                jCurrentTimeMillis = 0;
            }
            concurrentHashMap.put("add_video_material_duration", String.valueOf(C0E5L.LIZ(concurrentHashMap.get("add_video_material_duration")) + jCurrentTimeMillis));
        }
    }

    public final void LIZIZ(long j, NLETrackSlot nLETrackSlot) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48Invoke = this.LIZJ.invoke();
        if (c0e48Invoke == null) {
            return;
        }
        if (nLETrackSlot != null) {
            this.LJII.G22(nLETrackSlot, C0E6E.CLIP, EnumC358760E4s.NORMAL, true, false, true);
        } else {
            c0e48Invoke.getPlayer().LJJII(C351220Dpo.LLLLLLJ(Math.min(c0e48Invoke.getPlayer().qq(), j)), new INLEListenerSeek() { // from class: X.0E5M
                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerSeek
                public final void onSeekDone(int i) {
                }
            });
        }
        C01TT.LIZJ(new AwS549S0100000_5(this, 1097));
        InterfaceC359850E8x interfaceC359850E8x = this.LJIIIZ;
        if (interfaceC359850E8x != null && (nLETrackSlotLLLLLLIL = c0e48Invoke.LLLLLLIL()) != null) {
            if (!C351220Dpo.LLI(nLETrackSlotLLLLLLIL)) {
                interfaceC359850E8x.LJIIIZ("bottom_item_edit_volume");
            } else {
                interfaceC359850E8x.LJIILLIIL("bottom_item_edit_volume");
            }
            if (C351220Dpo.LLJJIJIL(nLETrackSlotLLLLLLIL)) {
                interfaceC359850E8x.LJIIIZ("bottom_item_edit_speed");
            } else {
                interfaceC359850E8x.LJIILLIIL("bottom_item_edit_speed");
            }
        }
    }

    public final void LJ(Bundle bundle, String str) {
        VideoPublishEditModel videoPublishEditModelInvoke;
        C0E48 c0e48Invoke;
        long j;
        int i;
        if (C0E5N.LIZ() && (videoPublishEditModelInvoke = this.LIZLLL.invoke()) != null && (c0e48Invoke = this.LIZJ.invoke()) != null && bundle != null) {
            if (Intrinsics.LJFF(str, "record")) {
                j = bundle.getLong("key_editor_pro_record_confirm_time", 0L);
                i = 1;
            } else {
                j = bundle.getLong("key_start_go_cut_activity_time", 0L);
                i = bundle.getInt("key_video_count", 0);
            }
            C361680EFy.LJL(videoPublishEditModelInvoke, c0e48Invoke, System.currentTimeMillis() - j, str, i, bundle.getInt("key_photo_count", 0), bundle.getLong("key_total_import_duration", 0L));
        }
    }

    public static final void LIZJ(C0E5K c0e5k, Intent intent, String str) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C351630DqT c351630DqT = new C351630DqT(str);
        C0E48 c0e48Invoke = c0e5k.LIZJ.invoke();
        if (c0e48Invoke != null && (interfaceC351350Dq1LLFII = c0e48Invoke.LLFII()) != null) {
            interfaceC351350Dq1LLFII.LJLLJ(c351630DqT, EnumC356070Dxd.DONE, null);
        }
        C361230EEf.LIZ(c0e5k.LIZ, str, c0e5k.LJIIIZ);
        c0e5k.LIZLLL(intent);
    }

    public final boolean LJI(Bundle bundle, List list, boolean z) {
        C0E48 c0e48Invoke;
        String str;
        if (list == null || list.isEmpty() || (c0e48Invoke = this.LIZJ.invoke()) == null) {
            return false;
        }
        EditMedia editMedia = (EditMedia) ListProtector.get(list, 0);
        if (u.LJIIZILJ(editMedia.getPath(), ".mp4", false) && TEVideoUtils.isCanImport(editMedia.getPath()) != 0) {
            C372670EjJ.LIZIZ("The selected material is not supported for import");
            return false;
        }
        this.LJII.da0(TrackShowType.PIP);
        boolean zIsEmpty = C351220Dpo.LJJLIIIJLJLI(C350870DpF.LJI(c0e48Invoke)).isEmpty();
        long jJh = c0e48Invoke.getPlayer().Jh() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        NLETrackSlot nLETrackSlotLJJ = c0e48Invoke.LLFII().LJJ(editMedia, new C350990DpR(Long.valueOf(jJh), (Long) C0E5G.LIZIZ(EnumC357850E1f.PICTURE_TRACK_TIME, 4000L), null, null, z, false, false, null, 4060), this.LJIIJJI, null);
        if (nLETrackSlotLJJ != null) {
            nLETrackSlotLJJ.setExtra("is_editorpro_add_video_material", "1");
        }
        if (zIsEmpty) {
            this.LJIILIIL.invoke();
        }
        if (nLETrackSlotLJJ != null) {
            this.LJII.G22(nLETrackSlotLJJ, C0E6E.CLIP, EnumC358760E4s.NORMAL, true, false, true);
            if (z) {
                C0E53 c0e53 = this.LJIIIIZZ;
                if (c0e53 != null) {
                    c0e53.R30(nLETrackSlotLJJ, NLEEditorJniJNI.NLEFilterName_getAUDIO_VOICE_BEAUTIFY_FILTER());
                }
            } else {
                C0E53 c0e532 = this.LJIIIIZZ;
                if (c0e532 != null) {
                    c0e532.Tq0(nLETrackSlotLJJ, NLEEditorJniJNI.NLEFilterName_getAUDIO_VOICE_BEAUTIFY_FILTER());
                }
            }
        }
        c0e48Invoke.getPlayer().LJIJI(jJh, C351110Dpd.LIZ);
        if (z) {
            str = "record";
        } else {
            str = "import_video_footage";
        }
        LJ(bundle, str);
        return true;
    }

    public final boolean LJIIIIZZ(List<EditMedia> list, Intent intent, Bundle bundle) {
        C0E48 c0e48Invoke;
        C0E53 c0e53;
        NLEResourceNode resource;
        NLEResourceNode resource2;
        NLEResourceNode resource3;
        if (list == null || list.isEmpty() || (c0e48Invoke = this.LIZJ.invoke()) == null) {
            return false;
        }
        EditMedia editMedia = (EditMedia) ListProtector.get(list, 0);
        if (u.LJIIZILJ(editMedia.getPath(), ".mp4", false) && TEVideoUtils.isCanImport(editMedia.getPath()) != 0) {
            C356530DyN.LIZJ(new C0E6N() { // from class: X.0E5O
            }, "The selected material is not supported for import");
            return false;
        }
        long jJh = c0e48Invoke.getPlayer().Jh();
        NLETrackSlot nLETrackSlotLLLLLLIL = c0e48Invoke.LLLLLLIL();
        if (nLETrackSlotLLLLLLIL != null) {
            nLETrackSlotLLLLLLIL.removeExtraWithKey("extra_identity_key");
        }
        NLETrackSlot nLETrackSlotLLLLLLIL2 = c0e48Invoke.LLLLLLIL();
        if (nLETrackSlotLLLLLLIL2 != null) {
            NLESegment mainSegment = nLETrackSlotLLLLLLIL2.getMainSegment();
            if (mainSegment != null && (resource3 = mainSegment.getResource()) != null) {
                resource3.removeExtraWithKey("ep_ai_generating");
            }
            NLESegment mainSegment2 = nLETrackSlotLLLLLLIL2.getMainSegment();
            if (mainSegment2 != null && (resource2 = mainSegment2.getResource()) != null) {
                resource2.removeExtraWithKey("ep_ai_generated");
            }
            NLESegment mainSegment3 = nLETrackSlotLLLLLLIL2.getMainSegment();
            if (mainSegment3 != null && (resource = mainSegment3.getResource()) != null) {
                resource.removeExtraWithKey("ep_ai_generated_fail");
            }
            nLETrackSlotLLLLLLIL2.removeExtraWithKey("ep_aigc_id");
            nLETrackSlotLLLLLLIL2.removeExtraWithKey("creation_async_task_id");
            nLETrackSlotLLLLLLIL2.removeExtraWithKey("ep_aigc_media_item_id");
        }
        NLETrackSlot nLETrackSlotLLLLLLIL3 = c0e48Invoke.LLLLLLIL();
        if (nLETrackSlotLLLLLLIL3 != null) {
            nLETrackSlotLLLLLLIL3.removeExtraWithKey("ep_async_param");
        }
        NLETrackSlot nLETrackSlotLLLLLLIL4 = c0e48Invoke.LLLLLLIL();
        if (nLETrackSlotLLLLLLIL4 != null && (c0e53 = this.LJIIIIZZ) != null) {
            c0e53.Tq0(nLETrackSlotLLLLLLIL4, NLEEditorJniJNI.NLEFilterName_getAUDIO_VOICE_BEAUTIFY_FILTER());
        }
        NLETrackSlot nLETrackSlotLLLLLLIL5 = c0e48Invoke.LLLLLLIL();
        if (nLETrackSlotLLLLLLIL5 != null) {
            c0e48Invoke.LLFII().LJJJJZ(nLETrackSlotLLLLLLIL5, EnumC356070Dxd.NONE);
        }
        c0e48Invoke.LLFII().LLIIL(list, Boolean.valueOf(this.LJII.u80()), new AwS249S0300000_5(c0e48Invoke, this, C351490DqF.LIZIZ(nLETrackSlotLLLLLLIL5, this.LJIIL), 19));
        if (bundle != null) {
            LJ(bundle, "import_video_footage");
        } else if (intent != null) {
            LIZLLL(intent);
        }
        LIZIZ(jJh, nLETrackSlotLLLLLLIL5);
        return true;
    }

    public C0E5K(C19EG c19eg, C19A3 c19a3, AwS549S0100000_5 awS549S0100000_5, AwS549S0100000_5 awS549S0100000_52, AwS549S0100000_5 awS549S0100000_53, AwS549S0100000_5 awS549S0100000_54, AwS549S0100000_5 awS549S0100000_55, C0E5S c0e5s, C0E53 c0e53, InterfaceC359850E8x interfaceC359850E8x, FrameCacheViewModel frameCacheViewModel, InterfaceC351060DpY interfaceC351060DpY, InterfaceC361710EGb interfaceC361710EGb, AwS549S0100000_5 awS549S0100000_56, C358780E4u c358780E4u, AwS549S0100000_5 awS549S0100000_57) {
        this.LIZ = c19eg;
        this.LIZIZ = c19a3;
        this.LIZJ = awS549S0100000_5;
        this.LIZLLL = awS549S0100000_52;
        this.LJ = awS549S0100000_53;
        this.LJFF = awS549S0100000_54;
        this.LJI = awS549S0100000_55;
        this.LJII = c0e5s;
        this.LJIIIIZZ = c0e53;
        this.LJIIIZ = interfaceC359850E8x;
        this.LJIIJ = frameCacheViewModel;
        this.LJIIJJI = interfaceC351060DpY;
        this.LJIIL = interfaceC361710EGb;
        this.LJIILIIL = awS549S0100000_56;
        this.LJIILJJIL = c358780E4u;
        this.LJIILL = awS549S0100000_57;
    }
}
