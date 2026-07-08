package X;

import Y.ARunnableS91S0200000_22;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.creative.model.edit.ReuseEffectTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.image.phototemplate.processor.PhotoTemplateMagicProcessor;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441070nbV extends AbstractC2255721DQs<InterfaceC1451500nsK> implements InterfaceC1451500nsK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final int LLJJIII;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public SingleImageData LLJ;
    public final C1439800nZS LLJILJILJ;
    public final PhotoTemplateMagicProcessor LLJILLL;
    public final C01GW LLJJ;
    public final InterfaceC1451500nsK LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1450920nrO.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
    public final InterfaceC1731706qJ LLIZ = new C1466810oH1(this, 1);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1441090nbX.class, null);
    public final ExecutorService LLJI = C786410Ut5.h4();
    public final ConcurrentHashMap<String, Future<?>> LLJIJIL = new ConcurrentHashMap<>();
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(88));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1441070nbV.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1441070nbV.class, "isolateClipEditApi", "getIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1441070nbV.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1441070nbV.class, "itemReuseTemplateApi", "getItemReuseTemplateApi()Lcom/ss/android/ugc/aweme/image/phototemplate/reuse/ItemReuseTemplateApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1441070nbV.class, "imageEditThumbnailApi", "getImageEditThumbnailApi()Lcom/ss/android/ugc/aweme/image/thumbnail/ImageEditThumbnailApi;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJJIII = 8;
    }

    private final C1424090nA7 W2() {
        return (C1424090nA7) this.LLJILJIL.getValue();
    }

    private final InterfaceC1451050nrb Z1() {
        return (InterfaceC1451050nrb) this.LLILZLL.getValue(this, LLJJI[2]);
    }

    private final InterfaceC1441090nbX o2() {
        return (InterfaceC1441090nbX) this.LLIZLLLIL.getValue(this, LLJJI[4]);
    }

    private final InterfaceC1450920nrO w2() {
        return (InterfaceC1450920nrO) this.LLILZIL.getValue(this, LLJJI[1]);
    }

    @Override // X.InterfaceC1451500nsK
    public void A62() {
        List<SingleImageData> imageList;
        ReuseEffectTemplateInfo reuseEffectTemplateInfo;
        this.LLJILLL.LIZJ();
        ImageAlbumData imageAlbumData = H2().getImageAlbumData();
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
            return;
        }
        for (int size = imageList.size() - 1; -1 < size; size--) {
            SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(size, imageList);
            if (singleImageData != null && (reuseEffectTemplateInfo = singleImageData.getReuseEffectTemplateInfo()) != null && reuseEffectTemplateInfo.getNeedReuseImageEffectTemplate()) {
                D70(singleImageData);
                if (C1441080nbW.LIZ(H2())) {
                    Z1().LLLZLL(size);
                    InterfaceC1441090nbX interfaceC1441090nbXO2 = o2();
                    if (interfaceC1441090nbXO2 != null) {
                        interfaceC1441090nbXO2.LLLZLL(size);
                    }
                } else {
                    singleImageData.setReuseEffectTemplateInfo(null);
                    InterfaceC1441090nbX interfaceC1441090nbXO22 = o2();
                    if (interfaceC1441090nbXO22 != null) {
                        interfaceC1441090nbXO22.Za2(size, singleImageData.getSrcImageInfo().getPath());
                    }
                }
            }
        }
    }

    public final InterfaceC1441100nbY G2() {
        return (InterfaceC1441100nbY) this.LLIZ.getValue(this, LLJJI[3]);
    }

    public final VideoPublishEditModel H2() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLJJI[0]);
    }

    public final C1430980nLE T2() {
        return (C1430980nLE) this.LLJJ.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        List<SingleImageData> imageList;
        super.onCreate();
        ImageAlbumData imageAlbumData = H2().getImageAlbumData();
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
            return;
        }
        int i = 0;
        for (SingleImageData singleImageData : imageList) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            SingleImageData singleImageData2 = singleImageData;
            ReuseEffectTemplateInfo reuseEffectTemplateInfo = singleImageData2.getReuseEffectTemplateInfo();
            if (reuseEffectTemplateInfo != null && reuseEffectTemplateInfo.getNeedReuseImageEffectTemplate()) {
                g32(singleImageData2);
            }
            i = i2;
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJI.shutdown();
        A62();
    }

    public InterfaceC1451500nsK X1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    private final boolean c3(SingleImageData singleImageData) {
        String id;
        if (C123100dR.LIZ(singleImageData.getId())) {
            String id2 = singleImageData.getId();
            SingleImageData singleImageData2 = this.LLJ;
            if (singleImageData2 != null) {
                id = singleImageData2.getId();
            } else {
                id = null;
            }
            if (Intrinsics.LJFF(id2, id)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1451500nsK
    public void D70(SingleImageData singleImageData) {
        String id = singleImageData.getId();
        if (id == null) {
            return;
        }
        Future<?> future = this.LLJIJIL.get(id);
        if (future != null) {
            future.cancel(true);
        }
        if (c3(singleImageData)) {
            this.LLJILLL.LIZJ();
        }
    }

    public final AbstractC19484711Kz<Unit> W1(SingleImageData singleImageData) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyTemplate ");
        sbLIZ.append(singleImageData.getId());
        C385200F8k.LIZJ("ReuseTemplateProcessorComponent", C2188811AlT.LIZIZ(sbLIZ));
        return AbstractC19484711Kz.LJII(new C1466820oH2(singleImageData, this, 0));
    }

    @Override // X.InterfaceC1451500nsK
    public void g32(SingleImageData singleImageData) {
        String id = singleImageData.getId();
        if (id == null || this.LLJIJIL.containsKey(id)) {
            return;
        }
        try {
            this.LLJIJIL.put(id, this.LLJI.submit(new ARunnableS91S0200000_22(this, singleImageData, 5)));
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addTask failed ");
            sbLIZ.append(id);
            C385200F8k.LIZIZ("ReuseTemplateProcessorComponent", C2188811AlT.LIZIZ(sbLIZ), e);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("addTask ");
        sbLIZ2.append(id);
        C385200F8k.LIZJ("ReuseTemplateProcessorComponent", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final boolean i3(SingleImageData singleImageData) {
        if (C123100dR.LIZ(singleImageData.getId()) && Intrinsics.LJFF(singleImageData.getId(), w2().OR1().getId())) {
            return true;
        }
        return false;
    }

    public final void m3(SingleImageData singleImageData) {
        InterfaceC1441100nbY interfaceC1441100nbYG2;
        ReuseEffectTemplateInfo reuseEffectTemplateInfo = singleImageData.getReuseEffectTemplateInfo();
        if (reuseEffectTemplateInfo != null) {
            reuseEffectTemplateInfo.setReuseFail(true);
        }
        if (i3(singleImageData) && (interfaceC1441100nbYG2 = G2()) != null) {
            interfaceC1441100nbYG2.v();
        }
    }

    @Override // X.InterfaceC1451500nsK
    public void pR0(SingleImageData singleImageData) {
        D70(singleImageData);
        ConcurrentHashMap<String, Future<?>> concurrentHashMap = this.LLJIJIL;
        C19719512Dh.LIZJ(concurrentHashMap).remove(singleImageData.getId());
        g32(singleImageData);
    }

    public final void q3(SingleImageData singleImageData) {
        List<SingleImageData> imageList;
        InterfaceC1441100nbY interfaceC1441100nbYG2;
        String strLIZ = this.LLJILLL.LIZ(null);
        if (strLIZ != null && strLIZ.length() != 0) {
            PhotoTemplateAsset photoTemplateAsset = H2().creativeModel.imageEffectTemplateData.templateAsset;
            if (photoTemplateAsset == null) {
                return;
            }
            if (i3(singleImageData) && (interfaceC1441100nbYG2 = G2()) != null) {
                interfaceC1441100nbYG2.hide();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), H2().getCreativeInfo(), EnumC20228214Cy.PHOTO_MODE, null, false, 12));
            sbLIZ.append("origin/");
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append("_applied_template.png");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C2286708xd.LJFF(strLIZ, strLIZIZ);
            Pair<Integer, Integer> pairLJIIJ = C371780Ehs.LJIIJ(strLIZIZ);
            int iIntValue = pairLJIIJ.getFirst().intValue();
            int iIntValue2 = pairLJIIJ.getSecond().intValue();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("save: ");
            sbLIZ2.append(iIntValue);
            sbLIZ2.append(", ");
            sbLIZ2.append(iIntValue2);
            sbLIZ2.append(' ');
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(' ');
            sbLIZ2.append(photoTemplateAsset);
            C385200F8k.LIZJ("ReuseTemplateProcessorComponent", C2188811AlT.LIZIZ(sbLIZ2));
            ImageAlbumData imageAlbumData = H2().getImageAlbumData();
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                Iterator<SingleImageData> it2 = imageList.iterator();
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().getId(), singleImageData.getId())) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                SingleImageData singleImageDataLIZ = T2().LIZ(strLIZIZ, iIntValue, iIntValue2, singleImageData, singleImageData.getEditImageInfo(), photoTemplateAsset, null, singleImageData.getImageVideoSharedModel());
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("save: generateNewImage ");
                sbLIZ3.append(photoTemplateAsset.getGenerateNewImage());
                sbLIZ3.append(", isGenerated image: ");
                sbLIZ3.append(T2().LIZLLL());
                sbLIZ3.append(", new id=");
                sbLIZ3.append(singleImageDataLIZ.getId());
                sbLIZ3.append(", ");
                sbLIZ3.append(singleImageDataLIZ.getSrcImageInfo());
                sbLIZ3.append(", ");
                sbLIZ3.append(singleImageDataLIZ.getPhotoTemplateInfo());
                C385200F8k.LIZJ("ReuseTemplateProcessorComponent", C2188811AlT.LIZIZ(sbLIZ3));
                String id = singleImageData.getId();
                if (id != null) {
                    this.LLJILJILJ.on(null, id, null);
                }
                Z1().F71(i, singleImageDataLIZ);
                InterfaceC1441090nbX interfaceC1441090nbXO2 = o2();
                if (interfaceC1441090nbXO2 != null && interfaceC1441090nbXO2.Xh1()) {
                    InterfaceC1441090nbX interfaceC1441090nbXO22 = o2();
                    if (interfaceC1441090nbXO22 != null) {
                        interfaceC1441090nbXO22.hH1(false);
                    }
                    InterfaceC1441090nbX interfaceC1441090nbXO23 = o2();
                    if (interfaceC1441090nbXO23 != null) {
                        interfaceC1441090nbXO23.gP0(Z1().h7());
                        return;
                    }
                    return;
                }
                InterfaceC1441090nbX interfaceC1441090nbXO24 = o2();
                if (interfaceC1441090nbXO24 == null) {
                    return;
                }
                interfaceC1441090nbXO24.Za2(i, singleImageDataLIZ.getSrcImageInfo().getPath());
                return;
            }
            return;
        }
        m3(singleImageData);
    }

    public C1441070nbV(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        C1439800nZS c1439800nZS = new C1439800nZS(c19a3, getDiContainer());
        this.LLJILJILJ = c1439800nZS;
        this.LLJILLL = new PhotoTemplateMagicProcessor(c19a3.requireSceneContext(), c1439800nZS, W2());
        this.LLJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 160));
    }
}
