package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.videoarch.liveplayer.VideoLiveManager;
import com.ss.videoarch.liveplayer.log.LiveLoggerService;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uIn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1698550uIn {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public final VideoLiveManager LIZLLL;
    public boolean LJ;
    public long LJFF;
    public long LJI;
    public final Map<String, Long> LJII = new HashMap(14);
    public Map<String, Long> LJIIIIZZ = null;
    public final /* synthetic */ LiveLoggerService LJIIIZ;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r18) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698550uIn.LIZ(int):void");
    }

    public C1698550uIn(LiveLoggerService liveLoggerService, VideoLiveManager videoLiveManager) {
        this.LJIIIZ = liveLoggerService;
        liveLoggerService.LLLF = 0;
        liveLoggerService.K0.lock();
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        liveLoggerService.K0.unlock();
        this.LIZLLL = videoLiveManager;
    }

    public final void LIZIZ(JSONObject jSONObject, Map<String, Long> map) {
        long jLongValue;
        for (Map.Entry entry : ((HashMap) this.LJII).entrySet()) {
            try {
                if (map.containsKey(entry.getKey())) {
                    jLongValue = map.get(entry.getKey()).longValue();
                } else {
                    jLongValue = 0;
                }
                jSONObject.put((String) entry.getKey(), Long.valueOf(jLongValue));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final long LIZLLL(long j, long j2) {
        long j3;
        long jMin = 0;
        for (C1698990uJV c1698990uJV : (ArrayDeque) this.LJIIIZ.H) {
            long j4 = c1698990uJV.LIZ;
            if (c1698990uJV.LIZJ) {
                j3 = j2;
            } else {
                j3 = c1698990uJV.LIZIZ;
            }
            if (j > j3 || j2 < j4) {
                break;
            }
            jMin += Math.min(j2, j3) - Math.max(j, j4);
        }
        return jMin;
    }

    public final void LIZJ(JSONObject jSONObject, long j, long j2) {
        if (!this.LJIIIZ.LJJIJIIJI()) {
            return;
        }
        this.LJIIIZ.LJIIIZ(2);
        C1698570uIp c1698570uIp = this.LJIIIZ.X6;
        c1698570uIp.LJII(j2);
        c1698570uIp.LJI(j2);
        C1698570uIp c1698570uIp2 = this.LJIIIZ.X6;
        c1698570uIp2.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C1698570uIp.LIZJ(c1698570uIp2.LIZJ, arrayList, j, j2);
        c1698570uIp2.LIZLLL(arrayList2, j, j2, true);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        List listLJ = C1698570uIp.LJ(arrayList3);
        Iterator it2 = ((ArrayList) c1698570uIp2.LIZJ).iterator();
        while (it2.hasNext()) {
            if (((C1699020uJY) it2.next()).LIZIZ <= j2) {
                it2.remove();
            }
        }
        c1698570uIp2.LJIIJ = Math.max(c1698570uIp2.LJIIJ, j2);
        C1698660uIy c1698660uIy = c1698570uIp2.LJIILL.Y6;
        c1698660uIy.getClass();
        ArrayList<C1699020uJY> arrayList4 = (ArrayList) listLJ;
        if (!arrayList4.isEmpty()) {
            for (C1699020uJY c1699020uJY : arrayList4) {
                if (c1699020uJY != null) {
                    long j3 = c1699020uJY.LIZIZ;
                    long j4 = c1699020uJY.LIZ;
                    if (j3 > j4) {
                        if (((ArrayList) c1698660uIy.LIZ).isEmpty()) {
                            ((ArrayList) c1698660uIy.LIZ).add(new C1699020uJY(j4, j3, false));
                        } else {
                            List<C1699020uJY> list = c1698660uIy.LIZ;
                            C1699020uJY c1699020uJY2 = (C1699020uJY) ListProtector.get(list, ((ArrayList) list).size() - 1);
                            long j5 = c1699020uJY2.LIZIZ;
                            if (j4 <= j5) {
                                if (j3 > j5) {
                                    c1699020uJY2.LIZIZ = j3;
                                }
                            } else if (((ArrayList) c1698660uIy.LIZ).size() >= 100) {
                                c1698660uIy.LIZIZ = true;
                            } else {
                                ((ArrayList) c1698660uIy.LIZ).add(new C1699020uJY(j4, j3, false));
                            }
                        }
                    }
                }
            }
        }
        C1698570uIp.LJIIIZ(jSONObject, true, listLJ, c1698570uIp2.LJIIIIZZ());
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C1698570uIp.LIZJ(c1698570uIp2.LIZLLL, arrayList5, j, j2);
        c1698570uIp2.LIZLLL(arrayList6, j, j2, false);
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList5);
        arrayList7.addAll(arrayList6);
        List listLJ2 = C1698570uIp.LJ(arrayList7);
        Iterator it3 = ((ArrayList) c1698570uIp2.LIZLLL).iterator();
        while (it3.hasNext()) {
            if (((C1699020uJY) it3.next()).LIZIZ <= j2) {
                it3.remove();
            }
        }
        c1698570uIp2.LJIIJJI = Math.max(c1698570uIp2.LJIIJJI, j2);
        C1698570uIp.LJIIIZ(jSONObject, false, listLJ2, c1698570uIp2.LJIIIIZZ());
        String strOptString = jSONObject.optString("new_video_render_stall_series", "");
        String strOptString2 = jSONObject.optString("new_audio_render_stall_series", "");
        if (TextUtils.isEmpty(strOptString)) {
            TextUtils.isEmpty(strOptString2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(org.json.JSONObject r10, boolean r11, long r12, long r14) {
        /*
            r9 = this;
            r3 = r9
            com.ss.videoarch.liveplayer.log.LiveLoggerService r0 = r3.LJIIIZ
            java.util.concurrent.locks.ReentrantLock r0 = r0.K0
            r0.lock()
            if (r11 == 0) goto L10
            boolean r0 = r3.LJ     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            long r0 = r3.LJI     // Catch: java.lang.Throwable -> L68
            r5 = r12
            long r0 = java.lang.Math.max(r0, r5)     // Catch: java.lang.Throwable -> L68
            r3.LJI = r0     // Catch: java.lang.Throwable -> L68
            long r0 = r3.LJFF     // Catch: java.lang.Throwable -> L68
            long r0 = java.lang.Math.max(r0, r5)     // Catch: java.lang.Throwable -> L68
            r3.LJFF = r0     // Catch: java.lang.Throwable -> L68
            r0 = 2
            r3.LIZ(r0)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L46
            com.ss.videoarch.liveplayer.log.LiveLoggerService r0 = r3.LJIIIZ     // Catch: java.lang.Throwable -> L68
            java.util.Deque<X.0uJV> r0 = r0.H     // Catch: java.lang.Throwable -> L68
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L68
        L32:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L49
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L68
            X.0uJV r0 = (X.C1698990uJV) r0     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.LIZJ     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L32
            r1.remove()     // Catch: java.lang.Throwable -> L68
            goto L32
        L46:
            java.util.Map<java.lang.String, java.lang.Long> r0 = r3.LJIIIIZZ     // Catch: java.lang.Throwable -> L68
            goto L4b
        L49:
            java.util.Map<java.lang.String, java.lang.Long> r0 = r3.LJII     // Catch: java.lang.Throwable -> L68
        L4b:
            r4 = r10
            r3.LIZIZ(r4, r0)     // Catch: java.lang.Throwable -> L68
            r0.clear()     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L60
            com.ss.videoarch.liveplayer.log.LiveLoggerService r0 = r3.LJIIIZ     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.LJJIJIIJI()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L60
            r7 = r14
            r3.LIZJ(r4, r5, r7)     // Catch: java.lang.Throwable -> L68
        L60:
            com.ss.videoarch.liveplayer.log.LiveLoggerService r0 = r3.LJIIIZ
            java.util.concurrent.locks.ReentrantLock r0 = r0.K0
            r0.unlock()
            return
        L68:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L68
            com.ss.videoarch.liveplayer.log.LiveLoggerService r0 = r3.LJIIIZ
            java.util.concurrent.locks.ReentrantLock r0 = r0.K0
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698550uIn.LJ(org.json.JSONObject, boolean, long, long):void");
    }
}
