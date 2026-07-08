package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import android.app.Activity;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PhotoModeEditingStage;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import zoo.b;

/* JADX INFO: renamed from: X.0Er1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377450Er1 extends AbstractC381020Ewm<InterfaceC377490Er5> implements InterfaceC377490Er5, InterfaceC379610EuV {
    public static final C377500Er6 LLJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public static final int LLJLL;
    public final C1DRG LLILLL;
    public final C19A3 LLILZ;
    public final C372830EjZ LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public InterfaceC377480Er4 LLJJI;
    public final int LLJJIII;
    public final int LLJJIJI;
    public final int LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C377460Er2 LLJL;

    public InterfaceC377490Er5 Z1() {
        return this;
    }

    @Override // X.InterfaceC377490Er5
    public void uw1() {
        this.LLJJJJJIL = false;
        E3();
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0Er6] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C377450Er1.class, "asyncTasksManagerApi", "getAsyncTasksManagerApi()Lcom/ss/android/ugc/gamora/editorpro/components/asyncedit/api/AsyncTasksManagerApi;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C377450Er1.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C377450Er1.class, "previewPanelApi", "getPreviewPanelApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0), new C2217381BqS(C377450Er1.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new C2217381BqS(C377450Er1.class, "videoEditScene", "getVideoEditScene()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoEditContainerScene;", 0), new C2217381BqS(C377450Er1.class, "editorProStickerEngineApi", "getEditorProStickerEngineApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/engine/EditorProStickerEngineApi;", 0), new C2217381BqS(C377450Er1.class, "epStateApi", "getEpStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0), new C2217381BqS(C377450Er1.class, "epLegacyApi", "getEpLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0), new C2217381BqS(C377450Er1.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0), new C2217381BqS(C377450Er1.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0)};
        LLJLIL = new Object() { // from class: X.0Er6
        };
        LLJLL = 8;
    }

    private final InterfaceC1460000o62 H2() {
        return (InterfaceC1460000o62) this.LLJJ.getValue(this, LLJLILLLLZIIL[9]);
    }

    private final C0EC7 c3() {
        return (C0EC7) this.LLJILJILJ.getValue(this, LLJLILLLLZIIL[7]);
    }

    private final C0EY2 i3() {
        return (C0EY2) this.LLJILLL.getValue(this, LLJLILLLLZIIL[8]);
    }

    private final InterfaceC359950E9h m3() {
        return (InterfaceC359950E9h) this.LLJILJIL.getValue(this, LLJLILLLLZIIL[6]);
    }

    public final List<View> G2() {
        return (List) this.LLJJIJIL.getValue();
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLIZ.getValue(this, LLJLILLLLZIIL[1]);
    }

    public final InterfaceC377540ErA T2() {
        return (InterfaceC377540ErA) this.LLJ.getValue(this, LLJLILLLLZIIL[3]);
    }

    public final C0EOK W2() {
        return (C0EOK) this.LLJIJIL.getValue(this, LLJLILLLLZIIL[5]);
    }

    public final C377510Er7 X1() {
        return (C377510Er7) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final VideoPublishEditModel bb2() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    @Override // X.InterfaceC377490Er5
    public boolean lu() {
        return this.LLJJJIL || this.LLJJJJ;
    }

    public final InterfaceC376450EpP o2() {
        return (InterfaceC376450EpP) this.LLILZLL.getValue(this, LLJLILLLLZIIL[0]);
    }

    public final InterfaceC361710EGb q3() {
        return (InterfaceC361710EGb) this.LLIZLLLIL.getValue(this, LLJLILLLLZIIL[2]);
    }

    public final VideoEditContainerScene v3() {
        return (VideoEditContainerScene) this.LLJI.getValue(this, LLJLILLLLZIIL[4]);
    }

    public final AsyncTasksPanelViewModel w2() {
        return (AsyncTasksPanelViewModel) this.LLJJL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void E3() {
        /*
            r5 = this;
            X.0EY2 r0 = r5.i3()
            if (r0 == 0) goto L83
            androidx.lifecycle.LiveData r0 = r0.zu2()
            if (r0 == 0) goto L83
            java.lang.Object r3 = r0.getValue()
            X.0EHI r3 = (X.C0EHI) r3
            if (r3 == 0) goto L83
            X.0ELJ r0 = r3.LJ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r0.getEditModel()
            X.0ELJ r0 = r3.LJ
            java.lang.String r1 = r0.getEnterFrom()
            java.lang.String r0 = "enter_from_edit_root_adjust_clips"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r2 = 1
            r1 = 0
            if (r0 != 0) goto L61
            boolean r0 = X.C365940EWi.LIZ(r4)
            if (r0 != 0) goto L61
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.edit.u4.LJJIL(r4)
            if (r0 != 0) goto L61
            boolean r0 = X.C1416310mxZ.LJJJJIZL(r4)
            if (r0 != 0) goto L61
            X.0EMy r0 = X.C363500EMy.LIZ
            r0.getClass()
            if (r4 == 0) goto L86
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r0 = r4.getEditorProModel()
            int r0 = r0.getFromEditType()
            if (r0 == 0) goto L57
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r0 = r4.getEditorProModel()
            int r0 = r0.getFromEditType()
            if (r0 != r2) goto L86
        L57:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r4.creativeModel
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCInfoModel r0 = r0.editorProAIGCInfoModel
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.TaskInfoInCreativeModel r0 = r0.taskInfoInCreativeModel
            boolean r0 = r0.needBlockLeaveEditorPro
            if (r0 == 0) goto L86
        L61:
            r4 = 1
        L62:
            boolean r0 = X.C0E50.LIZ
            if (r0 == 0) goto L77
            if (r4 == 0) goto L84
            X.0EHJ r0 = r3.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LIZ
            com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel r0 = r0.getEditorProModel()
            boolean r0 = r0.isAdvancedEdit()
            if (r0 == 0) goto L84
        L76:
            r4 = r2
        L77:
            X.0ELJ r0 = r3.LJ
            boolean r0 = r0.getEffectMultiTrackMode()
            if (r0 != 0) goto L80
            r1 = r4
        L80:
            r5.Sl(r1)
        L83:
            return
        L84:
            r2 = 0
            goto L76
        L86:
            r4 = 0
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377450Er1.E3():void");
    }

    public final void B3() {
        CreativeModel creativeModel;
        PhotoModeEditingStage photoModeEditingStage;
        CreativeModel creativeModel2;
        PhotoModeEditingStage photoModeEditingStage2;
        InterfaceC1460000o62 interfaceC1460000o62H2 = H2();
        if (interfaceC1460000o62H2 != null) {
            interfaceC1460000o62H2.rm(21, true);
            interfaceC1460000o62H2.refresh();
        }
        VideoPublishEditModel videoPublishEditModelBb2 = bb2();
        String str = (videoPublishEditModelBb2 == null || videoPublishEditModelBb2.getOrigin() != 0) ? "shoot" : "upload";
        VideoPublishEditModel videoPublishEditModelBb22 = bb2();
        String str2 = videoPublishEditModelBb22 != null ? videoPublishEditModelBb22.mShootWay : null;
        VideoPublishEditModel videoPublishEditModelBb23 = bb2();
        String creationId = videoPublishEditModelBb23 != null ? videoPublishEditModelBb23.getCreationId() : null;
        VideoPublishEditModel videoPublishEditModelBb24 = bb2();
        boolean z = (videoPublishEditModelBb24 == null || (creativeModel2 = videoPublishEditModelBb24.creativeModel) == null || (photoModeEditingStage2 = creativeModel2.photoModeEnterEditingStage) == null) ? false : photoModeEditingStage2.isFromMultiPhotoContent;
        VideoPublishEditModel videoPublishEditModelBb25 = bb2();
        boolean z2 = (videoPublishEditModelBb25 == null || (creativeModel = videoPublishEditModelBb25.creativeModel) == null || (photoModeEditingStage = creativeModel.photoModeEnterEditingStage) == null) ? false : photoModeEditingStage.isFromMultiPhotoSpecialPage;
        VideoPublishEditModel videoPublishEditModelBb26 = bb2();
        C1417710mzp.LJJIJ(str, "video_edit_page", str2, creationId, null, z, z2, videoPublishEditModelBb26 != null ? videoPublishEditModelBb26.creativeModel.draftInfoModel.isDraft : false, null, 272);
    }

    public final void H3() {
        VideoPublishEditModel videoPublishEditModelBb2;
        EditorProModel editorProModel;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tool_offline_editor_guidance_sticker", true) == 1) {
            return;
        }
        VideoPublishEditModel videoPublishEditModelBb22 = bb2();
        if (videoPublishEditModelBb22 != null) {
            C1414930mvL.LIZ.getClass();
            if (C1414930mvL.LJII(videoPublishEditModelBb22, false)) {
                return;
            }
        }
        if (this.LLJJJJLIIL || (videoPublishEditModelBb2 = bb2()) == null || (editorProModel = videoPublishEditModelBb2.getEditorProModel()) == null || !editorProModel.getFromEditorProEntranceInAlbum()) {
            return;
        }
        boolean zLIZIZ = C363750ENx.LIZIZ("show_slide_up_guide_key");
        InterfaceC372680EjK interfaceC372680EjK = (InterfaceC372680EjK) getDiContainer().LJIIL(null, InterfaceC372680EjK.class);
        if (zLIZIZ) {
            return;
        }
        if (interfaceC372680EjK != null) {
            interfaceC372680EjK.pk1(true);
        }
        C363750ENx.LJ("show_slide_up_guide_key");
        this.LLJJJJLIIL = true;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Unit> liveEventJI;
        LiveData<Boolean> liveDataQO0;
        super.onCreate();
        InterfaceC359950E9h interfaceC359950E9hM3 = m3();
        if (interfaceC359950E9hM3 != null && (liveDataQO0 = interfaceC359950E9hM3.QO0()) != null) {
            liveDataQO0.observe(this, new AObserverS209S0100000_5(this, 119));
        }
        InterfaceC359950E9h interfaceC359950E9hM32 = m3();
        if (interfaceC359950E9hM32 == null || (liveEventJI = interfaceC359950E9hM32.JI()) == null) {
            return;
        }
        liveEventJI.LIZ(this, new AObjectS240S0100000_5(this, 148));
    }

    @Override // X.InterfaceC377490Er5
    public boolean TN() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC377490Er5
    public void Sl(boolean z) {
        this.LLJJJ = z;
    }

    @Override // X.InterfaceC377490Er5
    public void XL1(InterfaceC377530Er9 interfaceC377530Er9) {
        X1().LJIIJJI = interfaceC377530Er9;
    }

    @Override // X.InterfaceC377490Er5
    public void zX0(InterfaceC377480Er4 interfaceC377480Er4) {
        this.LLJJI = interfaceC377480Er4;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [X.0Er2] */
    public C377450Er1(C1DRG c1drg, C19A3 c19a3, C372830EjZ c372830EjZ) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = c19a3;
        this.LLILZIL = c372830EjZ;
        this.LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC376450EpP.class, null);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC377540ErA.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), VideoEditContainerScene.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EOK.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC359950E9h.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), C0EC7.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 950));
        this.LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 949));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 948));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(c19a3.requireSceneContext());
        this.LLJJIII = viewConfiguration.getScaledTouchSlop();
        this.LLJJIJIIJIL = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LLJJIJI = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LLJL = new AbstractC385780FAq() { // from class: X.0Er2
            public boolean LL;
            public boolean LLILLJJLI;
            public float LLILLL;
            public float LLILZIL;
            public VelocityTracker LLILZLL;
            public float LLIZ;
            public MotionEvent LLJ;
            public boolean LLJI;
            public boolean LLILZ = true;
            public boolean LLIZLLLIL = true;
            public final int LLJIJIL = C0EVU.SLIDE_OUT_EP_PAGE.getPriority();

            public final void LJJIJL() {
                this.LLILLL = 0.0f;
                this.LLILZ = true;
                this.LL = false;
                VelocityTracker velocityTracker = this.LLILZLL;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                this.LLILZLL = null;
                this.LLIZ = 0.0f;
                this.LLJILJIL.LLJJJJ = false;
                this.LLILLJJLI = false;
                this.LLIZLLLIL = true;
            }

            @Override // X.AbstractC385780FAq
            public final int getPriority() {
                return this.LLJIJIL;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void LJFF(b bVar) {
                boolean z;
                C377450Er1 c377450Er1 = this.LLJILJIL;
                if (c377450Er1.LLJJJ && this.LLIZLLLIL && !c377450Er1.LLJJJIL) {
                    InterfaceC376450EpP interfaceC376450EpPO2 = c377450Er1.o2();
                    boolean z2 = false;
                    if (interfaceC376450EpPO2 != null && interfaceC376450EpPO2.bZ()) {
                        return;
                    }
                    if (this.LL && !this.LLILLJJLI) {
                        z = true;
                    } else {
                        z = false;
                    }
                    VelocityTracker velocityTracker = this.LLILZLL;
                    if (velocityTracker != null) {
                        velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LLJILJIL.LLJJIJI);
                    }
                    VelocityTracker velocityTracker2 = this.LLILZLL;
                    if (velocityTracker2 != null) {
                        float yVelocity = velocityTracker2.getYVelocity();
                        if (yVelocity > 0.0f && Math.abs(yVelocity) > this.LLJILJIL.LLJJIJIIJIL) {
                            z2 = true;
                        }
                    }
                    if (z) {
                        if (this.LLIZ < 0.7d && !z2) {
                            this.LLJILJIL.X1().LIZJ();
                        } else {
                            this.LLJILJIL.X1().LIZIZ();
                        }
                    }
                    LJJIJL();
                }
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void LJIJJ(MotionEvent motionEvent) {
                Integer numValueOf = null;
                this.LLJ = null;
                if (this.LLJI) {
                    List listLJIIJJI = C1697810uHb.LJIIJJI(3, 1);
                    if (motionEvent != null) {
                        numValueOf = Integer.valueOf(motionEvent.getActionMasked());
                    }
                    if (C13LP.LJJJJ(numValueOf, listLJIIJJI)) {
                        if (motionEvent != null && motionEvent.getActionMasked() == 3) {
                            this.LLJILJIL.X1().LIZJ();
                        }
                        this.LLJI = false;
                        LJJIJL();
                    }
                }
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final void LJJIJIIJIL(MotionEvent motionEvent) {
                this.LLJ = motionEvent;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLZLZ(b bVar) {
                PointF pointF;
                VelocityTracker velocityTracker;
                boolean z;
                List<? extends View> listLIZ;
                C372830EjZ c372830EjZ2;
                float first;
                float second;
                INLEMediaRuntime mediaRuntimeApi;
                C1455260nyO c1455260nyO;
                if (bVar == null || (pointF = bVar.LJIIJJI) == null) {
                    return false;
                }
                float f = pointF.y;
                float f2 = pointF.x;
                float f3 = this.LLILLL + f;
                this.LLILLL = f3;
                if (!this.LL) {
                    C377450Er1 c377450Er1 = this.LLJILJIL;
                    if (f3 < c377450Er1.LLJJIII) {
                        return false;
                    }
                    if (c377450Er1.T2().getSaveType() != EnumC376530EpX.DIRECT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LLILLJJLI = z;
                    if (z) {
                        this.LLJILJIL.T2().qL0(true);
                    } else {
                        C377450Er1 c377450Er12 = this.LLJILJIL;
                        c377450Er12.LLJJJJ = true;
                        Scene scene = c377450Er12.LLILZ.mParentScene;
                        PairIntInt initSize = null;
                        if (!(scene instanceof C1455260nyO) || (c1455260nyO = (C1455260nyO) scene) == null || (listLIZ = C379540EuO.LIZ(c1455260nyO)) == null) {
                            listLIZ = C13BV.INSTANCE;
                        }
                        C377510Er7 c377510Er7X1 = this.LLJILJIL.X1();
                        SurfaceView surfaceViewLJIJJLI = this.LLJILJIL.q3().LJIJJLI();
                        C377450Er1 c377450Er13 = this.LLJILJIL;
                        C372830EjZ c372830EjZ3 = c377450Er13.LLILZIL;
                        InterfaceC361710EGb interfaceC361710EGbQ3 = c377450Er13.q3();
                        C0EOK c0eokW2 = this.LLJILJIL.W2();
                        c377510Er7X1.LJFF = surfaceViewLJIJJLI;
                        c377510Er7X1.LJI = c372830EjZ3;
                        c377510Er7X1.LJ = listLIZ;
                        c377510Er7X1.LJII = interfaceC361710EGbQ3;
                        c377510Er7X1.LJIIIIZZ = c0eokW2;
                        C0E48 c0e48W1 = this.LLJILJIL.W1();
                        if (c0e48W1 != null) {
                            float[] fArrLLJLLIL = c0e48W1.getPlayer().LLJLLIL();
                            if (fArrLLJLLIL != null) {
                                c0e48W1.getPlayer().LJIILJJIL(fArrLLJLLIL[0], fArrLLJLLIL[1], fArrLLJLLIL[2], fArrLLJLLIL[3], null);
                            }
                            float[] fArrLLJLLIL2 = c0e48W1.getPlayer().LLJLLIL();
                            if (fArrLLJLLIL2 == null) {
                                fArrLLJLLIL2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
                            }
                            int[] iArr = {(int) fArrLLJLLIL2[0], (int) fArrLLJLLIL2[1], (int) fArrLLJLLIL2[2], (int) fArrLLJLLIL2[3]};
                            C377510Er7 c377510Er7X12 = this.LLJILJIL.X1();
                            View view = c377510Er7X12.LJFF;
                            if (view != null && (c372830EjZ2 = c377510Er7X12.LJI) != null) {
                                float fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(C301770BsF.LIZ()));
                                if (c377510Er7X12.LJIIIZ) {
                                    c377510Er7X12.LIZJ = new C377520Er8(new Pair(Float.valueOf(view.getScaleX()), Float.valueOf(1.0f)), new Pair(Float.valueOf(view.getScaleY()), Float.valueOf(1.0f)), new Pair(Float.valueOf(view.getTranslationY()), Float.valueOf(-0.0f)), new Pair(Float.valueOf(0.0f), Float.valueOf(((view.getHeight() - (view.getHeight() * view.getScaleY())) / 2) + Math.abs(view.getTranslationY()))), new Pair(Float.valueOf(1.0f), Float.valueOf(0.0f)), new Pair(Float.valueOf(0.0f), Float.valueOf(1.0f)), view.getScaleX(), view.getTranslationY(), new Pair(Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(20.0f))), Float.valueOf(fLIZIZ)));
                                } else {
                                    int i = iArr[1];
                                    int i2 = iArr[2];
                                    int i3 = iArr[3];
                                    INLEMediaSession iNLEMediaSession = (INLEMediaSession) c377510Er7X12.LJIIJ.getValue();
                                    if (iNLEMediaSession != null && (mediaRuntimeApi = iNLEMediaSession.getMediaRuntimeApi()) != null) {
                                        initSize = mediaRuntimeApi.getInitSize();
                                    }
                                    float f4 = i2;
                                    if (initSize != null) {
                                        first = initSize.getFirst();
                                    } else {
                                        first = f4;
                                    }
                                    float f5 = f4 / first;
                                    float f6 = i3;
                                    if (initSize != null) {
                                        second = initSize.getSecond();
                                    } else {
                                        second = f6;
                                    }
                                    c377510Er7X12.LIZJ = new C377520Er8(new Pair(Float.valueOf(f5), Float.valueOf(1.0f)), new Pair(Float.valueOf(f6 / second), Float.valueOf(1.0f)), new Pair(Float.valueOf(-((new PointF(view.getWidth() / 2.0f, view.getHeight() / 2.0f).y - (i3 / 2)) - i)), Float.valueOf(0.0f)), new Pair(Float.valueOf(0.0f), Float.valueOf(c372830EjZ2.getControlLayout().getLayoutParams().height)), new Pair(Float.valueOf(1.0f), Float.valueOf(0.0f)), new Pair(Float.valueOf(0.0f), Float.valueOf(1.0f)), new Pair(Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(20.0f))), Float.valueOf(fLIZIZ)));
                                }
                            }
                            C373000Ejq.LIZ(this.LLJILJIL.LLILZIL, false);
                            this.LLILZIL = this.LLJILJIL.LLILZIL.getControlLayout().getLayoutParams().height;
                            VelocityTracker velocityTrackerObtain = this.LLILZLL;
                            if (velocityTrackerObtain == null) {
                                velocityTrackerObtain = VelocityTracker.obtain();
                            }
                            this.LLILZLL = velocityTrackerObtain;
                            if (velocityTrackerObtain != null) {
                                velocityTrackerObtain.clear();
                            }
                            this.LL = true;
                            System.currentTimeMillis();
                            C1456140nzo.LIZIZ(this.LLJILJIL.JY0(), true, false, false, false, 12);
                            System.currentTimeMillis();
                            InterfaceC377480Er4 interfaceC377480Er4 = this.LLJILJIL.LLJJI;
                            if (interfaceC377480Er4 != null) {
                                interfaceC377480Er4.LIZIZ(EnumC377550ErB.SLIDE_OUT);
                            }
                            C0E69.LIZ(c0e48W1, false, false, 0L, null, 28);
                            this.LLJILJIL.T2().yC2();
                            this.LLJILJIL.X1().getClass();
                        }
                    }
                }
                float fMax = Math.max(0.0f, Math.min(this.LLILLL + f2, this.LLILZIL));
                float f7 = this.LLILLL;
                float f8 = this.LLILZIL;
                if (f7 >= f8 && fMax >= f8) {
                    return true;
                }
                this.LLILLL = fMax;
                this.LLIZ = fMax / f8;
                this.LLJILJIL.X1().LIZLLL(this.LLIZ);
                MotionEvent motionEvent = this.LLJ;
                if (motionEvent != null && (velocityTracker = this.LLILZLL) != null) {
                    velocityTracker.addMovement(motionEvent);
                    return true;
                }
                return true;
            }

            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean LLLLLLLLL(b bVar, float f, float f2) {
                C377270Eqj c377270Eqj;
                C2252321DDq c2252321DDq;
                VideoPublishEditModel videoPublishEditModelBb2;
                String strLJJIJIIJI;
                VideoPublishEditModel videoPublishEditModelBb22;
                LJJIJL();
                NLEModel nLEModelLJI = null;
                if (((Boolean) C0B90.LIZ.getValue()).booleanValue() && (((videoPublishEditModelBb2 = this.LLJILJIL.bb2()) == null || !videoPublishEditModelBb2.isUploadVideo()) && !C1416310mxZ.LJJJJIZL(this.LLJILJIL.bb2()))) {
                    VideoPublishEditModel videoPublishEditModelBb23 = this.LLJILJIL.bb2();
                    if (videoPublishEditModelBb23 != null) {
                        strLJJIJIIJI = C1416310mxZ.LJJIJIIJI(videoPublishEditModelBb23, null, true);
                    } else {
                        strLJJIJIIJI = null;
                    }
                    if (!C1533950q1J.LJ(strLJJIJIIJI) || ((videoPublishEditModelBb22 = this.LLJILJIL.bb2()) != null && Intrinsics.LJFF(C1416310mxZ.LJJIJIIJI(videoPublishEditModelBb22, null, true), C1412630mrd.LIZLLL(EnumC1412640mre.CUT_SAME)))) {
                        this.LLIZLLLIL = false;
                    }
                }
                C377450Er1 c377450Er1 = this.LLJILJIL;
                if (!c377450Er1.LLJJJ || !this.LLIZLLLIL || c377450Er1.LLJJJIL || c377450Er1.LLJJJJJIL || this.LLILLJJLI) {
                    return false;
                }
                InterfaceC376450EpP interfaceC376450EpPO2 = c377450Er1.o2();
                if (interfaceC376450EpPO2 != null && interfaceC376450EpPO2.bZ()) {
                    if (!this.LL && this.LLILZ) {
                        this.LLILZ = false;
                        AsyncTasksPanelViewModel asyncTasksPanelViewModelW2 = this.LLJILJIL.w2();
                        if (asyncTasksPanelViewModelW2 != null && (c2252321DDq = asyncTasksPanelViewModelW2.LLILZIL) != null) {
                            c377270Eqj = (C377270Eqj) c2252321DDq.getValue();
                        } else {
                            c377270Eqj = null;
                        }
                        C377150EqX c377150EqX = C377150EqX.LIZ;
                        VideoPublishEditModel videoPublishEditModelBb24 = this.LLJILJIL.bb2();
                        C0E48 c0e48W1 = this.LLJILJIL.W1();
                        if (c0e48W1 != null) {
                            nLEModelLJI = C350870DpF.LJI(c0e48W1);
                        }
                        if (!C377150EqX.LJIJ(videoPublishEditModelBb24, nLEModelLJI) && !C377240Eqg.LIZ(c377270Eqj)) {
                            Activity activity = this.LLJILJIL.LLILZ.mActivity;
                            if (activity != null) {
                                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                                c1389890mGx.LJIIIZ(2131825404);
                                c1389890mGx.LJIIJJI();
                            }
                            C377120EqU c377120EqU = C377120EqU.LIZ;
                            VideoPublishEditModel videoPublishEditModelBb25 = this.LLJILJIL.bb2();
                            C0E48 c0e48W12 = this.LLJILJIL.W1();
                            c377120EqU.getClass();
                            C377120EqU.LJIILJJIL(videoPublishEditModelBb25, c0e48W12, "scroll_up");
                        } else {
                            Activity activity2 = this.LLJILJIL.LLILZ.mActivity;
                            if (activity2 != null) {
                                C1389890mGx c1389890mGx2 = new C1389890mGx(activity2);
                                c1389890mGx2.LJIIIZ(2131825399);
                                c1389890mGx2.LJIIJJI();
                                return false;
                            }
                        }
                    }
                    return false;
                }
                this.LLJI = true;
                return true;
            }
        };
    }
}
