package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0o8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1461710o8n {
    public static final /* synthetic */ EnumC1461710o8n[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1461710o8n MUSIC;
    public static final EnumC1461710o8n RECORDING;
    public static final EnumC1461710o8n VIDEO_VOICE;

    public static InterfaceC2044707zh<EnumC1461710o8n> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1461710o8n enumC1461710o8n = new EnumC1461710o8n("VIDEO_VOICE", 0);
        VIDEO_VOICE = enumC1461710o8n;
        EnumC1461710o8n enumC1461710o8n2 = new EnumC1461710o8n("MUSIC", 1);
        MUSIC = enumC1461710o8n2;
        EnumC1461710o8n enumC1461710o8n3 = new EnumC1461710o8n(C1649000t0s.LLLJIL, 2);
        RECORDING = enumC1461710o8n3;
        EnumC1461710o8n[] enumC1461710o8nArr = {enumC1461710o8n, enumC1461710o8n2, enumC1461710o8n3};
        LL = enumC1461710o8nArr;
        LLILLJJLI = new C2254308sP(enumC1461710o8nArr);
    }

    public static EnumC1461710o8n[] values() {
        return (EnumC1461710o8n[]) LL.clone();
    }

    public static EnumC1461710o8n valueOf(String str) {
        return (EnumC1461710o8n) C08FF.LIZ(EnumC1461710o8n.class, str);
    }

    public EnumC1461710o8n(String str, int i) {
    }
}
