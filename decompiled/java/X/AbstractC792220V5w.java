package X;

import X.InterfaceC792320V6g;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS82S0200000_13;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V5w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC792220V5w<T extends InterfaceC792320V6g> implements InterfaceC792030V5d {
    public static int LLILZLL = 1000;
    public static boolean LLIZ = true;
    public static boolean LLIZLLLIL;
    public final LinkedList<T> LL = new LinkedList<>();
    public volatile boolean LLILLJJLI;
    public volatile boolean LLILLL;
    public boolean LLILZ;
    public C792340V6i LLILZIL;

    @Override // X.InterfaceC792030V5d
    public final void LIZ() {
        this.LLILLJJLI = true;
        C787900UvU.LIZ.LIZJ(new ARunnableS113S0100000_13(this, 218));
    }

    public boolean LIZIZ(T t) {
        return true;
    }

    public abstract void LIZLLL(T t);

    @Override // X.InterfaceC792030V5d
    public void LJFF(JSONObject jSONObject, boolean z) {
    }

    public void LJI(T t) {
    }

    public final void LIZJ(T t) {
        C791820V4i c791820V4i = C787900UvU.LIZ;
        if (!c791820V4i.LIZIZ()) {
            c791820V4i.LIZJ(new ARunnableS82S0200000_13(this, t, 69));
        } else {
            LJ(t);
        }
    }

    public final void LJ(T t) {
        if (!LIZIZ(t)) {
            return;
        }
        LJI(t);
        if (this.LLILLJJLI) {
            LIZLLL(t);
            return;
        }
        if (t == null) {
            return;
        }
        synchronized (this.LL) {
            try {
                if (this.LL.size() > LLILZLL) {
                    T tPoll = this.LL.poll();
                    if (LLIZLLLIL && !this.LLILLL) {
                        C791810V4h c791810V4h = C0V38.LIZ;
                        if (c791810V4h.LIZ != null && !c791810V4h.LIZIZ.contains("apm_cache_buffer_full")) {
                            c791810V4h.LIZIZ.add("apm_cache_buffer_full");
                            InterfaceC791790V4f interfaceC791790V4f = c791810V4h.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("apm_");
                            sbLIZ.append("apm_cache_buffer_full");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            ((C0V5A) interfaceC791790V4f).getClass();
                            C1AF0.LIZJ(strLIZIZ);
                        }
                        this.LLILLL = true;
                    }
                    if (LLIZ && tPoll != null) {
                        try {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("apm_cache_buffer_full:");
                            sbLIZ2.append(tPoll.LIZ());
                            C0V5B.LIZ("apm_debug", C2188811AlT.LIZIZ(sbLIZ2));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                this.LL.add(t);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Q, X.0V61] */
    public final void LJII(String str, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        boolean zLJI = MethodIDManager.LJI(137883);
        if (jSONObject == null) {
            LJIIIIZZ(str, str2, jSONObject, z, z2, false);
        } else {
            C841880X0w<C0V61, Boolean> c841880X0w = new C841880X0w<>();
            c841880X0w.LIZ = new C0V61(str, str2, jSONObject);
            C841860X0u.LIZJ.LIZJ(c841880X0w);
            if (c841880X0w.LIZLLL != EnumC841890X0x.INTERCEPT) {
                LJIIIIZZ(str, str2, jSONObject, z, z2, false);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.String r11, java.lang.String r12, org.json.JSONObject r13, boolean r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC792220V5w.LJIIIIZZ(java.lang.String, java.lang.String, org.json.JSONObject, boolean, boolean, boolean):void");
    }
}
