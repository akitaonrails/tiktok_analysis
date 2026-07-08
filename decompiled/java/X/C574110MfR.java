package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.ies.nle.editor_jni.NLECanvasType;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentMV;
import com.bytedance.ies.nle.editor_jni.NLESegmentMVResolution;
import com.bytedance.ies.nle.editor_jni.NLESegmentMVResultInType;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackMV;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mvtheme.MVTransitionParam;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import com.tts.oecverify.BdTuring;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS137S0400000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0MfR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574110MfR {
    public static final AbstractC1452680nuE LIZ(int i, final C1441900ncq c1441900ncq) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEVideoEditorFactory createVideoEditor type: ");
        sbLIZ.append(i);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        switch (i) {
            case 2:
                return new AbstractC1452680nuE(c1441900ncq) { // from class: X.0Mfm
                    public List<String> LJJIJIIJIL;

                    {
                        C823050WQl.LJ();
                    }

                    @Override // X.AbstractC1452680nuE
                    public final NLEEditor LJII(VEPreviewParams vEPreviewParams) {
                        ArrayList<String> arrayList;
                        String str;
                        NLEModel model;
                        MvCreateVideoData mvCreateVideoData;
                        int i2;
                        long jLongValue;
                        long jLongValue2;
                        boolean zBooleanValue;
                        MvCreateVideoData mvCreateVideoData2;
                        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                        MvCreateVideoData mvCreateVideoData3 = vEPreviewParams.mvCreateVideoData;
                        if (mvCreateVideoData3 == null || (arrayList = mvCreateVideoData3.selectMediaList) == null || arrayList.isEmpty() || (str = mvCreateVideoData3.mvResUnzipPath) == null || str.length() == 0 || (model = nLEEditorLIZ.getModel()) == null) {
                            return nLEEditorLIZ;
                        }
                        long j = 1000;
                        if (!C296010Bix.LIZ() && !C295930Bip.LIZ()) {
                            C20684815ws.LJIILLIIL("use_old_mv", C2097608Jq.LJ());
                            C347660Dk4 c347660Dk4 = new C347660Dk4();
                            c347660Dk4.LIZIZ = "";
                            c347660Dk4.LJIIIZ = 1.0f;
                            new C347750DkD(c347660Dk4).LIZJ(nLEEditorLIZ);
                            if ((vEPreviewParams instanceof VEPreviewParams) && (mvCreateVideoData2 = vEPreviewParams.mvCreateVideoData) != null) {
                                ArrayList<String> arrayList2 = mvCreateVideoData2.selectMediaList;
                                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                                Iterator<String> it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    it2.next();
                                    arrayList3.add("img");
                                }
                                NLETrackMV nLETrackMV = new NLETrackMV();
                                nLETrackMV.setMainTrack(true);
                                NLEResourceNode nLEResourceNode = new NLEResourceNode();
                                nLEResourceNode.setResourceFile(mvCreateVideoData2.mvResUnzipPath);
                                nLETrackMV.setMV(nLEResourceNode);
                                nLETrackMV.setMVResolution(NLESegmentMVResolution.RES_CUSTOM.swigValue());
                                nLETrackMV.setCustomWidth(vEPreviewParams.mCanvasWidth);
                                nLETrackMV.setCustomHeight(vEPreviewParams.mCanvasHeight);
                                int i3 = 0;
                                long j2 = 0;
                                for (String str2 : arrayList2) {
                                    int i4 = i3 + 1;
                                    if (i3 >= 0) {
                                        NLETrackSlot nLETrackSlot = new NLETrackSlot();
                                        nLETrackSlot.setStartTime(j2 * 1000);
                                        NLESegmentMV nLESegmentMV = new NLESegmentMV();
                                        NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
                                        nLEResourceNode2.setResourceFile(str2);
                                        nLEResourceNode2.setDuration(((long) 1) * 1000);
                                        nLESegmentMV.setSourceFile(nLEResourceNode2);
                                        if (i3 < arrayList3.size()) {
                                            nLESegmentMV.setSourceFileType((String) ListProtector.get(arrayList3, i3));
                                        }
                                        nLETrackSlot.setMainSegment(nLESegmentMV);
                                        j2++;
                                        nLETrackMV.addSlot(nLETrackSlot);
                                        i3 = i4;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                }
                                ArrayList<MvNetFileBean> arrayList4 = mvCreateVideoData2.newMaskFileData;
                                if (arrayList4 != null && !arrayList4.isEmpty()) {
                                    for (MvNetFileBean mvNetFileBean : arrayList4) {
                                        String photonPath = mvNetFileBean.getPhotonPath();
                                        String algorithm = mvNetFileBean.getAlgorithm();
                                        String filePath = mvNetFileBean.getFilePath();
                                        String jsonParams = mvNetFileBean.getJsonParams();
                                        if (filePath.length() > 0) {
                                            if (u.LJIIZILJ(filePath, ".mp4", false)) {
                                                C346590DiL.LIZ(nLETrackMV, photonPath, algorithm, filePath, NLESegmentMVResultInType.TYPE_VIDEO.swigValue());
                                            } else {
                                                C346590DiL.LIZ(nLETrackMV, photonPath, algorithm, filePath, NLESegmentMVResultInType.TYPE_IMAGE.swigValue());
                                            }
                                        }
                                        if (jsonParams.length() > 0) {
                                            C346590DiL.LIZ(nLETrackMV, photonPath, algorithm, jsonParams, NLESegmentMVResultInType.TYPE_JSON.swigValue());
                                        }
                                    }
                                }
                                model.addTrack(nLETrackMV);
                                return nLEEditorLIZ;
                            }
                        } else if ((vEPreviewParams instanceof VEPreviewParams) && (mvCreateVideoData = vEPreviewParams.mvCreateVideoData) != null) {
                            ArrayList arrayList5 = mvCreateVideoData.selectMediaList;
                            MVTransitionParam mVTransitionParam = mvCreateVideoData.mvTransitionParam;
                            NLETrack nLETrack = new NLETrack();
                            nLETrack.setMainTrack(true);
                            if (arrayList5.size() < 4) {
                                ArrayList arrayList6 = new ArrayList();
                                arrayList6.addAll(arrayList5);
                                for (Object obj : arrayList5) {
                                    if (arrayList6.size() < 4) {
                                        arrayList6.add(obj);
                                    }
                                }
                                arrayList5 = arrayList6;
                            }
                            int i5 = 0;
                            long j3 = 0;
                            for (Object obj2 : arrayList5) {
                                int i6 = i5 + 1;
                                if (i5 >= 0) {
                                    String str3 = (String) obj2;
                                    NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                                    if (i5 != 0 && i5 != arrayList5.size() - 1) {
                                        i2 = LivePreCreateNextRoomPlayer.ENABLE;
                                    } else {
                                        i2 = 2500;
                                    }
                                    long j4 = ((long) i2) * j;
                                    nLETrackSlot2.setStartTime(j3);
                                    C348350DlB.LJIIL(nLETrackSlot2);
                                    nLETrackSlot2.setTransformZ(0);
                                    NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                                    NLEResourceAV nLEResourceAV = new NLEResourceAV();
                                    nLEResourceAV.setResourceFile(str3);
                                    nLESegmentVideo.setTimeClipStart(0L);
                                    nLESegmentVideo.setTimeClipEnd(j4);
                                    nLEResourceAV.setDuration(j4);
                                    nLESegmentVideo.setSpeed(1.0f);
                                    nLEResourceAV.setHasAudio(false);
                                    nLESegmentVideo.setVolume(0.0f);
                                    C533730KwV.LIZ.getClass();
                                    nLEResourceAV.setResourceType(C533730KwV.LJ(str3));
                                    nLESegmentVideo.setAVFile(nLEResourceAV);
                                    nLESegmentVideo.setEnableAudio(false);
                                    NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
                                    C348350DlB.LJIILIIL(nLEStyCanvas, true);
                                    nLESegmentVideo.setCanvasStyle(nLEStyCanvas);
                                    nLETrackSlot2.setMainSegment(nLESegmentVideo);
                                    MVTransitionParam mVTransitionParam2 = mvCreateVideoData.mvTransitionParam;
                                    if (mVTransitionParam2 != null && C123100dR.LIZ(mVTransitionParam2.getTransitionPath()) && i5 != arrayList5.size() - 1) {
                                        NLESegmentTransition nLESegmentTransition = new NLESegmentTransition();
                                        Long duration = mVTransitionParam2.getDuration();
                                        if (duration != null) {
                                            jLongValue2 = duration.longValue();
                                        } else {
                                            jLongValue2 = 500000;
                                        }
                                        nLESegmentTransition.setTransitionDuration(jLongValue2);
                                        NLEResourceNode nLEResourceNode3 = new NLEResourceNode();
                                        nLEResourceNode3.setResourceFile(mVTransitionParam2.getTransitionPath());
                                        nLEResourceNode3.setResourceId(mVTransitionParam2.getEffectId());
                                        nLESegmentTransition.setEffectSDKTransition(nLEResourceNode3);
                                        Boolean boolIsOverlap = mVTransitionParam2.isOverlap();
                                        if (boolIsOverlap != null) {
                                            zBooleanValue = boolIsOverlap.booleanValue();
                                        } else {
                                            zBooleanValue = true;
                                        }
                                        nLESegmentTransition.setOverlap(zBooleanValue);
                                        nLETrackSlot2.setEndTransition(nLESegmentTransition);
                                        C350690Dox.LJIIIIZZ(nLETrackSlot2.getEndTransition(), null, nLETrackSlot2, nLETrack);
                                    }
                                    if (mVTransitionParam != null && Intrinsics.LJFF(mVTransitionParam.isOverlap(), Boolean.TRUE)) {
                                        Long duration2 = mVTransitionParam.getDuration();
                                        if (duration2 != null) {
                                            jLongValue = duration2.longValue();
                                        } else {
                                            jLongValue = 500000;
                                        }
                                    } else {
                                        jLongValue = 0;
                                    }
                                    j3 += j4 - jLongValue;
                                    nLETrack.addSlot(nLETrackSlot2);
                                    i5 = i6;
                                    j = 1000;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            nLETrack.setEndTime(((NLETimeSpaceNode) C13LP.LJJLIIIJJI(nLETrack.getSlots())).getEndTime());
                            nLETrack.setDuration(((NLETimeSpaceNode) C13LP.LJJLIIIJJI(nLETrack.getSlots())).getEndTime());
                            model.addTrack(nLETrack);
                            model.setDuration(nLETrack.getEndTime());
                            String str4 = vEPreviewParams.mMusicPath;
                            if (str4 != null && C123100dR.LIZ(str4)) {
                                long jMin = Math.min(((NLETimeSpaceNode) C13LP.LJJLIIIJJI(nLETrack.getSlots())).getEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), vEPreviewParams.mMusicOutPoint);
                                C347660Dk4 c347660Dk42 = new C347660Dk4();
                                c347660Dk42.LIZIZ = vEPreviewParams.mMusicPath;
                                c347660Dk42.LJIIIZ = 1.0f;
                                c347660Dk42.LJFF = 0L;
                                c347660Dk42.LJI = jMin;
                                long j5 = vEPreviewParams.mMusicInPoint;
                                c347660Dk42.LIZLLL = j5;
                                c347660Dk42.LJ = j5 + jMin;
                                c347660Dk42.LJIJJLI = true;
                                new C347750DkD(c347660Dk42).LIZJ(nLEEditorLIZ);
                            }
                        }
                        return nLEEditorLIZ;
                    }

                    @Override // X.AbstractC1452680nuE
                    public final void LJJIIJ(boolean z) {
                        InterfaceC574340Mfo interfaceC574340Mfo = this.LJIIIIZZ;
                        if (this.LJIJJ == null && interfaceC574340Mfo != null && interfaceC574340Mfo.getCanvasWidth() > 0 && interfaceC574340Mfo.getCanvasHeight() > 0 && !interfaceC574340Mfo.isCanvasVEEditorType()) {
                            LJIJ().tf(VEEditor.SCALE_MODE.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
                            LJIJ().Vf(interfaceC574340Mfo.getCanvasWidth(), interfaceC574340Mfo.getCanvasHeight());
                        }
                        super.LJJIIJ(z);
                    }

                    @Override // X.AbstractC1452680nuE
                    public final boolean LJIIJJI(VEPreviewMusicParams vEPreviewMusicParams, List<? extends VEPreviewMusicParams> list) {
                        Object objLJJJLL;
                        int i2;
                        int i3;
                        InterfaceC391070FUz interfaceC391070FUzLJFF;
                        NLEEditor nLEEditor;
                        NLEModel model;
                        NLETrack mainTrack;
                        List<String> list2;
                        InterfaceC391070FUz interfaceC391070FUzLJFF2;
                        InterfaceC391070FUz interfaceC391070FUzLJFF3;
                        InterfaceC391070FUz interfaceC391070FUzLJFF4;
                        C347660Dk4 c347660Dk4LJJJJ;
                        InterfaceC391070FUz interfaceC391070FUzLJFF5;
                        String str = vEPreviewMusicParams.musicId;
                        List<String> list3 = this.LJJIJIIJIL;
                        if (list3 != null) {
                            objLJJJLL = C13LP.LJJJLL(list3);
                        } else {
                            objLJJJLL = null;
                        }
                        if (Intrinsics.LJFF(str, objLJJJLL)) {
                            return false;
                        }
                        if (vEPreviewMusicParams.isMusicIllegal) {
                            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(LJJ());
                            if (c348100DkmLIZIZ != null && (interfaceC391070FUzLJFF4 = c348100DkmLIZIZ.LJFF()) != null && (c347660Dk4LJJJJ = interfaceC391070FUzLJFF4.LJJJJ()) != null) {
                                c347660Dk4LJJJJ.LJIIIZ = 0.0f;
                                C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(LJJ());
                                if (c348100DkmLIZIZ2 != null && (interfaceC391070FUzLJFF5 = c348100DkmLIZIZ2.LJFF()) != null) {
                                    interfaceC391070FUzLJFF5.LJJJJLL(c347660Dk4LJJJJ);
                                }
                            }
                            return false;
                        }
                        if (vEPreviewMusicParams.pageType == 2 && TextUtils.isEmpty(vEPreviewMusicParams.musicId)) {
                            return false;
                        }
                        C348100Dkm c348100DkmLIZIZ3 = C352130DrH.LIZIZ(LJIJ());
                        if (c348100DkmLIZIZ3 != null && (interfaceC391070FUzLJFF3 = c348100DkmLIZIZ3.LJFF()) != null) {
                            interfaceC391070FUzLJFF3.LJJJJLL(null);
                        }
                        C347660Dk4 c347660Dk4 = new C347660Dk4();
                        String str2 = vEPreviewMusicParams.musicId;
                        if (!TextUtils.isEmpty(str2) && (list2 = this.LJJIJIIJIL) != null && !C580130Mp9.LIZ(list2) && C13LP.LJJJJ(str2, list2)) {
                            c347660Dk4.LJJIFFI = EnumC356060Dxc.MV_NORMAL;
                            c347660Dk4.LIZIZ = "";
                            c347660Dk4.LJIJI = vEPreviewMusicParams.musicId;
                            c347660Dk4.LJIJJ = vEPreviewMusicParams.musicName;
                            c347660Dk4.LJIIIZ = vEPreviewMusicParams.mVolume;
                            C348100Dkm c348100DkmLIZIZ4 = C352130DrH.LIZIZ(LJIJ());
                            if (c348100DkmLIZIZ4 != null && (interfaceC391070FUzLJFF2 = c348100DkmLIZIZ4.LJFF()) != null) {
                                interfaceC391070FUzLJFF2.LJJJJLL(c347660Dk4);
                            }
                        } else if (!TextUtils.isEmpty(vEPreviewMusicParams.mPath)) {
                            c347660Dk4.LJJIFFI = EnumC356060Dxc.MV_NORMAL;
                            c347660Dk4.LIZIZ = vEPreviewMusicParams.mPath;
                            c347660Dk4.LJIJI = vEPreviewMusicParams.musicId;
                            c347660Dk4.LJIJJ = vEPreviewMusicParams.musicName;
                            c347660Dk4.LJFF = 0L;
                            c347660Dk4.LIZLLL = vEPreviewMusicParams.mInPoint;
                            int i4 = vEPreviewMusicParams.mShootDuration;
                            if (i4 > 0 && Math.abs(vEPreviewMusicParams.mDuration - i4) >= 1000) {
                                i2 = vEPreviewMusicParams.mInPoint;
                                i3 = vEPreviewMusicParams.mShootDuration;
                            } else {
                                i2 = vEPreviewMusicParams.mInPoint;
                                i3 = vEPreviewMusicParams.mDuration;
                            }
                            long j = i2 + i3;
                            c347660Dk4.LJ = j;
                            c347660Dk4.LJIJJLI = vEPreviewMusicParams.isSoundLoop;
                            c347660Dk4.LJIIIZ = vEPreviewMusicParams.mVolume;
                            long j2 = j - c347660Dk4.LIZLLL;
                            C348100Dkm c348100DkmLIZIZ5 = C352130DrH.LIZIZ(LJIJ());
                            long jLongValue = -2;
                            if (c348100DkmLIZIZ5 != null && (nLEEditor = c348100DkmLIZIZ5.LIZ) != null && (model = nLEEditor.getModel()) != null && (mainTrack = model.getMainTrack()) != null) {
                                if (mainTrack.getMaxEnd() / 1000 <= j2) {
                                    j2 = -2;
                                }
                                jLongValue = Long.valueOf(j2).longValue();
                            }
                            c347660Dk4.LJI = jLongValue;
                            C348100Dkm c348100DkmLIZIZ6 = C352130DrH.LIZIZ(LJIJ());
                            if (c348100DkmLIZIZ6 != null && (interfaceC391070FUzLJFF = c348100DkmLIZIZ6.LJFF()) != null) {
                                interfaceC391070FUzLJFF.LJJJJLL(c347660Dk4);
                                return false;
                            }
                        }
                        return false;
                    }

                    @Override // X.AbstractC1452680nuE
                    public final int LJJII(Context context, InterfaceC574340Mfo interfaceC574340Mfo, SurfaceView surfaceView, LifecycleOwner lifecycleOwner) {
                        MvCreateVideoData mvCreateVideoData;
                        super.LJJII(context, interfaceC574340Mfo, surfaceView, lifecycleOwner);
                        if ((interfaceC574340Mfo instanceof VEPreviewParams) && (mvCreateVideoData = ((VEPreviewParams) interfaceC574340Mfo).mvCreateVideoData) != null) {
                            this.LJJIJIIJIL = mvCreateVideoData.musicIds;
                        }
                        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_import_media_remove_crop", true, false)) {
                            LJIJ().Se();
                        }
                        return 0;
                    }
                };
            case 3:
                return new AbstractC1452680nuE(c1441900ncq) { // from class: X.0Mfn
                    @Override // X.AbstractC1452680nuE
                    public final boolean LJIIJJI(VEPreviewMusicParams vEPreviewMusicParams, List<? extends VEPreviewMusicParams> list) {
                        return false;
                    }

                    {
                        C823050WQl.LJ();
                    }

                    @Override // X.AbstractC1452680nuE
                    public final NLEEditor LJII(VEPreviewParams vEPreviewParams) {
                        MvCreateVideoData mvCreateVideoData;
                        String str;
                        int iSwigValue;
                        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                        NLEModel model = nLEEditorLIZ.getModel();
                        if (model == null || (mvCreateVideoData = vEPreviewParams.mvCreateVideoData) == null) {
                            return nLEEditorLIZ;
                        }
                        ArrayList<String> arrayList = mvCreateVideoData.selectMediaList;
                        int i2 = 0;
                        if (arrayList != null && !arrayList.isEmpty() && (str = mvCreateVideoData.mvResUnzipPath) != null && str.length() != 0) {
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                            Iterator<String> it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                it2.next();
                                arrayList2.add("img");
                            }
                            C20684815ws.LJIILLIIL("use_old_mv", C2097608Jq.LJ());
                            NLETrackMV nLETrackMV = new NLETrackMV();
                            nLETrackMV.setMainTrack(true);
                            NLEResourceNode nLEResourceNode = new NLEResourceNode();
                            nLEResourceNode.setResourceFile(mvCreateVideoData.mvResUnzipPath);
                            nLETrackMV.setMV(nLEResourceNode);
                            if (mvCreateVideoData.resRatio == 1) {
                                iSwigValue = NLESegmentMVResolution.RES_1080P.swigValue();
                            } else {
                                iSwigValue = NLESegmentMVResolution.RES_720P.swigValue();
                            }
                            nLETrackMV.setMVResolution(iSwigValue);
                            for (String str2 : arrayList) {
                                int i3 = i2 + 1;
                                if (i2 >= 0) {
                                    NLETrackSlot nLETrackSlot = new NLETrackSlot();
                                    NLESegmentMV nLESegmentMV = new NLESegmentMV();
                                    NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
                                    nLEResourceNode2.setResourceFile(str2);
                                    nLESegmentMV.setSourceFile(nLEResourceNode2);
                                    if (i2 < arrayList2.size()) {
                                        nLESegmentMV.setSourceFileType((String) ListProtector.get(arrayList2, i2));
                                    }
                                    nLETrackSlot.setMainSegment(nLESegmentMV);
                                    nLETrackMV.addSlot(nLETrackSlot);
                                    i2 = i3;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            model.addTrack(nLETrackMV);
                            C347660Dk4 c347660Dk4 = new C347660Dk4();
                            c347660Dk4.LJJIFFI = EnumC356060Dxc.MV_MUSIC;
                            c347660Dk4.LIZIZ = "";
                            c347660Dk4.LJIIIZ = 1.0f;
                            new C347750DkD(c347660Dk4).LIZJ(nLEEditorLIZ);
                        }
                        return nLEEditorLIZ;
                    }

                    @Override // X.AbstractC1452680nuE
                    public final void LJIIL(VEVolumeChangeOp vEVolumeChangeOp) {
                        InterfaceC391070FUz interfaceC391070FUzLJFF;
                        C347660Dk4 c347660Dk4LJJJJ;
                        InterfaceC391070FUz interfaceC391070FUzLJFF2;
                        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(LJIJ());
                        if (c348100DkmLIZIZ != null && (interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF()) != null && (c347660Dk4LJJJJ = interfaceC391070FUzLJFF.LJJJJ()) != null) {
                            c347660Dk4LJJJJ.LJIIIZ = vEVolumeChangeOp.mVolume;
                            C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(LJIJ());
                            if (c348100DkmLIZIZ2 != null && (interfaceC391070FUzLJFF2 = c348100DkmLIZIZ2.LJFF()) != null) {
                                interfaceC391070FUzLJFF2.LJJJJLL(c347660Dk4LJJJJ);
                            }
                        }
                    }

                    @Override // X.AbstractC1452680nuE
                    public final void LJIILL(C1450120nq6 c1450120nq6) {
                        InterfaceC391070FUz interfaceC391070FUzLJFF;
                        C347660Dk4 c347660Dk4LJJJJ;
                        InterfaceC391070FUz interfaceC391070FUzLJFF2;
                        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(LJIJ());
                        if (c348100DkmLIZIZ != null && (interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF()) != null && (c347660Dk4LJJJJ = interfaceC391070FUzLJFF.LJJJJ()) != null) {
                            int i2 = c1450120nq6.LIZ;
                            long j = i2;
                            c347660Dk4LJJJJ.LJFF = j;
                            int i3 = c1450120nq6.LIZIZ;
                            c347660Dk4LJJJJ.LJI = i2 + i3;
                            c347660Dk4LJJJJ.LIZLLL = j;
                            c347660Dk4LJJJJ.LJ = (long) (i2 + (i3 * c347660Dk4LJJJJ.LJIIJJI));
                            c347660Dk4LJJJJ.LJIJJLI = c1450120nq6.LIZJ;
                            C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(LJIJ());
                            if (c348100DkmLIZIZ2 != null && (interfaceC391070FUzLJFF2 = c348100DkmLIZIZ2.LJFF()) != null) {
                                interfaceC391070FUzLJFF2.LJJJJLL(c347660Dk4LJJJJ);
                            }
                        }
                    }

                    @Override // X.AbstractC1452680nuE
                    public final int LJJII(Context context, InterfaceC574340Mfo interfaceC574340Mfo, SurfaceView surfaceView, LifecycleOwner lifecycleOwner) {
                        super.LJJII(context, interfaceC574340Mfo, surfaceView, lifecycleOwner);
                        return 0;
                    }
                };
            case 4:
                return new C574170MfX(c1441900ncq) { // from class: X.0MfV
                    public boolean LJJIJIL;

                    {
                        C823050WQl.LJ();
                        this.LJJIJIL = true;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.0DlF] */
                    @Override // X.C574170MfX, X.AbstractC1452680nuE
                    public final NLEEditor LJII(VEPreviewParams vEPreviewParams) {
                        NLETrack next;
                        long jLongValue;
                        NLEEditor nLEEditorLIZ = C349920Dni.LIZ();
                        if (nLEEditorLIZ.getModel() == null) {
                            return nLEEditorLIZ;
                        }
                        C259800zU c259800zU = new C259800zU();
                        c259800zU.element = new C348390DlF();
                        C391360FWc.LIZJ(this, new AwS137S0400000_8(c259800zU, (C259800zU<C348390DlF>) this, (C574170MfX) nLEEditorLIZ, (NLEEditor) vEPreviewParams, (InterfaceC574340Mfo) 6));
                        C348390DlF c348390DlF = (C348390DlF) c259800zU.element;
                        if ((vEPreviewParams instanceof VEPreviewParams) && vEPreviewParams.isVideoImageMixFastImport) {
                            String[] videoPaths = vEPreviewParams.getVideoPaths();
                            int[] vTrimIn = vEPreviewParams.getVTrimIn();
                            int[] vTrimOut = vEPreviewParams.getVTrimOut();
                            if (videoPaths.length == vTrimIn.length && videoPaths.length == vTrimOut.length && !C580130Mp9.LIZ(c348390DlF.LIZ) && !c348390DlF.LIZ.isEmpty()) {
                                for (C574140MfU c574140MfU : c348390DlF.LIZ) {
                                    C533730KwV c533730KwV = C533730KwV.LIZ;
                                    String str = c574140MfU.LJIILIIL;
                                    c533730KwV.getClass();
                                    if (!C533730KwV.LJIIJ(str)) {
                                        int i2 = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN;
                                        for (C574140MfU c574140MfU2 : c348390DlF.LIZ) {
                                            if (c574140MfU2.LJII == NLEResType.IMAGE) {
                                                VEImageTransformFilterParam vEImageTransformFilterParamLIZ = C574230Mfd.LIZ(i2);
                                                if (vEImageTransformFilterParamLIZ != null) {
                                                    C346700DiW c346700DiW = new C346700DiW();
                                                    c346700DiW.LIZIZ = vEImageTransformFilterParamLIZ.beginScale;
                                                    c346700DiW.LIZJ = vEImageTransformFilterParamLIZ.endScale;
                                                    Long l = c574140MfU2.LJIIL;
                                                    if (l != null) {
                                                        jLongValue = l.longValue();
                                                    } else {
                                                        jLongValue = 0;
                                                    }
                                                    c346700DiW.LIZ = jLongValue;
                                                    c574140MfU2.LJIILL = c346700DiW;
                                                }
                                            } else {
                                                int i3 = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT;
                                                if (i2 == i3) {
                                                    i2 = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN;
                                                } else {
                                                    i2 = i3;
                                                }
                                            }
                                        }
                                        Iterator<NLETrack> it2 = nLEEditorLIZ.getModel().getTracks().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                next = it2.next();
                                                if (next.getMainTrack()) {
                                                    break;
                                                }
                                            } else {
                                                next = null;
                                                break;
                                            }
                                        }
                                        NLETrack nLETrack = next;
                                        if (nLETrack != null) {
                                            new C346690DiV(c348390DlF).LJII(nLETrack);
                                            return nLEEditorLIZ;
                                        }
                                    }
                                }
                            }
                            return nLEEditorLIZ;
                        }
                        return nLEEditorLIZ;
                    }

                    @Override // X.AbstractC1452680nuE
                    public final boolean LJIIJJI(VEPreviewMusicParams vEPreviewMusicParams, List<? extends VEPreviewMusicParams> list) {
                        if (vEPreviewMusicParams.isFastImport && this.LJJIJIL) {
                            this.LJJIJIL = false;
                            super.LJIIJJI(vEPreviewMusicParams, list);
                        }
                        return false;
                    }
                };
            case 5:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case 15:
            default:
                C823050WQl.LJ();
                return new C574220Mfc(c1441900ncq);
            case 6:
                return new C574360Mfq(c1441900ncq);
            case 7:
                return new AbstractC1452680nuE(c1441900ncq) { // from class: X.0MfQ
                    {
                        C823050WQl.LJ();
                    }

                    @Override // X.AbstractC1452680nuE
                    public final NLEEditor LJII(VEPreviewParams vEPreviewParams) {
                        String[] audioPaths;
                        String str;
                        boolean z;
                        float f;
                        String str2;
                        boolean z2;
                        float f2;
                        float musicVolume;
                        List<VEUtils.VEAudioFileInfo> audioFileInfoForAllTracks;
                        List<VEUtils.VEAudioFileInfo> audioFileInfoForAllTracks2;
                        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                        if (vEPreviewParams.getVideoPaths().length >= 2 && (audioPaths = vEPreviewParams.getAudioPaths()) != null && audioPaths.length >= 2) {
                            long duration = 0;
                            for (String str3 : vEPreviewParams.mVideoPaths) {
                                duration += C571500MbE.LJIIJ(str3).getDuration();
                            }
                            long j = (int) duration;
                            long duration2 = vEPreviewParams.stitchParams.getDuration();
                            NLETrackSlot nLETrackSlot = new NLETrackSlot();
                            nLETrackSlot.setExtra("VideoSlotType", "STITCHED");
                            NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                            String[] audioPaths2 = vEPreviewParams.getAudioPaths();
                            if (audioPaths2 != null) {
                                str = audioPaths2[0];
                            } else {
                                str = null;
                            }
                            if (!C570490MZb.LJ(str) && ((audioFileInfoForAllTracks2 = VEUtils.getAudioFileInfoForAllTracks(vEPreviewParams.getVideoPaths()[0])) == null || audioFileInfoForAllTracks2.isEmpty())) {
                                z = false;
                            } else {
                                z = true;
                            }
                            NLEResourceAV nLEResourceAV = new NLEResourceAV();
                            NLEResType nLEResType = NLEResType.VIDEO;
                            nLEResourceAV.setResourceType(nLEResType);
                            nLEResourceAV.setResourceFile(vEPreviewParams.getVideoPaths()[0]);
                            nLEResourceAV.setHasAudio(z);
                            nLESegmentVideo.setAVFile(nLEResourceAV);
                            nLESegmentVideo.setTimeClipStart(0L);
                            long j2 = duration2 * 1000;
                            nLESegmentVideo.setTimeClipEnd(j2);
                            float f3 = 0.0f;
                            if (z) {
                                f = 1.0f;
                            } else {
                                f = 0.0f;
                            }
                            nLESegmentVideo.setVolume(f);
                            nLETrackSlot.setMainSegment(nLESegmentVideo);
                            nLETrackSlot.setStartTime(0L);
                            nLETrackSlot.setEndTime(j2);
                            NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
                            nLETrackSlot2.setExtra("VideoSlotType", "SHOOT");
                            String[] audioPaths3 = vEPreviewParams.getAudioPaths();
                            if (audioPaths3 != null) {
                                str2 = audioPaths3[1];
                            } else {
                                str2 = null;
                            }
                            if (!C570490MZb.LJ(str2) && ((audioFileInfoForAllTracks = VEUtils.getAudioFileInfoForAllTracks(vEPreviewParams.getVideoPaths()[1])) == null || audioFileInfoForAllTracks.isEmpty())) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            NLESegmentVideo nLESegmentVideo2 = new NLESegmentVideo();
                            nLETrackSlot2.setStartTime(j2);
                            nLETrackSlot2.setEndTime(1000 * j);
                            NLEResourceAV nLEResourceAV2 = new NLEResourceAV();
                            nLEResourceAV2.setResourceType(nLEResType);
                            nLEResourceAV2.setResourceFile(vEPreviewParams.getVideoPaths()[1]);
                            nLEResourceAV2.setDuration(nLETrackSlot2.getEndTime() - nLETrackSlot2.getStartTime());
                            nLEResourceAV2.setHasAudio(z2);
                            nLESegmentVideo2.setAVFile(nLEResourceAV2);
                            nLESegmentVideo2.setTimeClipStart(0L);
                            nLESegmentVideo2.setTimeClipEnd(nLETrackSlot2.getEndTime() - nLETrackSlot2.getStartTime());
                            if (z2) {
                                f3 = 1.0f;
                            }
                            nLESegmentVideo2.setVolume(f3);
                            nLETrackSlot2.setMainSegment(nLESegmentVideo2);
                            nLETrackSlot2.setExtra("has_origin_audio_slot", String.valueOf(z2));
                            NLETrack nLETrack = new NLETrack();
                            nLETrack.setMainTrack(true);
                            nLETrack.setExtra("__DEFAULT__", "__DEFAULT__");
                            nLETrack.addSlot(nLETrackSlot);
                            nLETrack.addSlot(nLETrackSlot2);
                            if (vEPreviewParams.stitchParams != null && (vEPreviewParams.mPageType != 1 || vEPreviewParams.mIsFromDraft)) {
                                f2 = vEPreviewParams.mVolume;
                                musicVolume = vEPreviewParams.getMusicVolume();
                            } else {
                                f2 = 1.0f;
                                musicVolume = 1.0f;
                            }
                            C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.ORIGIN);
                            c347650Dk3.LIZIZ = vEPreviewParams.getAudioPaths()[1];
                            c347650Dk3.LJIIIZ = f2;
                            c347650Dk3.LJFF = duration2;
                            c347650Dk3.LJI = j;
                            c347650Dk3.LIZLLL = 0L;
                            c347650Dk3.LJ = j - duration2;
                            StitchParams stitchParams = vEPreviewParams.stitchParams;
                            if (stitchParams.isPGCMusic() && C2354709Kn.LIZIZ(stitchParams.getMusicPath()) && stitchParams.getMusicStart() >= 0) {
                                if (!stitchParams.isMuted()) {
                                    new C347720DkA(c347650Dk3, false).LIZJ(nLEEditorLIZ);
                                }
                                C347650Dk3 c347650Dk32 = new C347650Dk3(EnumC355960DxS.BGM);
                                c347650Dk32.LIZIZ = stitchParams.getMusicPath();
                                c347650Dk32.LJIIIZ = musicVolume;
                                c347650Dk32.LJFF = 0L;
                                c347650Dk32.LJI = -2L;
                                c347650Dk32.LIZLLL = stitchParams.getMusicStart();
                                c347650Dk32.LJ = ((long) stitchParams.getMusicStart()) + j;
                                new C347720DkA(c347650Dk32, false).LIZJ(nLEEditorLIZ);
                            } else {
                                if (stitchParams.getEnableMic()) {
                                    new C347720DkA(c347650Dk3, false).LIZJ(nLEEditorLIZ);
                                }
                                C347650Dk3 c347650Dk33 = new C347650Dk3(EnumC355960DxS.BGM);
                                c347650Dk33.LIZIZ = vEPreviewParams.getAudioPaths()[0];
                                c347650Dk33.LJIIIZ = musicVolume;
                                c347650Dk33.LJFF = 0L;
                                c347650Dk33.LJI = duration2;
                                c347650Dk33.LIZLLL = 0L;
                                c347650Dk33.LJ = duration2;
                                new C347720DkA(c347650Dk33, false).LIZJ(nLEEditorLIZ);
                            }
                            nLEEditorLIZ.getModel().addTrack(nLETrack);
                            return nLEEditorLIZ;
                        }
                        return nLEEditorLIZ;
                    }
                };
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return new AbstractC1452680nuE(c1441900ncq) { // from class: X.0MbH
                    {
                        C823050WQl.LJ();
                    }

                    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
                    /* JADX WARN: Removed duplicated region for block: B:64:0x016b  */
                    @Override // X.AbstractC1452680nuE
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final com.bytedance.ies.nle.editor_jni.NLEEditor LJII(dmt.av.video.VEPreviewParams r18) {
                        /*
                            Method dump skipped, instruction units count: 557
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C571530MbH.LJII(dmt.av.video.VEPreviewParams):com.bytedance.ies.nle.editor_jni.NLEEditor");
                    }

                    public static void LJJIJIIJIL(VEPreviewParams vEPreviewParams, NLEEditor nLEEditor) {
                        NLEStyCanvas nLEStyCanvas;
                        NLETrack mainTrack;
                        VecNLETrackSlotSPtr sortedSlots;
                        NLETrackSlot nLETrackSlot;
                        NLESegment mainSegment;
                        NLESegmentVideo nLESegmentVideoDynamicCast;
                        CanvasBackground canvasBackground;
                        CanvasVideoData canvasVideoData = vEPreviewParams.canvasVideoPreviewData;
                        if (canvasVideoData != null && canvasVideoData.background != null) {
                            if (canvasVideoData != null && (canvasBackground = canvasVideoData.background) != null) {
                                nLEStyCanvas = new NLEStyCanvas();
                                C1450410nqZ.LIZ(nLEStyCanvas, canvasBackground);
                            } else {
                                return;
                            }
                        } else {
                            Integer num = vEPreviewParams.storyCanvasBgColorStart;
                            if (num != null && vEPreviewParams.storyCanvasBgColorEnd != null) {
                                int iIntValue = num.intValue();
                                Integer num2 = vEPreviewParams.storyCanvasBgColorEnd;
                                if (num2 != null) {
                                    int iIntValue2 = num2.intValue();
                                    nLEStyCanvas = new NLEStyCanvas();
                                    nLEStyCanvas.setType(NLECanvasType.GRADIENT_COLOR);
                                    nLEStyCanvas.setStartColor(iIntValue);
                                    nLEStyCanvas.setEndColor(iIntValue2);
                                    nLEStyCanvas.setAntialiasing(true);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        NLEModel model = nLEEditor.getModel();
                        if (model != null && (mainTrack = model.getMainTrack()) != null && (sortedSlots = mainTrack.getSortedSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, sortedSlots)) != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment)) != null) {
                            nLESegmentVideoDynamicCast.setCanvasStyle(nLEStyCanvas);
                        }
                    }

                    @Override // X.AbstractC1452680nuE
                    public final int LJJII(Context context, InterfaceC574340Mfo interfaceC574340Mfo, SurfaceView surfaceView, LifecycleOwner lifecycleOwner) {
                        interfaceC574340Mfo.setLoadMixImageOptimizeByVEUserConfig(true);
                        super.LJJII(context, interfaceC574340Mfo, surfaceView, lifecycleOwner);
                        for (String str : interfaceC574340Mfo.getVideoPaths()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("VEVideoEditorCutVideoImpl -> initVEEditor -> IVEPreviewParams: videoPath = ");
                            sbLIZ2.append(str);
                            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        VEPreviewParams vEPreviewParams = (VEPreviewParams) interfaceC574340Mfo;
                        LJIJ().setHeightWidthRatio(vEPreviewParams.mCanvasHeight / vEPreviewParams.mCanvasWidth);
                        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_import_media_remove_crop", true, false)) {
                            LJIJ().Se();
                        }
                        if (this.LJIIZILJ == 1) {
                            LJIJ().setReuseFirstAVFileInfo(false);
                            return 0;
                        }
                        LJIJ().setReuseFirstAVFileInfo(true);
                        return 0;
                    }
                };
            case BdTuring.TYPE_EMAIL /* 11 */:
                return new AbstractC1452680nuE(c1441900ncq) { // from class: X.0nqW
                    public static final /* synthetic */ int LJJIJIL = 0;
                    public float LJJIJIIJIL;

                    {
                        C823050WQl.LJ();
                        this.LJJIJIIJIL = 1.0f;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:162:0x0336  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x00ff  */
                    @Override // X.AbstractC1452680nuE
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final com.bytedance.ies.nle.editor_jni.NLEEditor LJII(dmt.av.video.VEPreviewParams r26) {
                        /*
                            Method dump skipped, instruction units count: 979
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1450380nqW.LJII(dmt.av.video.VEPreviewParams):com.bytedance.ies.nle.editor_jni.NLEEditor");
                    }

                    @Override // X.AbstractC1452680nuE
                    public final int LJJII(Context context, InterfaceC574340Mfo interfaceC574340Mfo, SurfaceView surfaceView, LifecycleOwner lifecycleOwner) {
                        if (interfaceC574340Mfo instanceof VEPreviewParams) {
                            VEPreviewParams vEPreviewParams = (VEPreviewParams) interfaceC574340Mfo;
                            if (vEPreviewParams.singleImageCoverBitmapData != null) {
                                vEPreviewParams.setLoadImageOptimizeByVEUserConfig(true);
                            }
                        }
                        super.LJJII(context, interfaceC574340Mfo, surfaceView, lifecycleOwner);
                        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_import_media_remove_crop", true, false)) {
                            LJIJ().Se();
                        }
                        return 0;
                    }
                };
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return new C539020LCa(c1441900ncq);
            case 14:
                return new AbstractC1452680nuE(c1441900ncq) { // from class: X.0LCd
                    public NLEEditor LJJIJIIJIL;

                    {
                        C823050WQl.LJ();
                    }

                    @Override // X.AbstractC1452680nuE
                    public final NLEEditor LJII(VEPreviewParams vEPreviewParams) {
                        String str;
                        NLEEditor nLEEditor;
                        this.LJJIJIIJIL = C349920Dni.LIZ();
                        String str2 = null;
                        if ((vEPreviewParams instanceof VEPreviewParams) && vEPreviewParams != null && (str = vEPreviewParams.nleData) != null && str.length() != 0 && (nLEEditor = this.LJJIJIIJIL) != null) {
                            if (vEPreviewParams != null) {
                                str2 = vEPreviewParams.nleData;
                            }
                            nLEEditor.restore(str2);
                        }
                        NLEEditor nLEEditor2 = this.LJJIJIIJIL;
                        if (nLEEditor2 == null) {
                            return new NLEEditor();
                        }
                        return nLEEditor2;
                    }
                };
            case 16:
                return new AbstractC1452680nuE(c1441900ncq) { // from class: X.0MfP
                    @Override // X.AbstractC1452680nuE
                    public final boolean LJIIJJI(VEPreviewMusicParams vEPreviewMusicParams, List<? extends VEPreviewMusicParams> list) {
                        return false;
                    }

                    {
                        C823050WQl.LJ();
                    }

                    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0 A[PHI: r1
                      0x00c0: PHI (r1v8 java.lang.Integer) = (r1v4 java.lang.Integer), (r1v6 java.lang.Integer), (r1v9 java.lang.Integer) binds: [B:58:0x0152, B:48:0x012e, B:32:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
                    /* JADX WARN: Removed duplicated region for block: B:45:0x011c  */
                    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
                    @Override // X.AbstractC1452680nuE
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final com.bytedance.ies.nle.editor_jni.NLEEditor LJII(dmt.av.video.VEPreviewParams r18) {
                        /*
                            Method dump skipped, instruction units count: 480
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C574090MfP.LJII(dmt.av.video.VEPreviewParams):com.bytedance.ies.nle.editor_jni.NLEEditor");
                    }
                };
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return new AbstractC1452680nuE(c1441900ncq) { // from class: X.0MUh
                    @Override // X.AbstractC1452680nuE
                    public final boolean LJIIJJI(VEPreviewMusicParams vEPreviewMusicParams, List<? extends VEPreviewMusicParams> list) {
                        return false;
                    }

                    {
                        C823050WQl.LJ();
                    }

                    public static long LJJIJIL(SingleImageData singleImageData) {
                        LivePhotoPreviewMode livePhotoPreviewMode;
                        int duration;
                        SrcLiveVideoInfo srcLiveInfo = singleImageData.getSrcLiveInfo();
                        if (srcLiveInfo != null) {
                            livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode();
                        } else {
                            livePhotoPreviewMode = null;
                        }
                        if (livePhotoPreviewMode == LivePhotoPreviewMode.STATIC) {
                            return 2000L;
                        }
                        SrcLiveVideoInfo srcLiveInfo2 = singleImageData.getSrcLiveInfo();
                        if (srcLiveInfo2 != null) {
                            duration = srcLiveInfo2.getDuration();
                        } else {
                            duration = 2000;
                        }
                        return duration;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9 A[PHI: r0
                      0x00b9: PHI (r0v62 int) = (r0v61 int), (r0v71 int) binds: [B:33:0x007b, B:35:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.AbstractC1452680nuE
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final com.bytedance.ies.nle.editor_jni.NLEEditor LJII(dmt.av.video.VEPreviewParams r20) {
                        /*
                            Method dump skipped, instruction units count: 558
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C569250MUh.LJII(dmt.av.video.VEPreviewParams):com.bytedance.ies.nle.editor_jni.NLEEditor");
                    }

                    public static NLESegmentVideo LJJIJIIJIL(SingleImageData singleImageData, long j) {
                        LivePhotoPreviewMode livePhotoPreviewMode;
                        ImageSynthesisResult liveVideo;
                        SrcLiveVideoInfo srcLiveInfo = singleImageData.getSrcLiveInfo();
                        if (srcLiveInfo == null || (livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode()) == null) {
                            livePhotoPreviewMode = LivePhotoPreviewMode.STATIC;
                        }
                        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                        NLEResourceAV nLEResourceAV = new NLEResourceAV();
                        String path = null;
                        if (livePhotoPreviewMode == LivePhotoPreviewMode.STATIC) {
                            nLEResourceAV.setResourceType(NLEResType.IMAGE);
                            ImageSynthesisResult synthesisData = singleImageData.getSynthesisData();
                            if (synthesisData != null) {
                                path = synthesisData.getPath();
                            }
                            nLEResourceAV.setResourceFile(path);
                        } else {
                            nLEResourceAV.setResourceType(NLEResType.VIDEO);
                            ImageSynthesisResult synthesisData2 = singleImageData.getSynthesisData();
                            if (synthesisData2 != null && (liveVideo = synthesisData2.getLiveVideo()) != null) {
                                path = liveVideo.getPath();
                            }
                            nLEResourceAV.setResourceFile(path);
                        }
                        nLESegmentVideo.setAVFile(nLEResourceAV);
                        nLESegmentVideo.setTimeClipStart(0L);
                        nLESegmentVideo.setTimeClipEnd(j);
                        nLESegmentVideo.setVolume(0.0f);
                        return nLESegmentVideo;
                    }
                };
        }
    }
}
