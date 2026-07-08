package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.15w1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20679515w1<T> implements InterfaceC20680315w9<T> {
    public static final /* synthetic */ int LIZLLL = 0;
    public final List<InterfaceC20680215w8<T>> LIZ;
    public final T LIZIZ;
    public final int LIZJ;

    public final void LIZ() {
        if (this.LIZJ >= this.LIZ.size()) {
            return;
        }
        ((InterfaceC20680215w8) ListProtector.get(this.LIZ, this.LIZJ)).LIZ(new C20679515w1(this.LIZ, this.LIZJ + 1, this.LIZIZ));
    }

    @Override // X.InterfaceC20680315w9
    public final T context() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20679515w1(List list, int i, Object obj) {
        this.LIZ = list;
        this.LIZIZ = obj;
        this.LIZJ = i;
    }
}
