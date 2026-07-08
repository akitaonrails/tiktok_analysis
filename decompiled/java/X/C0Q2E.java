package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Q2E, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q2E {
    public static final C0Q2F Companion;
    public static final /* synthetic */ C0Q2E[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0Q2E LOADING;
    public static final C0Q2E PAUSE;
    public static final C0Q2E PLAY;
    public static final Map<Integer, C0Q2E> stateValueMap;
    public final int LL;

    public static InterfaceC2044707zh<C0Q2E> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Q2F] */
    static {
        C0Q2E c0q2e = new C0Q2E("PLAY", 0, 1);
        PLAY = c0q2e;
        C0Q2E c0q2e2 = new C0Q2E("PAUSE", 1, 2);
        PAUSE = c0q2e2;
        C0Q2E c0q2e3 = new C0Q2E("LOADING", 2, 3);
        LOADING = c0q2e3;
        C0Q2E[] c0q2eArr = {c0q2e, c0q2e2, c0q2e3};
        LLILLJJLI = c0q2eArr;
        LLILLL = new C2254308sP(c0q2eArr);
        Companion = new Object() { // from class: X.0Q2F
        };
        C0Q2E[] c0q2eArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(c0q2eArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (C0Q2E c0q2e4 : c0q2eArrValues) {
            linkedHashMap.put(Integer.valueOf(c0q2e4.LL), c0q2e4);
        }
        stateValueMap = linkedHashMap;
    }

    public static C0Q2E[] values() {
        return (C0Q2E[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0Q2E valueOf(String str) {
        return (C0Q2E) C08FF.LIZ(C0Q2E.class, str);
    }

    public C0Q2E(String str, int i, int i2) {
        this.LL = i2;
    }
}
