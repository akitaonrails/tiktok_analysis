package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1334250kpD {
    public static final EnumC1334250kpD CANCELED;
    public static final EnumC1334250kpD FAILED;
    public static final EnumC1334250kpD INTERRUPTED;
    public static final /* synthetic */ EnumC1334250kpD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1334250kpD NOT_STARTED;
    public static final EnumC1334250kpD STARTED;
    public static final EnumC1334250kpD SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1334250kpD> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1334250kpD enumC1334250kpD = new EnumC1334250kpD("NOT_STARTED", 0, "not_started");
        NOT_STARTED = enumC1334250kpD;
        EnumC1334250kpD enumC1334250kpD2 = new EnumC1334250kpD("STARTED", 1, "started");
        STARTED = enumC1334250kpD2;
        EnumC1334250kpD enumC1334250kpD3 = new EnumC1334250kpD("SUCCESS", 2, "success");
        SUCCESS = enumC1334250kpD3;
        EnumC1334250kpD enumC1334250kpD4 = new EnumC1334250kpD("INTERRUPTED", 3, "interrupted");
        INTERRUPTED = enumC1334250kpD4;
        EnumC1334250kpD enumC1334250kpD5 = new EnumC1334250kpD("FAILED", 4, "failed");
        FAILED = enumC1334250kpD5;
        EnumC1334250kpD enumC1334250kpD6 = new EnumC1334250kpD("CANCELED", 5, "canceled");
        CANCELED = enumC1334250kpD6;
        EnumC1334250kpD[] enumC1334250kpDArr = {enumC1334250kpD, enumC1334250kpD2, enumC1334250kpD3, enumC1334250kpD4, enumC1334250kpD5, enumC1334250kpD6};
        LLILLJJLI = enumC1334250kpDArr;
        LLILLL = new C2254308sP(enumC1334250kpDArr);
    }

    public static EnumC1334250kpD[] values() {
        return (EnumC1334250kpD[]) LLILLJJLI.clone();
    }

    public final boolean isFinished() {
        return this == SUCCESS || this == FAILED || this == CANCELED || this == INTERRUPTED;
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1334250kpD valueOf(String str) {
        return (EnumC1334250kpD) C08FF.LIZ(EnumC1334250kpD.class, str);
    }

    public EnumC1334250kpD(String str, int i, String str2) {
        this.LL = str2;
    }
}
