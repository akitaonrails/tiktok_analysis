package X;

import Y.AObserverS212S0100000_8;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.EditImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0MdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572850MdP extends C1455870nzN<InterfaceC572860MdQ> implements InterfaceC572860MdQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLZZ;
    public static final int LLZZJLIL;
    public final VEPreviewParams LLLZLL;
    public final C19A3 LLLZLZ;
    public final int LLLZZ;
    public final boolean LLLZZIL;
    public final InterfaceC1731706qJ LLZ;
    public Text2ImageGenerator LLZIL;
    public final InterfaceC1731706qJ LLZILL;
    public InterfaceC572870MdR LLZL;
    public final InterfaceC1731706qJ LLZLI;
    public final MutableLiveData<Boolean> LLZLL;
    public final MutableLiveData<Boolean> LLZLLIL;
    public final MutableLiveData<Boolean> LLZLLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C572850MdP.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C572850MdP.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C572850MdP.class, "context", "getContext()Landroid/content/Context;", 0);
        c09r3.getClass();
        LLZZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLZZJLIL = 8;
    }

    private final InterfaceC1455850nzL P9() {
        return (InterfaceC1455850nzL) this.LLZILL.getValue(this, LLZZ[1]);
    }

    private final void V9() {
        Z9(new C1491180ouK(getEditModel().getCreationId(), new AwS622S0100000_8(this, 25)));
        if (getEditModel().isMusic() == 1) {
            C0CNO.LIZ(C15O7.LJI, new AwS552S0100000_8(this, 392));
        }
    }

    private final Context getContext() {
        return (Context) this.LLZLI.getValue(this, LLZZ[2]);
    }

    @Override // X.InterfaceC572860MdQ
    public void ZL() {
        this.LLZLL.setValue(Boolean.TRUE);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLZ.getValue(this, LLZZ[0]);
    }

    @Override // X.InterfaceC572860MdQ
    public void iv() {
        Text2ImageGenerator text2ImageGenerator = this.LLZIL;
        if (text2ImageGenerator != null) {
            C572800MdK c572800MdK = text2ImageGenerator.LJII;
            if (c572800MdK.LJIJJ) {
                c572800MdK.LJIILL = 1;
                c572800MdK.LJI();
            }
        }
    }

    private final void nD1() {
        vW1().removeObservers(this);
        vW1().observe(this, new AObserverS212S0100000_8(this, 43));
    }

    @Override // X.C1455870nzN
    public AbstractC1452680nuE G2() {
        if (C18161079j.LIZ()) {
            this.LLILZ.LJFF.LIZIZ = "TextToImagePreviewComponent";
        }
        return super.G2();
    }

    @Override // X.C1455870nzN
    public void L6() {
        if (!C0EM4.LIZ()) {
            super.L6();
        } else {
            b22().observe(this, new AObserverS212S0100000_8(this, 42));
            b22().observe(this, new C1453940nwG());
        }
    }

    public final InterfaceC1418580n1E T9() {
        C385670FAf<InterfaceC1418580n1E> c385670FAfG51;
        InterfaceC1455850nzL interfaceC1455850nzLP9 = P9();
        if (interfaceC1455850nzLP9 == null || (c385670FAfG51 = interfaceC1455850nzLP9.G51()) == null) {
            return null;
        }
        return c385670FAfG51.LIZJ();
    }

    @Override // X.C1455870nzN
    public int W6() {
        int iW6 = super.W6();
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        ((C1463670oBx) (abstractC1452680nuEGc != null ? abstractC1452680nuEGc.LJJ() : null)).LJFF = true;
        return iW6;
    }

    @Override // X.C1455870nzN, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLZIL = new Text2ImageGenerator(g().getValue());
        this.LLLZLZ.add(this.LLLZZ, new C558180Luq(getDiContainer(), this.LLLZZIL), "Text2ImageListScene");
        V9();
        nD1();
        C1441960ncw.LIZIZ(getContext(), getEditModel().creativeModel);
        C1441980ncy.LIZJ(getEditModel());
    }

    @Override // X.C1455870nzN, X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        InterfaceC572870MdR interfaceC572870MdRN0 = N0();
        if (interfaceC572870MdRN0 != null) {
            interfaceC572870MdRN0.release();
        }
        C1441980ncy.LIZ = false;
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        InterfaceC572870MdR interfaceC572870MdRN0 = N0();
        if (interfaceC572870MdRN0 != null) {
            interfaceC572870MdRN0.pause();
        }
    }

    @Override // X.C1455870nzN, X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        InterfaceC572870MdR interfaceC572870MdRN0 = N0();
        if (interfaceC572870MdRN0 != null) {
            interfaceC572870MdRN0.resume();
        }
    }

    public final int I9() {
        return this.LLLZZ;
    }

    public final boolean J9() {
        return this.LLLZZIL;
    }

    @Override // X.InterfaceC572860MdQ
    public InterfaceC572870MdR N0() {
        return this.LLZL;
    }

    @Override // X.InterfaceC572860MdQ
    public LiveData<Boolean> S90() {
        return this.LLZLLLL;
    }

    public final VEPreviewParams U9() {
        return this.LLLZLL;
    }

    @Override // X.InterfaceC572860MdQ
    public LiveData<Boolean> au2() {
        return this.LLZLL;
    }

    public final C19A3 getParentScene() {
        return this.LLLZLZ;
    }

    @Override // X.InterfaceC572860MdQ
    public LiveData<Boolean> ly0() {
        return this.LLZLLIL;
    }

    @Override // X.InterfaceC572860MdQ
    public void DJ1(boolean z) {
        this.LLZLLIL.setValue(Boolean.valueOf(z));
        if (z) {
            wp0(false);
        }
    }

    @Override // X.InterfaceC572860MdQ
    public void Z9(InterfaceC572870MdR interfaceC572870MdR) {
        this.LLZL = interfaceC572870MdR;
    }

    @Override // X.InterfaceC572860MdQ
    public void v92(String str) {
        boolean z;
        List<SingleImageData> list;
        List<SingleImageData> imageList;
        List<SingleImageData> imageList2;
        int i;
        List<SingleImageData> arrayList;
        List<SingleImageData> imageList3;
        List<SingleImageData> imageList4;
        List<SingleImageData> arrayList2;
        List<SingleImageData> imageList5;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        if (str.length() == 0) {
            ImageAlbumData imageAlbumData = getEditModel().getImageAlbumData();
            if (imageAlbumData != null) {
                ImageAlbumData imageAlbumData2 = getEditModel().getImageAlbumData();
                if (imageAlbumData2 != null && (imageList5 = imageAlbumData2.getImageList()) != null) {
                    arrayList2 = new ArrayList<>(imageList5);
                    C19719612Di.LJJIIJ(arrayList2, AFwS239S0000000_8.get$arr$(139), true);
                } else {
                    arrayList2 = C13BV.INSTANCE;
                }
                imageAlbumData.setImageList(arrayList2);
                return;
            }
            return;
        }
        C1431780nMW.LIZ.getClass();
        String strLIZ = C1431780nMW.LIZ(0);
        SrcImageInfo srcImageInfo = new SrcImageInfo(str, 1600, 1200, null, null, 24, null);
        EditImageInfo editImageInfo = new EditImageInfo(null, false ? 1 : 0, i2, z7 ? 1 : 0, z6 ? 1 : 0, z5 ? 1 : 0, z4 ? 1 : 0, 0.0f, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, z3 ? 1 : 0, false ? 1 : 0, z2 ? 1 : 0, false ? 1 : 0, false ? 1 : 0, 2097151, false ? 1 : 0);
        if (0.75f <= C1450870nrJ.LIZJ()) {
            z = true;
        } else {
            z = false;
        }
        editImageInfo.setFullScreen(z);
        SingleImageData singleImageData = new SingleImageData(strLIZ, null, srcImageInfo, null, editImageInfo, null, null, new ImageStickerInfo(new ArrayList(), null, 2, null), null, null, null, 0, null, null, null, null, true, null, null, null, null, null, false, 8322914, null);
        singleImageData.setSynthesisData(new ImageSynthesisResult(str, 1200, 1600, null, null, null, null, null, null, 504, null));
        ImageAlbumData imageAlbumData3 = getEditModel().getImageAlbumData();
        if (imageAlbumData3 != null && (imageList2 = imageAlbumData3.getImageList()) != null) {
            Iterator<SingleImageData> it2 = imageList2.iterator();
            while (it2.hasNext()) {
                if (it2.next().isText2Image()) {
                    ImageAlbumData imageAlbumData4 = getEditModel().getImageAlbumData();
                    if (imageAlbumData4 != null && (imageList4 = imageAlbumData4.getImageList()) != null) {
                        Iterator<SingleImageData> it3 = imageList4.iterator();
                        i = 0;
                        while (it3.hasNext()) {
                            if (it3.next().isText2Image()) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        i = -1;
                    } else {
                        i = -1;
                    }
                    ImageAlbumData imageAlbumData5 = getEditModel().getImageAlbumData();
                    if (imageAlbumData5 != null) {
                        ImageAlbumData imageAlbumData6 = getEditModel().getImageAlbumData();
                        if (imageAlbumData6 != null && (imageList3 = imageAlbumData6.getImageList()) != null) {
                            arrayList = new ArrayList<>(imageList3);
                            ListProtector.set(arrayList, i, singleImageData);
                        } else {
                            arrayList = C13BV.INSTANCE;
                        }
                        imageAlbumData5.setImageList(arrayList);
                        return;
                    }
                    return;
                }
            }
        }
        ImageAlbumData imageAlbumData7 = getEditModel().getImageAlbumData();
        if (imageAlbumData7 != null) {
            ImageAlbumData imageAlbumData8 = getEditModel().getImageAlbumData();
            if (imageAlbumData8 != null && (imageList = imageAlbumData8.getImageList()) != null) {
                ArrayList arrayList3 = new ArrayList(imageList);
                arrayList3.add(singleImageData);
                list = arrayList3;
            } else {
                list = C13BV.INSTANCE;
            }
            imageAlbumData7.setImageList(list);
        }
    }

    @Override // X.InterfaceC572860MdQ
    public void wp0(boolean z) {
        this.LLZLLLL.setValue(Boolean.valueOf(z));
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public boolean JA2(VEPreviewMusicParams vEPreviewMusicParams, List<? extends VEPreviewMusicParams> list) {
        C0CNO.LIZ(C15O7.LJI, new AwS409S0200000_8(vEPreviewMusicParams, this, 67));
        if (C12DO.LIZ()) {
            C0MS9.LIZIZ(this.LLLLLLLLL, vEPreviewMusicParams);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC572860MdQ
    public Object s12(boolean z, InterfaceC1631630sYr<? super List<TextImageTaskInfo>, ? super Boolean, ? super Integer, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631630sYr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Text2ImageGenerator text2ImageGenerator = this.LLZIL;
        if (text2ImageGenerator == null) {
            return Unit.LIZ;
        }
        Object objLJII = text2ImageGenerator.LJII(getEditModel(), z, false, null, false, interfaceC1631630sYr, interfaceC1364105Vn);
        if (objLJII == C099R.LJFF()) {
            return objLJII;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C572850MdP(C1DRG c1drg, VEPreviewParams vEPreviewParams, Function1<? super C1455930nzT, Unit> function1, C19A3 c19a3, int i, boolean z) {
        super(c1drg, vEPreviewParams, function1, null, 8, 0 == true ? 1 : 0);
        this.LLLZLL = vEPreviewParams;
        this.LLLZLZ = c19a3;
        this.LLLZZ = i;
        this.LLLZZIL = z;
        this.LLZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLZILL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
        this.LLZLI = C1664770tQJ.LIZ(getDiContainer(), Context.class, null);
        this.LLZLL = new MutableLiveData<>();
        this.LLZLLIL = new MutableLiveData<>();
        this.LLZLLLL = new MutableLiveData<>();
    }

    public /* synthetic */ C572850MdP(C1DRG c1drg, VEPreviewParams vEPreviewParams, Function1 function1, C19A3 c19a3, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1drg, vEPreviewParams, (i2 & 4) != 0 ? null : function1, c19a3, i, z);
    }
}
