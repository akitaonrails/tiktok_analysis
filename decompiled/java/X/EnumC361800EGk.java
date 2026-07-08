package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EGk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC361800EGk {
    public static final /* synthetic */ EnumC361800EGk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC361800EGk SOUND;
    public static final EnumC361800EGk TTS_PANEL;

    public static InterfaceC2044707zh<EnumC361800EGk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC361800EGk enumC361800EGk = new EnumC361800EGk("SOUND", 0);
        SOUND = enumC361800EGk;
        EnumC361800EGk enumC361800EGk2 = new EnumC361800EGk("TTS_PANEL", 1);
        TTS_PANEL = enumC361800EGk2;
        EnumC361800EGk[] enumC361800EGkArr = {enumC361800EGk, enumC361800EGk2};
        LL = enumC361800EGkArr;
        LLILLJJLI = new C2254308sP(enumC361800EGkArr);
    }

    public static EnumC361800EGk[] values() {
        return (EnumC361800EGk[]) LL.clone();
    }

    public static EnumC361800EGk valueOf(String str) {
        return (EnumC361800EGk) C08FF.LIZ(EnumC361800EGk.class, str);
    }

    public EnumC361800EGk(String str, int i) {
    }
}
