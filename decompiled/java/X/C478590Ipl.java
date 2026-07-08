package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLiveParmasConfigSetting;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import webcast.api.feed.TabMGTopLive;

/* JADX INFO: renamed from: X.0Ipl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478590Ipl {
    public static C037L<TabMGTopLive> LJFF;
    public static volatile long LJII;
    public static volatile TabMGTopLive LJIIIZ;
    public static final C478590Ipl LIZ = new C478590Ipl();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(308));
    public static final C1DEV LIZJ = C2191201ApK.LIZ();
    public static final Map<String, C037L<BaseListResponse<C479150Iqf, FeedExtra>>> LIZLLL = new LinkedHashMap();
    public static final C1DEV LJ = C2191201ApK.LIZ();
    public static volatile List<C479150Iqf> LJI = new ArrayList();
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(309));

    public static Pair LJ() {
        if (((ArrayList) LJI).isEmpty()) {
            return new Pair(Boolean.TRUE, null);
        }
        return (LJFF() <= 0 || System.currentTimeMillis() - LJII <= ((long) LJFF()) * 1000) ? new Pair(Boolean.FALSE, LJI) : new Pair(Boolean.TRUE, null);
    }

    public static int LJFF() {
        return ((Number) LJIIIIZZ.getValue()).intValue();
    }

    public static String LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C0ISY c0isy = LiveFeedDraw.Companion;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        MultiGuestTopLiveParmasConfigSetting multiGuestTopLiveParmasConfigSetting = MultiGuestTopLiveParmasConfigSetting.INSTANCE;
        sbLIZ2.append(multiGuestTopLiveParmasConfigSetting.getTopLivePageEnterFrom());
        sbLIZ2.append('_');
        sbLIZ2.append(multiGuestTopLiveParmasConfigSetting.getFeedCardEnterMethodV2());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        c0isy.getClass();
        sbLIZ.append(C0ISY.LIZIZ(strLIZIZ));
        sbLIZ.append("_preload");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJII(LifecycleOwner lifecycleOwner) {
        if (LJIIIZ != null) {
            C20441214yg.LIZIZ("MultiTopLiveDataManagerV2", "preloadHangoutTabTopLive, but interactModule != null, return");
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), C0PEM.LIZJ, null, new C478530Ipf(null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0187 A[Catch: all -> 0x0193, TryCatch #5 {all -> 0x0193, blocks: (B:98:0x0183, B:100:0x0187, B:103:0x018d), top: B:115:0x0183 }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018d A[Catch: all -> 0x0193, TRY_LEAVE, TryCatch #5 {all -> 0x0193, blocks: (B:98:0x0183, B:100:0x0187, B:103:0x018d), top: B:115:0x0183 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[Catch: all -> 0x00be, TryCatch #12 {all -> 0x00be, blocks: (B:16:0x005d, B:18:0x0061, B:20:0x0069, B:22:0x007e, B:25:0x0086, B:26:0x0094, B:24:0x0083), top: B:119:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0131 A[Catch: all -> 0x013a, TryCatch #9 {all -> 0x013a, blocks: (B:70:0x012d, B:72:0x0131, B:75:0x0137), top: B:117:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0137 A[Catch: all -> 0x013a, TryCatch #9 {all -> 0x013a, blocks: (B:70:0x012d, B:72:0x0131, B:75:0x0137), top: B:117:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0151 A[Catch: all -> 0x0170, TryCatch #4 {all -> 0x0170, blocks: (B:81:0x014d, B:83:0x0151, B:86:0x0157), top: B:113:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0157 A[Catch: all -> 0x0170, TRY_LEAVE, TryCatch #4 {all -> 0x0170, blocks: (B:81:0x014d, B:83:0x0151, B:86:0x0157), top: B:113:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016f A[PHI: r0
      0x016f: PHI (r0v31 java.lang.Object) = (r0v1 java.lang.Object), (r0v33 java.lang.Object) binds: [B:91:0x016c, B:89:0x0169] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r15, X.InterfaceC1364105Vn<? super webcast.api.feed.TabMGTopLive> r16) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C478590Ipl.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[Catch: Exception -> 0x0114, CancellationException -> 0x0155, TryCatch #0 {Exception -> 0x0114, blocks: (B:18:0x0079, B:19:0x007c, B:21:0x008c, B:23:0x00ac, B:29:0x00b8, B:28:0x00b6, B:31:0x00bf, B:33:0x00c5, B:36:0x00cc, B:38:0x00d4, B:40:0x00ec), top: B:54:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf A[Catch: Exception -> 0x0114, CancellationException -> 0x0155, TryCatch #0 {Exception -> 0x0114, blocks: (B:18:0x0079, B:19:0x007c, B:21:0x008c, B:23:0x00ac, B:29:0x00b8, B:28:0x00b6, B:31:0x00bf, B:33:0x00c5, B:36:0x00cc, B:38:0x00d4, B:40:0x00ec), top: B:54:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r23, X.InterfaceC1364105Vn<? super webcast.api.feed.TabMGTopLive> r24) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C478590Ipl.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }

    public static C05XL LJIIIIZZ(long j, String str, Map map, String str2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        C037L c037l = (C037L) linkedHashMap.get(str);
        if (c037l == null) {
            return null;
        }
        C05XL<T> c05xl = c037l.LIZ;
        if (!c05xl.isActive()) {
            linkedHashMap.remove(str);
            return null;
        }
        if (j - c037l.LIZIZ <= ((Number) LIZIZ.getValue()).intValue()) {
            return c05xl;
        }
        c05xl.LIZIZ(new CancellationException(str2));
        linkedHashMap.remove(str);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r29, long r30, webcast.api.feed.MGModuleTab r32, X.InterfaceC1364105Vn<? super com.bytedance.android.live.network.response.BaseListResponse<X.C479150Iqf, com.bytedance.android.live.base.model.feed.FeedExtra>> r33) {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C478590Ipl.LIZLLL(java.lang.String, long, webcast.api.feed.MGModuleTab, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023a A[Catch: all -> 0x0248, TryCatch #4 {all -> 0x0248, blocks: (B:104:0x022d, B:106:0x023a, B:109:0x0240), top: B:119:0x022d }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0240 A[Catch: all -> 0x0248, TRY_LEAVE, TryCatch #4 {all -> 0x0248, blocks: (B:104:0x022d, B:106:0x023a, B:109:0x0240), top: B:119:0x022d }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3 A[Catch: all -> 0x0108, TryCatch #5 {all -> 0x0108, blocks: (B:16:0x00a3, B:19:0x00b3, B:22:0x00d3), top: B:121:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0135 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019b A[Catch: all -> 0x01a5, TryCatch #3 {all -> 0x01a5, blocks: (B:65:0x018e, B:67:0x019b, B:70:0x01a1), top: B:117:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a1 A[Catch: all -> 0x01a5, TryCatch #3 {all -> 0x01a5, blocks: (B:65:0x018e, B:67:0x019b, B:70:0x01a1), top: B:117:0x018e }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ca A[Catch: all -> 0x0215, TryCatch #8 {all -> 0x0215, blocks: (B:76:0x01bd, B:78:0x01ca, B:81:0x01d0), top: B:123:0x01bd }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d0 A[Catch: all -> 0x0215, TryCatch #8 {all -> 0x0215, blocks: (B:76:0x01bd, B:78:0x01ca, B:81:0x01d0), top: B:123:0x01bd }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f6  */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [X.05XL] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [X.05XL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [X.09AE] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [X.05XL, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [X.0957] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(long r18, java.lang.String r20, X.InterfaceC1364105Vn r21, webcast.api.feed.MGModuleTab r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C478590Ipl.LIZJ(long, java.lang.String, X.05Vn, webcast.api.feed.MGModuleTab, boolean):java.lang.Object");
    }
}
