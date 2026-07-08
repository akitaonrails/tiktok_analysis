package X;

import Y.ACListenerS163S0100000_29;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.player.sdk.impl.SimplifyAsyncPlayer;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.11Fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19469911Fh implements InterfaceC21362118ip {
    public final ViewGroup LIZ;
    public final Activity LIZIZ;
    public C1688850u39 LIZJ;
    public VideoViewComponent LIZLLL;
    public C19470011Fi LJ;
    public Video LJFF;
    public C1322110kVd LJI;
    public AnonymousClass0956 LJII;

    @Override // X.InterfaceC21362118ip
    public final void LIZ() {
        VideoViewComponent videoViewComponent;
        C786410Ut5.LJLLLLLL(8, this.LIZ);
        LIZIZ();
        LIZIZ();
        C19470011Fi c19470011Fi = this.LJ;
        if (c19470011Fi != null && (videoViewComponent = this.LIZLLL) != null) {
            videoViewComponent.H1(c19470011Fi);
        }
        VideoViewComponent videoViewComponent2 = this.LIZLLL;
        if (videoViewComponent2 != null) {
            videoViewComponent2.release();
        }
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJFF = null;
    }

    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJII = null;
    }

    @Override // X.InterfaceC21362118ip
    public final boolean isShowing() {
        return this.LIZ.getVisibility() == 0;
    }

    @Override // X.InterfaceC21362118ip
    public final void show() {
        Scene currentScene = C0CHQ.LIZ().LJIJJ().getCurrentScene(this.LIZIZ);
        if (currentScene == null || !C0CHQ.LIZ().LJIJJ().LJIIIZ(currentScene)) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, this.LIZ);
    }

    public final void LIZJ(boolean z) {
        int i;
        C1688850u39 c1688850u39 = this.LIZJ;
        if (c1688850u39 != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c1688850u39);
        }
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.11Fi] */
    public C19469911Fh(ViewGroup viewGroup, C1662140tM4 c1662140tM4, C19GS c19gs) {
        LifecycleCoroutineScope lifecycleScope;
        String str;
        VideoViewComponent videoViewComponent;
        this.LIZ = viewGroup;
        this.LIZIZ = c19gs;
        if ((c19gs instanceof LifecycleOwner) && c19gs != null) {
            lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19gs);
        } else {
            lifecycleScope = null;
        }
        C786410Ut5.LJJJJI(viewGroup);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.d9b, viewGroup, true);
        if (c1662140tM4.LIZJ()) {
            final C1473870oSP c1473870oSP = (C1473870oSP) viewTd.findViewById(R.id.video_view);
            this.LJI = (C1322110kVd) viewTd.findViewById(R.id.ll7);
            TextView textView = (TextView) viewTd.findViewById(R.id.ex1);
            this.LIZJ = (C1688850u39) viewTd.findViewById(R.id.nnp);
            C1322110kVd c1322110kVd = this.LJI;
            if (c1322110kVd != null) {
                Drawable drawableLIZJ = C426580Go4.LIZJ(303437859, 303437859, 0, 0);
                C1331070kk5 c1331070kk5LIZ = new C1331090kk7(viewTd.getContext().getResources()).LIZ();
                c1331070kk5LIZ.LJIJ(drawableLIZJ, 1);
                c1331070kk5LIZ.LJIJ(drawableLIZJ, 5);
                c1322110kVd.setHierarchy(c1331070kk5LIZ);
                if (!TextUtils.isEmpty(c1662140tM4.LIZ())) {
                    C1324750kZt.LJIIIZ(c1322110kVd, c1662140tM4.LIZ(), -1, -1);
                }
            }
            Resources resources = viewTd.getContext().getResources();
            if (TextUtils.isEmpty(c1662140tM4.LIZJ)) {
                str = "offProcess_generalEffect_strtMsg_body";
            } else {
                str = c1662140tM4.LIZJ;
            }
            Integer numValueOf = Integer.valueOf(C786410Ut5.n3(resources, str, "string", viewTd.getContext().getPackageName()));
            if (numValueOf.intValue() != 0) {
                int iIntValue = numValueOf.intValue();
                if (textView != null) {
                    textView.setText(viewTd.getContext().getResources().getString(iIntValue));
                    C786410Ut5.LJLLLLLL(0, textView);
                }
            }
            this.LJ = new C583580Mui() { // from class: X.11Fi
                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayCompleted(String str2) {
                    this.LL.LIZIZ();
                    this.LL.LIZ();
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onPlayFailed(C1481290oeN c1481290oeN) {
                    this.LL.LIZIZ();
                    this.LL.LIZJ(false);
                    C1322110kVd c1322110kVd2 = this.LL.LJI;
                    if (c1322110kVd2 != null) {
                        C786410Ut5.LLZZLLIL(c1322110kVd2, 0);
                    }
                }

                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
                public final void onRenderFirstFrame(C1480420ocy c1480420ocy) {
                    this.LL.LIZIZ();
                    this.LL.LIZJ(false);
                    C1322110kVd c1322110kVd2 = this.LL.LJI;
                    if (c1322110kVd2 != null) {
                        C786410Ut5.LLZZLLIL(c1322110kVd2, 8);
                    }
                }
            };
            C1482640ogY.LJIIIIZZ(c1473870oSP).Dn(new InterfaceC1473950oSX() { // from class: X.0onn
                @Override // X.InterfaceC1473950oSX
                public final void LLF(int i, int i2) {
                }

                @Override // X.InterfaceC1473950oSX
                public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                @Override // X.InterfaceC1473950oSX
                public final void LIZ() {
                    C1322110kVd c1322110kVd2 = this.LL.LJI;
                    if (c1322110kVd2 != null) {
                        C786410Ut5.LLZZLLIL(c1322110kVd2, 0);
                    }
                }

                @Override // X.InterfaceC1473950oSX
                public final void LLILLIZIL(int i, int i2) {
                    VideoViewComponent videoViewComponent2;
                    SettingsManager.LIZLLL().getClass();
                    if (!SettingsManager.LIZ("aigc_offline_process_preview_ui_blank_fix", false) && (videoViewComponent2 = this.LL.LIZLLL) != null) {
                        Surface surface = c1473870oSP.getSurface();
                        SimplifyAsyncPlayer simplifyAsyncPlayer = videoViewComponent2.LLILLJJLI;
                        if (simplifyAsyncPlayer != null) {
                            simplifyAsyncPlayer.LJJIL(surface);
                        }
                    }
                }
            });
            VideoViewComponent videoViewComponent2 = new VideoViewComponent();
            videoViewComponent2.LJIILJJIL(c1473870oSP);
            videoViewComponent2.LIZ(this.LJ);
            videoViewComponent2.LLJILJILJ = false;
            this.LIZLLL = videoViewComponent2;
            if (!TextUtils.isEmpty(c1662140tM4.LIZIZ())) {
                if (this.LJFF == null) {
                    Video video = new Video();
                    VideoUrlModel videoUrlModel = new VideoUrlModel();
                    videoUrlModel.setBytevc1(false);
                    ArrayList arrayList = new ArrayList();
                    String strLIZIZ = c1662140tM4.LIZIZ();
                    if (strLIZIZ != null) {
                        arrayList.add(strLIZIZ);
                    }
                    videoUrlModel.setUrlList(arrayList);
                    videoUrlModel.setUrlKey(c1662140tM4.LIZIZ);
                    videoUrlModel.setUri(c1662140tM4.LIZIZ);
                    video.setPlayAddr(videoUrlModel);
                    video.setSourceId(c1662140tM4.LIZIZ);
                    this.LJFF = video;
                }
                LIZJ(true);
                SettingsManager.LIZLLL().getClass();
                if (!SettingsManager.LIZ("aigc_upload_pic_guide_video_timeout_killswitch", false)) {
                    LIZIZ();
                    this.LJII = lifecycleScope != null ? C23250099c.LIZLLL(lifecycleScope, null, null, new C1427790nG5(this, null), 3) : null;
                }
                Video video2 = this.LJFF;
                if (video2 != null && (videoViewComponent = this.LIZLLL) != null) {
                    videoViewComponent.LJIIL(video2);
                }
            }
        }
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 308), viewGroup.findViewById(R.id.tsc));
    }
}
