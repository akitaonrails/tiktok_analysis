package X;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.HttpDns;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0oyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493920oyk {
    public final C08I7<String, C1493930oyl> LIZ = new C08I7<>(100);
    public final ConcurrentMap<String, C1493930oyl> LIZIZ = new ConcurrentHashMap();
    public final ConcurrentMap<String, Future<Void>> LIZJ = new ConcurrentHashMap();
    public final ConcurrentMap<String, Future<Void>> LIZLLL = new ConcurrentHashMap();
    public final ConcurrentMap<String, ConcurrentSkipListSet<C1494030oyv>> LJ = new ConcurrentHashMap();
    public final ConcurrentMap<String, ConcurrentSkipListSet<C1494030oyv>> LJFF = new ConcurrentHashMap();
    public final ConcurrentSkipListSet<String> LJI = new ConcurrentSkipListSet<>();
    public final AtomicInteger LJII = new AtomicInteger(0);
    public final AtomicInteger LJIIIIZZ = new AtomicInteger(0);
    public EnumC804620VhM LJIIIZ = EnumC804620VhM.NONE;
    public final Handler LJIIJ;

    public C1493920oyk(WeakHandler weakHandler) {
        this.LJIIJ = weakHandler;
    }

    public final C1493930oyl LIZJ(String str) {
        C1493930oyl c1493930oylLIZIZ;
        synchronized (this.LIZ.LIZJ()) {
            try {
                c1493930oylLIZIZ = this.LIZ.LIZIZ(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1493930oylLIZIZ;
    }

    public final Future<Void> LIZLLL(String str) {
        if (((ConcurrentHashMap) this.LIZJ).containsKey(str)) {
            return (Future) ((ConcurrentHashMap) this.LIZJ).get(str);
        }
        return null;
    }

    public final C1493930oyl LJ(String str) {
        if (((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
            return (C1493930oyl) ((ConcurrentHashMap) this.LIZIZ).get(str);
        }
        return null;
    }

    public final boolean LJFF(String str) {
        return ((ConcurrentHashMap) this.LIZJ).containsKey(str);
    }

    public final void LJI(Context context) {
        EnumC804620VhM enumC804620VhMLJ = C804420Vh2.LJ(context);
        if (enumC804620VhMLJ != this.LJIIIZ) {
            Logger.debug();
            synchronized (this.LIZ.LIZJ()) {
                try {
                    for (Map.Entry<String, C1493930oyl> entry : this.LIZ.LIZJ().entrySet()) {
                        if (entry != null) {
                            if (HttpDns.LJ().LLILLJJLI.get()) {
                                C1493930oyl value = entry.getValue();
                                value.LJFF.removeMessages(10);
                                value.LJFF.removeMessages(12);
                            } else {
                                entry.getValue().LJFF.removeMessages(13);
                            }
                        }
                    }
                    this.LIZ.LIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            for (Map.Entry entry2 : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
                if (entry2 != null) {
                    ((C1493930oyl) entry2.getValue()).LJFF.removeMessages(11);
                }
            }
            ((ConcurrentHashMap) this.LIZIZ).clear();
            if (enumC804620VhMLJ != EnumC804620VhM.NONE) {
                HttpDns.LJ().LIZIZ(EnumC1493810oyZ.CACHE_STALE_NETCHANGED);
                HttpDns.LJ().getClass();
                HttpDns.LJIIJ();
            }
        }
        this.LJIIIZ = enumC804620VhMLJ;
    }

    public final void LJII(String str) {
        C1493930oyl c1493930oylLIZJ = LIZJ(str);
        if (c1493930oylLIZJ != null) {
            if (HttpDns.LJ().LLILLJJLI.get()) {
                c1493930oylLIZJ.LJFF.removeMessages(10);
                c1493930oylLIZJ.LJFF.removeMessages(12);
            } else {
                c1493930oylLIZJ.LJFF.removeMessages(13);
            }
            synchronized (this.LIZ.LIZJ()) {
                try {
                    this.LIZ.LJ(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJIIIIZZ(C1494030oyv c1494030oyv) {
        String host = c1494030oyv.getHost();
        if (((ConcurrentHashMap) this.LJ).containsKey(host)) {
            ((ConcurrentSkipListSet) ((ConcurrentHashMap) this.LJ).get(host)).remove(c1494030oyv);
            if (((ConcurrentSkipListSet) ((ConcurrentHashMap) this.LJ).get(host)).isEmpty()) {
                ((ConcurrentHashMap) this.LJ).remove(host);
            }
        }
    }

    public final void LJIIIZ(C1494030oyv c1494030oyv) {
        String host = c1494030oyv.getHost();
        if (((ConcurrentHashMap) this.LJFF).containsKey(host)) {
            ((ConcurrentSkipListSet) ((ConcurrentHashMap) this.LJFF).get(host)).remove(c1494030oyv);
            if (((ConcurrentSkipListSet) ((ConcurrentHashMap) this.LJFF).get(host)).isEmpty()) {
                ((ConcurrentHashMap) this.LJFF).remove(host);
            }
        }
    }

    public final boolean LJIIJ(C1494030oyv c1494030oyv) {
        if (((ConcurrentHashMap) this.LJ).containsKey(c1494030oyv.getHost())) {
            if (((ConcurrentSkipListSet) ((ConcurrentHashMap) this.LJ).get(c1494030oyv.getHost())).contains(c1494030oyv)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final synchronized void LIZ(String str, C1494030oyv c1494030oyv) {
        if (((ConcurrentHashMap) this.LJ).containsKey(str)) {
            ((ConcurrentSkipListSet) ((ConcurrentHashMap) this.LJ).get(str)).add(c1494030oyv);
        } else {
            ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet();
            concurrentSkipListSet.add(c1494030oyv);
            ((ConcurrentHashMap) this.LJ).put(str, concurrentSkipListSet);
        }
    }

    public final void LIZIZ(String str, C1493930oyl c1493930oyl) {
        C1493930oyl c1493930oylLJ = LJ(str);
        if (c1493930oylLJ != null) {
            c1493930oylLJ.LJFF.removeMessages(11);
        }
        Message messageObtain = Message.obtain();
        messageObtain.obj = c1493930oyl;
        messageObtain.what = 11;
        c1493930oyl.LIZ(messageObtain);
        c1493930oyl.LJFF.sendMessageDelayed(messageObtain, ((long) HttpDns.LJ().LLIZ.get()) * 1000);
        ((ConcurrentHashMap) this.LIZIZ).put(str, c1493930oyl);
    }
}
