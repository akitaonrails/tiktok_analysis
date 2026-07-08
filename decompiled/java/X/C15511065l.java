package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.065l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15511065l implements C0NY2, C1DW6, InterfaceC871940YIm {
    public final String LL;
    public final boolean LLILLJJLI;
    public final InterfaceC15512065m LLILLL;
    public final C05YC<List<C0NXK>> LLILZ;
    public final C1231704rr LLILZIL;
    public final InterfaceC497601wk LLILZLL;

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Jk(C869590Y9l c869590Y9l, int i) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void LLILZ(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Re(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
    }

    @Override // X.C1DW6
    public final void VD0(C1DW6 c1dw6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void gb(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mf(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void nc(List<? extends C869590Y9l> list) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void ns(String str) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void su(C869590Y9l c869590Y9l, boolean z) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void u6(List<C869590Y9l> list, boolean z) {
    }

    @Override // X.C1DW6
    public final void yf1(C1DW6 c1dw6) {
    }

    @Override // X.C0NY2
    public final boolean LIZIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.C0NY2
    public final C05YC LJ() {
        return this.LLILZ;
    }

    @Override // X.C0NY2
    public final String getName() {
        return this.LL;
    }

    public C15511065l(int i) {
        C876310YZh c876310YZhLIZIZ;
        String value = EnumC15513065n.COMPENSATION.getValue();
        IIMCoreProxyService iIMCoreProxyService = (IIMCoreProxyService) PluggableExtentionKt.pluggableSpi$default(IIMCoreProxyService.class, false, false, false, 14, null);
        if (iIMCoreProxyService != null) {
            c876310YZhLIZIZ = iIMCoreProxyService.LIZIZ(C0YM2.TIKTOK_SOCIAL_IM);
        } else {
            c876310YZhLIZIZ = null;
        }
        C1E8E c1e8e = C1E8E.LIZ;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        C1231704rr c1231704rr = new C1231704rr("ActivityStatusObservableImpl", null, 6);
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
        this.LL = value;
        this.LLILLJJLI = true;
        this.LLILLL = c1e8e;
        this.LLILZ = c2252331DDrLIZIZ;
        this.LLILZIL = c1231704rr;
        this.LLILZLL = c054gLIZ;
        if (c876310YZhLIZIZ != null) {
            c876310YZhLIZIZ.LIZ(this);
            c876310YZhLIZIZ.LIZ.LJIJI().LIZJ(this);
        }
    }

    public static boolean LIZJ(long j) {
        IMUser iMUserLJIIJ;
        ContactFeature contactFeatureLIZ;
        Integer numLJIIIIZZ;
        C06QG c06qg = ContactFeature.LIZ;
        ContactFeature contactFeatureLIZ2 = c06qg.LIZ();
        if (contactFeatureLIZ2 != null && (iMUserLJIIJ = contactFeatureLIZ2.LJIIJ(String.valueOf(j))) != null && (contactFeatureLIZ = c06qg.LIZ()) != null && (numLJIIIIZZ = contactFeatureLIZ.LJIIIIZZ(iMUserLJIIJ)) != null && numLJIIIIZZ.intValue() == 2) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(List<C0NXK> list) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (C0NXK c0nxk : list) {
            long j = jCurrentTimeMillis - (c0nxk.LIZIZ * 1000);
            if (j > 0 && j < this.LLILLL.LIZ()) {
                arrayList.add(c0nxk);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C15510065k(this, arrayList, null), 3);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        Integer numValueOf;
        C1231704rr c1231704rr = this.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGetMessage size ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" msgSource ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        C23250099c.LIZLLL(this.LLILZLL, null, null, new C15507065h(this, list, null), 3);
    }

    @Override // X.InterfaceC871940YIm
    public final void LIZ(String str, int i, Long l, Long l2, Long l3, C0YM0 c0ym0) {
        if (l != null) {
            l.longValue();
            if (l2 != null) {
                l2.longValue();
                C23250099c.LIZLLL(this.LLILZLL, null, null, new C15509065j(this, l, l2, null), 3);
            }
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
        if (c869590Y9l != null && l != null) {
            l.longValue();
            if (l2 != null) {
                l2.longValue();
                C23250099c.LIZLLL(this.LLILZLL, null, null, new C15508065i(this, c869590Y9l, l, l2, null), 3);
            }
        }
    }
}
