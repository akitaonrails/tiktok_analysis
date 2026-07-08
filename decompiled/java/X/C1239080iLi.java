package X;

import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0iLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1239080iLi<T> {
    public final String LIZ = "login";
    public final T[] LIZIZ;

    public final T LIZ() {
        T[] tArr = this.LIZIZ;
        if (tArr == null || tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("action = [");
        sb.append(this.LIZ);
        sb.append("], args = ");
        if (this.LIZIZ != null) {
            sb.append(e3.e);
            int i = 0;
            while (true) {
                T[] tArr = this.LIZIZ;
                if (i >= tArr.length) {
                    break;
                }
                sb.append(tArr[i]);
                if (i != this.LIZIZ.length - 1) {
                    sb.append(",");
                }
                i++;
            }
            sb.append(e3.f);
        } else {
            sb.append("null");
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1239080iLi(Object... objArr) {
        this.LIZIZ = objArr;
    }
}
