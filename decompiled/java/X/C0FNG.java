package X;

import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.creative.model.edit.InspirationItemData;
import java.util.List;

/* JADX INFO: renamed from: X.0FNG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FNG {
    public final List<InspirationItemData> LIZ;
    public final C375830EoP<C0FNO> LIZIZ;
    public final C385670FAf<Integer> LIZJ;
    public final int LIZLLL;

    public C0FNG() {
        this(0);
    }

    public /* synthetic */ C0FNG(int i) {
        this(null, null, null, 0);
    }

    public C0FNG(List<InspirationItemData> list, C375830EoP<C0FNO> c375830EoP, C385670FAf<Integer> c385670FAf, int i) {
        this.LIZ = list;
        this.LIZIZ = c375830EoP;
        this.LIZJ = c385670FAf;
        this.LIZLLL = i;
    }

    public static C0FNG LIZ(C0FNG c0fng, List list, C375830EoP c375830EoP, h0 h0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            list = c0fng.LIZ;
        }
        if ((i2 & 2) != 0) {
            c375830EoP = c0fng.LIZIZ;
        }
        C385670FAf<Integer> c385670FAf = h0Var;
        if ((i2 & 4) != 0) {
            c385670FAf = c0fng.LIZJ;
        }
        if ((i2 & 8) != 0) {
            i = c0fng.LIZLLL;
        }
        c0fng.getClass();
        return new C0FNG(list, c375830EoP, c385670FAf, i);
    }
}
