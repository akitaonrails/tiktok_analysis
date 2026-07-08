package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823230WRd extends C0WR9 {
    public static final C823230WRd LIZIZ = new C823230WRd();
    public static final ReadWriteLock LIZJ = new ReentrantReadWriteLock();
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final AtomicBoolean LJ = new AtomicBoolean(false);

    public C823230WRd() {
        super(new LinkedHashMap());
    }

    public final void LJFF() {
        AtomicBoolean atomicBoolean = LJ;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        EnumC823400WRu enumC823400WRu = EnumC823400WRu.Bool;
        super.LIZ("Pipeline", "is_not_consent", new C0WR8(enumC823400WRu, AFwS200S0000000_13.get$arr$(343)), false);
        super.LIZ("Pipeline", "is_login", new C0WR8(enumC823400WRu, AFwS200S0000000_13.get$arr$(344)), false);
        super.LIZ("Pipeline", "is_account_deleted", new C0WR8(enumC823400WRu, AFwS200S0000000_13.get$arr$(345)), false);
        super.LIZ("Pipeline", "is_kids_mode", new C0WR8(enumC823400WRu, AFwS200S0000000_13.get$arr$(346)), false);
        super.LIZ("Pipeline", "is_minor", new C0WR8(enumC823400WRu, AFwS200S0000000_13.get$arr$(347)), false);
        EnumC823400WRu enumC823400WRu2 = EnumC823400WRu.String;
        super.LIZ("Pipeline", "age", new C0WR8(enumC823400WRu2, AFwS200S0000000_13.get$arr$(348)), false);
        super.LIZ("Pipeline", "store_region", new C0WR8(enumC823400WRu2, AFwS200S0000000_13.get$arr$(349)), false);
        super.LIZ("Pipeline", "store_region_src", new C0WR8(enumC823400WRu2, AFwS200S0000000_13.get$arr$(350)), false);
    }

    @Override // X.C0WR9
    public final String toString() {
        Lock lock = ((ReentrantReadWriteLock) LIZJ).readLock();
        lock.lock();
        try {
            String string = super.toString();
            lock.unlock();
            return string;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    @Override // X.C0WR9
    public final C0WRM LIZIZ() {
        return C0WRM.Global;
    }

    @Override // X.C0WR9
    public final void LIZJ(Map<String, C0WR6> map) {
        Lock lock = ((ReentrantReadWriteLock) LIZJ).readLock();
        lock.lock();
        try {
            super.LIZJ(map);
            lock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public final void LJ(C823300WRk c823300WRk) {
        AtomicBoolean atomicBoolean = LIZLLL;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        Lock lockWriteLock = ((ReentrantReadWriteLock) LIZJ).writeLock();
        lockWriteLock.lock();
        try {
            final EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
            super.LIZ("Pipeline", "pumbaa_app_version", new C0WQ8(enumC823400WRu, c823300WRk.LIZJ), false);
            EnumC823400WRu enumC823400WRu2 = EnumC823400WRu.Long;
            super.LIZ("Pipeline", "pumbaa_version_code", new C0WQ8(enumC823400WRu2, Long.valueOf(c823300WRk.LIZIZ)), false);
            EnumC823400WRu enumC823400WRu3 = EnumC823400WRu.Bool;
            super.LIZ("Pipeline", "is_test_env", new C0WQ8(enumC823400WRu3, Boolean.valueOf(c823300WRk.LIZ)), false);
            super.LIZ("Pipeline", "is_before_init", new C0WR8(enumC823400WRu3, new C823220WRc()), false);
            super.LIZ("Pipeline", "sdk_version", new C0WQ8(enumC823400WRu, "6.22.0.1-bugfix"), false);
            final C2123808Ts c2123808Ts = new C2123808Ts();
            super.LIZ("Pipeline", "process_name", new C0WR6(enumC823400WRu, c2123808Ts) { // from class: X.0WR4
                public final Function0<Object> LIZJ;
                public Object LIZLLL;

                @Override // X.C0WR6
                public final Object LIZIZ() {
                    Object obj = this.LIZLLL;
                    if (obj == null || Intrinsics.LJFF(obj, "pns-null")) {
                        this.LIZLLL = this.LIZJ.invoke();
                    }
                    return this.LIZLLL;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LazyInitValue{type=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append('}');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZJ = c2123808Ts;
                }
            }, false);
            super.LIZ("Pipeline", "pl_page_stack", new C0WR8(enumC823400WRu, new C0WRE()), false);
            super.LIZ("Pipeline", "background_duration", new C0WR8(enumC823400WRu2, new C0WRF()), false);
            super.LIZ("Pipeline", "background_status", new C0WR8(enumC823400WRu, new C823250WRf()), false);
            LIZIZ.LJFF();
            lockWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lockWriteLock.unlock();
            throw th;
        }
    }

    @Override // X.C0WR9, X.C0WRO
    public final C0WR6 query(String str) {
        Lock lock = ((ReentrantReadWriteLock) LIZJ).readLock();
        lock.lock();
        try {
            C0WR6 c0wr6Query = super.query(str);
            lock.unlock();
            return c0wr6Query;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    @Override // X.C0WR9
    public final void LIZ(String str, String str2, C0WR6 c0wr6, boolean z) {
        Lock lockWriteLock = ((ReentrantReadWriteLock) LIZJ).writeLock();
        lockWriteLock.lock();
        try {
            super.LIZ("HostApp", str2, c0wr6, z);
            lockWriteLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lockWriteLock.unlock();
            throw th;
        }
    }
}
