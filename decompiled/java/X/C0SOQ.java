package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment;
import com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent;
import com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosFloatComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0SOQ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SOQ extends C0SOP {
    public PostModePhotosComponent LLIZ;
    public C0SOO LLIZLLLIL;
    public C0RHO LLJ;

    @Override // X.C0SOP
    public final void LJII() {
    }

    @Override // X.C0SOP
    public final void LIZLLL() {
        final C0N0Y c0n0yLJLJJI;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        PostModeDetailFragment postModeDetailFragment;
        final Context contextLIZLLL = this.LLILLL.LIZLLL();
        final C0SRL c0srl = this.LLILLL;
        Fragment fragment = c0srl.LIZ;
        if (!(fragment instanceof PostModeDetailFragment) || (postModeDetailFragment = (PostModeDetailFragment) fragment) == null || (c0n0yLJLJJI = postModeDetailFragment.getPlayerManager()) == null) {
            c0n0yLJLJJI = C1483410ohn.LJLJJI();
        }
        this.LLIZLLLIL = new C0SOO(contextLIZLLL, c0srl, c0n0yLJLJJI) { // from class: X.0SOR
            @Override // X.C0SOO
            public final TuxIconView h0() {
                return getPostModeModel().LJ();
            }
        };
        Aweme aweme = this.LLILLL.LIZJ;
        if (aweme == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.size() <= 1) {
            return;
        }
        final C0SRL c0srl2 = this.LLILLL;
        new C0SOS(c0srl2) { // from class: X.0SOU
            @Override // X.C0SOS
            public final FrameLayout LIZ() {
                ViewGroup viewGroup = this.LL.LIZLLL;
                if (viewGroup != null) {
                    return (FrameLayout) viewGroup.findViewById(R.id.ins);
                }
                return null;
            }

            @Override // X.C0SOS
            public final C0SOW LIZIZ() {
                C0SOT c0sot;
                View viewFindViewById;
                ViewGroup viewGroup = this.LL.LIZLLL;
                if (viewGroup != null && (viewFindViewById = viewGroup.findViewById(R.id.qeq)) != null) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                    gradientDrawable.setColors(new int[]{1006632960, 0});
                    gradientDrawable.setGradientType(0);
                    gradientDrawable.setShape(0);
                    viewFindViewById.setBackground(gradientDrawable);
                }
                ViewGroup viewGroup2 = this.LL.LIZLLL;
                if (viewGroup2 == null || (c0sot = (C0SOT) viewGroup2.findViewById(R.id.inq)) == null) {
                    return null;
                }
                c0sot.setUseDarkColor(false);
                float f = C07CO.LIZIZ() ? 11.5f : 13.0f;
                Map<String, String> map = C2273381Dya.LIZ;
                if (C07QQ.LIZ() >= 2) {
                    f -= 2.0f;
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                }
                c0sot.setPaddingVerticalOut(f);
                return c0sot;
            }

            @Override // X.C0SOS
            public final View LIZJ() {
                ViewGroup viewGroup = this.LL.LIZLLL;
                if (viewGroup != null) {
                    return viewGroup.findViewById(R.id.qet);
                }
                return null;
            }
        };
    }

    @Override // X.C0SOP
    public final void LJ() {
        if (this.LL == null) {
            C2344809Gs.LJI(new Throwable("PostModePhotosComponent PostModeNavigationPageHelper.videoItemParams is null", null));
        } else {
            this.LLIZ = new PostModePhotosFloatComponent(this.LL, this.LLILLJJLI, this.LLILLL);
        }
    }

    @Override // X.C0SOP
    public final C0SOO LIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.C0SOP
    public final PostModePhotosComponent LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.C0SOP
    public final C0RHO LIZJ() {
        return this.LLJ;
    }

    @Override // X.C0SOP
    public final void LJIIIIZZ(C0SOO c0soo) {
        this.LLIZLLLIL = c0soo;
    }

    @Override // X.C0SOP
    public final void LJIIIZ(PostModePhotosComponent postModePhotosComponent) {
        this.LLIZ = postModePhotosComponent;
    }

    @Override // X.C0SOP
    public final void LJIIJ(C0RHO c0rho) {
        this.LLJ = c0rho;
    }

    public C0SOQ(VideoItemParams videoItemParams, PhotoSharedViewModel photoSharedViewModel, C0SRL c0srl) {
        super(videoItemParams, photoSharedViewModel, c0srl);
    }
}
