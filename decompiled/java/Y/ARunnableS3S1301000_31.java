package Y;

import X.C15LE;
import X.C15LG;
import X.C1C7U;
import X.C2212291BiF;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS3S1301000_31 implements Runnable {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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

    public static final void run$0(ARunnableS3S1301000_31 aRunnableS3S1301000_31) {
        boolean zLIZ;
        C1C7U.LIZ("SplashAdMonitor@5afa.monitorStatusAndDurationBeforeInit$1");
        try {
            ((C2212291BiF) aRunnableS3S1301000_31.l3).LJII(aRunnableS3S1301000_31.s0, aRunnableS3S1301000_31.i4, (JSONObject) aRunnableS3S1301000_31.l1, (JSONObject) aRunnableS3S1301000_31.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SplashAdMonitor@5afa.monitorStatusAndDurationBeforeInit$1");
    }

    public static final void run$1(ARunnableS3S1301000_31 aRunnableS3S1301000_31) {
        C15LE c15le = (C15LE) aRunnableS3S1301000_31.l1;
        MusicModel musicModel = (MusicModel) aRunnableS3S1301000_31.l2;
        MusicWaveBean musicWaveBean = (MusicWaveBean) aRunnableS3S1301000_31.l3;
        String str = aRunnableS3S1301000_31.s0;
        int i = aRunnableS3S1301000_31.i4;
        C15LG c15lg = c15le.LIZLLL.LJ;
        if (c15lg != null) {
            c15lg.hb(false, false);
        }
        musicModel.setMusicWaveBean(musicWaveBean);
        musicModel.setDownloadComplete(true);
        C15LG c15lg2 = c15le.LIZLLL.LJ;
        if (c15lg2 != null) {
            c15lg2.eL(i, musicModel, str);
        }
    }

    public ARunnableS3S1301000_31(Object obj, String str, int i, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.l3 = obj;
        this.s0 = str;
        this.i4 = i;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
