package X;

/* JADX INFO: renamed from: X.0VAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC793340VAe {
    public long LIZ;
    public long LIZIZ;
    public String LIZJ;
    public StackTraceElement[] LIZLLL;

    public final String LIZ() {
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i < this.LIZLLL.length; i++) {
            sb.append("\tat ");
            sb.append(this.LIZLLL[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
