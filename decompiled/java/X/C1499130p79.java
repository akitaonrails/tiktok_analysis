package X;

import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0p79, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499130p79<E> implements Iterable<E> {
    public int LLILLL;
    public boolean LLILZ;
    public final List<E> LL = new ArrayList();
    public boolean LLILZIL = true;
    public final C1499110p77 LLILLJJLI = new Object() { // from class: X.0p77
        {
            Process.myTid();
        }
    };

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        if (this.LLILZIL) {
            getClass();
        }
        return new C1499120p78(this);
    }
}
