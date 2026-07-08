package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.MatchedSoundInfo;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0o2Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457840o2Y extends FrameLayout {
    public View LL;
    public View LLILLJJLI;
    public C427250Gp9 LLILLL;
    public TuxIconView LLILZ;
    public View LLILZIL;
    public ImageView LLILZLL;
    public TuxIconView LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public ImageView LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxIconView LLJJ;
    public C1295960jpS LLJJI;
    public View LLJJIII;
    public final int LLJJIJI;

    public final void LIZLLL() {
        if (C861960Xre.LIZ()) {
            return;
        }
        int i = C1913507eX.LIZ;
        ScreenUtils.getScreenWidth(getContext());
        C12ES.LIZJ(196.0f, getContext());
    }

    public final View getCancelMusicClickContainer() {
        return this.LLILZIL;
    }

    public final TuxIconView getCancelMusicIconView() {
        return this.LLIZ;
    }

    public final View getChooseMusicClickContainer() {
        return this.LLILLJJLI;
    }

    public final View getChooseMusicClickContainerNew() {
        return this.LLJ;
    }

    public final View getChooseMusicClickContainerNewAnimation() {
        return this.LLJJIII;
    }

    public final View getChooseMusicDockerContentView() {
        return this.LL;
    }

    public final View getChooseMusicDockerContentViewAnimation() {
        return this.LLJIJIL;
    }

    public final View getChooseMusicDockerContentViewAnimationGroup() {
        return this.LLJILJIL;
    }

    public final View getChooseMusicDockerDivider() {
        return this.LLIZLLLIL;
    }

    public final ImageView getChooseMusicIconShadowView() {
        return this.LLJI;
    }

    public final TuxIconView getChooseMusicIconView() {
        return this.LLILZ;
    }

    public final TuxIconView getChooseMusicIconViewAnimation() {
        return this.LLJJ;
    }

    public final ImageView getChooseMusicLoadingView() {
        return this.LLILZLL;
    }

    public final C427250Gp9 getChooseMusicTextView() {
        return this.LLILLL;
    }

    public final TuxTextView getChooseMusicTextViewAnimation() {
        return this.LLJILLL;
    }

    public final C1295960jpS getLoadingMusicLottie() {
        return this.LLJJI;
    }

    public final int getMusicIcon() {
        return this.LLJJIJI;
    }

    public final View getSpaceView() {
        return this.LLJILJILJ;
    }

    public static void LIZIZ(ShortVideoContext shortVideoContext) {
        String strLJIIJJI;
        if (shortVideoContext != null) {
            C0LAB c0lab = new C0LAB();
            if (C298260Bma.LIZ()) {
                strLJIIJJI = C1444890nhf.LIZ(shortVideoContext);
            } else {
                strLJIIJJI = shortVideoContext.LJIIJJI();
            }
            c0lab.LJ("music_selected_from", strLJIIJJI);
            c0lab.LJ("music_id", shortVideoContext.getMusicId());
            c0lab.LJ("enter_from", "video_shoot_page");
            c0lab.LJ("type", "unselect");
            c0lab.LIZIZ(System.currentTimeMillis() - shortVideoContext.lastMusicTitleTimeMills.longValue(), "duration");
            C20684815ws.LJIILLIIL("show_music_title_duration", c0lab.LIZ);
            shortVideoContext.lastMusicTitleTimeMills = -1L;
        }
    }

    public final void LIZJ(boolean z) {
        int i;
        int i2;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(i, view);
        }
        if (C861960Xre.LIZ()) {
            if (z) {
                i2 = 6;
            } else {
                i2 = 12;
            }
            C427250Gp9 c427250Gp9 = this.LLILLL;
            if (c427250Gp9 != null) {
                c427250Gp9.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))), 0);
            }
        }
        LIZLLL();
    }

    public final void LJ(EnumC1457890o2d enumC1457890o2d) {
        int i = C1457880o2c.LIZ[enumC1457890o2d.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LJFF(0.0d);
                LIZJ(true);
                setUpCutVisibilityAB(false);
            } else {
                throw new C1954807lC();
            }
        } else {
            LJFF(6.0d);
            LIZJ(false);
            setUpCutVisibilityAB(false);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_optimize_music_experience_divide", true, false)) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_optimize_music_experience2", true, false)) {
                C427250Gp9 c427250Gp9 = this.LLILLL;
                if (c427250Gp9 != null) {
                    c427250Gp9.LJJJJI(14.0f);
                }
                C427250Gp9 c427250Gp92 = this.LLILLL;
                if (c427250Gp92 != null) {
                    c427250Gp92.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)));
                    return;
                }
                return;
            }
            return;
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_optimize_music_experience", true, false)) {
            return;
        }
        C427250Gp9 c427250Gp93 = this.LLILLL;
        if (c427250Gp93 != null) {
            c427250Gp93.LJJJJI(14.0f);
        }
        C427250Gp9 c427250Gp94 = this.LLILLL;
        if (c427250Gp94 == null) {
            return;
        }
        c427250Gp94.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)));
    }

    public final void LJFF(double d) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C427250Gp9 c427250Gp9;
        C427250Gp9 c427250Gp92 = this.LLILLL;
        ViewGroup.LayoutParams layoutParams = null;
        if (c427250Gp92 != null) {
            layoutParams = c427250Gp92.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && (c427250Gp9 = this.LLILLL) != null) {
            C426750GoL.LJIIIZ(c427250Gp9, Integer.valueOf(marginLayoutParams.getMarginStart()), Integer.valueOf(marginLayoutParams.topMargin), Integer.valueOf(C366700EZg.LIZ(d)), Integer.valueOf(marginLayoutParams.bottomMargin), false, 16);
        }
    }

    public final void setCancelMusicClickContainer(View view) {
        this.LLILZIL = view;
    }

    public final void setCancelMusicIconView(TuxIconView tuxIconView) {
        this.LLIZ = tuxIconView;
    }

    public final void setCancelMusicLayerListener(View.OnClickListener onClickListener) {
        View view = this.LLILZIL;
        if (view != null) {
            C786410Ut5.I7(onClickListener, view);
        }
    }

    public final void setChooseMusicClickContainer(View view) {
        this.LLILLJJLI = view;
    }

    public final void setChooseMusicClickContainerNew(View view) {
        this.LLJ = view;
    }

    public final void setChooseMusicClickContainerNewAnimation(View view) {
        this.LLJJIII = view;
    }

    public final void setChooseMusicDockerContentView(View view) {
        this.LL = view;
    }

    public final void setChooseMusicDockerContentViewAnimation(View view) {
        this.LLJIJIL = view;
    }

    public final void setChooseMusicDockerContentViewAnimationGroup(View view) {
        this.LLJILJIL = view;
    }

    public final void setChooseMusicDockerDivider(View view) {
        this.LLIZLLLIL = view;
    }

    public final void setChooseMusicIconShadowView(ImageView imageView) {
        this.LLJI = imageView;
    }

    public final void setChooseMusicIconView(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public final void setChooseMusicIconViewAnimation(TuxIconView tuxIconView) {
        this.LLJJ = tuxIconView;
    }

    public final void setChooseMusicLayerListener(View.OnClickListener onClickListener) {
        if (C861960Xre.LIZ()) {
            View view = this.LLJ;
            if (view != null) {
                C786410Ut5.I7(onClickListener, view);
            }
            View view2 = this.LLJJIII;
            if (view2 != null) {
                C786410Ut5.I7(onClickListener, view2);
                return;
            }
            return;
        }
        View view3 = this.LLILLJJLI;
        if (view3 == null) {
            return;
        }
        C786410Ut5.I7(onClickListener, view3);
    }

    public final void setChooseMusicLoadingView(ImageView imageView) {
        this.LLILZLL = imageView;
    }

    public final void setChooseMusicTextView(C427250Gp9 c427250Gp9) {
        this.LLILLL = c427250Gp9;
    }

    public final void setChooseMusicTextViewAnimation(TuxTextView tuxTextView) {
        this.LLJILLL = tuxTextView;
    }

    public final void setContentViewListener(View.OnClickListener onClickListener) {
        View view = this.LL;
        if (view != null) {
            C786410Ut5.I7(onClickListener, view);
        }
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            C786410Ut5.I7(onClickListener, view2);
        }
    }

    public final void setLoadingMusicLottie(C1295960jpS c1295960jpS) {
        this.LLJJI = c1295960jpS;
    }

    public final void setSpaceView(View view) {
        this.LLJILJILJ = view;
    }

    public final void setUpCutVisibilityAB(boolean z) {
        if (!z) {
            TuxIconView tuxIconView = this.LLILZ;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLILZ;
        if (tuxIconView2 == null) {
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
    }

    public C1457840o2Y(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet, 0);
        if (((Boolean) C861990Xrh.LIZ.getValue()).booleanValue()) {
            i = R.raw.icon_camera_single_note;
        } else {
            i = R.raw.icon_music_note_s_alt;
        }
        this.LLJJIJI = i;
    }

    public static void LIZ(ShortVideoContext shortVideoContext, String str) {
        int i;
        String id;
        int i2;
        int i3;
        if (shortVideoContext != null) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", shortVideoContext.getCreationId());
            c0lab.LJ("enter_from", "video_shoot_page");
            c0lab.LJ("content_source", "shoot");
            c0lab.LJ("content_type", shortVideoContext.LJ().getContentType());
            c0lab.LJ("shoot_way", shortVideoContext.shootWay);
            c0lab.LJ("enter_method", "entrance_icon");
            c0lab.LJ("is_editor_pro", CardStruct.IStatusCode.DEFAULT);
            c0lab.LJ("music_id", shortVideoContext.getMusicId());
            MusicObject musicObject = shortVideoContext.creativeModel.musicBuzModel.music;
            if (musicObject != null && musicObject.isPgc) {
                i = 1;
            } else {
                i = 0;
            }
            c0lab.LIZ(i, "is_pgc");
            MatchedSoundInfo matchedSoundInfo = shortVideoContext.creativeModel.musicBuzModel.matchedSongInfo;
            if (matchedSoundInfo != null) {
                id = matchedSoundInfo.getId();
            } else {
                id = null;
            }
            c0lab.LJ("meta_song_id", id);
            c0lab.LJ("music_selected_method", "manual");
            if (shortVideoContext.creativeModel.musicBuzModel.similarTag > 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c0lab.LIZ(i2, "is_similar_music");
            if (shortVideoContext.creativeModel.mdpInfoModel.fromOfflineMusicMdp) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            c0lab.LIZ(i3, "is_offline_unmuted_mdp");
            c0lab.LJ("music_log_id", C1412490mrP.LJ(shortVideoContext, str));
            if (C298260Bma.LIZ()) {
                String strLIZ = C1444890nhf.LIZ(shortVideoContext);
                if (strLIZ.length() != 0) {
                    c0lab.LJ("music_selected_from", strLIZ);
                }
            } else if (!TextUtils.isEmpty(shortVideoContext.LJIIJJI())) {
                c0lab.LJ("music_selected_from", shortVideoContext.LJIIJJI());
            }
            C20684815ws.LJIILLIIL("unselect_music", c0lab.LIZ);
        }
    }
}
