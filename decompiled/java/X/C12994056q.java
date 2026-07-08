package X;

/* JADX INFO: renamed from: X.056q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12994056q {
    public static EnumC12995056r LIZ(Integer num) {
        if (num == null) {
            return null;
        }
        for (EnumC12995056r enumC12995056r : EnumC12995056r.values()) {
            if (enumC12995056r.getWireValue() == num.intValue()) {
                return enumC12995056r;
            }
        }
        return null;
    }
}
