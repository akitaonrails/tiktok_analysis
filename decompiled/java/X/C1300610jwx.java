package X;

/* JADX INFO: renamed from: X.0jwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1300610jwx {
    public static final C1300610jwx LIZJ;
    public static final C1300610jwx LIZLLL;
    public static final C1300610jwx LJ;
    public static final C1300610jwx LJFF;
    public static final C1300610jwx LJI;
    public static final C1300610jwx LJII;
    public static final C1300610jwx LJIIIIZZ;
    public static final C1300610jwx LJIIIZ;
    public static final C1300610jwx LJIIJ;
    public static final C1300610jwx LJIIJJI;
    public static final C1300610jwx LJIIL;
    public static final C1300610jwx LJIILIIL;
    public final String LIZ;
    public final EnumC1300710jx7 LIZIZ;

    static {
        EnumC1300710jx7 enumC1300710jx7 = EnumC1300710jx7.FLOAT;
        LIZJ = new C1300610jwx("overall_score", enumC1300710jx7);
        LIZLLL = new C1300610jwx("cpu_score", enumC1300710jx7);
        LJ = new C1300610jwx("gpu_score", enumC1300710jx7);
        LJFF = new C1300610jwx("memory_score", enumC1300710jx7);
        LJI = new C1300610jwx("video_score", enumC1300710jx7);
        LJII = new C1300610jwx("io_score", enumC1300710jx7);
        LJIIIIZZ = new C1300610jwx("video_play_scene", enumC1300710jx7);
        LJIIIZ = new C1300610jwx("app_launch_scene", enumC1300710jx7);
        LJIIJ = new C1300610jwx("video_record_scene", enumC1300710jx7);
        LJIIJJI = new C1300610jwx("temp", enumC1300710jx7);
        LJIIL = new C1300610jwx("battery", enumC1300710jx7);
        LJIILIIL = new C1300610jwx("remain_memory", enumC1300710jx7);
    }

    public C1300610jwx(String str, EnumC1300710jx7 enumC1300710jx7) {
        this.LIZ = str;
        this.LIZIZ = enumC1300710jx7;
    }
}
