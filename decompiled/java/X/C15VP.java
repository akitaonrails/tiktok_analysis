package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.15VP, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15VP implements InterfaceC1848620yCq {
    public final String LL = "perf_explore_card_common_monitor";
    public C15VU LLILLJJLI;

    @Override // X.InterfaceC1848620yCq
    public final String getEventName() {
        return this.LL;
    }

    public final void LIZ(boolean z) {
        ConcurrentHashMap<C15VO, C20530515Vf> concurrentHashMap;
        C20530515Vf c20530515Vf;
        C20530515Vf c20530515Vf2;
        ConcurrentHashMap<C15VO, C20530515Vf> concurrentHashMap2;
        C20530515Vf c20530515Vf3;
        C20530515Vf c20530515Vf4;
        C15VU c15vu = this.LLILLJJLI;
        if (c15vu != null && (c20530515Vf4 = c15vu.LJI.get(C15VO.COVER_LOAD_START)) != null) {
            c20530515Vf4.LIZ();
        }
        if (z) {
            C15VU c15vu2 = this.LLILLJJLI;
            if (c15vu2 != null && (c20530515Vf3 = c15vu2.LJI.get(C15VO.COVER_LOAD_SUCCESS)) != null) {
                c20530515Vf3.LIZ();
            }
            C15VU c15vu3 = this.LLILLJJLI;
            if (c15vu3 != null && (concurrentHashMap2 = c15vu3.LJI) != null) {
                concurrentHashMap2.remove(C15VO.COVER_LOAD_FAIL);
            }
        } else {
            C15VU c15vu4 = this.LLILLJJLI;
            if (c15vu4 != null && (c20530515Vf = c15vu4.LJI.get(C15VO.COVER_LOAD_FAIL)) != null) {
                c20530515Vf.LIZ();
            }
            C15VU c15vu5 = this.LLILLJJLI;
            if (c15vu5 != null && (concurrentHashMap = c15vu5.LJI) != null) {
                concurrentHashMap.remove(C15VO.COVER_LOAD_SUCCESS);
            }
        }
        C15VU c15vu6 = this.LLILLJJLI;
        if (c15vu6 != null && (c20530515Vf2 = c15vu6.LJI.get(C15VO.BIND_DATA)) != null) {
            long j = c20530515Vf2.LIZIZ;
            C15VU c15vu7 = this.LLILLJJLI;
            if (c15vu7 != null) {
                c15vu7.LJFF = Long.valueOf(System.currentTimeMillis() - j);
            }
        }
    }
}
