package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2249641D3i {
    public static final EnumC2249641D3i CANCELLED;
    public static final C2249671D3l Companion;
    public static final EnumC2249641D3i DROPPED;
    public static final EnumC2249641D3i ENDED;
    public static final EnumC2249641D3i INITIALIZED;
    public static final /* synthetic */ EnumC2249641D3i[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2249641D3i NO_ANSWER;
    public static final EnumC2249641D3i ON_GOING;
    public static final EnumC2249641D3i REJECTED;
    public static final EnumC2249641D3i RINGING;

    public static InterfaceC2044707zh<EnumC2249641D3i> getEntries() {
        return LLILLJJLI;
    }

    public final boolean isTerminal() {
        return C13LQ.LJLIIL(new EnumC2249641D3i[]{CANCELLED, REJECTED, ENDED, NO_ANSWER, DROPPED}).contains(this);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.1D3l] */
    static {
        EnumC2249641D3i enumC2249641D3i = new EnumC2249641D3i("INITIALIZED", 0);
        INITIALIZED = enumC2249641D3i;
        EnumC2249641D3i enumC2249641D3i2 = new EnumC2249641D3i("RINGING", 1);
        RINGING = enumC2249641D3i2;
        EnumC2249641D3i enumC2249641D3i3 = new EnumC2249641D3i("ON_GOING", 2);
        ON_GOING = enumC2249641D3i3;
        EnumC2249641D3i enumC2249641D3i4 = new EnumC2249641D3i("CANCELLED", 3);
        CANCELLED = enumC2249641D3i4;
        EnumC2249641D3i enumC2249641D3i5 = new EnumC2249641D3i("REJECTED", 4);
        REJECTED = enumC2249641D3i5;
        EnumC2249641D3i enumC2249641D3i6 = new EnumC2249641D3i("ENDED", 5);
        ENDED = enumC2249641D3i6;
        EnumC2249641D3i enumC2249641D3i7 = new EnumC2249641D3i("NO_ANSWER", 6);
        NO_ANSWER = enumC2249641D3i7;
        EnumC2249641D3i enumC2249641D3i8 = new EnumC2249641D3i("DROPPED", 7);
        DROPPED = enumC2249641D3i8;
        EnumC2249641D3i[] enumC2249641D3iArr = {enumC2249641D3i, enumC2249641D3i2, enumC2249641D3i3, enumC2249641D3i4, enumC2249641D3i5, enumC2249641D3i6, enumC2249641D3i7, enumC2249641D3i8};
        LL = enumC2249641D3iArr;
        LLILLJJLI = new C2254308sP(enumC2249641D3iArr);
        Companion = new Object() { // from class: X.1D3l
        };
    }

    public static EnumC2249641D3i[] values() {
        return (EnumC2249641D3i[]) LL.clone();
    }

    public static EnumC2249641D3i valueOf(String str) {
        return (EnumC2249641D3i) C08FF.LIZ(EnumC2249641D3i.class, str);
    }

    public EnumC2249641D3i(String str, int i) {
    }
}
