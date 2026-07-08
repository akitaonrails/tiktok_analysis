package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wST, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1781430wST {
    public static final EnumC1781430wST CLOSED;
    public static final /* synthetic */ EnumC1781430wST[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1781430wST OPENED;

    public static InterfaceC2044707zh<EnumC1781430wST> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1781430wST enumC1781430wST = new EnumC1781430wST("OPENED", 0);
        OPENED = enumC1781430wST;
        EnumC1781430wST enumC1781430wST2 = new EnumC1781430wST("CLOSED", 1);
        CLOSED = enumC1781430wST2;
        EnumC1781430wST[] enumC1781430wSTArr = {enumC1781430wST, enumC1781430wST2};
        LL = enumC1781430wSTArr;
        LLILLJJLI = new C2254308sP(enumC1781430wSTArr);
    }

    public static EnumC1781430wST[] values() {
        return (EnumC1781430wST[]) LL.clone();
    }

    public static EnumC1781430wST valueOf(String str) {
        return (EnumC1781430wST) C08FF.LIZ(EnumC1781430wST.class, str);
    }

    public EnumC1781430wST(String str, int i) {
    }
}
