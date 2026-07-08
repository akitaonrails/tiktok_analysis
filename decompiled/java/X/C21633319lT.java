package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.19lT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21633319lT {
    public final View LIZ;
    public List<List<String>> LIZJ;
    public InterfaceC21635619lq LJ;
    public C21633919lZ LJFF;
    public final List<C21631219l8> LIZIZ = new ArrayList();
    public final List<Integer> LIZLLL = new ArrayList();

    public C21633319lT(View view) {
        this.LIZ = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    public final void LIZ(List<Integer> list) {
        if (this.LIZJ == null) {
            ((ArrayList) this.LIZLLL).clear();
            return;
        }
        if (list == 0) {
            list = new ArrayList<>();
            for (int i = 0; i < this.LIZJ.size(); i++) {
                list.add(0);
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next() == null) {
                throw new IllegalArgumentException("index can not be null");
            }
        }
        for (int i2 = 0; i2 < ((ArrayList) this.LIZIZ).size(); i2++) {
            C21631219l8 c21631219l8 = (C21631219l8) ListProtector.get(this.LIZIZ, i2);
            if (i2 < list.size()) {
                int iIntValue = ((Integer) ListProtector.get(list, i2)).intValue();
                List<List<String>> list2 = this.LIZJ;
                if (list2 != null && i2 < list2.size() && iIntValue < ((List) ListProtector.get(this.LIZJ, i2)).size()) {
                    c21631219l8.setCurrentIndex(iIntValue);
                } else {
                    ListProtector.set(list, i2, 0);
                    c21631219l8.setCurrentIndex(0);
                }
            } else {
                c21631219l8.setCurrentIndex(0);
            }
        }
        ((ArrayList) this.LIZLLL).clear();
        ((ArrayList) this.LIZLLL).addAll(list);
    }
}
