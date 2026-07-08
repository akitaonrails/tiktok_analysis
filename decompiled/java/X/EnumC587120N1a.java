package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587120N1a {
    public static final /* synthetic */ EnumC587120N1a[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC587120N1a STATE_IDLE;
    public static final EnumC587120N1a STATE_SCROLLING;

    public static InterfaceC2044707zh<EnumC587120N1a> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC587120N1a enumC587120N1a = new EnumC587120N1a("STATE_IDLE", 0);
        STATE_IDLE = enumC587120N1a;
        EnumC587120N1a enumC587120N1a2 = new EnumC587120N1a("STATE_SCROLLING", 1);
        STATE_SCROLLING = enumC587120N1a2;
        EnumC587120N1a[] enumC587120N1aArr = {enumC587120N1a, enumC587120N1a2};
        LL = enumC587120N1aArr;
        LLILLJJLI = new C2254308sP(enumC587120N1aArr);
    }

    public static EnumC587120N1a[] values() {
        return (EnumC587120N1a[]) LL.clone();
    }

    public static EnumC587120N1a valueOf(String str) {
        return (EnumC587120N1a) C08FF.LIZ(EnumC587120N1a.class, str);
    }

    public EnumC587120N1a(String str, int i) {
    }
}
