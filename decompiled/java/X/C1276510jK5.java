package X;

/* JADX INFO: renamed from: X.0jK5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1276510jK5 {
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
