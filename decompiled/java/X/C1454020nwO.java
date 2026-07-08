package X;

import Y.ARunnableS122S0100000_22;
import Y.ARunnableS33S0101000_22;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.CountDownTimer;
import android.view.View;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.cutsame.util.Size;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentMask;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.ImageVideoSharedModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverItem;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInnerImageInfo;
import com.ss.android.ugc.aweme.image.aicover.AICoverPluginService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import ge.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS145S0201000_22;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nwO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1454020nwO extends i<InterfaceC1452390ntl, AbstractC1664490tPr<C1454230nwj, C1454220nwi>, C1454230nwj, C1454220nwi> implements InterfaceC1452390ntl, InterfaceC379610EuV {
    public static final C1454520nxC LLJZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZIJLIL;
    public static final int LLL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public final Function0<AbstractC1664490tPr<C1454230nwj, C1454220nwi>> LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public SingleImageData LLJJIJIL;
    public C1450610nqt LLJJJ;
    public List<CollageInnerImageInfo> LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public DialogC1390150mHN LLJLL;
    public CountDownTimer LLJLLIL;
    public boolean LLJLLL;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0nxC] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1454020nwO.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJZIJLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1454020nwO.class, "imageAlbumData", "getImageAlbumData()Lcom/ss/android/ugc/aweme/creative/model/edit/ImageAlbumData;", 0), new C2217381BqS(C1454020nwO.class, "imageProgressApi", "getImageProgressApi()Lcom/ss/android/ugc/aweme/image/progressbar/ImageProgressApi;", 0), new C2217381BqS(C1454020nwO.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0), new C2217381BqS(C1454020nwO.class, "isolateClipEditApi", "getIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0), new C2217381BqS(C1454020nwO.class, "imageEditThumbnailApi", "getImageEditThumbnailApi()Lcom/ss/android/ugc/aweme/image/thumbnail/ImageEditThumbnailApi;", 0)};
        LLJZ = new Object() { // from class: X.0nxC
        };
        LLL = 8;
    }

    private final void LJ() {
        if (this.LLJLL == null) {
            this.LLJLL = H4();
        }
        if (this.LLJLLIL == null) {
            O4(this, 0L, 0L, 3, null);
        }
        LifecycleOwnerExtensionsKt.LIZIZ(this, 500L, new ARunnableS122S0100000_22(this, 16));
    }

    public final void N6() {
    }

    public final void P6() {
    }

    public final void T6() {
    }

    private final InterfaceC1453410nvP E5() {
        return (InterfaceC1453410nvP) this.LLJJJJ.getValue(this, LLJZIJLIL[2]);
    }

    private final DialogC1390150mHN H4() {
        DialogC1390150mHN dialogC1390150mHN = new DialogC1390150mHN(this.LLJILJILJ.requireSceneContext());
        dialogC1390150mHN.LJJLJLI(this.LLJILJILJ.requireSceneContext().getString(2131836766));
        dialogC1390150mHN.LJJZ(false);
        return dialogC1390150mHN;
    }

    private final int M5() {
        C1446760nkg.LIZ.getClass();
        return C1446760nkg.LIZJ() ? 2131821404 : 2131829965;
    }

    private final C1454070nwT d5() {
        return (C1454070nwT) this.LLJLILLLLZIIL.getValue();
    }

    private final Pair<EnumC1454080nwU, Boolean> u7() {
        C1446760nkg.LIZ.getClass();
        EnumC1454080nwU enumC1454080nwULJ = C1454030nwP.LJ(N5(), C1446760nkg.LIZJ());
        return new Pair<>(enumC1454080nwULJ, Boolean.valueOf(C1446760nkg.LIZJ() && U5() && enumC1454080nwULJ.getEnableEnter()));
    }

    public final InterfaceC1441090nbX C5() {
        return (InterfaceC1441090nbX) this.LLJJL.getValue(this, LLJZIJLIL[5]);
    }

    public final InterfaceC1450920nrO H5() {
        return (InterfaceC1450920nrO) this.LLJJJJLIIL.getValue(this, LLJZIJLIL[4]);
    }

    public final void L7() {
        CollageInfo collageInfo;
        String str;
        NLEModel nLEModelLIZ;
        SingleImageData singleImageData = this.LLJJIJIL;
        if (singleImageData == null || (collageInfo = singleImageData.getCollageInfo()) == null || (str = N5().creativeModel.imageEditModel.map.get(collageInfo.getId())) == null || str.length() == 0 || collageInfo.getCollageImageList().isEmpty()) {
            return;
        }
        InterfaceC1452170ntP interfaceC1452170ntPS5 = S5();
        if (interfaceC1452170ntPS5 != null) {
            interfaceC1452170ntPS5.pf(str);
        }
        InterfaceC1452170ntP interfaceC1452170ntPS52 = S5();
        if (interfaceC1452170ntPS52 != null) {
            interfaceC1452170ntPS52.jg();
        }
        InterfaceC1452170ntP interfaceC1452170ntPS53 = S5();
        if (interfaceC1452170ntPS53 != null) {
            interfaceC1452170ntPS53.nf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        }
        InterfaceC1452170ntP interfaceC1452170ntPS54 = S5();
        if (interfaceC1452170ntPS54 == null || (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntPS54)) == null) {
            return;
        }
        W7(new C783490UoN(collageInfo.getCollageIntParam(), collageInfo.getCollageImageList(), C346750Dib.LIZ(nLEModelLIZ)));
    }

    public final VideoPublishEditModel N5() {
        return (VideoPublishEditModel) this.LLJJIJI.getValue(this, LLJZIJLIL[0]);
    }

    public final NLEEditor R5() {
        return (NLEEditor) this.LLJL.getValue();
    }

    public final InterfaceC1452170ntP S5() {
        return (InterfaceC1452170ntP) this.LLJLIL.getValue();
    }

    public final void Z4() {
        CountDownTimer countDownTimer = this.LLJLLIL;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.LLJLLIL = null;
        DialogC1390150mHN dialogC1390150mHN = this.LLJLL;
        if (dialogC1390150mHN != null) {
            dialogC1390150mHN.dismiss();
            C785410UrT.LIZ(dialogC1390150mHN);
        }
        this.LLJLL = null;
    }

    public final void m6() {
        Z7(new C0TM7(this.LLJJJIL.size()));
    }

    public final InterfaceC1451050nrb n5() {
        return (InterfaceC1451050nrb) this.LLJJJJJIL.getValue(this, LLJZIJLIL[3]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1454230nwj> o2() {
        return new AwS566S0100000_22(this, 122);
    }

    public final boolean p8() {
        return this.LLJJI || r8();
    }

    public final void u8() {
        if (this.LLJLLL) {
            return;
        }
        this.LLJLLL = true;
        Context sceneContext = this.LLJILJILJ.getSceneContext();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.isCenterToast(false);
        creativeToastBuilder.messageRes(2131821401);
        creativeToastBuilder.acrossActivities(false);
        C1390380mHk.LIZJ(sceneContext, 6020, creativeToastBuilder);
    }

    public final ImageAlbumData v5() {
        return (ImageAlbumData) this.LLJJIJIIJIL.getValue(this, LLJZIJLIL[1]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1454220nwi> w2() {
        return new AwS566S0100000_22(this, 126);
    }

    public final InterfaceC1454000nwM x5() {
        return (InterfaceC1454000nwM) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final boolean J6() {
        String strLIZLLL = C1454030nwP.LIZLLL(N5());
        List<SingleImageData> imageList = v5().getImageList();
        if (!(imageList instanceof Collection) || !imageList.isEmpty()) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (C1454030nwP.LIZIZ(it2.next(), strLIZLLL) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
            if (i >= 2) {
                return true;
            }
        }
        return false;
    }

    private final boolean K6() {
        C12G3 c12g3LJ;
        String creationId = N5().creativeModel.creativeInfo.getCreationId();
        if (!(!a0.LJJJIL(creationId))) {
            creationId = null;
        }
        if (creationId == null) {
            return false;
        }
        AICoverPluginService.LIZ.getClass();
        AICoverPluginService aICoverPluginServiceLIZ = C1446770nkh.LIZ();
        if (aICoverPluginServiceLIZ == null || (c12g3LJ = aICoverPluginServiceLIZ.LJ(N5(), creationId)) == null) {
            return false;
        }
        try {
            boolean zLJIILLIIL = c12g3LJ.LJIILLIIL();
            aICoverPluginServiceLIZ.LIZJ(N5(), creationId);
            return zLJIILLIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            aICoverPluginServiceLIZ.LIZJ(N5(), creationId);
            throw th;
        }
    }

    private final void T4() {
        NLEEditor nLEEditorR5 = R5();
        if (nLEEditorR5 != null) {
            nLEEditorR5.commit();
        }
        NLEEditor nLEEditorR52 = R5();
        if (nLEEditorR52 != null) {
            nLEEditorR52.done();
        }
    }

    private final boolean U5() {
        String strLIZLLL = C1454030nwP.LIZLLL(N5());
        if (strLIZLLL == null) {
            return false;
        }
        List<SingleImageData> imageList = v5().getImageList();
        if (!(imageList instanceof Collection) || !imageList.isEmpty()) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                if (C1454030nwP.LJI(it2.next(), strLIZLLL)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void exit() {
        C337180DJs.LIZJ(H5().wf2());
        hide();
        H5().NH0(false);
        C1456140nzo.LIZIZ(n5(), true, false, false, false, 12);
        this.LLJJ = false;
        n5().vW1().setValue(C1452730nuJ.LIZ());
    }

    private final boolean r8() {
        if (!C1454030nwP.LJII(N5())) {
            return false;
        }
        C1446760nkg.LIZ.getClass();
        return C0C64.LJIILLIIL().LJIIIZ(31744, "tt_photo_text_ai_cover_story_collage_control_fix", true, true);
    }

    public final void L6() {
        x5().LJ();
        C786410Ut5.LJLLLLLL(0, H5().wf2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInnerImageInfo>] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d6() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r9.v5()
            java.util.List r8 = r0.getImageList()
            r7 = 0
            if (r8 == 0) goto L76
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L76
            com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData r0 = r9.v5()
            int r6 = r0.getCurrentPreviewIndex()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r9.N5()
            java.lang.String r5 = X.C1454030nwP.LIZLLL(r0)
            r0 = 348(0x15c, float:4.88E-43)
            kotlin.jvm.internal.AFwS261S0000000_22 r4 = kotlin.jvm.internal.AFwS261S0000000_22.get$arr$(r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L4a
            X.13BV r3 = X.C13BV.INSTANCE
        L2f:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L47
            com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r0 = r9.LLJJIJIL
            if (r0 == 0) goto L45
            com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInfo r0 = r0.getCollageInfo()
            if (r0 == 0) goto L45
            java.util.List r3 = r0.getCollageImageList()
            if (r3 != 0) goto L47
        L45:
            X.13BV r3 = X.C13BV.INSTANCE
        L47:
            r9.LLJJJIL = r3
            return
        L4a:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = r8.size()
            r3.<init>(r0)
            if (r6 >= 0) goto L56
            r6 = 0
        L56:
            int r2 = r8.size()
        L5a:
            if (r7 >= r2) goto L2f
            int r0 = r6 % r2
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, r0)
            com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r1 = (com.ss.android.ugc.aweme.creative.model.edit.SingleImageData) r1
            boolean r0 = X.C1454030nwP.LIZIZ(r1, r5)
            if (r0 == 0) goto L71
            java.lang.Object r0 = r4.invoke(r1)
            r3.add(r0)
        L71:
            int r6 = r6 + 1
            int r7 = r7 + 1
            goto L5a
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1454020nwO.d6():void");
    }

    public final void d7() {
        ImageAlbumData imageAlbumData = N5().getImageAlbumData();
        if (imageAlbumData == null) {
            imageAlbumData = v5();
        }
        Iterator<SingleImageData> it2 = imageAlbumData.getImageList().iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().isAICover()) {
                if (i >= 0) {
                    AICoverInfo aiCoverInfo = imageAlbumData.getAiCoverInfo();
                    if (aiCoverInfo != null) {
                        imageAlbumData.setAiCoverInfo(aiCoverInfo.copy(aiCoverInfo.taskId, i, aiCoverInfo.covers, aiCoverInfo.selectedCoverId, aiCoverInfo.isConfirmed, aiCoverInfo.skipReorderOnTerminal));
                    }
                    n5().LLLZLL(i);
                    InterfaceC1441090nbX interfaceC1441090nbXC5 = C5();
                    if (interfaceC1441090nbXC5 != null) {
                        interfaceC1441090nbXC5.LLLZLL(i);
                        return;
                    }
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        super.hide();
        Z4();
        this.LLJJI = false;
    }

    @Override // ge.i, X.InterfaceC386130FBz
    public boolean isShowing() {
        return super.isShowing();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        Z4();
        this.LLJJI = false;
    }

    public final C1450610nqt D5() {
        return this.LLJJJ;
    }

    @Override // ge.i
    public Function0<AbstractC1664490tPr<C1454230nwj, C1454220nwi>> E3() {
        return this.LLJJIII;
    }

    public final void S6() {
        exit();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final SingleImageData k5() {
        return this.LLJJIJIL;
    }

    public final List<CollageInnerImageInfo> t5() {
        return this.LLJJJIL;
    }

    private final void W7(C783490UoN c783490UoN) {
        i3(new AwS601S0100000_22(c783490UoN, 97));
    }

    private final void Z7(C0TM7 c0tm7) {
        i3(new AwS601S0100000_22(c0tm7, 98));
    }

    private final void y8(int i) {
        AICoverInfo aiCoverInfo;
        C12G3 c12g3LJ;
        ImageAlbumData imageAlbumData = N5().getImageAlbumData();
        if (imageAlbumData != null && (aiCoverInfo = imageAlbumData.getAiCoverInfo()) != null) {
            ImageAlbumData imageAlbumData2 = N5().getImageAlbumData();
            if (imageAlbumData2 != null) {
                imageAlbumData2.setAiCoverInfo(aiCoverInfo.copy(aiCoverInfo.taskId, i, aiCoverInfo.covers, null, false, aiCoverInfo.skipReorderOnTerminal));
            }
            String creationId = N5().creativeModel.creativeInfo.getCreationId();
            if ((!a0.LJJJIL(creationId)) && creationId != null) {
                AICoverPluginService.LIZ.getClass();
                AICoverPluginService aICoverPluginServiceLIZ = C1446770nkh.LIZ();
                if (aICoverPluginServiceLIZ == null || (c12g3LJ = aICoverPluginServiceLIZ.LJ(N5(), creationId)) == null) {
                    return;
                }
                c12g3LJ.LJIILJJIL(N5());
                aICoverPluginServiceLIZ.LIZJ(N5(), creationId);
            }
        }
    }

    public final String I7(String str) {
        SingleImageData next;
        String id;
        AICoverInfo aiCoverInfo;
        List<AICoverItem> covers;
        AICoverItem next2;
        if (!Intrinsics.LJFF(str, "change_style")) {
            return null;
        }
        Iterator<SingleImageData> it2 = v5().getImageList().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                SingleImageData singleImageData = next;
                if (singleImageData.isAICover() && singleImageData.getCollageInfo() == null) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SingleImageData singleImageData2 = next;
        if (singleImageData2 == null || (id = singleImageData2.getId()) == null || !(!a0.LJJJIL(id)) || (aiCoverInfo = v5().getAiCoverInfo()) == null || (covers = aiCoverInfo.getCovers()) == null) {
            return null;
        }
        Iterator<AICoverItem> it3 = covers.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                AICoverItem aICoverItem = next2;
                if (!a0.LJJJIL(aICoverItem.getSubTaskId())) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('_');
                    sbLIZ.append(aICoverItem.getSubTaskId());
                    sbLIZ.append('_');
                    if (a0.LJJIIZI(id, C2188811AlT.LIZIZ(sbLIZ), false)) {
                        break;
                    }
                }
            } else {
                next2 = null;
                break;
            }
        }
        AICoverItem aICoverItem2 = next2;
        if (aICoverItem2 == null) {
            return null;
        }
        return aICoverItem2.getSubTaskId();
    }

    public final void W6(SingleImageData singleImageData) {
        Bitmap currDisplayImage;
        InterfaceC1452170ntP interfaceC1452170ntPS5 = S5();
        if (interfaceC1452170ntPS5 != null) {
            currDisplayImage = interfaceC1452170ntPS5.getCurrDisplayImage(C1450870nrJ.LIZIZ);
        } else {
            currDisplayImage = null;
        }
        H5().d72(true, currDisplayImage);
        C01TT.LIZJ(new AwS423S0200000_22(this, singleImageData, 12));
    }

    public final void d8(SingleImageData singleImageData) {
        this.LLJJIJIL = singleImageData;
    }

    public final void h8(List<CollageInnerImageInfo> list) {
        this.LLJJJIL = list;
    }

    public final void k7(C1454420nx2 c1454420nx2) {
        NLESegmentVideo nLESegmentVideoDynamicCast;
        SrcImageInfo srcImageInfo = c1454420nx2.LIZ.getSrcImageInfo();
        if (srcImageInfo == null) {
            return;
        }
        C1454070nwT c1454070nwTD5 = d5();
        NLETrack nLETrack = c1454420nx2.LIZIZ;
        c1454070nwTD5.getClass();
        NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(nLETrack.getSlots());
        if (nLETrackSlot != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
            nLESegmentVideoDynamicCast.setAVFile(C0LIZ.LIZ(srcImageInfo, ((long) 10000) * 1000));
            if (nLETrackSlot.getStencilMask() != null) {
                c1454070nwTD5.LIZ(nLETrackSlot, nLETrackSlot.getStencilMask(), srcImageInfo);
            }
        }
        T4();
    }

    public void n7(C1433110nOf c1433110nOf) {
        SingleImageData singleImageData = this.LLJJIJIL;
        boolean z = false;
        if (singleImageData != null && singleImageData.getCollageInfo() != null) {
            z = true;
        }
        Bitmap currDisplayImage = null;
        String str = null;
        if (z) {
            SingleImageData singleImageData2 = this.LLJJIJIL;
            if (singleImageData2 != null && x5().LIZJ(singleImageData2, c1433110nOf)) {
                Iterator<CollageInnerImageInfo> it2 = c1433110nOf.LIZIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    String aiChatGenNodeId = it2.next().getAiChatGenNodeId();
                    if (aiChatGenNodeId != null) {
                        str = aiChatGenNodeId;
                        break;
                    }
                }
                singleImageData2.setImageVideoSharedModel(new ImageVideoSharedModel(str));
                int iH7 = n5().h7();
                n5().F71(iH7, singleImageData2);
                InterfaceC1441090nbX interfaceC1441090nbXC5 = C5();
                if (interfaceC1441090nbXC5 != null) {
                    interfaceC1441090nbXC5.f6(iH7, singleImageData2.getSrcImageInfo().getPath());
                }
                C1446760nkg.LIZ.getClass();
                if (C1446760nkg.LIZJ() && singleImageData2.isAICover()) {
                    y8(iH7);
                }
                C1450610nqt c1450610nqt = this.LLJJJ;
                if (c1450610nqt != null) {
                    c1450610nqt.LJ = true;
                    return;
                }
                return;
            }
            return;
        }
        SingleImageData singleImageDataLIZLLL = x5().LIZLLL(c1433110nOf);
        if (singleImageDataLIZLLL == null) {
            return;
        }
        int iH72 = n5().h7();
        InterfaceC1452170ntP interfaceC1452170ntPS5 = S5();
        if (interfaceC1452170ntPS5 != null) {
            currDisplayImage = interfaceC1452170ntPS5.getCurrDisplayImage(C1450870nrJ.LIZIZ);
        }
        H5().d72(true, currDisplayImage);
        C01TT.LIZJ(new AwS145S0201000_22(this, singleImageDataLIZLLL, iH72, 0));
    }

    public final void o8(C1450610nqt c1450610nqt) {
        this.LLJJJ = c1450610nqt;
    }

    public final String y7(boolean z) {
        if (!z && !r8()) {
            SingleImageData singleImageData = this.LLJJIJIL;
            if (singleImageData != null && singleImageData.getCollageInfo() != null) {
                return "collage";
            }
            C1446760nkg.LIZ.getClass();
            if (!C1446760nkg.LIZJ() || !J6() || K6()) {
                return "collage";
            }
            return "ai_photo_cover";
        }
        return "collage";
    }

    public C1454020nwO(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJIII = new AwS566S0100000_22(this, 127);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), ImageAlbumData.class, null);
        this.LLJJJIL = C13BV.INSTANCE;
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1453410nvP.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1450920nrO.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1441090nbX.class, null);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 123));
        this.LLJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 124));
        this.LLJLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 128));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(75));
    }

    private final void K4(final long j, final long j2) {
        CountDownTimer countDownTimer = this.LLJLLIL;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        final C817403Hg c817403Hg = new C817403Hg();
        this.LLJLLIL = new CountDownTimer(j, j2, c817403Hg, this) { // from class: X.0nwY
            public final /* synthetic */ long LIZ;
            public final /* synthetic */ C817403Hg LIZIZ;
            public final /* synthetic */ C1454020nwO LIZJ;

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                DialogC1390150mHN dialogC1390150mHN = this.LIZJ.LLJLL;
                if (dialogC1390150mHN != null) {
                    dialogC1390150mHN.LJJLL(96.0f, false);
                }
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j3) {
                this.LIZIZ.element = C13LZ.LIZLLL(((r4 - j3) / this.LIZ) * 100, 0.0f, 96.0f);
                DialogC1390150mHN dialogC1390150mHN = this.LIZJ.LLJLL;
                if (dialogC1390150mHN != null) {
                    dialogC1390150mHN.LJJLL(this.LIZIZ.element, true);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(j, j2);
                this.LIZ = j;
                this.LIZIZ = c817403Hg;
                this.LIZJ = this;
            }
        };
    }

    public final void s7(SingleImageData singleImageData, SingleImageData singleImageData2) {
        String id;
        if (singleImageData == null || (id = singleImageData.getId()) == null || !(!a0.LJJJIL(id))) {
            id = null;
        }
        String id2 = singleImageData2.getId();
        if (id2 == null || !(!a0.LJJJIL(id2))) {
            id2 = null;
        }
        String[] strArr = new String[2];
        strArr[0] = id;
        if (!Intrinsics.LJFF(id2, id)) {
            id2 = null;
        }
        strArr[1] = id2;
        for (String str : C13LP.LJJJJI(C13LQ.LJIJI(strArr))) {
            N5().creativeModel.imageEditModel.map.remove(str);
            C1450090nq3 c1450090nq3WD0 = n5().wD0();
            if (c1450090nq3WD0 != null) {
                c1450090nq3WD0.LJ(null, str);
            }
        }
    }

    public final void u6(SingleImageData singleImageData, int i) {
        int iLJ;
        C1462760oAU c1462760oAU;
        singleImageData.setAICover(true);
        Iterator<SingleImageData> it2 = v5().getImageList().iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().isAICover()) {
                    if (i2 >= 0) {
                        iLJ = i2;
                    }
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        AICoverInfo aiCoverInfo = v5().getAiCoverInfo();
        if (aiCoverInfo != null) {
            i = aiCoverInfo.getInsertIndex();
        }
        iLJ = C13LZ.LJ(i, 0, v5().getImageList().size());
        y8(iLJ);
        if (i2 >= 0) {
            C1446760nkg c1446760nkg = C1446760nkg.LIZ;
            VideoPublishEditModel videoPublishEditModelN5 = N5();
            c1446760nkg.getClass();
            C1446760nkg.LIZ(videoPublishEditModelN5);
            s7((SingleImageData) C13LP.LJJJLZIJ(i2, v5().getImageList()), singleImageData);
            n5().Q22(i2, singleImageData);
            InterfaceC1441090nbX interfaceC1441090nbXC5 = C5();
            if (interfaceC1441090nbXC5 != null) {
                interfaceC1441090nbXC5.Za2(i2, singleImageData.getSrcImageInfo().getPath());
            }
        } else {
            n5().r40(iLJ, singleImageData);
            InterfaceC1441090nbX interfaceC1441090nbXC52 = C5();
            if (interfaceC1441090nbXC52 != null) {
                interfaceC1441090nbXC52.Hw1(iLJ, singleImageData.getSrcImageInfo().getPath());
            }
            n5().K92(true);
        }
        InterfaceC1441090nbX interfaceC1441090nbXC53 = C5();
        if (interfaceC1441090nbXC53 != null) {
            interfaceC1441090nbXC53.gP0(iLJ);
        }
        View viewLLLIIIIL = n5().LLLIIIIL();
        if ((viewLLLIIIIL instanceof C1462760oAU) && (c1462760oAU = (C1462760oAU) viewLLLIIIIL) != null) {
            HandlerHook.viewPost(c1462760oAU, new ARunnableS33S0101000_22(iLJ, c1462760oAU, 0));
        }
        C1450610nqt c1450610nqt = this.LLJJJ;
        if (c1450610nqt != null) {
            c1450610nqt.LJ = true;
        }
    }

    private final void P4(EnumC1454080nwU enumC1454080nwU, Function0<Unit> function0, Function0<Unit> function02) {
        if (!enumC1454080nwU.getEnableEnter()) {
            Integer message = enumC1454080nwU.getMessage();
            if (message != null) {
                int iIntValue = message.intValue();
                Context sceneContext = this.LLJILJILJ.getSceneContext();
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.isCenterToast(true);
                creativeToastBuilder.messageRes(iIntValue);
                creativeToastBuilder.acrossActivities(false);
                C1390380mHk.LIZJ(sceneContext, 6020, creativeToastBuilder);
            }
            function02.invoke();
            return;
        }
        SingleImageData singleImageData = this.LLJJIJIL;
        if ((singleImageData != null && singleImageData.getCollageInfo() != null) || C1216510hlJ.LIZ().getBoolean("live_photo_notice_show", false) || !C0MUK.LIZLLL(N5().creativeModel)) {
            function0.invoke();
            return;
        }
        C1454060nwS c1454060nwS = C1454060nwS.LIZ;
        VideoPublishEditModel videoPublishEditModelN5 = N5();
        c1454060nwS.getClass();
        int iIntValue2 = C580270MpN.LJIIJJI(videoPublishEditModelN5).getSecond().intValue();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", videoPublishEditModelN5.mShootWay);
        c0lab.LJ("creation_id", videoPublishEditModelN5.getCreationId());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModelN5));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModelN5));
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LIZ(iIntValue2, "pic_cnt");
        C580270MpN.LJFF(videoPublishEditModelN5, c0lab);
        C20684815ws.LJIILLIIL("show_collage_livephoto_notice", c0lab.LIZ);
        C1397580mTM c1397580mTM = new C1397580mTM(this.LLJILJILJ.requireSceneContext());
        c1397580mTM.LIZ(M5());
        C985403tE.LIZ(c1397580mTM, new AwS231S0300000_22(this, (C1454020nwO) function0, function02, (Function0<Unit>) 10));
        c1397580mTM.LJIIIIZZ = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
        C1216510hlJ.LIZ().storeBoolean("live_photo_notice_show", true);
    }

    public void Ck0(Function1<? super Boolean, Unit> function1, String str, boolean z) {
        this.LLJJI = z;
        E5().pause(false);
        E5().Qf0();
        this.LLJJIJIL = H5().OR1();
        Pair<EnumC1454080nwU, Boolean> pairU7 = u7();
        P4(pairU7.getFirst(), new C1454010nwN(this, z, function1, pairU7.getSecond().booleanValue(), str), new AwS423S0200000_22(this, (C1454020nwO) function1, (Function1<? super Boolean, Unit>) 13));
    }

    public final void o7(C1454380nwy c1454380nwy, List<CollageInnerImageInfo> list, Function2<? super List<? extends NLETrack>, ? super List<CollageInnerImageInfo>, Unit> function2) {
        float f;
        float f2;
        float f3;
        float f4;
        String str;
        List<C1454180nwe> list2 = c1454380nwy.LIZIZ;
        if (list2 != null && !list2.isEmpty()) {
            List<CollageInnerImageInfo> list3 = this.LLJJJIL;
            if (list3.isEmpty()) {
                list3 = list;
            }
            if (list3.isEmpty()) {
                return;
            }
            if (!list.isEmpty()) {
                C1454060nwS c1454060nwS = C1454060nwS.LIZ;
                VideoPublishEditModel videoPublishEditModelN5 = N5();
                if (list2.size() == list.size()) {
                    str = "switch_on_same_photo_num";
                } else {
                    str = "switch_photo_num";
                }
                String str2 = c1454380nwy.LIZ;
                C1454090nwV c1454090nwV = new C1454090nwV("collage", T2().LJFF, null, null, null, null, 1020);
                c1454060nwS.getClass();
                C1454060nwS.LJI(videoPublishEditModelN5, str, str2, c1454090nwV);
            }
            C1454070nwT c1454070nwTD5 = d5();
            ArrayList arrayList = new ArrayList();
            Iterator<CollageInnerImageInfo> it2 = list3.iterator();
            while (it2.hasNext()) {
                SrcImageInfo srcImageInfo = it2.next().getSrcImageInfo();
                if (srcImageInfo != null) {
                    arrayList.add(srcImageInfo);
                }
            }
            c1454070nwTD5.getClass();
            NLEModel model = C346630DiP.LIZ().getModel();
            model.setCanvasRatio(c1454070nwTD5.LIZJ);
            C348350DlB.LJIIJJI(model, c1454070nwTD5.LIZ.width);
            List<C1454180nwe> list4 = c1454380nwy.LIZIZ;
            if (list4 != null && !list4.isEmpty()) {
                int size = list4.size();
                for (int i = 0; i < size; i++) {
                    C1454180nwe c1454180nwe = (C1454180nwe) ListProtector.get(list4, i);
                    SrcImageInfo srcImageInfo2 = (SrcImageInfo) ListProtector.get(arrayList, i % arrayList.size());
                    Size size2 = c1454070nwTD5.LIZ;
                    float f5 = size2.width;
                    float f6 = size2.height;
                    float f7 = f5 / f6;
                    float f8 = c1454070nwTD5.LIZIZ;
                    if (f7 >= f8) {
                        f3 = f8 * f6;
                        f4 = (f5 - f3) / 2.0f;
                        f2 = 0.0f;
                        f = f6;
                    } else {
                        f = f5 / f8;
                        f2 = (f6 - f) / 2.0f;
                        f3 = f5;
                        f4 = 0.0f;
                    }
                    float f9 = f4 + (c1454180nwe.LIZ * f3);
                    float f10 = f2 + (c1454180nwe.LIZIZ * f);
                    float f11 = c1454180nwe.LIZJ * f3;
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    }
                    float f12 = c1454180nwe.LIZLLL * f;
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    float fLIZLLL = C13LZ.LIZLLL((f9 + (f11 / 2.0f)) / f5, 0.0f, 1.0f);
                    float fLIZLLL2 = C13LZ.LIZLLL((f10 + (f12 / 2.0f)) / f6, 0.0f, 1.0f);
                    float fLIZLLL3 = C13LZ.LIZLLL(f11 / f5, 0.0f, 1.0f);
                    float fLIZLLL4 = C13LZ.LIZLLL(f12 / f6, 0.0f, 1.0f);
                    NLESegmentMask nLESegmentMask = new NLESegmentMask();
                    nLESegmentMask.setCenterX((fLIZLLL * 2.0f) - 1.0f);
                    nLESegmentMask.setCenterY(-((fLIZLLL2 * 2.0f) - 1.0f));
                    nLESegmentMask.setWidth(fLIZLLL3);
                    nLESegmentMask.setHeight(fLIZLLL4);
                    nLESegmentMask.setRotation(0.0f);
                    long j = ((long) 10000) * 1000;
                    NLETrackSlot nLETrackSlot = new NLETrackSlot();
                    C348350DlB.LJIIL(nLETrackSlot);
                    NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
                    NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                    nLESegmentVideo.setAVFile(C0LIZ.LIZ(srcImageInfo2, j));
                    nLESegmentVideo.setTimeClipStart(0L);
                    nLESegmentVideo.setAbsSpeed(1.0f);
                    nLESegmentVideo.setTimeClipEnd(j);
                    nLESegmentVideo.setCanvasStyle(nLEStyCanvas);
                    nLETrackSlot.setMainSegment(nLESegmentVideo);
                    nLETrackSlot.setStencilMask(nLESegmentMask);
                    nLETrackSlot.setStartTime(0L);
                    nLETrackSlot.setEndTime(j);
                    c1454070nwTD5.LIZ(nLETrackSlot, nLESegmentMask, srcImageInfo2);
                    NLETrack nLETrack = new NLETrack();
                    if (i == 0) {
                        nLETrack.setMainTrack(true);
                    }
                    nLETrack.addSlotAtEnd(nLETrackSlot);
                    nLETrack.setExtra("collage_index", String.valueOf(i));
                    nLETrack.setLayer(i);
                    model.addTrack(nLETrack);
                }
            }
            InterfaceC1452170ntP interfaceC1452170ntPS5 = S5();
            if (interfaceC1452170ntPS5 != null) {
                interfaceC1452170ntPS5.yc(model);
                LJ();
                interfaceC1452170ntPS5.Yf(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, new InterfaceC1464180oCm() { // from class: X.0nwc
                    @Override // X.InterfaceC1464180oCm
                    public final void onSeekDone(int i2) {
                        C0CNO.LIZLLL(0L, new AwS566S0100000_22(this.LIZ, 125));
                    }
                });
            }
            function2.invoke(C346750Dib.LIZ(model), list3);
        }
    }

    public static /* synthetic */ void O4(C1454020nwO c1454020nwO, long j, long j2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = 3000;
            }
            if ((i & 2) != 0) {
                j2 = 50;
            }
            c1454020nwO.K4(j, j2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildProgressTimer");
    }
}
