package X;

import android.graphics.RectF;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.INLEBrushRuntime;
import com.bytedance.ies.nle.editor_jni.INLEEffectRuntime;
import com.bytedance.ies.nle.editor_jni.INLEListenerDoAction;
import com.bytedance.ies.nle.editor_jni.INLEMattingRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.MapStrStr;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLEMattingBlendMode;
import com.bytedance.ies.nle.editor_jni.NLEMattingStroke;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResTag;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESegmentBrushSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLEChromaChannelSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.ugc.android.editor.core.editor.ColorPickerInfo;
import com.ss.ugc.android.editor.core.model.CircleParams;
import com.ss.ugc.android.editor.core.model.CutoutBrushParams;
import com.ss.ugc.android.editor.core.model.StrokeParams;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354730DvT extends C350680Dow implements InterfaceC354890Dvj {
    public PthreadTimer LJ;
    public final List<Float> LJFF;
    public final CircleParams LJI;
    public final Boolean LJII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // X.InterfaceC354890Dvj
    public final Pair<String, EnumC356150Dxl> LJJII() {
        Object extra;
        T next;
        C259800zU c259800zU = new C259800zU();
        VecNLETrackSPtr tracks = C350870DpF.LJI(this.LIZ).getTracks();
        if (tracks != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            NLESegmentBrushSticker nLESegmentBrushStickerDynamicCast = null;
            while (it2.hasNext()) {
                Iterator<NLETrackSlot> it3 = it2.next().getSlots().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = 0;
                        break;
                    }
                    next = it3.next();
                    NLETrackSlot nLETrackSlot = (NLETrackSlot) next;
                    if (NLESegmentBrushSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
                        nLESegmentBrushStickerDynamicCast = NLESegmentBrushSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                    }
                    if (nLESegmentBrushStickerDynamicCast != null) {
                        break;
                    }
                }
                c259800zU.element = next;
                if (next != 0) {
                    break;
                }
            }
            if (nLESegmentBrushStickerDynamicCast != null) {
                String brushParam = nLESegmentBrushStickerDynamicCast.getBrushParam();
                if (!TextUtils.isEmpty(brushParam)) {
                    int iOptDouble = (int) ((((((float) new JSONObject(brushParam).optDouble("brush_size")) - 0.0f) / 0.2f) * 100.0f) + 0.0f);
                    NLENode nLENode = (NLENode) c259800zU.element;
                    if (nLENode != null) {
                        extra = nLENode.getExtra("ep_cutout_brush_type");
                        if (extra == null) {
                            extra = "NORMAL";
                        }
                    } else {
                        extra = EnumC356150Dxl.NORMAL;
                    }
                    return new Pair<>(String.valueOf(iOptDouble), EnumC356150Dxl.valueOf(extra.toString()));
                }
            }
        }
        return new Pair<>(CardStruct.IStatusCode.DEFAULT, EnumC356150Dxl.NORMAL);
    }

    public C354730DvT(C0E48 c0e48) {
        super(c0e48);
        this.LJFF = new ArrayList();
        this.LJI = new CircleParams(0, 0, false, 0.0f, 0.0f, null, null, 127, null);
        this.LJII = VEConfigCenter.getInstance().getValue("ve_optimize_custom_matting", false);
    }

    public static void LLJJIJIIJIL(C354750DvV c354750DvV) {
        int iIntValue;
        int iIntValue2;
        boolean z;
        InterfaceC354860Dvg interfaceC354860Dvg;
        int[] iArr = new int[2];
        C354790DvZ c354790DvZ = c354750DvV.LIZ;
        if (c354790DvZ == null) {
            return;
        }
        c354790DvZ.LIZ.getLocationOnScreen(iArr);
        float rawX = c354750DvV.LJ.getRawX();
        float rawY = c354750DvV.LJ.getRawY();
        boolean z2 = false;
        Integer numLJJIIJ = C13LQ.LJJIIJ(0, iArr);
        if (numLJJIIJ != null) {
            iIntValue = numLJJIIJ.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numLJJIIJ2 = C13LQ.LJJIIJ(1, iArr);
        if (numLJJIIJ2 != null) {
            iIntValue2 = numLJJIIJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        int width = c354790DvZ.LIZ.getWidth() + iIntValue;
        int height = c354790DvZ.LIZ.getHeight() + iIntValue2;
        if (rawX < width && rawX > iIntValue) {
            z = true;
        } else {
            z = false;
        }
        if (rawY < height && rawY > iIntValue2) {
            z2 = true;
        }
        if (z && z2 && (interfaceC354860Dvg = c354790DvZ.LIZIZ) != null) {
            interfaceC354860Dvg.Bp();
        }
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJJLIL(C354750DvV c354750DvV) {
        NLETrackSlot nLETrackSlot;
        Pair pair;
        SurfaceView surfaceView;
        INLEBrushRuntime brushApi;
        INLEBrushRuntime brushApi2;
        INLEBrushRuntime brushApi3;
        INLEBrushRuntime brushApi4;
        INLEBrushRuntime brushApi5;
        Pair pair2;
        int width;
        INLEMediaRuntime mediaRuntimeApi;
        SurfaceView surfaceView2;
        SurfaceView surfaceView3;
        INLEBrushRuntime brushApi6;
        NLETrackSlot nLETrackSlot2 = c354750DvV.LIZJ;
        if (nLETrackSlot2 == null || (nLETrackSlot = c354750DvV.LIZLLL) == null) {
            return;
        }
        float width2 = c354750DvV.LJFF.getWidth();
        float height = c354750DvV.LJFF.getHeight();
        float f = c354750DvV.LJI;
        float f2 = height * f;
        float f3 = c354750DvV.LJII;
        float x = c354750DvV.LJ.getX();
        float y = c354750DvV.LJ.getY();
        if (f3 > f) {
            pair = new Pair(Float.valueOf(f2), Float.valueOf(f2 / f3));
        } else {
            pair = new Pair(Float.valueOf(f3 * height), Float.valueOf(height));
        }
        float fFloatValue = ((Number) pair.getFirst()).floatValue();
        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
        float f4 = 2;
        float f5 = fFloatValue / f4;
        float f6 = fFloatValue2 / f4;
        float f7 = width2 / 2.0f;
        float f8 = height / 2.0f;
        RectF rectF = new RectF(f7 - f5, f8 - f6, f7 + f5, f8 + f6);
        Pair pair3 = new Pair(Float.valueOf(C13LZ.LIZLLL(x, rectF.left, rectF.right)), Float.valueOf(C13LZ.LIZLLL(y, rectF.top, rectF.bottom)));
        Pair pair4 = new Pair(Float.valueOf((((Number) pair3.getFirst()).floatValue() - f7) / f5), Float.valueOf((((Number) pair3.getSecond()).floatValue() - f8) / f6));
        float fFloatValue3 = ((Number) pair4.getFirst()).floatValue();
        float fFloatValue4 = ((Number) pair4.getSecond()).floatValue();
        int action = c354750DvV.LJ.getAction();
        if (action != 0) {
            int height2 = 0;
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                } else {
                    INLEMediaSession iNLEMediaSessionF1 = this.LIZ.f1();
                    if (iNLEMediaSessionF1 != null && (brushApi6 = iNLEMediaSessionF1.getBrushApi()) != null) {
                        brushApi6.processPanEvent(nLETrackSlot2.getUUID(), fFloatValue3, fFloatValue4, 0.0f, 0.0f, 0.0f);
                    }
                    LLJJIJI(c354750DvV);
                    LLJJJ(nLETrackSlot, fFloatValue3, fFloatValue4, true);
                    if (c354750DvV.LIZ == null) {
                        return;
                    }
                    float height3 = c354750DvV.LJFF.getHeight();
                    float f9 = c354750DvV.LJI;
                    float f10 = height3 * f9;
                    float f11 = c354750DvV.LJII;
                    if (f11 > f9) {
                        pair2 = new Pair(Float.valueOf(f10), Float.valueOf(f10 / f11));
                    } else {
                        pair2 = new Pair(Float.valueOf(f11 * height3), Float.valueOf(height3));
                    }
                    float fFloatValue5 = ((Number) pair2.getFirst()).floatValue() / f4;
                    float fFloatValue6 = ((Number) pair2.getSecond()).floatValue() / f4;
                    C354790DvZ c354790DvZ = c354750DvV.LIZ;
                    if (c354790DvZ != null && (surfaceView3 = c354790DvZ.LIZ) != null) {
                        width = surfaceView3.getWidth();
                    } else {
                        width = 0;
                    }
                    C354790DvZ c354790DvZ2 = c354750DvV.LIZ;
                    if (c354790DvZ2 != null && (surfaceView2 = c354790DvZ2.LIZ) != null) {
                        height2 = surfaceView2.getHeight();
                    }
                    float f12 = (width / 2) / fFloatValue5;
                    float f13 = 1;
                    float f14 = (height2 / 2) / fFloatValue6;
                    RectF rectF2 = new RectF(f12 - f13, f14 - f13, f13 - f12, f13 - f14);
                    Pair pair5 = new Pair(Float.valueOf(C13LZ.LIZLLL(fFloatValue3, rectF2.left, rectF2.right)), Float.valueOf(C13LZ.LIZLLL(fFloatValue4, rectF2.top, rectF2.bottom)));
                    Pair pair6 = new Pair(Float.valueOf(((Number) pair5.getFirst()).floatValue() / f4), Float.valueOf(((Number) pair5.getSecond()).floatValue() / f4));
                    INLEMediaSession iNLEMediaSessionF12 = this.LIZ.f1();
                    if (iNLEMediaSessionF12 != null && (mediaRuntimeApi = iNLEMediaSessionF12.getMediaRuntimeApi()) != null) {
                        mediaRuntimeApi.setMagnifierDisplayState(1.0f, ((Number) pair6.getFirst()).floatValue(), ((Number) pair6.getSecond()).floatValue());
                    }
                    LLJJIJIIJIL(c354750DvV);
                    return;
                }
            }
            LLJJIJI(c354750DvV);
            if (this.LJII.booleanValue()) {
                INLEMediaSession iNLEMediaSessionF13 = this.LIZ.f1();
                if (iNLEMediaSessionF13 != null && (brushApi5 = iNLEMediaSessionF13.getBrushApi()) != null) {
                    brushApi5.processTouchUpEvent2(nLETrackSlot2.getUUID(), fFloatValue3, fFloatValue4, 0.0f, 0.0f, 0.0f);
                }
            } else {
                INLEMediaSession iNLEMediaSessionF14 = this.LIZ.f1();
                if (iNLEMediaSessionF14 != null && (brushApi3 = iNLEMediaSessionF14.getBrushApi()) != null) {
                    brushApi3.processTouchUpEvent(nLETrackSlot2.getUUID(), fFloatValue3, fFloatValue4, 0.0f, 0.0f, 0.0f);
                }
            }
            INLEMediaSession iNLEMediaSessionF15 = this.LIZ.f1();
            if (iNLEMediaSessionF15 != null && (brushApi4 = iNLEMediaSessionF15.getBrushApi()) != null) {
                brushApi4.end2DBrush(nLETrackSlot2.getUUID());
            }
            LLJJJ(nLETrackSlot, fFloatValue3, fFloatValue4, false);
            PthreadTimer pthreadTimer = this.LJ;
            if (pthreadTimer != null) {
                pthreadTimer.cancel();
            }
            this.LJ = null;
            return;
        }
        ((ArrayList) this.LJFF).clear();
        INLEMediaSession iNLEMediaSessionF16 = this.LIZ.f1();
        if (iNLEMediaSessionF16 != null && (brushApi2 = iNLEMediaSessionF16.getBrushApi()) != null) {
            brushApi2.begin2DBrush(nLETrackSlot2.getUUID());
        }
        INLEMediaSession iNLEMediaSessionF17 = this.LIZ.f1();
        if (iNLEMediaSessionF17 != null && (brushApi = iNLEMediaSessionF17.getBrushApi()) != null) {
            brushApi.processTouchDownEvent(nLETrackSlot2.getUUID(), fFloatValue3, fFloatValue4, 0.0f, 0.0f, 0.0f);
        }
        LLJJJ(nLETrackSlot, fFloatValue3, fFloatValue4, true);
        LLJJIJI(c354750DvV);
        C354790DvZ c354790DvZ3 = c354750DvV.LIZ;
        if (c354790DvZ3 != null && (surfaceView = c354790DvZ3.LIZ) != null) {
            LLJJIJIIJIL(c354750DvV);
            this.LIZ.getPlayer().LJI(surfaceView);
        }
        if (this.LJ != null) {
            return;
        }
        PthreadTimer pthreadTimer2 = new PthreadTimer("CutoutEditorImpl");
        pthreadTimer2.schedule(new C391480FWo(this, 7), 0L, 33L);
        this.LJ = pthreadTimer2;
    }

    public final void LLJJIJI(C354750DvV c354750DvV) {
        Pair pair;
        float width = c354750DvV.LJFF.getWidth();
        float height = c354750DvV.LJFF.getHeight();
        float f = c354750DvV.LJI;
        float f2 = height * f;
        float f3 = c354750DvV.LJII;
        float x = c354750DvV.LJ.getX();
        float y = c354750DvV.LJ.getY();
        if (f3 > f) {
            pair = new Pair(Float.valueOf(f2), Float.valueOf(f2 / f3));
        } else {
            pair = new Pair(Float.valueOf(f3 * height), Float.valueOf(height));
        }
        float fFloatValue = ((Number) pair.getFirst()).floatValue();
        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
        float f4 = 2;
        float f5 = fFloatValue / f4;
        float f6 = fFloatValue2 / f4;
        float f7 = width / 2.0f;
        float f8 = height / 2.0f;
        RectF rectF = new RectF(f7 - f5, f8 - f6, f7 + f5, f8 + f6);
        Pair pair2 = new Pair(Float.valueOf(C13LZ.LIZLLL(x, rectF.left, rectF.right)), Float.valueOf(C13LZ.LIZLLL(y, rectF.top, rectF.bottom)));
        Pair pair3 = new Pair(Float.valueOf((((Number) pair2.getFirst()).floatValue() - rectF.left) / fFloatValue), Float.valueOf((((Number) pair2.getSecond()).floatValue() - rectF.top) / fFloatValue2));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bachBrushData ");
        sbLIZ.append(((Number) pair3.getFirst()).floatValue());
        sbLIZ.append(' ');
        sbLIZ.append(((Number) pair3.getSecond()).floatValue());
        C355090Dw3.LJ("Editor-Pro-Log.zhangtao", C2188811AlT.LIZIZ(sbLIZ));
        ((ArrayList) this.LJFF).add(pair3.getFirst());
        ((ArrayList) this.LJFF).add(pair3.getSecond());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[PHI: r6
      0x0036: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String) binds: [B:6:0x0026, B:11:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LLJJIJIL(com.bytedance.ies.nle.editor_jni.NLETrackSlot r9, java.lang.String r10) {
        /*
            r8 = 0
            if (r9 != 0) goto L4
            return r8
        L4:
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r9.getMainSegment()
            com.bytedance.ies.nle.editor_jni.NLESegmentVideo r7 = com.bytedance.ies.nle.editor_jni.NLESegmentVideo.dynamicCast(r0)
            X.0DqH r4 = X.C351510DqH.LIZ
            r0 = 2
            com.bytedance.ies.nle.editor_jni.NLEResType[] r2 = new com.bytedance.ies.nle.editor_jni.NLEResType[r0]
            com.bytedance.ies.nle.editor_jni.NLEResType r0 = com.bytedance.ies.nle.editor_jni.NLEResType.VIDEO
            r3 = 0
            r2[r3] = r0
            com.bytedance.ies.nle.editor_jni.NLEResType r0 = com.bytedance.ies.nle.editor_jni.NLEResType.IMAGE
            r1 = 1
            r2[r1] = r0
            java.util.List r0 = X.C1697810uHb.LJIIJJI(r2)
            r4.getClass()
            java.lang.String r6 = X.C351510DqH.LJJIIJ(r9, r0)
            if (r6 != 0) goto L36
            if (r7 == 0) goto Lb0
            com.bytedance.ies.nle.editor_jni.NLEResourceAV r0 = r7.getAVFile()
            if (r0 == 0) goto Lb0
            java.lang.String r6 = r0.getResourceFile()
            if (r6 == 0) goto L3d
        L36:
            boolean r0 = kotlin.text.a0.LJJJIL(r6)
            if (r0 != 0) goto L3d
            r1 = 0
        L3d:
            java.lang.String r5 = "sourceFile ="
            java.lang.String r4 = "-----AIMattingManager"
            if (r1 != 0) goto Lb2
            boolean r0 = X.C2286708xd.LIZJ(r6)
            if (r0 == 0) goto Lb2
            android.net.Uri r1 = X.C2471909mP.LJIILIIL(r6)
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            java.lang.String r1 = X.C09N5.LIZ(r0, r1)
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r1)
            java.lang.String r2 = X.C20130113pb.LJ(r0)
            java.lang.String r1 = ":"
            java.lang.String r0 = "_"
            java.lang.String r2 = kotlin.text.u.LJJIFFI(r2, r1, r0, r3)
            java.lang.String r1 = ";"
            java.lang.String r0 = ""
            java.lang.String r3 = kotlin.text.u.LJJIFFI(r2, r1, r0, r3)
            X.0VSJ r2 = new X.0VSJ
            r2.<init>(r10, r3)
            if (r7 == 0) goto L85
            com.bytedance.ies.nle.editor_jni.NLEResourceAV r1 = r7.getAVFile()
            if (r1 == 0) goto L85
            java.lang.String r0 = "md5"
            r1.setExtra(r0, r3)
        L85:
            boolean r0 = r2.exists()
            if (r0 != 0) goto L8e
            r2.mkdirs()
        L8e:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r5)
            r1.append(r6)
            java.lang.String r0 = " workSpaceFile = "
            r1.append(r0)
            java.lang.String r0 = r2.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C355090Dw3.LIZIZ(r4, r0)
            java.lang.String r0 = r2.getAbsolutePath()
            return r0
        Lb0:
            r6 = r8
            goto L3d
        Lb2:
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r5)
            r0.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            X.C355090Dw3.LIZLLL(r4, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C354730DvT.LLJJIJIL(com.bytedance.ies.nle.editor_jni.NLETrackSlot, java.lang.String):java.lang.String");
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJIIIZ(NLETrackSlot nLETrackSlot, float f) {
        this.LJI.strokeCircleDiameter = f;
        LLJJJ(nLETrackSlot, 0.0f, 0.0f, true);
        this.LIZ.getPlayer().LJJIIZ(null);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJJIJIIJIL(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        NLEAIMatting aIMatting;
        NLESegmentAIMatting segment;
        NLESegmentAIMatting nLESegmentAIMattingDynamicCast;
        if (nLETrackSlot.getAIMatting() != null && (aIMatting = nLETrackSlot.getAIMatting()) != null && (segment = aIMatting.getSegment()) != null && (nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(segment)) != null) {
            nLESegmentAIMattingDynamicCast.clearStroke();
            LLJJ(C051R.LIZIZ(new C0E1X(C0E1V.APPLY_STROKE.getNameId(), null, null, null, null, 30)), enumC356070Dxd);
        }
    }

    @Override // X.InterfaceC354890Dvj
    public final Pair<NLETrackSlot, NLETrackSlot> LJJJLIIL(C354760DvW c354760DvW, EnumC356070Dxd enumC356070Dxd) {
        String str = c354760DvW.LIZLLL;
        String str2 = c354760DvW.LJ;
        String str3 = c354760DvW.LJFF;
        NLETrackSlot nLETrackSlot = c354760DvW.LIZ;
        if (nLETrackSlot == null) {
            return new Pair<>(null, null);
        }
        NLETrackSlot nLETrackSlot2 = new NLETrackSlot();
        NLESegmentBrushSticker nLESegmentBrushSticker = new NLESegmentBrushSticker();
        nLESegmentBrushSticker.setBrushCachePath(str);
        nLESegmentBrushSticker.setBrushPath(str2);
        nLESegmentBrushSticker.setBrushParam(new CutoutBrushParams(c354760DvW.LIZIZ.getWidth(), c354760DvW.LIZIZ.getHeight(), C08G1.LIZ("#0BE09B"), 0.046464648f, 1.0f, c354760DvW.LIZIZ.getWidth()).LIZ());
        nLETrackSlot2.setMainSegment(nLESegmentBrushSticker);
        nLETrackSlot2.setStartTime(nLETrackSlot.getStartTime());
        nLETrackSlot2.setEndTime(nLETrackSlot.getEndTime());
        nLETrackSlot2.setExtra("ep_cutout_brush_type", c354760DvW.LIZJ.name());
        NLETrack nLETrack = new NLETrack();
        nLETrack.addSlot(nLETrackSlot2);
        nLETrack.setExtra("track_type", "track_brush_sticker");
        LLZ().addTrack(nLETrack);
        NLETrackSlot nLETrackSlot3 = new NLETrackSlot();
        nLETrackSlot3.setLayer(LLZ().getLayerMax() + 1);
        nLETrackSlot3.setTransformZ(LLZ().getLayerMax() + 1);
        NLESegmentEffect nLESegmentEffect = new NLESegmentEffect();
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.setResourceType(NLEResType.EFFECT);
        nLEResourceNode.setResourceFile(str3);
        nLEResourceNode.setResourceTag(NLEResTag.AMAZING);
        nLESegmentEffect.setEffectSDKEffect(nLEResourceNode);
        nLESegmentEffect.setApplyTargetType(2);
        nLETrackSlot3.setMainSegment(nLESegmentEffect);
        nLETrackSlot3.setStartTime(nLETrackSlot.getStartTime());
        nLETrackSlot3.setEndTime(nLETrackSlot.getEndTime());
        this.LJI.canvasWidth = c354760DvW.LIZIZ.getWidth();
        this.LJI.canvasHeight = c354760DvW.LIZIZ.getHeight();
        NLETrack nLETrack2 = new NLETrack();
        nLETrack2.setLayer(LLZ().getLayerMax() + 1);
        nLETrack2.setMainTrack(false);
        nLETrack2.setExtraTrackType(NLETrackType.EFFECT);
        nLETrack2.setExtra("track_type", "video_effect");
        nLETrack2.setExtra("EffectTrackType", "BRUSH_CIRCLE");
        nLETrack2.addSlot(nLETrackSlot3);
        LLZ().addTrack(nLETrack2);
        LLJJ(null, enumC356070Dxd);
        LLJJJ(nLETrackSlot3, 0.0f, 0.0f, false);
        return new Pair<>(nLETrackSlot2, nLETrackSlot3);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017e  */
    @Override // X.InterfaceC354890Dvj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJI(X.C354780DvY r9, X.EnumC356070Dxd r10) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C354730DvT.LJLJJI(X.0DvY, X.0Dxd):void");
    }

    @Override // X.InterfaceC354890Dvj
    public final void LLIIIJ(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("--cancelMattingView-- ");
        sbLIZ.append(nLETrackSlot.getUUID());
        C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ));
        nLETrackSlot.removeExtraWithKey("from_ep_create");
        if (nLETrackSlot.getAIMatting() != null) {
            nLETrackSlot.setAIMatting(null);
            LLJJ(C051R.LIZIZ(new C0E1X(C0E1V.STOP_AI_MATTING.getNameId(), null, null, null, null, 30)), enumC356070Dxd);
        }
        C350870DpF.LJIIIZ(this.LIZ, "editing_matting_task_ready", Boolean.TRUE);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LLILZIL(NLETrackSlot nLETrackSlot, Pair<Integer, Integer> pair) {
        ArrayList arrayList;
        List listLIZ;
        NLESegmentBrushSticker nLESegmentBrushStickerDynamicCast = NLESegmentBrushSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentBrushStickerDynamicCast != null) {
            String brushParam = nLESegmentBrushStickerDynamicCast.getBrushParam();
            if (!TextUtils.isEmpty(brushParam)) {
                JSONObject jSONObject = new JSONObject(brushParam);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("brush_color");
                if (jSONArrayOptJSONArray != null) {
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(Float.valueOf((float) jSONArrayOptJSONArray.optDouble(i)));
                    }
                } else {
                    arrayList = null;
                }
                float fOptDouble = (float) jSONObject.optDouble("brush_size");
                float fOptDouble2 = (float) jSONObject.optDouble("brush_hardness");
                int iIntValue = pair.getFirst().intValue();
                int iIntValue2 = pair.getSecond().intValue();
                if (arrayList == null || (listLIZ = C13LP.LLIIII(arrayList)) == null) {
                    listLIZ = C08G1.LIZ("#0BE09B");
                }
                nLESegmentBrushStickerDynamicCast.setBrushParam(new CutoutBrushParams(iIntValue, iIntValue2, listLIZ, fOptDouble, fOptDouble2, iIntValue).LIZ());
                CircleParams circleParams = this.LJI;
                circleParams.canvasWidth = iIntValue;
                circleParams.canvasHeight = iIntValue2;
                LLJJ(null, EnumC356070Dxd.COMMIT);
            }
        }
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJJZ(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, Function1<? super NLESegmentChromaChannel, Unit> function1) {
        NLESegmentChromaChannel segment;
        NLEChromaChannel nLEChromaChannel;
        if (nLETrackSlot == null && (nLETrackSlot = LLJJI()) == null) {
            return;
        }
        if (function1 != null) {
            VecNLEChromaChannelSPtr chromaChannels = nLETrackSlot.getChromaChannels();
            if (chromaChannels != null && (nLEChromaChannel = (NLEChromaChannel) C13LP.LJJJLZIJ(0, chromaChannels)) != null) {
                segment = nLEChromaChannel.getSegment();
            } else {
                segment = null;
            }
            function1.invoke(segment);
        }
        nLETrackSlot.clearChromaChannel();
        LLJJ(null, enumC356070Dxd);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJJZZI(NLETrackSlot nLETrackSlot, int i, String str) {
        File fileLIZIZ;
        String strLLJJIJIL;
        INLEMediaSession iNLEMediaSessionF1;
        INLEMattingRuntime mattingApi;
        INLEMattingRuntime mattingApi2;
        if (nLETrackSlot.getAIMatting() != null) {
            String workSpace = NLESegmentAIMatting.dynamicCast(nLETrackSlot.getAIMatting().getSegment()).getWorkSpace();
            INLEMediaSession iNLEMediaSessionF12 = this.LIZ.f1();
            if (iNLEMediaSessionF12 != null && (mattingApi2 = iNLEMediaSessionF12.getMattingApi()) != null) {
                mattingApi2.cleanMattingFile(nLETrackSlot.getUUID(), workSpace, i, str);
                return;
            }
            return;
        }
        InterfaceC353240Dt4 interfaceC353240Dt4Ie = this.LIZ.Ie();
        if (interfaceC353240Dt4Ie == null || (fileLIZIZ = interfaceC353240Dt4Ie.LIZIZ()) == null || (strLLJJIJIL = LLJJIJIL(nLETrackSlot, fileLIZIZ.getAbsolutePath())) == null || a0.LJJJIL(strLLJJIJIL) || (iNLEMediaSessionF1 = this.LIZ.f1()) == null || (mattingApi = iNLEMediaSessionF1.getMattingApi()) == null) {
            return;
        }
        mattingApi.cleanMattingFile(nLETrackSlot.getUUID(), strLLJJIJIL, i, str);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJZL(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, Function1<? super NLEAIMatting, Unit> function1) {
        C0E1X c0e1x;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("--cancelMattingView-- ");
        sbLIZ.append(nLETrackSlot.getUUID());
        C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ));
        if (nLETrackSlot.getAIMatting() != null) {
            if (C351220Dpo.LJLZ(nLETrackSlot)) {
                c0e1x = new C0E1X(C0E1V.AUTO_CUTOUT_MATTING.getNameId(), null, null, null, null, 30);
            } else {
                c0e1x = new C0E1X(C0E1V.AI_MATTING.getNameId(), null, null, null, null, 30);
            }
            if (function1 != null) {
                function1.invoke(nLETrackSlot.getAIMatting());
            }
            nLETrackSlot.setAIMatting(null);
            LLJJ(C051R.LIZIZ(c0e1x), enumC356070Dxd);
        }
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJFF(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, float f, EnumC356070Dxd enumC356070Dxd) {
        ArrayList arrayList;
        List listLIZ;
        NLESegmentBrushSticker nLESegmentBrushStickerDynamicCast = NLESegmentBrushSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentBrushStickerDynamicCast != null) {
            String brushParam = nLESegmentBrushStickerDynamicCast.getBrushParam();
            if (!TextUtils.isEmpty(brushParam)) {
                JSONObject jSONObject = new JSONObject(brushParam);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("brush_color");
                if (jSONArrayOptJSONArray != null) {
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(Float.valueOf((float) jSONArrayOptJSONArray.optDouble(i)));
                    }
                } else {
                    arrayList = null;
                }
                float fOptDouble = (float) jSONObject.optDouble("brush_hardness");
                int iOptInt = jSONObject.optInt("canvas_width");
                int iOptInt2 = jSONObject.optInt("canvas_height");
                if (arrayList == null || (listLIZ = C13LP.LLIIII(arrayList)) == null) {
                    listLIZ = C08G1.LIZ("#0BE09B");
                }
                nLESegmentBrushStickerDynamicCast.setBrushParam(new CutoutBrushParams(iOptInt, iOptInt2, listLIZ, f, fOptDouble, iOptInt).LIZ());
                this.LJI.strokeCircleDiameter = f;
                LLJJJ(nLETrackSlot2, 0.0f, 0.0f, false);
                this.LIZ.getPlayer().LJJIIZ(null);
                LLJJ(null, enumC356070Dxd);
            }
        }
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJLJI(NLETrackSlot nLETrackSlot, NLEResourceNode nLEResourceNode, StrokeParams strokeParams, EnumC356070Dxd enumC356070Dxd) {
        NLEAIMatting aIMatting;
        NLESegmentAIMatting segment;
        if (nLETrackSlot == null || (aIMatting = nLETrackSlot.getAIMatting()) == null || (segment = aIMatting.getSegment()) == null || strokeParams == null) {
            return;
        }
        NLESegmentAIMatting nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(segment);
        if (nLESegmentAIMattingDynamicCast != null) {
            nLESegmentAIMattingDynamicCast.clearStroke();
            NLEMattingStroke nLEMattingStroke = new NLEMattingStroke();
            nLEMattingStroke.setParams(C051R.LIZIZ(strokeParams));
            nLEMattingStroke.setStroke(nLEResourceNode);
            nLESegmentAIMattingDynamicCast.addStroke(nLEMattingStroke);
        }
        LLJJ(C051R.LIZIZ(new C0E1X(C0E1V.APPLY_STROKE.getNameId(), null, null, null, null, 30)), enumC356070Dxd);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LLI(boolean z, NLETrackSlot nLETrackSlot, int i, EnumC356070Dxd enumC356070Dxd) {
        NLESegmentAIMatting segment;
        NLESegmentAIMatting segment2;
        if (z) {
            NLEAIMatting aIMatting = nLETrackSlot.getAIMatting();
            if (aIMatting != null && (segment2 = aIMatting.getSegment()) != null) {
                segment2.setBlendMode(NLEMattingBlendMode.NLEMattingBlendModeNormal);
                segment2.setBlendColor(0);
            }
        } else {
            NLEAIMatting aIMatting2 = nLETrackSlot.getAIMatting();
            if (aIMatting2 != null && (segment = aIMatting2.getSegment()) != null) {
                segment.setBlendMode(NLEMattingBlendMode.NLEMattingBlendModePreview);
                segment.setBlendColor(i);
            }
        }
        LLJJ(null, enumC356070Dxd);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LLILII(NLETrackSlot nLETrackSlot, String str, EnumC356150Dxl enumC356150Dxl, EnumC356070Dxd enumC356070Dxd) {
        if (C351220Dpo.LLIZLLLIL(nLETrackSlot)) {
            LJJZ(nLETrackSlot, EnumC356070Dxd.DONE, null);
        }
        NLESegmentBrushSticker nLESegmentBrushStickerDynamicCast = NLESegmentBrushSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentBrushStickerDynamicCast != null) {
            String brushParam = nLESegmentBrushStickerDynamicCast.getBrushParam();
            if (!TextUtils.isEmpty(brushParam)) {
                JSONObject jSONObject = new JSONObject(brushParam);
                float fOptDouble = (float) jSONObject.optDouble("brush_hardness");
                float fOptDouble2 = (float) jSONObject.optDouble("brush_size");
                int iOptInt = jSONObject.optInt("canvas_width");
                nLESegmentBrushStickerDynamicCast.setBrushParam(new CutoutBrushParams(iOptInt, jSONObject.optInt("canvas_height"), C08G1.LIZ(str), fOptDouble2, fOptDouble, iOptInt).LIZ());
                LLJJ(null, enumC356070Dxd);
            }
        }
        nLETrackSlot.setExtra("ep_cutout_brush_type", enumC356150Dxl.name());
        LLJJ(null, enumC356070Dxd);
    }

    public final void LLJJJ(NLETrackSlot nLETrackSlot, float f, float f2, boolean z) {
        INLEEffectRuntime effectApi;
        if (z) {
            CircleParams circleParams = this.LJI;
            circleParams.strokeCircleVisible = true;
            circleParams.strokeCirclePos = C1697810uHb.LJIIJJI(Float.valueOf(f), Float.valueOf(f2));
        } else {
            this.LJI.strokeCircleVisible = false;
        }
        CircleParams circleParams2 = this.LJI;
        String uuid = nLETrackSlot.getUUID();
        if (uuid != null) {
            circleParams2.getClass();
            String json = GsonProtectorUtils.toJson(new Gson(), circleParams2);
            if (json != null) {
                MapStrStr mapStrStr = new MapStrStr();
                mapStrStr.put("circle_params", json);
                INLEMediaSession iNLEMediaSessionF1 = this.LIZ.f1();
                if (iNLEMediaSessionF1 != null && (effectApi = iNLEMediaSessionF1.getEffectApi()) != null) {
                    effectApi.doAction(Boolean.TRUE, uuid, 0, mapStrStr, new INLEListenerDoAction() { // from class: X.0Dvd
                        @Override // com.bytedance.ies.nle.editor_jni.INLEListenerDoAction
                        public final void onDoActionCompleted(MapStrStr mapStrStr2) {
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006e A[PHI: r5
      0x006e: PHI (r5v6 java.lang.String) = (r5v1 java.lang.String), (r5v7 java.lang.String) binds: [B:38:0x006c, B:36:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC354890Dvj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(com.bytedance.ies.nle.editor_jni.NLETrackSlot r15, java.io.File r16, int r17, boolean r18, com.bytedance.ies.nle.editor_jni.NLEResourceNode r19, com.ss.ugc.android.editor.core.model.StrokeParams r20, X.EnumC356070Dxd r21, kotlin.jvm.functions.Function1<? super com.bytedance.ies.nle.editor_jni.NLEAIMatting, kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C354730DvT.LJIL(com.bytedance.ies.nle.editor_jni.NLETrackSlot, java.io.File, int, boolean, com.bytedance.ies.nle.editor_jni.NLEResourceNode, com.ss.ugc.android.editor.core.model.StrokeParams, X.0Dxd, kotlin.jvm.functions.Function1):void");
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJLLL(NLETrackSlot nLETrackSlot, long j, float f, float f2, String str, String str2, ColorPickerInfo colorPickerInfo, EnumC356070Dxd enumC356070Dxd) {
        NLEChromaChannel nLEChromaChannel;
        if ((nLETrackSlot != null || (nLETrackSlot = LLJJI()) != null) && str != null && !a0.LJJJIL(str) && str2 != null && !a0.LJJJIL(str2)) {
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceType(NLEResType.CHROMA);
            nLEResourceNode.setResourceFile(str2);
            nLEResourceNode.setResourceTag(NLEResTag.AMAZING);
            String strLIZ = C0FGD.LIZ(str, "editor_pro_cutout");
            nLEResourceNode.setExtra("biz_res_id", strLIZ);
            nLEResourceNode.setResourceId(strLIZ);
            NLESegmentChromaChannel segment = null;
            if (!nLETrackSlot.getChromaChannels().isEmpty()) {
                VecNLEChromaChannelSPtr chromaChannels = nLETrackSlot.getChromaChannels();
                if (chromaChannels != null && (nLEChromaChannel = (NLEChromaChannel) C13LP.LJJJLZIJ(0, chromaChannels)) != null) {
                    segment = nLEChromaChannel.getSegment();
                }
                NLESegmentChromaChannel nLESegmentChromaChannelDynamicCast = NLESegmentChromaChannel.dynamicCast(segment);
                if (nLESegmentChromaChannelDynamicCast != null) {
                    nLESegmentChromaChannelDynamicCast.setColor(j);
                    nLESegmentChromaChannelDynamicCast.setIntensity(f);
                    nLESegmentChromaChannelDynamicCast.setShadow(f2);
                    nLESegmentChromaChannelDynamicCast.setEffectSDKChroma(nLEResourceNode);
                    if (colorPickerInfo != null) {
                        nLESegmentChromaChannelDynamicCast.setExtra("extra_color_picker_info", C051R.LIZIZ(colorPickerInfo));
                    }
                    LLJJ(C051R.LIZIZ(new C0E1X(C0E1V.CHROMA_KEY.getNameId(), null, null, null, null, 30)), enumC356070Dxd);
                    return;
                }
                return;
            }
            NLEChromaChannel nLEChromaChannel2 = new NLEChromaChannel();
            NLESegmentChromaChannel nLESegmentChromaChannel = new NLESegmentChromaChannel();
            nLESegmentChromaChannel.setColor(j);
            nLESegmentChromaChannel.setIntensity(f);
            nLESegmentChromaChannel.setShadow(f2);
            nLESegmentChromaChannel.setEffectSDKChroma(nLEResourceNode);
            if (colorPickerInfo != null) {
                nLESegmentChromaChannel.setExtra("extra_color_picker_info", C051R.LIZIZ(colorPickerInfo));
            }
            nLEChromaChannel2.setSegment(nLESegmentChromaChannel);
            nLETrackSlot.addChromaChannel(nLEChromaChannel2);
            LLJJ(null, enumC356070Dxd);
        }
    }
}
