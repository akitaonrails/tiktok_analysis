package X;

/* JADX INFO: renamed from: X.12zy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19939612zy extends Exception {
    public static final long serialVersionUID = 5750205775490483148L;
    public final String LL;
    public final InterfaceC19930912yZ LLILLJJLI;
    public final String LLILLL;

    public String getDescription() {
        return this.LLILLL;
    }

    public InterfaceC19930912yZ getProblemProto() {
        return this.LLILLJJLI;
    }

    public String getProblemSymbolName() {
        return this.LL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19939612zy(AbstractC19939512zx abstractC19939512zx, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC19939512zx.LJII());
        sbLIZ.append(": ");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LL = abstractC19939512zx.LJII();
        this.LLILLJJLI = abstractC19939512zx.LJIILJJIL();
        this.LLILLL = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19939612zy(AnonymousClass1302 anonymousClass1302, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(anonymousClass1302.LJIIIZ());
        sbLIZ.append(": ");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LL = anonymousClass1302.LJIIIZ();
        this.LLILLJJLI = anonymousClass1302.LLILLJJLI;
        this.LLILLL = str;
    }

    public C19939612zy(AbstractC19939512zx abstractC19939512zx, String str, Throwable th) {
        this(abstractC19939512zx, str);
        initCause(th);
    }
}
