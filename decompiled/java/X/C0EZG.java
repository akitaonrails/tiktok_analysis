package X;

import Y.ALAdapterS2S0100000_5;
import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.gamora.editorpro.model.EditorProCancelData;
import com.ss.android.ugc.gamora.editorpro.model.EditorProSaveData;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0EZG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EZG extends AbstractC381020Ewm<C0EYP> implements C0EYP, InterfaceC379610EuV {
    public static final C0EZI LLJJIJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C1DRG LLILLL;
    public final Bundle LLILZ;
    public final Function0<C1462070o9N> LLILZIL;
    public final C0EZG LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final long LLJJ;
    public final h0<C0EHC> LLJJI;
    public final C385670FAf<C0EHC> LLJJIII;

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0EZI] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0EZG.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0EZG.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C0EZG.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C2217381BqS(C0EZG.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0), new C2217381BqS(C0EZG.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new C2217381BqS(C0EZG.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0), new C2217381BqS(C0EZG.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0), new C2217381BqS(C0EZG.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0)};
        LLJJIJI = new Object() { // from class: X.0EZI
        };
        LLJJIJIL = 8;
    }

    private final InterfaceC1453430nvR G2() {
        return (InterfaceC1453430nvR) this.LLJILJIL.getValue(this, LLJJIJIIJIL[5]);
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLIZ.getValue(this, LLJJIJIIJIL[0]);
    }

    private final InterfaceC1455850nzL Z1() {
        return (InterfaceC1455850nzL) this.LLJIJIL.getValue(this, LLJJIJIIJIL[4]);
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLJ.getValue(this, LLJJIJIIJIL[2]);
    }

    private final InterfaceC1413540mt6 i3() {
        return (InterfaceC1413540mt6) this.LLJILLL.getValue(this, LLJJIJIIJIL[7]);
    }

    private final VideoPublishEditModel m3() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJJIJIIJIL[1]);
    }

    private final InterfaceC1453760nvy o2() {
        return (InterfaceC1453760nvy) this.LLJILJILJ.getValue(this, LLJJIJIIJIL[6]);
    }

    private final InterfaceC1455500nym w2() {
        return (InterfaceC1455500nym) this.LLJI.getValue(this, LLJJIJIIJIL[3]);
    }

    @Override // X.C0EYP
    public C1462070o9N lb2() {
        return this.LLILZIL.invoke();
    }

    private final InterfaceC1461660o8i B3() {
        return Z1().AT().LIZJ();
    }

    private final InterfaceC1461350o8D H2() {
        return Z1().TI1().LIZJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        r10.add(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void H3() {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EZG.H3():void");
    }

    private final InterfaceC1452170ntP T2() {
        return JY0().g().getValue();
    }

    private final C348100Dkm W2() {
        InterfaceC1452170ntP interfaceC1452170ntPT2 = T2();
        if (interfaceC1452170ntPT2 instanceof C1463670oBx) {
            return ((C1463670oBx) interfaceC1452170ntPT2).LIZLLL();
        }
        return null;
    }

    private final InterfaceC377540ErA c3() {
        return Z1().TF().LIZJ();
    }

    @Override // X.C0EYP
    public Bundle Uy0() {
        Scene scene;
        if ((C301790BsH.LIZ() || !C1428470nHB.LJJLIIIJLLLLLLLZ(m3())) && (scene = (Scene) getDiContainer().LJIIL(null, VideoEditContainerScene.class)) != null) {
            return scene.mArguments;
        }
        return null;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Z1().uj1(this);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        Z1().uj1(null);
    }

    @Override // X.C0EYP
    public Bundle t72() {
        if (C301790BsH.LIZ() || !C1428470nHB.LJJLIIIJLLLLLLLZ(m3())) {
            return this.LLILZ;
        }
        return null;
    }

    public C0EZG X1() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public final Bundle q3() {
        return this.LLILZ;
    }

    @Override // X.C0EYP
    public C385670FAf<C0EHC> uy1() {
        return this.LLJJIII;
    }

    public final Function0<C1462070o9N> v3() {
        return this.LLILZIL;
    }

    @Override // X.C0EYP
    public void a21(C0EHC c0ehc) {
        this.LLJJI.LJII(c0ehc);
    }

    @Override // X.C0EYP
    public void ek2(ArrayList<Pair<String, String>> arrayList) {
        C1455260nyO c1455260nyO;
        Integer numValueOf = null;
        if (arrayList != null && (c1455260nyO = (C1455260nyO) getDiContainer().LJIIL(null, C1455260nyO.class)) != null) {
            C364440EQo c364440EQo = new C364440EQo(arrayList);
            VideoPublishEditModel videoPublishEditModel = c1455260nyO.LLLFZ;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            if (C289250BVj.LIZ(videoPublishEditModel)) {
                if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
                    c1455260nyO.i.LJII(c364440EQo);
                } else {
                    C0EPM c0epm = (C0EPM) c1455260nyO.LLLLLLL.getValue();
                    if (c0epm != null) {
                        c0epm.LLJJL(c364440EQo);
                    }
                }
            } else {
                c1455260nyO.h = c364440EQo;
            }
            InterfaceC1456910o13 interfaceC1456910o13 = c1455260nyO.LLLLIIL;
            if (interfaceC1456910o13 != null) {
                interfaceC1456910o13.Z30(c1455260nyO.f());
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditRootScene -> restoreCaptions -> captionList.size = ");
        if (arrayList != null) {
            numValueOf = Integer.valueOf(arrayList.size());
        }
        sbLIZ.append(numValueOf);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0EYP
    public void nW1(int i) {
        NowsExtra nowsExtra;
        if (!C1428470nHB.LJJLIIIJLLLLLLLZ(m3())) {
            return;
        }
        C1455260nyO c1455260nyO = (C1455260nyO) getDiContainer().LJIIL(null, C1455260nyO.class);
        NowsShootModel nowsShootModel = m3().creativeModel.nowsShootModel;
        if (nowsShootModel != null && (nowsExtra = nowsShootModel.nowsExtra) != null && nowsExtra.is9To16Ratio) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(C578100Mls.LIZJ(getActivity()), i);
        valueAnimatorOfInt.setInterpolator(new C21388418n4());
        valueAnimatorOfInt.setDuration(this.LLJJ);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS255S0100000_5(c1455260nyO, 14));
        valueAnimatorOfInt.start();
    }

    private final void E3(EditorProCancelData editorProCancelData, InterfaceC1452170ntP interfaceC1452170ntP) {
        NLEModel model;
        NLEEditor nLEEditor;
        NLEModel model2;
        NLEEditor nLEEditor2;
        C363500EMy c363500EMy = C363500EMy.LIZ;
        VideoPublishEditModel videoPublishEditModelM3 = m3();
        C348100Dkm c348100DkmW2 = W2();
        AbstractC1452680nuE abstractC1452680nuEGc = JY0().gc();
        c363500EMy.getClass();
        C0EXR.LIZ.getClass();
        if (editorProCancelData != null && abstractC1452680nuEGc != null) {
            if (C389790FQb.LIZIZ) {
                C389790FQb.LIZ.getClass();
                C389790FQb.LIZ(videoPublishEditModelM3, false);
                MvCreateVideoData mvCreateVideoData = videoPublishEditModelM3.getMvCreateVideoData();
                if (mvCreateVideoData != null) {
                    abstractC1452680nuEGc.LJJ().Df(mvCreateVideoData.resDestWidth, mvCreateVideoData.resDestHeight, mvCreateVideoData.resFillMode);
                }
                videoPublishEditModelM3.setMultiEditVideoRecordData(null);
            }
            if (C0E50.LIZ) {
                C0E50.LIZ = false;
                videoPublishEditModelM3.setMultiEditVideoRecordData(null);
            }
            if ((videoPublishEditModelM3.isRetakeVideo() || videoPublishEditModelM3.isPhotoMvMode() || videoPublishEditModelM3.getCanvasVideoData() != null) && !TextUtils.isEmpty(C363500EMy.LIZLLL)) {
                videoPublishEditModelM3.setNleData(C363500EMy.LIZLLL);
                abstractC1452680nuEGc.LJJIFFI(C363500EMy.LIZLLL, true);
            }
            C1452640nuA.LJII(C363500EMy.LJFF, false, videoPublishEditModelM3.creativeModel.musicBuzModel);
            C0EYH.LIZ.getClass();
            C0EYH.LIZIZ(videoPublishEditModelM3);
            MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModelM3.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData != null) {
                MultiEditVideoRecordData multiEditVideoRecordData2 = editorProCancelData.curMultiEditData;
                if (multiEditVideoRecordData2 != null) {
                    multiEditVideoRecordData.curMultiEditVideoRecordData = multiEditVideoRecordData2;
                } else {
                    C356530DyN.LIZJ(C0E6U.LIZIZ, "handleCancel --> curMultiEditVideoRecordData = null");
                }
                multiEditVideoRecordData.isMultiEditRetake = editorProCancelData.isRetake;
            }
            NLEModel nLEModel = C363500EMy.LJ;
            if (C301680Bs6.LIZ() && C363500EMy.LIZLLL == null && nLEModel != null) {
                if (c348100DkmW2 != null && (nLEEditor2 = c348100DkmW2.LIZ) != null) {
                    nLEEditor2.setModel(nLEModel);
                    C363500EMy.LIZ(nLEEditor2.getModel(), false);
                    c348100DkmW2.LIZ.commit();
                    c348100DkmW2.LIZ.done();
                }
            } else if (c348100DkmW2 != null) {
                NLEEditor nLEEditor3 = c348100DkmW2.LIZ;
                if (nLEEditor3 != null && (model2 = nLEEditor3.getModel()) != null) {
                    videoPublishEditModelM3.setNleModel(model2);
                    c348100DkmW2.LIZIZ.setDataSource(model2);
                }
                NLEEditor nLEEditor4 = c348100DkmW2.LIZ;
                if (nLEEditor4 != null) {
                    nLEEditor4.commit();
                }
            }
            C363500EMy.LIZLLL = null;
            C363500EMy.LJFF = null;
            C363500EMy.LJ = null;
            C363500EMy.LIZJ = null;
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "disable_ep_cancel_back_edit_with_filter_sync", true, false)) {
            VideoPublishEditModel videoPublishEditModelM32 = m3();
            C348100Dkm c348100DkmW22 = W2();
            if (c348100DkmW22 != null && (nLEEditor = c348100DkmW22.LIZ) != null) {
                model = nLEEditor.getModel();
            } else {
                model = null;
            }
            InterfaceC1453430nvR interfaceC1453430nvRG2 = G2();
            if (model != null && C349760DnS.LIZ(videoPublishEditModelM32, model)) {
                List<NLESegmentComposerFilter> listLJJJJLL = C351220Dpo.LJJJJLL(model);
                int size = listLJJJJLL.size();
                if (size != 0) {
                    if (size != 1) {
                        interfaceC1453430nvRG2.l4(false);
                    } else {
                        FilterBean filterBeanLIZ = C366420EYe.LIZ((NLESegmentComposerFilter) ListProtector.get(listLJJJJLL, 0));
                        if (filterBeanLIZ != null) {
                            C0CHQ.LIZ().LJJIL().LIZIZ().LJJIIJZLJL(Collections.singletonList(new C1639650sln(filterBeanLIZ.getId(), EnumC1641340soW.FILTER_STATE_DOWNLOAD_SUCCESS, filterBeanLIZ.getFilterFilePath(), filterBeanLIZ.getFilterFolder())));
                            interfaceC1453430nvRG2.Dq2(new C1453000nuk(true, filterBeanLIZ, true, (String) null, true, 8), false, null, true);
                        }
                    }
                } else {
                    interfaceC1453430nvRG2.l4(true);
                }
            }
        }
        InterfaceC1455500nym interfaceC1455500nymW2 = w2();
        if (interfaceC1455500nymW2 != null) {
            interfaceC1455500nymW2.mR0();
        }
        if (m3().creativeModel.audioCopyrightDetectModel.getDetectResults() == null) {
            InterfaceC1453760nvy interfaceC1453760nvyO2 = o2();
            if (interfaceC1453760nvyO2 != null) {
                interfaceC1453760nvyO2.a31();
            }
            InterfaceC1413540mt6 interfaceC1413540mt6I3 = i3();
            if (interfaceC1413540mt6I3 != null) {
                interfaceC1413540mt6I3.lz(null);
            }
        }
        C356610DyV c356610DyV = C1455260nyO.A;
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        VideoPublishEditModel videoPublishEditModelM33 = m3();
        c356610DyV.getClass();
        C356610DyV.LIZIZ(videoPublishEditModelM33, interfaceC1446740nkeJY0);
        C361680EFy.LJJIIZI(m3(), C352130DrH.LIZ(interfaceC1452170ntP), interfaceC1452170ntP.getDuration(), !editorProCancelData.exitByBackPressed);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0206  */
    @Override // X.C0EYP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Dy0(com.bytedance.scene.Scene r21, X.C0EZH r22) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EZG.Dy0(com.bytedance.scene.Scene, X.0EZH):void");
    }

    @Override // X.C0EYP
    public void hg2(int i, Function0<Unit> function0) {
        NowsExtra nowsExtra;
        if (!C1428470nHB.LJJLIIIJLLLLLLLZ(m3())) {
            return;
        }
        C1455260nyO c1455260nyO = (C1455260nyO) getDiContainer().LJIIL(null, C1455260nyO.class);
        NowsShootModel nowsShootModel = m3().creativeModel.nowsShootModel;
        if (nowsShootModel != null && (nowsExtra = nowsShootModel.nowsExtra) != null && nowsExtra.is9To16Ratio) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, C578100Mls.LIZJ(getActivity()));
        valueAnimatorOfInt.setInterpolator(new C21388418n4());
        valueAnimatorOfInt.setDuration(this.LLJJ);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS255S0100000_5(c1455260nyO, 15));
        valueAnimatorOfInt.addListener(new ALAdapterS2S0100000_5(function0, 13));
        valueAnimatorOfInt.start();
    }

    @Override // X.C0EYP
    public void hs1(boolean z, VideoPublishEditModel videoPublishEditModel) {
        InterfaceC1465230oET interfaceC1465230oETNn1;
        C560530Lyd<Boolean> c560530LydQ60;
        InterfaceC1465230oET interfaceC1465230oETNn12;
        C560530Lyd<Boolean> c560530LydQ602;
        InterfaceC1459040o4U interfaceC1459040o4UQr2;
        if (!C1403850mdT.LJII(videoPublishEditModel)) {
            return;
        }
        if (z) {
            InterfaceC1461350o8D interfaceC1461350o8DH2 = H2();
            if (interfaceC1461350o8DH2 != null && (interfaceC1459040o4UQr2 = interfaceC1461350o8DH2.Qr2()) != null) {
                interfaceC1459040o4UQr2.Qj(null);
            }
            InterfaceC1461350o8D interfaceC1461350o8DH22 = H2();
            if (interfaceC1461350o8DH22 != null && (interfaceC1465230oETNn12 = interfaceC1461350o8DH22.Nn1()) != null && (c560530LydQ602 = interfaceC1465230oETNn12.Q60()) != null) {
                c560530LydQ602.LJIIIZ(Boolean.FALSE);
                return;
            }
            return;
        }
        InterfaceC1461350o8D interfaceC1461350o8DH23 = H2();
        if (interfaceC1461350o8DH23 == null || (interfaceC1465230oETNn1 = interfaceC1461350o8DH23.Nn1()) == null || (c560530LydQ60 = interfaceC1465230oETNn1.Q60()) == null) {
            return;
        }
        c560530LydQ60.LJIIIZ(Boolean.TRUE);
    }

    @Override // X.C0EYP
    public void iR1(EditorProCancelData editorProCancelData, boolean z) {
        byte b;
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) getDiContainer().LJIIL(null, VideoEditContainerScene.class);
        if (videoEditContainerScene != null) {
            if (editorProCancelData instanceof EditorProSaveData) {
                b = -1;
            } else {
                b = 0;
            }
            videoEditContainerScene.LLLLIIIILLL = false;
            if (videoEditContainerScene.LLLIIIL.g().getValue() != null) {
                videoEditContainerScene.LLLLLLLZIL();
                if (b == -1) {
                    if (videoEditContainerScene.LLLIIL == null) {
                        videoEditContainerScene.LLLIIL = ((InterfaceC1455850nzL) videoEditContainerScene.LLLFFI.LJII(InterfaceC1455850nzL.class, null)).TI1().LIZJ();
                    }
                    if (videoEditContainerScene.LLLILZ == null) {
                        videoEditContainerScene.LLLILZ = ((InterfaceC1455850nzL) videoEditContainerScene.LLLFFI.LJII(InterfaceC1455850nzL.class, null)).TF().LIZJ();
                    }
                }
            }
        }
        InterfaceC1452170ntP interfaceC1452170ntPT2 = T2();
        if (interfaceC1452170ntPT2 == null) {
            return;
        }
        interfaceC1452170ntPT2.setLoopPlay(true);
        E3(editorProCancelData, interfaceC1452170ntPT2);
        if (!u4.LJJIL(m3()) && !m3().creativeModel.imageEditModel.isVideoChildPageFromImage) {
            C1456140nzo.LIZIZ(JY0(), true, false, true, false, 8);
        }
        interfaceC1452170ntPT2.prepare();
        interfaceC1452170ntPT2.play();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0EZG(C1DRG c1drg, Bundle bundle, Function0<? extends C1462070o9N> function0) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = bundle;
        this.LLILZIL = function0;
        this.LLILZLL = this;
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455500nym.class, null);
        this.LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
        this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1453430nvR.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453760nvy.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413540mt6.class, null);
        this.LLJJ = 250L;
        h0<C0EHC> h0Var = new h0<>(null);
        this.LLJJI = h0Var;
        this.LLJJIII = h0Var;
    }
}
