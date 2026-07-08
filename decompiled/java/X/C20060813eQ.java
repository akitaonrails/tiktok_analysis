package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.13eQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20060813eQ {
    public static final <T extends AbstractC20055413dY & InterfaceC20062713ej> void LIZ(T t, Function0<Unit> function0) {
        C20061713eZ c20061713eZ = t.LLIZ;
        if (c20061713eZ == null) {
            c20061713eZ = new C20061713eZ(t);
            t.LLIZ = c20061713eZ;
        }
        C20052513d5.LJI(t).getSnapshotObserver().LIZ(c20061713eZ, C20061713eZ.LLILLJJLI, function0);
    }
}
