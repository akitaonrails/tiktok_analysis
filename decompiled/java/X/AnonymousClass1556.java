package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1556, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1556 implements InterfaceC379610EuV {
    public final C1DRG LL;
    public final AnonymousClass1559 LLILLJJLI;

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public AnonymousClass1556(C1DRG c1drg) {
        this.LL = c1drg;
        AnonymousClass1559 anonymousClass1559 = new AnonymousClass1559(c1drg);
        ((ArrayList) anonymousClass1559.LLILLL).clear();
        ((ArrayList) anonymousClass1559.LLILLL).add(new C155A(c1drg));
        if (anonymousClass1559.LIZ().LJJIIZ.LIZ) {
            ((ArrayList) anonymousClass1559.LLILLL).add(new AnonymousClass1554(c1drg));
        }
        ((ArrayList) anonymousClass1559.LLILLL).add(new AnonymousClass1555(c1drg));
        if (anonymousClass1559.LIZ().LJJII.LIZ && anonymousClass1559.LIZ().LJJII.LIZJ != null) {
            ((ArrayList) anonymousClass1559.LLILLL).add(new AnonymousClass1558(c1drg));
        }
        if (anonymousClass1559.LIZ().LJIJJ != null) {
            ((ArrayList) anonymousClass1559.LLILLL).add(new AnonymousClass1557(c1drg));
        }
        this.LLILLJJLI = anonymousClass1559;
    }

    public static List LIZ(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(list2);
        for (int size = ((ArrayList) list2).size() - 1; -1 < size && !arrayList.isEmpty(); size--) {
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((MusicModel) it2.next()).getMusicId(), ((MusicModel) ListProtector.get(arrayList2, size)).getMusicId())) {
                    if (i >= 0) {
                        ListProtector.remove(arrayList2, size);
                        ListProtector.remove(arrayList, i);
                    }
                } else {
                    i++;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(list);
        arrayList3.addAll(arrayList2);
        return arrayList3;
    }
}
