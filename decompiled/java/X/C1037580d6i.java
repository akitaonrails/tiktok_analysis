package X;

import kotlin.text.u;

/* JADX INFO: renamed from: X.0d6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037580d6i {
    public static EnumC1037560d6g LIZ(String str) {
        if (!u.LJJIIJZLJL(str, "http", false) && !u.LJJIIJZLJL(str, "https", false)) {
            if (u.LJJIIJZLJL(str, "aweme://lynxview", false)) {
                return EnumC1037560d6g.LYNX;
            }
            if (u.LJJIIJZLJL(str, "aweme://minis", false)) {
                return EnumC1037560d6g.MINI_PROGRAM;
            }
            if (u.LJJIIJZLJL(str, "aweme://paidcontent/innerfeed", false)) {
                return EnumC1037560d6g.SERIES;
            }
            return null;
        }
        return EnumC1037560d6g.WEB;
    }
}
