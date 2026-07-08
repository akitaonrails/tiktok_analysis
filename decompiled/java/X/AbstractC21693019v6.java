package X;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.BlurHashMetaDataSettings;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.lemon.postmode.model.ImageLoadMonitorParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19v6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21693019v6 {
    public final InterfaceC21693319v9 LIZ;
    public final InterfaceC21693419vA LIZIZ;
    public final ViewOnTouchListenerC21650819oI LIZJ;
    public boolean LIZLLL;
    public String LJ;
    public VideoItemParams LJFF;
    public int LJI;
    public UrlModel LJII;
    public long LJIIIIZZ;
    public final C21693119v7 LJIIIZ;
    public final Bitmap.Config LJIIJ;

    public void LIZIZ() {
        this.LJ = "";
        this.LJFF = null;
        this.LJI = -1;
        this.LJIIIIZZ = SystemClock.elapsedRealtime();
        this.LJII = null;
        this.LIZLLL = false;
        C21693119v7 c21693119v7 = this.LJIIIZ;
        ValueAnimator valueAnimator = c21693119v7.LJFF;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = c21693119v7.LJFF;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        c21693119v7.LIZ();
        C339190DRl.LIZIZ(c21693119v7.LIZIZ);
        c21693119v7.LJII = 10.0f;
        c21693119v7.LIZLLL.LIZ(10.0f, false);
    }

    static {
        C1318140kPE.LJII = BlurHashMetaDataSettings.getMetadata();
    }

    public final void LIZ(int i) {
        String aid;
        Aweme aweme;
        C21693119v7 c21693119v7 = this.LJIIIZ;
        if (!c21693119v7.LJI) {
            c21693119v7.LIZ();
            if (c21693119v7.LIZIZ.getDrawable() == null) {
                ImageView imageView = c21693119v7.LIZIZ;
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_color_tiktok_logo_light;
                imageView.setImageDrawable(c419910GdJ.LIZ(c21693119v7.LJ));
            }
            C339190DRl.LIZLLL(c21693119v7.LIZIZ);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LJIIIIZZ;
        int code = EnumC995390c0f.FAIL.getCode();
        String str = this.LJ;
        VideoItemParams videoItemParams = this.LJFF;
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        ImageLoadMonitorParams imageLoadMonitorParams = new ImageLoadMonitorParams(this.LJI, code, jElapsedRealtime, Integer.valueOf(i), aid, str);
        InterfaceC21693419vA interfaceC21693419vA = this.LIZIZ;
        if (interfaceC21693419vA != null) {
            interfaceC21693419vA.LIZIZ(imageLoadMonitorParams);
        }
    }

    public AbstractC21693019v6(InterfaceC21693319v9 interfaceC21693319v9, InterfaceC21693419vA interfaceC21693419vA, View view) {
        this.LIZ = interfaceC21693319v9;
        this.LIZIZ = interfaceC21693419vA;
        view.getContext();
        this.LIZJ = (ViewOnTouchListenerC21650819oI) view.findViewById(R.id.vmb);
        this.LJ = "";
        this.LJI = -1;
        this.LJIIIZ = new C21693119v7(view);
        this.LJIIJ = Bitmap.Config.RGB_565;
    }
}
