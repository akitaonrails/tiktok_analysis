package X;

import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0ePK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087560ePK {
    public final ArrayList<C1087570ePL> LIZ = new ArrayList<>();

    public final void LIZ(BaseMessage baseMessage, int i) {
        int i2;
        C1087570ePL c1087570ePL = new C1087570ePL(baseMessage, i);
        if (this.LIZ.isEmpty()) {
            this.LIZ.add(c1087570ePL);
            return;
        }
        int size = this.LIZ.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((C1087570ePL) ListProtector.get(this.LIZ, size)).LIZIZ >= c1087570ePL.LIZIZ) {
                    i2 = size + 1;
                    break;
                }
                size--;
            } else {
                i2 = 0;
                break;
            }
        }
        ListProtector.add(this.LIZ, i2, c1087570ePL);
    }
}
