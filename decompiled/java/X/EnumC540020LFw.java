package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC540020LFw {
    public static final /* synthetic */ EnumC540020LFw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC540020LFw MEDIA_PLAYER;
    public static final EnumC540020LFw NLE;

    public static InterfaceC2044707zh<EnumC540020LFw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC540020LFw enumC540020LFw = new EnumC540020LFw("NLE", 0);
        NLE = enumC540020LFw;
        EnumC540020LFw enumC540020LFw2 = new EnumC540020LFw("MEDIA_PLAYER", 1);
        MEDIA_PLAYER = enumC540020LFw2;
        EnumC540020LFw[] enumC540020LFwArr = {enumC540020LFw, enumC540020LFw2};
        LL = enumC540020LFwArr;
        LLILLJJLI = new C2254308sP(enumC540020LFwArr);
    }

    public static EnumC540020LFw[] values() {
        return (EnumC540020LFw[]) LL.clone();
    }

    public static EnumC540020LFw valueOf(String str) {
        return (EnumC540020LFw) C08FF.LIZ(EnumC540020LFw.class, str);
    }

    public EnumC540020LFw(String str, int i) {
    }
}
