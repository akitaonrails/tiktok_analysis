package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeEntranceService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0rwj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607990rwj implements InterfaceC594490NTj {
    public C597250Nbf LIZ;
    public boolean LIZIZ;
    public final /* synthetic */ C1607980rwi LIZJ;

    public C1607990rwj(C1607980rwi c1607980rwi) {
        this.LIZJ = c1607980rwi;
    }

    public static String LIZLLL(List list) {
        if (list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C912500Zqy) obj).LIZ == null) {
                arrayList.add(obj);
            }
        }
        return C13LP.LJJLIIIJ(arrayList, ",", e3.e, e3.f, 0, null, AFwS264S0000000_24.get$arr$(58), 24);
    }

    @Override // X.InterfaceC594490NTj
    public final void LIZ(C597250Nbf c597250Nbf) {
        String aid;
        this.LIZ = c597250Nbf;
        if (c597250Nbf.LIZ.isEmpty()) {
            this.LIZJ.LLJJ.clear();
            InterfaceC1209780haS interfaceC1209780haS = this.LIZJ.LLJILLL;
            if (interfaceC1209780haS != null) {
                interfaceC1209780haS.LLJJJIL(new ArrayList(), c597250Nbf.LIZIZ);
            }
            this.LIZIZ = false;
            return;
        }
        this.LIZJ.getClass();
        if (c597250Nbf.LIZ.size() == 1) {
            Aweme aweme = ((C912500Zqy) ListProtector.get(c597250Nbf.LIZ, 0)).LIZ;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid, "invalid_aid")) {
                this.LIZJ.LJ(null);
                return;
            }
        }
        this.LIZJ.getClass();
        if (C1607980rwi.LIZ(c597250Nbf)) {
            C1607980rwi c1607980rwi = this.LIZJ;
            List<C912500Zqy> list = c597250Nbf.LIZ;
            ArrayList arrayList = new ArrayList();
            Iterator<C912500Zqy> it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme2 = it2.next().LIZ;
                if (aweme2 != null) {
                    arrayList.add(aweme2);
                }
            }
            c1607980rwi.LJ(arrayList);
            return;
        }
        this.LIZJ.LIZIZ().LIZJ(LIZLLL(c597250Nbf.LIZ), "", c597250Nbf.LIZJ);
    }

    @Override // X.InterfaceC594490NTj
    public final void LIZIZ(C597250Nbf c597250Nbf) {
        LJ(c597250Nbf);
        if (c597250Nbf.LIZ.isEmpty()) {
            C1607980rwi c1607980rwi = this.LIZJ;
            InterfaceC1209780haS interfaceC1209780haS = c1607980rwi.LLJILLL;
            if (interfaceC1209780haS != null) {
                interfaceC1209780haS.mE(c1607980rwi.LLJJ, c597250Nbf.LIZIZ);
            }
            this.LIZIZ = false;
        }
    }

    @Override // X.InterfaceC594490NTj
    public final void LIZJ(C597250Nbf c597250Nbf) {
        IVibeEntranceService iVibeEntranceServiceLIZ;
        Aweme awemeLJIILL;
        LJ(c597250Nbf);
        if (c597250Nbf.LIZ.isEmpty()) {
            if (C1576040r7C.LIZ() && this.LIZJ.LL.LIZ()) {
                List<Aweme> list = this.LIZJ.LLJJ;
                if ((list instanceof Collection) && list.isEmpty()) {
                    iVibeEntranceServiceLIZ = C1557990qe5.LIZ();
                    if (iVibeEntranceServiceLIZ != null) {
                        this.LIZJ.LLJJ.add(awemeLJIILL);
                    }
                } else {
                    for (Aweme aweme : list) {
                        if (C1575980r76.LJFF(aweme) || C1575980r76.LJ(aweme) || (aweme != null && C1575980r76.LJI(aweme.getAid()) && aweme.getAwemeType() == 333)) {
                            break;
                        }
                    }
                    iVibeEntranceServiceLIZ = C1557990qe5.LIZ();
                    if (iVibeEntranceServiceLIZ != null && (awemeLJIILL = iVibeEntranceServiceLIZ.LJIILL(this.LIZJ.LLILLJJLI)) != null) {
                        this.LIZJ.LLJJ.add(awemeLJIILL);
                    }
                }
            }
            C1607980rwi c1607980rwi = this.LIZJ;
            InterfaceC1209780haS interfaceC1209780haS = c1607980rwi.LLJILLL;
            if (interfaceC1209780haS != null) {
                interfaceC1209780haS.Pj(c1607980rwi.LLJJ, c597250Nbf.LIZIZ);
            }
            if (this.LIZJ.LL.LJFF() && C300800Bqg.LIZ()) {
                C1607980rwi c1607980rwi2 = this.LIZJ;
                if (c1607980rwi2.LLIZLLLIL && c1607980rwi2.LJI()) {
                    C1607980rwi c1607980rwi3 = this.LIZJ;
                    c1607980rwi3.LLIZLLLIL = false;
                    c1607980rwi3.LLILZ = true;
                    c1607980rwi3.LLILLL = 2;
                    InterfaceC1209780haS interfaceC1209780haS2 = c1607980rwi3.LLJILLL;
                    if (interfaceC1209780haS2 != null) {
                        interfaceC1209780haS2.zK();
                    }
                    C1607980rwi c1607980rwi4 = this.LIZJ;
                    c1607980rwi4.LL.LIZIZ(c1607980rwi4.LLIZ, true);
                    return;
                }
            }
            this.LIZIZ = false;
        }
    }

    public final void LJ(C597250Nbf c597250Nbf) {
        this.LIZ = c597250Nbf;
        this.LIZJ.getClass();
        if (C1607980rwi.LIZ(c597250Nbf) && (!c597250Nbf.LIZ.isEmpty())) {
            C1607980rwi c1607980rwi = this.LIZJ;
            List<C912500Zqy> list = c597250Nbf.LIZ;
            ArrayList arrayList = new ArrayList();
            Iterator<C912500Zqy> it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme = it2.next().LIZ;
                if (aweme != null) {
                    arrayList.add(aweme);
                }
            }
            c1607980rwi.LJ(arrayList);
            return;
        }
        if (c597250Nbf.LIZ.isEmpty()) {
            C1607980rwi c1607980rwi2 = this.LIZJ;
            InterfaceC1209780haS interfaceC1209780haS = c1607980rwi2.LLJILLL;
            if (interfaceC1209780haS != null) {
                interfaceC1209780haS.Uh(c1607980rwi2.LLILZ);
            }
            this.LIZJ.LLILZ = false;
            this.LIZIZ = false;
            return;
        }
        this.LIZJ.LIZIZ().LIZJ(LIZLLL(c597250Nbf.LIZ), "", c597250Nbf.LIZJ);
    }
}
