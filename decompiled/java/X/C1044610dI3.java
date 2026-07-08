package X;

import com.ss.android.ugc.aweme.component.danmaku.model.Danmu;
import java.util.List;

/* JADX INFO: renamed from: X.0dI3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044610dI3 {
    public static final /* synthetic */ int LJI = 0;
    public final List<Danmu> LIZ;
    public final List<Danmu> LIZIZ;
    public int LIZJ = 0;
    public int LIZLLL = 0;
    public int LJ = 0;
    public long LJFF = 0;

    public final void LIZ(C1044600dI2 c1044600dI2) {
        int i;
        int i2 = this.LIZJ;
        int i3 = c1044600dI2.LJ;
        int size = this.LIZ.size();
        int i4 = 0;
        if (size <= 0) {
            i = 0;
        } else {
            i = (i2 + i3) % size;
        }
        this.LIZJ = i;
        int i5 = this.LIZLLL;
        int i6 = c1044600dI2.LJFF;
        int size2 = this.LIZIZ.size();
        if (size2 > 0) {
            i4 = (i5 + i6) % size2;
        }
        this.LIZLLL = i4;
        this.LJ++;
        this.LJFF = c1044600dI2.LIZJ;
    }

    public C1044610dI3(List list, List list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
