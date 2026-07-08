package X;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS151S1100000_2;

/* JADX INFO: renamed from: X.05OG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05OG {
    public static C20498815Ja LIZIZ;
    public static AnonymousClass0956 LIZJ;
    public static final C05OG LIZ = new C05OG();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(970));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(971));
    public static final HashMap<String, C1485060okS> LJFF = new HashMap<>();

    public static void LIZ() {
        C23250099c.LIZLLL((InterfaceC497601wk) LJ.getValue(), null, null, new C05OD(null), 3);
    }

    public static void LIZIZ() {
        C23250099c.LIZLLL((InterfaceC497601wk) LJ.getValue(), null, null, new C05OF(null), 3);
    }

    public static void LIZJ(String str, Function0 function0, String str2, String str3) {
        if (LIZIZ == null) {
            LIZIZ = new C20498815Ja("SleepHourMusicManager");
        }
        if (LJFF.containsKey(str)) {
            C23250099c.LIZLLL((InterfaceC497601wk) LJ.getValue(), null, null, new C05OE(str, function0, null), 3);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C15535066j(str2, str, str3, 0.2f, new AwS151S1100000_2(str, (String) function0, (Function0<Unit>) 20), null), 3);
        }
    }
}
