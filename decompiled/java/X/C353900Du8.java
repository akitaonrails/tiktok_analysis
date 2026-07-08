package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.INLEListenerCompile;
import com.bytedance.ies.nle.editor_jni.NLEAutoFillAlgType;
import com.bytedance.ies.nle.editor_jni.NLEAutoFillFrame;
import com.bytedance.ies.nle.editor_jni.NLECurveActionBeam;
import com.bytedance.ies.nle.editor_jni.NLECurveSpeedType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPoint;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAutoFillFrame;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoCompileEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLEVideoEncodeSettings;
import com.bytedance.ies.nle.editor_jni.NLE_COMPILE_TYPE;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.ies.nle.editor_jni.VecNLEPointSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.stickers.MusicAndTimeModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS145S0101000_5;
import njp.a;

/* JADX INFO: renamed from: X.0Du8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.effect.SlowMotionNLEHandler$handle$1", f = "SlowMotionNLEHandler.kt", l = {137}, m = "invokeSuspend")
public final class C353900Du8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public NLETrackSlot LL;
    public C558340Lv6 LLILLJJLI;
    public float LLILLL;
    public int LLILZ;
    public final /* synthetic */ C353920DuA LLILZIL;
    public final /* synthetic */ MusicAndTimeModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353900Du8(C353920DuA c353920DuA, MusicAndTimeModel musicAndTimeModel, InterfaceC1364105Vn<? super C353900Du8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c353920DuA;
        this.LLILZLL = musicAndTimeModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353900Du8(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        NLEModel model;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot nLETrackSlot;
        String resourceFile;
        C558340Lv6 c558340Lv6LIZLLL;
        float f;
        float f2;
        NLEResourceNode resource;
        NLETrackSlot nLETrackSlotDynamicCast;
        NLETrack mainTrack2;
        int size;
        VecNLETrackSlotSPtr slots;
        NLEAutoFillAlgType nLEAutoFillAlgType;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        C1C7U.LIZ("SlowMotionNLEHandler@531b.handle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                f2 = this.LLILLL;
                c558340Lv6LIZLLL = this.LLILLJJLI;
                nLETrackSlot = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C353920DuA c353920DuA = this.LLILZIL;
            if (c353920DuA.LIZ.getModel() == null) {
                model = new NLEModel();
                c353920DuA.LIZ.setModel(model);
            } else {
                model = c353920DuA.LIZ.getModel();
            }
            if (C348520DlS.LJI(model)) {
                mainTrack = (NLETrack) C13LP.LJJJLL(C348520DlS.LIZJ(model));
            } else {
                mainTrack = model.getMainTrack();
            }
            if (mainTrack != null && (sortedSlots = mainTrack.getSortedSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(sortedSlots)) != null) {
                if (C351220Dpo.LLJJJ(nLETrackSlot)) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SlowMotionNLEHandler@531b.handle$1");
                    return unit;
                }
                C20137613qo c20137613qo = C20137613qo.LIZ;
                NLESegment mainSegment = nLETrackSlot.getMainSegment();
                if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
                    resourceFile = resource.getResourceFile();
                } else {
                    resourceFile = null;
                }
                if (resourceFile == null) {
                    resourceFile = "";
                }
                c558340Lv6LIZLLL = c20137613qo.LIZLLL(resourceFile);
                long jLLLLLLL = C351220Dpo.LLLLLLL(nLETrackSlot.getDuration());
                try {
                    f = CastFloatProtector.parseFloat(this.LLILZLL.timeStamp);
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    f = 0.0f;
                }
                float f3 = f * LSPassThroughRecordSizeConfig.DEFAULT;
                float f4 = jLLLLLLL;
                if (f3 >= f4) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("SlowMotionNLEHandler@531b.handle$1");
                    return unit2;
                }
                f2 = f3 / f4;
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C353910Du9 c353910Du9 = new C353910Du9(this.LLILZIL, null);
                this.LL = nLETrackSlot;
                this.LLILLJJLI = c558340Lv6LIZLLL;
                this.LLILLL = f2;
                this.LLILZ = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c353910Du9) == objLJFF) {
                    C1C7U.LIZIZ("SlowMotionNLEHandler@531b.handle$1");
                    return objLJFF;
                }
            } else {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("SlowMotionNLEHandler@531b.handle$1");
                return unit3;
            }
        }
        List<Pair> listLJIIJJI = C1697810uHb.LJIIJJI(new Pair(C2286608xc.LIZLLL(f2), C2286608xc.LIZLLL(1.0f)), new Pair(C2286608xc.LIZLLL(1.0f - f2), C2286608xc.LIZLLL(0.1f)));
        this.LLILZIL.LJII = nLETrackSlot;
        if (nLETrackSlot != null && (nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone(true))) != null) {
            NLESegment mainSegment2 = nLETrackSlotDynamicCast.getMainSegment();
            if (mainSegment2 != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment2)) != null) {
                VecNLEPointSPtr vecNLEPointSPtr = new VecNLEPointSPtr();
                for (Pair pair : listLJIIJJI) {
                    float fFloatValue = ((Number) pair.getFirst()).floatValue();
                    float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
                    NLEPoint nLEPoint = new NLEPoint();
                    nLEPoint.setX(fFloatValue);
                    nLEPoint.setY(fFloatValue2);
                    vecNLEPointSPtr.add(nLEPoint);
                }
                nLESegmentVideoDynamicCast.setCurveSpeedPoints(vecNLEPointSPtr);
                nLESegmentVideoDynamicCast.setCurveSpeedType(NLECurveSpeedType.ActionBeam);
                NLECurveActionBeam nLECurveActionBeam = new NLECurveActionBeam();
                nLECurveActionBeam.setCycleTime(nLETrackSlotDynamicCast.getDuration());
                nLESegmentVideoDynamicCast.setCurveActionBeam(nLECurveActionBeam);
            }
            NLEAutoFillFrame nLEAutoFillFrame = new NLEAutoFillFrame();
            NLESegmentAutoFillFrame nLESegmentAutoFillFrame = new NLESegmentAutoFillFrame();
            C1455910nzR.LIZ.getClass();
            Float fLIZ = C1455910nzR.LIZ();
            if (fLIZ != null && fLIZ.floatValue() < 6.5f) {
                nLEAutoFillAlgType = NLEAutoFillAlgType.COVE;
            } else {
                nLEAutoFillAlgType = NLEAutoFillAlgType.UM;
            }
            nLESegmentAutoFillFrame.setAutoFillAlgType(nLEAutoFillAlgType);
            nLESegmentAutoFillFrame.setAlgScale(1.0f);
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceType(NLEResType.AUTO_FILL_FRAME);
            nLESegmentAutoFillFrame.setEffectSDKAutoFillFrame(nLEResourceNode);
            nLEAutoFillFrame.setSegment(nLESegmentAutoFillFrame);
            nLETrackSlotDynamicCast.setAutoFillFrame(nLEAutoFillFrame);
        } else {
            nLETrackSlotDynamicCast = null;
        }
        if (nLETrackSlotDynamicCast != null) {
            final C353920DuA c353920DuA2 = this.LLILZIL;
            NLEModel model2 = c353920DuA2.LIZ().getModel();
            if (model2 != null) {
                mainTrack2 = model2.getMainTrack();
            } else {
                mainTrack2 = null;
            }
            if (mainTrack2 != null && (slots = mainTrack2.getSlots()) != null) {
                size = slots.size();
            } else {
                size = 0;
            }
            if (size > 0 && mainTrack2 != null) {
                mainTrack2.removeSlot(mainTrack2.getSlots().get(0));
            }
            nLETrackSlotDynamicCast.setScale(1.0f);
            nLETrackSlotDynamicCast.setRotation(0.0f);
            nLETrackSlotDynamicCast.setTransformX(0.0f);
            nLETrackSlotDynamicCast.setTransformY(0.0f);
            nLETrackSlotDynamicCast.clearVideoAnim();
            nLETrackSlotDynamicCast.clearVideoEffect();
            NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotDynamicCast.getMainSegment());
            if (nLESegmentVideoDynamicCast2 != null) {
                nLESegmentVideoDynamicCast2.setCrop(null);
                nLESegmentVideoDynamicCast2.setVolume(1.0f);
                long endTime = (long) ((nLETrackSlotDynamicCast.getEndTime() - nLETrackSlotDynamicCast.getStartTime()) * nLESegmentVideoDynamicCast2.getSpeed());
                nLESegmentVideoDynamicCast2.setSpeed(1.0f);
                nLETrackSlotDynamicCast.setEndTime(endTime);
                nLETrackSlotDynamicCast.setStartTime(0L);
                nLESegmentVideoDynamicCast2.setTimeClipStart(0L);
                nLESegmentVideoDynamicCast2.setTimeClipEnd(endTime);
            }
            if (mainTrack2 != null) {
                mainTrack2.addSlot(nLETrackSlotDynamicCast);
            }
            c353920DuA2.LIZ().addConsumer(c353920DuA2.LJIIJ);
            c353920DuA2.LIZ().commit();
            c353920DuA2.LIZ().removeConsumer(c353920DuA2.LJIIJ);
            NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotDynamicCast.getMainSegment());
            int i2 = c558340Lv6LIZLLL.LIZIZ;
            int i3 = c558340Lv6LIZLLL.LIZJ;
            NLEVideoEncodeSettings nLEVideoEncodeSettings = new NLEVideoEncodeSettings();
            nLEVideoEncodeSettings.setCompileType(NLE_COMPILE_TYPE.COMPILE_TYPE_MP4);
            nLEVideoEncodeSettings.setFps(30);
            nLEVideoEncodeSettings.setOutputSize(new PairIntInt(i2, i3));
            nLEVideoEncodeSettings.setIsSupportHWEncoder(true);
            NLEVideoCompileEncodeSettings nLEVideoCompileEncodeSettings = new NLEVideoCompileEncodeSettings();
            nLEVideoCompileEncodeSettings.setUseHWEncoder(true);
            nLEVideoCompileEncodeSettings.setIsSupportHWEncoder(true);
            nLEVideoEncodeSettings.setMVideoCompileEncodeSetting(nLEVideoCompileEncodeSettings);
            String strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), c353920DuA2.LIZLLL, EnumC20228214Cy.MAGIC_PROCESSOR, null, false, 12);
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
            ((C1463840oCE) ((C1463860oCG) c353920DuA2.LJIIIZ.getValue()).getExporterApi()).compile(strLIZIZ, nLEVideoEncodeSettings, new INLEListenerCompile() { // from class: X.0DuD
                public float LIZ = 0.05f;

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileError(int i4, int i5, float f5, String str) {
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileDone() {
                    NLESegmentVideo nLESegmentVideoDynamicCast3;
                    C353920DuA c353920DuA3 = c353920DuA2;
                    String str = strLIZIZ;
                    NLETrackSlot nLETrackSlot2 = c353920DuA3.LJII;
                    if (nLETrackSlot2 == null || (nLESegmentVideoDynamicCast3 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment())) == null) {
                        return;
                    }
                    NLEResourceNode resource2 = nLESegmentVideoDynamicCast3.getResource();
                    if (resource2 != null) {
                        resource2.setResourceFile(str);
                    }
                    long jLIZLLL = C352310DrZ.LIZLLL(C20137613qo.LIZ.LIZLLL(str).LJ);
                    NLEResourceNode resource3 = nLESegmentVideoDynamicCast3.getResource();
                    if (resource3 != null) {
                        resource3.setDuration(jLIZLLL);
                    }
                    float speed = nLESegmentVideoDynamicCast3.getSpeed();
                    if (speed == 0.0f) {
                        speed = 1.0f;
                    }
                    nLESegmentVideoDynamicCast3.setTimeClipStart(0L);
                    nLESegmentVideoDynamicCast3.setTimeClipEnd(jLIZLLL);
                    nLETrackSlot2.setEndTime(nLETrackSlot2.getStartTime() + ((long) (jLIZLLL / speed)));
                    MusicAndTimeModel musicAndTimeModel = c353920DuA3.LJ.creativeModel.musicAndTimeModel;
                    if (musicAndTimeModel != null) {
                        musicAndTimeModel.slowMotionApplied = true;
                    }
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c353920DuA3.LJFF);
                    C1DFH c1dfh2 = C0PEM.LIZ;
                    C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C353930DuB(c353920DuA3, null), 2);
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEListenerCompile
                public final void onCompileProgress(float f5) {
                    float fMax = Math.max(this.LIZ, Math.min(f5, 0.98f));
                    C354270Duj.LIZJ(0L, new AwS145S0101000_5(c353920DuA2, (int) (100 * fMax), 2));
                    this.LIZ = fMax;
                }
            });
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("SlowMotionNLEHandler@531b.handle$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
