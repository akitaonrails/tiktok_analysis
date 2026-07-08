package X;

import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0PDf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641250PDf implements InterfaceC642940PJs {
    public static final HashMap<String, Integer> LLILZLL = new HashMap<>();
    public int LL;
    public C0PDS LLILLJJLI;
    public C0PDS LLILLL;
    public C0PDS LLILZ;
    public final C01GW LLILZIL;

    @Override // X.InterfaceC642940PJs
    public final String LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC642940PJs
    public final Long LJI() {
        return null;
    }

    public C641250PDf(C0PI7 c0pi7) {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(315));
        this.LLILZIL = c01gwLIZIZ;
        ((HashSet) c01gwLIZIZ.getValue()).add(c0pi7.LIZIZ);
    }

    @Override // X.InterfaceC642940PJs
    public final int LJIIIZ(String str) {
        Integer num = LLILZLL.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
