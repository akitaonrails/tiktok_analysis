package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mentionvideo.MentionVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import java.io.Serializable;
import java.util.Objects;
import lth.o;

/* JADX INFO: renamed from: X.0Zt6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C913820Zt6 extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) throws Throwable {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C913820Zt6(com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene r4, int r5) {
        /*
            r3 = this;
            r3.$t = r5
            switch(r5) {
                case 1: goto Le;
                case 2: goto Le;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r4
            r0 = 1000(0x3e8, double:4.94E-321)
        La:
            r2.<init>(r0)
            return
        Le:
            r2 = r3
            r2.l0 = r4
            r0 = 600(0x258, double:2.964E-321)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C913820Zt6.<init>(com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene, int):void");
    }

    public static final void LIZ$0(C913820Zt6 c913820Zt6, View view) {
        String str;
        String musicId;
        String str2;
        C856850XjP c856850XjP = (C856850XjP) c913820Zt6.l0;
        C214848196g c214848196g = c856850XjP.LJJ;
        if ((c214848196g != null && c214848196g.LJIIL()) || c856850XjP.LIZIZ.getSelectionEnd() > c856850XjP.LIZIZ.getSelectionStart()) {
            return;
        }
        if (!o.LJIIZILJ.isLogin()) {
            InterfaceC1457290o1f interfaceC1457290o1f = o.LJIIZILJ;
            C19EG fragmentActivity = c856850XjP.LIZ.getFragmentActivity();
            Objects.requireNonNull(fragmentActivity);
            interfaceC1457290o1f.LJIIIIZZ(fragmentActivity, "", "click_add_video", null, null);
            return;
        }
        if (c856850XjP.LIZIZ.LLJILJILJ) {
            return;
        }
        if (!c856850XjP.LJIL.LIZ() && c856850XjP.LIZLLL(true)) {
            return;
        }
        C0M2U c0m2u = C0M2U.LIZ;
        VideoPublishEditModel videoPublishEditModel = c856850XjP.LJIIL;
        c0m2u.getClass();
        String str3 = null;
        C0M2U.LIZ(videoPublishEditModel, "add_video", null);
        if (c856850XjP.LIZ == null) {
            return;
        }
        int size = c856850XjP.LIZIZ.getMentionVideoIdList().size();
        if (size > 3) {
            C19EG fragmentActivity2 = c856850XjP.LIZ.getFragmentActivity();
            if (fragmentActivity2 == null) {
                return;
            }
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131830014);
            C1390380mHk.LIZ(fragmentActivity2, 2018, creativeToastBuilder);
            return;
        }
        if (size == 3) {
            C19EG fragmentActivity3 = c856850XjP.LIZ.getFragmentActivity();
            if (fragmentActivity3 == null) {
                return;
            }
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.messageRes(2131830013);
            C1390380mHk.LIZ(fragmentActivity3, 2018, creativeToastBuilder2);
            return;
        }
        C20684815ws.LJIILLIIL("click_credits_videos_button", C0L5F.LIZ(c856850XjP.LJIIL).LIZ);
        String str4 = MentionVideoActivity._pnsPageId;
        Fragment fragment = c856850XjP.LIZ.getFragment();
        Objects.requireNonNull(fragment);
        VideoPublishEditModel videoPublishEditModel2 = c856850XjP.LJIIL;
        if (c856850XjP.LJFF == 0) {
            str = "video_post_page";
        } else {
            str = "edit_post_page";
        }
        if (fragment.getActivity() == null) {
            return;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel2.creativeModel.musicBuzModel);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(fragment.getActivity(), "//tools/mentionvideo");
        smartRouteBuildRoute.withParam("creation_id", videoPublishEditModel2.getCreationId());
        if (aVMusicExtractAVMusic != null && !aVMusicExtractAVMusic.isLocalMusic()) {
            musicId = aVMusicExtractAVMusic.getMusicId();
        } else {
            musicId = null;
        }
        smartRouteBuildRoute.withParam("music_id", musicId);
        if (aVMusicExtractAVMusic != null) {
            str2 = aVMusicExtractAVMusic.musicName;
        } else {
            str2 = null;
        }
        smartRouteBuildRoute.withParam("music_title", str2);
        if (aVMusicExtractAVMusic != null) {
            str3 = aVMusicExtractAVMusic.authorName;
        }
        smartRouteBuildRoute.withParam("music_author", str3);
        smartRouteBuildRoute.withParam("enter_from", str);
        smartRouteBuildRoute.withParam("KEY_VIDEO_PUBLISH_EDIT_MODEL", (Serializable) videoPublishEditModel2);
        smartRouteBuildRoute.withParam("creative_model", videoPublishEditModel2.creativeModel);
        smartRouteBuildRoute.open(10);
    }

    public static final void LIZ$1(C913820Zt6 c913820Zt6, View view) throws Throwable {
        C0M2U c0m2u = C0M2U.LIZ;
        VideoPublishEditModel videoPublishEditModel = ((VideoPublishContainerScene) c913820Zt6.l0).LLLLIILL;
        c0m2u.getClass();
        C0M2U.LIZ(videoPublishEditModel, "edit_cover", null);
        VideoPublishEditModel videoPublishEditModel2 = ((VideoPublishContainerScene) c913820Zt6.l0).LLLLIILL;
        if (videoPublishEditModel2 != null && C1455550nyr.LIZ(videoPublishEditModel2)) {
            C1CP7.LIZ.getClass();
            C1CP7.LIZJ();
        }
        C1443990ngD c1443990ngD = C1443990ngD.LIZ;
        VideoPublishEditModel videoPublishEditModel3 = ((VideoPublishContainerScene) c913820Zt6.l0).LLLLIILL;
        c1443990ngD.getClass();
        C1443990ngD.LJ(videoPublishEditModel3, "video_post_page");
        CreativeModel creativeModel = ((VideoPublishContainerScene) c913820Zt6.l0).LLLLIILL.creativeModel;
        creativeModel.transientPostPageModel.LJJIJIL = true;
        creativeModel.postPageModel.clickCover = System.currentTimeMillis();
        CreativeModel creativeModel2 = ((VideoPublishContainerScene) c913820Zt6.l0).LLLLIILL.creativeModel;
        creativeModel2.postPageModel.coverEnterFrom = "video_post_page";
        if (creativeModel2.transientPostPageModel.LJIIJJI) {
            C0CHQ.LIZ().getPublishService().LJJJIL();
            C1433920nPy.LIZ("enter_choose_cover_page");
        }
        if (C1428470nHB.LJJZZI(((VideoPublishContainerScene) c913820Zt6.l0).LLLLIILL) && !C1428470nHB.LJJJJLL(((VideoPublishContainerScene) c913820Zt6.l0).LLLLIILL)) {
            return;
        }
        ((VideoPublishContainerScene) c913820Zt6.l0).LLLLZLLLI();
        C524780Ki4.LIZ.start("av_video_choose_cover", "click cover");
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) c913820Zt6.l0;
        C2204961BRm.n(videoPublishContainerScene.mActivity, videoPublishContainerScene.LLLLIILL, 4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhicuLv4UZDPXIwqqgw5DImMExzz2B/44fJ/FnqiI=", null));
    }

    public static final void LIZ$2(C913820Zt6 c913820Zt6, View view) throws Throwable {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) c913820Zt6.l0;
        videoPublishContainerScene.q(videoPublishContainerScene.LLLIIIIL, 0, false);
    }

    public static final void LIZ$3(C913820Zt6 c913820Zt6, View view) throws Throwable {
        ((VideoPublishContainerScene) c913820Zt6.l0).w();
    }

    public C913820Zt6(C856850XjP c856850XjP, int i) {
        this.$t = i;
        this.l0 = c856850XjP;
    }
}
