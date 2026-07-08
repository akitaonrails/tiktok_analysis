package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0CND, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CND implements Comparable<C0CND> {
    public final String LL;
    public final String LLILLJJLI;

    public C0CND(String str) {
        List listLL;
        List<String> listSplit = new Regex("/").split(str, 0);
        if (!listSplit.isEmpty()) {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    listLL = C13LP.LL(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listLL = C13BV.INSTANCE;
        } else {
            listLL = C13BV.INSTANCE;
        }
        this.LL = (String) ListProtector.get(listLL, 0);
        this.LLILLJJLI = (String) ListProtector.get(listLL, 1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0CND c0cnd) {
        int i;
        C0CND c0cnd2 = c0cnd;
        if (Intrinsics.LJFF(this.LL, c0cnd2.LL)) {
            i = 2;
        } else {
            i = 0;
        }
        if (Intrinsics.LJFF(this.LLILLJJLI, c0cnd2.LLILLJJLI)) {
            return i + 1;
        }
        return i;
    }
}
