package X;

/* JADX INFO: renamed from: X.0UeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777260UeK {
    public EnumC777270UeL LIZ = EnumC777270UeL.RESET;
    public long LIZIZ;
    public long LIZJ;

    public final void LIZ() {
        EnumC777270UeL enumC777270UeL = this.LIZ;
        EnumC777270UeL enumC777270UeL2 = EnumC777270UeL.PAUSED;
        if (enumC777270UeL == enumC777270UeL2) {
            return;
        }
        this.LIZ = enumC777270UeL2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LIZJ;
        if (1 > j || j >= jCurrentTimeMillis) {
            return;
        }
        this.LIZIZ += jCurrentTimeMillis - j;
    }
}
