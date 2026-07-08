package X;

import Y.AObjectS241S0100000_8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.AlbumDeferLoadMoreConfig;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0KpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529410KpX extends AbstractC1653180t7c {
    public static final int LLJJ = View.generateViewId();
    public final C1DRG LLJILLL;

    @Override // X.AbstractC1653180t7c
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.AbstractC1653180t7c
    public final String getTag() {
        return "RecordAlbumTab";
    }

    @Override // X.AbstractC1653180t7c
    public final void hide() {
        View view = this.mView;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.AbstractC1653180t7c
    public final void show() {
        View view = this.mView;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    @Override // X.AbstractC1653180t7c
    public final EnumC545560LaU LLLLIL() {
        return EnumC545560LaU.ALBUM_TAB_CONTENT_SCENE;
    }

    public C529410KpX(C1DRG c1drg) {
        this.LLJILLL = c1drg;
    }

    public final void LLLLILI(boolean z) {
        if (findSceneByTag("LightAlbumChoosePhotoScene") != null) {
            return;
        }
        ShortVideoContext shortVideoContext = (ShortVideoContext) this.LLJILLL.LJII(ShortVideoContext.class, null);
        C531110KsH.LIZ.getClass();
        Bundle bundleLIZIZ = C531110KsH.LIZIZ(C531110KsH.LIZ(shortVideoContext), shortVideoContext);
        bundleLIZIZ.putBoolean("from_light_record_tab", true);
        bundleLIZIZ.putBoolean("extra_camera_is_9_to_16", true);
        bundleLIZIZ.putBoolean("enable_layout_switch_panel", true);
        bundleLIZIZ.putLong("click_album_icon_time", System.currentTimeMillis());
        bundleLIZIZ.putBoolean("from_privacy_upload_btn_click", true);
        bundleLIZIZ.putBoolean("show_private_album", true);
        bundleLIZIZ.putBoolean("private_album_show_builtin_album", true);
        bundleLIZIZ.putBoolean("album_dark_mode", true);
        bundleLIZIZ.putBoolean("album_fluency_opt", true);
        C786410Ut5.LJJJI("enter_from", shortVideoContext.enterFrom, bundleLIZIZ);
        bundleLIZIZ.putBoolean("key_lazy_first_load_media_data", z);
        bundleLIZIZ.putBoolean("key_album_all_tab_merge_update_enabled", ((Boolean) C267940Aem.LIZ.getValue()).booleanValue());
        C07KU.LIZ.getClass();
        AlbumDeferLoadMoreConfig albumDeferLoadMoreConfig = (AlbumDeferLoadMoreConfig) C07KU.LIZIZ.getValue();
        if (albumDeferLoadMoreConfig == null) {
            albumDeferLoadMoreConfig = new AlbumDeferLoadMoreConfig(false, 4000L);
        }
        bundleLIZIZ.putBoolean("key_album_defer_load_more_enabled", albumDeferLoadMoreConfig.getEnabled());
        MvChoosePhotoScene mvChoosePhotoScene = new MvChoosePhotoScene();
        mvChoosePhotoScene.mArguments = bundleLIZIZ;
        add(LLJJ, mvChoosePhotoScene, "LightAlbumChoosePhotoScene");
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C524780Ki4.LIZ.start(OpenAlbumPanelPerformanceMonitor.INSTANCE, "onClick");
        if (((Number) C267950Aen.LIZ.getValue()).intValue() == 1) {
            LLLLILI(true);
        } else if (((Boolean) C268020Aeu.LIZ.getValue()).booleanValue()) {
            ((C1453870nw9) this.LLJILLL.LJII(C1453870nw9.class, null)).LIZLLL(EnumC1641390sob.ACTIVITY_ENTER_ANIMATION_END).LIZ(this, new AObjectS241S0100000_8(this, 18));
        } else {
            LLLLILI(false);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1654320t9S.LIZIZ(this, AFwS239S0000000_8.get$arr$(88));
        C1664590tQ1.LIZLLL(this, null, false, AFwS239S0000000_8.get$arr$(89), 3);
        C1664600tQ2.LIZ(this, null, AFwS239S0000000_8.get$arr$(91));
    }

    @Override // X.AbstractC1653180t7c, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        frameLayout.setId(LLJJ);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }
}
