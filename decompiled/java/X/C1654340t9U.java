package X;

/* JADX INFO: renamed from: X.0t9U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1654340t9U {
    public String message;
    public int status_code;

    public boolean checkValue() {
        return true;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseNetResponse{status_code=");
        sbLIZ.append(this.status_code);
        sbLIZ.append(", message='");
        sbLIZ.append(this.message);
        sbLIZ.append("'}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }
}
