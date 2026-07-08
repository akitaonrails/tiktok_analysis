package X;

import com.google.gson.n;

/* JADX INFO: renamed from: X.0PFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641800PFi {
    public static final C641800PFi LIZ = new C641800PFi();

    public static final void LIZ(int i, String str, long j, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("search_id", str);
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "return_strategy");
        n nVar = new n();
        for (String str3 : C644560PPy.LJI()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                nVar.LJJIIJ(String.valueOf(i2), str3);
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        c2344009Gk.LJ(nVar, "show_list");
        c2344009Gk.LIZLLL(Math.max(0L, j), "duration");
        if (str2 != null) {
            c2344009Gk.LJFF("token_type", str2);
        }
        c2344009Gk.LJFF("local_service_intent", ((C639820P7s) C0Q3E.LJI().Wa0().LIZJ()).LLILLL);
        C20684815ws.LJIILLIIL("search_tabs_show", c2344009Gk.LIZ);
    }
}
