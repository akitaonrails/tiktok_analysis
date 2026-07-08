package X;

import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Np6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC605580Np6 {
    public static final EnumC605580Np6 CANCELLED;
    public static final C605650NpD Companion;
    public static final EnumC605580Np6 FAILED;
    public static final EnumC605580Np6 IDLE;
    public static final Set<EnumC605580Np6> LL;
    public static final /* synthetic */ EnumC605580Np6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC605580Np6 RUNNING;
    public static final EnumC605580Np6 SKIPPED;
    public static final EnumC605580Np6 SUCCESS;
    public static final EnumC605580Np6 TIMEOUT;
    public static final EnumC605580Np6 WAITING_ACTIVATION;

    public static InterfaceC2044707zh<EnumC605580Np6> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0NpD] */
    static {
        EnumC605580Np6 enumC605580Np6 = new EnumC605580Np6("IDLE", 0);
        IDLE = enumC605580Np6;
        EnumC605580Np6 enumC605580Np62 = new EnumC605580Np6("WAITING_ACTIVATION", 1);
        WAITING_ACTIVATION = enumC605580Np62;
        EnumC605580Np6 enumC605580Np63 = new EnumC605580Np6("RUNNING", 2);
        RUNNING = enumC605580Np63;
        EnumC605580Np6 enumC605580Np64 = new EnumC605580Np6("SUCCESS", 3);
        SUCCESS = enumC605580Np64;
        EnumC605580Np6 enumC605580Np65 = new EnumC605580Np6("FAILED", 4);
        FAILED = enumC605580Np65;
        EnumC605580Np6 enumC605580Np66 = new EnumC605580Np6("SKIPPED", 5);
        SKIPPED = enumC605580Np66;
        EnumC605580Np6 enumC605580Np67 = new EnumC605580Np6("TIMEOUT", 6);
        TIMEOUT = enumC605580Np67;
        EnumC605580Np6 enumC605580Np68 = new EnumC605580Np6("CANCELLED", 7);
        CANCELLED = enumC605580Np68;
        EnumC605580Np6[] enumC605580Np6Arr = {enumC605580Np6, enumC605580Np62, enumC605580Np63, enumC605580Np64, enumC605580Np65, enumC605580Np66, enumC605580Np67, enumC605580Np68};
        LLILLJJLI = enumC605580Np6Arr;
        LLILLL = new C2254308sP(enumC605580Np6Arr);
        Companion = new Object() { // from class: X.0NpD
        };
        LL = C13LQ.LJLIIL(new EnumC605580Np6[]{enumC605580Np64, enumC605580Np65, enumC605580Np66, enumC605580Np67, enumC605580Np68});
    }

    public static EnumC605580Np6[] values() {
        return (EnumC605580Np6[]) LLILLJJLI.clone();
    }

    public final boolean isTerminal() {
        return LL.contains(this);
    }

    public static EnumC605580Np6 valueOf(String str) {
        return (EnumC605580Np6) C08FF.LIZ(EnumC605580Np6.class, str);
    }

    public EnumC605580Np6(String str, int i) {
    }
}
