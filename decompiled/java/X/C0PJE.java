package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PJE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PJE {
    public final C0PHT LIZ;
    public final C642360PHm LIZIZ;
    public final Function0<InterfaceC1209780haS> LIZJ;
    public final Function0<List<Aweme>> LIZLLL;
    public final Function0<Boolean> LJ;
    public boolean LJFF = true;
    public int LJI = -1;
    public final C0PJD LJII = new C0PJD();
    public final C13BV LJIIIIZZ = C13BV.INSTANCE;

    public static boolean LIZ(C0PHW c0phw, Aweme aweme) {
        String str;
        HashMap<String, String> searchExtraParams;
        if (c0phw == null || c0phw.LIZJ.LJI) {
            return false;
        }
        HashMap<String, String> searchExtraParams2 = AwemeBizExtKt.getSearchExtraParams(aweme);
        String str2 = null;
        if (searchExtraParams2 != null) {
            str = searchExtraParams2.get("key_rerank_cursor");
        } else {
            str = null;
        }
        Aweme awemeLIZLLL = c0phw.LIZLLL();
        if (awemeLIZLLL != null && (searchExtraParams = AwemeBizExtKt.getSearchExtraParams(awemeLIZLLL)) != null) {
            str2 = searchExtraParams.get("key_rerank_cursor");
        }
        if (!Intrinsics.LJFF(str, str2) || C0PJG.LIZ(c0phw.LIZLLL()) <= 0.0d) {
            return false;
        }
        return true;
    }

    public C0PJE(C0PHT c0pht, C642360PHm c642360PHm, C0PJF c0pjf, C0PIJ c0pij, C640300P9o c640300P9o) {
        this.LIZ = c0pht;
        this.LIZIZ = c642360PHm;
        this.LIZJ = c0pjf;
        this.LIZLLL = c0pij;
        this.LJ = c640300P9o;
    }
}
