package X;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pWW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514860pWW {
    public static final CopyOnWriteArraySet<WeakReference<InterfaceC1741780vQW>> LIZ = new CopyOnWriteArraySet<>();
    public static final ReferenceQueue<InterfaceC1741780vQW> LIZIZ = new ReferenceQueue<>();

    public static void LIZ(InterfaceC1741780vQW interfaceC1741780vQW) {
        for (WeakReference<InterfaceC1741780vQW> weakReference : LIZ) {
            if (Intrinsics.LJFF(weakReference.get(), interfaceC1741780vQW)) {
                weakReference.clear();
                weakReference.enqueue();
                return;
            }
        }
        for (Reference<? extends InterfaceC1741780vQW> referencePoll = LIZIZ.poll(); referencePoll != null; referencePoll = LIZIZ.poll()) {
            C19719512Dh.LIZ(LIZ).remove(referencePoll);
        }
    }
}
