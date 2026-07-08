package X;

/* JADX INFO: renamed from: X.0OVM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OVM {
    public final C1252380ihA LIZ = new C1252380ihA();

    public final C1252380ihA LIZ() {
        C1252380ihA c1252380ihA = this.LIZ;
        if (c1252380ihA.LIZLLL != -1) {
            return c1252380ihA;
        }
        "You must set an action.".toString();
        throw new IllegalStateException("You must set an action.");
    }

    public final void LIZIZ(String str) {
        C1252380ihA c1252380ihA = this.LIZ;
        if (str == null) {
            str = "";
        }
        c1252380ihA.LIZIZ = str;
    }

    public final void LIZJ(String str) {
        C1252380ihA c1252380ihA = this.LIZ;
        if (str == null) {
            str = "";
        }
        c1252380ihA.LIZ = str;
    }
}
