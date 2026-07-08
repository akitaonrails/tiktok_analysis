package X;

import com.bytedance.android.starship.engine.graph.foundation.Task;

/* JADX INFO: renamed from: X.0k7Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307190k7Z implements InterfaceC1307250k7f {
    public final long LIZ;
    public final C05XL<Task.Output> LIZIZ;

    @Override // X.InterfaceC1307250k7f
    public final boolean LIZ(Task task) {
        if (task.LL.getId() == this.LIZ) {
            Task.Output output = task.LLILZLL;
            if (output.LIZ == null) {
                this.LIZIZ.LJIIZILJ(output);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1307250k7f
    public final void LIZIZ(C1307230k7d c1307230k7d) {
        this.LIZIZ.LJJJJJ(c1307230k7d);
    }

    public C1307190k7Z(long j, C099F c099f) {
        this.LIZ = j;
        this.LIZIZ = c099f;
    }
}
