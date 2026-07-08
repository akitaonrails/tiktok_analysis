package X;

import android.util.LruCache;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.06wL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1769106wL implements InterfaceC863600XuI {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC863600XuI
    public final void LIZIZ(C0YMW c0ymw) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c0ymw);
                break;
            case 1:
                LIZIZ$1(this, c0ymw);
                break;
            case 2:
                LIZIZ$2(this, c0ymw);
                break;
        }
    }

    @Override // X.InterfaceC863600XuI
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
            case 2:
                onSuccess$2(this, obj);
                break;
        }
    }

    public static final void LIZIZ$0(C1769106wL c1769106wL, C0YMW c0ymw) {
        String statusMsg;
        InterfaceC1757506uT interfaceC1757506uT = (InterfaceC1757506uT) c1769106wL.l0;
        if (interfaceC1757506uT != null) {
            C1736606r6 c1736606r6 = (C1736606r6) c1769106wL.l1;
            if (c0ymw != null) {
                statusMsg = c0ymw.getStatusMsg();
            } else {
                statusMsg = null;
            }
            interfaceC1757506uT.LIZIZ(c1736606r6, -2, statusMsg);
        }
    }

    public static final void LIZIZ$1(C1769106wL c1769106wL, C0YMW c0ymw) {
        String statusMsg;
        InterfaceC1757506uT interfaceC1757506uT = (InterfaceC1757506uT) c1769106wL.l0;
        if (interfaceC1757506uT != null) {
            C1736606r6 c1736606r6 = (C1736606r6) c1769106wL.l1;
            if (c0ymw != null) {
                statusMsg = c0ymw.getStatusMsg();
            } else {
                statusMsg = null;
            }
            interfaceC1757506uT.LIZIZ(c1736606r6, -2, statusMsg);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ$2(C1769106wL c1769106wL, C0YMW c0ymw) {
        InterfaceC1461705nr interfaceC1461705nr = (InterfaceC1461705nr) c1769106wL.l0;
        if (interfaceC1461705nr != null) {
            interfaceC1461705nr.LIZ((C1462005nu) ((C259800zU) c1769106wL.l1).element, EnumC1461205nm.UPDATE_MEMBER);
        }
    }

    public static final void onSuccess$0(C1769106wL c1769106wL, Object obj) {
        InterfaceC1757506uT interfaceC1757506uT = (InterfaceC1757506uT) c1769106wL.l0;
        if (interfaceC1757506uT != null) {
            interfaceC1757506uT.LIZIZ((C1736606r6) c1769106wL.l1, 1, null);
        }
        ((InterfaceC1757006uO) c1769106wL.l2).LIZJ((C1736606r6) c1769106wL.l1);
    }

    public static final void onSuccess$1(C1769106wL c1769106wL, Object obj) {
        InterfaceC1757506uT interfaceC1757506uT = (InterfaceC1757506uT) c1769106wL.l0;
        if (interfaceC1757506uT != null) {
            interfaceC1757506uT.LIZIZ((C1736606r6) c1769106wL.l1, 1, null);
        }
        ((InterfaceC1757006uO) c1769106wL.l2).LIZJ((C1736606r6) c1769106wL.l1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onSuccess$2(C1769106wL c1769106wL, Object obj) {
        C0YAE c0yae = (C0YAE) obj;
        if (c0yae != null) {
            C259800zU c259800zU = (C259800zU) c1769106wL.l1;
            C1461805ns c1461805ns = (C1461805ns) c1769106wL.l2;
            ((C1462005nu) c259800zU.element).setMember(c0yae);
            LruCache<String, ConcurrentHashMap<String, C1462005nu>> lruCache = C1461005nk.LIZJ;
            if (lruCache.get(c1461805ns.LIZ) == null) {
                lruCache.put(c1461805ns.LIZ, new ConcurrentHashMap<>());
            }
            ConcurrentHashMap concurrentHashMap = lruCache.get(c1461805ns.LIZ);
            if (concurrentHashMap != null) {
                concurrentHashMap.put(c1461805ns.LIZIZ, c259800zU.element);
            }
        }
        InterfaceC1461705nr interfaceC1461705nr = (InterfaceC1461705nr) c1769106wL.l0;
        if (interfaceC1461705nr != null) {
            interfaceC1461705nr.LIZ((C1462005nu) ((C259800zU) c1769106wL.l1).element, EnumC1461205nm.UPDATE_MEMBER);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1769106wL(InterfaceC1461705nr interfaceC1461705nr, InterfaceC1461705nr interfaceC1461705nr2, C259800zU<C1462005nu> c259800zU, C1461805ns c1461805ns) {
        this.$t = c1461805ns;
        this.l0 = interfaceC1461705nr;
        this.l1 = interfaceC1461705nr2;
        this.l2 = c259800zU;
    }

    public C1769106wL(InterfaceC1757506uT interfaceC1757506uT, C1736606r6 c1736606r6, InterfaceC1757006uO interfaceC1757006uO, String str, int i) {
        this.$t = i;
        this.l0 = interfaceC1757506uT;
        this.l1 = c1736606r6;
        this.l2 = interfaceC1757006uO;
    }
}
