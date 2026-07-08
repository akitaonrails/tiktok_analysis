package X;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.054c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12928054c {
    public static final C12940054o Companion;
    public static final EnumC12928054c DID;
    public static final /* synthetic */ EnumC12928054c[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC12928054c NULL;
    public static final EnumC12928054c UID;
    public static final C01GW<Map<String, EnumC12928054c>> map$delegate;
    public final String LL;

    public static InterfaceC2044707zh<EnumC12928054c> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.054o] */
    static {
        EnumC12928054c enumC12928054c = new EnumC12928054c("NULL", 0, "null");
        NULL = enumC12928054c;
        EnumC12928054c enumC12928054c2 = new EnumC12928054c("DID", 1, "did");
        DID = enumC12928054c2;
        EnumC12928054c enumC12928054c3 = new EnumC12928054c("UID", 2, "uid");
        UID = enumC12928054c3;
        EnumC12928054c[] enumC12928054cArr = {enumC12928054c, enumC12928054c2, enumC12928054c3};
        LLILLJJLI = enumC12928054cArr;
        LLILLL = new C2254308sP(enumC12928054cArr);
        Companion = new Object() { // from class: X.054o
        };
        map$delegate = C452501pT.LIZIZ(new C054W());
    }

    public static EnumC12928054c[] values() {
        return (EnumC12928054c[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC12928054c valueOf(String str) {
        return (EnumC12928054c) C08FF.LIZ(EnumC12928054c.class, str);
    }

    public EnumC12928054c(String str, int i, String str2) {
        this.LL = str2;
    }
}
