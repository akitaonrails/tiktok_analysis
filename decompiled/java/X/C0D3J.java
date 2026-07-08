package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D3J, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3J implements Serializable {
    public static final C0D3J FINAL_NO_IMAGE;
    public static final /* synthetic */ C0D3J[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0D3J LOADING;
    public static final C0D3J READY;

    public static InterfaceC2044707zh<C0D3J> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0D3J c0d3j = new C0D3J("LOADING", 0);
        LOADING = c0d3j;
        C0D3J c0d3j2 = new C0D3J("READY", 1);
        READY = c0d3j2;
        C0D3J c0d3j3 = new C0D3J("FINAL_NO_IMAGE", 2);
        FINAL_NO_IMAGE = c0d3j3;
        C0D3J[] c0d3jArr = {c0d3j, c0d3j2, c0d3j3};
        LL = c0d3jArr;
        LLILLJJLI = new C2254308sP(c0d3jArr);
    }

    public static C0D3J[] values() {
        return (C0D3J[]) LL.clone();
    }

    public static C0D3J valueOf(String str) {
        return (C0D3J) C08FF.LIZ(C0D3J.class, str);
    }

    public C0D3J(String str, int i) {
    }
}
