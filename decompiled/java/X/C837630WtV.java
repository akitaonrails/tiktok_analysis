package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0WtV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837630WtV {
    public final List<String> LIZ = new ArrayList();
    public final List<String> LIZIZ = new ArrayList();

    public final C0X0X LIZJ() {
        return new C0X0X(this.LIZ, this.LIZIZ);
    }

    public final void LIZ(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                ((ArrayList) this.LIZ).add(C0XLQ.LIZIZ(str, false, null));
                ((ArrayList) this.LIZIZ).add(C0XLQ.LIZIZ(str2, false, null));
                return;
            }
            throw new NullPointerException("value == null");
        }
        throw new NullPointerException("name == null");
    }

    public final void LIZIZ(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                ((ArrayList) this.LIZ).add(C0XLQ.LIZIZ(str, true, null));
                ((ArrayList) this.LIZIZ).add(C0XLQ.LIZIZ(str2, true, null));
                return;
            }
            throw new NullPointerException("value == null");
        }
        throw new NullPointerException("name == null");
    }
}
