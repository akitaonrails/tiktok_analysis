package X;

/* JADX INFO: renamed from: X.0qZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1555410qZv extends C1554710qYn {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1555590qaD LLILZ;
    public final C01GW LLILZIL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C1555410qZv.class, "activityWeak", "getActivityWeak()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    @Override // X.C1554710qYn, X.InterfaceC665370Q7z
    public final Object getHost() {
        C1555590qaD c1555590qaD = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return c1555590qaD.LIZ.get();
    }

    @Override // X.C1554710qYn, X.InterfaceC665370Q7z
    public final C1554890qZ5 getTree() {
        return (C1554890qZ5) this.LLILZIL.getValue();
    }

    public C1555410qZv(C19EG c19eg, String str) {
        super(str);
        this.LLILZ = new C1555590qaD(new C1555420qZw(c19eg));
        this.LLILZIL = C452501pT.LIZIZ(new C1554730qYp(c19eg, this));
        C665410Q8d.LIZIZ(new C1555480qa2(c19eg, this));
    }
}
