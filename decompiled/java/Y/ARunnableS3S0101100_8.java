package Y;

import X.AbstractC529520Kpi;
import X.C0P0T;
import X.C1391600mJi;
import X.C1C7U;
import X.C450720Hlu;
import X.C497820Jfg;
import X.C522180Kds;
import X.C528030KnJ;
import X.C529530Kpj;
import X.C529980KqS;
import X.C572460Mcm;
import X.C786410Ut5;
import X.EnumC1235690iGF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class ARunnableS3S0101100_8 implements Runnable {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C529530Kpj c529530Kpj;
        VideoImageMixedController videoImageMixedController = (VideoImageMixedController) this.l0;
        if (videoImageMixedController.LLJJJJLIIL != null) {
            C528030KnJ c528030KnJ = videoImageMixedController.LLJJJJJIL;
            C0P0T c0p0t = null;
            if (c528030KnJ == null) {
                c528030KnJ = null;
            }
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c528030KnJ.getMediaSelectRecyclerView().findViewHolderForAdapterPosition(this.i1);
            VideoImageMixedController videoImageMixedController2 = (VideoImageMixedController) this.l0;
            AbstractC529520Kpi abstractC529520Kpi = videoImageMixedController2.LLJJJJLIIL;
            if (abstractC529520Kpi == null) {
                abstractC529520Kpi = null;
            }
            if ((abstractC529520Kpi instanceof C529530Kpj) && (c529530Kpj = (C529530Kpj) abstractC529520Kpi) != null) {
                View view = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView : null;
                float fLJ = C529980KqS.LJ(this.j2);
                if (view != null) {
                    C0P0T c0p0t2 = c529530Kpj.LLJJ;
                    if (c0p0t2 != null && c0p0t2.isShowing()) {
                        c0p0t2.dismiss();
                    }
                    if (view.isAttachedToWindow()) {
                        int[] iArr = new int[2];
                        view.getLocationInWindow(iArr);
                        if (iArr[0] + view.getWidth() >= 0 && iArr[0] <= C497820Jfg.LIZIZ(view.getContext())) {
                            String strJ4 = C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(fLJ)}, 1));
                            Function0<Boolean> function0 = c529530Kpj.LLJILJIL;
                            String string = (function0 == null || !function0.invoke().booleanValue()) ? view.getContext().getString(2131850086, strJ4) : view.getContext().getString(2131850074, Integer.valueOf((int) fLJ));
                            C450720Hlu c450720Hlu = new C450720Hlu(view.getContext());
                            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
                            c1391600mJi.LIZIZ = view;
                            c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
                            c1391600mJi.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
                            c450720Hlu.LLILZ = string;
                            C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
                            c0p0tLIZIZ.show();
                            c529530Kpj.LLJJ = c0p0tLIZIZ;
                            C522180Kds.LIZ.getClass();
                            C522180Kds.LIZJ("video_duration_short");
                            c0p0t = c529530Kpj.LLJJ;
                        }
                    }
                }
            }
            videoImageMixedController2.LLLLLLLZIL = c0p0t;
        }
    }

    public static final void run$0(ARunnableS3S0101100_8 aRunnableS3S0101100_8) {
        boolean zLIZ;
        C1C7U.LIZ("VideoImageMixedController@1fe.checkVideoDuringForTooltip$1$1");
        try {
            aRunnableS3S0101100_8.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoImageMixedController@1fe.checkVideoDuringForTooltip$1$1");
    }

    public static final void run$1(ARunnableS3S0101100_8 aRunnableS3S0101100_8) {
        boolean zLIZ;
        C1C7U.LIZ("TextImagePreviewContainer@d745.simulateRunnable$1");
        try {
            C572460Mcm c572460Mcm = (C572460Mcm) aRunnableS3S0101100_8.l0;
            int i = c572460Mcm.LLJILJIL;
            if (i < aRunnableS3S0101100_8.i1) {
                int i2 = i + 1;
                c572460Mcm.LLJILJIL = i2;
                c572460Mcm.LIZ(i2);
                HandlerHook.viewPostDelay((C572460Mcm) aRunnableS3S0101100_8.l0, aRunnableS3S0101100_8, aRunnableS3S0101100_8.j2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TextImagePreviewContainer@d745.simulateRunnable$1");
    }

    public ARunnableS3S0101100_8(C572460Mcm c572460Mcm, int i) {
        this.$t = i;
        this.l0 = c572460Mcm;
        this.j2 = 50L;
    }

    public ARunnableS3S0101100_8(VideoImageMixedController videoImageMixedController, int i, long j, int i2) {
        this.$t = i2;
        this.l0 = videoImageMixedController;
        this.i1 = i;
        this.j2 = j;
    }
}
