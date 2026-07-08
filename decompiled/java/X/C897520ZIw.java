package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897520ZIw implements InterfaceC897330ZId {
    public static final Set<EnumC1910450zoZ> LJFF = C13LQ.LJLIIL(new EnumC1910450zoZ[]{EnumC1910450zoZ.INBOX_SKYLIGHT_STORY, EnumC1910450zoZ.INBOX_SKYLIGHT, EnumC1910450zoZ.INBOX_CHAT_CELL, EnumC1910450zoZ.PROFILE_OTHER_FEED, EnumC1910450zoZ.MENTION_PANEL});
    public static final C823170WQx<String> LJI = new C823170WQx<>();
    public final EnumC1910450zoZ LIZ;
    public final InterfaceC897380ZIi LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public AnonymousClass0956 LJ;

    public C897520ZIw() {
        throw null;
    }

    public final InterfaceC897330ZId LIZJ() {
        return (InterfaceC897330ZId) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC897330ZId
    public final String LIZ() {
        String strLIZ;
        InterfaceC897330ZId interfaceC897330ZIdLIZJ = LIZJ();
        return (interfaceC897330ZIdLIZJ == null || (strLIZ = interfaceC897330ZIdLIZJ.LIZ()) == null) ? "" : strLIZ;
    }

    @Override // X.InterfaceC897330ZId
    public final Map<String, C595660NXw> LIZLLL() {
        Map<String, C595660NXw> mapLIZLLL;
        InterfaceC897330ZId interfaceC897330ZIdLIZJ = LIZJ();
        return (interfaceC897330ZIdLIZJ == null || (mapLIZLLL = interfaceC897330ZIdLIZJ.LIZLLL()) == null) ? C2097608Jq.LJ() : mapLIZLLL;
    }

    @Override // X.InterfaceC897330ZId
    public final void LJ() {
        boolean zLJI = MethodIDManager.LJI(196713);
        InterfaceC897330ZId interfaceC897330ZIdLIZJ = LIZJ();
        if (interfaceC897330ZIdLIZJ != null) {
            interfaceC897330ZIdLIZJ.LJ();
        }
        LJI.add(toString());
        int i = C595800NYk.LIZ().observeUserUpdateStrategy;
        if (i != 1 ? i == 2 || 0 != 0 : this.LIZ == EnumC1910450zoZ.INBOX_CHAT_CELL) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            C897370ZIh.LIZ().LJIILIIL();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC897330ZId
    public final void LJI() {
        InterfaceC897330ZId interfaceC897330ZIdLIZJ = LIZJ();
        if (interfaceC897330ZIdLIZJ != null) {
            interfaceC897330ZIdLIZJ.LJI();
        }
    }

    @Override // X.InterfaceC897330ZId
    public final void LJII() {
        InterfaceC897330ZId interfaceC897330ZIdLIZJ = LIZJ();
        if (interfaceC897330ZIdLIZJ != null) {
            interfaceC897330ZIdLIZJ.LJII();
        }
        LJIIL();
    }

    public final void LJIIL() {
        String string = toString();
        LJI.remove(string);
        int i = C595800NYk.LIZ().observeUserUpdateStrategy;
        if (!r1.isEmpty()) {
            return;
        }
        if (i == 1) {
            if (this.LIZ != EnumC1910450zoZ.INBOX_CHAT_CELL) {
                return;
            }
        } else if (i != 2 && 0 == 0) {
            return;
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIIL();
    }

    @Override // X.InterfaceC897330ZId
    public final void destroy() {
        InterfaceC897330ZId interfaceC897330ZIdLIZJ = LIZJ();
        if (interfaceC897330ZIdLIZJ != null) {
            interfaceC897330ZIdLIZJ.destroy();
        }
        C2296808zG.LIZJ((InterfaceC497601wk) this.LIZLLL.getValue(), null);
        LJIIL();
    }

    @Override // X.InterfaceC897330ZId
    public final void LJFF(List<? extends AbstractC595720NYc> list) {
        InterfaceC897330ZId interfaceC897330ZIdLIZJ = LIZJ();
        if (interfaceC897330ZIdLIZJ != null) {
            interfaceC897330ZIdLIZJ.LJFF(list);
        }
    }

    @Override // X.InterfaceC897330ZId
    public final void LJIIIIZZ(List<? extends AbstractC595720NYc> list) {
        InterfaceC897330ZId interfaceC897330ZIdLIZJ = LIZJ();
        if (interfaceC897330ZIdLIZJ != null) {
            interfaceC897330ZIdLIZJ.LJIIIIZZ(list);
        }
    }

    @Override // X.InterfaceC897330ZId
    public final void LJIIIZ(List<String> list) {
        InterfaceC897330ZId interfaceC897330ZIdLIZJ = LIZJ();
        if (interfaceC897330ZIdLIZJ != null) {
            interfaceC897330ZIdLIZJ.LJIIIZ(list);
        }
    }

    @Override // X.InterfaceC897330ZId
    public final void LJIIJ(C0NYY c0nyy) {
        InterfaceC897330ZId interfaceC897330ZIdLIZJ = LIZJ();
        if (interfaceC897330ZIdLIZJ != null) {
            interfaceC897330ZIdLIZJ.LJIIJ(c0nyy);
        }
    }

    public final void LJIIJJI(Function1<? super InterfaceC1364105Vn<? super List<? extends AbstractC595720NYc>>, ? extends Object> function1) {
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJ = C23250099c.LIZLLL((InterfaceC497601wk) this.LIZLLL.getValue(), null, null, new C598530Ndj(function1, this, null), 3);
    }

    public C897520ZIw(EnumC1910450zoZ enumC1910450zoZ, boolean z) {
        InterfaceC897380ZIi.LIZIZ.getClass();
        InterfaceC897380ZIi interfaceC897380ZIiLIZ = C897370ZIh.LIZ();
        C054N c054n = new C054N();
        this.LIZ = enumC1910450zoZ;
        this.LIZIZ = interfaceC897380ZIiLIZ;
        this.LIZJ = C452501pT.LIZIZ(new C897530ZIx(this, z, c054n));
        this.LIZLLL = C452501pT.LIZIZ(new C05MW());
    }

    @Override // X.InterfaceC897330ZId
    public final void LIZIZ(boolean z, C0NYY c0nyy) {
        InterfaceC897330ZId interfaceC897330ZIdLIZJ = LIZJ();
        if (interfaceC897330ZIdLIZJ != null) {
            interfaceC897330ZIdLIZJ.LIZIZ(z, c0nyy);
        }
    }
}
