package X;

import com.bytedance.android.livesdkapi.host.IHostUser;

/* JADX INFO: renamed from: X.1Azr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2197731Azr {
    public static final C1232850iBf LIZ;
    public static final C1232850iBf LIZIZ;
    public static final C1232850iBf LIZJ;
    public static final C1232850iBf LIZLLL;
    public static final C1232850iBf LJ;
    public static final C1232850iBf LJFF;
    public static final C1232850iBf LJI;
    public static final C1232850iBf LJII;
    public static final C1232850iBf LJIIIIZZ;
    public static final C1232850iBf LJIIIZ;
    public static final C1232850iBf LJIIJ;
    public static final C1232850iBf LJIIJJI;
    public static final C1232850iBf LJIIL;
    public static final C1232850iBf LJIILIIL;
    public static final C1232850iBf LJIILJJIL;
    public static final C1232850iBf LJIILL;
    public static final C1232850iBf LJIILLIIL;
    public static final C1232850iBf LJIIZILJ;
    public static final C1232850iBf LJIJ;
    public static final C1232850iBf LJIJI;
    public static final C1232850iBf LJIJJ;
    public static final C1232850iBf LJIJJLI;
    public static final C1232850iBf LJIL;
    public static final C1232850iBf LJJ;
    public static final C1232850iBf LJJI;
    public static final C1232850iBf LJJIFFI;
    public static final C1232850iBf LJJII;
    public static final C1232850iBf LJJIII;
    public static final C1232850iBf LJJIIJ;
    public static final C1232850iBf LJJIIJZLJL;
    public static final C1232850iBf LJJIIZ;
    public static final C1232850iBf LJJIIZI;
    public static final C1232850iBf LJJIJ;
    public static final C1232850iBf LJJIJIIJI;

    static {
        EnumC1236600iHi enumC1236600iHi = EnumC1236600iHi.IAP;
        EnumC21632119lH enumC21632119lH = EnumC21632119lH.TTOP;
        EnumC19415410xc enumC19415410xc = EnumC19415410xc.MOBILE;
        LIZ = new C1232850iBf(0, "", null, null, null, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LIZIZ = new C1232850iBf(0, "", null, null, null, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LIZJ = new C1232850iBf(0, "", null, null, null, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LIZLLL = new C1232850iBf(0, "", null, null, null, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJ = new C1232850iBf(0, "", null, null, null, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJFF = new C1232850iBf(0, "", null, null, null, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJI = new C1232850iBf(0, "", null, null, null, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJII = new C1232850iBf(0, "", null, null, null, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJIIIIZZ = new C1232850iBf(0, "", null, null, null, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJIIIZ = new C1232850iBf(0, "", null, null, null, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        EnumC21632119lH enumC21632119lH2 = EnumC21632119lH.USER;
        LJIIJ = new C1232850iBf(30001, "[User] Purchase cancel.", null, null, null, enumC1236600iHi, enumC21632119lH2, enumC19415410xc);
        LJIIJJI = new C1232850iBf(30002, "[User] Purchase pending, user choose offline pay.", null, null, null, enumC1236600iHi, enumC21632119lH2, enumC19415410xc);
        LJIIL = new C1232850iBf(30003, "[User] Cancel payment and close panel.", null, null, null, enumC1236600iHi, enumC21632119lH2, enumC19415410xc);
        EnumC21632119lH enumC21632119lH3 = EnumC21632119lH.MP;
        LJIILIIL = new C1232850iBf(13000, "[User] Store connection failure. Please check your Google play account, network and try again.", null, null, "Please check your Google play account, network and try again.", enumC1236600iHi, enumC21632119lH3, enumC19415410xc);
        LJIILJJIL = new C1232850iBf(13001, "[User] Connection with channel time out. Please check your Google play account, network and try again.", null, null, "Please check your Google play account, network and try again.", enumC1236600iHi, enumC21632119lH3, enumC19415410xc);
        LJIILL = new C1232850iBf(13002, "[User] Device cannot make payment. App store not installed or device is jailbroken.", null, null, "Please check your Google play account, network and try again.", enumC1236600iHi, enumC21632119lH3, enumC19415410xc);
        LJIILLIIL = new C1232850iBf(13003, "[User] Check env fail. Please check your Google play account, network and try again.", null, null, "Please check your Google play account, network and try again.", enumC1236600iHi, enumC21632119lH3, enumC19415410xc);
        LJIIZILJ = new C1232850iBf(13013, "[MP] Purchase fail.", null, null, null, enumC1236600iHi, enumC21632119lH3, enumC19415410xc);
        LJIJ = new C1232850iBf(13014, "[Third Party] Query order fail with the order id. Please check your trade order id or contact support.", null, null, null, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJIJI = new C1232850iBf(20000, "[Server] Network error when getting tier info. Please check your network and try again.", 20001, "network error, get tier info failed", "Please check your network settings and try again.", enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJIJJ = new C1232850iBf(20000, "[Server] Network error when creating trade order. Please check your network and try again.", 20002, "network error, create trade order failed", "Please check your network settings and try again.", enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJIJJLI = new C1232850iBf(20000, "[Server] Network error when querying trade order. Please check your network and try again.", 20012, "network error, query trade order order failed", "Please check your network settings and try again.", enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJIL = new C1232850iBf(20000, "[Server] Network error when fetching balance. Please check your network and try again.", 20013, "network error, check balance failed", "Please check your network settings and try again.", enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJJ = new C1232850iBf(20000, "[Server] Network error when getting recommended tier. Please check your network and try again.", Integer.valueOf(IHostUser.MESSAGE_NICKNAME_DUPLICATE), "network error, get recommend tier failed", "Please check your network settings and try again.", enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJJI = new C1232850iBf(20000, "[Server] Network error when paying beans. Please check your network and try again.", 20015, "network error, pay beans failed", "Please check your network settings and try again.", enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJJIFFI = new C1232850iBf(20000, "[Server] Network error when getting subscription list. Please check your network and try again.", 20021, "network error, fetch subscription list failed", "Please check your network settings and try again.", enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJJII = new C1232850iBf(20000, "[Server] Network error when canceling subscription. Please check your network and try again.", 20022, "network error, cancel subscription failed", "Please check your network settings and try again.", enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        EnumC19415410xc enumC19415410xc2 = EnumC19415410xc.SERVER;
        LJJIII = new C1232850iBf(0, "", null, null, null, enumC1236600iHi, enumC21632119lH, enumC19415410xc2);
        LJJIIJ = new C1232850iBf(50000, "[Server] Empty tier info. Please check your tier id or trade order id and try again.", 50001, "invalid tier info", null, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJJIIJZLJL = new C1232850iBf(50000, "[Client] Pay sheet initial fail. Please contact support.", 50002, "show sheet failed", null, enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJJIIZ = new C1232850iBf(50000, "[User] Please check if the TikTok service is available in the region of your Google play account or contact support.", 50003, "get product detail failed", "Please check your Google play account, network and try again", enumC1236600iHi, enumC21632119lH3, enumC19415410xc);
        LJJIIZI = new C1232850iBf(50000, "[Client] Query recharge order result time out. Please relaunch the minis.", 50004, "query recharge order timeout", "Query recharge order result time out, please relaunch the minis.", enumC1236600iHi, enumC21632119lH, enumC19415410xc2);
        LJJIJ = new C1232850iBf(50000, "[Client] Invalid trade order detail info. Please check your trade order id and try again or contact support.", 50005, "invalid trade order detail info", "Something went wrong. Try again later.", enumC1236600iHi, enumC21632119lH, enumC19415410xc);
        LJJIJIIJI = new C1232850iBf(50000, "[Server] Fail to call API. Please check your network settings and contact support.", 50007, "invalid status code", "Something went wrong. Try again later.", enumC1236600iHi, enumC21632119lH, enumC19415410xc);
    }
}
