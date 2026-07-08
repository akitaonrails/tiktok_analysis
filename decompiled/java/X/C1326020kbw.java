package X;

import com.ss.android.ugc.aweme.ecommerce.image.resource.EcOperationResourceData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kbw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326020kbw implements InterfaceC1326050kbz {
    public final ConcurrentHashMap<String, C1326030kbx> LIZIZ = new ConcurrentHashMap<>();
    public final Set<String> LIZJ = Collections.synchronizedSet(new LinkedHashSet());
    public final C099F LIZLLL = C090F.LIZIZ();

    public C1326020kbw() {
        InterfaceC1326050kbz.LIZ.getClass();
        C1326040kby.LIZIZ = this;
    }

    @Override // X.InterfaceC1326050kbz
    public final void LJ() {
        EcOperationResourceData ecOperationResourceData = C1325970kbr.LIZ;
    }

    @Override // X.InterfaceC1326050kbz
    public final void LIZ(int i) {
        EcOperationResourceData ecOperationResourceData = C1325970kbr.LIZ;
        C1018703yb.LIZIZ("rd_tiktokec_operation_resource_request", C2097608Jq.LJIIIIZZ(new Pair("max_count", Integer.valueOf(i)), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    @Override // X.InterfaceC1326050kbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C319940CgS
            if (r0 == 0) goto L56
            r5 = r7
            X.0CgS r5 = (X.C319940CgS) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r2 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 != r1) goto L5c
            X.C155000ia.LIZIZ(r2)
        L23:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0kbx> r0 = r6.LIZIZ
            r0.clear()
            java.util.Set<java.lang.String> r0 = r6.LIZJ
            r0.clear()
            X.0kby r0 = X.InterfaceC1326050kbz.LIZ
            r0.getClass()
            X.C1326040kby.LIZIZ = r3
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L37:
            X.C155000ia.LIZIZ(r2)
            java.util.Set<java.lang.String> r0 = r6.LIZJ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L23
            com.ss.android.ugc.aweme.ecommerce.image.resource.EcOperationResourceData r0 = X.C1325970kbr.LIZ
            X.0CgQ r2 = new X.0CgQ
            r2.<init>(r6, r3)
            r5.LLILLL = r1
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = X.C099A.LIZJ(r0, r2, r5)
            if (r0 != r4) goto L23
            return r4
        L56:
            X.0CgS r5 = new X.0CgS
            r5.<init>(r6, r7)
            goto L12
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1326020kbw.LIZJ(X.05Vn):java.lang.Object");
    }

    public final void LJI(C1326030kbx c1326030kbx) {
        Boolean bool = c1326030kbx.LIZJ;
        JSONObject jSONObject = c1326030kbx.LIZLLL;
        if (bool != null && jSONObject != null && c1326030kbx.LJ.compareAndSet(false, true)) {
            String str = c1326030kbx.LIZ;
            String str2 = c1326030kbx.LIZIZ;
            boolean zBooleanValue = bool.booleanValue();
            long j = c1326030kbx.LJFF;
            long jOptLong = 0;
            if (!C2093608Ic.LJ("download_duration") && jSONObject.has("download_duration") && jSONObject.optLong("download_duration", 0L) != 0) {
                if (!C2093608Ic.LJ("content_length") && jSONObject.has("content_length")) {
                    jOptLong = jSONObject.optLong("content_length", 0L);
                }
                Pair[] pairArr = new Pair[5];
                pairArr[0] = new Pair("url", str);
                if (str2 == null) {
                    str2 = "unknown";
                }
                pairArr[1] = new Pair("biz_scene", str2);
                pairArr[2] = new Pair("success", Integer.valueOf(zBooleanValue ? 1 : 0));
                pairArr[3] = new Pair("file_size", Long.valueOf(jOptLong));
                pairArr[4] = new Pair("duration", Long.valueOf(j));
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                new C5182020e(mapLJIIJ, (Map<String, String>) 278);
                EcOperationResourceData ecOperationResourceData = C1325970kbr.LIZ;
                C1018703yb.LIZIZ("rd_tiktokec_operation_resource_preload", mapLJIIJ);
            }
            this.LIZJ.remove(c1326030kbx.LIZ);
            this.LIZIZ.remove(c1326030kbx.LIZ);
            if (this.LIZJ.isEmpty() && !this.LIZLLL.isCompleted()) {
                this.LIZLLL.LJJLIIIJILLIZJL(Unit.LIZ);
            }
        }
    }

    @Override // X.InterfaceC1326050kbz
    public final void LIZIZ(String str, JSONObject jSONObject) {
        C1326030kbx c1326030kbxPutIfAbsent;
        ConcurrentHashMap<String, C1326030kbx> concurrentHashMap = this.LIZIZ;
        C1326030kbx c1326030kbx = concurrentHashMap.get(str);
        if (c1326030kbx == null && (c1326030kbxPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c1326030kbx = new C1326030kbx(str)))) != null) {
            c1326030kbx = c1326030kbxPutIfAbsent;
        }
        C1326030kbx c1326030kbx2 = c1326030kbx;
        c1326030kbx2.LIZLLL = jSONObject;
        LJI(c1326030kbx2);
    }

    @Override // X.InterfaceC1326050kbz
    public final void LIZLLL(int i, int i2, int i3, String str) {
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("max_count", Integer.valueOf(i2));
        pairArr[1] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(i));
        pairArr[2] = new Pair("code", Integer.valueOf(i3));
        if (str == null) {
            str = "";
        }
        pairArr[3] = new Pair("message", str);
        C1018703yb.LIZIZ("rd_tiktokec_operation_resource_request", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // X.InterfaceC1326050kbz
    public final void LJFF(long j, String str, String str2, boolean z) {
        C1326030kbx c1326030kbxPutIfAbsent;
        ConcurrentHashMap<String, C1326030kbx> concurrentHashMap = this.LIZIZ;
        C1326030kbx c1326030kbx = concurrentHashMap.get(str);
        if (c1326030kbx == null && (c1326030kbxPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c1326030kbx = new C1326030kbx(str)))) != null) {
            c1326030kbx = c1326030kbxPutIfAbsent;
        }
        C1326030kbx c1326030kbx2 = c1326030kbx;
        c1326030kbx2.LIZJ = Boolean.valueOf(z);
        c1326030kbx2.LIZIZ = str2;
        c1326030kbx2.LJFF = j;
        this.LIZJ.add(str);
        LJI(c1326030kbx2);
    }
}
