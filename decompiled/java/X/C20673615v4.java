package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.15v4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20673615v4<T> implements InterfaceC20673915v7<T> {
    public static final /* synthetic */ int LIZLLL = 0;
    public final List<InterfaceC20673715v5<T>> LIZ;
    public final T LIZIZ;
    public final int LIZJ;

    public final void LIZ() {
        if (this.LIZJ >= this.LIZ.size()) {
            return;
        }
        ((InterfaceC20673715v5) ListProtector.get(this.LIZ, this.LIZJ)).LIZ(new C20673615v4(this.LIZ, this.LIZJ + 1, this.LIZIZ));
    }

    @Override // X.InterfaceC20673915v7
    public final T context() {
        return this.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20673615v4(List list, int i, Object obj) {
        this.LIZ = list;
        this.LIZIZ = obj;
        this.LIZJ = i;
    }
}
