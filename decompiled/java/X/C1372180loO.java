package X;

import com.ss.android.ugc.aweme.share.SharePlatform;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0loO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372180loO implements Comparator<InterfaceC1369790lkX> {
    public final int LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    public final List<String> LIZ() {
        return (List) this.LLJ.getValue();
    }

    public final List<String> LIZIZ() {
        return (List) this.LLIZLLLIL.getValue();
    }

    public final List<String> LIZJ() {
        return (List) this.LLIZ.getValue();
    }

    public final int LIZLLL(InterfaceC1369790lkX interfaceC1369790lkX) {
        List list = (List) this.LLILZLL.getValue();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((SharePlatform) it2.next()).platformId);
        }
        return LJ(interfaceC1369790lkX, arrayList);
    }

    public C1372180loO(String str, int i) {
        str = (i & 2) != 0 ? "" : str;
        int i2 = i & 4;
        this.LL = 0;
        this.LLILLJJLI = str;
        this.LLILLL = false;
        this.LLILZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(797));
        this.LLILZIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(621));
        this.LLILZLL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(403));
        this.LLIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1319));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1608));
        this.LLJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1607));
        this.LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1609));
        new LinkedHashMap();
        this.LLJIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1606));
    }

    public static int LJ(InterfaceC1369790lkX interfaceC1369790lkX, List list) {
        if (list.contains(interfaceC1369790lkX.key())) {
            return list.indexOf(interfaceC1369790lkX.key());
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(X.InterfaceC1369790lkX r9, X.InterfaceC1369790lkX r10) {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1372180loO.compare(java.lang.Object, java.lang.Object):int");
    }
}
