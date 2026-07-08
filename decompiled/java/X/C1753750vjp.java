package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: renamed from: X.0vjp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1753750vjp<V, R> {
    public final int LIZ;
    public final Function2<Context, V, R> LIZIZ;
    public final LinkedList<C1753760vjq<V, R>> LIZJ = new LinkedList<>();
    public final HashMap<V, Integer> LIZLLL = new HashMap<>();
    public boolean LJ = true;

    public final synchronized void LIZIZ() {
        this.LJ = false;
        this.LIZJ.clear();
    }

    public C1753750vjp(int i, AwS640S0100000_26 awS640S0100000_26) {
        this.LIZ = i;
        this.LIZIZ = awS640S0100000_26;
    }

    public final synchronized void LIZ(WeakReference<Context> weakReference, V v, int i) {
        this.LJ = true;
        int size = this.LIZJ.size() + i;
        if (size > this.LIZ) {
            int size2 = size - this.LIZJ.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C19719612Di.LJJIIZI(this.LIZJ);
            }
        }
        for (int i3 = 0; i3 < i; i3++) {
            C21394318o1.LIZ(new AwS270S0300000_26((WeakReference) weakReference, (WeakReference<Context>) this, (C1753750vjp<int, R>) v, 124));
        }
    }
}
