package X;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.applog.priority.original.InsertCacheConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS648S0100000_34;

/* JADX INFO: renamed from: X.1Aq1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191631Aq1 implements InterfaceC497601wk {
    public final InsertCacheConfig LL;
    public final Function0<SQLiteDatabase> LLILLJJLI;
    public final Function2<C2191641Aq2, String, C2191641Aq2> LLILLL;
    public AnonymousClass0956 LLILZ;
    public final ReentrantLock LLILZIL = new ReentrantLock();
    public final List<Pair<C2191641Aq2, String>> LLILZLL = new ArrayList();
    public final C418201jw LLIZ = new C418201jw(this);
    public final boolean LLIZLLLIL;

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return C0PEM.LIZJ;
    }

    public final void LIZ(int i) {
        SQLiteDatabase sQLiteDatabaseInvoke;
        if (this.LLIZLLLIL) {
            Set<Integer> set = this.LL.notFlushType;
            if (set != null && set.contains(Integer.valueOf(i))) {
                return;
            }
            try {
                this.LLILZIL.lock();
                if (((ArrayList) this.LLILZLL).isEmpty()) {
                    this.LLILZIL.unlock();
                    return;
                }
                try {
                    this.LLILLJJLI.invoke().beginTransaction();
                    for (Pair<C2191641Aq2, String> pair : this.LLILZLL) {
                        this.LLILLL.invoke(pair.getFirst(), pair.getSecond());
                    }
                    ((ArrayList) this.LLILZLL).clear();
                    this.LLILLJJLI.invoke().setTransactionSuccessful();
                    sQLiteDatabaseInvoke = this.LLILLJJLI.invoke();
                } catch (Throwable th) {
                    try {
                        sQLiteDatabaseInvoke = this.LLILLJJLI.invoke();
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                        this.LLILLJJLI.invoke().endTransaction();
                    }
                }
                sQLiteDatabaseInvoke.endTransaction();
            } finally {
                try {
                } finally {
                }
            }
            this.LLILZIL.unlock();
        }
    }

    public C2191631Aq1(InsertCacheConfig insertCacheConfig, AwS578S0100000_34 awS578S0100000_34, AwS648S0100000_34 awS648S0100000_34) {
        boolean z;
        this.LL = insertCacheConfig;
        this.LLILLJJLI = awS578S0100000_34;
        this.LLILLL = awS648S0100000_34;
        if (insertCacheConfig.cacheEnable && insertCacheConfig.maxCacheSize > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
    }
}
