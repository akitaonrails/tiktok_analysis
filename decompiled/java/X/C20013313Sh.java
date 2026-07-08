package X;

import Y.ARunnableS14S1200000_9;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.music.cache.CacheResponse;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.13Sh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20013313Sh {
    public final Context LIZ;
    public final C199596137q LIZIZ;
    public final C0W1V LIZJ;
    public final Map<String, CacheResponse> LIZLLL;
    public final ReentrantLock LJ;
    public final ExecutorService LJFF;

    public static C0VSJ LIZLLL(Context context) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ctNetCache_");
        sbLIZ.append(curUserId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        String path = C786410Ut5.w2(context).getPath();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(path);
        sbLIZ2.append(File.separator);
        sbLIZ2.append(strLIZIZ);
        return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final boolean LIZ(String str) {
        boolean z;
        ReentrantLock reentrantLock = this.LJ;
        reentrantLock.lock();
        try {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Error: containsKey: ");
                sbLIZ.append(e);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            if (this.LIZIZ.LJIIIZ(str) == null) {
                if (LIZIZ(str)) {
                }
                z = false;
                reentrantLock.unlock();
                return z;
            }
            z = true;
            reentrantLock.unlock();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean LIZIZ(String str) {
        C0W1V c0w1v;
        boolean z;
        ReentrantLock reentrantLock = this.LJ;
        reentrantLock.lock();
        try {
            c0w1v = this.LIZJ;
            z = false;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
        if (c0w1v == null) {
            reentrantLock.unlock();
            return false;
        }
        try {
            if (c0w1v.LLIZLLLIL == null) {
                reentrantLock.unlock();
                return false;
            }
            try {
                C0W1X c0w1xLJIILL = c0w1v.LJIILL(str);
                if (c0w1xLJIILL != null) {
                    z = true;
                    c0w1xLJIILL.close();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Error: containsKeyFromDiskCache: ");
                sbLIZ.append(e);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            reentrantLock.unlock();
            return z;
        } finally {
            TryCatchGuardChecker.doCheck(th);
        }
        reentrantLock.unlock();
        throw th;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v1 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final com.ss.android.ugc.aweme.music.cache.CacheResponse LIZJ(java.lang.String r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r4 = r5.LJ
            r4.lock()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()     // Catch: java.lang.Throwable -> L68
            X.0XPy r0 = (X.AbstractC848400XPy) r0     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = r0.getCurUserId()     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L68
            r1.append(r6)     // Catch: java.lang.Throwable -> L68
            r0 = 95
            r1.append(r0)     // Catch: java.lang.Throwable -> L68
            r1.append(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L68
            boolean r0 = r5.LIZ(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L3c
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = "No cache for, key: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L68
            r1.append(r3)     // Catch: java.lang.Throwable -> L68
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L68
            r4.unlock()
            r0 = 0
            return r0
        L3c:
            X.137q r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = r0.LJIIIZ(r3)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L54
            com.ss.android.ugc.aweme.music.cache.CacheResponse r2 = r5.LJ(r3)     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L51
            X.137q r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L68
            X.137o<K, V> r0 = r0.LL     // Catch: java.lang.Throwable -> L68
            r0.put(r3, r2)     // Catch: java.lang.Throwable -> L68
        L51:
            com.ss.android.ugc.aweme.music.cache.CacheResponse r2 = (com.ss.android.ugc.aweme.music.cache.CacheResponse) r2     // Catch: java.lang.Throwable -> L68
            goto L64
        L54:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = "Retrieved from in-memory cache, key: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L68
            r1.append(r3)     // Catch: java.lang.Throwable -> L68
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L68
            goto L51
        L64:
            r4.unlock()
            return r2
        L68:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L68
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20013313Sh.LIZJ(java.lang.String):com.ss.android.ugc.aweme.music.cache.CacheResponse");
    }

    public final CacheResponse LJ(String str) {
        ObjectInputStream objectInputStream;
        C0W1X c0w1xLJIILL;
        ReentrantLock reentrantLock = this.LJ;
        reentrantLock.lock();
        try {
            C0W1V c0w1v = this.LIZJ;
            ObjectInputStream objectInputStream2 = null;
            cacheResponse = null;
            cacheResponse = null;
            CacheResponse cacheResponse = null;
            try {
                if (c0w1v == null) {
                    reentrantLock.unlock();
                    return null;
                }
                try {
                    c0w1xLJIILL = c0w1v.LJIILL(str);
                } catch (Exception e) {
                    e = e;
                    objectInputStream = null;
                }
                if (c0w1xLJIILL == null) {
                    reentrantLock.unlock();
                    return null;
                }
                objectInputStream = new ObjectInputStream(c0w1xLJIILL.LL[0]);
                try {
                    try {
                        Object object = objectInputStream.readObject();
                        if (object instanceof CacheResponse) {
                            cacheResponse = (CacheResponse) object;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Error: getFromDiskCache: ");
                        sbLIZ.append(e);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    C2260008tK.LIZ(objectInputStream);
                    reentrantLock.unlock();
                    return cacheResponse;
                } catch (Throwable th) {
                    th = th;
                    objectInputStream2 = objectInputStream;
                }
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: getFromDiskCache: ");
                sbLIZ2.append(e);
                C2188811AlT.LIZIZ(sbLIZ2);
                C2260008tK.LIZ(objectInputStream);
                reentrantLock.unlock();
                return cacheResponse;
            } catch (Throwable th2) {
                th = th2;
            }
            TryCatchGuardChecker.doCheck(th);
            C2260008tK.LIZ(objectInputStream2);
            throw th;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final void LJFF(String str, CacheResponse cacheResponse) {
        ReentrantLock reentrantLock = this.LJ;
        reentrantLock.lock();
        if (str == null) {
            reentrantLock.unlock();
            return;
        }
        try {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(curUserId);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            this.LIZIZ.put(strLIZIZ, cacheResponse);
            reentrantLock = this.LJ;
            reentrantLock.lock();
            try {
                this.LJFF.submit(new ARunnableS14S1200000_9(this, cacheResponse, strLIZIZ, 12));
                reentrantLock.unlock();
                reentrantLock.unlock();
            } finally {
                TryCatchGuardChecker.doCheck(th);
                reentrantLock.unlock();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void LJI(String str, CacheResponse cacheResponse) {
        C0W1T c0w1tLJII;
        C0W1F c0w1fLIZIZ;
        ObjectOutputStream objectOutputStream;
        ReentrantLock reentrantLock = this.LJ;
        reentrantLock.lock();
        try {
            C0W1V c0w1v = this.LIZJ;
            if (c0w1v == null) {
                reentrantLock.unlock();
                return;
            }
            ObjectOutputStream objectOutputStream2 = null;
            try {
                try {
                    c0w1tLJII = c0w1v.LJII(str);
                    if (c0w1tLJII != null) {
                        c0w1fLIZIZ = c0w1tLJII.LIZIZ();
                    } else {
                        c0w1fLIZIZ = null;
                    }
                    objectOutputStream = new ObjectOutputStream(c0w1fLIZIZ);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                objectOutputStream.writeObject(cacheResponse);
                if (c0w1tLJII != null) {
                    c0w1tLJII.LIZ();
                }
                C0W1V c0w1v2 = this.LIZJ;
                if (c0w1v2 != null) {
                    c0w1v2.flush();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Value stored to disk, key: ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                C2260008tK.LIZ(objectOutputStream);
            } catch (Exception e2) {
                e = e2;
                objectOutputStream2 = objectOutputStream;
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: putToDiskCache: ");
                sbLIZ2.append(e);
                C2188811AlT.LIZIZ(sbLIZ2);
                C2260008tK.LIZ(objectOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream2 = objectOutputStream;
                TryCatchGuardChecker.doCheck(th);
                C2260008tK.LIZ(objectOutputStream2);
                throw th;
            }
            reentrantLock.unlock();
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            reentrantLock.unlock();
            throw th3;
        }
    }

    public C20013313Sh(int i, long j, long j2, Context context) {
        this.LIZ = context;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LJ = reentrantLock;
        C2123408To c2123408To = new C2123408To(C0WQX.SERIAL);
        c2123408To.LIZIZ = "Net_Cache_Exec";
        this.LJFF = C823050WQl.LIZ(new C2123508Tp(c2123408To));
        reentrantLock.lock();
        try {
            C199593137n c199593137n = new C199593137n();
            c199593137n.LIZLLL(j2);
            c199593137n.LJ(new AnonymousClass1385() { // from class: X.0r7v
                @Override // X.AnonymousClass1385
                public final void LIZJ(C199603137x<?, ?> c199603137x) {
                    Object key = c199603137x.getKey();
                    c199603137x.getValue();
                    C20013313Sh c20013313Sh = this.LL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("memoryCache removalListener:: key :: ");
                    sbLIZ.append(key);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c20013313Sh.getClass();
                }
            });
            this.LIZIZ = c199593137n.LIZ();
            try {
                C0VSJ c0vsjLIZLLL = LIZLLL(context);
                C0W1V c0w1vLJIIZILJ = C0W1V.LJIIZILJ(c0vsjLIZLLL, i, j * 1048576);
                this.LIZJ = c0w1vLJIIZILJ;
                Map<String, CacheResponse> map = (Map) C1965507mv.LIZJ(c0w1vLJIIZILJ, "lruEntries");
                this.LIZLLL = map;
                c0vsjLIZLLL.toString();
                c0vsjLIZLLL.exists();
                Objects.toString(map);
                if (map != null) {
                    map.size();
                }
                synchronized (c0w1vLJIIZILJ) {
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                e.toString();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }
}
