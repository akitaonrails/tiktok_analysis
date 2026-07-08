package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009O, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009O {
    public static final C009O COMPONENTRELEASE;
    public static final C009O COMPONENTUNMOUNT;
    public static final /* synthetic */ C009O[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C009O> getEntries() {
        return LLILLL;
    }

    static {
        C009O c009o = new C009O("COMPONENTRELEASE", 0, "when_component_release");
        COMPONENTRELEASE = c009o;
        C009O c009o2 = new C009O("COMPONENTUNMOUNT", 1, "when_component_unmount");
        COMPONENTUNMOUNT = c009o2;
        C009O[] c009oArr = {c009o, c009o2};
        LLILLJJLI = c009oArr;
        LLILLL = new C2254308sP(c009oArr);
    }

    public static C009O[] values() {
        return (C009O[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C009O valueOf(String str) {
        return (C009O) C08FF.LIZ(C009O.class, str);
    }

    public final boolean shouldReset(String str) {
        if (str != null) {
            return Intrinsics.LJFF(this.LL, str);
        }
        return false;
    }

    public C009O(String str, int i, String str2) {
        this.LL = str2;
    }
}
