package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YJB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YJB implements InterfaceC865750Xxl {
    public final C0YEM LL;
    public final C0YAV LLILLJJLI;
    public final C01GW LLILLL;
    public final ReentrantReadWriteLock LLILZ;

    public final C0YJC LIZLLL() {
        return (C0YJC) this.LLILLL.getValue();
    }

    public final void LJ() {
        int readHoldCount;
        ReentrantReadWriteLock reentrantReadWriteLock = this.LLILZ;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            LIZLLL().LIZ.LIZ.evictAll();
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public C0YJB(C0YEM c0yem) {
        C0YAV c0yav = new C0YAV(c0yem);
        this.LL = c0yem;
        this.LLILLJJLI = c0yav;
        this.LLILLL = C452501pT.LIZIZ(new AwS415S0200000_14((C0YJC) null, this, 7));
        this.LLILZ = new ReentrantReadWriteLock();
    }

    public final boolean LIZIZ(String str) {
        int readHoldCount;
        int readHoldCount2;
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteConv, convId ");
        sbLIZ.append(str);
        C868780Y6i.LJ(c868780Y6iLIZLLL, "ConversationKvRepo", C2188811AlT.LIZIZ(sbLIZ), 4);
        int i = 0;
        if (str == null || str.length() == 0) {
            return false;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.LLILZ;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            boolean zLIZIZ = this.LLILLJJLI.LIZIZ(str);
            if (zLIZIZ) {
                ReentrantReadWriteLock reentrantReadWriteLock2 = this.LLILZ;
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock2.readLock();
                if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
                    readHoldCount2 = reentrantReadWriteLock2.getReadHoldCount();
                    for (int i3 = 0; i3 < readHoldCount2; i3++) {
                        lock2.unlock();
                    }
                } else {
                    readHoldCount2 = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                writeLock2.lock();
                try {
                    LIZLLL().LIZLLL(str);
                    for (int i4 = 0; i4 < readHoldCount2; i4++) {
                        lock2.lock();
                    }
                    writeLock2.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    for (int i5 = 0; i5 < readHoldCount2; i5++) {
                        lock2.lock();
                    }
                    writeLock2.unlock();
                    throw th;
                }
            }
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            return zLIZIZ;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    public final boolean LIZJ(String[] strArr) {
        int readHoldCount;
        int readHoldCount2;
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteConvs, ids ");
        sbLIZ.append(strArr);
        C868780Y6i.LJ(c868780Y6iLIZLLL, "ConversationKvRepo", C2188811AlT.LIZIZ(sbLIZ), 4);
        ReentrantReadWriteLock reentrantReadWriteLock = this.LLILZ;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            boolean zLIZJ = this.LLILLJJLI.LIZJ(strArr);
            if (zLIZJ) {
                ReentrantReadWriteLock reentrantReadWriteLock2 = this.LLILZ;
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock2.readLock();
                if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
                    readHoldCount2 = reentrantReadWriteLock2.getReadHoldCount();
                    for (int i3 = 0; i3 < readHoldCount2; i3++) {
                        lock2.unlock();
                    }
                } else {
                    readHoldCount2 = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                writeLock2.lock();
                try {
                    C0YJC c0yjcLIZLLL = LIZLLL();
                    c0yjcLIZLLL.getClass();
                    if (strArr == null) {
                        strArr = new String[0];
                    }
                    for (String str : strArr) {
                        if (str != null) {
                            c0yjcLIZLLL.LIZLLL(str);
                        }
                    }
                    for (int i4 = 0; i4 < readHoldCount2; i4++) {
                        lock2.lock();
                    }
                    writeLock2.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    for (int i5 = 0; i5 < readHoldCount2; i5++) {
                        lock2.lock();
                    }
                    writeLock2.unlock();
                    throw th;
                }
            }
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            return zLIZJ;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    @Override // X.InterfaceC865750Xxl
    public final boolean LLJL(Map<String, ? extends Map<String, String>> map) {
        int readHoldCount;
        int i = 0;
        if (map.isEmpty()) {
            return false;
        }
        boolean zLLJL = this.LLILLJJLI.LLJL(map);
        if (zLLJL) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.LLILZ;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock.unlock();
                }
            } else {
                readHoldCount = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    String str = (String) entry.getKey();
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        LIZLLL().LIZJ(str, (String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        }
        return zLLJL;
    }

    public final boolean LIZ(String str, String str2) {
        int readHoldCount;
        int readHoldCount2;
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delete, conversationId ");
        sbLIZ.append(str);
        sbLIZ.append(", key ");
        sbLIZ.append("conv_history_cursor");
        C868780Y6i.LJ(c868780Y6iLIZLLL, "ConversationKvRepo", C2188811AlT.LIZIZ(sbLIZ), 4);
        int i = 0;
        if (str == null || str.length() == 0 || "conv_history_cursor".length() == 0) {
            return false;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.LLILZ;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            boolean zLIZ = this.LLILLJJLI.LIZ(str, "conv_history_cursor");
            if (zLIZ) {
                ReentrantReadWriteLock reentrantReadWriteLock2 = this.LLILZ;
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock2.readLock();
                if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
                    readHoldCount2 = reentrantReadWriteLock2.getReadHoldCount();
                    for (int i3 = 0; i3 < readHoldCount2; i3++) {
                        lock2.unlock();
                    }
                } else {
                    readHoldCount2 = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                writeLock2.lock();
                try {
                    C0YJC c0yjcLIZLLL = LIZLLL();
                    c0yjcLIZLLL.getClass();
                    String strLIZIZ = C0YJC.LIZIZ(str, "conv_history_cursor");
                    if (strLIZIZ != null) {
                        c0yjcLIZLLL.LIZ.LIZ.remove(strLIZIZ);
                    }
                    for (int i4 = 0; i4 < readHoldCount2; i4++) {
                        lock2.lock();
                    }
                    writeLock2.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    for (int i5 = 0; i5 < readHoldCount2; i5++) {
                        lock2.lock();
                    }
                    writeLock2.unlock();
                    throw th;
                }
            }
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            return zLIZ;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    @Override // X.InterfaceC865750Xxl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJFF(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YJB.LJFF(java.lang.String, java.lang.String):java.lang.String");
    }

    public final void LJI(String str, boolean z) {
        if (this.LL.LJIIIZ().LJJLIIIIJ.LJIIIZ.reportCacheHit && this.LL.LJIIZILJ().LJFF().getEventTracker().LIZJ(this.LL.LJIIIZ().LJJLIIIIJ.LJIIIZ.cacheHitSamplingRate)) {
            C0YJ9 c0yj9 = new C0YJ9(this.LL);
            c0yj9.LIZJ("imsdk_cache_hit");
            c0yj9.LIZ("conv_kv", "entity_type");
            c0yj9.LIZ(Integer.valueOf(z ? 1 : 0), "hit_cache");
            c0yj9.LIZ(str, "operation");
            c0yj9.LJFF();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    @Override // X.InterfaceC865750Xxl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> LLIL(java.util.List<java.lang.String> r14, java.util.List<java.lang.String> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YJB.LLIL(java.util.List, java.util.List):java.util.Map");
    }

    @Override // X.InterfaceC865750Xxl
    public final boolean LLLIIIIL(String str, Map<String, String> map) {
        int readHoldCount;
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("batchUpdate, conversationId ");
        sbLIZ.append(str);
        sbLIZ.append(", kvMap ");
        sbLIZ.append(map);
        C868780Y6i.LJ(c868780Y6iLIZLLL, "ConversationKvRepo", C2188811AlT.LIZIZ(sbLIZ), 4);
        int i = 0;
        if (str == null || str.length() == 0) {
            return false;
        }
        boolean zLLLIIIIL = this.LLILLJJLI.LLLIIIIL(str, map);
        if (zLLLIIIIL) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.LLILZ;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock.unlock();
                }
            } else {
                readHoldCount = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    LIZLLL().LIZJ(str, entry.getKey(), entry.getValue());
                }
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        }
        return zLLLIIIIL;
    }

    @Override // X.InterfaceC865750Xxl
    public final boolean LLFZ(String str, String str2, String str3) {
        boolean z;
        int readHoldCount;
        int i = 0;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && str2 != null && str2.length() != 0) {
            ReentrantReadWriteLock.ReadLock lock = this.LLILZ.readLock();
            lock.lock();
            try {
                String strLIZ = LIZLLL().LIZ(str, str2);
                lock.unlock();
                if (Intrinsics.LJFF(strLIZ, str3)) {
                    C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("insertOrUpdate skip when the value has not changed: conversationId ");
                    sbLIZ.append(str);
                    sbLIZ.append(", key ");
                    sbLIZ.append(str2);
                    sbLIZ.append(", value ");
                    sbLIZ.append(str3);
                    sbLIZ.append(", ");
                    sbLIZ.append(C786410Ut5.u3().getName());
                    C868780Y6i.LJ(c868780Y6iLIZLLL, "ConversationKvRepo", C2188811AlT.LIZIZ(sbLIZ), 4);
                    LJI("write", true);
                    return true;
                }
                LJI("write", false);
                boolean zLLFZ = this.LLILLJJLI.LLFZ(str, str2, str3);
                if (zLLFZ) {
                    ReentrantReadWriteLock reentrantReadWriteLock = this.LLILZ;
                    ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                    if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                        readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                        for (int i2 = 0; i2 < readHoldCount; i2++) {
                            lock2.unlock();
                        }
                    } else {
                        readHoldCount = 0;
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        C868780Y6i c868780Y6iLIZLLL2 = this.LL.LIZLLL();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("insertOrUpdate success: convId ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", key ");
                        sbLIZ2.append(str2);
                        sbLIZ2.append(", value ");
                        sbLIZ2.append(str3);
                        C868780Y6i.LJ(c868780Y6iLIZLLL2, "ConversationKvRepo", C2188811AlT.LIZIZ(sbLIZ2), 4);
                        LIZLLL().LIZJ(str, str2, str3);
                        while (i < readHoldCount) {
                            lock2.lock();
                            i++;
                        }
                        writeLock.unlock();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        while (i < readHoldCount) {
                            lock2.lock();
                            i++;
                        }
                        writeLock.unlock();
                        throw th;
                    }
                }
                return zLLFZ;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                lock.unlock();
                throw th2;
            }
        }
        C868780Y6i c868780Y6iLIZLLL3 = this.LL.LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("insertOrUpdate conversationId or key is empty, ");
        sbLIZ3.append(C786410Ut5.u3().getName());
        C868780Y6i.LJ(c868780Y6iLIZLLL3, "ConversationKvRepo", C2188811AlT.LIZIZ(sbLIZ3), 4);
        return false;
    }
}
