package X;

/* JADX INFO: renamed from: X.0WKQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0WKQ {
    Default(0),
    TimeOut(1),
    Failed(2),
    Success(3);

    public final int LL;

    public int getTypeValue() {
        return this.LL;
    }

    public static C0WKQ valueOf(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return Default;
                }
                return Success;
            }
            return Failed;
        }
        return TimeOut;
    }

    public static C0WKQ valueOf(String str) {
        return (C0WKQ) C08FF.LIZ(C0WKQ.class, str);
    }

    C0WKQ(int i) {
        this.LL = i;
    }
}
