package X;

/* JADX INFO: renamed from: X.09qM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2496409qM extends AbstractC2255721DQs<C05YF> implements C05YF, InterfaceC379610EuV, InterfaceC2495909qH {
    public static final C2496609qO LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final C05YF LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC525680KjW.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC525880Kjq.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final int LLILZLL = 100;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.09qO] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2496409qM.class, "albumNextStepApi", "getAlbumNextStepApi()Lcom/ss/android/ugc/aweme/shortvideo/album/nextstep/AlbumNextStepApi;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C2496409qM.class, "selectionDataApi", "getSelectionDataApi()Lcom/ss/android/ugc/aweme/shortvideo/album/selection/AlbumSelectionDataApi;", 0), new C2217381BqS(C2496409qM.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0)};
        LLIZ = new Object() { // from class: X.09qO
        };
        LLJ = 8;
    }

    private final InterfaceC525680KjW W1() {
        return (InterfaceC525680KjW) this.LLILLL.getValue(this, LLIZLLLIL[0]);
    }

    private final InterfaceC525880Kjq X1() {
        return (InterfaceC525880Kjq) this.LLILZ.getValue(this, LLIZLLLIL[1]);
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLILZIL.getValue(this, LLIZLLLIL[2]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        W1().pB1(this);
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC2495909qH
    public int getPriority() {
        return this.LLILZLL;
    }

    public C2496409qM(C1DRG c1drg) {
        this.LL = c1drg;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0072 -> B:20:0x0088). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC2495909qH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object LJLIIIL(X.C525700KjY r13, X.InterfaceC2495009q8 r14, X.InterfaceC1364105Vn<? super X.InterfaceC2499409qq> r15) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2496409qM.LJLIIIL(X.0KjY, X.09q8, X.05Vn):java.lang.Object");
    }
}
