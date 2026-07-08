package X;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197690hGx {
    public final Long LIZ;
    public final Long LIZIZ;
    public final List<C1197720hH0> LIZJ;
    public boolean LIZLLL;

    public final C1197720hH0 LIZ() {
        return (C1197720hH0) C13LP.LJJLIIIJL(this.LIZJ);
    }

    public final C1197720hH0 LIZIZ(Function1<? super C1197720hH0, Boolean> function1) {
        C1197720hH0 c1197720hH0Previous;
        List<C1197720hH0> list = this.LIZJ;
        ListIterator<C1197720hH0> listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                c1197720hH0Previous = listIterator.previous();
                if (function1.invoke(c1197720hH0Previous).booleanValue()) {
                    break;
                }
            } else {
                c1197720hH0Previous = null;
                break;
            }
        }
        return c1197720hH0Previous;
    }

    public C1197690hGx(Long l, Long l2) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = l;
        this.LIZIZ = l2;
        this.LIZJ = arrayList;
        this.LIZLLL = false;
    }
}
