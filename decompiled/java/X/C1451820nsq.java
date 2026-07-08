package X;

import Y.ARunnableS122S0100000_22;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.SurfaceView;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageEditModel;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEUtils;
import dmt.av.video.VEPreviewParams;
import ge.i;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0nsq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451820nsq extends i<InterfaceC1451590nsT, C1451000nrW, C1451220nrs, C1451240nru> implements InterfaceC379610EuV, InterfaceC1451590nsT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public static final int LLLFFI;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final VEPreviewParams LLJJ;
    public final C371280Eh4 LLJJI;
    public final C1455930nzT LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public RectF LLJJIJIL;
    public View LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final C01GW LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final LiveData<SurfaceView> LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final Function0<C1451220nrs> LLL;
    public final Function0<C1451240nru> LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1451820nsq.class, "commentImageEditModel", "getCommentImageEditModel()Lcom/ss/android/ugc/aweme/comment/image/model/ImageEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1451820nsq.class, "imageModeData", "getImageModeData()Lcom/ss/android/ugc/aweme/creative/model/edit/ImageAlbumData;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1451820nsq.class, "reuseSurfaceApiComponent", "getReuseSurfaceApiComponent()Lcom/bytedance/uicomponent/ReuseSurfaceApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1451820nsq.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        c09r3.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLLFFI = 8;
    }

    private final void R5(View view) {
    }

    public final void N5(SurfaceView surfaceView) {
    }

    private final MutableLiveData<C1456890o11> D5() {
        return (MutableLiveData) this.LLJZIJLIL.getValue();
    }

    private final MutableLiveData<InterfaceC1452170ntP> E5() {
        return (MutableLiveData) this.LLJLL.getValue();
    }

    private final int H5() {
        C0FGD.LIZ = new C1451830nsr(C1451980nt6.LIZ);
        C1463670oBx c1463670oBxGc = gc();
        if (c1463670oBxGc != null) {
            c1463670oBxGc.LJFF = true;
        }
        return 1;
    }

    private final SurfaceView LJIJJLI() {
        return (SurfaceView) this.LLJLLIL.getValue();
    }

    private final Activity getActivity() {
        return (Activity) this.LLJLILLLLZIIL.getValue(this, LLLFF[3]);
    }

    public final InterfaceC1452360nti C5() {
        return (InterfaceC1452360nti) this.LLJL.getValue(this, LLLFF[2]);
    }

    public final C1463670oBx F4() {
        return new C1463670oBx(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJIIZILJ(new CreativeInfo(null, 0, null, 7, null)), EnumC1464030oCX.COMMENT_IMAGE_EDIT, EnumC1442010nd1.UPLOAD_OTHER, true, LJIJJLI(), null, 992);
    }

    @Override // X.InterfaceC1451590nsT
    public void GS() {
        View view = this.LLJJJ;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS122S0100000_22(this, 12));
        } else {
            i3(AFwS261S0000000_22.get$arr$(39));
        }
    }

    public final C1450600nqs H4() {
        return (C1450600nqs) this.LLJJIJI.getValue(this, LLLFF[0]);
    }

    public final CreativeInfo O4() {
        return (CreativeInfo) this.LLJJL.getValue();
    }

    public final CreativeModel P4() {
        return (CreativeModel) this.LLJJJJ.getValue();
    }

    public final SingleImageData T4() {
        return (SingleImageData) this.LLJJJJJIL.getValue();
    }

    public final C1451230nrt Z4() {
        return (C1451230nrt) this.LLJJJIL.getValue();
    }

    public final ImageAlbumData d5() {
        return (ImageAlbumData) this.LLJJJJLIIL.getValue(this, LLLFF[1]);
    }

    @Override // X.InterfaceC1451590nsT
    public C1463670oBx gc() {
        return (C1463670oBx) this.LLJZ.getValue();
    }

    public final C1450610nqt k5() {
        return (C1450610nqt) this.LLJLIL.getValue();
    }

    public final VideoPublishEditModel t5() {
        return (VideoPublishEditModel) this.LLJJIJIIJIL.getValue();
    }

    public final C1451190nrp v5() {
        return (C1451190nrp) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final void S5() {
        U5();
        this.LLJJ.getVeAudioEffectParam();
        E5().setValue(gc());
    }

    private final void U5() {
        C1463670oBx c1463670oBxGc = gc();
        if (c1463670oBxGc != null) {
            c1463670oBxGc.prepare();
        }
    }

    private final void m6() {
        boolean z;
        String path;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLESegmentVideo nLESegmentVideoLIZ;
        NLEResourceAV aVFile;
        List<VEUtils.VEAudioFileInfo> audioFileInfoForAllTracks;
        CreativeModel creativeModel;
        ImageEditModel imageEditModel;
        HashMap<String, String> map;
        VEUtils.VEVideoFileInfo videoFileInfo;
        SingleImageData singleImageDataT4 = T4();
        if (singleImageDataT4 == null) {
            return;
        }
        String id = singleImageDataT4.getId();
        if (id == null) {
            id = "";
        }
        if (id.length() == 0) {
            return;
        }
        SrcLiveVideoInfo srcLiveInfo = singleImageDataT4.getSrcLiveInfo();
        String path2 = srcLiveInfo != null ? srcLiveInfo.getPath() : null;
        SrcLiveVideoInfo srcLiveInfo2 = singleImageDataT4.getSrcLiveInfo();
        LivePhotoPreviewMode livePhotoPreviewMode = srcLiveInfo2 != null ? srcLiveInfo2.getLivePhotoPreviewMode() : null;
        if (C123100dR.LIZ(path2) && livePhotoPreviewMode == LivePhotoPreviewMode.LIVE_PHOTO) {
            z = true;
            if (path2 == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            path = path2;
        } else {
            z = false;
            path = singleImageDataT4.getSrcImageInfo().getPath();
        }
        InterfaceC1452170ntP value = g().getValue();
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (model = nLEEditor.getModel()) == null || (mainTrack = model.getMainTrack()) == null || (slots = mainTrack.getSlots()) == null || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots)) == null || (nLESegmentVideoLIZ = C351170Dpj.LIZ(nLETrackSlot)) == null || (aVFile = nLESegmentVideoLIZ.getAVFile()) == null) {
            return;
        }
        int i = (!z || (videoFileInfo = VEUtils.getVideoFileInfo(path)) == null) ? 10000 : videoFileInfo.duration;
        C533730KwV.LIZ.getClass();
        NLEResType nLEResTypeLJ = C533730KwV.LJ(path);
        aVFile.setResourceFile(path);
        aVFile.setResourceType(nLEResTypeLJ);
        aVFile.setHasAudio(((C297420BlE.LIZ() && nLEResTypeLJ == NLEResType.IMAGE) || C123100dR.LIZ(path2) || (audioFileInfoForAllTracks = VEUtils.getAudioFileInfoForAllTracks(path)) == null || audioFileInfoForAllTracks.isEmpty()) ? false : true);
        long j = ((long) i) * 1000;
        aVFile.setDuration(j);
        nLESegmentVideoLIZ.setTimeClipEnd(j);
        nLETrackSlot.setEndTime(j);
        nLEEditor.commit();
        InterfaceC1452170ntP value2 = g().getValue();
        if (value2 != null) {
            value2.refreshCurrentFrame();
        }
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLEEditor.getModel().deepClone());
        if (nLEModelDynamicCast == null) {
            return;
        }
        C1451190nrp c1451190nrpV5 = v5();
        String strStore = nLEEditor.store();
        VideoPublishEditModel videoPublishEditModel = c1451190nrpV5.LIZ;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (imageEditModel = creativeModel.imageEditModel) != null && (map = imageEditModel.map) != null) {
            map.put(id, strStore);
        }
        v5().LIZIZ.put(id, nLEModelDynamicCast);
        i3(new AwS601S0100000_22(new C1451350ns5(nLEModelDynamicCast), 46));
    }

    public final SurfaceView M5() {
        InterfaceC1452360nti interfaceC1452360ntiC5 = C5();
        if (interfaceC1452360ntiC5 != null) {
            return interfaceC1452360ntiC5.LJIJJLI();
        }
        return null;
    }

    @Override // X.InterfaceC1451590nsT
    public LiveData<C1456890o11> Yh() {
        return D5();
    }

    @Override // X.InterfaceC1451590nsT
    public LiveData<InterfaceC1452170ntP> g() {
        return E5();
    }

    @Override // X.InterfaceC1451590nsT
    public void gn2() {
        SrcLiveVideoInfo srcLiveInfo;
        LivePhotoPreviewMode livePhotoPreviewMode;
        SingleImageData singleImageDataT4 = T4();
        if (singleImageDataT4 == null || (srcLiveInfo = singleImageDataT4.getSrcLiveInfo()) == null || (livePhotoPreviewMode = srcLiveInfo.getLivePhotoPreviewMode()) == null) {
            return;
        }
        int i = C1413310msj.LIZ[livePhotoPreviewMode.ordinal()];
        LivePhotoPreviewMode livePhotoPreviewMode2 = i != 1 ? i != 2 ? livePhotoPreviewMode : LivePhotoPreviewMode.LIVE_PHOTO : LivePhotoPreviewMode.STATIC;
        if (livePhotoPreviewMode2 != null) {
            SrcLiveVideoInfo srcLiveInfo2 = singleImageDataT4.getSrcLiveInfo();
            if (srcLiveInfo2 != null) {
                srcLiveInfo2.setLivePhotoPreviewMode(livePhotoPreviewMode2);
            }
            if (livePhotoPreviewMode != null && livePhotoPreviewMode != livePhotoPreviewMode2) {
                d6("content_detail_page", livePhotoPreviewMode, livePhotoPreviewMode2);
            }
            i3(new AwS601S0100000_22(livePhotoPreviewMode2, 45));
            boolean zContains = H4().editList.contains("LivePreviewMode");
            if (!zContains) {
                C1451610nsV.LIZ(H4(), "LivePreviewMode");
            } else {
                if (!zContains) {
                    throw new C1954807lC();
                }
                C1450600nqs c1450600nqsH4 = H4();
                c1450600nqsH4.editList.remove("LivePreviewMode");
                c1450600nqsH4.sessionEditList.remove("LivePreviewMode");
            }
            m6();
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        H5();
        S5();
        ge().setValue(LJIJJLI());
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C1463670oBx c1463670oBxGc = gc();
        if (c1463670oBxGc != null) {
            c1463670oBxGc.stop();
        }
        C1463670oBx c1463670oBxGc2 = gc();
        if (c1463670oBxGc2 != null) {
            c1463670oBxGc2.updateSurfaceView(null);
        }
        C1463670oBx c1463670oBxGc3 = gc();
        if (c1463670oBxGc3 != null) {
            c1463670oBxGc3.releaseResource();
        }
    }

    public final C1455930nzT K4() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1451590nsT
    public RectF O20() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1451590nsT
    public LiveData<SurfaceView> ge() {
        return this.LLJLLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1451590nsT
    public View mu1() {
        return this.LLJJJ;
    }

    public final C371280Eh4 n5() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1451220nrs> o2() {
        return this.LLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1451240nru> w2() {
        return this.LLLF;
    }

    public final VEPreviewParams x5() {
        return this.LLJJ;
    }

    public final void J6(Rect rect) {
        RectF rectF;
        if (rect != null) {
            rectF = new RectF(rect);
        } else {
            rectF = null;
        }
        this.LLJJIJIL = rectF;
    }

    @Override // X.InterfaceC1451590nsT
    public void hA(Bitmap bitmap) {
        if (bitmap != null) {
            i3(new AwS601S0100000_22(bitmap, 47));
        }
    }

    public final void u6(View view) {
        this.LLJJJ = view;
    }

    @Override // X.InterfaceC1451590nsT
    public void xW0(boolean z) {
        i3(new AwS35S0010000_22(z, 5));
    }

    private final void d6(String str, LivePhotoPreviewMode livePhotoPreviewMode, LivePhotoPreviewMode livePhotoPreviewMode2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("from_mode", C570520MZe.LIZIZ(livePhotoPreviewMode, false));
        c2344009Gk.LJIIIIZZ("to_mode", C570520MZe.LIZIZ(livePhotoPreviewMode2, false));
        c2344009Gk.LIZJ(1, "live_pic_cnt");
        c2344009Gk.LJIIIIZZ("biz_type", "comment");
        C20684815ws.LJIILLIIL("click_live_mode_icon", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC1451590nsT
    public void x7(boolean z, boolean z2, boolean z3, boolean z4) {
        D5().setValue(new C1456890o11(z, z2, z3, z4));
    }

    public C1451820nsq(C19A3 c19a3, C1DRG c1drg, VEPreviewParams vEPreviewParams, C371280Eh4 c371280Eh4, C1455930nzT c1455930nzT) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = vEPreviewParams;
        this.LLJJI = c371280Eh4;
        this.LLJJIII = c1455930nzT;
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), C1450600nqs.class, null);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 57));
        this.LLJJJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(42));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 53));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 55));
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), ImageAlbumData.class, null);
        this.LLJJL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 52));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 58));
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452360nti.class, null);
        this.LLJLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 56));
        this.LLJLILLLLZIIL = C1664770tQJ.LIZ(getDiContainer(), Activity.class, null);
        this.LLJLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(41));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 60));
        this.LLJLLL = new MutableLiveData();
        this.LLJZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 61));
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(40));
        this.LLL = new AwS566S0100000_22(this, 54);
        this.LLLF = new AwS566S0100000_22(this, 59);
    }

    public /* synthetic */ C1451820nsq(C19A3 c19a3, C1DRG c1drg, VEPreviewParams vEPreviewParams, C371280Eh4 c371280Eh4, C1455930nzT c1455930nzT, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c19a3, c1drg, vEPreviewParams, (i & 8) != 0 ? null : c371280Eh4, (i & 16) == 0 ? c1455930nzT : null);
    }
}
