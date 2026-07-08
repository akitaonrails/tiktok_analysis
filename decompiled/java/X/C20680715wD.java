package X;

import android.util.SparseArray;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15wD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20680715wD {
    public static final Map<Integer, String> LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(249372161, "add_yours_detail"), new Pair(249372162, "add_yours_invite_panel"), new Pair(1, "add_yours_hub"), new Pair(249372176, "story_detail"));
    public static final AFwS221S0000000_31 LJ;
    public static final Map<Integer, Function0<C20680715wD[]>> LJFF;
    public static final Map<Integer, Function2<SparseArray<C20680915wF>, Map<String, Object>, Unit>> LJI;
    public static final Map<Integer, String> LJII;
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    static {
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(519);
        LJ = aFwS221S0000000_31;
        LJFF = C2097608Jq.LJIIIIZZ(new Pair(249372161, aFwS221S0000000_31), new Pair(249372162, aFwS221S0000000_31), new Pair(1, aFwS221S0000000_31), new Pair(249372176, AFwS221S0000000_31.get$arr$(520)));
        LJI = C2097908Jt.LIZJ(new Pair(249372176, C20681015wG.LIZ));
        LJII = C2097608Jq.LJIIIIZZ(new Pair(249372161, "social_add_yours_load_metrics"), new Pair(249372162, "social_add_yours_load_metrics"), new Pair(1, "social_add_yours_load_metrics"), new Pair(249372176, "story_list_prf"));
    }

    public C20680715wD(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
