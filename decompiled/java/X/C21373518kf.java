package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.18kf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21373518kf implements InterfaceC905060Zey {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZLLL;
    public final InterfaceC21373818ki LIZ;
    public final ConcurrentHashMap<String, AbstractC879060Ye8> LIZIZ = new ConcurrentHashMap<>();
    public volatile C1807760x8w LIZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C21373518kf.class, "conversationModelObservableProvider", "getConversationModelObservableProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/rx/ConversationModelObservableProvider;", 0);
        C13LE.LIZ.getClass();
        LIZLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C21373518kf(InterfaceC21373818ki interfaceC21373818ki) {
        this.LIZ = interfaceC21373818ki;
    }

    @Override // X.InterfaceC905060Zey
    public final C19491211Nm LIZ(final String str) {
        AbstractC879060Ye8 abstractC879060Ye8PutIfAbsent;
        ConcurrentHashMap<String, AbstractC879060Ye8> concurrentHashMap = this.LIZIZ;
        AbstractC879060Ye8 abstractC879060Ye8LIZ = concurrentHashMap.get(str);
        if (abstractC879060Ye8LIZ == null && (abstractC879060Ye8PutIfAbsent = concurrentHashMap.putIfAbsent(str, (abstractC879060Ye8LIZ = this.LIZ.LIZ(str)))) != null) {
            abstractC879060Ye8LIZ = abstractC879060Ye8PutIfAbsent;
        }
        final AbstractC879060Ye8 abstractC879060Ye8 = abstractC879060Ye8LIZ;
        if (this.LIZJ == null) {
            synchronized (this) {
                if (this.LIZJ == null) {
                    this.LIZJ = (C1807760x8w) C1807670x8n.LLLLLLIL();
                }
            }
        }
        return new C11NZ<AbstractC1702506lb>(abstractC879060Ye8) { // from class: X.06lr
            public final AbstractC879060Ye8 LL;

            {
                this.LL = abstractC879060Ye8;
            }

            @Override // X.C11NZ
            public final void LJJZZIII(InterfaceC626120Oh8<? super AbstractC1702506lb> interfaceC626120Oh8) {
                C1703506ll c1703506ll = new C1703506ll(this.LL, interfaceC626120Oh8);
                interfaceC626120Oh8.onSubscribe(c1703506ll);
                this.LL.LJIIJJI(c1703506ll);
            }
        }.LJJIIJ(new InterfaceC781210Ukh() { // from class: X.18kj
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                this.LIZ.LIZIZ.remove(str);
            }
        });
    }

    @Override // X.InterfaceC905060Zey
    public final AbstractC19483511Kn<C0Y8T> LIZIZ(String str) {
        return this.LIZ.LIZIZ(str);
    }

    @Override // X.InterfaceC905060Zey
    public final boolean LIZJ(String str) {
        return this.LIZ.LIZJ(str);
    }

    @Override // X.InterfaceC905060Zey
    public final C19482011Jy LIZLLL(final String str) {
        final C11LF c11lfLIZLLL = this.LIZ.LIZLLL(str);
        final C11KS c11ksLJ = this.LIZ.LJ(str);
        c11lfLIZLLL.getClass();
        C1701890uOB.LIZ(c11ksLJ, "other is null");
        return new AbstractC19484711Kz<T>(c11lfLIZLLL, c11ksLJ) { // from class: X.11IC
            public final C11ID<T> LL;
            public final InterfaceC19473011Gm<? extends T> LLILLJJLI;

            @Override // X.AbstractC19484711Kz
            public final void LJJIJ(InterfaceC19474811He<? super T> interfaceC19474811He) {
                this.LL.LIZ(new C11I6(interfaceC19474811He, this.LLILLJJLI));
            }

            {
                this.LL = c11lfLIZLLL;
                this.LLILLJJLI = c11ksLJ;
            }
        }.LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.18kg
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C0Y8T c0y8t = (C0Y8T) obj;
                if (c0y8t.isTemp()) {
                    return this.LL.LIZ.LJ(str);
                }
                return AbstractC19484711Kz.LJIJJLI(c0y8t);
            }
        }).LJIL(new InterfaceC1487280oo2() { // from class: X.18kh
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C0Y8T c0y8t = (C0Y8T) obj;
                this.LL.LIZ.LJFF(c0y8t.getConversationId());
                return c0y8t;
            }
        });
    }
}
