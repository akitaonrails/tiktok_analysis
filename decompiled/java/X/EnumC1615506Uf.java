package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06Uf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1615506Uf {
    public static final /* synthetic */ EnumC1615506Uf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1615506Uf STORY;
    public final String LL = "story";

    public static InterfaceC2044707zh<EnumC1615506Uf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1615506Uf enumC1615506Uf = new EnumC1615506Uf();
        STORY = enumC1615506Uf;
        EnumC1615506Uf[] enumC1615506UfArr = {enumC1615506Uf};
        LLILLJJLI = enumC1615506UfArr;
        LLILLL = new C2254308sP(enumC1615506UfArr);
    }

    public static EnumC1615506Uf[] values() {
        return (EnumC1615506Uf[]) LLILLJJLI.clone();
    }

    public final String getTagName() {
        return this.LL;
    }

    public static EnumC1615506Uf valueOf(String str) {
        return (EnumC1615506Uf) C08FF.LIZ(EnumC1615506Uf.class, str);
    }
}
