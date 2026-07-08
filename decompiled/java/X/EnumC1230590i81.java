package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i81, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1230590i81 {
    public static final EnumC1230590i81 JOIN_GROUP_SCENE_BY_ACTIVE_ENTRANCE;
    public static final EnumC1230590i81 JOIN_GROUP_SCENE_BY_AUDIT;
    public static final EnumC1230590i81 JOIN_GROUP_SCENE_BY_EXTERNAL_INVITATION;
    public static final EnumC1230590i81 JOIN_GROUP_SCENE_BY_INTERNAL_INVITATION;
    public static final EnumC1230590i81 JOIN_GROUP_SCENE_UNKNOWN;
    public static final /* synthetic */ EnumC1230590i81[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1230590i81> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1230590i81 enumC1230590i81 = new EnumC1230590i81("JOIN_GROUP_SCENE_UNKNOWN", 0, 0);
        JOIN_GROUP_SCENE_UNKNOWN = enumC1230590i81;
        EnumC1230590i81 enumC1230590i812 = new EnumC1230590i81("JOIN_GROUP_SCENE_BY_INTERNAL_INVITATION", 1, 1);
        JOIN_GROUP_SCENE_BY_INTERNAL_INVITATION = enumC1230590i812;
        EnumC1230590i81 enumC1230590i813 = new EnumC1230590i81("JOIN_GROUP_SCENE_BY_EXTERNAL_INVITATION", 2, 2);
        JOIN_GROUP_SCENE_BY_EXTERNAL_INVITATION = enumC1230590i813;
        EnumC1230590i81 enumC1230590i814 = new EnumC1230590i81("JOIN_GROUP_SCENE_BY_AUDIT", 3, 3);
        JOIN_GROUP_SCENE_BY_AUDIT = enumC1230590i814;
        EnumC1230590i81 enumC1230590i815 = new EnumC1230590i81("JOIN_GROUP_SCENE_BY_ACTIVE_ENTRANCE", 4, 4);
        JOIN_GROUP_SCENE_BY_ACTIVE_ENTRANCE = enumC1230590i815;
        EnumC1230590i81[] enumC1230590i81Arr = {enumC1230590i81, enumC1230590i812, enumC1230590i813, enumC1230590i814, enumC1230590i815};
        LLILLJJLI = enumC1230590i81Arr;
        LLILLL = new C2254308sP(enumC1230590i81Arr);
    }

    public static EnumC1230590i81[] values() {
        return (EnumC1230590i81[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1230590i81 valueOf(String str) {
        return (EnumC1230590i81) C08FF.LIZ(EnumC1230590i81.class, str);
    }

    public EnumC1230590i81(String str, int i, int i2) {
        this.LL = i2;
    }
}
