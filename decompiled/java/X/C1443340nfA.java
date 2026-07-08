package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0nfA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443340nfA extends C1619110sEf implements InterfaceC19330810jy {
    public InterfaceC539120LCk LL;
    public InnerPushMessage LLILLJJLI;
    public final ConcurrentHashMap<Long, WeakReference<C1443330nf9>> LLILLL = new ConcurrentHashMap<>();

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return new int[]{1002};
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LIZIZ(InnerPushMessage innerPushMessage) {
        long id;
        C1443330nf9 c1443330nf9;
        ConcurrentHashMap<Long, WeakReference<C1443330nf9>> concurrentHashMap = this.LLILLL;
        if (innerPushMessage != null) {
            id = innerPushMessage.getId();
        } else {
            id = -1;
        }
        WeakReference<C1443330nf9> weakReference = concurrentHashMap.get(Long.valueOf(id));
        if (weakReference != null && (c1443330nf9 = weakReference.get()) != null) {
            c1443330nf9.LLIZLLLIL = true;
        }
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        long id;
        C1443330nf9 c1443330nf9;
        this.LL = c20663515tR;
        this.LLILLJJLI = innerPushMessage;
        ConcurrentHashMap<Long, WeakReference<C1443330nf9>> concurrentHashMap = this.LLILLL;
        if (innerPushMessage != null) {
            id = innerPushMessage.getId();
        } else {
            id = -1;
        }
        WeakReference<C1443330nf9> weakReference = concurrentHashMap.get(Long.valueOf(id));
        if (weakReference == null || (c1443330nf9 = weakReference.get()) == null) {
            return null;
        }
        if (c1443330nf9.getShouldOptimizePostFailedPush() && (!c1443330nf9.getOptimizePostErrorMsg())) {
            return null;
        }
        return new C20663815tU(0, c1443330nf9);
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIL(int i, InnerPushMessage innerPushMessage) {
        long id;
        C1443330nf9 c1443330nf9;
        Function0<Unit> retryClickListener;
        ConcurrentHashMap<Long, WeakReference<C1443330nf9>> concurrentHashMap = this.LLILLL;
        if (innerPushMessage != null) {
            id = innerPushMessage.getId();
        } else {
            id = -1;
        }
        WeakReference<C1443330nf9> weakReference = concurrentHashMap.get(Long.valueOf(id));
        if (weakReference != null && (c1443330nf9 = weakReference.get()) != null && c1443330nf9.getShouldOptimizePostFailedPush() && !c1443330nf9.getOptimizePostErrorMsg() && (retryClickListener = c1443330nf9.getRetryClickListener()) != null) {
            retryClickListener.invoke();
        }
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
        long id;
        C1443330nf9 c1443330nf9;
        ConcurrentHashMap<Long, WeakReference<C1443330nf9>> concurrentHashMap = this.LLILLL;
        if (innerPushMessage != null) {
            id = innerPushMessage.getId();
        } else {
            id = -1;
        }
        WeakReference<C1443330nf9> weakReference = concurrentHashMap.get(Long.valueOf(id));
        if (weakReference != null && (c1443330nf9 = weakReference.get()) != null) {
            InterfaceC1631620sYq<? super Boolean, ? super String, ? super Boolean, Unit> interfaceC1631620sYq = c1443330nf9.LLJI;
            if (interfaceC1631620sYq != null) {
                interfaceC1631620sYq.invoke(Boolean.valueOf(c1443330nf9.LLJILJIL), str, Boolean.valueOf(z));
            }
            c1443330nf9.LLIZLLLIL = false;
        }
        if (innerPushMessage != null) {
            this.LLILLL.remove(Long.valueOf(innerPushMessage.getId()));
        }
    }
}
