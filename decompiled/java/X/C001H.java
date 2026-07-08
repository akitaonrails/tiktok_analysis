package X;

/* JADX INFO: renamed from: X.001H, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C001H {
    public static final int[] LIZ = new int[103];

    static {
        int i = 48;
        do {
            LIZ[i] = i - 48;
            i++;
        } while (i <= 57);
        int i2 = 65;
        do {
            LIZ[i2] = (i2 - 65) + 10;
            i2++;
        } while (i2 <= 70);
        int i3 = 97;
        do {
            LIZ[i3] = (i3 - 97) + 10;
            i3++;
        } while (i3 <= 102);
    }
}
