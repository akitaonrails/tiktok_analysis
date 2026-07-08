package X;

/* JADX INFO: renamed from: X.0mAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1386030mAj extends Exception {
    @Override // java.lang.Throwable
    public String getMessage() {
        if (this instanceof C1386090mAp) {
            return "Invalid coordinator configuration";
        }
        if (this instanceof C1386100mAq) {
            return "Missing matching strategy orchestrator configuration";
        }
        throw new C1954807lC();
    }
}
