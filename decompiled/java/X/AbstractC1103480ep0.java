package X;

/* JADX INFO: renamed from: X.0ep0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1103480ep0 {
    public String toString() {
        if (this instanceof C1103380eoq) {
            return "not_started";
        }
        if (this instanceof C1103400eos) {
            return "fetching";
        }
        if (this instanceof C1103470eoz) {
            return "success";
        }
        if (this instanceof C1103390eor) {
            return "failure";
        }
        throw new C1954807lC();
    }
}
