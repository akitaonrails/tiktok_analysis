package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r7H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1576090r7H {
    public static final EnumC1576090r7H CONSUME;
    public static final C1576080r7G Companion;
    public static final /* synthetic */ EnumC1576090r7H[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1576090r7H OPEN;
    public final String LL;
    public final String LLILLJJLI;

    public static final EnumC1576090r7H activeForFeedOpen(Boolean bool) {
        Companion.getClass();
        return C1576080r7G.LIZ(bool);
    }

    public static InterfaceC2044707zh<EnumC1576090r7H> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1576090r7H enumC1576090r7H = new EnumC1576090r7H("OPEN", 0, "enable_intent", "open");
        OPEN = enumC1576090r7H;
        EnumC1576090r7H enumC1576090r7H2 = new EnumC1576090r7H("CONSUME", 1, "consume_intent", "consume");
        CONSUME = enumC1576090r7H2;
        EnumC1576090r7H[] enumC1576090r7HArr = {enumC1576090r7H, enumC1576090r7H2};
        LLILLL = enumC1576090r7HArr;
        LLILZ = new C2254308sP(enumC1576090r7HArr);
        Companion = new C1576080r7G();
    }

    public static EnumC1576090r7H[] values() {
        return (EnumC1576090r7H[]) LLILLL.clone();
    }

    public final String getProtocolValue() {
        return this.LL;
    }

    public final String getTrackingName() {
        return this.LLILLJJLI;
    }

    public static final EnumC1576090r7H fromProtocolValue(String str) {
        Companion.getClass();
        for (EnumC1576090r7H enumC1576090r7H : values()) {
            if (Intrinsics.LJFF(enumC1576090r7H.getProtocolValue(), str)) {
                return enumC1576090r7H;
            }
        }
        return null;
    }

    public static EnumC1576090r7H valueOf(String str) {
        return (EnumC1576090r7H) C08FF.LIZ(EnumC1576090r7H.class, str);
    }

    public EnumC1576090r7H(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
