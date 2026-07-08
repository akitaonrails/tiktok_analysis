package X;

import Y.ACallableS57S1100000_2;

/* JADX INFO: renamed from: X.0Zd9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903930Zd9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public final C903940ZdA LIZ = new InterfaceC21373818ki() { // from class: X.0ZdA
        public final InterfaceC876950Yaj LIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);

        @Override // X.InterfaceC21373818ki
        public final C866530Xz1 LIZ(String str) {
            return C0YNP.LIZIZ(str);
        }

        @Override // X.InterfaceC21373818ki
        public final C11LF LIZIZ(String str) {
            return AbstractC19483511Kn.LJIIJJI(new ACallableS57S1100000_2(this.LIZ, str, 5));
        }

        @Override // X.InterfaceC21373818ki
        public final boolean LIZJ(String str) {
            C874850YTr c874850YTr = InterfaceC874840YTq.LIZ;
            C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
            c874850YTr.getClass();
            return ((C0YNW) C0YUC.LIZ(c0ym2)).LJI.LIZJ(str);
        }

        @Override // X.InterfaceC21373818ki
        public final C11LF LIZLLL(String str) {
            return AbstractC19483511Kn.LJIIJJI(new ACallableS57S1100000_2(this.LIZ, str, 6));
        }

        @Override // X.InterfaceC21373818ki
        public final C11KS LJ(String str) {
            return AbstractC19484711Kz.LJII(new C1266100j3I(this.LIZ, str, 1));
        }

        @Override // X.InterfaceC21373818ki
        public final void LJFF(String str) {
            this.LIZ.LJFF(str);
        }
    };
    public volatile C21373518kf LIZIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C903930Zd9.class, "repo", "getRepo()Lcom/ss/android/ugc/aweme/im/messagelist/api/data/ConversationRepository;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C21373518kf LIZ() {
        C21373518kf c21373518kf = this.LIZIZ;
        if (c21373518kf == null) {
            synchronized (this) {
                c21373518kf = this.LIZIZ;
                if (c21373518kf == null) {
                    C21373518kf c21373518kf2 = new C21373518kf(this.LIZ);
                    this.LIZIZ = c21373518kf2;
                    return c21373518kf2;
                }
            }
        }
        return c21373518kf;
    }
}
