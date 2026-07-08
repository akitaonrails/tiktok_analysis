package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentMV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0myw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417160myw {
    public static final C1417160myw LIZ = new C1417160myw();

    public static boolean LIZ(Context context) {
        Activity activityLIZ;
        if (context == null || ((activityLIZ = C06MM.LIZ(context)) != null && activityLIZ.isFinishing())) {
            return true;
        }
        Activity activityLIZ2 = C06MM.LIZ(context);
        if (activityLIZ2 != null && activityLIZ2.isDestroyed()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.lang.Object> LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5) throws org.json.JSONException {
        /*
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.List r1 = X.C358590E4b.LIZ(r5)
            boolean r0 = r1.isEmpty()
            r4 = 0
            if (r0 == 0) goto L1f
            r2 = r4
        L11:
            if (r2 == 0) goto L18
            java.lang.String r0 = "filter_lyric_effect_list"
            r3.put(r0, r2)
        L18:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r5.creativeModel
            com.ss.android.ugc.aweme.creative.model.AutoCutModel r0 = r0.autoCutModel
            java.util.List<com.ss.android.ugc.aweme.creative.model.AutoCutThemeData> r0 = r0.templateList
            goto L36
        L1f:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r1.next()
            r2.put(r0)
            goto L28
        L36:
            java.util.List r2 = X.C13LP.LLIIII(r0)     // Catch: java.lang.Throwable -> L3e
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L3e
            goto L4a
        L3e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L4a:
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L51
            r2 = r4
        L51:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            if (r2 == 0) goto La1
            X.07ik r1 = new X.07ik
            r1.<init>(r2)
            r0 = 66
            kotlin.jvm.internal.AFwS239S0000000_8 r0 = kotlin.jvm.internal.AFwS239S0000000_8.get$arr$(r0)
            X.08QU r1 = X.C09RB.LJIIIZ(r1, r0)
            r0 = 67
            kotlin.jvm.internal.AFwS239S0000000_8 r0 = kotlin.jvm.internal.AFwS239S0000000_8.get$arr$(r0)
            X.08QU r1 = X.C09RB.LJIJI(r1, r0)
            r0 = 107(0x6b, float:1.5E-43)
            kotlin.jvm.internal.AFwS261S0000000_22 r0 = kotlin.jvm.internal.AFwS261S0000000_22.get$arr$(r0)
            X.08QP r2 = new X.08QP
            r2.<init>(r1, r0)
            r0 = 4
            kotlin.jvm.internal.AFwS306S0000000_22 r1 = kotlin.jvm.internal.AFwS306S0000000_22.get$arr$(r0)
            X.08La r0 = new X.08La
            r0.<init>(r2, r1)
            java.util.List r1 = X.C09RB.LJJII(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto La1
            org.json.JSONArray r1 = X.C1412730mrn.LIZ(r1)
        L91:
            if (r1 == 0) goto L98
            java.lang.String r0 = "inserted_front_items"
            r3.put(r0, r1)
        L98:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto La3
            return r4
        La1:
            r1 = r4
            goto L91
        La3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417160myw.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.util.Map");
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        String stickerID;
        if ((videoPublishEditModel.getOrigin() == 1 || videoPublishEditModel.getOrigin() == 2) && !videoPublishEditModel.isDuet() && !videoPublishEditModel.isStitchMode()) {
            z = true;
        } else {
            z = false;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_record_support_autocut_strategy", true) == 0) {
            return false;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_record_support_autocut_strategy", true) == 1) {
            if (!z || ((stickerID = videoPublishEditModel.getStickerID()) != null && stickerID.length() != 0)) {
                return false;
            }
            return true;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_record_support_autocut_strategy", true) != 2) {
            return false;
        }
        return z;
    }

    public static boolean LJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isMvThemeVideoType() && !videoPublishEditModel.isPhotoMvMode()) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(List list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (true) {
            boolean z = true;
            while (it2.hasNext()) {
                AutoCutMediaModel autoCutMediaModel = (AutoCutMediaModel) it2.next();
                if (!z || !FileUtils.INSTANCE.checkFileExists(autoCutMediaModel.filePath)) {
                    z = false;
                }
            }
            return z;
        }
    }

    public static AVMusic LJI(VideoPublishEditModel videoPublishEditModel) {
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null) {
            aVMusicExtractAVMusic.setExtendMusicList(null);
            aVMusicExtractAVMusic.setMusicEndFromCut(0);
        }
        return aVMusicExtractAVMusic;
    }

    public static List LJIIIZ(AutoCutModel autoCutModel) {
        ArrayList arrayList;
        if (C311130CHn.LIZ()) {
            List<AutoCutThemeData> list = autoCutModel.templateList;
            arrayList = new ArrayList();
            for (AutoCutThemeData autoCutThemeData : list) {
                AutoCutThemeData autoCutThemeData2 = autoCutThemeData;
                if (autoCutThemeData2.LIZIZ() == C0MJ9.AUTO_CUT && !autoCutThemeData2.isPreset) {
                    arrayList.add(autoCutThemeData);
                }
            }
        } else {
            List<AutoCutThemeData> list2 = autoCutModel.templateList;
            arrayList = new ArrayList();
            for (AutoCutThemeData autoCutThemeData3 : list2) {
                AutoCutThemeData autoCutThemeData4 = autoCutThemeData3;
                String str = autoCutThemeData4.musicId;
                if (str != null && str.length() > 0 && autoCutThemeData4.LIZIZ() == C0MJ9.AUTO_CUT && !autoCutThemeData4.isPreset) {
                    arrayList.add(autoCutThemeData3);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, r2) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIILIIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7) {
        /*
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r7.creativeModel
            com.ss.android.ugc.aweme.creative.model.AutoCutModel r1 = r0.autoCutModel
            boolean r0 = r7.isCurrentAutoCutMode()
            r6 = 0
            if (r0 == 0) goto L7f
            com.ss.android.ugc.aweme.creative.model.AutoCutThemeData r4 = X.C1416110mxF.LIZJ(r1)
            if (r4 != 0) goto L12
            return r6
        L12:
            int r1 = r4.templateType
            X.0mre r0 = X.EnumC1412640mre.CUT_SAME
            int r0 = r0.getValue()
            r5 = 1
            if (r1 != r0) goto L24
            boolean r0 = X.C1417320mzC.LIZ(r4)
            if (r0 != 0) goto L24
            return r5
        L24:
            int r1 = r4.templateType
            X.0mre r0 = X.EnumC1412640mre.AI_ALIVE_TEMPLATE
            int r0 = r0.getValue()
            if (r1 != r0) goto L2f
            return r5
        L2f:
            java.lang.String r3 = r4.musicId
            if (r3 == 0) goto L70
            int r0 = r3.length()
            if (r0 == 0) goto L70
            r0 = 0
        L3a:
            r2 = 0
            if (r0 != 0) goto L72
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = LJI(r7)
            if (r0 == 0) goto L6e
            java.lang.String r0 = r0.getMusicId()
        L47:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 != 0) goto L6d
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r0 = 45
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = LJI(r7)
            if (r0 == 0) goto L67
            java.lang.String r2 = r0.getMusicId()
        L67:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r0 == 0) goto L72
        L6d:
            return r5
        L6e:
            r0 = r2
            goto L47
        L70:
            r0 = 1
            goto L3a
        L72:
            java.lang.String r1 = r4.musicPath
            com.ss.android.ugc.effectmanager.common.utils.FileUtils r0 = com.ss.android.ugc.effectmanager.common.utils.FileUtils.INSTANCE
            boolean r0 = r0.checkFileExists(r1)
            if (r0 == 0) goto L7f
            if (r1 == 0) goto L7f
            return r5
        L7f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417160myw.LJIILIIL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static boolean LJIIZILJ(AutoCutModel autoCutModel) {
        return !LJIIIZ(autoCutModel).isEmpty();
    }

    public static boolean LJIJI(VideoPublishEditModel videoPublishEditModel) {
        boolean zLJFF = Intrinsics.LJFF(videoPublishEditModel.mShootWay, "autocut_anchor");
        boolean zLIZLLL = C537970L7z.LIZLLL(videoPublishEditModel.creativeModel.editorProSchemeModel);
        if ((!zLJFF && !zLIZLLL) || LJIIZILJ(videoPublishEditModel.creativeModel.autoCutModel)) {
            return false;
        }
        if (!zLIZLLL && !C527950KnB.LIZIZ()) {
            return false;
        }
        return true;
    }

    public static boolean LJJ(VideoPublishEditModel videoPublishEditModel) {
        if (((Number) C0BJ2.LIZ.getValue()).intValue() != 0 && videoPublishEditModel.isCurrentAutoCutMode() && videoPublishEditModel.creativeModel.autoCutModel.applyScenario == EnumC1417150myv.ALBUM.getCode() && !videoPublishEditModel.creativeModel.draftInfoModel.isDraft && videoPublishEditModel.getOrigin() == 0 && !videoPublishEditModel.creativeModel.storyModel.isStoryEntrance()) {
            List<AutoCutMediaModel> list = videoPublishEditModel.creativeModel.autoCutModel.mediaList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<AutoCutMediaModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (!(!it2.next().isVideoType)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void LIZJ(C1417180myy c1417180myy, AutoCutModel autoCutModel) {
        int size;
        List<AutoCutMediaModel> list = c1417180myy.LIZ;
        int size2 = 0;
        if (list != null) {
            int i = 0;
            for (AutoCutMediaModel autoCutMediaModel : list) {
                if (autoCutMediaModel.width == 0 || autoCutMediaModel.height == 0) {
                    i++;
                }
            }
            if (i > 0) {
                List<AutoCutMediaModel> list2 = c1417180myy.LIZ;
                if (list2 != null) {
                    size = list2.size();
                } else {
                    size = 0;
                }
                List<AutoCutMediaModel> list3 = c1417180myy.LIZ;
                if (list3 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (AutoCutMediaModel autoCutMediaModel2 : list3) {
                        if (autoCutMediaModel2.isVideoType) {
                            arrayList.add(autoCutMediaModel2);
                        }
                    }
                    size2 = arrayList.size();
                }
                C1417710mzp c1417710mzp = C1417710mzp.LIZ;
                String string = c1417180myy.LIZJ.toString();
                String str = autoCutModel.clickFrom;
                c1417710mzp.getClass();
                C1417710mzp.LJIILJJIL(size, size - size2, size2, "video_edit_page", string, str);
            }
        }
    }

    public static void LJIIL(C1DRG c1drg, VideoPublishEditModel videoPublishEditModel) {
        InterfaceC1455860nzM interfaceC1455860nzM;
        InterfaceC1414530muh interfaceC1414530muh;
        if (c1drg != null) {
            interfaceC1455860nzM = (InterfaceC1455860nzM) c1drg.LJIIL(null, InterfaceC1455860nzM.class);
        } else {
            interfaceC1455860nzM = null;
        }
        if (!C1417220mz2.LIZ(videoPublishEditModel)) {
            if (interfaceC1455860nzM != null) {
                C1456140nzo.LIZIZ(interfaceC1455860nzM, false, false, false, false, 12);
            }
        } else {
            if (!C1417220mz2.LIZIZ()) {
                if (c1drg != null && (interfaceC1414530muh = (InterfaceC1414530muh) c1drg.LJIIL(null, InterfaceC1414530muh.class)) != null) {
                    interfaceC1414530muh.be(false);
                    return;
                }
                return;
            }
            if (interfaceC1455860nzM != null) {
                C1456140nzo.LIZIZ(interfaceC1455860nzM, false, false, false, true, 4);
            }
        }
    }

    public static boolean LJIILLIIL(List list, List list2) {
        if (list.containsAll(list2) && list2.containsAll(list)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIJJ(X.C1DRG r9, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417160myw.LJIJJ(X.1DRG, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):boolean");
    }

    public static String LJIIJJI(Context context, String str, boolean z) {
        if (z && C2471909mP.LJJIIZI(str) && context != null) {
            return C09N5.LIZ(context, C2471909mP.LJIILIIL(str));
        }
        return str;
    }

    public static void LJIJ(VideoPublishEditModel videoPublishEditModel, List list, boolean z) {
        String strLIZ;
        Object next;
        int i;
        String strLJJLIIIJJI;
        Object next2;
        if (C0CHU.LIZ() || C0CHV.LIZ()) {
            Iterator it2 = list.iterator();
            while (true) {
                strLIZ = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    AutoCutThemeData autoCutThemeData = (AutoCutThemeData) next;
                    if (C559520Lx0.LIZ()) {
                        if (autoCutThemeData.isPreset && autoCutThemeData.LIZIZ() == C0MJ9.AUTO_CUT) {
                            break;
                        }
                    } else if (autoCutThemeData.LIZIZ() == C0MJ9.AUTO_CUT) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AutoCutThemeData autoCutThemeData2 = (AutoCutThemeData) next;
            if (autoCutThemeData2 == null) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (((AutoCutThemeData) next2).LIZIZ() == C0MJ9.AUTO_CUT) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                autoCutThemeData2 = (AutoCutThemeData) next2;
                if (autoCutThemeData2 == null) {
                    return;
                }
            }
            if (Intrinsics.LJFF(C1412490mrP.LIZIZ(videoPublishEditModel), "single_song") || !z) {
                LIZ.getClass();
                AVMusic aVMusicLJI = LJI(videoPublishEditModel);
                if (aVMusicLJI != null) {
                    strLIZ = C1417570mzb.LIZ(aVMusicLJI);
                }
                List listLJIJI = s.LJIJI(C2537209ww.LIZ());
                autoCutThemeData2.reuseMusicAlignDisplayIndex = 1;
                if (C0CHU.LIZ()) {
                    i = 1;
                } else {
                    i = 2;
                }
                autoCutThemeData2.reuseMusicAlignBranch = i;
                String str = autoCutThemeData2.reuseMusicLocalCoverPath;
                if (str != null && str.length() != 0) {
                    strLJJLIIIJJI = autoCutThemeData2.reuseMusicLocalCoverPath;
                } else {
                    strLJJLIIIJJI = s.LJJLIIIJJI(autoCutThemeData2.templateId, autoCutThemeData2.musicId, listLJIJI);
                }
                autoCutThemeData2.reuseMusicLocalCoverPath = strLJJLIIIJJI;
                autoCutThemeData2.reuseMusicName = strLIZ;
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    AutoCutThemeData autoCutThemeData3 = (AutoCutThemeData) it4.next();
                    if (autoCutThemeData3 != autoCutThemeData2 && autoCutThemeData3.reuseMusicAlignBranch != 0) {
                        autoCutThemeData3.reuseMusicName = strLIZ;
                    }
                }
            }
        }
    }

    public static final C1417180myy LJII(Context context, VideoPublishEditModel videoPublishEditModel, C1DRG c1drg, boolean z) {
        List<AutoCutMediaModel> list = videoPublishEditModel.creativeModel.autoCutModel.mediaList;
        LIZ.getClass();
        if (LJIILJJIL(context, videoPublishEditModel, c1drg, null) && LJFF(list)) {
            return new C1417180myy(list, true, C0MJI.AUTO_CUT);
        }
        return LJIIIIZZ(context, videoPublishEditModel, c1drg, z);
    }

    public static C1417180myy LJIIIIZZ(Context context, VideoPublishEditModel videoPublishEditModel, C1DRG c1drg, boolean z) {
        C05YF c05yfMY1;
        List arrayList;
        AbstractC1452680nuE abstractC1452680nuEGc;
        NLEModel nLEModelLIZ;
        VecNLETrackSPtr tracks;
        AutoCutMediaModel autoCutMediaModel;
        String resourceFile;
        NLEResType resourceType;
        boolean z2;
        NLEResourceNode resource;
        NLEResourceNode resource2;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        String resourceFile2;
        NLEResType resourceType2;
        boolean z4;
        NLEResourceNode resource3;
        NLEResourceNode resource4;
        if (c1drg != null) {
            c05yfMY1 = ((C0ETY) c1drg.LJII(C0ETY.class, null)).MY1(InterfaceC1419190n2D.class);
        } else {
            c05yfMY1 = null;
        }
        if (c05yfMY1 == null || (videoPublishEditModel.getEditorProModel().isAdvancedEdit() && C0C64.LJIILLIIL().LJIIIZ(31744, "autocut_media_list_unchanged_revert", true, true))) {
            if (LJ(videoPublishEditModel) && !C1428470nHB.LJJZZI(videoPublishEditModel)) {
                ArrayList arrayList2 = new ArrayList();
                if (c1drg != null && (abstractC1452680nuEGc = ((InterfaceC1455860nzM) c1drg.LJII(InterfaceC1455860nzM.class, null)).gc()) != null && (nLEModelLIZ = C352130DrH.LIZ(abstractC1452680nuEGc.LJJ())) != null && (tracks = nLEModelLIZ.getTracks()) != null) {
                    Iterator<NLETrack> it2 = tracks.iterator();
                    while (it2.hasNext()) {
                        VecNLETrackSlotSPtr slots = it2.next().getSlots();
                        if (slots != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (NLETrackSlot nLETrackSlot : slots) {
                                if (!Intrinsics.LJFF(nLETrackSlot.getExtra("is_from_template"), "true")) {
                                    arrayList3.add(nLETrackSlot);
                                }
                            }
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                NLESegment mainSegment = ((NLETrackSlot) it3.next()).getMainSegment();
                                String str5 = "";
                                if (NLESegmentVideo.dynamicCast((NLENode) mainSegment) != null && mainSegment != null && mainSegment.getResource() != null) {
                                    C1417160myw c1417160myw = LIZ;
                                    if (mainSegment != null && (resource4 = mainSegment.getResource()) != null) {
                                        resourceFile2 = resource4.getResourceFile();
                                    } else {
                                        resourceFile2 = null;
                                    }
                                    c1417160myw.getClass();
                                    String strLJIIJJI = LJIIJJI(context, resourceFile2, true);
                                    if (strLJIIJJI != null) {
                                        str5 = strLJIIJJI;
                                    }
                                    if (mainSegment != null && (resource3 = mainSegment.getResource()) != null) {
                                        resourceType2 = resource3.getResourceType();
                                    } else {
                                        resourceType2 = null;
                                    }
                                    if (resourceType2 == NLEResType.VIDEO) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    autoCutMediaModel = new AutoCutMediaModel(str5, "", null, 0, 0, z4, 0L, 0L, 0L, 0.0f, false, null, null, 8156, null);
                                } else if (NLESegmentMV.dynamicCast(mainSegment) != null && mainSegment != null && mainSegment.getResource() != null) {
                                    C1417160myw c1417160myw2 = LIZ;
                                    if (mainSegment != null && (resource2 = mainSegment.getResource()) != null) {
                                        resourceFile = resource2.getResourceFile();
                                    } else {
                                        resourceFile = null;
                                    }
                                    c1417160myw2.getClass();
                                    String strLJIIJJI2 = LJIIJJI(context, resourceFile, true);
                                    if (strLJIIJJI2 != null) {
                                        str5 = strLJIIJJI2;
                                    }
                                    if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
                                        resourceType = resource.getResourceType();
                                    } else {
                                        resourceType = null;
                                    }
                                    if (resourceType == NLEResType.VIDEO) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    autoCutMediaModel = new AutoCutMediaModel(str5, "", null, 0, 0, z2, 0L, 0L, 0L, 0.0f, false, null, null, 8156, null);
                                } else {
                                    autoCutMediaModel = null;
                                }
                                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("AutoCutEditHelper getMediaListFromNLE: mediaModel = ");
                                sbLIZ.append(autoCutMediaModel);
                                sbLIZ.append(", filePath = ");
                                if (autoCutMediaModel != null) {
                                    str = autoCutMediaModel.filePath;
                                } else {
                                    str = null;
                                }
                                sbLIZ.append(str);
                                sbLIZ.append(", exist? ");
                                FileUtils fileUtils = FileUtils.INSTANCE;
                                if (autoCutMediaModel != null) {
                                    str2 = autoCutMediaModel.filePath;
                                } else {
                                    str2 = null;
                                }
                                sbLIZ.append(fileUtils.checkFileExists(str2));
                                C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                                if (autoCutMediaModel != null && fileUtils.checkFileExists(autoCutMediaModel.filePath)) {
                                    LIZ.getClass();
                                    if (!autoCutMediaModel.isVideoType) {
                                        Pair<Integer, Integer> pairLIZJ = C097U.LIZJ(autoCutMediaModel.filePath);
                                        if (pairLIZJ.getFirst().intValue() > 0 && pairLIZJ.getSecond().intValue() > 0) {
                                            autoCutMediaModel.width = pairLIZJ.getFirst().intValue();
                                            autoCutMediaModel.height = pairLIZJ.getSecond().intValue();
                                            z3 = true;
                                        }
                                        z3 = false;
                                    } else {
                                        try {
                                            C13W2 c13w2 = new C13W2();
                                            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(autoCutMediaModel.filePath);
                                            if (videoFileInfo != null && (i3 = videoFileInfo.width) > 0 && (i4 = videoFileInfo.height) > 0) {
                                                c13w2.LIZJ = i3;
                                                c13w2.LIZLLL = i4;
                                                c13w2.LJII = videoFileInfo.rotation;
                                                c13w2.LJ = videoFileInfo.duration;
                                            } else {
                                                C13W2 c13w2LIZIZ = C13W4.LIZIZ(autoCutMediaModel.filePath);
                                                int i5 = c13w2LIZIZ.LIZJ;
                                                if (i5 > 0 && (i = c13w2LIZIZ.LIZLLL) > 0) {
                                                    c13w2.LIZJ = i5;
                                                    c13w2.LIZLLL = i;
                                                    c13w2.LJII = c13w2LIZIZ.LJII;
                                                    c13w2.LJ = c13w2LIZIZ.LJ;
                                                }
                                            }
                                            int i6 = c13w2.LIZJ;
                                            if (i6 > 0 && (i2 = c13w2.LIZLLL) > 0) {
                                                int i7 = c13w2.LJII;
                                                if (i7 == 90 || i7 == 270) {
                                                    autoCutMediaModel.width = i2;
                                                    autoCutMediaModel.height = i6;
                                                } else {
                                                    autoCutMediaModel.width = i6;
                                                    autoCutMediaModel.height = i2;
                                                }
                                                autoCutMediaModel.duration = c13w2.LJ;
                                                z3 = true;
                                            }
                                        } catch (Exception e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            e.getMessage();
                                        }
                                        z3 = false;
                                    }
                                    C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("AutoCutEditHelper getMediaListFromNLE: width = ");
                                    sbLIZ2.append(autoCutMediaModel.width);
                                    sbLIZ2.append(", height = ");
                                    sbLIZ2.append(autoCutMediaModel.height);
                                    C201955140j.LJIILJJIL(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
                                    if (z3 && autoCutMediaModel.width > 0 && autoCutMediaModel.height > 0) {
                                        arrayList2.add(autoCutMediaModel);
                                    }
                                    C201955140j.LJIILJJIL(c1398350mUb2, "AutoCutEditHelper getMediaListFromNLE success");
                                } else {
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("AutoCutEditHelper getMediaListFromNLE: not use. ");
                                    if (autoCutMediaModel != null && (str4 = autoCutMediaModel.filePath) != null && a0.LJJIIZI(str4, videoPublishEditModel.getCreativeInfo().getCreationId(), false)) {
                                        str3 = "file not exist";
                                    } else {
                                        str3 = "not draft path";
                                    }
                                    sbLIZ3.append(str3);
                                    C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ3));
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (hashSet.add(((AutoCutMediaModel) obj).filePath)) {
                        arrayList4.add(obj);
                    }
                }
                arrayList = new ArrayList(arrayList4);
            } else {
                arrayList = C13BV.INSTANCE;
            }
            if (!arrayList.isEmpty()) {
                return new C1417180myy(arrayList, false, C0MJI.AUTO_CUT);
            }
        }
        List<AutoCutMediaModel> listLJIIJ = LJIIJ(context, videoPublishEditModel, c1drg, z);
        if (listLJIIJ != null && !((ArrayList) listLJIIJ).isEmpty() && LJFF(listLJIIJ)) {
            return new C1417180myy(listLJIIJ, false, C0MJI.ORIGIN);
        }
        return new C1417180myy(null, false, C0MJI.NONE);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel> LJIIJ(android.content.Context r44, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r45, X.C1DRG r46, boolean r47) {
        /*
            Method dump skipped, instruction units count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417160myw.LJIIJ(android.content.Context, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.1DRG, boolean):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIILJJIL(android.content.Context r20, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r21, X.C1DRG r22, X.C1417180myy r23) {
        /*
            Method dump skipped, instruction units count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417160myw.LJIILJJIL(android.content.Context, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.1DRG, X.0myy):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03d4 A[PHI: r11
      0x03d4: PHI (r11v1 boolean) = (r11v0 boolean), (r11v14 boolean), (r11v14 boolean), (r11v14 boolean) binds: [B:185:0x03d0, B:64:0x01bd, B:66:0x01c9, B:67:0x01cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x09f2  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x09fe  */
    /* JADX WARN: Removed duplicated region for block: B:503:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:504:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIL(final android.content.Context r98, final X.C1DRG r99, final com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r100, final X.C1417180myy r101, boolean r102, int r103) {
        /*
            Method dump skipped, instruction units count: 2660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1417160myw.LJIL(android.content.Context, X.1DRG, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0myy, boolean, int):void");
    }
}
