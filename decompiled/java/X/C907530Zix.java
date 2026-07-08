package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlinx.coroutines.flow.b;

/* JADX INFO: renamed from: X.0Zix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C907530Zix {
    public final C1231704rr LIZ;
    public final Keva LIZIZ;
    public final Function0<String> LIZJ;
    public final Function1<String, Unit> LIZLLL;
    public final Function1<InterfaceC1364105Vn<? super List<IMUserBaseInfo>>, Object> LJ;
    public final Function1<Long, Boolean> LJFF;
    public final Function1<IMUserBaseInfo, Boolean> LJI;
    public final Function1<IMUser, List<C907840ZjS>> LJII;
    public final Function1<C907790ZjN, Unit> LJIIIIZZ;
    public final Function1<IMUserBaseInfo, String> LJIIIZ;
    public final InterfaceC1631620sYq<List<C907840ZjS>, C907790ZjN, InterfaceC1364105Vn<? super Unit>, Object> LJIIJ;
    public final C01GW LJIIJJI;
    public final InterfaceC346201Wa<C597380Nbs> LJIIL;
    public boolean LJIILIIL;

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C907530Zix.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C907530Zix(InterfaceC497601wk interfaceC497601wk, InterfaceC907650Zj9 interfaceC907650Zj9) {
        C1231704rr c1231704rr = new C1231704rr("update_user", "search", 4);
        C1240410iNr c1240410iNr = C1240410iNr.LIZ;
        C1931107hN c1931107hN = new C1931107hN(c1240410iNr);
        EventLiveData<FollowStatus> relationObservable = C1076010e6h.LIZJ.LIZIZ().getRelationObservable();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("user_search_content_");
        sbLIZ.append(C461720I8s.LIZJ());
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(repo, 1488);
        AwS593S0100000_14 awS593S0100000_14 = new AwS593S0100000_14(repo, 289);
        IMContactApi.LIZ.getClass();
        C1725206pG c1725206pG = new C1725206pG(C069P.LIZ().LIZ());
        C460920I5q c460920I5q = new C460920I5q(C0W8I.LIZ);
        C1931207hO c1931207hO = new C1931207hO(c1240410iNr);
        C907450Zip c907450Zip = new C907450Zip(C907810ZjP.LIZ);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(477);
        C907800ZjO c907800ZjO = new C907800ZjO(C907520Ziw.LIZ);
        C907480Zis c907480Zis = new C907480Zis(awS593S0100000_14, awS558S0100000_14, interfaceC907650Zj9, c1231704rr, null);
        this.LIZ = c1231704rr;
        this.LIZIZ = repo;
        this.LIZJ = awS558S0100000_14;
        this.LIZLLL = awS593S0100000_14;
        this.LJ = c1725206pG;
        this.LJFF = c460920I5q;
        this.LJI = c1931207hO;
        this.LJII = c907450Zip;
        this.LJIIIIZZ = aFwS248S0000000_14;
        this.LJIIIZ = c907800ZjO;
        this.LJIIJ = c907480Zis;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(528));
        this.LJIIJJI = c01gwLIZIZ;
        b bVarLJ = C09IC.LJ(new C607350Nrx(relationObservable, c1931107hN, null));
        C1DFH c1dfh = C0PEM.LIZ;
        InterfaceC346201Wa<C597380Nbs> interfaceC346201WaLIZLLL = C09IC.LIZLLL(C09IC.LJIL(bVarLJ, C2107308Nj.LIZ), Integer.MAX_VALUE, 2);
        this.LJIIL = interfaceC346201WaLIZLLL;
        C09IC.LJJI(interfaceC497601wk, new C861640Xr8(new C597370Nbr(this, interfaceC907650Zj9, null), C09IC.LJJIFFI(C1697810uHb.LJIIJJI(c01gwLIZIZ.getValue(), interfaceC346201WaLIZLLL))));
    }
}
