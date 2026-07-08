package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2T, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N2T implements InterfaceC593520NPq<Integer> {
    public static final /* synthetic */ C0N2T[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N2T UNUSABLE;
    public static final C0N2T USABLE_COMMERCIAL_SOUND;
    public static final C0N2T USABLE_ORIGINAL_SOUND;
    public final int LL;

    public static InterfaceC2044707zh<C0N2T> getEntries() {
        return LLILLL;
    }

    static {
        C0N2T c0n2t = new C0N2T("UNUSABLE", 0, 0);
        UNUSABLE = c0n2t;
        C0N2T c0n2t2 = new C0N2T("USABLE_ORIGINAL_SOUND", 1, 1);
        USABLE_ORIGINAL_SOUND = c0n2t2;
        C0N2T c0n2t3 = new C0N2T("USABLE_COMMERCIAL_SOUND", 2, 2);
        USABLE_COMMERCIAL_SOUND = c0n2t3;
        C0N2T[] c0n2tArr = {c0n2t, c0n2t2, c0n2t3};
        LLILLJJLI = c0n2tArr;
        LLILLL = new C2254308sP(c0n2tArr);
    }

    public static C0N2T[] values() {
        return (C0N2T[]) LLILLJJLI.clone();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC593520NPq
    public Integer getParamValue() {
        return Integer.valueOf(this.LL);
    }

    public static C0N2T valueOf(String str) {
        return (C0N2T) C08FF.LIZ(C0N2T.class, str);
    }

    public C0N2T(String str, int i, int i2) {
        this.LL = i2;
    }
}
