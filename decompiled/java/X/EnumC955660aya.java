package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC955660aya {
    public static final EnumC955660aya APPLY;
    public static final EnumC955660aya APPLY_2V2;
    public static final EnumC955660aya HANDLER;
    public static final EnumC955660aya IDLE;
    public static final EnumC955660aya INVITEE;
    public static final EnumC955660aya INVITER;
    public static final /* synthetic */ EnumC955660aya[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC955660aya> getEntries() {
        return LLILLL;
    }

    static {
        EnumC955660aya enumC955660aya = new EnumC955660aya("IDLE", 0, "idle");
        IDLE = enumC955660aya;
        EnumC955660aya enumC955660aya2 = new EnumC955660aya("INVITER", 1, "inviter");
        INVITER = enumC955660aya2;
        EnumC955660aya enumC955660aya3 = new EnumC955660aya("INVITEE", 2, "invitee");
        INVITEE = enumC955660aya3;
        EnumC955660aya enumC955660aya4 = new EnumC955660aya("APPLY", 3, "apply");
        APPLY = enumC955660aya4;
        EnumC955660aya enumC955660aya5 = new EnumC955660aya("HANDLER", 4, "handler");
        HANDLER = enumC955660aya5;
        EnumC955660aya enumC955660aya6 = new EnumC955660aya("APPLY_2V2", 5, "apply_2v2");
        APPLY_2V2 = enumC955660aya6;
        EnumC955660aya[] enumC955660ayaArr = {enumC955660aya, enumC955660aya2, enumC955660aya3, enumC955660aya4, enumC955660aya5, enumC955660aya6};
        LLILLJJLI = enumC955660ayaArr;
        LLILLL = new C2254308sP(enumC955660ayaArr);
    }

    public static EnumC955660aya[] values() {
        return (EnumC955660aya[]) LLILLJJLI.clone();
    }

    public final String getLabel() {
        return this.LL;
    }

    public static EnumC955660aya valueOf(String str) {
        return (EnumC955660aya) C08FF.LIZ(EnumC955660aya.class, str);
    }

    public EnumC955660aya(String str, int i, String str2) {
        this.LL = str2;
    }
}
