package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0WnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C833910WnV implements InterfaceC833080WmA, InterfaceC831640Wjq {
    public static final C833910WnV LLILLL = new C833910WnV(new C833920WnW());
    public final boolean LL;
    public final String LLILLJJLI;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.LL), this.LLILLJJLI});
    }

    public C833910WnV(C833920WnW c833920WnW) {
        this.LL = c833920WnW.LIZ.booleanValue();
        this.LLILLJJLI = c833920WnW.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C833910WnV)) {
            return false;
        }
        C833910WnV c833910WnV = (C833910WnV) obj;
        c833910WnV.getClass();
        if (C0W0T.LIZIZ(null, null) && this.LL == c833910WnV.LL && C0W0T.LIZIZ(this.LLILLJJLI, c833910WnV.LLILLJJLI)) {
            return true;
        }
        return false;
    }
}
