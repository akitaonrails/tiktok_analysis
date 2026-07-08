package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993040bws {
    public static final EnumC993040bws ADD_DOCUMENT_JS_LOADED;
    public static final EnumC993040bws ADD_DOCUMENT_JS_START;
    public static final /* synthetic */ EnumC993040bws[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC993040bws> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993040bws enumC993040bws = new EnumC993040bws("ADD_DOCUMENT_JS_START", 0, 0);
        ADD_DOCUMENT_JS_START = enumC993040bws;
        EnumC993040bws enumC993040bws2 = new EnumC993040bws("ADD_DOCUMENT_JS_LOADED", 1, 1);
        ADD_DOCUMENT_JS_LOADED = enumC993040bws2;
        EnumC993040bws[] enumC993040bwsArr = {enumC993040bws, enumC993040bws2};
        LLILLJJLI = enumC993040bwsArr;
        LLILLL = new C2254308sP(enumC993040bwsArr);
    }

    public static EnumC993040bws[] values() {
        return (EnumC993040bws[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC993040bws valueOf(String str) {
        return (EnumC993040bws) C08FF.LIZ(EnumC993040bws.class, str);
    }

    public EnumC993040bws(String str, int i, int i2) {
        this.LL = i2;
    }
}
