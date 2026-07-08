package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0tKS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661140tKS {
    public final int LIZ;
    public final int LIZIZ;
    public final Effect LIZJ;
    public final long LIZLLL;
    public final ExceptionResult LJ;

    public C1661140tKS(int i, int i2, Effect effect, long j, ExceptionResult exceptionResult, int i3) {
        i2 = (i3 & 2) != 0 ? 0 : i2;
        effect = (i3 & 4) != 0 ? null : effect;
        j = (i3 & 8) != 0 ? 0L : j;
        exceptionResult = (i3 & 16) != 0 ? null : exceptionResult;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = effect;
        this.LIZLLL = j;
        this.LJ = exceptionResult;
    }
}
