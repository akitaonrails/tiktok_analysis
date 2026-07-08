package X;

/* JADX INFO: renamed from: X.14a8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20289014a8 {
    public static final C20293414aq LIZ = new C20293414aq("need_show");

    public static int LIZ(Integer num) {
        if (num == null) {
            return 0;
        }
        if (num.intValue() == EnumC20290014aI.DEFAULT.getId()) {
            return 0;
        }
        if (num.intValue() == EnumC20290014aI.SKIP.getId()) {
            return 1;
        }
        return 2;
    }
}
