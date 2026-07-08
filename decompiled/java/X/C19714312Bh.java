package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.ImagePublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.scene.ImagePublishFullPagePreviewScene;
import com.ss.android.ugc.aweme.shortvideo.ui.scene.ImagePublishPreviewViewPagerScene;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19714312Bh implements InterfaceC19714712Bl {
    public final /* synthetic */ ImagePublishPreviewViewPagerScene LIZ;

    @Override // X.InterfaceC19714712Bl
    public final void S() {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(this.LIZ);
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.remove(this.LIZ);
        }
    }

    @Override // X.InterfaceC19714712Bl
    public final void hide() {
        ViewGroup viewGroup = this.LIZ.LLLI;
        if (viewGroup != null) {
            C12C5.LIZJ(viewGroup, 300L, null, null, 14);
        }
    }

    @Override // X.InterfaceC19714712Bl
    public final void show() {
        ViewGroup viewGroup = this.LIZ.LLLI;
        if (viewGroup != null) {
            C12C5.LIZIZ(viewGroup, 300L, 0.0f, null, 6);
        }
    }

    public C19714312Bh(ImagePublishPreviewViewPagerScene imagePublishPreviewViewPagerScene) {
        this.LIZ = imagePublishPreviewViewPagerScene;
    }

    @Override // X.InterfaceC19714712Bl
    public final void LIZ(int i) {
        if (i == 0) {
            this.LIZ.LLLLLLLLLL().pause();
        } else {
            this.LIZ.LLLLLLLLL().pause();
        }
    }

    @Override // X.InterfaceC19714712Bl
    public final void LIZIZ(int i) {
        boolean z;
        boolean z2 = false;
        TuxTextView tuxTextView = null;
        if (i == 0) {
            C337180DJs.LIZ(this.LIZ.LLLLLLLLLL().mView);
            C337180DJs.LIZJ(this.LIZ.LLLLLLLLL().mView);
            VideoPublishEditModel videoPublishEditModel = this.LIZ.LLJJL;
            C1402820mbo.LIZ.getClass();
            C0LAB c0labLIZJ = C1402820mbo.LIZJ(videoPublishEditModel, "video_post_page");
            c0labLIZJ.LJ("preview_tab_name", "preview_feed");
            C20684815ws.LJIILLIIL("click_preview_sub_tab", c0labLIZJ.LIZ);
            ImagePublishPreviewScene imagePublishPreviewSceneLLLLLLLLL = this.LIZ.LLLLLLLLL();
            C1462760oAU c1462760oAU = this.LIZ.LLLLLLLLLL().LLLFZ;
            if (c1462760oAU == null) {
                c1462760oAU = null;
            }
            int currentItem = c1462760oAU.getCurrentItem();
            C1462760oAU c1462760oAU2 = imagePublishPreviewSceneLLLLLLLLL.LLLJIL;
            if (c1462760oAU2 == null) {
                c1462760oAU2 = null;
            }
            if (c1462760oAU2.getCurrentItem() != currentItem) {
                C1462760oAU c1462760oAU3 = imagePublishPreviewSceneLLLLLLLLL.LLLJIL;
                if (c1462760oAU3 == null) {
                    c1462760oAU3 = null;
                }
                c1462760oAU3.LLFFF(currentItem, false);
                imagePublishPreviewSceneLLLLLLLLL.LLLLLLZ().kM1(currentItem, 0.0f);
            }
        } else {
            this.LIZ.LLLLLLLLLL().LLLILZJ = true;
            C337180DJs.LIZ(this.LIZ.LLLLLLLLL().mView);
            C337180DJs.LIZJ(this.LIZ.LLLLLLLLLL().mView);
            VideoPublishEditModel videoPublishEditModel2 = this.LIZ.LLJJL;
            C1402820mbo c1402820mbo = C1402820mbo.LIZ;
            c1402820mbo.getClass();
            C0LAB c0labLIZJ2 = C1402820mbo.LIZJ(videoPublishEditModel2, "video_post_page");
            c0labLIZJ2.LJ("preview_tab_name", "preview_full_page");
            C20684815ws.LJIILLIIL("click_preview_sub_tab", c0labLIZJ2.LIZ);
            ImagePublishFullPagePreviewScene imagePublishFullPagePreviewSceneLLLLLLLLLL = this.LIZ.LLLLLLLLLL();
            C1462760oAU c1462760oAU4 = this.LIZ.LLLLLLLLL().LLLJIL;
            if (c1462760oAU4 == null) {
                c1462760oAU4 = null;
            }
            int currentItem2 = c1462760oAU4.getCurrentItem();
            C1462760oAU c1462760oAU5 = imagePublishFullPagePreviewSceneLLLLLLLLLL.LLLFZ;
            if (c1462760oAU5 == null) {
                c1462760oAU5 = null;
            }
            if (currentItem2 != c1462760oAU5.getCurrentItem()) {
                C1462760oAU c1462760oAU6 = imagePublishFullPagePreviewSceneLLLLLLLLLL.LLLFZ;
                if (c1462760oAU6 == null) {
                    c1462760oAU6 = null;
                }
                c1462760oAU6.LLFFF(currentItem2, false);
            }
            final ImagePublishFullPagePreviewScene imagePublishFullPagePreviewSceneLLLLLLLLLL2 = this.LIZ.LLLLLLLLLL();
            if (!imagePublishFullPagePreviewSceneLLLLLLLLLL2.LLLLIILL) {
                imagePublishFullPagePreviewSceneLLLLLLLLLL2.LLLLIILL = true;
                ScrollView scrollView = (ScrollView) imagePublishFullPagePreviewSceneLLLLLLLLLL2.mView.findViewById(R.id.qcf);
                imagePublishFullPagePreviewSceneLLLLLLLLLL2.LLLIIII = scrollView;
                if (scrollView == null) {
                    scrollView = null;
                }
                if (!scrollView.canScrollVertically(1)) {
                    VideoPublishEditModel videoPublishEditModel3 = imagePublishFullPagePreviewSceneLLLLLLLLLL2.LLJJL;
                    c1402820mbo.getClass();
                    C20684815ws.LJIILLIIL("scroll_finish_in_preview", C1402820mbo.LIZJ(videoPublishEditModel3, "preview_full_page").LIZ);
                } else {
                    ScrollView scrollView2 = imagePublishFullPagePreviewSceneLLLLLLLLLL2.LLLIIII;
                    if (scrollView2 == null) {
                        scrollView2 = null;
                    }
                    scrollView2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.12Bi
                        @Override // android.view.View.OnScrollChangeListener
                        public final void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                            ScrollView scrollView3 = imagePublishFullPagePreviewSceneLLLLLLLLLL2.LLLIIII;
                            if (scrollView3 == null) {
                                scrollView3 = null;
                            }
                            if (!scrollView3.canScrollVertically(1)) {
                                ScrollView scrollView4 = imagePublishFullPagePreviewSceneLLLLLLLLLL2.LLLIIII;
                                if (scrollView4 == null) {
                                    scrollView4 = null;
                                }
                                scrollView4.setOnScrollChangeListener(null);
                                VideoPublishEditModel videoPublishEditModel4 = imagePublishFullPagePreviewSceneLLLLLLLLLL2.LLJJL;
                                C1402820mbo.LIZ.getClass();
                                C20684815ws.LJIILLIIL("scroll_finish_in_preview", C1402820mbo.LIZJ(videoPublishEditModel4, "preview_full_page").LIZ);
                            }
                        }
                    });
                }
            }
        }
        TuxTextView tuxTextView2 = this.LIZ.LLLFF;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        tuxTextView2.setSelected(z);
        TuxTextView tuxTextView3 = this.LIZ.LLLF;
        if (tuxTextView3 != null) {
            tuxTextView = tuxTextView3;
        }
        if (i == 0) {
            z2 = true;
        }
        tuxTextView.setSelected(z2);
    }

    @Override // X.InterfaceC19714712Bl
    public final void LIZJ(int i) {
        if (i == 0) {
            this.LIZ.LLLLLLLLLL().LLLLLLZ();
        } else {
            this.LIZ.LLLLLLLLL().LLLLLZ();
        }
    }
}
