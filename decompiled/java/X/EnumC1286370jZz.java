package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1286370jZz {
    public static final EnumC1286370jZz FAILURE;
    public static final /* synthetic */ EnumC1286370jZz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1286370jZz NOT_FINISH;
    public static final EnumC1286370jZz NOT_START;
    public static final EnumC1286370jZz SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1286370jZz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1286370jZz enumC1286370jZz = new EnumC1286370jZz("SUCCESS", 0, CardStruct.IStatusCode.DEFAULT);
        SUCCESS = enumC1286370jZz;
        EnumC1286370jZz enumC1286370jZz2 = new EnumC1286370jZz("FAILURE", 1, "1");
        FAILURE = enumC1286370jZz2;
        EnumC1286370jZz enumC1286370jZz3 = new EnumC1286370jZz("NOT_FINISH", 2, "2");
        NOT_FINISH = enumC1286370jZz3;
        EnumC1286370jZz enumC1286370jZz4 = new EnumC1286370jZz("NOT_START", 3, "3");
        NOT_START = enumC1286370jZz4;
        EnumC1286370jZz[] enumC1286370jZzArr = {enumC1286370jZz, enumC1286370jZz2, enumC1286370jZz3, enumC1286370jZz4};
        LLILLJJLI = enumC1286370jZzArr;
        LLILLL = new C2254308sP(enumC1286370jZzArr);
    }

    public static EnumC1286370jZz[] values() {
        return (EnumC1286370jZz[]) LLILLJJLI.clone();
    }

    public final String getStatus() {
        return this.LL;
    }

    public static EnumC1286370jZz valueOf(String str) {
        return (EnumC1286370jZz) C08FF.LIZ(EnumC1286370jZz.class, str);
    }

    public EnumC1286370jZz(String str, int i, String str2) {
        this.LL = str2;
    }
}
