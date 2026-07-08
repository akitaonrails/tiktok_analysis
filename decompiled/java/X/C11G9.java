package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11G9, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11G9 {
    public static final C11G9 CreationPageEntered;
    public static final /* synthetic */ C11G9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C11G9 TitleSeen;
    public static final C11G9 Unknown;

    public C11G9() {
        throw null;
    }

    public static InterfaceC2044707zh<C11G9> getEntries() {
        return LLILLJJLI;
    }

    public abstract /* synthetic */ int getValue();

    static {
        C11G9 c11g9 = new C11G9() { // from class: X.11GC
            @Override // X.C11G9
            public final int getValue() {
                return 0;
            }
        };
        Unknown = c11g9;
        C11G9 c11g92 = new C11G9() { // from class: X.11GB
            @Override // X.C11G9
            public final int getValue() {
                return 1;
            }
        };
        TitleSeen = c11g92;
        C11G9 c11g93 = new C11G9() { // from class: X.11GA
            @Override // X.C11G9
            public final int getValue() {
                return 2;
            }
        };
        CreationPageEntered = c11g93;
        C11G9[] c11g9Arr = {c11g9, c11g92, c11g93};
        LL = c11g9Arr;
        LLILLJJLI = new C2254308sP(c11g9Arr);
    }

    public static C11G9[] values() {
        return (C11G9[]) LL.clone();
    }

    public static C11G9 valueOf(String str) {
        return (C11G9) C08FF.LIZ(C11G9.class, str);
    }

    public C11G9(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
