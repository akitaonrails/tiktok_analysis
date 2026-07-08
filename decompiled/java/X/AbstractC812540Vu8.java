package X;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: renamed from: X.0Vu8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC812540Vu8<T> {
    public final int LIZ;
    public final C835520Wq6<T> LIZIZ = new C835520Wq6<>();
    public final int LIZJ;
    public final Bundle LIZLLL;

    public abstract void LIZ(Bundle bundle);

    public abstract boolean LIZIZ();

    public final String toString() {
        int i = this.LIZJ;
        int i2 = this.LIZ;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(LIZIZ());
        sb.append("}");
        return sb.toString();
    }

    public final void LIZJ(C812620VuG c812620VuG) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(c812620VuG);
            new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
        }
        this.LIZIZ.LIZ(c812620VuG);
    }

    public final void LIZLLL(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(t);
            new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
        }
        this.LIZIZ.LIZIZ(t);
    }

    public AbstractC812540Vu8(int i, int i2, Bundle bundle) {
        this.LIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = bundle;
    }
}
