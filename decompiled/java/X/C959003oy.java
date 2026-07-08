package X;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C959003oy {
    public static final <T> Object LIZ(ReentrantLock reentrantLock, Function0<? extends T> function0) {
        Object c098200Yq;
        reentrantLock.lock();
        try {
            c098200Yq = function0.invoke();
            C189200o6.m2constructorimpl(c098200Yq);
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        reentrantLock.unlock();
        return c098200Yq;
    }
}
