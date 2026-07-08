package X;

import Y.AObjectS241S0100000_8;
import Y.AObjectS245S0100000_22;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.asve.editor.NLECommitStatisticsConfig;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.CameraPhotoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.EditModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageFilterInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageTransformParams;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.TemplateFilterBean;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.image.preview.ImageEditPreviewViewModel;
import com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.zhiliaoapp.musically.R;
import dmt.av.video.SingleImageCoverBitmapData;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS622S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ntG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452080ntG extends C1455870nzN<InterfaceC1451050nrb> implements InterfaceC1451050nrb {

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] f156i0;
    public static final int j0;
    public int A;
    public int B;
    public boolean C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f157J;
    public long K;
    public boolean L;
    public final C19A3 LLLZLL;
    public final C1462760oAU LLLZLZ;
    public final FrameLayout LLLZZ;
    public final Boolean LLLZZIL;
    public final Function0<Unit> LLZ;
    public final Function0<Unit> LLZIL;
    public final LiveData<Unit> LLZILL;
    public final LiveData<Unit> LLZL;
    public final LiveData<Unit> LLZLI;
    public final LiveData<Boolean> LLZLL;
    public final LiveData<Integer> LLZLLIL;
    public final LiveData<VEPreviewMusicParams> LLZLLLL;
    public final LiveData<Unit> LLZZ;
    public final C356830Dyr LLZZJLIL;
    public final LiveData<Unit> LLZZLLIL;
    public final LiveData<Unit> LLZZZIL;
    public final LiveData<SwitchModePayload> LLZZZZ;
    public String M;
    public boolean N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f158O;
    public final MutableLiveData<Boolean> P;
    public final MutableLiveData<Boolean> Q;
    public final InterfaceC1731706qJ R;
    public boolean S;
    public Runnable T;
    public final InterfaceC1731706qJ U;
    public final C01GW V;
    public final InterfaceC1731706qJ W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final InterfaceC1731706qJ f159X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final MutableLiveData<Boolean> f160Y;
    public final MutableLiveData<Boolean> Z;
    public final LiveData<Boolean> a;
    public final C560530Lyd<Unit> a0;
    public final LiveData<Boolean> b;
    public final MutableLiveData<Integer> b0;
    public final LiveEvent<Unit> c;
    public final MutableLiveData<Boolean> c0;
    public final h0<Boolean> d;
    public boolean d0;
    public final Function0<ImageEditPreviewViewModel> e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final MutableLiveData<Runnable> f161e0;
    public final InterfaceC1731706qJ f;
    public final MutableLiveData<Unit> f0;
    public final C01GW g;
    public final MutableLiveData<Unit> g0;
    public final InterfaceC1731706qJ h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final LiveData<Unit> f162h0;
    public final InterfaceC1731706qJ i;
    public final InterfaceC1731706qJ j;
    public InterfaceC572870MdR k;
    public final InterfaceC1731706qJ l;
    public final InterfaceC1731706qJ m;
    public final InterfaceC1731706qJ n;
    public final InterfaceC1731706qJ o;
    public final C01GW p;
    public final InterfaceC1731706qJ q;
    public final InterfaceC1731706qJ r;
    public final InterfaceC1731706qJ s;
    public final InterfaceC1731706qJ t;
    public final InterfaceC1731706qJ u;
    public final InterfaceC1731706qJ v;
    public final InterfaceC1731706qJ w;
    public final InterfaceC1731706qJ x;
    public C1451420nsC y;
    public C1450090nq3 z;

    @Override // X.InterfaceC1446740nke
    public void Fh2() {
    }

    @Override // X.InterfaceC1446740nke
    public NLEModel LLZ() {
        return null;
    }

    @Override // X.InterfaceC1446740nke
    public void Ov2(LivePhotoPreviewMode livePhotoPreviewMode) {
    }

    @Override // X.InterfaceC1446740nke
    public void Qb1(boolean z) {
    }

    @Override // X.InterfaceC1446740nke
    public void Qd0() {
    }

    @Override // X.InterfaceC1446740nke
    public void RF0() {
    }

    @Override // X.InterfaceC1446740nke
    public void Rd0(float f, float f2, float f3) {
    }

    @Override // X.InterfaceC1446740nke
    public void Vc2() {
    }

    @Override // X.InterfaceC1451050nrb
    public void Wg0() {
        this.L = false;
    }

    @Override // X.InterfaceC1446740nke
    public void eD0(boolean z) {
    }

    @Override // X.InterfaceC1446740nke
    public boolean eS0() {
        return false;
    }

    @Override // X.InterfaceC1446740nke
    public void i61(String str) {
    }

    @Override // X.InterfaceC1446740nke
    public boolean mi2() {
        return false;
    }

    @Override // X.InterfaceC1446740nke
    public void nn1(FilterBean filterBean) {
    }

    @Override // X.InterfaceC1446740nke
    public void oL2() {
    }

    @Override // X.InterfaceC1446740nke
    public void oz1(long j, long j2, String str) {
    }

    @Override // X.InterfaceC1446740nke
    public void pH0() {
    }

    public final void pc() {
        fd(0);
    }

    @Override // X.InterfaceC1446740nke
    public void rh0(boolean z) {
    }

    @Override // X.InterfaceC1446740nke
    public void u90() {
    }

    @Override // X.InterfaceC1446740nke
    public void x61(SwitchModePayload switchModePayload) {
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1452080ntG.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1452080ntG.class, "optImageCropApi", "getOptImageCropApi()Lcom/ss/android/ugc/gamora/editor/crop/CropApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1452080ntG.class, "imageCollageApi", "getImageCollageApi()Lcom/ss/android/ugc/aweme/image/collage/ImageCollageApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1452080ntG.class, "imageAdjustApi", "getImageAdjustApi()Lcom/ss/android/ugc/aweme/image/adjust/ImageAdjustApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1452080ntG.class, "editFilterApi", "getEditFilterApi()Lcom/ss/android/ugc/gamora/editor/filter/core/EditFilterApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1452080ntG.class, "editStickerScene", "getEditStickerScene()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C1452080ntG.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C1452080ntG.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C1452080ntG.class, "imageEditThumbnailApi", "getImageEditThumbnailApi()Lcom/ss/android/ugc/aweme/image/thumbnail/ImageEditThumbnailApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C1452080ntG.class, "imageAlbumData", "getImageAlbumData()Lcom/ss/android/ugc/aweme/creative/model/edit/ImageAlbumData;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C1452080ntG.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C1452080ntG.class, "imagePresenter", "getImagePresenter()Lcom/ss/android/ugc/aweme/image/preview/ImagePresenter;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(C1452080ntG.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS14 = new C2217381BqS(C1452080ntG.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS15 = new C2217381BqS(C1452080ntG.class, "photoTemplateApi", "getPhotoTemplateApi()Lcom/ss/android/ugc/aweme/image/phototemplate/PhotoTemplateApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS16 = new C2217381BqS(C1452080ntG.class, "autoCutPreloadApi", "getAutoCutPreloadApi()Lcom/ss/android/ugc/aweme/autocut/AutoCutPreloadingApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS17 = new C2217381BqS(C1452080ntG.class, "autoCutAsyncRenderService", "getAutoCutAsyncRenderService()Lcom/ss/android/ugc/aweme/shortvideo/autocut/asyncrender/AutoCutAsyncRenderService;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS18 = new C2217381BqS(C1452080ntG.class, "reuseSurfaceApi", "getReuseSurfaceApi()Lcom/bytedance/uicomponent/ReuseSurfaceApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS19 = new C2217381BqS(C1452080ntG.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS20 = new C2217381BqS(C1452080ntG.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0);
        c09r3.getClass();
        f156i0 = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13, c2217381BqS14, c2217381BqS15, c2217381BqS16, c2217381BqS17, c2217381BqS18, c2217381BqS19, c2217381BqS20};
        j0 = 8;
    }

    private final InterfaceC1451320ns2 Bb() {
        return (InterfaceC1451320ns2) this.w.getValue(this, f156i0[14]);
    }

    private final InterfaceC1452360nti Cb() {
        return (InterfaceC1452360nti) this.U.getValue(this, f156i0[17]);
    }

    private final C348880Dm2 Da() {
        return (C348880Dm2) this.V.getValue();
    }

    private final InterfaceC1452460nts Ga() {
        return (InterfaceC1452460nts) this.j.getValue(this, f156i0[3]);
    }

    private final C1420050n3b J9() {
        return (C1420050n3b) this.R.getValue(this, f156i0[16]);
    }

    private final ImageAlbumData Ka() {
        return (ImageAlbumData) this.r.getValue(this, f156i0[9]);
    }

    private final C1462070o9N N51() {
        return (C1462070o9N) this.m.getValue(this, f156i0[5]);
    }

    private final InterfaceC1452390ntl Na() {
        return (InterfaceC1452390ntl) this.i.getValue(this, f156i0[2]);
    }

    private final InterfaceC1417110myr P9() {
        return (InterfaceC1417110myr) this.x.getValue(this, f156i0[15]);
    }

    private final InterfaceC1453420nvQ V9() {
        return (InterfaceC1453420nvQ) this.o.getValue(this, f156i0[7]);
    }

    private final InterfaceC1453430nvR da() {
        return (InterfaceC1453430nvR) this.l.getValue(this, f156i0[4]);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.n.getValue(this, f156i0[6]);
    }

    private final void hc() {
        this.z = new C1450090nq3(xb());
        List<StickerItemModel> listDc = dc();
        xb();
        C1451420nsC c1451420nsC = new C1451420nsC(xb().getCreativeInfo(), xb().creativeModel, Ka(), this.LLLZLL, this.z, this.LLZ, getDiContainer(), listDc);
        this.y = c1451420nsC;
        this.LLLZLZ.setAdapter(c1451420nsC);
        this.LLLZLZ.setOffscreenPageLimit(1);
        this.LLLZLZ.setOnViewPagerClickListener(new AwS601S0100000_22(this, 126));
        this.LLLZLZ.setOnViewPagerFlingVerticalListener(new AwS601S0100000_22(this, 127));
        ImageAlbumData imageAlbumData = xb().getImageAlbumData();
        if (imageAlbumData != null) {
            imageAlbumData.setCurrentPreviewIndex(T9());
        }
        this.LLLZLZ.LIZLLL(new C1466890oH9(this, 1));
    }

    private final C1451630nsX oa() {
        return (C1451630nsX) this.f159X.getValue(this, f156i0[19]);
    }

    private final InterfaceC1460000o62 pa() {
        return (InterfaceC1460000o62) this.v.getValue(this, f156i0[13]);
    }

    private final void sc() {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("creation_id", xb().getCreationId());
        c0lab.LJ("shoot_way", xb().mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(xb()));
        C2341909Fp.LIZ("click_filter_apply_all", c0lab.LIZ);
    }

    private final InterfaceC1452510ntx yb() {
        return (InterfaceC1452510ntx) this.h.getValue(this, f156i0[1]);
    }

    @Override // X.InterfaceC1446740nke
    public void De1() {
        this.f0.setValue(Unit.LIZ);
    }

    public final AbstractC214814194y Fb() {
        return (AbstractC214814194y) this.u.getValue(this, f156i0[12]);
    }

    @Override // X.InterfaceC1451050nrb
    public void LLLJIL() {
        C1451420nsC c1451420nsC = this.y;
        if (c1451420nsC == null) {
            c1451420nsC = null;
        }
        c1451420nsC.LJJIZ(false);
    }

    public final InterfaceC1441090nbX Oa() {
        return (InterfaceC1441090nbX) this.q.getValue(this, f156i0[8]);
    }

    public final InterfaceC1457250o1b U9() {
        return (InterfaceC1457250o1b) this.p.getValue();
    }

    @Override // X.C1455870nzN
    public void W1() {
        C0CNO.LIZLLL(0L, new AwS566S0100000_22(this, 184));
    }

    public final C1450610nqt Ya() {
        return (C1450610nqt) this.t.getValue(this, f156i0[11]);
    }

    public final InterfaceC1453410nvP cb() {
        return (InterfaceC1453410nvP) this.g.getValue();
    }

    @Override // X.InterfaceC1451050nrb
    public boolean ic0() {
        Boolean bool = this.LLLZZIL;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final InterfaceC1451520nsM ma() {
        return (InterfaceC1451520nsM) this.W.getValue(this, f156i0[18]);
    }

    @Override // X.InterfaceC1446740nke
    public List<EffectPointModel> o9() {
        return new ArrayList();
    }

    @Override // X.InterfaceC1451050nrb
    public void r7() {
        C1451420nsC c1451420nsC = this.y;
        if (c1451420nsC == null) {
            c1451420nsC = null;
        }
        c1451420nsC.LJJIZ(true);
    }

    public final InterfaceC1418580n1E ra() {
        return (InterfaceC1418580n1E) this.s.getValue(this, f156i0[10]);
    }

    public final void tc() {
        C857450XkN c857450XkN = C857450XkN.LIZ;
        VideoPublishEditModel videoPublishEditModelXb = xb();
        boolean z = this.C;
        int iT9 = T9();
        c857450XkN.getClass();
        C857450XkN.LIZ(videoPublishEditModelXb, z, iT9, "video_edit_page", "");
    }

    @Override // X.InterfaceC1446740nke
    public VEPreviewMusicParams xI() {
        return new VEPreviewMusicParams();
    }

    public final VideoPublishEditModel xb() {
        return (VideoPublishEditModel) this.f.getValue(this, f156i0[0]);
    }

    @Override // X.InterfaceC1446740nke
    public List<EffectPointModel> xl2() {
        return new ArrayList();
    }

    private final void Xi() {
        vW1().removeObservers(this);
        vW1().observe(this, new AObjectS241S0100000_8(this, 6));
        X21().observe(this, new AObjectS245S0100000_22(this, 29));
        Lb2().observe(this, new AObjectS241S0100000_8(this, 7));
        b22().observe(this, new AObjectS241S0100000_8(this, 8));
        gJ().observe(this, new AObjectS245S0100000_22(this, 30));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Yc() {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1452080ntG.Yc():void");
    }

    private final void bc() {
        if (C1399570mWZ.LIZIZ()) {
            C578010Mlj.LIZ = false;
        }
        Z9(new C1491180ouK(xb().getCreationId(), new AwS622S0100000_8(this, 7)));
        if (C1661270tKf.LIZ()) {
            String strLIZ = C1441910ncr.LIZ(xb(), "image_preview", xb().getMMusicPath());
            if (strLIZ != null) {
                xb().setMMusicPath(strLIZ);
            }
        }
        if (xb().isMusic() == 1) {
            nc(new AwS552S0100000_8(this, 135));
        }
    }

    private final List<StickerItemModel> dc() {
        if (!getEditModel().creativeModel.onThisDayData.isFromOnThisDay() || C566870MLd.LIZ(getEditModel().creativeModel.onThisDayData) || getEditModel().creativeModel.onThisDayData.getLoadedSticker()) {
            return C13BV.INSTANCE;
        }
        getEditModel().creativeModel.onThisDayData.setLoadedSticker(true);
        List<TextStickerData> listLIZIZ = new C19659511vt(getEditModel().creativeModel.onThisDayData.getCreateTime(), getActivity(), this).LIZIZ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
        int i = 0;
        for (TextStickerData textStickerData : listLIZIZ) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            arrayList.add(C0F7Y.LIZ(textStickerData, i));
            i = i2;
        }
        return arrayList;
    }

    private final void ed() {
        int iI9;
        int i;
        cb().dj0();
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(xb().creativeModel.musicBuzModel);
        VideoPublishEditModel videoPublishEditModelXb = xb();
        if (C1399580mWa.LIZ() && aVMusicExtractAVMusic != null && C1459090o4Z.LIZ(aVMusicExtractAVMusic)) {
            C1451420nsC c1451420nsC = this.y;
            iI9 = C1465190oEP.LIZ(aVMusicExtractAVMusic, Integer.valueOf(I9((c1451420nsC != null ? c1451420nsC : null).getCount())));
        } else {
            C1451420nsC c1451420nsC2 = this.y;
            iI9 = I9((c1451420nsC2 != null ? c1451420nsC2 : null).getCount());
        }
        videoPublishEditModelXb.setVideoLength(iI9);
        MusicObject musicObject = xb().creativeModel.musicBuzModel.music;
        if (musicObject != null && (i = musicObject.shootDuration) > 0) {
            if (C1399580mWa.LIZ() && aVMusicExtractAVMusic != null && C1459090o4Z.LIZ(aVMusicExtractAVMusic)) {
                U9().oJ2(C626640Ohy.LJI(C1465190oEP.LIZ(aVMusicExtractAVMusic, Integer.valueOf(xb().getVideoLength())), xb().getVideoLength(), i, xb().getMCurMusicLength() - xb().getMMusicStart()), xb().getMCurMusicLength());
            } else {
                U9().oJ2(Math.min(xb().getVideoLength(), Math.min(i, xb().getMCurMusicLength() - xb().getMMusicStart())), xb().getMCurMusicLength());
            }
        }
        InterfaceC1417110myr interfaceC1417110myrP9 = P9();
        if (interfaceC1417110myrP9 != null) {
            interfaceC1417110myrP9.pE0();
        }
        this.a0.LJIIJ(Unit.LIZ);
    }

    private final void init() {
        String str;
        if (C295830Bif.LIZ()) {
            VideoPublishEditModel videoPublishEditModelXb = xb();
            C1452150ntN.LIZIZ(videoPublishEditModelXb, new AwS566S0100000_22(videoPublishEditModelXb, 35));
        }
        C1441960ncw.LIZIZ(C786410Ut5.P3(getActivity()), xb().creativeModel);
        hc();
        bc();
        Xi();
        Yc();
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        this.M = C364210EPr.LJ(new C364220EPs(this.LLLZLL));
        EditModel editModel = xb().creativeModel.editModel;
        C1402840mbq c1402840mbqLJ = C1403010mc7.LIZ.getBridgeService().LJ(xb());
        if (c1402840mbqLJ == null || (str = c1402840mbqLJ.mAppName) == null) {
            str = "";
        }
        editModel.sdkSourceApp = str;
    }

    private final void oc() {
        if (C1452450ntr.LIZ()) {
            C2253508sH c2253508sH = C2253508sH.LIZ;
            ContentUnderstandingRequest contentUnderstandingRequestLIZ = C1457450o1v.LIZ(C1457450o1v.LIZ, xb(), null, null, 6);
            c2253508sH.getClass();
            C2253508sH.LJII(contentUnderstandingRequestLIZ);
        }
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public void E4() {
        SingleImageData singleImageData;
        ImageFilterInfo filterInfo;
        FilterBean filterBean;
        sc();
        C1450610nqt c1450610nqtYa = Ya();
        if (c1450610nqtYa == null || (singleImageData = c1450610nqtYa.LIZ) == null || (filterInfo = singleImageData.getFilterInfo()) == null) {
            return;
        }
        int i = a0.LJJJIL(filterInfo.getFilterId()) ? 2131839851 : 2131839845;
        C19EG activity = getActivity();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(i);
        C1390380mHk.LIZ(activity, 1028, creativeToastBuilder);
        for (SingleImageData singleImageData2 : Ka().getImageList()) {
            if (!singleImageData2.getFilterInfo().isSameFilter(filterInfo)) {
                ImageFilterInfo filterInfo2 = singleImageData2.getFilterInfo();
                filterInfo2.copy(filterInfo);
                C1450610nqt c1450610nqtYa2 = Ya();
                FilterBean filterBean2 = c1450610nqtYa2 != null ? c1450610nqtYa2.LIZLLL : null;
                boolean zIsComposer = filterInfo2.isComposer();
                String id = singleImageData2.getId();
                if (id == null) {
                    id = singleImageData2.getSrcImageInfo().getPath();
                }
                filterInfo2.setCompareKey(C355910DxN.LIZ(filterBean2, zIsComposer, id));
                singleImageData2.getFilterInfo().setNeedRender(true);
                C1450610nqt c1450610nqtYa3 = Ya();
                if (c1450610nqtYa3 != null && (filterBean = c1450610nqtYa3.LIZLLL) != null) {
                    filterBean.setCompareKey(singleImageData2.getFilterInfo().getCompareKey());
                    aZ(filterBean, filterInfo.getFilterIntensityRatio());
                }
            }
        }
        Ai0(T9());
    }

    @Override // X.C1455870nzN
    public AbstractC1452680nuE G2() {
        AbstractC1452680nuE abstractC1452680nuEG2 = super.G2();
        if (abstractC1452680nuEG2 == null) {
            return null;
        }
        abstractC1452680nuEG2.LJIL = new InterfaceC1464190oCn() { // from class: X.0ntM
            @Override // X.InterfaceC1464190oCn
            public final void onRendered() {
                if (((Boolean) C0B9W.LIZ.getValue()).booleanValue()) {
                    this.LIZ.K = System.currentTimeMillis();
                }
                this.LIZ.g0.postValue(Unit.LIZ);
            }
        };
        return abstractC1452680nuEG2;
    }

    @Override // X.C1455870nzN
    public void L6() {
        b22().observe(this, new AObjectS241S0100000_8(this, 5));
        b22().observe(this, new C1453940nwG());
    }

    @Override // X.InterfaceC1446740nke
    public VideoPublishEditModel LJJJLIIL() {
        return xb();
    }

    @Override // X.InterfaceC1451050nrb
    public void LW1() {
        List<StickerItemModel> listDc = dc();
        xb();
        C1451420nsC c1451420nsC = new C1451420nsC(xb().getCreativeInfo(), xb().creativeModel, Ka(), this.LLLZLL, this.z, this.LLZ, getDiContainer(), listDc);
        this.y = c1451420nsC;
        this.LLLZLZ.setAdapter(c1451420nsC);
    }

    public final int T9() {
        return C297370Bl9.LIZ() ? this.LLLZLZ.getCurrentItem() : this.A;
    }

    @Override // X.C1455870nzN
    public int W6() {
        AbstractC1452680nuE abstractC1452680nuEGc;
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0FGD.LIZ = new C1451840nss(C1451980nt6.LIZ);
        if (((Boolean) C0APT.LIZ.getValue()).booleanValue()) {
            QD1().setLoadImageOptimizeByVEUserConfig(true);
        }
        int iW6 = super.W6();
        if (C1452960nug.LJIIL) {
            C1420050n3b c1420050n3bJ9 = J9();
            InterfaceC1452170ntP interfaceC1452170ntPO4 = O4();
            c1420050n3bJ9.LIZ((interfaceC1452170ntPO4 == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPO4)) == null || (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) == null) ? null : iNLEMediaSession.getPlayerApi());
        }
        AbstractC1452680nuE abstractC1452680nuEGc2 = gc();
        if (abstractC1452680nuEGc2 != null) {
            abstractC1452680nuEGc2.LJJ().df(new InterfaceC1464200oCo() { // from class: X.0ntW
                @Override // X.InterfaceC1464200oCo
                public final void onCallback(int i, int i2, float f, String str) {
                    InterfaceC1450920nrO interfaceC1450920nrO;
                    if (i == 4101 && (interfaceC1450920nrO = (InterfaceC1450920nrO) this.LL.getDiContainer().LJIIL(null, InterfaceC1450920nrO.class)) != null) {
                        interfaceC1450920nrO.qB0();
                    }
                }
            });
        }
        AbstractC1452680nuE abstractC1452680nuEGc3 = gc();
        ((C1463670oBx) (abstractC1452680nuEGc3 != null ? abstractC1452680nuEGc3.LJJ() : null)).LJFF = true;
        if (((Boolean) C1402860mbs.LIZJ.getValue()).booleanValue() && (abstractC1452680nuEGc = gc()) != null) {
            abstractC1452680nuEGc.LJJ().Kf((NLECommitStatisticsConfig) C1402860mbs.LIZIZ.getValue());
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        this.I = jElapsedRealtime2;
        this.H = jElapsedRealtime2 - jElapsedRealtime;
        rO("end VEEditor init");
        return iW6;
    }

    @Override // X.C1455870nzN
    public void Z7() {
        AbstractC1452680nuE abstractC1452680nuEGc;
        SingleImageCoverBitmapData singleImageCoverBitmapData;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.Z7();
        if (C0BMM.LIZ() && (abstractC1452680nuEGc = gc()) != null) {
            InterfaceC1452170ntP interfaceC1452170ntPLJJ = abstractC1452680nuEGc.LJJ();
            List<SingleImageData> imageList = Ka().getImageList();
            ArrayList<SingleImageCoverBitmapData> arrayList = new ArrayList();
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                CameraPhotoInfo cameraPhotoInfo = it2.next().getCameraPhotoInfo();
                if (cameraPhotoInfo != null && (singleImageCoverBitmapData = cameraPhotoInfo.getSingleImageCoverBitmapData()) != null) {
                    arrayList.add(singleImageCoverBitmapData);
                }
            }
            for (SingleImageCoverBitmapData singleImageCoverBitmapData2 : arrayList) {
                if (singleImageCoverBitmapData2.isReuseTexture() && singleImageCoverBitmapData2.getItemCoverWidth() > 0) {
                    interfaceC1452170ntPLJJ.setPreviewSurfaceTexDesc(singleImageCoverBitmapData2.getSourcePath());
                }
            }
        }
        this.G = SystemClock.elapsedRealtime() - jElapsedRealtime;
        rO("end prepare editor");
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public void gx2() {
        C1450990nrV item = getItem(T9());
        if (item != null) {
            item.LLLLJI(new AwS566S0100000_22(item, 177));
        }
        C1450990nrV item2 = getItem(T9() - 1);
        if (item2 != null) {
            C23250099c.LIZLLL(item2.LLLLLL, null, null, new C1451070nrd(item2, null), 3);
        }
        C1450990nrV item3 = getItem(T9() + 1);
        if (item3 != null) {
            C23250099c.LIZLLL(item3.LLLLLL, null, null, new C1451070nrd(item3, null), 3);
        }
    }

    @Override // X.InterfaceC1451050nrb
    public int h7() {
        return T9();
    }

    @Override // X.C1455870nzN, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        init();
    }

    @Override // X.C1455870nzN, X.AbstractC2255721DQs
    public void onDestroy() {
        C1463670oBx c1463670oBx;
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        InterfaceC1452170ntP interfaceC1452170ntPLJJ = abstractC1452680nuEGc != null ? abstractC1452680nuEGc.LJJ() : null;
        if ((interfaceC1452170ntPLJJ instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntPLJJ) != null) {
            C1402850mbr.LIZ(c1463670oBx.LJIILL, c1463670oBx.LJIILLIIL);
        }
        super.onDestroy();
        InterfaceC572870MdR interfaceC572870MdRN0 = N0();
        if (interfaceC572870MdRN0 != null) {
            interfaceC572870MdRN0.release();
        }
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        C364210EPr.LIZ(this.M);
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
        InterfaceC1452460nts interfaceC1452460ntsGa;
        InterfaceC1452510ntx interfaceC1452510ntxYb;
        InterfaceC1451320ns2 interfaceC1451320ns2Bb;
        super.onResume();
        if (this.I > 0 && this.f157J == 0) {
            this.f157J = SystemClock.elapsedRealtime() - this.I;
        }
        InterfaceC1452390ntl interfaceC1452390ntlNa = Na();
        if ((interfaceC1452390ntlNa == null || !interfaceC1452390ntlNa.isShowing()) && (((interfaceC1452460ntsGa = Ga()) == null || !interfaceC1452460ntsGa.LJJII()) && (((interfaceC1452510ntxYb = yb()) == null || !interfaceC1452510ntxYb.isShowing()) && ((interfaceC1451320ns2Bb = Bb()) == null || !interfaceC1451320ns2Bb.LJJII())))) {
            vW1().setValue(C1452730nuJ.LIZ());
        }
        this.D = System.currentTimeMillis();
        xb().creativeModel.ffdEventReport.editUiFFD = this.D;
        this.L = true;
    }

    @Override // X.C1455870nzN, X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        InterfaceC572870MdR interfaceC572870MdRN0 = N0();
        if (interfaceC572870MdRN0 != null) {
            interfaceC572870MdRN0.pause();
        }
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public void tU0() {
        C1462070o9N c1462070o9NN51 = N51();
        if (c1462070o9NN51 != null) {
            c1462070o9NN51.LLLLLZ();
        }
        C1462070o9N c1462070o9NN512 = N51();
        if (c1462070o9NN512 != null) {
            c1462070o9NN512.LLLLLLJ().LLZZ();
        }
    }

    public final void wc() {
        C1450990nrV item = getItem(T9() - 1);
        if (item != null) {
            boolean autoEnhanceOn = Ka().getAutoEnhanceOn();
            C1450940nrQ c1450940nrQ = item.LLJLIL;
            if (c1450940nrQ == null) {
                c1450940nrQ = null;
            }
            if (autoEnhanceOn != c1450940nrQ.LIZJ() && c1450940nrQ.LIZ.getVisibility() == 0) {
                c1450940nrQ.LIZ(Boolean.valueOf(autoEnhanceOn), null);
            }
        }
        C1450990nrV item2 = getItem(T9() + 1);
        if (item2 != null) {
            boolean autoEnhanceOn2 = Ka().getAutoEnhanceOn();
            C1450940nrQ c1450940nrQ2 = item2.LLJLIL;
            if (c1450940nrQ2 == null) {
                c1450940nrQ2 = null;
            }
            if (autoEnhanceOn2 == c1450940nrQ2.LIZJ() || c1450940nrQ2.LIZ.getVisibility() != 0) {
                return;
            }
            c1450940nrQ2.LIZ(Boolean.valueOf(autoEnhanceOn2), null);
        }
    }

    @Override // X.InterfaceC1451050nrb
    public MutableLiveData<Boolean> DE() {
        return this.f160Y;
    }

    @Override // X.InterfaceC1451050nrb
    public LiveData<Boolean> E41() {
        return this.c0;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Boolean> FV1() {
        return this.LLZLL;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Unit> GW1() {
        return this.LLZZ;
    }

    @Override // X.InterfaceC1451050nrb
    public LiveData<Unit> JS() {
        return this.f162h0;
    }

    @Override // X.InterfaceC1451050nrb
    public FrameLayout Jz2() {
        return this.LLLZZ;
    }

    @Override // X.InterfaceC1451050nrb
    public View LLLIIIIL() {
        return this.LLLZLZ;
    }

    public final C1462760oAU Lb() {
        return this.LLLZLZ;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<VEPreviewMusicParams> ML1() {
        return this.LLZLLLL;
    }

    @Override // X.InterfaceC1446740nke
    public /* bridge */ /* synthetic */ C385670FAf Md2() {
        return this.d;
    }

    @Override // X.InterfaceC1451050nrb
    public InterfaceC572870MdR N0() {
        return this.k;
    }

    @Override // X.InterfaceC1451050nrb
    public LiveData<Boolean> PV1() {
        return this.Z;
    }

    @Override // X.InterfaceC1451050nrb
    public MutableLiveData<Runnable> Qn2() {
        return this.f161e0;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Boolean> SE() {
        return this.b;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Unit> Te1() {
        return this.f0;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Unit> Tf2() {
        return this.LLZL;
    }

    @Override // X.InterfaceC1451050nrb
    public LiveData<Integer> UA1() {
        return this.b0;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Unit> UU() {
        return this.LLZLI;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<SwitchModePayload> Vh() {
        return this.LLZZZZ;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Integer> ZK() {
        return this.LLZLLIL;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Unit> a62() {
        return this.LLZILL;
    }

    @Override // X.InterfaceC1446740nke
    public /* bridge */ /* synthetic */ InterfaceC356850Dyt az1() {
        return this.LLZZJLIL;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Boolean> cA2() {
        return this.a;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Unit> cW0() {
        return this.LLZZLLIL;
    }

    @Override // X.InterfaceC1451050nrb
    public MutableLiveData<Boolean> gJ() {
        return this.P;
    }

    public h0<Boolean> gb() {
        return this.d;
    }

    public final Boolean kc() {
        return this.LLLZZIL;
    }

    @Override // X.InterfaceC1446740nke
    public LiveData<Unit> l02() {
        return this.LLZZZIL;
    }

    @Override // X.InterfaceC1451050nrb
    public MutableLiveData<Boolean> sH1() {
        return this.Q;
    }

    public C356830Dyr sa() {
        return this.LLZZJLIL;
    }

    @Override // X.InterfaceC1446740nke
    public LiveEvent<Unit> t90() {
        return this.c;
    }

    public final FrameLayout tb() {
        return this.LLLZZ;
    }

    @Override // X.C1455870nzN
    public void w9() {
        W1();
    }

    @Override // X.InterfaceC1451050nrb
    public C1450090nq3 wD0() {
        return this.z;
    }

    @Override // X.InterfaceC1451050nrb
    public LiveEvent<Unit> yd1() {
        return this.a0;
    }

    private final float Ba(FilterBean filterBean) {
        if (this.LLILZ.LIZ.invoke().booleanValue()) {
            if (xq1().getValue() != null && zj2().getValue() != null) {
                InterfaceC358220E2q value = xq1().getValue();
                InterfaceC1453220nv6 value2 = zj2().getValue();
                float fLIZLLL = C1453210nv5.LIZLLL(filterBean, value.LIZ(filterBean, value2), value2);
                if (fLIZLLL != -1.0f) {
                    return fLIZLLL;
                }
            }
            return 0.8f;
        }
        return 1.0f;
    }

    private final int I9(int i) {
        int i2 = i - 1;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "photo_mode_use_shorter_music_clip", true, false)) {
            return (i2 * 5000) + 15000;
        }
        return (i2 * 10000) + 30000;
    }

    private final void Nc(C1453000nuk c1453000nuk) {
        ImageFilterInfo filterInfo;
        String filterId;
        FilterBean filterBeanLJIIIIZZ;
        ImageFilterInfo filterInfo2;
        FilterBean filterBean = c1453000nuk.LIZIZ;
        if (filterBean == null) {
            return;
        }
        float fBa = Ba(filterBean);
        SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(T9(), Ka().getImageList());
        String filterFolder = null;
        if (singleImageData != null && (filterInfo = singleImageData.getFilterInfo()) != null && (filterId = filterInfo.getFilterId()) != null && filterId.length() != 0) {
            SingleImageData singleImageData2 = (SingleImageData) C13LP.LJJJLZIJ(T9(), Ka().getImageList());
            if (singleImageData2 != null && (filterInfo2 = singleImageData2.getFilterInfo()) != null) {
                filterBeanLJIIIIZZ = C574070MfN.LJIIIIZZ(filterInfo2);
            } else {
                filterBeanLJIIIIZZ = null;
            }
            String filterFolder2 = filterBean.getFilterFolder();
            if (filterBeanLJIIIIZZ != null) {
                filterFolder = filterBeanLJIIIIZZ.getFilterFolder();
            }
            if (Intrinsics.LJFF(filterFolder2, filterFolder)) {
                Da().LJII(fBa, filterBean.getFilterFolder());
            } else {
                Da().LJ(filterBeanLJIIIIZZ, filterBean, fBa, false);
            }
        } else {
            Da().LIZJ();
            Da().LIZ(filterBean.getFilterFolder(), Collections.singletonList(new Pair(C1643880ssc.LIZJ(filterBean), Float.valueOf(fBa))), filterBean.getCategoryKey(), filterBean.getName(), filterBean.getId(), filterBean.getResId(), filterBean.getExtra(), fBa, false);
        }
        C1450610nqt c1450610nqtYa = Ya();
        if (c1450610nqtYa != null) {
            c1450610nqtYa.LIZ(fBa, c1453000nuk.LIZIZ);
        }
    }

    private final void cd(C1453000nuk c1453000nuk) {
        FilterBean filterBean;
        String id;
        long jLongValue;
        String name;
        String filterFolder;
        String extra;
        ImageFilterInfo filterInfo;
        String resId;
        if (c1453000nuk != null && (filterBean = c1453000nuk.LIZIZ) != null && (id = filterBean.getId()) != null) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(id);
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            FilterBean filterBean2 = c1453000nuk.LIZIZ;
            String str = "";
            if (filterBean2 == null || (name = filterBean2.getName()) == null) {
                name = "";
            }
            FilterBean filterBean3 = c1453000nuk.LIZIZ;
            if (filterBean3 == null || (filterFolder = filterBean3.getFilterFolder()) == null) {
                filterFolder = "";
            }
            FilterBean filterBean4 = c1453000nuk.LIZIZ;
            if (filterBean4 != null && (resId = filterBean4.getResId()) != null) {
                str = resId;
            }
            FilterBean filterBean5 = c1453000nuk.LIZIZ;
            if (filterBean5 != null) {
                extra = filterBean5.getExtra();
            } else {
                extra = null;
            }
            TemplateFilterBean templateFilterBean = new TemplateFilterBean(jLongValue, name, filterFolder, str, extra);
            SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(T9(), Ka().getImageList());
            if (singleImageData != null && (filterInfo = singleImageData.getFilterInfo()) != null) {
                filterInfo.setFilterBean(templateFilterBean);
            }
        }
    }

    private final C11NZ<String> fd(int i) {
        return C1457440o1u.LIZIZ(xb(), 0L, i, null, 8);
    }

    private final boolean mc(MotionEvent motionEvent) {
        RectF rectFLIZLLL = C1428310nGv.LIZLLL(this.LLLZLZ);
        rectFLIZLLL.top += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
        rectFLIZLLL.bottom -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
        if (C444960Hcc.LIZIZ()) {
            rectFLIZLLL.left += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110));
        } else {
            rectFLIZLLL.right -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110));
        }
        return rectFLIZLLL.contains(motionEvent.getRawX(), motionEvent.getRawY());
    }

    private final void nc(Function0<Unit> function0) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "image_music_pause_error_switch", true, true)) {
            C0CNO.LIZ(C15O7.LJI, function0);
        } else {
            function0.invoke();
        }
    }

    @Override // X.InterfaceC1451050nrb
    public void Ai0(int i) {
        C1450990nrV item = getItem(i - 1);
        if (item != null) {
            item.LJJJI();
        }
        C1450990nrV item2 = getItem(i + 1);
        if (item2 != null) {
            item2.LJJJI();
        }
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public void EH2(boolean z) {
        C1450990nrV item = getItem(T9());
        if (item != null) {
            item.LLLLLLLLL(z);
        }
        C1450990nrV item2 = getItem(T9() - 1);
        if (item2 != null) {
            item2.LLLLLLLLL(z);
        }
        C1450990nrV item3 = getItem(T9() + 1);
        if (item3 != null) {
            item3.LLLLLLLLL(z);
        }
    }

    @Override // X.InterfaceC1451050nrb
    public void K92(boolean z) {
        this.c0.setValue(Boolean.valueOf(z));
    }

    public final boolean Kc(MotionEvent motionEvent) {
        InterfaceC1453420nvQ interfaceC1453420nvQV9;
        if (aN1()) {
            da().dr2(false, false);
            return true;
        }
        C1462070o9N c1462070o9NN51 = N51();
        if ((c1462070o9NN51 == null || !c1462070o9NN51.LLLLLZ()) && C1428520nHG.LJIL(xb()) && (interfaceC1453420nvQV9 = V9()) != null && !interfaceC1453420nvQV9.A8() && !C1441080nbW.LIZIZ(xb())) {
            if (pa().fi1() && C0C64.LJIILLIIL().LJIIIZ(31744, "photo_toolbar_collapse_optimize", true, false)) {
                pa().bo();
                return true;
            }
            if (mc(motionEvent) && motionEvent.getEventTime() - motionEvent.getDownTime() < 500) {
                C1462070o9N c1462070o9NN512 = N51();
                if (c1462070o9NN512 != null) {
                    C1462070o9N.LLLZLL(c1462070o9NN512, null, null, 3);
                }
                u4.LJJLIIIIJ(xb(), "tap_anywhere", 0, null, null, null, null, null, null, null, 1016);
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1451050nrb
    public void LLLZ(List<SingleImageData> list) {
        ArrayList<String> arrayList;
        String path;
        ImageAlbumData imageAlbumDataKa = Ka();
        ArrayList arrayList2 = new ArrayList(imageAlbumDataKa.getImageList());
        arrayList2.addAll(list);
        imageAlbumDataKa.setImageList(arrayList2);
        MvCreateVideoData mvCreateVideoData = xb().getMvCreateVideoData();
        if (mvCreateVideoData != null && (arrayList = mvCreateVideoData.selectMediaList) != null) {
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (SingleImageData singleImageData : list) {
                ImportVideoInfo originAlbumImageData = singleImageData.getOriginAlbumImageData();
                if (originAlbumImageData == null || (path = originAlbumImageData.getOriginImportPath()) == null) {
                    path = singleImageData.getSrcImageInfo().getPath();
                }
                arrayList3.add(path);
            }
            arrayList.addAll(arrayList3);
        }
        C1451420nsC c1451420nsC = this.y;
        if (c1451420nsC == null) {
            c1451420nsC = null;
        }
        c1451420nsC.LJJIL(Ka().getImageList());
        ed();
    }

    @Override // X.InterfaceC1451050nrb
    public void LLLZLL(int i) {
        ArrayList<String> arrayList;
        if (C294080Bfq.LIZ() && i >= Ka().getImageList().size()) {
            return;
        }
        ma().m7("delete image");
        C13LP.LLIIII(new IntRange(i, Ka().getImageList().size()));
        ImageAlbumData imageAlbumDataKa = Ka();
        ArrayList arrayList2 = new ArrayList(imageAlbumDataKa.getImageList());
        ListProtector.remove(arrayList2, i);
        imageAlbumDataKa.setImageList(arrayList2);
        if (C0BMN.LIZ() && C1428470nHB.LJJLIIIJJIZ(xb())) {
            C1428470nHB.LLILZLL(xb());
        }
        if (C573570MeZ.LIZJ(getEditModel())) {
            this.LLZIL.invoke();
        }
        CoverPublishModel coverPublishModel = xb().getCoverPublishModel();
        if (coverPublishModel != null) {
            int imageCurrentIndex = coverPublishModel.getImageCurrentIndex();
            if (imageCurrentIndex == i) {
                imageCurrentIndex = 0;
            } else if (imageCurrentIndex > i) {
                imageCurrentIndex--;
            }
            coverPublishModel.setImageCurrentIndex(imageCurrentIndex);
            MvCreateVideoData mvCreateVideoData = xb().getMvCreateVideoData();
            if (mvCreateVideoData != null && (arrayList = mvCreateVideoData.selectMediaList) != null && i < arrayList.size()) {
                ListProtector.remove(arrayList, i);
            }
            C1451420nsC c1451420nsC = this.y;
            if (c1451420nsC == null) {
                c1451420nsC = null;
            }
            c1451420nsC.LJJIL(Ka().getImageList());
            ed();
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC1451050nrb
    public void Lr2(boolean z) {
        if (z) {
            InterfaceC572870MdR interfaceC572870MdRN0 = N0();
            if (interfaceC572870MdRN0 != null) {
                interfaceC572870MdRN0.pause();
                return;
            }
            return;
        }
        InterfaceC572870MdR interfaceC572870MdRN02 = N0();
        if (interfaceC572870MdRN02 == null) {
            return;
        }
        interfaceC572870MdRN02.resume();
    }

    public final void Mc(boolean z) {
        if (aN1() || C1441980ncy.LIZIZ(xb())) {
            return;
        }
        InterfaceC1441090nbX interfaceC1441090nbXOa = Oa();
        if (interfaceC1441090nbXOa != null) {
            interfaceC1441090nbXOa.Tr(z);
        }
        if (z) {
            C1454040nwQ c1454040nwQ = C1454040nwQ.LIZ;
            VideoPublishEditModel videoPublishEditModelXb = xb();
            c1454040nwQ.getClass();
            C0LAB c0labLIZJ = C1454040nwQ.LIZJ(videoPublishEditModelXb, "video_edit_page");
            c0labLIZJ.LJ("method", "swipe");
            C20684815ws.LJIILLIIL("show_photo_bar", c0labLIZJ.LIZ);
        }
    }

    public final void Vb(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        new C20576115fL((ViewStub) viewGroup.findViewById(R.id.gqv)).LIZIZ(new AwS566S0100000_22(this, 186), new AwS566S0100000_22(this, 187));
    }

    @Override // X.InterfaceC1451050nrb
    public void Vx1(VEPreviewMusicParams vEPreviewMusicParams) {
        super.JA2(vEPreviewMusicParams, null);
    }

    @Override // X.C1455870nzN
    public void Z1(C1453000nuk c1453000nuk) {
        if (c1453000nuk != null && c1453000nuk.LIZIZ != null) {
            C1451980nt6.LIZ.getClass();
            boolean z = false;
            C1451980nt6.LIZIZ = false;
            FilterBean filterBean = c1453000nuk.LIZIZ;
            if (filterBean != null && C1643880ssc.LJ(filterBean)) {
                z = true;
            }
            SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(T9(), Ka().getImageList());
            if (singleImageData == null) {
                return;
            }
            FilterBean filterBean2 = c1453000nuk.LIZIZ;
            if (filterBean2 != null) {
                String id = singleImageData.getId();
                if (id == null) {
                    id = singleImageData.getSrcImageInfo().getPath();
                }
                filterBean2.setCompareKey(C355910DxN.LIZ(filterBean2, z, id));
            }
            cd(c1453000nuk);
            if (z) {
                Nc(c1453000nuk);
            } else {
                AbstractC1452680nuE abstractC1452680nuEGc = gc();
                if (abstractC1452680nuEGc != null) {
                    abstractC1452680nuEGc.LJIIJ(c1453000nuk.LIZIZ, this.LLILZ.LIZ.invoke().booleanValue());
                }
            }
            C1450610nqt c1450610nqtYa = Ya();
            if (c1450610nqtYa != null) {
                c1450610nqtYa.LJ = true;
            }
        }
    }

    @Override // X.InterfaceC1451050nrb
    public void Z9(InterfaceC572870MdR interfaceC572870MdR) {
        this.k = interfaceC572870MdR;
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public void fu1(C346940Diu c346940Diu) {
        float fFloatValue;
        C1462760oAU c1462760oAU = this.LLLZLZ;
        Float f = c346940Diu.LJ;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1462760oAU);
        c1462760oAU.setTranslationY(-fFloatValue);
    }

    @Override // X.InterfaceC1451050nrb
    /* JADX INFO: renamed from: kb, reason: merged with bridge method [inline-methods] */
    public C1450990nrV getItem(int i) {
        if (i < 0) {
            return null;
        }
        C1451420nsC c1451420nsC = this.y;
        if (c1451420nsC == null) {
            c1451420nsC = null;
        }
        if (i > c1451420nsC.getCount() - 1) {
            return null;
        }
        C1451420nsC c1451420nsC2 = this.y;
        if (c1451420nsC2 == null) {
            c1451420nsC2 = null;
        }
        C19A3 c19a3LJJIJL = c1451420nsC2.LJJIJL(i);
        if (!(c19a3LJJIJL instanceof C1450990nrV)) {
            return null;
        }
        return (C1450990nrV) c19a3LJJIJL;
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public void kw0(C346940Diu c346940Diu) {
        float fFloatValue;
        float fFloatValue2;
        C0FWA c0fwaLIZJ;
        C1450990nrV item = getItem(T9());
        if (item != null) {
            Float f = c346940Diu.LIZJ;
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            Float f2 = c346940Diu.LIZLLL;
            float fFloatValue3 = 0.0f;
            if (f2 != null) {
                fFloatValue2 = f2.floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
            Float f3 = c346940Diu.LJ;
            if (f3 != null) {
                fFloatValue3 = f3.floatValue();
            }
            new ImageTransformParams(fFloatValue, fFloatValue2, fFloatValue3, 0.0f, false, false);
            C348100Dkm c348100DkmLLLLLJLJLL = item.LLLLLJLJLL();
            if (c348100DkmLLLLLJLJLL != null && (c0fwaLIZJ = c348100DkmLLLLLJLJLL.LIZJ()) != null) {
                c0fwaLIZJ.LJIIZILJ(c346940Diu);
            }
        }
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public void l4(boolean z) {
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        ImageFilterInfo filterInfo;
        AbstractC1452680nuE abstractC1452680nuEGc = gc();
        if (abstractC1452680nuEGc != null && (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) != null) {
            C391360FWc.LIZLLL("", interfaceC1452170ntPLJIJ, new AwS601S0100000_22(this, 125));
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "photo_mode_fix_filter_local_image", true, true)) {
                SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(T9(), Ka().getImageList());
                if (singleImageData != null && (filterInfo = singleImageData.getFilterInfo()) != null) {
                    filterInfo.setNeedRender(true);
                }
                C1450990nrV item = getItem(T9());
                if (item != null) {
                    item.LLLIIL.LJ = true;
                    return;
                }
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC1451050nrb
    public void mz(boolean z) {
        SurfaceView surfaceViewLJIJJLI;
        int i;
        InterfaceC1452360nti interfaceC1452360ntiCb = Cb();
        if (interfaceC1452360ntiCb != null && (surfaceViewLJIJJLI = interfaceC1452360ntiCb.LJIJJLI()) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLIIII(surfaceViewLJIJJLI, i);
        }
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public void nM0(boolean z) {
        super.nM0(z);
        C1451630nsX c1451630nsXOa = oa();
        if (c1451630nsXOa != null) {
            c1451630nsXOa.LIZIZ(new AwS35S0010000_22(z, 8));
        }
        InterfaceC1464960oE2 interfaceC1464960oE2 = (InterfaceC1464960oE2) getDiContainer().LJIIL(null, InterfaceC1464960oE2.class);
        if (interfaceC1464960oE2 != null) {
            interfaceC1464960oE2.ur(new AwS35S0010000_22(z, 9));
        }
    }

    @Override // X.C1455870nzN
    public void o7(Integer num) {
        Object objValueOf;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", xb().getEnterFrom());
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(xb()));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(xb()));
        c0lab.LJ("shoot_way", xb().mShootWay);
        c0lab.LJ("creation_id", xb().getCreationId());
        c0lab.LIZ(C1428470nHB.LJJJZ(xb()) ? 1 : 0, "is_draft");
        c0lab.LIZ(xb().creativeModel.draftInfoModel.draftAwemeType, "draft_aweme_type");
        VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiterC3 = c3();
        if (vEEditorAutoStartStopArbiterC3 != null) {
            objValueOf = Integer.valueOf(vEEditorAutoStartStopArbiterC3.LLJJ);
        } else {
            objValueOf = null;
        }
        c0lab.LIZLLL(objValueOf, "error_code");
        C20684815ws.LJIILLIIL("tool_performance_edit_preview_result", c0lab.LIZ);
    }

    @Override // X.InterfaceC1451050nrb
    public void rO(String str) {
        if (this.N) {
            return;
        }
        C1439810nZT c1439810nZT = (C1439810nZT) getDiContainer().LJIIL(null, C1439810nZT.class);
        if (c1439810nZT != null && c1439810nZT.LIZ() != null) {
            return;
        }
        C524780Ki4.LIZ.step("av_image_edit", str);
    }

    private final void aZ(FilterBean filterBean, float f) {
        InterfaceC358220E2q value;
        InterfaceC1453220nv6 value2;
        if (!this.LLILZ.LIZ.invoke().booleanValue() || (value = xq1().getValue()) == null || (value2 = zj2().getValue()) == null) {
            return;
        }
        value.LIZIZ(filterBean, C1453210nv5.LIZJ(filterBean, f, value2));
    }

    @Override // X.InterfaceC1451050nrb
    public void AK0(List<SingleImageData> list, boolean z) {
        C1451420nsC c1451420nsC = this.y;
        if (c1451420nsC == null) {
            c1451420nsC = null;
        }
        c1451420nsC.LJJIL(Ka().getImageList());
        InterfaceC1441090nbX interfaceC1441090nbXOa = Oa();
        if (interfaceC1441090nbXOa != null) {
            interfaceC1441090nbXOa.hH1(z);
        }
        ed();
    }

    @Override // X.InterfaceC1451050nrb
    public void F71(int i, SingleImageData singleImageData) {
        ArrayList<String> arrayList;
        ImageAlbumData imageAlbumDataKa = Ka();
        ArrayList arrayList2 = new ArrayList(imageAlbumDataKa.getImageList());
        if (i >= 0 && i < arrayList2.size()) {
            ListProtector.set(arrayList2, i, singleImageData);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateItem invalid index:");
            sbLIZ.append(i);
            sbLIZ.append(" for ");
            sbLIZ.append(imageAlbumDataKa.getImageList().size());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        imageAlbumDataKa.setImageList(arrayList2);
        MvCreateVideoData mvCreateVideoData = xb().getMvCreateVideoData();
        if (mvCreateVideoData != null && (arrayList = mvCreateVideoData.selectMediaList) != null) {
            if (i >= 0 && i < arrayList.size()) {
                ListProtector.set(arrayList, i, singleImageData.getSrcImageInfo().getPath());
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateItem 2 invalid index:");
                sbLIZ2.append(i);
                sbLIZ2.append(" for ");
                sbLIZ2.append(arrayList.size());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        C1451420nsC c1451420nsC = this.y;
        if (c1451420nsC == null) {
            c1451420nsC = null;
        }
        c1451420nsC.LJJIL(Ka().getImageList());
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public void J00(float f, float f2) {
        C1450990nrV item = getItem(T9());
        if (item != null) {
            C1450990nrV.LLLZ(item, f, f2);
        }
        C1450990nrV item2 = getItem(T9() - 1);
        if (item2 != null) {
            C1450990nrV.LLLZ(item2, f, f2);
        }
        C1450990nrV item3 = getItem(T9() + 1);
        if (item3 != null) {
            C1450990nrV.LLLZ(item3, f, f2);
        }
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public boolean JA2(VEPreviewMusicParams vEPreviewMusicParams, List<? extends VEPreviewMusicParams> list) {
        nc(new AwS409S0200000_8(vEPreviewMusicParams, this, 11));
        if (C12DO.LIZ()) {
            C0MS9.LIZ(this.LLLLLLL, vEPreviewMusicParams);
            C0MS9.LIZIZ(this.LLLLLLLLL, vEPreviewMusicParams);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC1446740nke
    public void Jy0(long j, long j2) {
        this.E = j;
        this.F = j2;
    }

    @Override // X.InterfaceC1451050nrb
    public void Q22(int i, SingleImageData singleImageData) {
        ArrayList<String> arrayList;
        String path;
        if (i >= 0 && i < Ka().getImageList().size()) {
            ImageAlbumData imageAlbumDataKa = Ka();
            ArrayList arrayList2 = new ArrayList(imageAlbumDataKa.getImageList());
            ListProtector.set(arrayList2, i, singleImageData);
            imageAlbumDataKa.setImageList(arrayList2);
            MvCreateVideoData mvCreateVideoData = xb().getMvCreateVideoData();
            if (mvCreateVideoData != null && (arrayList = mvCreateVideoData.selectMediaList) != null && i <= arrayList.size()) {
                ImportVideoInfo originAlbumImageData = singleImageData.getOriginAlbumImageData();
                if (originAlbumImageData == null || (path = originAlbumImageData.getOriginImportPath()) == null) {
                    path = singleImageData.getSrcImageInfo().getPath();
                }
                ListProtector.set(arrayList, i, path);
            }
            C1451420nsC c1451420nsC = this.y;
            if (c1451420nsC == null) {
                c1451420nsC = null;
            }
            c1451420nsC.LJJIL(Ka().getImageList());
            ed();
        }
    }

    @Override // X.InterfaceC1451050nrb
    public void Sq2(int i, int i2) {
        IntRange intRange;
        ArrayList<String> arrayList;
        if (i <= i2) {
            intRange = new IntRange(i, i2);
        } else {
            intRange = new IntRange(i2, i);
        }
        C13LP.LLIIII(intRange);
        ImageAlbumData imageAlbumDataKa = Ka();
        List<SingleImageData> imageList = imageAlbumDataKa.getImageList();
        CoverPublishModel coverPublishModel = xb().getCoverPublishModel();
        if (coverPublishModel != null) {
            ListProtector.get(imageList, coverPublishModel.getImageCurrentIndex());
            ArrayList arrayList2 = new ArrayList(imageAlbumDataKa.getImageList());
            ListProtector.add(arrayList2, i2, ListProtector.remove(arrayList2, i));
            VideoPublishEditModel editModel = getEditModel();
            C1432530nNj.LIZ(editModel);
            CoverPublishModel coverPublishModel2 = editModel.getCoverPublishModel();
            if (coverPublishModel2 != null) {
                coverPublishModel2.getEffectTextModel().setHasCoverText(false);
                coverPublishModel2.setImageCurrentIndex(0);
            }
            imageAlbumDataKa.setImageList(arrayList2);
            MvCreateVideoData mvCreateVideoData = xb().getMvCreateVideoData();
            if (mvCreateVideoData != null && (arrayList = mvCreateVideoData.selectMediaList) != null && arrayList.size() == Ka().getImageList().size()) {
                ListProtector.add(arrayList, i2, ListProtector.remove(arrayList, i));
            }
            C1451420nsC c1451420nsC = this.y;
            if (c1451420nsC == null) {
                c1451420nsC = null;
            }
            c1451420nsC.LJJIL(Ka().getImageList());
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC1451050nrb
    public void Up1(List<SingleImageData> list, List<Integer> list2) {
        Iterator<Integer> it2 = list2.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            ArrayList arrayListLIZ = C09HN.LIZ(Ka().getImageList());
            if (arrayListLIZ == null) {
                arrayListLIZ = new ArrayList(Ka().getImageList());
            }
            ListProtector.set(arrayListLIZ, iIntValue, ListProtector.get(list, iIntValue));
            Ka().setImageList(arrayListLIZ);
        }
        C1451420nsC c1451420nsC = this.y;
        if (c1451420nsC == null) {
            c1451420nsC = null;
        }
        c1451420nsC.LJJIL(Ka().getImageList());
        InterfaceC1441090nbX interfaceC1441090nbXOa = Oa();
        if (interfaceC1441090nbXOa != null) {
            interfaceC1441090nbXOa.hH1(false);
        }
    }

    @Override // X.C1455870nzN
    public String X1(FilterBean filterBean, String str) {
        if (filterBean == null) {
            return null;
        }
        return super.X1(filterBean, str);
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public void cv0(C346940Diu c346940Diu, boolean z) {
        C1450990nrV item = getItem(T9());
        if (item != null) {
            item.LLLLLZ(c346940Diu);
        }
    }

    @Override // X.InterfaceC1451050nrb
    public void r40(int i, SingleImageData singleImageData) {
        ArrayList<String> arrayList;
        ImageAlbumData imageAlbumDataKa = Ka();
        ArrayList arrayList2 = new ArrayList(imageAlbumDataKa.getImageList());
        if (i >= 0 && i <= arrayList2.size()) {
            ListProtector.add(arrayList2, i, singleImageData);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addItem invalid index:");
            sbLIZ.append(i);
            sbLIZ.append(" for ");
            sbLIZ.append(imageAlbumDataKa.getImageList().size());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        imageAlbumDataKa.setImageList(arrayList2);
        MvCreateVideoData mvCreateVideoData = xb().getMvCreateVideoData();
        if (mvCreateVideoData != null && (arrayList = mvCreateVideoData.selectMediaList) != null) {
            if (i >= 0 && i <= arrayList.size()) {
                ListProtector.add(arrayList, i, singleImageData.getSrcImageInfo().getPath());
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("addItem 2 invalid index:");
                sbLIZ2.append(i);
                sbLIZ2.append(" for ");
                sbLIZ2.append(arrayList.size());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        C1451420nsC c1451420nsC = this.y;
        if (c1451420nsC == null) {
            c1451420nsC = null;
        }
        c1451420nsC.LJJIL(Ka().getImageList());
        ed();
    }

    @Override // X.C1455870nzN, X.InterfaceC1455860nzM
    public void rG2(boolean z, boolean z2, Function0<Unit> function0) {
        C1450990nrV item = getItem(T9());
        if (item != null) {
            if (z) {
                if (z2) {
                    item.LLLLJI(new AwS423S0200000_22(item, (C1450990nrV) function0, (Function0<Unit>) 15));
                    return;
                } else {
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1450990nrV.LLLLLLLLLL;
                    C01TT.LIZLLL(new AwS423S0200000_22(item, (C1450990nrV) function0, (Function0<Unit>) 18));
                    return;
                }
            }
            C01TT.LIZLLL(new AwS423S0200000_22(item, (C1450990nrV) function0, (Function0<Unit>) 16));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1452080ntG(C19A3 c19a3, C1DRG c1drg, VEPreviewParams vEPreviewParams, Function1<? super C1455930nzT, Unit> function1, C1462760oAU c1462760oAU, FrameLayout frameLayout, Boolean bool, Function0<Unit> function0, Function0<Unit> function02) {
        super(c1drg, vEPreviewParams, function1, null, 8, 0 == true ? 1 : 0);
        this.LLLZLL = c19a3;
        this.LLLZLZ = c1462760oAU;
        this.LLLZZ = frameLayout;
        this.LLLZZIL = bool;
        this.LLZ = function0;
        this.LLZIL = function02;
        this.LLZILL = new MutableLiveData();
        this.LLZL = new MutableLiveData();
        this.LLZLI = new MutableLiveData();
        this.LLZLL = new MutableLiveData();
        this.LLZLLIL = new MutableLiveData();
        this.LLZLLLL = new MutableLiveData();
        this.LLZZ = new MutableLiveData();
        this.LLZZLLIL = new MutableLiveData();
        this.LLZZZIL = new MutableLiveData();
        this.LLZZZZ = new MutableLiveData();
        this.a = new MutableLiveData();
        this.b = new MutableLiveData();
        this.c = new C560530Lyd();
        Boolean bool2 = Boolean.FALSE;
        this.d = new h0<>(bool2);
        this.e = AFwS210S0000000_22.get$arr$(90);
        this.f = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.g = C1449630npJ.LIZ(this, InterfaceC1453410nvP.class);
        this.h = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452510ntx.class, null);
        this.i = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452390ntl.class, null);
        this.j = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452460nts.class, null);
        this.l = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1453430nvR.class, null);
        this.m = new C1466810oH1(this, 12);
        this.n = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.o = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1453420nvQ.class, null);
        this.p = C1449630npJ.LIZ(this, InterfaceC1457250o1b.class);
        this.q = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1441090nbX.class, null);
        this.r = C1664770tQJ.LIZ(getDiContainer(), ImageAlbumData.class, null);
        this.s = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1418580n1E.class, null);
        this.t = new C1466810oH1(this, 2);
        this.u = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
        this.v = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.w = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451320ns2.class, null);
        this.x = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1417110myr.class), InterfaceC1417110myr.class);
        this.L = true;
        this.P = new MutableLiveData<>();
        this.Q = new MutableLiveData<>();
        this.R = C1664770tQJ.LIZ(getDiContainer(), C1420050n3b.class, null);
        this.U = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452360nti.class, null);
        this.V = C452501pT.LIZIZ(new AwS566S0100000_22(this, 185));
        this.W = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451520nsM.class, null);
        this.f159X = C1664770tQJ.LIZIZ(getDiContainer(), C1451630nsX.class, null);
        this.f160Y = new MutableLiveData<>();
        this.Z = new MutableLiveData<>(bool2);
        this.a0 = new C560530Lyd<>();
        this.b0 = new MutableLiveData<>();
        this.c0 = new MutableLiveData<>(bool2);
        this.f161e0 = new MutableLiveData<>();
        this.f0 = new MutableLiveData<>();
        MutableLiveData<Unit> mutableLiveData = new MutableLiveData<>();
        this.g0 = mutableLiveData;
        this.f162h0 = mutableLiveData;
    }
}
