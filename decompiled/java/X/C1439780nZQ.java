package X;

import android.util.Size;
import android.view.ViewGroup;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS2S0502000_5;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nZQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439780nZQ implements InterfaceC1428340nGy, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public final C1664740tQG LLILZIL;
    public final C1664740tQG LLILZLL;
    public final C1664740tQG LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public final C578420MmO LLJIJIL;
    public SingleImageData LLJILJIL;
    public boolean LLJILJILJ;
    public C1439790nZR LLJILLL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 950));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 951));
    public int LLJJ = -1;
    public int LLJJI = -1;
    public float LLJJIII = -1.0f;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1439780nZQ.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1439780nZQ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1439780nZQ.class, "editControlApi", "getEditControlApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/editcontrol/EditControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1439780nZQ.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1439780nZQ.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1439780nZQ.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    @Override // X.InterfaceC1428340nGy
    public final int gn() {
        return 1;
    }

    @Override // X.InterfaceC1428340nGy
    public final int h7() {
        return 0;
    }

    @Override // X.InterfaceC1428340nGy
    public final boolean mn() {
        return true;
    }

    @Override // X.InterfaceC1428340nGy
    public final boolean nn() {
        return false;
    }

    public final InterfaceC366390EYb LIZJ() {
        return (InterfaceC366390EYb) this.LLILZIL.getValue(this, LLJJIJI[2]);
    }

    public final InterfaceC1446740nke LIZLLL() {
        return (InterfaceC1446740nke) this.LLILZ.getValue(this, LLJJIJI[1]);
    }

    public final InterfaceC1461650o8h LJ() {
        C385670FAf<InterfaceC1461650o8h> c385670FAfIz2;
        InterfaceC1455850nzL interfaceC1455850nzL = (InterfaceC1455850nzL) this.LLIZ.getValue(this, LLJJIJI[4]);
        if (interfaceC1455850nzL == null || (c385670FAfIz2 = interfaceC1455850nzL.Iz2()) == null) {
            return null;
        }
        return c385670FAfIz2.LIZJ();
    }

    public final VideoPublishEditModel LJFF() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJJIJI[0]);
    }

    public final Size LJI() {
        return (Size) this.LLJI.getValue();
    }

    public final C0FVT LJII() {
        C385670FAf<InterfaceC1461660o8i> c385670FAfAT;
        InterfaceC1461660o8i interfaceC1461660o8iLIZJ;
        InterfaceC1455850nzL interfaceC1455850nzL = (InterfaceC1455850nzL) this.LLIZ.getValue(this, LLJJIJI[4]);
        if (interfaceC1455850nzL == null || (c385670FAfAT = interfaceC1455850nzL.AT()) == null || (interfaceC1461660o8iLIZJ = c385670FAfAT.LIZJ()) == null) {
            return null;
        }
        return interfaceC1461660o8iLIZJ.kR();
    }

    @Override // X.InterfaceC1428340nGy
    public final SingleImageData LJIL() {
        SingleImageData singleImageData = this.LLJILJIL;
        C371780Ehs.LIZLLL(singleImageData);
        return singleImageData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a8  */
    @Override // X.InterfaceC1428340nGy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean init() {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1439780nZQ.init():boolean");
    }

    @Override // X.InterfaceC1428340nGy
    public final CreativeInfo LIZ() {
        return LJFF().getCreativeInfo();
    }

    @Override // X.InterfaceC1428340nGy
    public final Size N2() {
        return LJI();
    }

    @Override // X.InterfaceC1428340nGy
    public final Size cn() {
        return LJI();
    }

    @Override // X.InterfaceC1428340nGy
    public final ViewGroup.MarginLayoutParams ej() {
        return LIZLLL().ej();
    }

    @Override // X.InterfaceC1428340nGy
    public final InterfaceC1452170ntP g() {
        return LIZLLL().g().getValue();
    }

    @Override // X.InterfaceC1428340nGy
    public final boolean in() {
        return C1428520nHG.LJJJJI(LJFF()) || LJFF().hasStickers() || LJFF().isCurrentAutoCutMode() || LJFF().creativeModel.photoTemplateInfo != null;
    }

    @Override // X.InterfaceC1428340nGy
    public final List<TextStickerModel> kn() {
        List<TextStickerModel> listSb;
        C0FVT c0fvtLJII = LJII();
        return (c0fvtLJII == null || (listSb = c0fvtLJII.Sb()) == null) ? C13BV.INSTANCE : listSb;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1428340nGy
    public final void LLLZLL(int i) {
        throw new RuntimeException("deleteItem not supported");
    }

    @Override // X.InterfaceC1428340nGy
    public final void fn(C346940Diu c346940Diu) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float width;
        float height;
        Float f = c346940Diu.LIZJ;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        float width2 = LJI().getWidth();
        Float f2 = c346940Diu.LIZLLL;
        float fFloatValue4 = 0.0f;
        if (f2 != null) {
            fFloatValue2 = f2.floatValue();
        } else {
            fFloatValue2 = 0.0f;
        }
        int i = (int) (width2 * fFloatValue2);
        float height2 = LJI().getHeight();
        Float f3 = c346940Diu.LJ;
        if (f3 != null) {
            fFloatValue3 = f3.floatValue();
        } else {
            fFloatValue3 = 0.0f;
        }
        int i2 = (int) (height2 * (-fFloatValue3));
        InterfaceC1452170ntP interfaceC1452170ntPG = g();
        if (interfaceC1452170ntPG != null) {
            Float f4 = c346940Diu.LJFF;
            if (f4 != null) {
                fFloatValue4 = f4.floatValue();
            }
            interfaceC1452170ntPG.setDisplayState(fFloatValue, fFloatValue, fFloatValue4 * 360, i, i2);
        }
        if (fFloatValue == 1.0f) {
            width = -i;
            height = -i2;
        } else {
            float f5 = 1 - fFloatValue;
            width = ((LJI().getWidth() * f5) * 0.5f) - i;
            height = ((LJI().getHeight() * f5) * 0.5f) - i2;
        }
        LIZLLL().Rd0(fFloatValue, width, height);
    }

    public C1439780nZQ(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        this.LLILLL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLILZIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC366390EYb.class, null);
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1453430nvR.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, InterfaceC1455850nzL.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1460000o62.class, null);
        this.LLJIJIL = new C578420MmO(c19a3, c1drg);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:31:0x0042
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZIZ(java.io.FileDescriptor r6, java.lang.String r7) {
        /*
            X.0VSP r5 = new X.0VSP
            r5.<init>(r6)
            r4 = 0
            X.0VSV r3 = new X.0VSV     // Catch: java.lang.Throwable -> L3a
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L3a
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L25
        Lf:
            int r1 = r5.read(r2)     // Catch: java.lang.Throwable -> L25
            r0 = -1
            if (r1 == r0) goto L1b
            r0 = 0
            r3.write(r2, r0, r1)     // Catch: java.lang.Throwable -> L25
            goto Lf
        L1b:
            r3.flush()     // Catch: java.lang.Throwable -> L25
            X.C2107108Nh.LIZ(r3, r4)     // Catch: java.lang.Throwable -> L3a
            X.C2107108Nh.LIZ(r5, r4)
            return
        L25:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L2c
            throw r1     // Catch: java.lang.Throwable -> L2a
        L2a:
            r0 = move-exception
            goto L2e
        L2c:
            r0 = move-exception
            r1 = r4
        L2e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r0 = move-exception
            goto L2e
        L34:
            X.C2107108Nh.LIZ(r3, r1)     // Catch: java.lang.Throwable -> L38
            throw r0     // Catch: java.lang.Throwable -> L38
        L38:
            r1 = move-exception
            goto L3b
        L3a:
            r1 = move-exception
        L3b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L42
            throw r1     // Catch: java.lang.Throwable -> L3f
        L3f:
            r0 = move-exception
            r4 = r1
            goto L43
        L42:
            r0 = move-exception
        L43:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L42
            X.C2107108Nh.LIZ(r5, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1439780nZQ.LIZIZ(java.io.FileDescriptor, java.lang.String):void");
    }

    @Override // X.InterfaceC1428340nGy
    public final void jn(boolean z, boolean z2) {
        float f;
        if (z) {
            C1456140nzo.LIZIZ(LIZLLL(), false, true, false, false, 12);
            LIZLLL().vW1().setValue(C1452730nuJ.LIZJ());
            return;
        }
        C1456140nzo.LIZIZ(LIZLLL(), true, true, false, false, 12);
        LIZLLL().vW1().setValue(C1452730nuJ.LIZ());
        if (z2) {
            return;
        }
        float f2 = this.LLJJIII;
        C1450870nrJ.LJIIIIZZ = f2;
        if (C1450870nrJ.LJIIJ(f2)) {
            f = C1450870nrJ.LIZJ;
        } else {
            f = C1450870nrJ.LJIIIIZZ;
        }
        C1450870nrJ.LJIIIZ = f;
        C1450870nrJ.LJIIJJI(this.LLJJ, this.LLJJI);
    }

    @Override // X.InterfaceC1428340nGy
    public final void ln(boolean z, boolean z2) {
        InterfaceC366390EYb interfaceC366390EYbLIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateStickers ");
        sbLIZ.append(z);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLJILJILJ);
        C385200F8k.LIZ("CanvasPhotoTemplateExternalApiAdapter", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            if (this.LLJILJILJ && (interfaceC366390EYbLIZJ = LIZJ()) != null) {
                interfaceC366390EYbLIZJ.cv1(false);
                return;
            }
            return;
        }
        if (this.LLJILJILJ) {
            InterfaceC366390EYb interfaceC366390EYbLIZJ2 = LIZJ();
            if (interfaceC366390EYbLIZJ2 != null) {
                interfaceC366390EYbLIZJ2.p32(false);
                return;
            }
            return;
        }
        InterfaceC366390EYb interfaceC366390EYbLIZJ3 = LIZJ();
        if (interfaceC366390EYbLIZJ3 != null) {
            interfaceC366390EYbLIZJ3.kA(false);
        }
        InterfaceC366390EYb interfaceC366390EYbLIZJ4 = LIZJ();
        if (interfaceC366390EYbLIZJ4 != null) {
            interfaceC366390EYbLIZJ4.p32(false);
        }
        this.LLJILJILJ = true;
    }

    @Override // X.InterfaceC1428340nGy
    public final void dn(NLEModel nLEModel, NLETemplateModel nLETemplateModel, C5183020f c5183020f) {
        VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (!nLETrack.getMainTrack()) {
                arrayList.add(nLETrack);
            }
        }
        int size = arrayList.size();
        VecNLETrackSPtr tracks2 = nLETemplateModel.getTracks();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrack nLETrack2 : tracks2) {
            if (!nLETrack2.getMainTrack()) {
                arrayList2.add(nLETrack2);
            }
        }
        int i = 0;
        for (Object obj : arrayList2) {
            int i2 = i + 1;
            if (i >= 0) {
                C0CNO.LIZLLL(0L, new AwS2S0502000_5(this, nLEModel, (NLETrack) obj, nLETemplateModel, c5183020f, i, size, 0));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // X.InterfaceC1428340nGy
    public final void on(NLEModel nLEModel, String str, String str2) {
        LJFF().setNleData(null);
        LJFF().setNleModel(null);
    }

    @Override // X.InterfaceC1428340nGy
    public final void en(int i, SingleImageData singleImageData, String str, NLEModel nLEModel) {
        InterfaceC391070FUz interfaceC391070FUzLJFF;
        PhotoTemplateAsset photoTemplateAsset;
        InterfaceC1452170ntP interfaceC1452170ntPG;
        InterfaceC391070FUz interfaceC391070FUzLJFF2;
        InterfaceC1460000o62 interfaceC1460000o62 = (InterfaceC1460000o62) this.LLIZLLLIL.getValue(this, LLJJIJI[5]);
        if (interfaceC1460000o62 != null) {
            interfaceC1460000o62.oz(false);
        }
        LJFF().creativeModel.autoCutModel = new AutoCutModel(null, null, null, null, 0, 0, false, false, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, 0, 0, null, false, false, null, null, -1, 7, null);
        CanvasVideoData canvasVideoData = LJFF().getCanvasVideoData();
        if (canvasVideoData != null) {
            canvasVideoData.setSourceInfo(C1697810uHb.LJ(singleImageData.getSrcImageInfo().getPath()));
        }
        LJFF().setImportInfoList(C1697810uHb.LJ(new ImportVideoInfo(singleImageData.getSrcImageInfo().getWidth(), singleImageData.getSrcImageInfo().getHeight(), 0, 0, CardStruct.IStatusCode.DEFAULT, 0L, 0L, null, null, 0, 0.0f, singleImageData.getSrcImageInfo().getPath(), singleImageData.getSrcImageInfo().getPath(), false, null, singleImageData.getAigcInfo(), 0L, 92044, null)));
        LJFF().creativeModel.photoTemplateInfo = singleImageData.getPhotoTemplateInfo();
        PhotoTemplateInfo photoTemplateInfo = singleImageData.getPhotoTemplateInfo();
        String strZf = null;
        if (photoTemplateInfo == null || ((photoTemplateAsset = photoTemplateInfo.getPhotoTemplateAsset()) != null && C1413020msG.LIZJ(photoTemplateAsset))) {
            InterfaceC366390EYb interfaceC366390EYbLIZJ = LIZJ();
            if (interfaceC366390EYbLIZJ != null) {
                interfaceC366390EYbLIZJ.Kr2();
            }
            Size sizeLJI = LJI();
            NLEModel nLEModelLIZIZ = new C1449920npm(singleImageData, new com.bytedance.ies.cutsame.util.Size(sizeLJI.getWidth(), sizeLJI.getHeight())).LIZIZ();
            InterfaceC1452170ntP interfaceC1452170ntPG2 = g();
            if (interfaceC1452170ntPG2 != null) {
                C371780Ehs.LJIILLIIL(interfaceC1452170ntPG2, nLEModelLIZIZ);
                C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPG2);
                if (c348100DkmLIZIZ != null && (interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF()) != null) {
                    C347660Dk4 c347660Dk4LJJJJ = interfaceC391070FUzLJFF.LJJJJ();
                    if (c347660Dk4LJJJJ != null) {
                        interfaceC391070FUzLJFF.LJJJJLL(null);
                        interfaceC391070FUzLJFF.LJJJJLL(c347660Dk4LJJJJ);
                    }
                    List<C347660Dk4> listLJJJJLI = interfaceC391070FUzLJFF.LJJJJLI();
                    if (listLJJJJLI != null) {
                        interfaceC391070FUzLJFF.LJJIIJ(listLJJJJLI);
                    }
                    C07X6 c07x6LJJ = interfaceC391070FUzLJFF.LJJ();
                    if (c07x6LJJ != null) {
                        interfaceC391070FUzLJFF.LJIILIIL(c07x6LJJ);
                    }
                }
                interfaceC1452170ntPG2.play();
            }
            VideoPublishEditModel videoPublishEditModelLJFF = LJFF();
            InterfaceC1452170ntP interfaceC1452170ntPG3 = g();
            if (interfaceC1452170ntPG3 != null) {
                strZf = interfaceC1452170ntPG3.Zf();
            }
            videoPublishEditModelLJFF.setNleData(strZf);
            LJFF().setNleModel(nLEModelLIZIZ);
            return;
        }
        PhotoTemplateAsset photoTemplateAsset2 = photoTemplateInfo.getPhotoTemplateAsset();
        if (photoTemplateAsset2 != null && C1413020msG.LIZIZ(photoTemplateAsset2) && (interfaceC1452170ntPG = g()) != null) {
            C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ(interfaceC1452170ntPG);
            if (c348100DkmLIZIZ2 != null && (interfaceC391070FUzLJFF2 = c348100DkmLIZIZ2.LJFF()) != null) {
                C347660Dk4 c347660Dk4LJJJJ2 = interfaceC391070FUzLJFF2.LJJJJ();
                if (c347660Dk4LJJJJ2 != null) {
                    interfaceC391070FUzLJFF2.LJJJJLL(null);
                    interfaceC391070FUzLJFF2.LJJJJLL(c347660Dk4LJJJJ2);
                }
                List<C347660Dk4> listLJJJJLI2 = interfaceC391070FUzLJFF2.LJJJJLI();
                if (listLJJJJLI2 != null) {
                    interfaceC391070FUzLJFF2.LJJIIJ(listLJJJJLI2);
                }
                C07X6 c07x6LJJ2 = interfaceC391070FUzLJFF2.LJJ();
                if (c07x6LJJ2 != null) {
                    interfaceC391070FUzLJFF2.LJIILIIL(c07x6LJJ2);
                }
            }
            interfaceC1452170ntPG.play();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a9 A[EDGE_INSN: B:109:0x02a9->B:67:0x02a9 BREAK  A[LOOP:2: B:57:0x0272->B:66:0x0297], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x034a  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.ss.android.ugc.aweme.creative.model.edit.ImageFilterInfo, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel, java.io.Serializable, java.lang.Float, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo, com.ss.android.ugc.aweme.creative.model.edit.CameraPhotoInfo, com.ss.android.ugc.aweme.creative.model.edit.ImageAdjustInfo, com.ss.android.ugc.aweme.creative.model.edit.ImageQualityInfo, com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfo, com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult, com.ss.android.ugc.aweme.creative.model.edit.ReuseEffectTemplateInfo, com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo, com.ss.android.ugc.aweme.creative.model.edit.SubOnlyPhotoPreviewInfo, com.ss.android.ugc.aweme.creative.model.edit.imagecollage.CollageInfo, com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel] */
    /* JADX WARN: Type inference failed for: r21v0, types: [X.0oFx] */
    /* JADX WARN: Type inference failed for: r24v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel] */
    /* JADX WARN: Type inference failed for: r25v1, types: [com.ss.android.ugc.aweme.sticker.data.TextStickerInfo] */
    /* JADX WARN: Type inference failed for: r26v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionModel] */
    /* JADX WARN: Type inference failed for: r27v1, types: [X.0FVR] */
    /* JADX WARN: Type inference failed for: r28v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMobModel] */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo] */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r35v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r38v1, types: [X.0F7S] */
    /* JADX WARN: Type inference failed for: r39v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel] */
    /* JADX WARN: Type inference failed for: r40v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel] */
    /* JADX WARN: Type inference failed for: r42v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r43v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r46v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.CaptionTemplateModel] */
    /* JADX WARN: Type inference failed for: r47v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel] */
    /* JADX WARN: Type inference failed for: r48v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextEventTrackingModel] */
    /* JADX WARN: Type inference failed for: r49v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.EditViewUIState] */
    /* JADX WARN: Type inference failed for: r50v1, types: [X.0F7T] */
    /* JADX WARN: Type inference failed for: r51v0, types: [X.0FTc] */
    /* JADX WARN: Type inference failed for: r51v1, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.StoryStreakTextStickerStyleModel] */
    /* JADX WARN: Type inference failed for: r52v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r53v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r54v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r57v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r58v0, types: [com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel] */
    /* JADX WARN: Type inference failed for: r61v0, types: [java.lang.Object] */
    @Override // X.InterfaceC1428340nGy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hn(int r63, com.ss.android.ugc.aweme.creative.model.edit.SingleImageData r64, java.lang.String r65, com.bytedance.ies.nle.editor_jni.NLEModel r66) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1439780nZQ.hn(int, com.ss.android.ugc.aweme.creative.model.edit.SingleImageData, java.lang.String, com.bytedance.ies.nle.editor_jni.NLEModel):void");
    }
}
