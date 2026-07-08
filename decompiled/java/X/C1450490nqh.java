package X;

import Y.ALAdapterS18S0100000_22;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.ies.cutsame.util.Size;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCrop;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageTransformParams;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.crop.CropData;
import com.ss.android.vesdk.VEEditor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1450490nqh extends C12QQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public static final int LLL;
    public final C19A3 LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public SingleImageData LLJLIL;
    public C1450610nqt LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public final C01GW LLJLLL;
    public final boolean LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1450490nqh.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1450490nqh.class, "imageProgressApi", "getImageProgressApi()Lcom/ss/android/ugc/aweme/image/progressbar/ImageProgressApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1450490nqh.class, "isolateClipEditApi", "getIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1450490nqh.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1450490nqh.class, "imageAlbumData", "getImageAlbumData()Lcom/ss/android/ugc/aweme/creative/model/edit/ImageAlbumData;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1450490nqh.class, "cropThumbnailApi", "getCropThumbnailApi()Lcom/ss/android/ugc/gamora/editor/crop/thumbnail/CropThumbnailApi;", 0);
        c09r3.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLL = 8;
    }

    public void N6(SingleImageData singleImageData, C1450520nqk c1450520nqk) {
    }

    public void P6() {
    }

    private final NLETrackSlot K6() {
        NLEModel model;
        NLETrack mainTrack;
        NLEModel model2;
        NLETrack mainTrack2;
        SrcImageInfo srcImageInfo;
        SrcLiveVideoInfo srcLiveInfo;
        SingleImageData singleImageData = this.LLJLIL;
        NLETrackSlot slotByIndex = null;
        if (((singleImageData == null || (srcLiveInfo = singleImageData.getSrcLiveInfo()) == null) ? null : srcLiveInfo.getLivePhotoPreviewMode()) != LivePhotoPreviewMode.LOOP) {
            NLEEditor nLEEditorD5 = d5();
            if (nLEEditorD5 == null || (model = nLEEditorD5.getModel()) == null || (mainTrack = model.getMainTrack()) == null) {
                return null;
            }
            return mainTrack.getSlotByIndex(0);
        }
        SingleImageData singleImageData2 = this.LLJLIL;
        NLETrackSlot nLETrackSlotLIZJ = (singleImageData2 == null || (srcImageInfo = singleImageData2.getSrcImageInfo()) == null) ? null : C1450170nqB.LIZJ(srcImageInfo, 0L, null, 12);
        NLEEditor nLEEditorD52 = d5();
        if (nLEEditorD52 != null && (model2 = nLEEditorD52.getModel()) != null && (mainTrack2 = model2.getMainTrack()) != null) {
            slotByIndex = mainTrack2.getSlotByIndex(0);
        }
        C1450420nqa.LIZIZ(nLETrackSlotLIZJ, C1450420nqa.LIZ(slotByIndex));
        return nLETrackSlotLIZJ;
    }

    private final int L6() {
        return ((Number) this.LLJLLL.getValue()).intValue();
    }

    private final C1450550nqn N5() {
        C1450550nqn c1450550nqn = new C1450550nqn();
        c1450550nqn.LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27));
        c1450550nqn.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(27));
        c1450550nqn.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)) + L6();
        c1450550nqn.LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(222));
        return c1450550nqn;
    }

    private final InterfaceC1450540nqm R5() {
        return (InterfaceC1450540nqm) this.LLJLLIL.getValue(this, LLJZIJLIL[5]);
    }

    private final C0E48 d6() {
        return (C0E48) this.LLJL.getValue();
    }

    private final ImageAlbumData m6() {
        return (ImageAlbumData) this.LLJLL.getValue(this, LLJZIJLIL[4]);
    }

    private final InterfaceC1453410nvP u6() {
        return (InterfaceC1453410nvP) this.LLJJJJLIIL.getValue(this, LLJZIJLIL[1]);
    }

    public final InterfaceC1450920nrO J6() {
        return (InterfaceC1450920nrO) this.LLJJL.getValue(this, LLJZIJLIL[2]);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    @Override // X.C12QQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.ies.nle.editor_jni.NLETrackSlot M5() {
        /*
            r3 = this;
            boolean r0 = r3.LLJZ
            if (r0 == 0) goto L41
            com.bytedance.ies.nle.editor_jni.NLEEditor r0 = r3.d5()
            if (r0 == 0) goto L37
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r0.getModel()
            if (r0 == 0) goto L37
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r0.getMainTrack()
            if (r0 == 0) goto L37
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r0.getSlots()
            if (r0 == 0) goto L37
            java.util.Iterator r2 = r0.iterator()
        L20:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r0
            boolean r0 = X.C351220Dpo.LLJJIJIL(r0)
            if (r0 == 0) goto L20
        L33:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r1 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r1
            if (r1 != 0) goto L3b
        L37:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r1 = r3.K6()
        L3b:
            r3.C5(r1)
            return r1
        L3f:
            r1 = 0
            goto L33
        L41:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = super.M5()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1450490nqh.M5():com.bytedance.ies.nle.editor_jni.NLETrackSlot");
    }

    public final InterfaceC559500Lwy S5() {
        return (InterfaceC559500Lwy) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLJZIJLIL[3]);
    }

    public final InterfaceC1451050nrb U5() {
        return (InterfaceC1451050nrb) this.LLJJJJJIL.getValue(this, LLJZIJLIL[0]);
    }

    @Override // X.C12QQ, X.AbstractC1664470tPp
    public Function0<C21665619qg> o2() {
        return new AwS566S0100000_22(this, 441);
    }

    private final void T6() {
        HashMap<Integer, C1450570nqp> mapNM2;
        SingleImageData singleImageData;
        Size size;
        NLETrack mainTrack;
        InterfaceC1450540nqm interfaceC1450540nqmR5 = R5();
        if (interfaceC1450540nqmR5 == null || (mapNM2 = interfaceC1450540nqmR5.nM2()) == null) {
            return;
        }
        for (Map.Entry<Integer, C1450570nqp> entry : mapNM2.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            C1450570nqp value = entry.getValue();
            if (iIntValue != U5().h7() && (singleImageData = (SingleImageData) C13LP.LJJJLZIJ(iIntValue, m6().getImageList())) != null) {
                NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                String id = singleImageData.getId();
                if (id == null) {
                    id = "";
                }
                String str = Z4().creativeModel.imageEditModel.map.get(id);
                C1450090nq3 c1450090nq3WD0 = U5().wD0();
                if (c1450090nq3WD0 == null) {
                    continue;
                } else {
                    ImageAlbumData imageAlbumData = Z4().getImageAlbumData();
                    if (imageAlbumData == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (imageAlbumData.getSurfaceData().getSurfaceViewWidth() != 0) {
                        ImageAlbumData imageAlbumData2 = Z4().getImageAlbumData();
                        if (imageAlbumData2 == null) {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        int surfaceViewWidth = imageAlbumData2.getSurfaceData().getSurfaceViewWidth();
                        ImageAlbumData imageAlbumData3 = Z4().getImageAlbumData();
                        if (imageAlbumData3 == null) {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        size = new Size(surfaceViewWidth, imageAlbumData3.getSurfaceData().getSurfaceViewHeight());
                    } else {
                        size = new Size(C1450870nrJ.LIZIZ, C1450870nrJ.LIZ);
                    }
                    nLEEditorLIZ.setModel(c1450090nq3WD0.LIZIZ(id, str, singleImageData, size, false, -1));
                    C1450520nqk c1450520nqk = value.LIZIZ;
                    if (c1450520nqk != null) {
                        if (this.LLJZ) {
                            k7(nLEEditorLIZ, c1450520nqk);
                        } else {
                            NLEModel model = nLEEditorLIZ.getModel();
                            n7((model == null || (mainTrack = model.getMainTrack()) == null) ? null : mainTrack.getSlotByIndex(0), c1450520nqk);
                        }
                        nLEEditorLIZ.commit();
                        nLEEditorLIZ.done();
                        W6(singleImageData, c1450520nqk);
                        singleImageData.getFilterInfo().setNeedRender(true);
                        Z4().creativeModel.imageEditModel.map.put(id, nLEEditorLIZ.store());
                        c1450090nq3WD0.LJ(nLEEditorLIZ.getModel(), id);
                    }
                }
            }
        }
    }

    @Override // X.C12QQ
    public void H4() {
        InterfaceC1450540nqm interfaceC1450540nqmR5;
        u6().pause(false);
        this.LLJLILLLLZIIL = (C1450610nqt) J6().V51(C1450610nqt.class);
        SingleImageData singleImageDataOR1 = J6().OR1();
        M5();
        NLETrackSlot nLETrackSlot = T2().LIZIZ;
        if (nLETrackSlot != null) {
            C389780FQa.LIZIZ(nLETrackSlot, singleImageDataOR1);
        }
        this.LLJLIL = singleImageDataOR1;
        if (!C573570MeZ.LIZJ(Z4()) && (interfaceC1450540nqmR5 = R5()) != null) {
            interfaceC1450540nqmR5.Tr(true);
        }
        S6(true);
    }

    @Override // X.C12QQ
    public void n5() {
        InterfaceC1450540nqm interfaceC1450540nqmR5 = R5();
        if (interfaceC1450540nqmR5 != null) {
            interfaceC1450540nqmR5.Tr(false);
        }
        S6(false);
    }

    public final C19A3 getParentScene() {
        return this.LLJJJJ;
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [X.0nql] */
    private final void S6(final boolean z) {
        int iIntValue;
        float f;
        final float f2;
        final float f3;
        float f4;
        int i;
        int iIntValue2;
        float f5;
        ValueAnimator valueAnimator;
        ?? r15 = new InterfaceC1450560nqo() { // from class: X.0nql
            @Override // X.InterfaceC1450560nqo
            public final void onEnd() {
                if (z) {
                    return;
                }
                this.J6().NH0(false);
                C1456140nzo.LIZIZ(this.U5(), true, false, false, false, 12);
                this.P6();
            }

            @Override // X.InterfaceC1450560nqo
            public final void onStart() {
                if (z) {
                    this.J6().NH0(true);
                    C1456140nzo.LIZIZ(this.U5(), false, false, false, false, 12);
                }
            }
        };
        Context contextRequireSceneContext = this.LLJJJJ.requireSceneContext();
        SingleImageData singleImageDataOR1 = J6().OR1();
        InterfaceC1451050nrb interfaceC1451050nrbU5 = U5();
        C1450550nqn c1450550nqnN5 = N5();
        C1836880xtu c1836880xtuWf2 = J6().wf2();
        final C1450510nqj c1450510nqj = new C1450510nqj(contextRequireSceneContext, singleImageDataOR1, interfaceC1451050nrbU5, c1450550nqnN5, c1836880xtuWf2, r15);
        ValueAnimator valueAnimator2 = c1450510nqj.LJIIIIZZ;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = c1450510nqj.LJIIIIZZ) != null) {
            valueAnimator.cancel();
        }
        if (!C1441980ncy.LIZ() && c1836880xtuWf2 != null) {
            float imageRatio = singleImageDataOR1.getImageRatio();
            int iIntValue3 = (((Number) c1450510nqj.LJFF.getValue()).intValue() - c1450550nqnN5.LIZ) - c1450550nqnN5.LIZIZ;
            int iLIZ = c1450510nqj.LIZ();
            float f6 = iIntValue3;
            float f7 = iLIZ;
            float f8 = f6 / f7;
            Rect rect = new Rect();
            if (imageRatio < f8) {
                int i2 = c1450550nqnN5.LIZJ;
                rect.top = i2;
                rect.bottom = i2 + iLIZ;
                int i3 = (int) (f7 * imageRatio);
                int i4 = ((iIntValue3 - i3) / 2) + c1450550nqnN5.LIZ;
                rect.left = i4;
                rect.right = i4 + i3;
            } else {
                int i5 = c1450550nqnN5.LIZ;
                rect.left = i5;
                rect.right = i5 + iIntValue3;
                int i6 = (int) (f6 / imageRatio);
                int i7 = ((iLIZ - i6) / 2) + c1450550nqnN5.LIZJ;
                rect.top = i7;
                rect.bottom = i7 + i6;
            }
            c1836880xtuWf2.setCropRect(rect);
        }
        float imageRatio2 = singleImageDataOR1.getImageRatio();
        float fIntValue = (((Number) c1450510nqj.LJFF.getValue()).intValue() - c1450550nqnN5.LIZ) - c1450550nqnN5.LIZIZ;
        float fLIZ = c1450510nqj.LIZ();
        float f9 = C1450870nrJ.LIZIZ / C1450870nrJ.LIZ;
        final float f10 = 1.0f;
        if (imageRatio2 < fIntValue / fLIZ) {
            if (!C1441980ncy.LIZ() && !C1441960ncw.LIZ()) {
                fLIZ *= imageRatio2;
                iIntValue2 = ((Number) c1450510nqj.LJFF.getValue()).intValue();
            } else if (imageRatio2 > f9) {
                f5 = fLIZ / (C1450870nrJ.LIZIZ / imageRatio2);
                c1450510nqj.LJII = f5;
            } else {
                iIntValue2 = C1450870nrJ.LIZ;
            }
            f5 = fLIZ / iIntValue2;
            c1450510nqj.LJII = f5;
        } else {
            if (!C1441980ncy.LIZ() && !C1441960ncw.LIZ()) {
                fIntValue *= 1.0f;
                iIntValue = ((Number) c1450510nqj.LJFF.getValue()).intValue();
            } else if (imageRatio2 < f9) {
                f = fIntValue / (C1450870nrJ.LIZ * imageRatio2);
                c1450510nqj.LJII = f;
            } else {
                iIntValue = C1450870nrJ.LIZIZ;
            }
            f = fIntValue / iIntValue;
            c1450510nqj.LJII = f;
        }
        float f11 = c1450510nqj.LJII;
        float f12 = c1450510nqj.LJIIIZ;
        float f13 = c1450510nqj.LJIIJ;
        if (z) {
            f2 = 1.0f;
            f10 = f11;
        } else {
            f2 = f11;
        }
        if (z) {
            f3 = 0.0f;
            f4 = (f13 - f12) / C1450870nrJ.LIZ;
        } else {
            f3 = (f13 - f12) / C1450870nrJ.LIZ;
            f4 = 0.0f;
        }
        if (C1441980ncy.LIZ() && c1836880xtuWf2 != null) {
            float f14 = c1450510nqj.LJIIJ - c1450510nqj.LJIIIZ;
            Rect editRect = c1836880xtuWf2.getEditRect();
            float f15 = c1450510nqj.LJII;
            Matrix matrix = new Matrix();
            matrix.setScale(f15, f15, editRect.exactCenterX(), editRect.exactCenterY());
            matrix.postTranslate(0.0f, f14);
            RectF rectF = new RectF();
            matrix.mapRect(rectF, new RectF(editRect));
            c1836880xtuWf2.setCropRect(C389880FQk.LIZ(rectF));
            i = 2;
        } else {
            i = 2;
        }
        float[] fArr = new float[i];
        // fill-array-data instruction
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(300L);
        duration.setInterpolator(c1450550nqnN5.LJ);
        c1450510nqj.LJIIIIZZ = duration;
        final float f16 = f4;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0nq5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                float fFloatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                float f18 = f2;
                float f19 = f18 + ((f10 - f18) * fFloatValue);
                InterfaceC1455860nzM interfaceC1455860nzM = c1450510nqj.LIZIZ;
                C346940Diu c346940Diu = new C346940Diu();
                float f20 = f3;
                float f21 = f16;
                c346940Diu.LIZJ = Float.valueOf(f19);
                c346940Diu.LJ = Float.valueOf(f20 + ((f21 - f20) * fFloatValue));
                interfaceC1455860nzM.cv0(c346940Diu, true);
                C1836880xtu c1836880xtu = c1450510nqj.LIZLLL;
                if (c1836880xtu != null) {
                    c1836880xtu.LIZLLL(fFloatValue, z);
                }
            }
        });
        ValueAnimator valueAnimator3 = c1450510nqj.LJIIIIZZ;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new ALAdapterS18S0100000_22(c1450510nqj, 2));
        }
        ValueAnimator valueAnimator4 = c1450510nqj.LJIIIIZZ;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    public final void d7(C1450520nqk c1450520nqk) {
        NLESegmentVideo nLESegmentVideoDynamicCast;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        C0E55 player;
        NLETrackSlot nLETrackSlot = T2().LIZIZ;
        if (nLETrackSlot == null || (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) == null) {
            return;
        }
        List<PointF> list = c1450520nqk.LIZ;
        NLEStyCrop nLEStyCrop = new NLEStyCrop();
        PointF pointF = (PointF) C13LP.LJJJLZIJ(0, list);
        float f8 = 0.0f;
        if (pointF != null) {
            f = pointF.x;
        } else {
            f = 0.0f;
        }
        nLEStyCrop.setXLeft(f);
        PointF pointF2 = (PointF) C13LP.LJJJLZIJ(0, list);
        if (pointF2 != null) {
            f2 = pointF2.y;
        } else {
            f2 = 0.0f;
        }
        nLEStyCrop.setYUpper(f2);
        PointF pointF3 = (PointF) C13LP.LJJJLZIJ(1, list);
        if (pointF3 != null) {
            f3 = pointF3.x;
        } else {
            f3 = 0.0f;
        }
        nLEStyCrop.setXRightUpper(f3);
        PointF pointF4 = (PointF) C13LP.LJJJLZIJ(1, list);
        if (pointF4 != null) {
            f4 = pointF4.y;
        } else {
            f4 = 0.0f;
        }
        nLEStyCrop.setYRightUpper(f4);
        PointF pointF5 = (PointF) C13LP.LJJJLZIJ(2, list);
        if (pointF5 != null) {
            f5 = pointF5.x;
        } else {
            f5 = 0.0f;
        }
        nLEStyCrop.setXLeftLower(f5);
        PointF pointF6 = (PointF) C13LP.LJJJLZIJ(2, list);
        if (pointF6 != null) {
            f6 = pointF6.y;
        } else {
            f6 = 0.0f;
        }
        nLEStyCrop.setYLeftLower(f6);
        PointF pointF7 = (PointF) C13LP.LJJJLZIJ(3, list);
        if (pointF7 != null) {
            f7 = pointF7.x;
        } else {
            f7 = 0.0f;
        }
        nLEStyCrop.setXRight(f7);
        PointF pointF8 = (PointF) C13LP.LJJJLZIJ(3, list);
        if (pointF8 != null) {
            f8 = pointF8.y;
        }
        nLEStyCrop.setYLower(f8);
        nLESegmentVideoDynamicCast.setIsWithEffect(true);
        nLESegmentVideoDynamicCast.setCrop(nLEStyCrop);
        NLEEditor nLEEditorD5 = d5();
        if (nLEEditorD5 != null) {
            nLEEditorD5.commit();
        }
        NLEEditor nLEEditorD52 = d5();
        if (nLEEditorD52 != null) {
            nLEEditorD52.done();
        }
        C0E48 c0e48D6 = d6();
        if (c0e48D6 != null && (player = c0e48D6.getPlayer()) != null) {
            player.LJJIIZ(Integer.valueOf(VEEditor.SEEK_MODE.EDITOR_REFRESH_MODE_FOECE.getValue()));
        }
        nLETrackSlot.setExtra("crop_matrix", C1449620npI.LIZJ(c1450520nqk.LJ));
        nLETrackSlot.setExtra("ep_crop_mode", String.valueOf(C375130EnH.LIZ(c1450520nqk.LIZIZ).ordinal()));
        nLETrackSlot.setExtra("ep_crop_ratio", String.valueOf(c1450520nqk.LIZJ));
        nLETrackSlot.setExtra("crop_slider_rotation", String.valueOf(c1450520nqk.LIZLLL));
        nLETrackSlot.setExtra("crop_button_rotation", String.valueOf(c1450520nqk.LJFF));
    }

    @Override // X.C12QQ
    public void k5(boolean z) {
        super.k5(z);
        InterfaceC1450540nqm interfaceC1450540nqmR5 = R5();
        if (interfaceC1450540nqmR5 != null) {
            interfaceC1450540nqmR5.Pg2(z);
        }
    }

    @Override // X.C12QQ
    public void t5(C1450520nqk c1450520nqk) {
        InterfaceC1450540nqm interfaceC1450540nqmR5 = R5();
        if (interfaceC1450540nqmR5 != null) {
            interfaceC1450540nqmR5.EN0(c1450520nqk);
        }
        T6();
        U5().Ai0(U5().h7());
        J6().Gk2(new AwS423S0200000_22(this, c1450520nqk, 45));
    }

    @Override // X.C12QQ
    public void v5(C1450520nqk c1450520nqk) {
        this.LLJLILLLLZIIL = (C1450610nqt) J6().V51(C1450610nqt.class);
        this.LLJLIL = J6().OR1();
        InterfaceC1450540nqm interfaceC1450540nqmR5 = R5();
        if (interfaceC1450540nqmR5 != null) {
            interfaceC1450540nqmR5.Fx2(c1450520nqk);
        }
    }

    public final void W6(SingleImageData singleImageData, C1450520nqk c1450520nqk) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        EditImageInfo editImageInfo = singleImageData.getEditImageInfo();
        editImageInfo.setRatioMode(c1450520nqk.LIZIZ);
        editImageInfo.setRatio(c1450520nqk.LIZJ);
        editImageInfo.setFullScreen(C1450870nrJ.LJIIJ(editImageInfo.getRatio()));
        float f8 = 360;
        editImageInfo.setCanvasTransformParams(new ImageTransformParams(c1450520nqk.LJIIIIZZ, c1450520nqk.LJIIIZ, c1450520nqk.LJIIJ, f8 - (c1450520nqk.LJII % f8), c1450520nqk.LJI, false));
        HashMap<String, String> extraMap = editImageInfo.getExtraMap();
        extraMap.put("crop_matrix", C1449620npI.LIZJ(c1450520nqk.LJ));
        extraMap.put("ep_crop_mode", String.valueOf(C375130EnH.LIZ(c1450520nqk.LIZIZ).ordinal()));
        extraMap.put("ep_crop_ratio", String.valueOf(c1450520nqk.LIZJ));
        extraMap.put("crop_slider_rotation", String.valueOf(c1450520nqk.LIZLLL));
        extraMap.put("crop_button_rotation", String.valueOf(c1450520nqk.LJFF));
        extraMap.put("crop_is_photo_cropped", String.valueOf(c1450520nqk.LJIILJJIL));
        extraMap.put("crop_mirror_x", String.valueOf(c1450520nqk.LJI));
        List<PointF> list = c1450520nqk.LIZ;
        NLEStyCrop nLEStyCrop = new NLEStyCrop();
        PointF pointF = (PointF) C13LP.LJJJLZIJ(0, list);
        float f9 = 0.0f;
        if (pointF != null) {
            f = pointF.x;
        } else {
            f = 0.0f;
        }
        nLEStyCrop.setXLeft(f);
        PointF pointF2 = (PointF) C13LP.LJJJLZIJ(0, list);
        if (pointF2 != null) {
            f2 = pointF2.y;
        } else {
            f2 = 0.0f;
        }
        nLEStyCrop.setYUpper(f2);
        PointF pointF3 = (PointF) C13LP.LJJJLZIJ(1, list);
        if (pointF3 != null) {
            f3 = pointF3.x;
        } else {
            f3 = 0.0f;
        }
        nLEStyCrop.setXRightUpper(f3);
        PointF pointF4 = (PointF) C13LP.LJJJLZIJ(1, list);
        if (pointF4 != null) {
            f4 = pointF4.y;
        } else {
            f4 = 0.0f;
        }
        nLEStyCrop.setYRightUpper(f4);
        PointF pointF5 = (PointF) C13LP.LJJJLZIJ(2, list);
        if (pointF5 != null) {
            f5 = pointF5.x;
        } else {
            f5 = 0.0f;
        }
        nLEStyCrop.setXLeftLower(f5);
        PointF pointF6 = (PointF) C13LP.LJJJLZIJ(2, list);
        if (pointF6 != null) {
            f6 = pointF6.y;
        } else {
            f6 = 0.0f;
        }
        nLEStyCrop.setYLeftLower(f6);
        PointF pointF7 = (PointF) C13LP.LJJJLZIJ(3, list);
        if (pointF7 != null) {
            f7 = pointF7.x;
        } else {
            f7 = 0.0f;
        }
        nLEStyCrop.setXRight(f7);
        PointF pointF8 = (PointF) C13LP.LJJJLZIJ(3, list);
        if (pointF8 != null) {
            f9 = pointF8.y;
        }
        nLEStyCrop.setYLower(f9);
        singleImageData.getEditImageInfo().setCropData(new CropData(nLEStyCrop.getXLeft(), nLEStyCrop.getYUpper(), nLEStyCrop.getXRightUpper(), nLEStyCrop.getYRightUpper(), nLEStyCrop.getXLeftLower(), nLEStyCrop.getYLeftLower(), nLEStyCrop.getXRight(), nLEStyCrop.getYLower(), c1450520nqk.LJIIJJI, c1450520nqk.LJIIL, c1450520nqk.LJIILIIL, 0.0f, c1450520nqk.LIZJ, C375130EnH.LIZ(c1450520nqk.LIZIZ).ordinal(), C1449620npI.LIZJ(c1450520nqk.LJ), c1450520nqk.LIZLLL, c1450520nqk.LJFF, c1450520nqk.LJIILJJIL, c1450520nqk.LJI));
        N6(singleImageData, c1450520nqk);
    }

    public final void k7(NLEEditor nLEEditor, C1450520nqk c1450520nqk) {
        NLEModel model;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        if (nLEEditor != null && (model = nLEEditor.getModel()) != null && (mainTrack = model.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null) {
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                n7(it2.next(), c1450520nqk);
            }
        }
    }

    public final void n7(NLETrackSlot nLETrackSlot, C1450520nqk c1450520nqk) {
        if (nLETrackSlot == null || NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) == null) {
            return;
        }
        nLETrackSlot.setScale(c1450520nqk.LJIIIIZZ);
        nLETrackSlot.setTransformY(c1450520nqk.LJIIJ);
        nLETrackSlot.setTransformX(c1450520nqk.LJIIIZ);
        nLETrackSlot.setMirror_X(c1450520nqk.LJI);
        nLETrackSlot.setRotation(c1450520nqk.LJII);
        nLETrackSlot.setExtra("crop_matrix", C1449620npI.LIZJ(c1450520nqk.LJ));
        nLETrackSlot.setExtra("ep_crop_mode", String.valueOf(C375130EnH.LIZ(c1450520nqk.LIZIZ).ordinal()));
        nLETrackSlot.setExtra("ep_crop_ratio", String.valueOf(c1450520nqk.LIZJ));
        nLETrackSlot.setExtra("crop_slider_rotation", String.valueOf(c1450520nqk.LIZLLL));
        nLETrackSlot.setExtra("crop_button_rotation", String.valueOf(c1450520nqk.LJFF));
        nLETrackSlot.setExtra("crop_is_photo_cropped", String.valueOf(c1450520nqk.LJIILJJIL));
        nLETrackSlot.setExtra("crop_mirror_x", String.valueOf(c1450520nqk.LJI));
    }

    public C1450490nqh(C19A3 c19a3, C1DRG c1drg, boolean z) {
        super(c19a3, c1drg, z);
        this.LLJJJJ = c19a3;
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1453410nvP.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1450920nrO.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC559500Lwy.class, null);
        this.LLJL = C452501pT.LIZIZ(new AwS566S0100000_22(c1drg, 442));
        this.LLJLL = C1664770tQJ.LIZ(getDiContainer(), ImageAlbumData.class, null);
        this.LLJLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1450540nqm.class, null);
        this.LLJLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 443));
        this.LLJZ = C295670BiP.LIZ();
    }
}
