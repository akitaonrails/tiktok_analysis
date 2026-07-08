package X;

/* JADX INFO: renamed from: X.0b3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958850b3j {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(EnumC958840b3i enumC958840b3i, boolean z) {
        if (enumC958840b3i == EnumC958840b3i.TEAM_PAIR || enumC958840b3i == EnumC958840b3i.QUICK_BATTLE) {
            return false;
        }
        if (enumC958840b3i == EnumC958840b3i.QUICK_PAIR || enumC958840b3i == EnumC958840b3i.QUICK_RECOMMEND) {
            return true;
        }
        if (enumC958840b3i == EnumC958840b3i.QUICK_RECOMMEND_DURING_COHOST) {
            return z;
        }
        if (enumC958840b3i != EnumC958840b3i.UNKNOWN || !z) {
            return false;
        }
        return true;
    }
}
