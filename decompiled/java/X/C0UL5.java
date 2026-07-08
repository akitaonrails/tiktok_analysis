package X;

import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.broadcast.LivePreviewWidgetsLoaded;
import com.bytedance.android.livesdk.broadcast.preview.PreviewCastWidget;
import com.bytedance.android.livesdk.broadcast.preview.PreviewPhoneCameraWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewCloseWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewSeeMoreDetailWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.AbstractPreviewLiveStudioPage;
import com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.PreviewLiveStudioPageWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.PreviewLiveStudioPageWidgetV2;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.GameRoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.GamePhoneAsCameraEnableSetting;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UL5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UL5 extends C0ULK {
    public C1324720kZq LLILLL;
    public C20516015Pq LLILZ;
    public C20516015Pq LLILZIL;
    public C20516015Pq LLILZLL;
    public C20516015Pq LLIZ;
    public C20516015Pq LLIZLLLIL;
    public C20516015Pq LLJ;
    public final boolean LLJI;
    public final C770660UKy LLJIJIL;
    public final DataChannel LLJILJIL;

    private final C13IQ<? extends AbstractPreviewLiveStudioPage> getLiveStudioWidgetClass() {
        return C13LE.LIZ(this.LLJI ? PreviewLiveStudioPageWidgetV2.class : PreviewLiveStudioPageWidget.class);
    }

    @Override // X.C0ULK
    public final void LIZ() {
        C770660UKy c770660UKy = this.LLJIJIL;
        if (c770660UKy != null) {
            c770660UKy.LIZJ.clear();
            c770660UKy.LIZLLL.clear();
            c770660UKy.LJII = true;
        }
        if (C0UKV.LIZLLL(getContext())) {
            return;
        }
        C19719912Dl c19719912DlRG = C781270Ukn.LIZJ().RG();
        if (!(c19719912DlRG instanceof C13IQ) || c19719912DlRG == null) {
            return;
        }
        C0UKC.LIZ(c19719912DlRG, getBannerContainerFromXml(), new C13IQ[]{C13LE.LIZ(BlockVisibilityChannel.class)}, true);
    }

    @Override // X.C0ULK
    public final void LIZIZ() {
        C770660UKy c770660UKy = this.LLJIJIL;
        if (c770660UKy != null) {
            c770660UKy.LJII = false;
        }
    }

    @Override // X.C0ULK
    public final void LIZJ() {
        DataChannel dataChannel = this.LLJILJIL;
        if (dataChannel != null) {
            dataChannel.FQ2(LivePreviewWidgetsLoaded.class);
        }
    }

    @Override // X.C0ULK
    public final void LIZLLL() throws Exception {
        C770660UKy c770660UKy = this.LLJIJIL;
        if (c770660UKy != null) {
            c770660UKy.LIZIZ(true);
        }
    }

    @Override // X.C0ULK
    public final void LJ() {
        C0UKC.LIZ(C13LE.LIZ(PreviewCloseWidget.class), getCloseWidgetContainerFromXml(), new C13IQ[0], true);
        C0UKC.LIZ(C13LE.LIZ(PreviewSeeMoreDetailWidget.class), getSeeMoreDetailContainerFromXml(), new C13IQ[0], true);
        C946803n0.LIZ(this);
        LJII();
    }

    @Override // X.C0ULK
    public final void LJFF() throws Exception {
        C770660UKy c770660UKy = this.LLJIJIL;
        if (c770660UKy != null) {
            c770660UKy.LIZIZ(true);
        }
    }

    public final C20516015Pq getBannerContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.brb);
            this.LLILZLL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getCloseWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.e2y);
            this.LLILZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getLiveStudioPageContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.n7z);
            this.LLIZ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getMirrorCastWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.oh3);
            this.LLIZLLLIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C20516015Pq getPhoneCameraWidgetContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qax);
            this.LLJ = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final C1324720kZq getRadioCoverFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.spj);
            this.LLILLL = (C1324720kZq) callbackFindViewById;
        }
        return (C1324720kZq) callbackFindViewById;
    }

    public final C20516015Pq getSeeMoreDetailContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uj9);
            this.LLILZIL = (C20516015Pq) callbackFindViewById;
        }
        return (C20516015Pq) callbackFindViewById;
    }

    public final void LJII() {
        C0UKC.LIZ(getLiveStudioWidgetClass(), getLiveStudioPageContainerFromXml(), new C13IQ[0], true);
        if (C0UQN.LIZ()) {
            C20516015Pq mirrorCastWidgetContainerFromXml = getMirrorCastWidgetContainerFromXml();
            if (mirrorCastWidgetContainerFromXml != null) {
                int visibility = mirrorCastWidgetContainerFromXml.getVisibility();
                mirrorCastWidgetContainerFromXml.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, mirrorCastWidgetContainerFromXml);
            }
            C0UKC.LIZ(C13LE.LIZ(PreviewCastWidget.class), getMirrorCastWidgetContainerFromXml(), new C13IQ[0], true);
        }
        if (GamePhoneAsCameraEnableSetting.INSTANCE.enable()) {
            C20516015Pq phoneCameraWidgetContainerFromXml = getPhoneCameraWidgetContainerFromXml();
            if (phoneCameraWidgetContainerFromXml != null) {
                int visibility2 = phoneCameraWidgetContainerFromXml.getVisibility();
                phoneCameraWidgetContainerFromXml.setVisibility(0);
                C1602160rnK.LIZIZ(visibility2, 0, phoneCameraWidgetContainerFromXml);
            }
            C0UKC.LIZ(C13LE.LIZ(PreviewPhoneCameraWidget.class), getPhoneCameraWidgetContainerFromXml(), new C13IQ[0], true);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0UKC.LIZ(getLiveStudioWidgetClass(), getLiveStudioPageContainerFromXml(), new C13IQ[0], true);
    }

    public final void setBannerContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZLL = c20516015Pq;
    }

    public final void setCloseWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZ = c20516015Pq;
    }

    public final void setLiveStudioPageContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZ = c20516015Pq;
    }

    public final void setMirrorCastWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLIZLLLIL = c20516015Pq;
    }

    public final void setPhoneCameraWidgetContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLJ = c20516015Pq;
    }

    public final void setRadioCoverFromXml(C1324720kZq c1324720kZq) {
        this.LLILLL = c1324720kZq;
    }

    public final void setSeeMoreDetailContainerFromXml(C20516015Pq c20516015Pq) {
        this.LLILZIL = c20516015Pq;
    }

    public C0UL5(Fragment fragment, C0UL6 c0ul6) {
        Boolean boolValueOf;
        View viewFindViewById;
        super(fragment.requireContext(), R.layout.hi9);
        DetailLivePermission detailLivePermission = (DetailLivePermission) DataChannelGlobal.LLILZ.gg0(C168F.class);
        if (detailLivePermission != null) {
            boolValueOf = Boolean.valueOf(detailLivePermission.enableShowLiveStudio);
        } else {
            boolValueOf = null;
        }
        this.LLJI = C500260Jjc.LJJJI(boolValueOf);
        this.LLJIJIL = c0ul6 != null ? c0ul6.LIZJ : null;
        DataChannel dataChannelLJ = C475510Ikn.LJ(fragment);
        this.LLJILJIL = dataChannelLJ;
        C466100IPo.LIZ(getContext(), getRadioCoverFromXml());
        if (!C011Z.LIZ.LJJII() && (viewFindViewById = findViewById(R.id.rrk)) != null) {
            viewFindViewById.setOnTouchListener(new View.OnTouchListener() { // from class: X.0ULA
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(fragment, GameRoomCreateInfoChannel.class, new AwS591S0100000_12(this, 867));
        }
    }
}
