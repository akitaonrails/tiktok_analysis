package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0tId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660010tId implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final Map<Pair<Integer, Integer>, List<C443120HZe<InterfaceC1659860tIO, InterfaceC1664980tQe<? extends InterfaceC1659860tIO, ? extends InterfaceC1461640o8g<? extends InterfaceC1659860tIO>>, InterfaceC1660130tIp<? extends InterfaceC1659860tIO>>>> LLILLL;
    public final C1698260uIK LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1660010tId.class, "configurationSource", "getConfigurationSource()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/tabs/TabConfigurationSource;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public C1660010tId(C1DRG c1drg) {
        this.LL = c1drg;
        C1664750tQH c1664750tQHLIZ = C1664770tQJ.LIZ(c1drg, C1657360tEM.class, null);
        this.LLILLJJLI = c1664750tQHLIZ;
        this.LLILLL = new LinkedHashMap();
        this.LLILZ = new C1698260uIK(((C1657360tEM) c1664750tQHLIZ.getValue(this, LLILZIL[0])).LLILZ, this, 6);
    }
}
