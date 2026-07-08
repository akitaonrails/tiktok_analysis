package X;

import com.bytedance.pitaya.api.PTYCepCallback;
import com.bytedance.pitaya.api.PTYCepFunction;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0yGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851020yGi {
    public static final ReentrantReadWriteLock.ReadLock LIZ;
    public static final ReentrantReadWriteLock.WriteLock LIZIZ;
    public static volatile InterfaceC1610880s1O LIZJ;
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, PTYCepCallback>> LIZLLL;
    public static final ConcurrentHashMap<String, PTYCepFunction> LJ;

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        LIZ = reentrantReadWriteLock.readLock();
        LIZIZ = reentrantReadWriteLock.writeLock();
        LIZLLL = new ConcurrentHashMap<>();
        LJ = new ConcurrentHashMap<>();
    }
}
