package X;

/* JADX INFO: renamed from: X.0i72, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229980i72 implements InterfaceC111300bX {
    public final String LL;
    public final C1230980i8e LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final C1230910i8X LLILZIL;

    public C1229980i72() {
        this(null, null, 0, false, null, 31);
    }

    public C1229980i72(String str, C1230980i8e c1230980i8e, int i, boolean z, C1230910i8X c1230910i8X, int i2) {
        C1230910i8X c1230910i8X2 = c1230910i8X;
        boolean z2 = z;
        int i3 = i;
        C1230980i8e c1230980i8e2 = c1230980i8e;
        String str2 = (i2 & 1) != 0 ? "" : str;
        c1230980i8e2 = (i2 & 2) != 0 ? null : c1230980i8e2;
        i3 = (i2 & 4) != 0 ? 12 : i3;
        z2 = (i2 & 8) != 0 ? false : z2;
        c1230910i8X2 = (i2 & 16) != 0 ? new C1230910i8X("", "", 1, "", EnumC1219960hqs.UNKNOWN.getValue(), EnumC1219960hqs.UNKNOWN.getValue(), null, EnumC1228720i50.CHAT_ROOM.getValue(), EnumC1230920i8Y.DEFAULT.getValue(), "", 0, false, false, EnumC1229950i6z.DEFAULT.getValue(), System.currentTimeMillis(), false, false, null, null, null, null) : c1230910i8X2;
        this.LL = str2;
        this.LLILLJJLI = c1230980i8e2;
        this.LLILLL = i3;
        this.LLILZ = z2;
        this.LLILZIL = c1230910i8X2;
    }
}
