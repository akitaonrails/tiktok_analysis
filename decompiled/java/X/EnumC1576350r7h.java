package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0r7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1576350r7h {
    public static final EnumC1576350r7h FROM_LOCAL_CONSUME;
    public static final EnumC1576350r7h FROM_SERVER;
    public static final /* synthetic */ EnumC1576350r7h[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1576350r7h> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1576350r7h enumC1576350r7h = new EnumC1576350r7h("FROM_SERVER", 0, "from_server");
        FROM_SERVER = enumC1576350r7h;
        EnumC1576350r7h enumC1576350r7h2 = new EnumC1576350r7h("FROM_LOCAL_CONSUME", 1, "consume");
        FROM_LOCAL_CONSUME = enumC1576350r7h2;
        EnumC1576350r7h[] enumC1576350r7hArr = {enumC1576350r7h, enumC1576350r7h2};
        LLILLJJLI = enumC1576350r7hArr;
        LLILLL = new C2254308sP(enumC1576350r7hArr);
    }

    public static EnumC1576350r7h[] values() {
        return (EnumC1576350r7h[]) LLILLJJLI.clone();
    }

    public final String getString() {
        return this.LL;
    }

    public static EnumC1576350r7h valueOf(String str) {
        return (EnumC1576350r7h) C08FF.LIZ(EnumC1576350r7h.class, str);
    }

    public EnumC1576350r7h(String str, int i, String str2) {
        this.LL = str2;
    }
}
