package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z6e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class EnumC894220Z6e {
    public static final /* synthetic */ EnumC894220Z6e[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC894220Z6e PROPERTY_CHANGE;
    public static final EnumC894220Z6e REAL_MESSAGE;

    public EnumC894220Z6e() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC894220Z6e> getEntries() {
        return LLILLJJLI;
    }

    public abstract String transformMessageType(String str);

    static {
        EnumC894220Z6e enumC894220Z6e = new EnumC894220Z6e() { // from class: X.0Z6g
            @Override // X.EnumC894220Z6e
            public final String transformMessageType(String str) {
                return str;
            }
        };
        REAL_MESSAGE = enumC894220Z6e;
        EnumC894220Z6e enumC894220Z6e2 = new EnumC894220Z6e() { // from class: X.0Z6f
            @Override // X.EnumC894220Z6e
            public final String transformMessageType(String str) {
                return "fast_emoji";
            }
        };
        PROPERTY_CHANGE = enumC894220Z6e2;
        EnumC894220Z6e[] enumC894220Z6eArr = {enumC894220Z6e, enumC894220Z6e2};
        LL = enumC894220Z6eArr;
        LLILLJJLI = new C2254308sP(enumC894220Z6eArr);
    }

    public static EnumC894220Z6e[] values() {
        return (EnumC894220Z6e[]) LL.clone();
    }

    public static EnumC894220Z6e valueOf(String str) {
        return (EnumC894220Z6e) C08FF.LIZ(EnumC894220Z6e.class, str);
    }

    public EnumC894220Z6e(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
