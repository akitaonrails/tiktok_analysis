package Y;

import X.C07KQ;
import X.C122P;
import X.C19354410nm;
import X.C196902122a;
import X.C1C7U;
import com.bytedance.libcore.network.IExploreApi;
import com.ss.android.ugc.aweme.legoImp.task.InitAVModule;
import kotlin.jvm.internal.AwS167S0101000_29;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS102S0000000_29 implements Runnable {
    public final int $t;

    public static final void run$0(ARunnableS102S0000000_29 aRunnableS102S0000000_29) {
        C1C7U.LIZ("EditTextStickerController@f6fd.initPlayingRefreshTask$1$firstTimeJob$1");
        C1C7U.LIZIZ("EditTextStickerController@f6fd.initPlayingRefreshTask$1$firstTimeJob$1");
    }

    public static final void run$1(ARunnableS102S0000000_29 aRunnableS102S0000000_29) {
        C1C7U.LIZ("FTCEditTextStickerController@69fb.initPlayingRefreshTask$1$firstTimeJob$1");
        C1C7U.LIZIZ("FTCEditTextStickerController@69fb.initPlayingRefreshTask$1$firstTimeJob$1");
    }

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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public ARunnableS102S0000000_29(int i) {
        this.$t = i;
    }

    public static final void run$2(ARunnableS102S0000000_29 aRunnableS102S0000000_29) {
        C1C7U.LIZ("BigJankManager@4943.reportSampled$1L");
        C19354410nm c19354410nm = IExploreApi.LIZ;
        c19354410nm.getClass();
        C07KQ.LIZ(new AwS167S0101000_29(c19354410nm, 0));
        C1C7U.LIZIZ("BigJankManager@4943.reportSampled$1L");
    }

    public static final void run$3(ARunnableS102S0000000_29 aRunnableS102S0000000_29) {
        C1C7U.LIZ("AwemeApplicationImpl@4971.onCreate$1L");
        InitAVModule.LJIIIIZZ().LJIIIZ();
        C1C7U.LIZIZ("AwemeApplicationImpl@4971.onCreate$1L");
    }

    public ARunnableS102S0000000_29(C122P c122p, int i) {
        this.$t = i;
    }

    public ARunnableS102S0000000_29(C196902122a c196902122a, int i) {
        this.$t = i;
    }
}
