package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC720120SMo {
    public static final C0SNM LL;
    public static final /* synthetic */ EnumC720120SMo[] LLILLJJLI;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0SNM] */
    static {
        EnumC720120SMo[] enumC720120SMoArr = {new EnumC720120SMo("HEIC", 0, "heic_format"), new EnumC720120SMo("HEIF_FORMAT_ANIMATED", 1, "heif_format_animated")};
        LLILLJJLI = enumC720120SMoArr;
        new C2254308sP(enumC720120SMoArr);
        LL = new Object() { // from class: X.0SNM
        };
    }

    public static EnumC720120SMo[] values() {
        return (EnumC720120SMo[]) LLILLJJLI.clone();
    }

    public static EnumC720120SMo valueOf(String str) {
        return (EnumC720120SMo) C08FF.LIZ(EnumC720120SMo.class, str);
    }

    public EnumC720120SMo(String str, int i, String str2) {
    }
}
