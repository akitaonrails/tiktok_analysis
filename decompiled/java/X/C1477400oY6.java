package X;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oY6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477400oY6 {
    public static final C1477400oY6 LJJJJI = new C1477400oY6();
    public volatile Session LIZ;
    public final Queue<Session> LIZIZ = new LinkedList();
    public final LruCache<String, String> LIZJ = new LruCache<>(100);
    public final LruCache<String, InterfaceC1477220oXo> LIZLLL = new LruCache<>(100);
    public final LruCache<String, SimBitRate> LJ = new LruCache<>(100);
    public final LruCache<String, SimAudioBitrate> LJFF = new LruCache<>(100);
    public final LruCache<String, SimAudioBitrate> LJI = new LruCache<>(100);
    public final LruCache<String, InterfaceC1477220oXo> LJII = new LruCache<>(100);
    public final LruCache<String, SimBitRate> LJIIIIZZ = new LruCache<>(100);
    public final LruCache<String, String> LJIIIZ = new LruCache<>(100);
    public final LruCache<String, String> LJIIJ = new LruCache<>(20);
    public final LruCache<String, C0N9X> LJIIJJI = new LruCache<>(100);
    public final LruCache<String, List<SimBitRate>> LJIIL = new LruCache<>(100);
    public final LruCache<String, List<C00BE>> LJIILIIL = new LruCache<>(100);
    public final LruCache<String, String> LJIILL = new LruCache<>(100);
    public final LruCache<String, C1477610oYR> LJIILLIIL = new LruCache<>(100);
    public final LruCache<String, Float> LJIIZILJ = new LruCache<>(20);
    public final LruCache<String, Integer> LJIJ = new LruCache<>(100);
    public final LruCache<String, Integer> LJIJI = new LruCache<>(100);
    public final LruCache<String, Long> LJIJJ = new LruCache<>(100);
    public final LruCache<String, ArrayList<Long>> LJIJJLI = new LruCache<>(100);
    public final LruCache<String, Boolean> LJIL = new LruCache<>(100);
    public final LruCache<String, String> LJJ = new LruCache<>(100);
    public final LruCache<String, String> LJJI = new LruCache<>(100);
    public final LruCache<String, String> LJJIFFI = new LruCache<>(100);
    public final LruCache<String, Boolean> LJJII = new LruCache<>(100);
    public final LruCache<String, List<String>> LJJIII = new LruCache<>(20);
    public final LruCache<String, Integer> LJJIIJ = new LruCache<>(20);
    public final LruCache<String, Integer> LJJIIJZLJL = new LruCache<>(20);
    public final LruCache<String, List<String>> LJJIIZ = new LruCache<>(20);
    public final LruCache<String, Integer> LJJIIZI = new LruCache<>(20);
    public final LruCache<String, Integer> LJJIJ = new LruCache<>(20);
    public final LruCache<String, Integer> LJJIJIIJI = new LruCache<>(20);
    public final LruCache<String, Integer> LJJIJIIJIL = new LruCache<>(20);
    public final LruCache<String, Integer> LJJIJIL = new LruCache<>(20);
    public final LruCache<String, Integer> LJJIJL = new LruCache<>(20);
    public final LruCache<String, Integer> LJJIJLIJ = new LruCache<>(20);
    public final LruCache<String, Integer> LJJIL = new LruCache<>(20);
    public final LruCache<String, Integer> LJJIZ = new LruCache<>(20);
    public final LruCache<String, Integer> LJJJ = new LruCache<>(20);
    public final List<C1477540oYK> LJJJI = new ArrayList();
    public final Set<String> LJJJIL = new HashSet();
    public int LJJJJ = 0;
    public final LruCache<String, Object> LJIILJJIL = new LruCache<>(((Number) C1474810oTv.L0.getValue()).intValue());

    public static C1477400oY6 LJIIL() {
        return LJJJJI;
    }

    public final void LIZIZ(String str) {
        LIZ(str, 1, this.LJJIIJZLJL);
    }

    public final synchronized Session LJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Session sessionInstance = Session.instance();
        sessionInstance.key = str;
        sessionInstance.uri = str;
        if (((LinkedList) this.LIZIZ).size() + 1 > 5) {
            ((LinkedList) this.LIZIZ).poll();
        }
        ((LinkedList) this.LIZIZ).offer(sessionInstance);
        return sessionInstance;
    }

    public final synchronized Session LJI(String str) {
        if (!TextUtils.isEmpty(str)) {
            Session[] sessionArr = (Session[]) ((LinkedList) this.LIZIZ).toArray(new Session[0]);
            for (int length = sessionArr.length - 1; length >= 0; length--) {
                if (str.equals(sessionArr[length].key)) {
                    return sessionArr[length];
                }
            }
        }
        return null;
    }

    public final synchronized List<SimBitRate> LJII(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.LJIIL.get(str);
        }
        return null;
    }

    public final synchronized JSONObject LJIIIIZZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C0N9X c0n9x = this.LJIIJJI.get(str);
        if (c0n9x == null) {
            return null;
        }
        return c0n9x.LIZ();
    }

    public final synchronized Session LJIIIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            Session[] sessionArr = (Session[]) ((LinkedList) this.LIZIZ).toArray(new Session[0]);
            int length = sessionArr.length;
            do {
                length--;
                if (length >= 0) {
                }
            } while (!str.equals(sessionArr[length].sourceId));
            return sessionArr[length];
        }
        return null;
    }

    public final synchronized String LJIIJJI(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = this.LJIILL.get(str);
        } else {
            str2 = "";
        }
        return str2;
    }

    public final synchronized String LJIILIIL(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.LJIIIZ.get(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String LJIILJJIL(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 != 0) goto L7
            java.lang.String r0 = ""
            monitor-exit(r1)
            return r0
        L7:
            android.util.LruCache<java.lang.String, X.0oYR> r0 = r1.LJIILLIIL     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L19
            X.0oYR r0 = (X.C1477610oYR) r0     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.LIZ     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L17
        L15:
            java.lang.String r0 = ""
        L17:
            monitor-exit(r1)
            return r0
        L19:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1477400oY6.LJIILJJIL(java.lang.String):java.lang.String");
    }

    public final int LJIILL(String str) {
        return LJIIJ(str, this.LJJIIZI);
    }

    public final synchronized InterfaceC1477220oXo LJIILLIIL(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.LJII.get(str);
        }
        return null;
    }

    public final synchronized SimBitRate LJIIZILJ(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.LJIIIIZZ.get(str);
        }
        return null;
    }

    public final synchronized SimAudioBitrate LJIJ(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.LJI.get(str);
        }
        return null;
    }

    public final synchronized InterfaceC1477220oXo LJIJI(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.LIZLLL.get(str);
        }
        return null;
    }

    public final synchronized SimAudioBitrate LJIJJ(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.LJFF.get(str);
        }
        return null;
    }

    public final synchronized SimBitRate LJIJJLI(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.LJ.get(str);
        }
        return null;
    }

    public final synchronized String LJIL(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.LJIIJ.get(str);
            if (TextUtils.isEmpty(str2)) {
                str2 = "NoSelect";
            }
            return str2;
        }
        return "cache-null";
    }

    public final synchronized void LJJJIL(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LJIILIIL.remove(str);
        }
    }

    public final synchronized void LJJJJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.LJIL.put(str, Boolean.TRUE);
    }

    public final synchronized void LJJJJIZL(String str) {
        this.LIZ = LJI(str);
        if (this.LIZ == null) {
            this.LIZ = LJ(str);
        }
    }

    public static int LJIIJ(String str, LruCache lruCache) {
        Integer num;
        if (TextUtils.isEmpty(str) || (num = (Integer) lruCache.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final void LIZJ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            List<String> arrayList = this.LJJIIZ.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(str2);
            this.LJJIIZ.put(str, arrayList);
        }
    }

    public final void LIZLLL(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            List<String> arrayList = this.LJJIII.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(str2);
            this.LJJIII.put(str, arrayList);
        }
    }

    public final synchronized void LJFF(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Boolean bool = this.LJJII.get(str);
        this.LJJII.put(str, Boolean.valueOf(z));
        if (!z) {
            C1477610oYR c1477610oYR = this.LJIILLIIL.get(str);
            if (!((Boolean) C1474810oTv.I2.getValue()).booleanValue() ? c1477610oYR == null || !c1477610oYR.LIZIZ : c1477610oYR == null || bool == null || !bool.booleanValue()) {
            }
        }
        this.LJIILLIIL.put(str, new C1477610oYR(String.valueOf(System.currentTimeMillis()), z));
    }

    public final synchronized void LJJ(String str, List<SimBitRate> list) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            arrayList.addAll(list);
        }
        this.LJIIL.put(str, arrayList);
    }

    public final synchronized void LJJIFFI(long j, String str) {
        C1477540oYK c1477540oYK;
        C1477660oYW c1477660oYW;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (((ArrayList) this.LJJJI).size() <= 0 || (c1477540oYK = (C1477540oYK) ListProtector.get(this.LJJJI, 0)) == null || !TextUtils.equals(c1477540oYK.LIZ, str)) {
            c1477540oYK = new C1477540oYK(str);
            ListProtector.add(this.LJJJI, 0, c1477540oYK);
        }
        if (((ArrayList) c1477540oYK.LIZIZ).size() > 0 && (c1477660oYW = (C1477660oYW) ListProtector.get(c1477540oYK.LIZIZ, 0)) != null && c1477660oYW.LIZ == 0) {
            c1477660oYW.LIZ = j;
        }
    }

    public final synchronized void LJJII(long j, String str) {
        C1477540oYK c1477540oYK;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (((ArrayList) this.LJJJI).size() <= 0 || (c1477540oYK = (C1477540oYK) ListProtector.get(this.LJJJI, 0)) == null || !TextUtils.equals(c1477540oYK.LIZ, str)) {
            c1477540oYK = new C1477540oYK(str);
            ListProtector.add(this.LJJJI, 0, c1477540oYK);
            int size = ((ArrayList) this.LJJJI).size();
            if (size > 20) {
                ListProtector.remove(this.LJJJI, size - 1);
            }
        }
        ListProtector.add(c1477540oYK.LIZIZ, 0, new C1477660oYW(j));
    }

    public final void LJJIII(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.LIZJ.put(str, str2);
        }
    }

    public final synchronized void LJJIIJ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.LJIILL.put(str, str2);
        }
    }

    public final synchronized void LJJIIJZLJL(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LJIJI.put(str, Integer.valueOf(i));
        }
    }

    public final synchronized void LJJIIZ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            this.LJIIIZ.remove(str);
        } else {
            this.LJIIIZ.put(str, str2);
        }
    }

    public final synchronized void LJJIIZI(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.LJJI.put(str, str2);
        }
    }

    public final synchronized void LJJIJ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.LJJIFFI.put(str, str2);
        }
    }

    public final synchronized void LJJIJIIJI(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.LJJ.put(str, str2);
        }
    }

    public final synchronized void LJJIJIIJIL(String str, InterfaceC1477220oXo interfaceC1477220oXo) {
        if (!TextUtils.isEmpty(str) && interfaceC1477220oXo != null) {
            this.LJII.put(str, interfaceC1477220oXo);
        }
    }

    public final synchronized void LJJIJIL(String str, SimBitRate simBitRate) {
        if (!TextUtils.isEmpty(str) && simBitRate != null) {
            this.LJIIIIZZ.put(str, simBitRate);
        }
    }

    public final synchronized void LJJIJL(String str, SimAudioBitrate simAudioBitrate) {
        if (!TextUtils.isEmpty(str)) {
            this.LJI.put(str, simAudioBitrate);
        }
    }

    public final synchronized void LJJIJLIJ(String str, InterfaceC1477220oXo interfaceC1477220oXo) {
        if (!TextUtils.isEmpty(str) && interfaceC1477220oXo != null) {
            this.LIZLLL.put(str, interfaceC1477220oXo);
        }
    }

    public final synchronized void LJJIL(String str, SimAudioBitrate simAudioBitrate) {
        if (!TextUtils.isEmpty(str) && simAudioBitrate != null) {
            this.LJFF.put(str, simAudioBitrate);
        }
    }

    public final synchronized void LJJIZ(String str, SimBitRate simBitRate) {
        if (!TextUtils.isEmpty(str) && simBitRate != null) {
            this.LJ.put(str, simBitRate);
        }
    }

    public final synchronized void LJJJ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            this.LJIIJ.remove(str);
        } else {
            this.LJIIJ.put(str, str2);
        }
    }

    public final synchronized void LJJJI(long j, String str) {
        if (!TextUtils.isEmpty(str) && j > 0) {
            Long lRemove = this.LJIJJ.remove(str);
            if (lRemove != null && lRemove.longValue() <= j) {
                long jLongValue = j - lRemove.longValue();
                ArrayList<Long> arrayList = this.LJIJJLI.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(100);
                    this.LJIJJLI.put(str, arrayList);
                }
                arrayList.add(Long.valueOf(jLongValue));
            }
        }
    }

    public final synchronized void LJJJJ(long j, String str) {
        if (!TextUtils.isEmpty(str) && j > 0) {
            this.LJIJJ.put(str, Long.valueOf(j));
        }
    }

    public final synchronized void LJJJJJ(String str, C1476840oXC c1476840oXC) {
        if (!TextUtils.isEmpty(str)) {
            List<C00BE> list = this.LJIILIIL.get(str);
            if (list != null && !list.isEmpty()) {
                C00BE c00be = (C00BE) ListProtector.get(list, list.size() - 1);
                if (c1476840oXC.getBitRate() > 0) {
                    c00be.setSelected_bitrate(c1476840oXC.getBitRate());
                }
            }
        }
    }

    public static void LIZ(String str, int i, LruCache lruCache) {
        int iLJIIJ = LJIIJ(str, lruCache) + i;
        if (!TextUtils.isEmpty(str)) {
            lruCache.put(str, Integer.valueOf(iLJIIJ));
        }
    }

    public final synchronized void LJJI(String str, List list, List list2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.LJIIJJI.put(str, new C0N9X(list, list2));
    }
}
