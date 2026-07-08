package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.tnc.TNCManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import m14.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493400oxu implements InterfaceC1493490oy3, WeakHandler.IHandler, InterfaceC2088208Ga, InterfaceC1493510oy5, InterfaceC1493550oy9, InterfaceC1493540oy8, InterfaceC1493580oyC, InterfaceC1493590oyD, InterfaceC1493570oyB, InterfaceC1339070kwz, C0X2U {
    public static C1493400oxu LLJL = null;
    public static String LLJLIL = null;
    public static String LLJLILLLLZIIL = "";
    public static int LLJLL = -1;
    public static int LLJLLIL = -1;
    public static boolean LLJLLL = true;
    public static boolean LLJZ;
    public static final ArrayList<String> LLJZIJLIL;
    public static boolean LLL;
    public final boolean LL;
    public final Context LLILZIL;
    public volatile int LLJJJ;
    public JSONObject LLJJJJ;
    public String LLJJJJJIL;
    public final AtomicLong LLILLJJLI = new AtomicLong(0);
    public final AtomicBoolean LLILLL = new AtomicBoolean(false);
    public final Object LLILZ = new Object();
    public volatile boolean LLILZLL = false;
    public volatile int LLIZ = -1;
    public long LLIZLLLIL = 0;
    public final AtomicBoolean LLJ = new AtomicBoolean(false);
    public int LLJI = 0;
    public int LLJIJIL = 0;
    public int LLJILJIL = 0;
    public int LLJILJILJ = 1;
    public int LLJILLL = 1;
    public int LLJJ = 1;
    public int LLJJI = 1;
    public int LLJJIII = 1;
    public String LLJJIJI = "";
    public final List<String> LLJJIJIIJIL = new CopyOnWriteArrayList();
    public final List<String> LLJJIJIL = new CopyOnWriteArrayList();
    public String LLJJJIL = "";
    public final AtomicInteger LLJJJJLIIL = new AtomicInteger(10800);
    public final List<String> LLJJL = new CopyOnWriteArrayList();
    public final WeakHandler LLJJLIIIJLLLLLLLZ = new WeakHandler(Looper.getMainLooper(), this);

    public final synchronized void LJIJI() {
        if (System.currentTimeMillis() - this.LLILLJJLI.get() > ((long) this.LLJJJJLIIL.get()) * 1000) {
            this.LLILLJJLI.set(System.currentTimeMillis());
            try {
                int iLJFF = TTNetInit.getTTNetDepend().LJFF(this.LLILZIL, 0, "disable_framed_transport");
                if (iLJFF > 0) {
                    try {
                        if (C0XLA.LIZJ == 0) {
                            C0XLA.LIZJ = iLJFF;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                if (TNCManager.LJI().LJIILIIL != null) {
                    TNCManager.LJI().LJIILIIL.LIZJ(this.LLILLJJLI.get());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void handleConfigUpdate(String str) {
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        LLJZIJLIL = arrayList;
        LLL = false;
        arrayList.add("MI PAD 2");
        arrayList.add("YT3-X90L");
        arrayList.add("YT3-X90F");
        arrayList.add("GT-810");
    }

    @Override // X.InterfaceC2088208Ga
    public final boolean LIZIZ() {
        return this.LLJILJIL > 0;
    }

    @Override // X.InterfaceC1493550oy9
    public final boolean LIZJ() {
        return this.LLJI > 0;
    }

    @Override // X.InterfaceC1493510oy5
    public final boolean LJFF() {
        if (LLJLLL && this.LLJ.compareAndSet(false, true)) {
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(this.LLILZIL, 0, "ss_app_config");
            if (this.LLIZ < 0) {
                this.LLIZ = sharedPreferencesLIZJ.getInt("chromium_boot_failures", 0);
            }
            Logger.debug();
            this.LLIZLLLIL = sharedPreferencesLIZJ.getLong("chromium_boot_failures_timestamp", 0L);
            if (this.LLIZ > 5 && System.currentTimeMillis() - this.LLIZLLLIL > TimeUnit.HOURS.toMillis(1L)) {
                this.LLIZ = 5;
            }
        }
        if (LLJZ) {
            C1493780oyW.LIZIZ = 0;
            return false;
        }
        if (LLL) {
            C1493780oyW.LIZIZ = 8;
            return false;
        }
        if (this.LLIZ > 5) {
            C1493780oyW.LIZIZ = 3;
            return false;
        }
        TTNetInit.getTTNetDepend().LIZIZ();
        return true;
    }

    @Override // X.InterfaceC2088208Ga
    public final boolean LJI() {
        return this.LLJIJIL > 0;
    }

    @Override // X.InterfaceC2088208Ga
    public final boolean LJII() {
        return this.LLJILJILJ > 0;
    }

    public final List<String> LJIIJJI() {
        ArrayList arrayList = new ArrayList();
        for (String str : (CopyOnWriteArrayList) this.LLJJIJIIJIL) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final void LJIILL() {
        try {
            Logger.debug();
            if (this.LLIZ == 0) {
                return;
            }
            this.LLIZ = 0;
            SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(this.LLILZIL, 0, "ss_app_config").edit();
            editorEdit.putInt("chromium_boot_failures", 0);
            C1499900p8O.LIZ(editorEdit);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("chromium_boot_failures", 0);
            TTNetInit.getTTNetDepend().LIZLLL(this.LLILZIL, linkedHashMap);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x02aa A[Catch: all -> 0x02d1, TryCatch #0 {all -> 0x02d1, blocks: (B:79:0x0286, B:81:0x028d, B:84:0x0296, B:86:0x02aa, B:87:0x02ac, B:89:0x02b2, B:93:0x02c6, B:92:0x02c2), top: B:118:0x0286 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b2 A[Catch: all -> 0x02d1, TryCatch #0 {all -> 0x02d1, blocks: (B:79:0x0286, B:81:0x028d, B:84:0x0296, B:86:0x02aa, B:87:0x02ac, B:89:0x02b2, B:93:0x02c6, B:92:0x02c2), top: B:118:0x0286 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ() {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1493400oxu.LJIJJ():void");
    }

    public static String[] LJIIIZ() {
        String[] strArrLJ = TTNetInit.getTTNetDepend().LJ();
        return (strArrLJ == null || strArrLJ.length <= 0) ? new String[0] : strArrLJ;
    }

    @Override // X.InterfaceC1493540oy8
    public final boolean isCronetBootFailureExpected() {
        Logger.debug();
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(this.LLILZIL, 0, "ss_app_config");
        if (!LLJLLL) {
            if (this.LLIZ < 0) {
                this.LLIZ = sharedPreferencesLIZJ.getInt("chromium_boot_failures", 0);
            }
            this.LLIZLLLIL = sharedPreferencesLIZJ.getLong("chromium_boot_failures_timestamp", 0L);
            if (this.LLIZ > 5 && System.currentTimeMillis() - this.LLIZLLLIL > TimeUnit.HOURS.toMillis(1L)) {
                this.LLIZ = 5;
            }
        }
        if (!LJFF()) {
            return false;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesLIZJ.edit();
        editorEdit.putInt("chromium_boot_failures", this.LLIZ + 1);
        editorEdit.putLong("chromium_boot_failures_timestamp", System.currentTimeMillis());
        Logger.debug();
        C1499900p8O.LIZ(editorEdit);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("chromium_boot_failures", Integer.valueOf(this.LLIZ + 1));
        if (TTNetInit.getCronetProvider().getOptInit()) {
            new RunnableC823120WQs() { // from class: X.0X3M
                @Override // X.RunnableC823120WQs, java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AppConfig@dd12.isCronetBootFailureExpected$1");
                    try {
                        TTNetInit.getTTNetDepend().LIZLLL(this.LLILZLL.LLILZIL, linkedHashMap);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AppConfig@dd12.isCronetBootFailureExpected$1");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super((Object) null);
                }
            }.LIZ();
        } else {
            TTNetInit.getTTNetDepend().LIZLLL(this.LLILZIL, linkedHashMap);
        }
        return true;
    }

    @Override // X.InterfaceC1493580oyC
    public final void LIZ() {
        Logger.debug();
    }

    public static C1493400oxu LJIIJ(Context context) {
        C1493400oxu c1493400oxu;
        synchronized (C1493400oxu.class) {
            try {
                if (LLJL == null) {
                    boolean zLIZJ = C2104008Mc.LIZJ(context);
                    LLJL = new C1493400oxu(C786410Ut5.N3(context), zLIZJ);
                    if (LLJZIJLIL.contains(Build.MODEL)) {
                        LLL = true;
                    }
                    LLJLIL = context.getPackageName();
                    if (!zLIZJ) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG");
                        try {
                            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.0X3O
                                @Override // android.content.BroadcastReceiver
                                public final void onReceive(Context context2, Intent intent) {
                                    if (!C2214201BlK.LJIIJJI && intent != null) {
                                        if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                                            C2188191AkT.LIZIZ();
                                        }
                                    }
                                    if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                                        if ("com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG".equals(intent.getAction())) {
                                            new RunnableC823120WQs() { // from class: X.0X3P
                                                @Override // X.RunnableC823120WQs, java.lang.Runnable
                                                public final void run() {
                                                    boolean zLIZ;
                                                    C1C7U.LIZ("AppConfig$SyncConfigBroadcastReceiver@1b3c.onReceive$1");
                                                    try {
                                                        C1493410oxv.LJIIIZ().LIZ();
                                                    } finally {
                                                        if (!zLIZ) {
                                                        }
                                                    }
                                                    C1C7U.LIZIZ("AppConfig$SyncConfigBroadcastReceiver@1b3c.onReceive$1");
                                                }
                                            }.LIZ();
                                        }
                                    } else {
                                        C2408409cA.LIZ();
                                        if (!"com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG".equals(intent.getAction())) {
                                            return;
                                        }
                                        new RunnableC823120WQs() { // from class: X.0X3P
                                            @Override // X.RunnableC823120WQs, java.lang.Runnable
                                            public final void run() {
                                                boolean zLIZ;
                                                C1C7U.LIZ("AppConfig$SyncConfigBroadcastReceiver@1b3c.onReceive$1");
                                                try {
                                                    C1493410oxv.LJIIIZ().LIZ();
                                                } finally {
                                                    if (!zLIZ) {
                                                    }
                                                }
                                                C1C7U.LIZIZ("AppConfig$SyncConfigBroadcastReceiver@1b3c.onReceive$1");
                                            }
                                        }.LIZ();
                                    }
                                }
                            };
                            if (Build.VERSION.SDK_INT >= 26) {
                                C786410Ut5.LJJ(context, broadcastReceiver, intentFilter, null, null, 4);
                            } else {
                                C786410Ut5.LJIL(context, broadcastReceiver, intentFilter, null, null);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        C1493410oxv c1493410oxvLJIIIZ = C1493410oxv.LJIIIZ();
                        C08GZ.LIZ = c1493410oxvLJIIIZ;
                        C1493630oyH.LJIIJJI = c1493410oxvLJIIIZ;
                        C1493630oyH.LJIIJ = c1493410oxvLJIIIZ;
                        C1493430oxx.LIZ = c1493410oxvLJIIIZ;
                        if (C1494230ozF.LJI == null) {
                            C1494230ozF.LJI = c1493410oxvLJIIIZ;
                        }
                    } else {
                        C1493400oxu c1493400oxu2 = LLJL;
                        C08GZ.LIZ = c1493400oxu2;
                        C1493630oyH.LJIIJJI = c1493400oxu2;
                        C1493630oyH.LJIIJ = LLJL;
                        C1493630oyH.LJIILIIL = LLJL;
                        C1493430oxx.LIZ = LLJL;
                        C1494470ozd c1494470ozd = C1494500ozg.LIZ;
                        C1493400oxu c1493400oxu3 = LLJL;
                        if (c1493400oxu3 != null) {
                            c1494470ozd.LJ.add(c1493400oxu3);
                        }
                        c1494470ozd.LIZJ.get();
                        C1494230ozF.LJII = LLJL;
                        C1494230ozF.LJIIIIZZ = LLJL;
                        if (C1494230ozF.LJI == null) {
                            C1494230ozF.LJI = LLJL;
                        }
                    }
                    C1497080p3q.LJ().LJIIJ = System.nanoTime();
                    C1493630oyH.LJIIL = C1493650oyJ.LIZIZ(context);
                    C1497080p3q.LJ().LJIIJJI = System.nanoTime();
                    C1494230ozF.LJFF = LLJL;
                    C1493420oxw.LIZ(context);
                }
                c1493400oxu = LLJL;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return c1493400oxu;
    }

    @Override // X.C0X2U
    public final List<String> LJ(String str) {
        if (C2211308lT.LIZ(str, this.LLJJIJIIJIL)) {
            return this.LLJJIJIIJIL;
        }
        return null;
    }

    public final void LJIILLIIL(ArrayList<String> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            for (String str : arrayList) {
                if (!C2093608Ic.LJ(str) && !C2211308lT.LIZ(str, this.LLJJIJIIJIL)) {
                    ((CopyOnWriteArrayList) this.LLJJIJIIJIL).add(str.trim());
                }
            }
        }
    }

    public final void LJIIZILJ(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            jSONObject = null;
        } else {
            String[] strArrSplit = str.split(",");
            JSONArray jSONArray = new JSONArray();
            for (String str2 : strArrSplit) {
                jSONArray.put(str2);
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put("hit", jSONArray);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LLJJJJ = jSONObject;
        TNCManager.LJI().LJIILIIL.LIZLLL = str;
        l.LJ().LJIIJJI = str;
    }

    public final boolean LJIJ(String str) {
        if (C2093608Ic.LJ(str) || this.LLJJ <= 0) {
            return false;
        }
        try {
            URI uriLIZIZ = C2089108Gj.LIZIZ(str);
            if (uriLIZIZ == null) {
                return false;
            }
            String host = uriLIZIZ.getHost();
            if (C2093608Ic.LJ(host)) {
                return false;
            }
            if (host.endsWith(C1493460oy0.LIZ())) {
                return true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return false;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        switch (message.what) {
            case 101:
                this.LLILLJJLI.set(System.currentTimeMillis());
                Logger.debug();
                this.LLILLL.set(false);
                break;
            case 102:
                Logger.debug();
                this.LLILLL.set(false);
                break;
            case 103:
                Logger.debug();
                LJIJJLI(EnumC1492690owl.TTPOLL, false);
                break;
            case 104:
                Logger.debug();
                LJIJJLI(EnumC1492690owl.TTSERVER, false);
                break;
        }
    }

    public C1493400oxu(Context context, boolean z) {
        this.LLILZIL = context;
        this.LL = z;
    }

    public final void LJIIIIZZ(final EnumC1492690owl enumC1492690owl, final boolean z) {
        Logger.debug();
        if (!this.LLILLL.compareAndSet(false, true) && enumC1492690owl != EnumC1492690owl.TTCRONETFAILED) {
            Logger.debug();
        } else {
            new RunnableC823120WQs() { // from class: X.0owd
                public final void LIZJ() {
                    List list;
                    C1493400oxu c1493400oxu = this.LLIZ;
                    EnumC1492690owl enumC1492690owl2 = enumC1492690owl;
                    boolean z2 = z;
                    c1493400oxu.getClass();
                    Logger.debug();
                    try {
                        if (C036E.LIZ.LIZIZ()) {
                            c1493400oxu.LJIJJ();
                            if (c1493400oxu.LJFF() && enumC1492690owl2 != EnumC1492690owl.TTCRONETFAILED) {
                                c1493400oxu.LLILLL.set(false);
                                return;
                            }
                            if (z2) {
                                C1493400oxu.LJIIIZ();
                                if (C1493400oxu.LJIIIZ().length >= 1) {
                                    String str = C1493400oxu.LJIIIZ()[0];
                                    if (!TextUtils.isEmpty(str)) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("https://");
                                        sbLIZ.append(str);
                                        sbLIZ.append("/get_domains/v5/");
                                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        String strLIZ = C1494230ozF.LIZ(strLIZIZ, null);
                                        if (!strLIZIZ.equals(strLIZ)) {
                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                            try {
                                                C2088908Gh.LIZLLL(strLIZ, linkedHashMap);
                                                if (linkedHashMap.containsKey("device_id") && (list = (List) linkedHashMap.get("device_id")) != null) {
                                                    Iterator it2 = list.iterator();
                                                    while (it2.hasNext()) {
                                                        if (!((String) it2.next()).equals(CardStruct.IStatusCode.DEFAULT)) {
                                                        }
                                                    }
                                                }
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                            }
                                        }
                                    }
                                }
                                Logger.debug();
                                c1493400oxu.LLJJLIIIJLLLLLLLZ.sendEmptyMessageDelayed(104, Mp4ScreenVideoLoadTimeout.CONTROL);
                                c1493400oxu.LLILLL.set(false);
                                return;
                            }
                            c1493400oxu.LLJJLIIIJLLLLLLLZ.sendEmptyMessage((TNCManager.LJI().LJFF(c1493400oxu.LLILZIL, true, enumC1492690owl2, c1493400oxu.LLJJJJJIL) || TNCManager.LJI().LJFF(c1493400oxu.LLILZIL, false, EnumC1492690owl.PORTRETRY, c1493400oxu.LLJJJJJIL)) ? 101 : 102);
                            c1493400oxu.LLJJLIIIJLLLLLLLZ.removeMessages(103);
                            c1493400oxu.LLJJLIIIJLLLLLLLZ.sendEmptyMessageDelayed(103, ((long) c1493400oxu.LLJJJJLIIL.get()) * 1000);
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }

                @Override // X.RunnableC823120WQs, java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AppConfig@dd12.doRefresh$1");
                    try {
                        LIZJ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AppConfig@dd12.doRefresh$1");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super((Object) null);
                }
            }.LIZ();
        }
    }

    public final void LJIILJJIL(String str, JSONObject jSONObject) {
        try {
            jSONObject.put("return", str);
            jSONObject.put("CurrentShareCookieHostList", this.LLJJIJIIJIL.toString());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1493280oxi tTNetDepend = TTNetInit.getTTNetDepend();
        TTNetInit.getTTNetDepend().getContext();
        tTNetDepend.LJIIJ();
    }

    public final void LJIJJLI(EnumC1492690owl enumC1492690owl, boolean z) {
        if (this.LL) {
            LJIIIIZZ(enumC1492690owl, z);
        } else {
            if (this.LLILLJJLI.get() > 0) {
                return;
            }
            try {
                new RunnableC823120WQs() { // from class: X.0own
                    @Override // X.RunnableC823120WQs, java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AppConfig@dd12.tryRefreshConfigInternal$1");
                        try {
                            this.LLILZIL.LJIJI();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AppConfig@dd12.tryRefreshConfigInternal$1");
                    }

                    {
                        super((Object) null);
                    }
                }.LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // X.C0X2U
    public final List<String> LIZLLL(CookieManager cookieManager, C842310X2n c842310X2n, URI uri) throws Throwable {
        String host;
        if (uri != null && (cookieManager != null || c842310X2n != null)) {
            try {
                host = uri.getHost();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                host = null;
            }
            if (!C2093608Ic.LJ(host) && C2211308lT.LIZ(host, this.LLJJIJIIJIL)) {
                TTNetInit.getTTNetDepend().LJIILIIL();
                if (C2093608Ic.LJ("")) {
                    return null;
                }
                ?? arrayList = new ArrayList();
                if (cookieManager != null) {
                    TTNetInit.getTTNetDepend().LJIILIIL();
                    String strLLIZ = C2204961BRm.LLIZ(cookieManager, uri.getScheme() + "://", new C0WZX("dzBzEgAjS8/YVFkiQFyQctEAqJDTy4w5erL+DcJ5DeVmTZqA", null));
                    if (!C2093608Ic.LJ(strLLIZ)) {
                        arrayList.add(strLLIZ);
                        return arrayList;
                    }
                }
                if (C0IKQ.LIZ(arrayList) && c842310X2n != null) {
                    try {
                        TTNetInit.getTTNetDepend().LJIILIIL();
                        Map<String, List<String>> map = c842310X2n.get(URI.create(uri.getScheme() + "://"), new LinkedHashMap());
                        if (map != null && !map.isEmpty()) {
                            List<String> list = map.get("Cookie");
                            if (list != null) {
                                try {
                                    list.add("x-tt-cookie-backup-source=1");
                                    return list;
                                } catch (Throwable th) {
                                    th = th;
                                    arrayList = list;
                                    TryCatchGuardChecker.doCheck(th);
                                    return arrayList;
                                }
                            }
                            return list;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return arrayList;
            }
        }
        return null;
    }

    public final void LJIILIIL(String str, String str2, boolean z) throws C1493470oy1 {
        if (((CopyOnWriteArrayList) this.LLJJIJIL).isEmpty()) {
            return;
        }
        for (String str3 : (CopyOnWriteArrayList) this.LLJJIJIL) {
            if (!C2093608Ic.LJ(str3) && str.endsWith(str3)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(str2);
                    jSONObject.put("url", C2188811AlT.LIZIZ(sbLIZ));
                    jSONObject.put("replace", z);
                    TTNetInit.monitorLogSend("api_http", jSONObject);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (TTNetInit.apiHttpInterceptEnabled() && !z) {
                    throw new C1493470oy1("Api http request is not allowed to be executed");
                }
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r2 == null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIL(java.lang.Object r40, X.EnumC1492690owl r41, long r42, boolean r44) {
        /*
            Method dump skipped, instruction units count: 1709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1493400oxu.LJIIL(java.lang.Object, X.0owl, long, boolean):boolean");
    }
}
