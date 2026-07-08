package Y;

import X.C036E;
import X.C0F7E;
import X.C0NNY;
import X.C0NNZ;
import X.C0O0L;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C19EG;
import X.C1C7U;
import X.C305550ByL;
import X.C634930OvL;
import X.C634940OvM;
import X.C634950OvN;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tako.camera.record.pageui.TakoRecordUIAssem;
import kotlin.jvm.internal.AwS410S0200000_9;

/* JADX INFO: loaded from: classes10.dex */
public class ARunnableS1S0220000_9 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String musicId;
        ((C634950OvN) this.l0).LIZ(this.z2);
        if (this.z3) {
            ((C634930OvL) this.l1).LJI(null, null);
            AddYourRecordParam addYourRecordParam = ((C634930OvL) this.l1).LIZJ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C634930OvL c634930OvL = (C634930OvL) this.l1;
            long j = jCurrentTimeMillis - c634930OvL.LJII;
            MusicModel musicModel = c634930OvL.LJ;
            if (musicModel == null || (musicId = musicModel.getMusicId()) == null) {
                musicId = "";
            }
            C634940OvM.LIZ(addYourRecordParam, false, j, musicId, ((C634930OvL) this.l1).LJIIIIZZ);
        }
    }

    public final void LIZ$1() {
        AwS410S0200000_9 awS410S0200000_9 = new AwS410S0200000_9((TakoRecordUIAssem) this.l0, (Bitmap) this.l1, 74);
        if (this.z2) {
            TakoRecordUIAssem takoRecordUIAssem = (TakoRecordUIAssem) this.l0;
            C0F7E c0f7e = takoRecordUIAssem.LLJJJJ;
            takoRecordUIAssem.up();
            if (c0f7e == null || c0f7e.getVisibility() != 0) {
                awS410S0200000_9.invoke();
            } else {
                takoRecordUIAssem.hp(c0f7e, 0.0f, 100L, new AwS410S0200000_9(c0f7e, awS410S0200000_9, 73));
            }
        } else {
            awS410S0200000_9.invoke();
        }
        if (this.z3) {
            HandlerHook.viewPost(((TakoRecordUIAssem) this.l0).getContentView(), new ARunnableS109S0100000_9((TakoRecordUIAssem) this.l0, 144));
        }
    }

    public static final void run$0(ARunnableS1S0220000_9 aRunnableS1S0220000_9) {
        boolean zLIZ;
        C1C7U.LIZ("AddYoursRecordHelper@d921.listener$1$onEndMusicDownloadDialog$1");
        try {
            aRunnableS1S0220000_9.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AddYoursRecordHelper@d921.listener$1$onEndMusicDownloadDialog$1");
    }

    public static final void run$1(ARunnableS1S0220000_9 aRunnableS1S0220000_9) {
        boolean zLIZ;
        C1C7U.LIZ("TakoRecordUIAssem@2ad6.initView$2$1$startCapture$1$1$1");
        try {
            aRunnableS1S0220000_9.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoRecordUIAssem@2ad6.initView$2$1$startCapture$1$1$1");
    }

    public static final void run$2(ARunnableS1S0220000_9 aRunnableS1S0220000_9) {
        Aweme aweme;
        String aid;
        VideoViewCell videoViewCell = (VideoViewCell) aRunnableS1S0220000_9.l0;
        Aweme aweme2 = (Aweme) aRunnableS1S0220000_9.l1;
        boolean z = aRunnableS1S0220000_9.z2;
        boolean z2 = aRunnableS1S0220000_9.z3;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        videoViewCell.getClass();
        C1C7U.LIZ("VideoViewCell@c979.onBuffering$1L");
        C19EG activity = videoViewCell.getActivity();
        if (activity != null && !activity.isFinishing()) {
            if (aweme2 != videoViewCell.getAweme()) {
                C1C7U.LIZIZ("VideoViewCell@c979.onBuffering$1L");
                return;
            }
            C0O0L c0o0l = C036E.LIZ.LIZJ;
            if (c0o0l == C0O0L.NOT_AVAILABLE) {
                if (z) {
                    C1389880mGw c1389880mGw = new C1389880mGw(activity);
                    c1389880mGw.LJIIIIZZ(2131829438);
                    c1389880mGw.LJIIJ();
                } else if (C305550ByL.LIZJ() && z2) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activity);
                    c1389890mGx.LJIIIZ(2131837962);
                    c1389890mGx.LJIIJJI();
                } else {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
                    c1389890mGx2.LJIIIZ(2131829438);
                    c1389890mGx2.LJIIJJI();
                }
                C0NNY.LIZ(2131829438);
            } else if (c0o0l == C0O0L.FAKE) {
                C1389890mGx c1389890mGx3 = new C1389890mGx(activity);
                c1389890mGx3.LJIIIZ(2131829436);
                c1389890mGx3.LJIIJJI();
                C0NNY.LIZ(2131829436);
            } else if (c0o0l == C0O0L.AVAILABLE && (aweme = videoViewCell.getAweme()) != null && (aid = aweme.getAid()) != null) {
                C0NNZ.LIZ(activity, aid);
            }
            C1C7U.LIZIZ("VideoViewCell@c979.onBuffering$1L");
            return;
        }
        C1C7U.LIZIZ("VideoViewCell@c979.onBuffering$1L");
    }

    public ARunnableS1S0220000_9(Object obj, boolean z, boolean z2, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.z3 = z2;
        this.l1 = obj2;
    }

    public ARunnableS1S0220000_9(VideoViewCell videoViewCell, Aweme aweme, String str, boolean z, boolean z2, int i) {
        this.$t = i;
        this.l0 = videoViewCell;
        this.l1 = aweme;
        this.z2 = z;
        this.z3 = z2;
    }
}
