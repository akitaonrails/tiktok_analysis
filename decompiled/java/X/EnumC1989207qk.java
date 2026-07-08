package X;

import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1989207qk {
    public static final /* synthetic */ EnumC1989207qk[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1989207qk PHOTO;
    public static final EnumC1989207qk VIDEO;
    public final String LL;
    public final Set<String> LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1989207qk> getEntries() {
        return LLILZ;
    }

    static {
        C08CX c08cx = C08CX.INSTANCE;
        EnumC1989207qk enumC1989207qk = new EnumC1989207qk(0, "PHOTO", "photo", c08cx);
        PHOTO = enumC1989207qk;
        EnumC1989207qk enumC1989207qk2 = new EnumC1989207qk(1, "VIDEO", "video", c08cx);
        VIDEO = enumC1989207qk2;
        EnumC1989207qk[] enumC1989207qkArr = {enumC1989207qk, enumC1989207qk2};
        LLILLL = enumC1989207qkArr;
        LLILZ = new C2254308sP(enumC1989207qkArr);
    }

    public static EnumC1989207qk[] values() {
        return (EnumC1989207qk[]) LLILLL.clone();
    }

    public final Set<String> getFileExtensions() {
        return this.LLILLJJLI;
    }

    public final String getMimeTypeName() {
        return this.LL;
    }

    public static EnumC1989207qk valueOf(String str) {
        return (EnumC1989207qk) C08FF.LIZ(EnumC1989207qk.class, str);
    }

    public EnumC1989207qk(int i, String str, String str2, C08CX c08cx) {
        this.LL = str2;
        this.LLILLJJLI = c08cx;
    }
}
