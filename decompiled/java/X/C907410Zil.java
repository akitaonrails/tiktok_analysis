package X;

import com.bytedance.keva.Keva;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0Zil, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907410Zil implements InterfaceC868380Y4u {
    public final InterfaceC497601wk LIZ;
    public final InterfaceC907650Zj9 LIZIZ;
    public final C0YI5 LIZJ;
    public final Keva LIZLLL;
    public final Function0<String> LJ;
    public final Function1<String, Unit> LJFF;
    public final C1231704rr LJI;
    public final Function1<C907790ZjN, Unit> LJII;
    public final AtomicBoolean LJIIIIZZ;
    public final C823170WQx<Long> LJIIIZ;

    @Override // X.InterfaceC868380Y4u
    @InterfaceC1294060jmO
    public final void LIZ(List<C0YAE> list) {
        C23250099c.LIZLLL(this.LIZ, C0PEM.LIZJ, null, new C907370Zih(list, this, null), 2);
    }

    public C907410Zil(InterfaceC497601wk interfaceC497601wk, InterfaceC907650Zj9 interfaceC907650Zj9) {
        C0YI5 c0yi5LIZ = C876340YZk.LIZ(C876340YZk.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update_group_member_search_content_");
        sbLIZ.append((Object) C461720I8s.LIZIZ());
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(repo, 1489);
        AwS593S0100000_14 awS593S0100000_14 = new AwS593S0100000_14(repo, 290);
        C1231704rr c1231704rr = new C1231704rr("update_group_member", "search", 4);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(476);
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = interfaceC907650Zj9;
        this.LIZJ = c0yi5LIZ;
        this.LIZLLL = repo;
        this.LJ = awS558S0100000_14;
        this.LJFF = awS593S0100000_14;
        this.LJI = c1231704rr;
        this.LJII = aFwS248S0000000_14;
        this.LJIIIIZZ = new AtomicBoolean(false);
        this.LJIIIZ = new C823170WQx<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<X.C0YAE> r22, X.InterfaceC1364105Vn<? super java.util.List<X.C907840ZjS>> r23) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C907410Zil.LIZIZ(java.util.List, X.05Vn):java.lang.Object");
    }
}
