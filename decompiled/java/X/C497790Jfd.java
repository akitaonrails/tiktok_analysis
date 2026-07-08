package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: renamed from: X.0Jfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497790Jfd {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Text LJ;
    public final C520920Kbq LJFF;
    public final ImageModel LJI;
    public final Boolean LJII;
    public final long LJIIIIZZ;

    public C497790Jfd(String str, String str2, Text text, C520920Kbq c520920Kbq, int i) {
        long j;
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        text = (i & 16) != 0 ? null : text;
        c520920Kbq = (i & 64) != 0 ? null : c520920Kbq;
        if ((i & 512) != 0) {
            j = 5;
        } else {
            j = 0;
        }
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = 3;
        this.LIZLLL = 0;
        this.LJ = text;
        this.LJFF = c520920Kbq;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = j;
    }
}
