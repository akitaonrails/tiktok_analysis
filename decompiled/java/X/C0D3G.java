package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D3G, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3G implements Serializable {
    public static final C0D3G ACCEPT_ENRICHMENT;
    public static final /* synthetic */ C0D3G[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0D3G LOCKED;

    public static InterfaceC2044707zh<C0D3G> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0D3G c0d3g = new C0D3G("ACCEPT_ENRICHMENT", 0);
        ACCEPT_ENRICHMENT = c0d3g;
        C0D3G c0d3g2 = new C0D3G("LOCKED", 1);
        LOCKED = c0d3g2;
        C0D3G[] c0d3gArr = {c0d3g, c0d3g2};
        LL = c0d3gArr;
        LLILLJJLI = new C2254308sP(c0d3gArr);
    }

    public static C0D3G[] values() {
        return (C0D3G[]) LL.clone();
    }

    public static C0D3G valueOf(String str) {
        return (C0D3G) C08FF.LIZ(C0D3G.class, str);
    }

    public C0D3G(String str, int i) {
    }
}
