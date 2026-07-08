package X;

/* JADX INFO: renamed from: X.0XPB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XPB {
    public static final C0XPB[] LJ;
    public static final C0XPB[] LJFF;
    public final String LIZ;
    public final String[] LIZIZ;
    public boolean LIZJ;
    public String LIZLLL = "";

    static {
        C0XPB c0xpb = new C0XPB("facebook", null);
        C0XPB c0xpb2 = new C0XPB("twitter", new String[]{"twitter", "m_twitter"});
        C0XPB c0xpb3 = new C0XPB("google", null);
        C0XPB c0xpb4 = new C0XPB("kakaotalk", null);
        C0XPB c0xpb5 = new C0XPB("instagram", null);
        C0XPB c0xpb6 = new C0XPB("vk", null);
        C0XPB c0xpb7 = new C0XPB("line", null);
        LJ = new C0XPB[]{c0xpb, c0xpb2, c0xpb3, c0xpb7, c0xpb4, c0xpb5, c0xpb6, new C0XPB("mobile", null)};
        LJFF = new C0XPB[]{c0xpb, c0xpb2, c0xpb3, c0xpb7, c0xpb4, c0xpb5, c0xpb6};
    }

    public C0XPB(String str, String[] strArr) {
        this.LIZ = str;
        this.LIZIZ = strArr;
    }
}
