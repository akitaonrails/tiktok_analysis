package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758040vqk {
    public static final /* synthetic */ int LJI = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(372));
    public final EnumC1154420g9A[] LIZIZ = {EnumC1154420g9A.MEANINGFUL_RENDER, EnumC1154420g9A.TTI};
    public final CopyOnWriteArrayList<EnumC1154420g9A> LIZJ = new CopyOnWriteArrayList<>();
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public C1758080vqo LJ;
    public C1758080vqo LJFF;

    public final ConcurrentHashMap<String, Object> LIZIZ() {
        return (ConcurrentHashMap) this.LIZ.getValue();
    }

    public final void LIZLLL(EnumC1756220vno enumC1756220vno) {
        LIZJ(enumC1756220vno.getValue(), "after_online_error_status", false);
    }

    public final <T> void LJ(C0X52<T> c0x52) {
        Long l;
        Long l2;
        C1495280p0w c1495280p0w = C1495280p0w.LIZ;
        C2175508fh c2175508fh = c0x52.LIZ;
        Object obj = c2175508fh.LJFF;
        List<C080U> list = c2175508fh.LIZLLL;
        Object obj2 = LIZIZ().get("t_request_start");
        if (obj2 instanceof Long) {
            l = (Long) obj2;
        } else {
            l = null;
        }
        Object obj3 = LIZIZ().get("t_request_end");
        if (obj3 instanceof Long) {
            l2 = (Long) obj3;
        } else {
            l2 = null;
        }
        c1495280p0w.getClass();
        for (Map.Entry entry : ((LinkedHashMap) C1495280p0w.LIZIZ(obj, list, l, l2, false)).entrySet()) {
            LIZJ(entry.getValue(), (String) entry.getKey(), false);
        }
        LIZJ(C2381909Uz.LIZIZ(c0x52), "log_id", false);
        try {
            LIZJ(UriProtector.parse(c0x52.LIZ.LIZ).getPath(), "path", false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1019103yf.LIZ(EnumC1014603xw.UNKNOWN_ERR, th, null);
        }
    }

    public final <T> void LJI(C0X52<T> c0x52) {
        C080U next;
        String str;
        if (this.LIZLLL.get()) {
            return;
        }
        try {
            Iterator<C080U> it2 = c0x52.LIZ.LIZLLL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ, "tts-server-timing")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C080U c080u = next;
            if (c080u != null && (str = c080u.LIZIZ) != null) {
                Iterator it3 = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6).iterator();
                while (it3.hasNext()) {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((String) it3.next(), new String[]{"="}, 0, 6);
                    if (listLJJLIIIJILLIZJL.size() == 2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("tts_server_");
                        sbLIZ.append((String) listLJJLIIIJILLIZJL.get(0));
                        LIZJ(C2095008Iq.LJIILIIL((String) listLJJLIIIJILLIZJL.get(1)), C2188811AlT.LIZIZ(sbLIZ), false);
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1019103yf.LIZ(EnumC1014603xw.UNKNOWN_ERR, th, null);
        }
    }

    public final void LJII(EnumC1154420g9A enumC1154420g9A) {
        C1758080vqo c1758080vqo;
        if (this.LIZJ.contains(enumC1154420g9A)) {
            return;
        }
        this.LIZJ.add(enumC1154420g9A);
        if (!this.LIZLLL.get()) {
            AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 558);
            int i = C1758050vql.LIZ[enumC1154420g9A.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (this.LJ != null && (c1758080vqo = this.LJFF) != null) {
                        c1758080vqo.LJ = true;
                        awS605S0100000_26.invoke(c1758080vqo);
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                C1758080vqo c1758080vqo2 = this.LJ;
                if (c1758080vqo2 != null || (c1758080vqo2 = this.LJFF) != null) {
                    EnumC1758060vqm enumC1758060vqm = c1758080vqo2.LIZ;
                    if (enumC1758060vqm == EnumC1758060vqm.CACHE) {
                        LIZJ(Integer.valueOf(c1758080vqo2.LIZLLL().size()), "cache_node_count", false);
                        String strLIZIZ = c1758080vqo2.LIZIZ();
                        if (strLIZIZ.length() > 0) {
                            LIZJ(strLIZIZ, "cache_node_list", false);
                        }
                        LIZJ(Integer.valueOf(c1758080vqo2.LIZJ().size()), "cache_myna_node_count", false);
                        String strLIZ = c1758080vqo2.LIZ();
                        if (strLIZ.length() > 0) {
                            LIZJ(strLIZ, "cache_myna_node_list", false);
                        }
                    } else if (enumC1758060vqm == EnumC1758060vqm.ONLINE) {
                        awS605S0100000_26.invoke(c1758080vqo2);
                    }
                }
            }
        }
        EnumC1154420g9A[] enumC1154420g9AArr = this.LIZIZ;
        ArrayList arrayList = new ArrayList();
        for (EnumC1154420g9A enumC1154420g9A2 : enumC1154420g9AArr) {
            if (this.LIZJ.contains(enumC1154420g9A2)) {
                arrayList.add(enumC1154420g9A2);
            }
        }
        if (arrayList.size() == this.LIZIZ.length && !this.LIZLLL.getAndSet(true)) {
            C1018703yb.LJ("rd_tiktokec_pdp_perf_page_render", LIZIZ());
        }
    }

    public final void LIZ(EnumC1758060vqm enumC1758060vqm, InterfaceC665370Q7z interfaceC665370Q7z) {
        if (interfaceC665370Q7z == null) {
            return;
        }
        int i = C1758050vql.LIZIZ[enumC1758060vqm.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (this.LJFF == null) {
                    this.LJFF = new C1758080vqo(EnumC1758060vqm.ONLINE, interfaceC665370Q7z);
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        if (this.LJ != null) {
            return;
        }
        this.LJ = new C1758080vqo(EnumC1758060vqm.CACHE, interfaceC665370Q7z);
    }

    public final void LJFF(String str, boolean z) {
        LIZJ(Long.valueOf(System.currentTimeMillis()), str, z);
    }

    public final void LIZJ(Object obj, String str, boolean z) {
        if (obj == null || this.LIZLLL.get()) {
            return;
        }
        if (z) {
            LIZIZ().putIfAbsent(str, obj);
        } else {
            LIZIZ().put(str, obj);
        }
    }
}
