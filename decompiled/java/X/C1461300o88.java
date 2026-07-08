package X;

import Y.ARunnableS122S0100000_22;
import android.os.Handler;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcLiveVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0o88, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461300o88 extends i<InterfaceC1450260nqK, C534340KxU, C534360KxW, C1461330o8B> implements InterfaceC1450260nqK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C1462760oAU LLJJ;
    public final C01GW LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public boolean LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1461300o88.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1461300o88.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJJ = 8;
    }

    @Override // ge.i
    public int H3() {
        return R.anim.iq;
    }

    @Override // ge.i
    public int v3() {
        return R.anim.ip;
    }

    private final InterfaceC1460000o62 F4() {
        return (InterfaceC1460000o62) this.LLJJIJIIJIL.getValue(this, LLJJIJIL[1]);
    }

    private final Handler H4() {
        return (Handler) this.LLJJI.getValue();
    }

    private final VideoPublishEditModel K4() {
        return (VideoPublishEditModel) this.LLJJIII.getValue(this, LLJJIJIL[0]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C534360KxW> o2() {
        return AFwS210S0000000_22.get$arr$(84);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1461330o8B> w2() {
        return new AwS566S0100000_22(this, 148);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    public final void UA2(int i) {
        show();
    }

    @Override // X.InterfaceC1450260nqK
    public void Uy2(SingleImageData singleImageData) {
        MutableLiveData<LivePhotoPreviewMode> mutableLiveDataX72;
        LivePhotoPreviewMode livePhotoPreviewMode;
        LivePhotoPreviewMode livePhotoPreviewMode2 = null;
        if (K4().creativeModel.imageEditModel.selectedImageIndex == 0 && this.LLJJIJI) {
            SrcLiveVideoInfo srcLiveInfo = singleImageData.getSrcLiveInfo();
            if (srcLiveInfo != null && C1413430msv.LJIILIIL(srcLiveInfo)) {
                SrcLiveVideoInfo srcLiveInfo2 = singleImageData.getSrcLiveInfo();
                if (srcLiveInfo2 != null) {
                    livePhotoPreviewMode = srcLiveInfo2.getLivePhotoPreviewMode();
                } else {
                    livePhotoPreviewMode = null;
                }
                tS0(livePhotoPreviewMode);
            } else {
                hide();
            }
            this.LLJJIJI = false;
        }
        SrcLiveVideoInfo srcLiveInfo3 = singleImageData.getSrcLiveInfo();
        if (srcLiveInfo3 != null && C1413430msv.LJIILIIL(srcLiveInfo3)) {
            b82(true);
            InterfaceC1460000o62 interfaceC1460000o62F4 = F4();
            if (interfaceC1460000o62F4 != null && (mutableLiveDataX72 = interfaceC1460000o62F4.X72()) != null) {
                SrcLiveVideoInfo srcLiveInfo4 = singleImageData.getSrcLiveInfo();
                if (srcLiveInfo4 != null) {
                    livePhotoPreviewMode2 = srcLiveInfo4.getLivePhotoPreviewMode();
                }
                mutableLiveDataX72.setValue(livePhotoPreviewMode2);
                return;
            }
            return;
        }
        b82(false);
    }

    @Override // X.InterfaceC1450260nqK
    public void b82(boolean z) {
        InterfaceC1460000o62 interfaceC1460000o62F4 = F4();
        if (interfaceC1460000o62F4 != null) {
            interfaceC1460000o62F4.rm(1105, z);
        }
    }

    @Override // X.InterfaceC1450260nqK
    public void tS0(LivePhotoPreviewMode livePhotoPreviewMode) {
        H4().removeCallbacksAndMessages(null);
        if (livePhotoPreviewMode != null) {
            show();
            i3(new AwS601S0100000_22(livePhotoPreviewMode, 114));
            C786410Ut5.LJLIIL(1000L, H4(), new ARunnableS122S0100000_22(this, 19));
            return;
        }
        hide();
    }

    public C1461300o88(C19A3 c19a3, C1DRG c1drg, C1462760oAU c1462760oAU) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = c1462760oAU;
        this.LLJJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(85));
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
    }
}
