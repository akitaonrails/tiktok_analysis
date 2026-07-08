package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BD4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BD4 implements C1BDX {
    public static long LIZ;

    @Override // X.C1BDX
    public final void LIZIZ() {
    }

    @Override // X.C1BDX
    public final void LIZ(C1BCC c1bcc) {
        if (Intrinsics.LJFF("", "task_tag_boot_finish")) {
            LIZ = System.currentTimeMillis();
        }
    }
}
