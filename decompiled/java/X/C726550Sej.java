package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: renamed from: X.0Sej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726550Sej {
    public final Aweme LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final float LJ;
    public final float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;

    public final void LIZ() {
        View view;
        Video video;
        FakeLandscapeInfo fakeLandscapeInfo;
        if (this.LIZIZ != null && (video = this.LIZ.getVideo()) != null && (fakeLandscapeInfo = video.getFakeLandscapeInfo()) != null) {
            this.LJI = r4.getWidth() * (fakeLandscapeInfo.getRight() - fakeLandscapeInfo.getLeft());
            float height = r4.getHeight() * (fakeLandscapeInfo.getBottom() - fakeLandscapeInfo.getTop());
            this.LJII = height;
            this.LJIIIIZZ = (this.LJI / height) * 100;
        }
        View view2 = this.LIZIZ;
        if (view2 == null || (view = this.LIZLLL) == null || this.LJI == 0.0f || this.LJII == 0.0f) {
            return;
        }
        float fMin = Math.min(view.getWidth() / this.LJI, view.getHeight() / this.LJII);
        C786410Ut5.Ob(view2, fMin);
        C786410Ut5.pc(view2, fMin);
        View view3 = this.LIZJ;
        if (view3 != null) {
            C786410Ut5.Ob(view3, fMin);
            C786410Ut5.pc(view3, fMin);
        }
    }

    public final void LIZIZ() {
        View view = this.LIZIZ;
        if (view != null) {
            C786410Ut5.Ob(view, this.LJ);
            C786410Ut5.pc(view, this.LJFF);
        }
        View view2 = this.LIZJ;
        if (view2 != null) {
            C786410Ut5.Ob(view2, this.LJ);
            C786410Ut5.pc(view2, this.LJFF);
        }
    }

    public C726550Sej(Aweme aweme, View view, View view2, View view3) {
        float scaleX;
        this.LIZ = aweme;
        this.LIZIZ = view;
        this.LIZJ = view2;
        this.LIZLLL = view3;
        if (view != null) {
            scaleX = view.getScaleX();
        } else {
            scaleX = 1.0f;
        }
        this.LJ = scaleX;
        this.LJFF = view != null ? view.getScaleY() : 1.0f;
        this.LJIIIIZZ = -1.0f;
    }
}
