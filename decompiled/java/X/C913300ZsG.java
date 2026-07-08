package X;

import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0ZsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913300ZsG {
    public static final C913300ZsG LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final InterfaceC1731706qJ LIZJ;
    public static final InterfaceC1731706qJ LIZLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C913300ZsG.class, "isEnabled", "isEnabled()Z", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C913300ZsG.class, "isNav2EdgeEnabled", "isNav2EdgeEnabled()Z", 0);
        c09r3.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LIZ = new C913300ZsG();
        LIZJ = C20629615ny.LIZ(AFwS190S0000000_4.get$arr$(4553));
        LIZLLL = C20629615ny.LIZ(AFwS201S0000000_14.get$arr$(485));
    }

    public final boolean LIZ() {
        return ((Boolean) LIZJ.getValue(this, LIZIZ[0])).booleanValue();
    }

    public final boolean LIZIZ() {
        return ((Boolean) LIZLLL.getValue(this, LIZIZ[1])).booleanValue();
    }
}
