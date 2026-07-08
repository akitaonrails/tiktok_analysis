package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0v1E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1726100v1E {
    public static final EnumC1726100v1E HIGH;
    public static final /* synthetic */ EnumC1726100v1E[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1726100v1E LOW;
    public static final EnumC1726100v1E MEDIUM;

    public EnumC1726100v1E() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1726100v1E> getEntries() {
        return LLILLJJLI;
    }

    public abstract int getSearchBarHeight();

    public abstract int getSearchBarInnerHeight();

    static {
        EnumC1726100v1E enumC1726100v1E = new EnumC1726100v1E() { // from class: X.0v1F
            public final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
            public final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));

            @Override // X.EnumC1726100v1E
            public final int getSearchBarHeight() {
                return this.LLILLL;
            }

            @Override // X.EnumC1726100v1E
            public final int getSearchBarInnerHeight() {
                return this.LLILZ;
            }
        };
        HIGH = enumC1726100v1E;
        EnumC1726100v1E enumC1726100v1E2 = new EnumC1726100v1E() { // from class: X.0v1D
            public final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
            public final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));

            @Override // X.EnumC1726100v1E
            public final int getSearchBarHeight() {
                return this.LLILLL;
            }

            @Override // X.EnumC1726100v1E
            public final int getSearchBarInnerHeight() {
                return this.LLILZ;
            }
        };
        MEDIUM = enumC1726100v1E2;
        EnumC1726100v1E enumC1726100v1E3 = new EnumC1726100v1E() { // from class: X.0v1G
            public final int LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            public final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));

            @Override // X.EnumC1726100v1E
            public final int getSearchBarHeight() {
                return this.LLILLL;
            }

            @Override // X.EnumC1726100v1E
            public final int getSearchBarInnerHeight() {
                return this.LLILZ;
            }
        };
        LOW = enumC1726100v1E3;
        EnumC1726100v1E[] enumC1726100v1EArr = {enumC1726100v1E, enumC1726100v1E2, enumC1726100v1E3};
        LL = enumC1726100v1EArr;
        LLILLJJLI = new C2254308sP(enumC1726100v1EArr);
    }

    public static EnumC1726100v1E[] values() {
        return (EnumC1726100v1E[]) LL.clone();
    }

    public static EnumC1726100v1E valueOf(String str) {
        return (EnumC1726100v1E) C08FF.LIZ(EnumC1726100v1E.class, str);
    }

    public EnumC1726100v1E(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
