package X;

import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import fi1.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0xuy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1837540xuy<POLLING_RESPONSE, IM_MESSAGE, DATA_GLOBAL extends b> extends AbstractC1837630xv7<DATA_GLOBAL> implements InterfaceC518440KUw<IM_MESSAGE> {
    public final Class<DATA_GLOBAL> LLILZ;
    public C1837340xue LLILZIL;
    public DATA_GLOBAL LLILZLL;
    public final AtomicBoolean LLIZ;

    public abstract AbstractC518430KUv<IM_MESSAGE> LJIIIIZZ();

    public abstract boolean LJIIIZ(POLLING_RESPONSE polling_response);

    public abstract Object LJIIL(InterfaceC1364105Vn<? super C470590Icr<POLLING_RESPONSE>> interfaceC1364105Vn);

    public abstract void LJIILIIL();

    @Override // X.AbstractC1837630xv7
    public final void LJII() {
        InterfaceC497601wk interfaceC497601wkLIZ;
        WeakReference<Activity> weakReference;
        Activity activity;
        String str;
        AbstractC518430KUv<IM_MESSAGE> abstractC518430KUvLJIIIIZZ = LJIIIIZZ();
        if (abstractC518430KUvLJIIIIZZ != null) {
            C1837340xue c1837340xue = this.LLILZIL;
            if (c1837340xue == null || (str = c1837340xue.LL) == null) {
                str = "";
            }
            if (!abstractC518430KUvLJIIIIZZ.LIZIZ) {
                IHostNetwork iHostNetwork = (IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class);
                abstractC518430KUvLJIIIIZZ.LJ();
                abstractC518430KUvLJIIIIZZ.LIZLLL();
                iHostNetwork.registerHostWS(134217835, 1, abstractC518430KUvLJIIIIZZ);
                abstractC518430KUvLJIIIIZZ.LIZIZ = true;
            }
            abstractC518430KUvLJIIIIZZ.LIZJ.put(str, this);
        }
        DATA_GLOBAL data_global = this.LLILZLL;
        if (data_global == null || (weakReference = data_global.LIZ) == null || (activity = weakReference.get()) == null || (interfaceC497601wkLIZ = C1064790dob.LIZ(activity, null)) == null) {
            C1DFH c1dfh = C0PEM.LIZ;
            interfaceC497601wkLIZ = C2296808zG.LIZ(C2107308Nj.LIZ);
        }
        C23250099c.LIZLLL(interfaceC497601wkLIZ, null, null, new C1837590xv3(this, null), 3);
    }

    @Override // X.InterfaceC518440KUw
    public final void LIZ(IM_MESSAGE im_message) {
        LJIIJJI(new C1193004lc(null, im_message), -1, true);
    }

    @Override // X.AbstractC1837630xv7, X.AbstractC1837840xvS
    public final void LJI(C1404610meh c1404610meh) {
        Object obj;
        Object next;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next == null || (next instanceof C1837340xue)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next instanceof C1837340xue) {
            obj = next;
        }
        this.LLILZIL = (C1837340xue) obj;
        this.LLILZLL = (AbstractC1837710xvF) C1837820xvQ.LIZ(c1404610meh, this.LLILZ);
        super.LJI(c1404610meh);
    }

    public final void LJIIJ(final Throwable th) {
        Map<String, String> mapLJ;
        if (!this.LLIZ.compareAndSet(false, true)) {
            return;
        }
        final String str = null;
        AbstractC1837350xuf abstractC1837350xuf = new AbstractC1837350xuf(th, str) { // from class: X.0xup
            public final Throwable LLILZIL;
            public final EnumC1837330xud LLILZLL;

            @Override // X.AbstractC1837200xuQ
            public int getErrorCode() {
                Throwable th2 = this.LLILZIL;
                if (th2 != null) {
                    return C512240K7a.LIZ(th2);
                }
                return -999;
            }

            @Override // X.AbstractC1837210xuR
            public EnumC1837330xud getStage() {
                return this.LLILZLL;
            }

            {
                String strLIZIZ;
                super((th == null || (strLIZIZ = C512240K7a.LIZIZ(th)) == null) ? "check order error" : strLIZIZ, str, null);
                this.LLILZIL = th;
                this.LLILZLL = EnumC1837330xud.BIZ_CHECK_ORDER;
            }
        };
        Map<String, String> logMap = abstractC1837350xuf.getLogMap();
        DATA_GLOBAL data_global = this.LLILZLL;
        if (data_global != null) {
            mapLJ = data_global.LJIIIZ(this.LL);
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        logMap.putAll(mapLJ);
        logMap.put("error_code", String.valueOf(C512240K7a.LIZ(th)));
        C1837850xvT c1837850xvT = this.LLILLJJLI;
        if (c1837850xvT != null) {
            c1837850xvT.LIZIZ(abstractC1837350xuf);
        }
        AbstractC518430KUv<IM_MESSAGE> abstractC518430KUvLJIIIIZZ = LJIIIIZZ();
        if (abstractC518430KUvLJIIIIZZ != null) {
            C092100Wh.LIZ(this, abstractC518430KUvLJIIIIZZ.LIZJ);
        }
        LJIILIIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:42:0x00b0, B:31:0x0080, B:33:0x0084, B:35:0x008c, B:37:0x0099, B:39:0x009d), top: B:54:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00b0 -> B:22:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1837540xuy.LJIILJJIL(X.05Vn):java.lang.Object");
    }

    public AbstractC1837540xuy(Class cls, EnumC1837330xud enumC1837330xud) {
        super(enumC1837330xud);
        this.LLILZ = cls;
        this.LLIZ = new AtomicBoolean(false);
    }

    public final void LJIIJJI(C1193004lc c1193004lc, int i, boolean z) {
        Map<String, String> mapLJ;
        C1837830xvR c1837830xvR;
        String str;
        if (!this.LLIZ.compareAndSet(false, true)) {
            return;
        }
        C1837680xvC c1837680xvC = this.LLILZLL;
        if (c1837680xvC != null && (c1837830xvR = c1837680xvC.LJIIIIZZ) != null) {
            if (i >= 0) {
                c1837830xvR.LIZ(this.LL, "retry_count", String.valueOf(i));
            }
            InterfaceC1837420xum interfaceC1837420xum = this.LL;
            if (z) {
                str = "im";
            } else {
                str = "polling";
            }
            c1837830xvR.LIZ(interfaceC1837420xum, "query_type", str);
        }
        Map<String, String> map = c1193004lc.LLILLL;
        if (map != null) {
            DATA_GLOBAL data_global = this.LLILZLL;
            if (data_global != null) {
                mapLJ = data_global.LJIIIZ(this.LL);
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            map.putAll(mapLJ);
        }
        C1837850xvT c1837850xvT = this.LLILLJJLI;
        if (c1837850xvT != null) {
            c1837850xvT.LIZ.LIZJ(c1193004lc, false);
        }
        AbstractC518430KUv<IM_MESSAGE> abstractC518430KUvLJIIIIZZ = LJIIIIZZ();
        if (abstractC518430KUvLJIIIIZZ != null) {
            C092100Wh.LIZ(this, abstractC518430KUvLJIIIIZZ.LIZJ);
        }
        LJIILIIL();
    }
}
