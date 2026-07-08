package X;

import Y.ARunnableS82S0200000_13;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS379S0200000_13;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798670VUr implements InterfaceC798560VUg, C0V22, InterfaceC791210V1z {
    public final String LL;
    public final C0V2A LLILLJJLI;
    public final AtomicBoolean LLILLL;
    public final Deque<C798680VUs> LLILZ;

    @Override // X.InterfaceC798560VUg
    public final boolean LIZJ() {
        if (!this.LLILLL.compareAndSet(false, true)) {
            return false;
        }
        synchronized (this.LLILZ) {
            try {
                C798680VUs c798680VUs = new C798680VUs();
                c798680VUs.LJ(System.currentTimeMillis());
                ((LinkedList) this.LLILZ).offerLast(c798680VUs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLILLJJLI.LJFF();
        return true;
    }

    public final void LJ() {
        C798690VUt c798690VUtLJFF;
        synchronized (this.LLILZ) {
            try {
                C798680VUs c798680VUs = (C798680VUs) ((LinkedList) this.LLILZ).peekFirst();
                if (c798680VUs == null || (c798690VUtLJFF = c798680VUs.LJFF()) == null) {
                    c798690VUtLJFF = null;
                } else {
                    ((LinkedList) this.LLILZ).poll();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c798690VUtLJFF == null) {
            return;
        }
        C0VUV.LIZJ.execute(new ARunnableS82S0200000_13(new C798630VUn(this.LL, c798690VUtLJFF.LIZ, c798690VUtLJFF.LIZIZ, c798690VUtLJFF.LIZJ), c798690VUtLJFF.LIZLLL, 111));
    }

    @Override // X.InterfaceC798560VUg
    public final boolean stop() {
        if (!this.LLILLL.compareAndSet(true, false)) {
            return false;
        }
        synchronized (this.LLILZ) {
            try {
                C798680VUs c798680VUs = (C798680VUs) ((LinkedList) this.LLILZ).peekLast();
                if (c798680VUs != null) {
                    c798680VUs.LIZJ(System.currentTimeMillis());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLILLJJLI.LJI();
        return true;
    }

    public C798670VUr(String str) {
        this.LL = str;
        C0V2A c0v2a = new C0V2A(str, true);
        this.LLILLJJLI = c0v2a;
        this.LLILLL = new AtomicBoolean(false);
        this.LLILZ = new LinkedList();
        c0v2a.LIZLLL(this);
        c0v2a.LIZJ(this);
    }

    @Override // X.C0V22
    public final void LIZIZ(double d) {
        synchronized (this.LLILZ) {
            try {
                C798680VUs c798680VUs = (C798680VUs) ((LinkedList) this.LLILZ).peekFirst();
                if (c798680VUs != null && !c798680VUs.LIZLLL(d)) {
                    ((LinkedList) this.LLILZ).pollFirst();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0VUs] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // X.InterfaceC791210V1z
    public final void LIZLLL(JSONObject jSONObject) {
        ?? arrayList;
        List listLJJII;
        if (jSONObject != null && (listLJJII = C09RB.LJJII(new C08LY(C09R4.LIZIZ(jSONObject.keys()), new AwS379S0200000_13(jSONObject, jSONObject, 0)))) != null) {
            arrayList = new ArrayList();
            for (Object obj : listLJJII) {
                if (((C798640VUo) obj).LIZIZ > 0) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        synchronized (this.LLILZ) {
            try {
                ?? r0 = (C798680VUs) ((LinkedList) this.LLILZ).peekFirst();
                if (r0 != 0 && !r0.LIZIZ(arrayList)) {
                    ((LinkedList) this.LLILZ).pollFirst();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJ();
    }

    @Override // X.InterfaceC798560VUg
    public final void LIZ(String str, String str2) {
        synchronized (this.LLILZ) {
            try {
                C798680VUs c798680VUs = (C798680VUs) ((LinkedList) this.LLILZ).peekLast();
                if (c798680VUs != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(str, str2);
                    c798680VUs.LIZ(linkedHashMap);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
