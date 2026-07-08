package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680190tpB implements Comparable<C1680190tpB> {
    public static final C1680190tpB LLILLJJLI;
    public static final C1680190tpB LLILLL;
    public static final C1680190tpB LLILZ;
    public static final C1680190tpB LLILZIL;
    public static final C1680190tpB LLILZLL;
    public static final C1680190tpB LLIZ;
    public static final C1680190tpB LLIZLLLIL;
    public static final C1680190tpB LLJ;
    public static final C1680190tpB LLJI;
    public static final List<C1680190tpB> LLJIJIL;
    public final int LL;

    static {
        C1680190tpB c1680190tpB = new C1680190tpB(100);
        C1680190tpB c1680190tpB2 = new C1680190tpB(200);
        C1680190tpB c1680190tpB3 = new C1680190tpB(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        C1680190tpB c1680190tpB4 = new C1680190tpB(400);
        LLILLJJLI = c1680190tpB4;
        C1680190tpB c1680190tpB5 = new C1680190tpB(500);
        LLILLL = c1680190tpB5;
        C1680190tpB c1680190tpB6 = new C1680190tpB(600);
        LLILZ = c1680190tpB6;
        C1680190tpB c1680190tpB7 = new C1680190tpB(OppoPermissionPopupMaskDelayExp.DEFAULT);
        C1680190tpB c1680190tpB8 = new C1680190tpB(800);
        C1680190tpB c1680190tpB9 = new C1680190tpB(900);
        LLILZIL = c1680190tpB3;
        LLILZLL = c1680190tpB4;
        LLIZ = c1680190tpB5;
        LLIZLLLIL = c1680190tpB6;
        LLJ = c1680190tpB7;
        LLJI = c1680190tpB9;
        LLJIJIL = C1697810uHb.LJIIJJI(c1680190tpB, c1680190tpB2, c1680190tpB3, c1680190tpB4, c1680190tpB5, c1680190tpB6, c1680190tpB7, c1680190tpB8, c1680190tpB9);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FontWeight(weight=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LL;
    }

    public C1680190tpB(int i) {
        this.LL = i;
        if (1 <= i && i < 1001) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Font weight can be in range [1, 1000]. Current value: ");
        sbLIZ.append(i);
        C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1680190tpB c1680190tpB) {
        return Intrinsics.LJI(this.LL, c1680190tpB.LL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1680190tpB) && this.LL == ((C1680190tpB) obj).LL) {
            return true;
        }
        return false;
    }
}
