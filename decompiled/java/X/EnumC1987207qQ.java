package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1987207qQ {
    public static final EnumC1987207qQ AUDIO;
    public static final /* synthetic */ EnumC1987207qQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1987207qQ VIDEO;

    public static InterfaceC2044707zh<EnumC1987207qQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1987207qQ enumC1987207qQ = new EnumC1987207qQ("VIDEO", 0);
        VIDEO = enumC1987207qQ;
        EnumC1987207qQ enumC1987207qQ2 = new EnumC1987207qQ("AUDIO", 1);
        AUDIO = enumC1987207qQ2;
        EnumC1987207qQ[] enumC1987207qQArr = {enumC1987207qQ, enumC1987207qQ2};
        LL = enumC1987207qQArr;
        LLILLJJLI = new C2254308sP(enumC1987207qQArr);
    }

    public static EnumC1987207qQ[] values() {
        return (EnumC1987207qQ[]) LL.clone();
    }

    public static EnumC1987207qQ valueOf(String str) {
        return (EnumC1987207qQ) C08FF.LIZ(EnumC1987207qQ.class, str);
    }

    public EnumC1987207qQ(String str, int i) {
    }
}
