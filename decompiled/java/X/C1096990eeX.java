package X;

import Y.AfS186S0100000_17;
import Y.AfS83S0101000_17;
import android.os.SystemClock;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.game.model.GameTaskInfo;
import com.bytedance.android.livesdk.game.model.TaskWidgetConfig;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS205S0000000_17;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eeX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1096990eeX implements InterfaceC1141530foN {
    public static final /* synthetic */ int LLJJ = 0;
    public Room LLILZ;
    public DataChannel LLILZIL;
    public TaskWidgetConfig LLILZLL;
    public C11JF LLIZLLLIL;
    public C11JF LLJ;
    public Function1<? super C1096970eeV, Unit> LLJIJIL;
    public GameTaskInfo LLJILJIL;
    public boolean LLJILJILJ;
    public long LLJILLL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(211));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(210));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(209));
    public final C11NJ LLIZ = new C11NJ();
    public C1096970eeV LLJI = new C1096970eeV(null, false);

    public final boolean LIZ() {
        RoomAuthStatus roomAuthStatus;
        Room room = this.LLILZ;
        if (!C500260Jjc.LJJJI((room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null) ? null : Boolean.valueOf(roomAuthStatus.isShowCreditWidget()))) {
            return false;
        }
        Room room2 = this.LLILZ;
        return C500260Jjc.LJJIJIIJIL(room2 != null ? Boolean.valueOf(C500260Jjc.LJJJ(room2)) : null);
    }

    public final void LIZLLL() {
        C1548820qPI.LJIIIIZZ("game_guessing_short_touch_ready", this);
        C1548820qPI.LJIIIIZZ("game_guessing_short_touch_close", this);
        C1548820qPI.LJIIIIZZ("game_guessing_interact_tasks_finish", this);
        C1548820qPI.LJIIIIZZ("game_guessing_indicator_user_attending", this);
        C2296808zG.LIZLLL((InterfaceC497601wk) this.LL.getValue(), "CANCEL_ON_DESTROY");
        this.LLIZ.LJ();
        this.LLJIJIL = null;
        this.LLILZ = null;
        this.LLJILJIL = null;
        this.LLILZLL = null;
        this.LLJI = new C1096970eeV(null, false);
        this.LLILZIL = null;
    }

    public final void LJ() {
        LJIIIIZZ(new C1096970eeV(this.LLJI.LIZIZ, false), true, false);
    }

    public final void LJFF() {
        C11JF c11jf = this.LLIZLLLIL;
        if (c11jf != null && !c11jf.isDisposed()) {
            this.LLIZ.LIZJ(c11jf);
            this.LLJILLL = SystemClock.elapsedRealtime();
        }
        this.LLJILJILJ = true;
    }

    public final void LJI() {
        TaskWidgetConfig taskWidgetConfig;
        if (this.LLJILLL > 0 && (taskWidgetConfig = this.LLILZLL) != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJILLL;
            if (jElapsedRealtime < 0) {
                jElapsedRealtime = 0;
            }
            long j = jElapsedRealtime / 1000;
            int i = taskWidgetConfig.refreshGap;
            LJIIJ(j >= ((long) i) ? 0L : ((long) i) - j, taskWidgetConfig);
        }
        this.LLJILLL = 0L;
        this.LLJILJILJ = false;
    }

    public final JSONObject LIZJ(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    LIZJ(jSONObject2);
                    jSONObject.put(next, jSONObject2);
                } else if (obj instanceof Long) {
                    jSONObject.put(next, String.valueOf(((Number) obj).longValue()));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("PointsShortTouchMgr", e);
            }
        }
        return jSONObject;
    }

    public final void LJII(C1096970eeV c1096970eeV) {
        try {
            String strLJIILL = C19748512Ol.LIZIZ.LJIILL(c1096970eeV.LIZIZ);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", strLJIILL);
            LIZJ(jSONObject);
            C389001fE.LIZ("game_guessing_tasks_info_sync", jSONObject, System.currentTimeMillis(), false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("PointsShortTouchMgr", e);
        }
    }

    public final void LJIIJJI(int i) {
        C11JF c11jf = this.LLJ;
        if (c11jf != null) {
            this.LLIZ.LIZJ(c11jf);
        }
        InterfaceC420801kM interfaceC420801kMLJJLL = C11NZ.LJLJJLL(i, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS83S0101000_17(i, this, 1), new C09JN() { // from class: X.0eMW
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PointsShortTouchViewModel@559d.startShowShortTouchDelayDisable$3");
                C20441214yg.LJI("PointsShortTouchMgr", (Throwable) obj);
                C1C7U.LIZIZ("PointsShortTouchViewModel@559d.startShowShortTouchDelayDisable$3");
            }
        });
        this.LLJ = (C11JF) interfaceC420801kMLJJLL;
        this.LLIZ.LIZ(interfaceC420801kMLJJLL);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Boolean boolValueOf;
        C20441214yg.LIZIZ("PointsShortTouchMgr", c262100zr.LIZ);
        String str = c262100zr.LIZ;
        switch (str.hashCode()) {
            case -1403004634:
                if (str.equals("game_guessing_interact_tasks_finish") && LIZ()) {
                    LJIIIIZZ(new C1096970eeV(this.LLJI.LIZIZ, true), true, false);
                    break;
                }
                break;
            case 368786830:
                if (str.equals("game_guessing_short_touch_close")) {
                    ((InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)).Ud(EnumC1101860emO.NAME, "shortTouchGamePoints");
                }
                break;
            case 382417209:
                if (str.equals("game_guessing_short_touch_ready")) {
                    InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                    if (interfaceC1107590evd != null) {
                        boolValueOf = Boolean.valueOf(interfaceC1107590evd.getBoolean("needFreshData"));
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJJI(boolValueOf)) {
                        Room room = this.LLILZ;
                        if (room != null) {
                            C23250099c.LIZLLL((InterfaceC497601wk) this.LL.getValue(), null, null, new C1096950eeT(this, room, null), 3);
                        }
                    } else {
                        LJII(this.LLJI);
                    }
                }
                break;
            case 547166667:
                if (str.equals("game_guessing_indicator_user_attending")) {
                    try {
                        InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd2 != null && interfaceC1107590evd2.getInt("attended") == 1) {
                            C0IQQ.LIZIZ(this.LLILZIL);
                            break;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C20441214yg.LJI("PointsShortTouchMgr", e);
                        return;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.android.livesdk.game.model.GuessTaskPackInfo r8, boolean r9) {
        /*
            r7 = this;
            r5 = 0
            r7.LLJILJIL = r5
            com.bytedance.android.livesdk.game.model.TaskWidgetConfig r4 = r7.LLILZLL
            if (r4 != 0) goto Lc
            com.bytedance.android.livesdk.game.model.TaskWidgetConfig r4 = r8.config
            if (r4 != 0) goto Lc
            return
        Lc:
            int r1 = r4.refreshGap
            r0 = 20
            if (r1 >= r0) goto L14
            r4.refreshGap = r0
        L14:
            java.util.List<com.bytedance.android.livesdk.game.model.GameTaskInfo> r0 = r8.tasksInfo
            java.util.Iterator r6 = r0.iterator()
        L1a:
            boolean r0 = r6.hasNext()
            r2 = 1
            if (r0 == 0) goto L32
            java.lang.Object r3 = r6.next()
            r1 = r3
            com.bytedance.android.livesdk.game.model.GameTaskInfo r1 = (com.bytedance.android.livesdk.game.model.GameTaskInfo) r1
            int r0 = r1.taskType
            if (r0 != r2) goto L1a
            int r1 = r1.status
            r0 = 3
            if (r1 != r0) goto L1a
            r5 = r3
        L32:
            com.bytedance.android.livesdk.game.model.GameTaskInfo r5 = (com.bytedance.android.livesdk.game.model.GameTaskInfo) r5
            X.0eeV r0 = r7.LLJI
            boolean r3 = r0.LIZ
            if (r5 == 0) goto L8b
            boolean r0 = r7.LIZ()
            if (r0 == 0) goto L9a
            int r1 = r5.targetValue
            int r0 = r5.currentValue
            int r1 = r1 - r0
            int r0 = r4.showCountdownTime
            if (r1 > r0) goto L80
            if (r9 == 0) goto L7e
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L7a
            java.lang.String r1 = "yyyyMMdd"
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch: java.lang.Exception -> L7a
            r6.<init>(r1, r0)     // Catch: java.lang.Exception -> L7a
            java.util.Date r0 = new java.util.Date     // Catch: java.lang.Exception -> L7a
            r0.<init>()     // Catch: java.lang.Exception -> L7a
            java.lang.String r1 = r6.format(r0)     // Catch: java.lang.Exception -> L7a
            X.0JT6<java.lang.String> r0 = X.InterfaceC772390URp.LLZLL     // Catch: java.lang.Exception -> L7a
            java.lang.Object r0 = r0.LIZ()     // Catch: java.lang.Exception -> L7a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L7a
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Exception -> L7a
            if (r0 == 0) goto L7e
            X.01GW r0 = r7.LLILLL     // Catch: java.lang.Exception -> L7a
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L7a
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Exception -> L7a
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L7a
            if (r0 <= 0) goto L7e
            goto L95
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7e:
            r3 = 1
            goto L9a
        L80:
            int r1 = r1 - r0
            int r0 = r4.refreshGap
            if (r1 > r0) goto L9a
            r7.LLJILJIL = r5
            r7.LJIIJJI(r1)
            goto L9a
        L8b:
            X.11JF r1 = r7.LLIZLLLIL
            if (r1 == 0) goto La6
            X.11NJ r0 = r7.LLIZ
            r0.LIZJ(r1)
            goto La6
        L95:
            r7.LLJILJIL = r5
            r7.LJIIJJI(r0)
        L9a:
            if (r9 == 0) goto La6
            boolean r0 = r7.LLJILJILJ
            if (r0 == 0) goto Lb1
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.LLJILLL = r0
        La6:
            X.0eeV r1 = new X.0eeV
            r1.<init>(r8, r3)
            r0 = r9 ^ 1
            r7.LJIIIIZZ(r1, r2, r0)
            return
        Lb1:
            int r0 = r4.refreshGap
            long r0 = (long) r0
            r7.LJIIJ(r0, r4)
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1096990eeX.LIZIZ(com.bytedance.android.livesdk.game.model.GuessTaskPackInfo, boolean):void");
    }

    public final void LJIIJ(long j, TaskWidgetConfig taskWidgetConfig) {
        C11JF c11jf = this.LLIZLLLIL;
        if (c11jf != null) {
            this.LLIZ.LIZJ(c11jf);
        }
        InterfaceC420801kM interfaceC420801kMLJJLL = C19490011Na.LIZ(j, taskWidgetConfig.refreshGap, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS186S0100000_17(this, 110), new C09JN() { // from class: X.0eMX
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PointsShortTouchViewModel@559d.startDurationTaskUpdateDisable$3");
                C20441214yg.LJI("PointsShortTouchMgr", (Throwable) obj);
                C1C7U.LIZIZ("PointsShortTouchViewModel@559d.startDurationTaskUpdateDisable$3");
            }
        });
        this.LLIZLLLIL = (C11JF) interfaceC420801kMLJJLL;
        this.LLIZ.LIZ(interfaceC420801kMLJJLL);
    }

    public final void LJIIIIZZ(C1096970eeV c1096970eeV, boolean z, boolean z2) {
        Function1<? super C1096970eeV, Unit> function1;
        try {
            this.LLJI = c1096970eeV;
            if (z && (function1 = this.LLJIJIL) != null) {
                function1.invoke(c1096970eeV);
            }
            if (z2) {
                LJII(this.LLJI);
            }
            Room room = this.LLILZ;
            if (room != null) {
                room.setGuessTaskPackInfo(this.LLJI.LIZIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJI("PointsShortTouchMgr", th);
        }
    }
}
