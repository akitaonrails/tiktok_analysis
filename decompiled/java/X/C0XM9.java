package X;

import com.bytedance.retrofit2.client.Request;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0XM9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XM9 {
    public final Request LIZ;
    public final boolean LIZIZ;
    public final C0XLO LIZJ;
    public final C0XLG LIZLLL;
    public final C0XMA LJ;
    public int LJFF;
    public final boolean LJI;
    public final int LJII;
    public Object LJIIIIZZ;
    public final String LJIIIZ;
    public final C01GW LJIIJ;
    public final C1494570ozn LJIIJJI;

    public final Request LIZ() {
        C0XMB c0xmbNewBuilder = this.LIZ.newBuilder();
        C0XMA c0xma = this.LJ;
        c0xmbNewBuilder.LIZIZ(c0xma.LIZIZ, c0xma.LIZ);
        c0xmbNewBuilder.LIZJ(this.LIZJ.LIZIZ());
        c0xmbNewBuilder.LIZJ = this.LIZLLL.LIZIZ();
        c0xmbNewBuilder.LJI = this.LJFF;
        c0xmbNewBuilder.LJII = this.LJI;
        c0xmbNewBuilder.LJIIIIZZ = this.LJII;
        c0xmbNewBuilder.LJIIJJI = this.LJIIIIZZ;
        c0xmbNewBuilder.LJIIL = this.LJIIIZ;
        for (Map.Entry entry : ((Map) this.LJIIJ.getValue()).entrySet()) {
            Object key = entry.getKey();
            Class<?> cls = key instanceof Class ? (Class) key : null;
            Object value = entry.getValue();
            if (cls == null) {
                throw new NullPointerException("type == null");
            }
            if (c0xmbNewBuilder.LJIILJJIL == null) {
                c0xmbNewBuilder.LJIILJJIL = new HashMap();
            }
            if (value == null) {
                c0xmbNewBuilder.LJIILJJIL.remove(cls);
            } else {
                c0xmbNewBuilder.LJIILJJIL.put(cls, cls.cast(value));
            }
        }
        Request requestLIZ = c0xmbNewBuilder.LIZ();
        requestLIZ.setMetrics(this.LJIIJJI);
        return requestLIZ;
    }

    public C0XM9(Request request) {
        C0XLG c0xlg;
        this.LIZ = request;
        this.LIZIZ = request.isAddCommonParam();
        this.LIZJ = C0XLO.LIZJ(request.getUrl());
        if (request.getHeaders() == null) {
            c0xlg = new C0XLG();
        } else {
            c0xlg = new C0XLG(request.getHeaders());
        }
        this.LIZLLL = c0xlg;
        this.LJ = new C0XMA(request);
        request.getPriorityLevel();
        this.LJFF = request.getRequestPriorityLevel();
        this.LJI = request.isResponseStreaming();
        this.LJII = request.getMaxLength();
        this.LJIIIIZZ = request.getExtraInfo();
        this.LJIIIZ = request.getServiceType();
        this.LJIIJ = C452501pT.LIZIZ(new C0XM8());
        this.LJIIJJI = request.getMetrics();
    }

    public final <T> T LIZIZ(Class<? extends T> cls) {
        Object obj = ((Map) this.LJIIJ.getValue()).get(cls);
        if (obj != null) {
            return cls.cast(obj);
        }
        if (((Map) this.LJIIJ.getValue()).containsKey(cls)) {
            return null;
        }
        return (T) this.LIZ.tag(cls);
    }

    public final void LIZJ(Class cls, Object obj) {
        ((Map) this.LJIIJ.getValue()).put(cls, obj);
    }
}
