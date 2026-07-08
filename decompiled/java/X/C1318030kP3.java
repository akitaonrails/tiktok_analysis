package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0kP3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1318030kP3 {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final int hashCode() {
        return this.LIZ << (this.LIZIZ + 16);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1318030kP3)) {
            return false;
        }
        C1318030kP3 c1318030kP3 = (C1318030kP3) obj;
        if (c1318030kP3.LIZ != this.LIZ || c1318030kP3.LIZIZ != this.LIZIZ || !TextUtils.equals(c1318030kP3.LIZJ, this.LIZJ)) {
            return false;
        }
        return true;
    }

    public C1318030kP3(int i, int i2, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
    }
}
