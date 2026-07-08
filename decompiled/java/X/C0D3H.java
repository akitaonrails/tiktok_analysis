package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D3H, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3H implements Serializable {
    public static final C0D3H CAROUSEL;
    public static final /* synthetic */ C0D3H[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0D3H PLACEHOLDER;
    public static final C0D3H SINGLE_IMAGE;

    public static InterfaceC2044707zh<C0D3H> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0D3H c0d3h = new C0D3H("CAROUSEL", 0);
        CAROUSEL = c0d3h;
        C0D3H c0d3h2 = new C0D3H("SINGLE_IMAGE", 1);
        SINGLE_IMAGE = c0d3h2;
        C0D3H c0d3h3 = new C0D3H("PLACEHOLDER", 2);
        PLACEHOLDER = c0d3h3;
        C0D3H[] c0d3hArr = {c0d3h, c0d3h2, c0d3h3};
        LL = c0d3hArr;
        LLILLJJLI = new C2254308sP(c0d3hArr);
    }

    public static C0D3H[] values() {
        return (C0D3H[]) LL.clone();
    }

    public static C0D3H valueOf(String str) {
        return (C0D3H) C08FF.LIZ(C0D3H.class, str);
    }

    public C0D3H(String str, int i) {
    }
}
