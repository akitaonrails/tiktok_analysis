package X;

import com.bytedance.android.starship.trace.span.Span;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0k9A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1308180k9A implements InterfaceC1307160k7W {
    public static final AFwS208S0000000_20 LLILZ = AFwS208S0000000_20.get$arr$(62);
    public final Span LL;
    public final C1308200k9C LLILLJJLI;
    public final InterfaceC1307160k7W LLILLL;

    @Override // X.InterfaceC1307160k7W
    public final String LJIJI() {
        return this.LL.context.spanId;
    }

    @Override // X.InterfaceC1307160k7W
    public final Object LJJLIIIIJ() {
        ConcurrentHashMap<String, Object> concurrentHashMap = this.LLILLJJLI.LIZJ;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get("trace_type");
        }
        return null;
    }

    @Override // X.InterfaceC1307160k7W
    public final InterfaceC1307160k7W LJJLIIIJJIZ() {
        InterfaceC1307160k7W interfaceC1307160k7WLJJLIIIJJIZ;
        if (!this.LL.context.LL) {
            this.LLILLJJLI.LIZIZ.incrementAndGet();
            return this;
        }
        InterfaceC1307160k7W interfaceC1307160k7W = this.LLILLL;
        if (interfaceC1307160k7W == null || (interfaceC1307160k7WLJJLIIIJJIZ = interfaceC1307160k7W.LJJLIIIJJIZ()) == null) {
            throw new IllegalStateException("Cannot reference a closed trace");
        }
        return interfaceC1307160k7WLJJLIIIJJIZ;
    }

    @Override // X.InterfaceC1307160k7W, java.lang.AutoCloseable
    public final void close() {
        if (this.LL.context.LL) {
            return;
        }
        this.LL.close();
        InterfaceC1307160k7W interfaceC1307160k7W = this.LLILLL;
        if (interfaceC1307160k7W != null) {
            interfaceC1307160k7W.LJLLI(this.LL);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = this.LLILLJJLI.LIZJ;
        if (concurrentHashMap != null) {
            Span span = this.LL;
            ConcurrentHashMap<String, Object> concurrentHashMap2 = span.tags;
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.putAll(concurrentHashMap);
            } else {
                span.tags = new ConcurrentHashMap<>(concurrentHashMap);
            }
        }
        this.LLILLJJLI.LIZ.LIZ(this.LL);
    }

    @Override // X.InterfaceC1307160k7W
    public final Object get() {
        ConcurrentHashMap<String, Object> concurrentHashMap = this.LL.tags;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get("input");
        }
        return null;
    }

    @Override // X.InterfaceC1307160k7W
    public final String getTraceId() {
        return this.LL.context.traceId;
    }

    @Override // X.InterfaceC1307160k7W
    public void release() {
        InterfaceC1307160k7W interfaceC1307160k7W = this.LLILLL;
        if (interfaceC1307160k7W != null) {
            interfaceC1307160k7W.release();
        } else {
            this.LLILLJJLI.LIZIZ.decrementAndGet();
        }
    }

    @Override // X.InterfaceC1307160k7W
    public final void LJJJLIIL(String str) {
        ConcurrentHashMap<String, Object> concurrentHashMap = this.LLILLJJLI.LIZJ;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(str);
        }
    }

    @Override // X.InterfaceC1307160k7W
    public void LJLLI(Span span) {
        if (this.LL.context.LL) {
            InterfaceC1307160k7W interfaceC1307160k7W = this.LLILLL;
            if (interfaceC1307160k7W != null) {
                interfaceC1307160k7W.LJLLI(span);
                return;
            }
            return;
        }
        span.context.parentId = this.LL.context.spanId;
    }

    @Override // X.InterfaceC1307160k7W
    public InterfaceC1307160k7W LLIIIZ(String str) {
        InterfaceC1307160k7W interfaceC1307160k7WLLIIIZ;
        if (this.LL.context.LL) {
            InterfaceC1307160k7W interfaceC1307160k7W = this.LLILLL;
            if (interfaceC1307160k7W != null && (interfaceC1307160k7WLLIIIZ = interfaceC1307160k7W.LLIIIZ(str)) != null) {
                return interfaceC1307160k7WLLIIIZ;
            }
            throw new IllegalStateException("Cannot create child span from closed trace");
        }
        Span span = this.LL;
        span.getClass();
        return new C1308180k9A(new Span(span.context.LIZ(), str, C13LP.LJLIL(span.fullPath, Collections.singletonList(span.name))), this.LLILLJJLI, this);
    }

    public final void LIZ(Object obj, String str) {
        Span span = this.LL;
        ConcurrentHashMap<String, Object> concurrentHashMap = span.tags;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, obj);
        } else {
            span.tags = new ConcurrentHashMap<>(C2097908Jt.LIZJ(new Pair(str, obj)));
        }
    }

    @Override // X.InterfaceC1307160k7W
    public final void LJJIJIL(String str, String str2) {
        LIZ(str2, str);
    }

    @Override // X.InterfaceC1307160k7W
    public final void LJJLIIIJLLLLLLLZ(Number number, String str) {
        LIZ(number, str);
    }

    @Override // X.InterfaceC1307160k7W
    public final void LJLL(String str, String str2) {
        C1308200k9C c1308200k9C = this.LLILLJJLI;
        ConcurrentHashMap<String, Object> concurrentHashMap = c1308200k9C.LIZJ;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, str2);
        } else {
            c1308200k9C.LIZJ = new ConcurrentHashMap<>(C2097908Jt.LIZJ(new Pair(str, str2)));
        }
    }

    @Override // X.InterfaceC1307160k7W
    public final void LLIIIILZ(String str, Object obj) {
        String string;
        try {
            string = C1306320k6A.LIZ.LJIILL(obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            string = obj.toString();
        }
        LIZ(string, str);
    }

    public C1308180k9A(Span span, C1308200k9C c1308200k9C, InterfaceC1307160k7W interfaceC1307160k7W) {
        this.LL = span;
        this.LLILLJJLI = c1308200k9C;
        this.LLILLL = interfaceC1307160k7W;
    }
}
