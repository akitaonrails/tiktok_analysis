package X;

import Y.AComparatorS24S0000000_5;
import android.content.Context;
import android.text.TextUtils;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.ies.nle.editor_jni.INLEListenerCompile;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEAutoFillAlgType;
import com.bytedance.ies.nle.editor_jni.NLEAutoFillFrame;
import com.bytedance.ies.nle.editor_jni.NLECurveActionBeam;
import com.bytedance.ies.nle.editor_jni.NLECurveSpeedType;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPoint;
import com.bytedance.ies.nle.editor_jni.NLEResTag;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentAutoFillFrame;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoCompileEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLE_COMPILE_TYPE;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.ies.nle.editor_jni.VecNLEPointSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic.ClientToEffectMessage;
import com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic.EffectToClientMessage;
import com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic.SlowMotionCacheModel;
import com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic.SpeedSegment;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS154S1100000_5;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS29S0100001_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DuY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354160DuY extends AbstractC354420Duy implements InterfaceC354500Dv6, InterfaceC497601wk {
    public final NLEEditor LL;
    public final INLEPlayer LLILLJJLI;
    public final C0E48 LLILLL;
    public final Context LLILZ;
    public NLETrackSlot LLILZIL;
    public NLETrackSlot LLILZLL;
    public NLETrackSlot LLIZLLLIL;
    public PthreadTimer LLJI;
    public C354540DvA LLJIJIL;
    public InterfaceC354020DuK LLJILJILJ;
    public int LLJILLL;
    public ClientToEffectMessage LLJJ;
    public NLEVideoEffect LLJJI;
    public boolean LLJJIII;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(111));
    public final HashMap<Integer, List<SpeedSegment>> LLJ = new HashMap<>();
    public String LLJILJIL = "";
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(112));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(110));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(109));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 353));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 354));
    public final C353980DuG LLJJJJ = new MessageCenter.Listener() { // from class: X.0DuG
        @Override // com.bef.effectsdk.message.MessageCenter.Listener
        public final void onMessageReceived(int i, int i2, int i3, String str) {
            EffectToClientMessage effectToClientMessage;
            NLEAutoFillAlgType nLEAutoFillAlgType;
            if (i == 41 && i2 == 0 && i3 == 0 && C123100dR.LIZ(str)) {
                try {
                    effectToClientMessage = (EffectToClientMessage) C08JS.LIZ(str, EffectToClientMessage.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    effectToClientMessage = null;
                }
                if (effectToClientMessage != null) {
                    if (effectToClientMessage.getErrorCode() == 1) {
                        List<SpeedSegment> segments = effectToClientMessage.getSegments();
                        if (segments != null) {
                            this.LL.LLJ.put(Integer.valueOf(effectToClientMessage.getMessageId()), segments);
                        }
                        if (this.LL.LLJ.size() == effectToClientMessage.getMessageTotal()) {
                            this.LL.LJIIIZ();
                            SortedMap sortedMapLIZLLL = C2097908Jt.LIZLLL(new AComparatorS24S0000000_5(26), this.LL.LLJ);
                            ArrayList arrayList = new ArrayList();
                            Iterator it2 = ((TreeMap) sortedMapLIZLLL).entrySet().iterator();
                            while (it2.hasNext()) {
                                arrayList.addAll((Collection) ((Map.Entry) it2.next()).getValue());
                            }
                            List<SpeedSegment> listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(27), arrayList);
                            if (listLJLLLL.size() == 1 && ((SpeedSegment) ListProtector.get(listLJLLLL, 0)).speed == 1.0f) {
                                this.LL.LL.commit();
                                INLEPlayer iNLEPlayer = this.LL.LLILLJJLI;
                                if (iNLEPlayer != null) {
                                    iNLEPlayer.stop();
                                }
                                this.LL.LJIIIZ();
                                InterfaceC354020DuK interfaceC354020DuK = this.LL.LLJILJILJ;
                                if (interfaceC354020DuK != null) {
                                    interfaceC354020DuK.LIZ(new C354570DvD(true, null, null, 6));
                                    return;
                                }
                                return;
                            }
                            C354160DuY c354160DuY = this.LL;
                            NLETrackSlot nLETrackSlotDynamicCast = c354160DuY.LLILZLL;
                            C284570BDj.LIZ.getClass();
                            if (!((Boolean) C284570BDj.LIZIZ.getValue()).booleanValue() || nLETrackSlotDynamicCast == null) {
                                NLETrackSlot nLETrackSlot = c354160DuY.LLILZIL;
                                if (nLETrackSlot == null) {
                                    return;
                                } else {
                                    nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone(true));
                                }
                            }
                            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotDynamicCast.getMainSegment());
                            VecNLEPointSPtr vecNLEPointSPtr = new VecNLEPointSPtr();
                            for (SpeedSegment speedSegment : listLJLLLL) {
                                NLEPoint nLEPoint = new NLEPoint();
                                nLEPoint.setX((speedSegment.to - speedSegment.from) / C351220Dpo.LLLLLLL(nLETrackSlotDynamicCast.getDuration()));
                                nLEPoint.setY(speedSegment.speed);
                                vecNLEPointSPtr.add(nLEPoint);
                            }
                            nLESegmentVideoDynamicCast.setCurveSpeedPoints(vecNLEPointSPtr);
                            nLESegmentVideoDynamicCast.setCurveSpeedType(NLECurveSpeedType.ActionBeam);
                            NLECurveActionBeam nLECurveActionBeam = new NLECurveActionBeam();
                            nLECurveActionBeam.setCycleTime(nLETrackSlotDynamicCast.getDuration());
                            nLESegmentVideoDynamicCast.setCurveActionBeam(nLECurveActionBeam);
                            NLEAutoFillFrame nLEAutoFillFrame = new NLEAutoFillFrame();
                            NLESegmentAutoFillFrame nLESegmentAutoFillFrame = new NLESegmentAutoFillFrame();
                            C1455910nzR.LIZ.getClass();
                            Float fLIZ = C1455910nzR.LIZ();
                            if (fLIZ != null && fLIZ.floatValue() < 6.5f) {
                                nLEAutoFillAlgType = NLEAutoFillAlgType.COVE;
                            } else {
                                nLEAutoFillAlgType = NLEAutoFillAlgType.UMHighPerformance;
                            }
                            nLESegmentAutoFillFrame.setAutoFillAlgType(nLEAutoFillAlgType);
                            nLESegmentAutoFillFrame.setAlgScale(0.75f);
                            NLEResourceNode nLEResourceNode = new NLEResourceNode();
                            nLEResourceNode.setResourceType(NLEResType.AUTO_FILL_FRAME);
                            nLESegmentAutoFillFrame.setEffectSDKAutoFillFrame(nLEResourceNode);
                            nLEAutoFillFrame.setSegment(nLESegmentAutoFillFrame);
                            nLETrackSlotDynamicCast.setAutoFillFrame(nLEAutoFillFrame);
                            final C354160DuY c354160DuY2 = this.LL;
                            NLETrack mainTrack = c354160DuY2.LJII().getModel().getMainTrack();
                            if (mainTrack.getSlots().size() > 0) {
                                mainTrack.removeSlot(mainTrack.getSlots().get(0));
                            }
                            nLETrackSlotDynamicCast.setScale(1.0f);
                            nLETrackSlotDynamicCast.setRotation(0.0f);
                            nLETrackSlotDynamicCast.setTransformX(0.0f);
                            nLETrackSlotDynamicCast.setTransformY(0.0f);
                            nLETrackSlotDynamicCast.clearVideoAnim();
                            nLETrackSlotDynamicCast.clearVideoEffect();
                            NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotDynamicCast.getMainSegment());
                            nLESegmentVideoDynamicCast2.setCrop(null);
                            nLESegmentVideoDynamicCast2.setVolume(1.0f);
                            long endTime = (long) ((nLETrackSlotDynamicCast.getEndTime() - nLETrackSlotDynamicCast.getStartTime()) * nLESegmentVideoDynamicCast2.getSpeed());
                            nLESegmentVideoDynamicCast2.setSpeed(1.0f);
                            if (nLETrackSlotDynamicCast.hasExtra("is_editor_pro_split_used") && Boolean.parseBoolean(nLETrackSlotDynamicCast.getExtra("is_editor_pro_split_used"))) {
                                nLESegmentVideoDynamicCast2.setTimeClipEnd(nLESegmentVideoDynamicCast2.getTimeClipStart() + endTime);
                                nLETrackSlotDynamicCast.setEndTime(nLETrackSlotDynamicCast.getStartTime() + endTime);
                            } else {
                                nLETrackSlotDynamicCast.setEndTime(endTime);
                                nLETrackSlotDynamicCast.setStartTime(0L);
                                nLESegmentVideoDynamicCast2.setTimeClipStart(0L);
                                nLESegmentVideoDynamicCast2.setTimeClipEnd(endTime);
                            }
                            mainTrack.addSlot(nLETrackSlotDynamicCast);
                            c354160DuY2.LJII().addConsumer(c354160DuY2.LLJJJJJIL);
                            c354160DuY2.LJII().commit();
                            c354160DuY2.LJII().removeConsumer(c354160DuY2.LLJJJJJIL);
                            NLESegmentVideo nLESegmentVideoDynamicCast3 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotDynamicCast.getMainSegment());
                            long width = nLESegmentVideoDynamicCast3.getResource().getWidth();
                            long height = nLESegmentVideoDynamicCast3.getResource().getHeight();
                            NLEVideoEncodeSettings nLEVideoEncodeSettings = new NLEVideoEncodeSettings();
                            nLEVideoEncodeSettings.setCompileType(NLE_COMPILE_TYPE.COMPILE_TYPE_MP4);
                            nLEVideoEncodeSettings.setFps(30);
                            nLEVideoEncodeSettings.setOutputSize(new PairIntInt((int) width, (int) height));
                            nLEVideoEncodeSettings.setIsSupportHWEncoder(true);
                            NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings = new NLEVideoCompileEncodeSettings();
                            nLEVideoCompileEncodeSettings.setUseHWEncoder(true);
                            nLEVideoCompileEncodeSettings.setIsSupportHWEncoder(true);
                            nLEVideoEncodeSettings.setMVideoCompileEncodeSetting(nLEVideoCompileEncodeSettings);
                            EditModelProvider.Companion.getClass();
                            VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
                            if (editModel == null) {
                                return;
                            }
                            String strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), editModel.getCreativeInfo(), EnumC20228214Cy.MAGIC_PROCESSOR, null, false, 12);
                            C0VSJ c0vsj = new C0VSJ(strLIZLLL);
                            if (!c0vsj.exists()) {
                                c0vsj.mkdirs();
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZLLL);
                            sbLIZ.append(UUID.randomUUID());
                            sbLIZ.append(".mp4");
                            final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            System.currentTimeMillis();
                            ((C1463840oCE) ((C1463860oCG) c354160DuY2.LLJJJ.getValue()).getExporterApi()).compile(strLIZIZ, nLEVideoEncodeSettings, new INLEListenerCompile() { // from class: X.0DuJ
                                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                                public final void onCompileDone() {
                                    C354270Duj.LIZJ(0L, new AwS154S1100000_5(c354160DuY2, strLIZIZ, 3));
                                }

                                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                                public final void onCompileProgress(float f) {
                                    C354270Duj.LIZJ(0L, new AwS29S0100001_5(c354160DuY2, f, 1));
                                }

                                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                                public final void onCompileError(int i4, int i5, float f, String str2) {
                                    C354270Duj.LIZJ(0L, new AwS549S0100000_5(c354160DuY2, 348));
                                }
                            });
                            return;
                        }
                        return;
                    }
                    this.LL.LJIIIZ();
                    InterfaceC354020DuK interfaceC354020DuK2 = this.LL.LLJILJILJ;
                    if (interfaceC354020DuK2 != null) {
                        interfaceC354020DuK2.LIZ(new C354570DvD(false, EnumC355970DxT.SLOW_MOTION_EFFECT_MSG_STATUS_ERROR, null, 4));
                        return;
                    }
                    return;
                }
                this.LL.LJIIIZ();
                InterfaceC354020DuK interfaceC354020DuK3 = this.LL.LLJILJILJ;
                if (interfaceC354020DuK3 != null) {
                    interfaceC354020DuK3.LIZ(new C354570DvD(false, EnumC355970DxT.SLOW_MOTION_EFFECT_MSG_PARSE_ERROR, null, 4));
                }
            }
        }
    };
    public final C353990DuH LLJJJJJIL = new C354000DuI() { // from class: X.0DuH
        @Override // X.C354000DuI
        public final void LIZ() {
            ((C1463860oCG) this.LIZ.LLJJJ.getValue()).setDataSource(this.LIZ.LJII().getModel());
        }
    };

    @Override // X.InterfaceC354500Dv6
    public final void LIZ() {
        ((C1463840oCE) ((C1463860oCG) this.LLJJJ.getValue()).getExporterApi()).cancelCompile();
        LJIIIZ();
        this.LL.removeConsumer(this.LLJJJJJIL);
        this.LLJ.clear();
        this.LLJILJILJ = null;
        this.LLILZIL = null;
        this.LLJJ = null;
    }

    public final NLETrackSlot LJI() {
        NLETrack next;
        Iterator<NLETrack> it2 = C350870DpF.LJI(this.LLILLL).getTracks().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (C351220Dpo.LLILLL(next)) {
                break;
            }
        }
        NLETrack nLETrack = next;
        return (NLETrackSlot) (nLETrack != null ? C13LP.LJJJLL(nLETrack.getSlots()) : null);
    }

    public final NLEEditor LJII() {
        return (NLEEditor) this.LLJJIJIL.getValue();
    }

    public final void LJIIIZ() {
        PthreadTimer pthreadTimer = this.LLJI;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        this.LLJI = null;
        MessageCenter.removeListener(this.LLJJJJ);
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        C1DFH c1dfh = C0PEM.LIZ;
        return C2107308Nj.LIZ.plus(C2296908zH.LIZ());
    }

    public final Pair<Long, Long> LJIIIIZZ(NLETrackSlot nLETrackSlot) {
        long jLLLLLLL = C351220Dpo.LLLLLLL(nLETrackSlot.getDuration());
        NLETrackSlot nLETrackSlot2 = this.LLIZLLLIL;
        long jLLLLLLL2 = 0;
        if (nLETrackSlot2 == null) {
            return new Pair<>(0L, Long.valueOf(jLLLLLLL));
        }
        if (nLETrackSlot.getStartTime() < nLETrackSlot2.getStartTime()) {
            jLLLLLLL2 = C351220Dpo.LLLLLLL(nLETrackSlot2.getStartTime() - nLETrackSlot.getStartTime());
        }
        if (nLETrackSlot.getEndTime() > nLETrackSlot2.getEndTime()) {
            jLLLLLLL -= C351220Dpo.LLLLLLL(nLETrackSlot.getEndTime() - nLETrackSlot2.getEndTime());
        }
        return new Pair<>(Long.valueOf(jLLLLLLL2), Long.valueOf(jLLLLLLL));
    }

    @Override // X.AbstractC354420Duy
    public final void LIZLLL(C354540DvA c354540DvA, C354550DvB c354550DvB) {
        boolean z;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        NLEResourceNode resource;
        NLEResourceNode resource2;
        C354240Dug c354240Dug = c354540DvA.LIZIZ;
        NLETrackSlot nLETrackSlot = c354240Dug.LIZIZ;
        C354510Dv7 c354510Dv7 = c354240Dug.LIZ;
        String str = c354510Dv7.LIZIZ;
        String str2 = c354510Dv7.LIZJ;
        if (nLETrackSlot.hasExtra("slot_extra_has_applied_slow_motion") && Boolean.parseBoolean(nLETrackSlot.getExtra("slot_extra_has_applied_slow_motion"))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (nLESegmentVideoDynamicCast != null) {
                String extra = nLETrackSlot.getExtra("slot_extra_origin_resource_file");
                if (extra != null && (resource2 = nLESegmentVideoDynamicCast.getResource()) != null) {
                    resource2.setResourceFile(extra);
                }
                String extra2 = nLETrackSlot.getExtra("slot_extra_origin_duration");
                if (extra2 != null && (resource = nLESegmentVideoDynamicCast.getResource()) != null) {
                    resource.setDuration(CastLongProtector.parseLong(extra2));
                }
                String extra3 = nLETrackSlot.getExtra("slot_extra_origin_clip_start_time");
                if (extra3 != null) {
                    nLESegmentVideoDynamicCast.setTimeClipStart(CastLongProtector.parseLong(extra3));
                }
                String extra4 = nLETrackSlot.getExtra("slot_extra_origin_clip_end_time");
                if (extra4 != null) {
                    nLESegmentVideoDynamicCast.setTimeClipEnd(CastLongProtector.parseLong(extra4));
                }
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ep_magic_bugfix_reset_slot_reorder", true, true)) {
                    String extra5 = nLETrackSlot.getExtra("slot_extra_origin_start_time");
                    if (extra5 != null) {
                        lLJIILIIL = C2095008Iq.LJIILIIL(extra5);
                    } else {
                        lLJIILIIL = null;
                    }
                    String extra6 = nLETrackSlot.getExtra("slot_extra_origin_end_time");
                    if (extra6 != null) {
                        lLJIILIIL2 = C2095008Iq.LJIILIIL(extra6);
                    } else {
                        lLJIILIIL2 = null;
                    }
                    if (lLJIILIIL != null && lLJIILIIL2 != null) {
                        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + (lLJIILIIL2.longValue() - lLJIILIIL.longValue()));
                    }
                } else {
                    String extra7 = nLETrackSlot.getExtra("slot_extra_origin_start_time");
                    if (extra7 != null) {
                        nLETrackSlot.setStartTime(CastLongProtector.parseLong(extra7));
                    }
                    String extra8 = nLETrackSlot.getExtra("slot_extra_origin_end_time");
                    if (extra8 != null) {
                        nLETrackSlot.setEndTime(CastLongProtector.parseLong(extra8));
                    }
                }
            }
            C354260Dui.LIZ.getClass();
            C354260Dui.LJ(nLETrackSlot, str, str2);
            nLETrackSlot.removeExtraWithKey("ep_magic_category_id");
            nLETrackSlot.removeExtraWithKey("slot_extra_has_applied_slow_motion");
            nLETrackSlot.clearVideoEffect();
            INLEPlayer iNLEPlayer = this.LLILLJJLI;
            if (iNLEPlayer != null) {
                iNLEPlayer.skipNextSeek(true);
            }
            this.LL.commit();
            INLEPlayer iNLEPlayer2 = this.LLILLJJLI;
            if (iNLEPlayer2 != null) {
                iNLEPlayer2.skipNextSeek(false);
            }
            C350870DpF.LJIIIZ(this.LLILLL, "select_slot_event", new C358740E4q(nLETrackSlot, 0, null, false, 0, 254));
        }
        c354550DvB.LIZ(new C354570DvD(true, null, null, 6));
    }

    public final ClientToEffectMessage LJFF(NLETrackSlot nLETrackSlot, List<BeatInfo> list) {
        List<BeatInfo> list2 = list;
        Pair<Long, Long> pairLJIIIIZZ = LJIIIIZZ(nLETrackSlot);
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        return new ClientToEffectMessage(pairLJIIIIZZ.getFirst().longValue(), pairLJIIIIZZ.getSecond().longValue(), C351220Dpo.LLLLLLL(nLETrackSlot.getDuration()), list2);
    }

    @Override // X.AbstractC354420Duy
    public final void LIZJ(C354540DvA c354540DvA, C354550DvB c354550DvB, C354570DvD c354570DvD) throws JSONException {
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot nLETrackSlot;
        String strLIZIZ;
        String resourceFile;
        String string;
        CreativeModel creativeModel;
        CreativeInfo creativeInfo;
        String creationId;
        Map linkedHashMap;
        this.LLJIJIL = c354540DvA;
        this.LLJILJILJ = c354550DvB;
        this.LLILZIL = c354540DvA.LIZIZ.LIZIZ;
        this.LLJILLL = 0;
        NLETemplateModel nLETemplateModel = c354540DvA.LIZJ;
        if (nLETemplateModel != null && (mainTrack = nLETemplateModel.getMainTrack()) != null && (sortedSlots = mainTrack.getSortedSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(sortedSlots)) != null) {
            C354260Dui.LIZ.getClass();
            NLEVideoEffect nLEVideoEffectLJIIIZ = C354260Dui.LJIIIZ(nLETrackSlot);
            if (nLEVideoEffectLJIIIZ == null) {
                if (c354570DvD == null || (linkedHashMap = c354570DvD.LIZJ) == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                c354550DvB.LIZ(new C354570DvD(true, null, linkedHashMap, 2));
                return;
            }
            if (C350870DpF.LJ(this.LLILLL) == C350870DpF.LJII(this.LLILLL)) {
                this.LLILLL.getPlayer().LIZIZ(C350870DpF.LJ(this.LLILLL) - ((long) 100));
            }
            C354240Dug c354240Dug = c354540DvA.LIZIZ;
            String str = c354240Dug.LIZ.LIZJ;
            NLETrackSlot nLETrackSlot2 = c354240Dug.LIZIZ;
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment());
            String str2 = "";
            if (nLESegmentVideoDynamicCast == null) {
                strLIZIZ = "";
            } else {
                String extra = nLETrackSlot2.getExtra("slot_extra_origin_resource_file");
                if (!C123100dR.LIZ(extra)) {
                    extra = nLESegmentVideoDynamicCast.getResource().getResourceFile();
                }
                String strJ4 = C786410Ut5.j4("%s-%s-%s-%s", Arrays.copyOf(new Object[]{str, extra, Long.valueOf(C351220Dpo.LLLLLLL(nLESegmentVideoDynamicCast.getTimeClipStart())), Long.valueOf(C351220Dpo.LLLLLLL(nLESegmentVideoDynamicCast.getTimeClipEnd()))}, 4));
                NLETrackSlot nLETrackSlotLJI = LJI();
                if (nLETrackSlotLJI != null) {
                    String extra2 = nLETrackSlotLJI.getExtra("ep_audio_music_id");
                    NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlotLJI.getMainSegment());
                    if (nLESegmentAudioDynamicCast != null) {
                        extra2 = C786410Ut5.j4("%s-%s-%s", Arrays.copyOf(new Object[]{extra2, Long.valueOf(C351220Dpo.LLLLLLL(nLESegmentAudioDynamicCast.getTimeClipStart())), Long.valueOf(C351220Dpo.LLLLLLL(nLESegmentAudioDynamicCast.getTimeClipEnd()))}, 3));
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("audioKey = ");
                        sbLIZ.append(extra2);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    Pair<Long, Long> pairLJIIIIZZ = LJIIIIZZ(nLETrackSlot2);
                    strLIZIZ = C08F1.LIZIZ(C786410Ut5.j4("%s-%s-%s", Arrays.copyOf(new Object[]{strJ4, extra2, C786410Ut5.j4("%s-%s", Arrays.copyOf(new Object[]{pairLJIIIIZZ.getFirst(), pairLJIIIIZZ.getSecond()}, 2))}, 3)));
                } else {
                    strLIZIZ = C08F1.LIZIZ(strJ4);
                }
            }
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LLJJIJI.getValue();
            if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (creativeInfo = creativeModel.creativeInfo) != null && (creationId = creativeInfo.getCreationId()) != null) {
                str2 = creationId;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append(strLIZIZ);
            this.LLJILJIL = C2188811AlT.LIZIZ(sbLIZ2);
            SlowMotionCacheModel slowMotionCacheModelLIZIZ = ((InterfaceC354030DuL) this.LLIZ.getValue()).LIZIZ(this.LLJILJIL);
            if (slowMotionCacheModelLIZIZ != null) {
                this.LLJJIII = true;
                NLETrackSlot nLETrackSlot3 = c354540DvA.LIZIZ.LIZIZ;
                NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot3.getMainSegment());
                if (nLESegmentVideoDynamicCast2 != null) {
                    nLETrackSlot3.setExtra("slot_extra_has_applied_slow_motion", "true");
                    NLEResourceNode resource = nLESegmentVideoDynamicCast2.getResource();
                    if (resource != null) {
                        resourceFile = resource.getResourceFile();
                    } else {
                        resourceFile = null;
                    }
                    nLETrackSlot3.setExtra("slot_extra_origin_resource_file", resourceFile);
                    NLEResourceNode resource2 = nLESegmentVideoDynamicCast2.getResource();
                    if (resource2 != null) {
                        string = Long.valueOf(resource2.getDuration()).toString();
                    } else {
                        string = null;
                    }
                    nLETrackSlot3.setExtra("slot_extra_origin_duration", string);
                    nLETrackSlot3.setExtra("slot_extra_origin_start_time", String.valueOf(nLETrackSlot3.getStartTime()));
                    nLETrackSlot3.setExtra("slot_extra_origin_end_time", String.valueOf(nLETrackSlot3.getEndTime()));
                    nLETrackSlot3.setExtra("slot_extra_origin_clip_start_time", String.valueOf(nLESegmentVideoDynamicCast2.getTimeClipStart()));
                    nLETrackSlot3.setExtra("slot_extra_origin_clip_end_time", String.valueOf(nLESegmentVideoDynamicCast2.getTimeClipEnd()));
                    String str3 = slowMotionCacheModelLIZIZ.exportVideoPath;
                    NLEResourceNode resource3 = nLESegmentVideoDynamicCast2.getResource();
                    if (resource3 != null) {
                        resource3.setResourceFile(str3);
                    }
                    long jLIZLLL = C352310DrZ.LIZLLL(C20137613qo.LIZ.LIZLLL(str3).LJ);
                    NLEResourceNode resource4 = nLESegmentVideoDynamicCast2.getResource();
                    if (resource4 != null) {
                        resource4.setDuration(jLIZLLL);
                    }
                    nLESegmentVideoDynamicCast2.clearCurveSpeedPoint();
                    nLESegmentVideoDynamicCast2.clearSegCurveSpeedPoint();
                    nLESegmentVideoDynamicCast2.setCurveSpeedType(NLECurveSpeedType.Normal);
                    nLESegmentVideoDynamicCast2.setCurveActionBeam(null);
                    nLESegmentVideoDynamicCast2.setSpeed(1.0f);
                    nLESegmentVideoDynamicCast2.setAbsSpeed(1.0f);
                    nLESegmentVideoDynamicCast2.setTimeClipStart(0L);
                    nLESegmentVideoDynamicCast2.setTimeClipEnd(jLIZLLL);
                    nLETrackSlot3.setEndTime(nLETrackSlot3.getStartTime() + jLIZLLL);
                    LJIIJ(c354540DvA.LIZIZ, nLEVideoEffectLJIIIZ, slowMotionCacheModelLIZIZ.client2EffectMessage, C354260Dui.LJIILL(nLEVideoEffectLJIIIZ));
                    InterfaceC354020DuK interfaceC354020DuK = this.LLJILJILJ;
                    if (interfaceC354020DuK != null) {
                        interfaceC354020DuK.LIZ(new C354570DvD(true, null, null, 6));
                        return;
                    }
                    return;
                }
                return;
            }
            this.LLJJIII = false;
            if (C354260Dui.LJIILL(nLEVideoEffectLJIIIZ)) {
                NLETrackSlot nLETrackSlotLJI2 = LJI();
                if (nLETrackSlotLJI2 != null) {
                    this.LLIZLLLIL = nLETrackSlotLJI2;
                    NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlotLJI2.getMainSegment());
                    if (nLESegmentAudioDynamicCast2 == null) {
                        return;
                    }
                    InterfaceC355180DwC interfaceC355180DwC = (InterfaceC355180DwC) this.LLJJJIL.getValue();
                    if (interfaceC355180DwC != null) {
                        interfaceC355180DwC.LIZ(nLESegmentAudioDynamicCast2, AFwS191S0000000_5.get$arr$(106), AFwS191S0000000_5.get$arr$(107), new C354170DuZ(this, nLETrackSlotLJI2, c354540DvA, nLEVideoEffectLJIIIZ), EnumC355940DxQ.BEATS_ALG_MERGE_BEAT, null, null);
                        if (Unit.LIZ != null) {
                            return;
                        }
                    }
                }
                LJ(null, c354540DvA, C13BV.INSTANCE, nLEVideoEffectLJIIIZ, true);
                return;
            }
            LJ(null, c354540DvA, C13BV.INSTANCE, nLEVideoEffectLJIIIZ, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0DuG] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0DuH] */
    public C354160DuY(NLEEditor nLEEditor, INLEPlayer iNLEPlayer, C0E48 c0e48, Context context) {
        this.LL = nLEEditor;
        this.LLILLJJLI = iNLEPlayer;
        this.LLILLL = c0e48;
        this.LLILZ = context;
    }

    public final void LJIIJ(C354240Dug c354240Dug, NLEVideoEffect nLEVideoEffect, ClientToEffectMessage clientToEffectMessage, boolean z) throws JSONException {
        String resourceFile;
        NLETrackSlot nLETrackSlot = c354240Dug.LIZIZ;
        C354510Dv7 c354510Dv7 = c354240Dug.LIZ;
        String str = c354510Dv7.LIZIZ;
        String str2 = c354510Dv7.LIZJ;
        String str3 = c354510Dv7.LIZLLL;
        String str4 = c354510Dv7.LJII;
        String str5 = c354510Dv7.LIZ;
        String str6 = c354510Dv7.LJIIIIZZ;
        C354260Dui.LIZ.getClass();
        C354260Dui.LIZIZ(nLETrackSlot, str, str2, str5, str6);
        nLETrackSlot.setExtra("ep_magic_category_id", str4);
        nLEVideoEffect.setExtra("ep_magic_resource_id", str);
        nLEVideoEffect.setExtra("ep_client_magic_resource_path", str3);
        nLEVideoEffect.setExtra("is_from_ep_magic", "true");
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (BeatInfo beatInfo : clientToEffectMessage.beatsInfo) {
            jSONArray.put(beatInfo.timestampInMS);
            jSONArray2.put(beatInfo.value);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", C351220Dpo.LLLLLLL(nLETrackSlot.getDuration()));
        if (z) {
            jSONObject.put("music_start", clientToEffectMessage.musicStartTime);
            jSONObject.put("music_end", clientToEffectMessage.musicEndTime);
            jSONObject.put("offsets", jSONArray);
            jSONObject.put("beats", jSONArray2);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("editing_effect_slow_motion_key_frame", C786410Ut5.J3(jSONObject));
        this.LLJJ = clientToEffectMessage;
        NLEVideoEffect nLEVideoEffectDynamicCast = NLEVideoEffect.dynamicCast(nLEVideoEffect.deepClone(true));
        NLESegmentEffect nLESegmentEffectDynamicCast = NLESegmentEffect.dynamicCast(nLEVideoEffectDynamicCast.getSegment());
        if (nLESegmentEffectDynamicCast != null) {
            NLEResourceNode resource = nLESegmentEffectDynamicCast.getResource();
            if (resource != null && (resourceFile = resource.getResourceFile()) != null && !TextUtils.isEmpty(resourceFile)) {
                C0VSJ c0vsj = new C0VSJ(resourceFile);
                if (c0vsj.exists() && c0vsj.length() > 0) {
                    nLESegmentEffectDynamicCast.setJsonParam(C786410Ut5.J3(jSONObject2));
                    nLESegmentEffectDynamicCast.getEffectSDKEffect().setResourceTag(NLEResTag.AMAZING);
                }
            }
            InterfaceC354020DuK interfaceC354020DuK = this.LLJILJILJ;
            if (interfaceC354020DuK != null) {
                interfaceC354020DuK.LIZ(new C354570DvD(false, EnumC355970DxT.EFFECT_PATH_NOT_EXIST_ERROR, null, 4));
                return;
            }
            return;
        }
        C354270Duj.LIZ(0L, new AwS249S0300000_5(nLETrackSlot, nLEVideoEffectDynamicCast, this, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.0DuY] */
    public final void LJ(NLETrackSlot nLETrackSlot, C354540DvA c354540DvA, List<BeatInfo> list, NLEVideoEffect nLEVideoEffect, boolean z) throws JSONException {
        ?? arrayList;
        InterfaceC354020DuK interfaceC354020DuK = this.LLJILJILJ;
        if (interfaceC354020DuK != null) {
            interfaceC354020DuK.onProgress(5);
        }
        NLETrackSlot nLETrackSlot2 = c354540DvA.LIZIZ.LIZIZ;
        Object obj = null;
        if (nLETrackSlot != null && (!list.isEmpty())) {
            if (!list.isEmpty() && nLETrackSlot.getEndTime() > nLETrackSlot2.getStartTime() && nLETrackSlot.getStartTime() < nLETrackSlot2.getEndTime()) {
                ArrayList<BeatInfo> arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (BeatInfo beatInfo : list) {
                    arrayList2.add(new BeatInfo(((int) C351220Dpo.LLLLLLL(nLETrackSlot.getStartTime())) + beatInfo.timestampInMS, beatInfo.value, 0.0f, 2));
                }
                int iLLLLLLL = (int) C351220Dpo.LLLLLLL(nLETrackSlot2.getStartTime());
                if (nLETrackSlot.getStartTime() <= nLETrackSlot2.getStartTime()) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((BeatInfo) next).timestampInMS > iLLLLLLL) {
                            obj = next;
                            break;
                        }
                    }
                    int iIndexOf = arrayList2.indexOf(obj);
                    List<BeatInfo> listSubList = arrayList2;
                    if (iIndexOf != -1) {
                        listSubList = arrayList2.subList(iIndexOf, arrayList2.size());
                    }
                    arrayList = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
                    for (BeatInfo beatInfo2 : listSubList) {
                        arrayList.add(new BeatInfo(beatInfo2.timestampInMS - iLLLLLLL, beatInfo2.value, 0.0f, 2));
                    }
                } else {
                    arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                    for (BeatInfo beatInfo3 : arrayList2) {
                        arrayList.add(new BeatInfo(beatInfo3.timestampInMS - iLLLLLLL, beatInfo3.value, 0.0f, 2));
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            LJIIJ(c354540DvA.LIZIZ, nLEVideoEffect, LJFF(nLETrackSlot2, arrayList), z);
            return;
        }
        LJIIJ(c354540DvA.LIZIZ, nLEVideoEffect, LJFF(nLETrackSlot2, null), z);
    }
}
