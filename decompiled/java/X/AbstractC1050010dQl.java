package X;

import android.content.Context;
import java.util.Map;

/* JADX INFO: renamed from: X.0dQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1050010dQl {
    public C1049700dQG LIZ;
    public C19JH LIZIZ;
    public C1050020dQm LIZJ;
    public Map<String, Object> LIZLLL;
    public String LJ;
    public String LJFF;
    public final Context LJI;

    public abstract boolean LJ(Object... objArr);

    public final void LIZLLL() {
        C1050000dQk c1050000dQk = this.LIZJ.LIZ;
        if (c1050000dQk == null) {
            return;
        }
        this.LIZLLL = c1050000dQk.LJ;
        this.LJ = c1050000dQk.LIZLLL;
        this.LJFF = c1050000dQk.LIZ;
    }

    public AbstractC1050010dQl(Context context) {
        this.LJI = context;
    }
}
