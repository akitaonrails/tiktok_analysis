package X;

import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0Y1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC867440Y1e<T> {
    public final int LIZ;
    public final InterfaceC863600XuI<T> LIZIZ;
    public final C0YEM LIZJ;
    public final C0Y9J LIZLLL;

    public boolean LJ() {
        return this instanceof C865050Xwd;
    }

    public int LJI() {
        return -1;
    }

    public abstract void LJII(C0YIN c0yin, C0Y1G c0y1g);

    public abstract boolean LJIIIIZZ(C0YIN c0yin);

    public C871360YGg LJFF() {
        return this.LIZJ.LJIIZILJ().getDomain().LIZLLL;
    }

    public void LIZ(C0YIN c0yin) {
        LIZIZ(C0YMW.from(c0yin));
    }

    public final void LIZIZ(C0YMW c0ymw) {
        InterfaceC863600XuI<T> interfaceC863600XuI = this.LIZIZ;
        if (interfaceC863600XuI != null) {
            interfaceC863600XuI.LIZIZ(c0ymw);
        }
    }

    public final void LIZJ(T t) {
        InterfaceC863600XuI<T> interfaceC863600XuI = this.LIZIZ;
        if (interfaceC863600XuI != null) {
            interfaceC863600XuI.onSuccess(t);
        }
    }

    public AbstractC867440Y1e(C0YEM c0yem, int i, InterfaceC863600XuI<T> interfaceC863600XuI) {
        this(c0yem, c0yem.LJIIZILJ().LIZIZ().LIZIZ(), i, interfaceC863600XuI);
    }

    public AbstractC867440Y1e(C0YEM c0yem, C0Y9J c0y9j, int i, InterfaceC863600XuI<T> interfaceC863600XuI) {
        this.LIZJ = c0yem;
        this.LIZLLL = c0y9j;
        this.LIZ = i;
        if (interfaceC863600XuI != null) {
            this.LIZIZ = interfaceC863600XuI;
        }
    }

    public final long LIZLLL(Request request, InterfaceC864880XwM interfaceC864880XwM, C870860YEi c870860YEi, Object... objArr) {
        C0YEM c0yem = this.LIZJ;
        C0YIN c0yin = new C0YIN(c0yem.LJIILL(), c0yem.LIZLLL(), request.sequence_id.longValue(), this);
        c0yin.LLILZLL = request;
        c0yin.LLILZIL = objArr;
        c0yin.LLILLJJLI = LJ();
        c0yin.LLJILLL = LJI();
        c0yin.LLJJ = -1;
        c0yin.LLILZ = interfaceC864880XwM;
        Iterator<InterfaceC864610Xvv> it2 = c870860YEi.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC864610Xvv next = it2.next();
            if (next.LIZIZ(c0yin)) {
                next.LIZ().LJ(c0yin);
                break;
            }
        }
        return c0yin.LL;
    }

    public long LJIIIZ(int i, RequestBody requestBody, InterfaceC864880XwM interfaceC864880XwM, Object... objArr) {
        boolean zLJI = MethodIDManager.LJI(137759);
        long jLIZLLL = LIZLLL(C870740YDw.LIZ(this.LIZJ, i, this.LIZ, requestBody, null), interfaceC864880XwM, this.LIZJ.LJIIZILJ().LIZ().LIZ(), objArr);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return jLIZLLL;
    }

    public final void LJIIJ(int i, RequestBody requestBody, InterfaceC864880XwM interfaceC864880XwM, Map map, Object... objArr) {
        Request requestLIZ = C870740YDw.LIZ(this.LIZJ, i, this.LIZ, requestBody, null);
        HashMap map2 = new HashMap();
        map2.putAll(requestLIZ.headers);
        map2.putAll(map);
        C0YLY c0ylyNewBuilder = requestLIZ.newBuilder();
        c0ylyNewBuilder.getClass();
        C1516540pZE.LIZIZ(map2);
        c0ylyNewBuilder.LJIIZILJ = map2;
        LIZLLL(c0ylyNewBuilder.build(), interfaceC864880XwM, this.LIZJ.LJIIZILJ().LIZ().LIZ(), objArr);
    }
}
