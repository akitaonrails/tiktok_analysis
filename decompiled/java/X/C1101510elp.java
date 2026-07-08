package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0elp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101510elp<E> {
    public final int LIZ;
    public final List<E> LIZIZ;

    public final void LIZ(E e) {
        List<E> list = this.LIZIZ;
        if (list == null) {
            return;
        }
        list.add(e);
        while (this.LIZIZ.size() > this.LIZ) {
            ListProtector.remove(this.LIZIZ, 0);
        }
    }

    public C1101510elp(Integer num, List<E> list) {
        int iIntValue;
        if (num.intValue() > 0) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        this.LIZ = iIntValue;
        this.LIZIZ = list;
    }
}
