package X;

/* JADX INFO: renamed from: X.0I35, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I35 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public final C0I36 LIZ = new C0I38() { // from class: X.0I36
        public final InterfaceC874680YTa LIZ = C0YNY.LIZ(InterfaceC874680YTa.LIZ);

        @Override // X.C0I38
        public final C869590Y9l LIZ(long j) {
            return this.LIZ.LJJJ(j);
        }

        @Override // X.C0I38
        public final C869590Y9l LIZIZ(long j, String str) {
            return this.LIZ.LJJIL(j, str);
        }
    };
    public volatile C0I37 LIZIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0I35.class, "repo", "getRepo()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/repository/ChatRepository;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0I37] */
    public final C0I37 LIZ() {
        C0I37 c0i37 = this.LIZIZ;
        if (c0i37 == null) {
            synchronized (this) {
                c0i37 = this.LIZIZ;
                if (c0i37 == null) {
                    final C0I36 c0i36 = this.LIZ;
                    ?? r0 = new C0I39(c0i36) { // from class: X.0I37
                        public final C0I38 LIZ;

                        {
                            this.LIZ = c0i36;
                        }

                        @Override // X.C0I39
                        public final C869590Y9l LIZ(long j) {
                            return this.LIZ.LIZ(j);
                        }

                        @Override // X.C0I39
                        public final C869590Y9l LIZIZ(long j, String str) {
                            return this.LIZ.LIZIZ(j, str);
                        }
                    };
                    this.LIZIZ = r0;
                    return r0;
                }
            }
        }
        return c0i37;
    }
}
