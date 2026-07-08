package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992420bvs {
    public static final EnumC992420bvs DIRECT_SHOOT;
    public static final /* synthetic */ EnumC992420bvs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992420bvs SINGLE_SONG;
    public final String LL;

    public static InterfaceC2044707zh<EnumC992420bvs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992420bvs enumC992420bvs = new EnumC992420bvs("DIRECT_SHOOT", 0, "camera_launch_direct_shoot");
        DIRECT_SHOOT = enumC992420bvs;
        EnumC992420bvs enumC992420bvs2 = new EnumC992420bvs("SINGLE_SONG", 1, "camera_launch_single_song");
        SINGLE_SONG = enumC992420bvs2;
        EnumC992420bvs[] enumC992420bvsArr = {enumC992420bvs, enumC992420bvs2};
        LLILLJJLI = enumC992420bvsArr;
        LLILLL = new C2254308sP(enumC992420bvsArr);
    }

    public static EnumC992420bvs[] values() {
        return (EnumC992420bvs[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC992420bvs valueOf(String str) {
        return (EnumC992420bvs) C08FF.LIZ(EnumC992420bvs.class, str);
    }

    public EnumC992420bvs(String str, int i, String str2) {
        this.LL = str2;
    }
}
