package X;

/* JADX INFO: renamed from: X.17sW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21167417sW extends AbstractC2255721DQs<InterfaceC21167517sX> implements InterfaceC21167517sX, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public final InterfaceC21167517sX LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C18UJ.class, null);
    public final C21167617sY LLILZ;
    public final C21167617sY LLILZIL;
    public final C21167617sY LLILZLL;
    public final C21167617sY LLIZ;
    public volatile C21167217sU LLIZLLLIL;
    public volatile C21166917sR LLJ;
    public volatile C21166717sP LLJI;
    public volatile C21167317sV LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C21167417sW.class, "chatSession", "getChatSession()Lcom/ss/android/ugc/tools/chat/room/model/ChatSession;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C21167417sW.class, "saveDraftUseCase", "getSaveDraftUseCase()Lcom/ss/android/ugc/aweme/im/input/draft/SaveDraftUseCase;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C21167417sW.class, "getDraftUseCase", "getGetDraftUseCase()Lcom/ss/android/ugc/aweme/im/input/draft/GetDraftUseCase;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C21167417sW.class, "deleteDraftUseCase", "getDeleteDraftUseCase()Lcom/ss/android/ugc/aweme/im/input/draft/DeleteDraftUseCase;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C21167417sW.class, "draftMapper", "getDraftMapper()Lcom/ss/android/ugc/tools/chat/input/model/AiChatDraftMapper;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJILJILJ = 8;
    }

    private final C18UJ X1() {
        return (C18UJ) this.LLILLL.getValue(this, LLJILJIL[0]);
    }

    public final C21166917sR G2() {
        C21166917sR c21166917sR = this.LLJ;
        if (c21166917sR == null) {
            synchronized (this) {
                c21166917sR = this.LLJ;
                if (c21166917sR == null) {
                    C21166917sR c21166917sR2 = new C21166917sR(Z1());
                    this.LLJ = c21166917sR2;
                    return c21166917sR2;
                }
            }
        }
        return c21166917sR;
    }

    public final C21167217sU H2() {
        C21167217sU c21167217sU = this.LLIZLLLIL;
        if (c21167217sU == null) {
            synchronized (this) {
                c21167217sU = this.LLIZLLLIL;
                if (c21167217sU == null) {
                    C21167217sU c21167217sU2 = new C21167217sU(Z1());
                    this.LLIZLLLIL = c21167217sU2;
                    return c21167217sU2;
                }
            }
        }
        return c21167217sU;
    }

    public final C21166717sP o2() {
        C21166717sP c21166717sP = this.LLJI;
        if (c21166717sP == null) {
            synchronized (this) {
                c21166717sP = this.LLJI;
                if (c21166717sP == null) {
                    C21166717sP c21166717sP2 = new C21166717sP(Z1());
                    this.LLJI = c21166717sP2;
                    return c21166717sP2;
                }
            }
        }
        return c21166717sP;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.17sV] */
    public final C21167317sV w2() {
        C21167317sV c21167317sV = this.LLJIJIL;
        if (c21167317sV == null) {
            synchronized (this) {
                c21167317sV = this.LLJIJIL;
                if (c21167317sV == null) {
                    ?? r0 = new Object() { // from class: X.17sV
                    };
                    this.LLJIJIL = r0;
                    return r0;
                }
            }
        }
        return c21167317sV;
    }

    public final AbstractC879060Ye8 Z1() {
        return C0YNP.LIZIZ(X1().LIZLLL);
    }

    public InterfaceC21167517sX W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C21167417sW(C1DRG c1drg) {
        this.LL = c1drg;
        C21167617sY c21167617sY = C21167617sY.LIZ;
        this.LLILZ = c21167617sY;
        this.LLILZIL = c21167617sY;
        this.LLILZLL = c21167617sY;
        this.LLIZ = c21167617sY;
    }

    @Override // X.InterfaceC21167517sX
    public Object W22(InterfaceC1364105Vn<? super C21167117sT> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C21166817sQ(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    @Override // X.InterfaceC21167517sX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EE0(java.util.List<X.C21295818Vo> r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            boolean r0 = r7.isEmpty()
            r5 = 2
            r4 = 0
            if (r0 == 0) goto L27
            if (r8 == 0) goto L10
            int r0 = r8.length()
            if (r0 != 0) goto L2b
        L10:
            if (r9 == 0) goto L18
            int r0 = r9.length()
            if (r0 != 0) goto L27
        L18:
            androidx.lifecycle.LifecycleCoroutineScope r2 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r6)
            X.1DFB r1 = X.C0PEM.LIZJ
            X.17sO r0 = new X.17sO
            r0.<init>(r6, r4)
            X.C23250099c.LIZLLL(r2, r1, r4, r0, r5)
            return
        L27:
            if (r8 != 0) goto L2b
            java.lang.String r8 = ""
        L2b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r7, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r7.iterator()
        L3a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r1.next()
            X.18Vo r0 = (X.C21295818Vo) r0
            java.lang.String r0 = r0.LIZIZ
            r2.add(r0)
            goto L3a
        L4c:
            X.17tA r3 = new X.17tA
            r3.<init>(r8, r2, r9)
            androidx.lifecycle.LifecycleCoroutineScope r2 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r6)
            X.1DFB r1 = X.C0PEM.LIZJ
            X.17sS r0 = new X.17sS
            r0.<init>(r3, r6, r4)
            X.C23250099c.LIZLLL(r2, r1, r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21167417sW.EE0(java.util.List, java.lang.String, java.lang.String):void");
    }
}
