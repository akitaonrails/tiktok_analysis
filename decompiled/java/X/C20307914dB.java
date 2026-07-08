package X;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.14dB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20307914dB implements Iterable, C03W4 {
    public final int $t;
    public Object l0;

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC19983313Gt> iterator() {
        switch (this.$t) {
            case 0:
                return iterator$0(this);
            case 1:
                return iterator$1(this);
            case 2:
                return iterator$2(this);
            default:
                return null;
        }
    }

    public static final Iterator iterator$0(C20307914dB c20307914dB) {
        return new C20307814dA((InterfaceC19983313Gt) c20307914dB.l0, 0);
    }

    public static final Iterator iterator$1(C20307914dB c20307914dB) {
        return new C20307814dA((InterfaceC19983313Gt) c20307914dB.l0, 1);
    }

    public static final Iterator iterator$2(C20307914dB c20307914dB) {
        return ((Sequence) c20307914dB.l0).iterator();
    }

    public C20307914dB(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
