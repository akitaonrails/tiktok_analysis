package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.EffectSdkExtra;
import com.ss.android.ugc.aweme.sticker.PlDataBean;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.18hz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21356918hz {
    public String LIZ;
    public String LIZIZ;
    public final int LIZJ;
    public String LIZLLL;
    public final long LJFF;
    public String LJII;
    public int LJIIJJI;
    public int LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public EffectSdkExtra LJ = new EffectSdkExtra(new PlDataBean(new ArrayList(), null, null, true, true, 0, 2, 5, -1, -1, -1, -1, 0, 0, false));
    public int LJI = 1;
    public String LJIIIIZZ = "unknown";
    public int LJIIIZ = -1;
    public int LJIIJ = -1;

    public C21356918hz() {
    }

    public final String LIZ() {
        return this.LJ.getPl().getImgK();
    }

    public final MediaModel LIZJ() {
        MediaModel mediaModel = new MediaModel(-1L);
        mediaModel.LJIILL(this.LIZIZ);
        mediaModel.fileName = this.LJIILIIL;
        mediaModel.width = this.LJIIJJI;
        mediaModel.height = this.LJIIL;
        mediaModel.duration = this.LJFF;
        String str = this.LJIILJJIL;
        if (str != null) {
            mediaModel.mimeType = str;
        }
        return mediaModel;
    }

    public C21356918hz(String str) {
        this.LIZIZ = str;
    }

    public final void LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.LJ = (EffectSdkExtra) C2219091BtD.LIZJ().LJII(str, EffectSdkExtra.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C21356918hz(String str, long j) {
        this.LIZIZ = str;
        this.LJFF = j;
    }

    public C21356918hz(String str, int i) {
        this.LIZIZ = str;
        this.LIZJ = i;
    }
}
