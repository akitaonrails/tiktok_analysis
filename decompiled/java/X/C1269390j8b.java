package X;

/* JADX INFO: renamed from: X.0j8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1269390j8b {
    public Thread LIZ = C786410Ut5.u3();

    public final void LIZ() {
        if (this.LIZ == null) {
            this.LIZ = C786410Ut5.u3();
        }
        if (C786410Ut5.u3() == this.LIZ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Wrong thread ");
        sbLIZ.append(this.LIZ.getName());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
