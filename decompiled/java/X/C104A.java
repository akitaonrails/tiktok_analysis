package X;

/* JADX INFO: renamed from: X.104A, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class C104A {
    public static int LIZJ;
    public String LIZ;
    public AnonymousClass1049 LIZIZ;

    public C104A() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        int i = LIZJ;
        LIZJ = i + 1;
        sbLIZ.append(i);
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
    }
}
