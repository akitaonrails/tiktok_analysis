package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1559, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1559 implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final List<C155B> LLILLL = new ArrayList();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass1559.class, "params", "getParams()Lcom/ss/android/ugc/aweme/port/in/music/InitParams;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final C155H LIZ() {
        return (C155H) this.LLILLJJLI.getValue(this, LLILZ[0]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public AnonymousClass1559(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, C155H.class, null);
    }
}
