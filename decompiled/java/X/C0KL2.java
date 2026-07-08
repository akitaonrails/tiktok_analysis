package X;

import Y.AfS1S0300100_7;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KL2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KL2 {
    public final C0KLA LIZ;
    public C0KCK LIZIZ;
    public C0KLH LIZJ;
    public final C01GW LIZLLL = C292401Bi.LIZ(AFwS193S0000000_7.get$arr$(16));
    public final C0KL6 LJ = new C0KL6(this);

    public C0KL2(C0KLA c0kla) {
        this.LIZ = c0kla;
    }

    public final void LIZ(C0KLF c0klf, C0KCK c0kck, C0KLH c0klh) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZIZ = c0kck;
        this.LIZJ = c0klh;
        C11O8 c11o8LIZJ = this.LJ.LIZJ();
        if (c11o8LIZJ != null) {
            InterfaceC420801kM interfaceC420801kMLJJLL = c11o8LIZJ.LJJIIJ(new C521870KdN(c0klh, this, c0kck, 0)).LJJLL(new AfS1S0300100_7(jCurrentTimeMillis, c0kck, this, c0klf, 3), new AfS1S0300100_7(jCurrentTimeMillis, this, c0kck, c0klh, 4));
            if (C0K7G.LJI("live_click_exit_room_opt", 0) != 0 && Intrinsics.LJFF(this.LIZ.LIZLLL, "prefetch_sub")) {
                ((C11NJ) this.LIZLLL.getValue()).LIZ(interfaceC420801kMLJJLL);
            }
        }
    }

    public static C0KLL LIZIZ(C0KL2 c0kl2, long j, List list, Throwable th, int i) {
        int size;
        String str;
        TemplateInfo templateInfo;
        Integer numValueOf = null;
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        c0kl2.getClass();
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        String str2 = c0kl2.LIZ.LIZLLL;
        String str3 = "";
        if (list == null || (templateInfo = (TemplateInfo) C13LP.LJJJLL(list)) == null || (str = templateInfo.currency) == null) {
            str = "";
        }
        String str4 = C09OK.LIZ(null, th).LIZLLL;
        if (str4 != null) {
            str3 = str4;
        }
        if (th != null) {
            numValueOf = Integer.valueOf(C512310K7h.LIZIZ(th));
        }
        return new C0KLL(j, str2, size, str, numValueOf, str3, c0kl2.LIZ.LJIJ);
    }
}
