package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: renamed from: X.0xxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838930xxD extends RecyclerView.ViewHolder {
    public final InterfaceC497601wk LL;
    public final Function2<Integer, Bitmap, Unit> LLILLJJLI;
    public final Function1<LiveFragmentDetail, Unit> LLILLL;
    public final FrameLayout LLILZ;
    public final SmartImageView LLILZIL;
    public final View LLILZLL;
    public final FrameLayout LLIZ;
    public LiveFragmentDetail LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final C21616519il LLJILJIL;

    public final void I5(final LiveFragmentDetail liveFragmentDetail) {
        long j;
        long j2;
        if (Intrinsics.LJFF(this.LLJ, liveFragmentDetail.coverUrl)) {
            C339190DRl.LIZLLL(this.LLILZIL);
            return;
        }
        VideoMetaInfo videoMetaInfo = liveFragmentDetail.mp4VideoMetaInfo;
        if (videoMetaInfo != null) {
            j = videoMetaInfo.width;
            j2 = videoMetaInfo.height;
        } else {
            j = liveFragmentDetail.witdh;
            j2 = liveFragmentDetail.height;
        }
        if (j > 0 && j2 > 0) {
            float f = j / j2;
            String str = liveFragmentDetail.coverUrl;
            if (str != null && str.length() != 0) {
                C339190DRl.LIZLLL(this.LLILZIL);
                this.LLJ = liveFragmentDetail.coverUrl;
                this.LLILZIL.setAspectRatio(f);
                String str2 = liveFragmentDetail.coverUrl;
                if (str2 != null && str2.length() > 0) {
                    C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(Collections.singletonList(str2)));
                    c1331670kl3LJIIJ.LJIIIIZZ = (int) j;
                    c1331670kl3LJIIJ.LJIIIZ = (int) j2;
                    c1331670kl3LJIIJ.LJJ = EnumC1338240kve.CENTER_CROP;
                    c1331670kl3LJIIJ.LJIL = Bitmap.Config.RGB_565;
                    c1331670kl3LJIIJ.LJJIIJZLJL(new AbstractC468201s0() { // from class: X.0xvy
                        @Override // X.InterfaceC1331910klR
                        public final void onFailed(Throwable th) {
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void LIZ(Bitmap bitmap) {
                            if (bitmap != null) {
                                C1838930xxD c1838930xxD = this.LL;
                                LiveFragmentDetail liveFragmentDetail2 = liveFragmentDetail;
                                SmartImageView smartImageView = c1838930xxD.LLILZIL;
                                smartImageView.setImageDrawable(new BitmapDrawable(smartImageView.getContext().getResources(), bitmap));
                                List<String> list = liveFragmentDetail2.coverThemeColor;
                                if (list == null || list.isEmpty()) {
                                    C23250099c.LIZLLL(c1838930xxD.LL, null, null, new C2441409hU(bitmap, liveFragmentDetail2, c1838930xxD, null), 3);
                                }
                            }
                        }
                    });
                    return;
                }
                return;
            }
            C500260Jjc.LJIILLIIL(this.LLILZIL);
            return;
        }
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public C1838930xxD(View view, C054G c054g, AwS641S0100000_27 awS641S0100000_27, Function1 function1) {
        super(view);
        this.LL = c054g;
        this.LLILLJJLI = awS641S0100000_27;
        this.LLILLL = function1;
        this.LLILZ = (FrameLayout) view.findViewById(R.id.video_container);
        this.LLILZIL = (SmartImageView) view.findViewById(R.id.video_cover_image);
        this.LLILZLL = view.findViewById(R.id.nli);
        this.LLIZ = (FrameLayout) view.findViewById(R.id.video_cover_container);
        C21616519il c21616519il = new C21616519il(this.itemView, AbstractC21616419ik.LJIIL);
        C21581419d6 c21581419d6 = new C21581419d6();
        c21581419d6.LJIIIIZZ = 0.0f;
        c21581419d6.LIZ(0.5f);
        c21581419d6.LIZIZ(200.0f);
        c21616519il.LJJ = c21581419d6;
        this.LLJILJIL = c21616519il;
    }
}
