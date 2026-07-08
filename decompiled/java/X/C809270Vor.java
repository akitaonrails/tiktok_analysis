package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Message;
import android.text.format.DateUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.newmedia.redbadge.RedBadgePushProcessService;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vor, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809270Vor implements WeakHandler.IHandler {
    public static volatile C809270Vor LLJILJILJ;
    public final Context LL;
    public final WeakHandler LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public C809280Vos LLILZLL;
    public C809280Vos LLIZ;
    public volatile boolean LLIZLLLIL;
    public boolean LLJ;
    public final ARunnableS113S0100000_13 LLJI = new ARunnableS113S0100000_13(this, 198);
    public final C809290Vot LLJIJIL;
    public final C809300Vou LLJILJIL;

    public final void LIZLLL() {
        try {
            C809350Voz c809350VozLIZ = C809350Voz.LIZ(this.LL);
            int i = this.LLILZ;
            C809340Voy c809340VoyLIZ = c809350VozLIZ.LIZ.LIZ();
            c809340VoyLIZ.LIZIZ.put("red_badge_launch_times", Integer.valueOf(i));
            c809340VoyLIZ.LIZ();
            C809350Voz c809350VozLIZ2 = C809350Voz.LIZ(this.LL);
            int i2 = this.LLILZIL;
            C809340Voy c809340VoyLIZ2 = c809350VozLIZ2.LIZ.LIZ();
            c809340VoyLIZ2.LIZIZ.put("red_badge_show_times", Integer.valueOf(i2));
            c809340VoyLIZ2.LIZ();
            C809350Voz c809350VozLIZ3 = C809350Voz.LIZ(this.LL);
            C809280Vos c809280Vos = this.LLILZLL;
            String strJ3 = c809280Vos == null ? "" : C786410Ut5.J3(c809280Vos.LIZIZ());
            C809340Voy c809340VoyLIZ3 = c809350VozLIZ3.LIZ.LIZ();
            c809340VoyLIZ3.LIZIZ.put("red_badge_last_time_paras", strJ3);
            c809340VoyLIZ3.LIZ();
            C809350Voz c809350VozLIZ4 = C809350Voz.LIZ(this.LL);
            C809280Vos c809280Vos2 = this.LLIZ;
            String strJ32 = c809280Vos2 != null ? C786410Ut5.J3(c809280Vos2.LIZIZ()) : "";
            C809340Voy c809340VoyLIZ4 = c809350VozLIZ4.LIZ.LIZ();
            c809340VoyLIZ4.LIZIZ.put("red_badge_last_last_time_paras", strJ32);
            c809340VoyLIZ4.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void onPause() {
        if (this.LL == null) {
            return;
        }
        if (this.LLJ) {
            this.LLILLJJLI.postDelayed(this.LLJI, 30000L);
            this.LLILLJJLI.sendEmptyMessage(2);
        }
        if (C809190Voj.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPause AppAlive = ");
            sbLIZ.append(this.LLJ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0Vot] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0Vou] */
    public C809270Vor(Context context) {
        boolean z;
        final WeakHandler weakHandler = this.LLILLJJLI;
        this.LLJIJIL = new ContentObserver(weakHandler) { // from class: X.0Vot
            @Override // android.database.ContentObserver
            public final void onChange(boolean z2) {
                C809270Vor c809270Vor = this.LIZ;
                c809270Vor.LLILLL = C809350Voz.LIZ(c809270Vor.LL).LIZ.LIZIZ("is_desktop_red_badge_show", false);
            }
        };
        final WeakHandler weakHandler2 = this.LLILLJJLI;
        this.LLJILJIL = new ContentObserver(weakHandler2) { // from class: X.0Vou
            @Override // android.database.ContentObserver
            public final void onChange(boolean z2) {
                C809270Vor c809270Vor = this.LIZ;
                c809270Vor.LLILLL = C809350Voz.LIZ(c809270Vor.LL).LIZ.LIZIZ("is_desktop_red_badge_show", false);
            }
        };
        Context contextN3 = C786410Ut5.N3(context);
        this.LL = contextN3;
        C808510Vnd.LIZ().getClass();
        this.LLILLJJLI = new WeakHandler(C786410Ut5.W2(C808510Vnd.LLILLL), this);
        try {
            this.LLILZ = C809350Voz.LIZ(contextN3).LIZ.LIZJ("red_badge_launch_times", 0);
            this.LLILZIL = C809350Voz.LIZ(contextN3).LIZ.LIZJ("red_badge_show_times", 0);
            String strLJ = C809350Voz.LIZ(contextN3).LIZ.LJ("red_badge_last_time_paras");
            if (!C2093608Ic.LJ(strLJ)) {
                this.LLILZLL = C809280Vos.LIZ(strLJ);
            }
            String strLJ2 = C809350Voz.LIZ(contextN3).LIZ.LJ("red_badge_last_last_time_paras");
            if (!C2093608Ic.LJ(strLJ2)) {
                this.LLIZ = C809280Vos.LIZ(strLJ2);
            }
            C809280Vos c809280Vos = this.LLILZLL;
            if (c809280Vos != null) {
                if (!DateUtils.isToday(c809280Vos.LIZ)) {
                    this.LLILZ = 0;
                    z = true;
                } else {
                    z = false;
                }
                if (!DateUtils.isToday(this.LLILZLL.LIZJ)) {
                    this.LLILZIL = 0;
                } else if (z) {
                }
                LIZLLL();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.LIZJ(context, "is_desktop_red_badge_show", "boolean"), true, this.LLJIJIL);
            context.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.LIZJ(context, "desktop_red_badge_args", "string"), true, this.LLJILJIL);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        this.LLILLL = C809350Voz.LIZ(this.LL).LIZ.LIZIZ("is_desktop_red_badge_show", false);
    }

    public static C809270Vor LIZJ(Context context) {
        if (LLJILJILJ == null) {
            synchronized (C809270Vor.class) {
                try {
                    if (LLJILJILJ == null) {
                        LLJILJILJ = new C809270Vor(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLJILJILJ;
    }

    public final void LIZ(String str) {
        long jOptLong;
        boolean zLIZIZ;
        int iNextInt;
        if (str != null && this.LL != null && this.LLILLL) {
            try {
                if (C809190Voj.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("handleMessage = ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt("show") <= 0) {
                    return;
                }
                String strOptString = jSONObject.optString("content_type");
                String strOptString2 = jSONObject.optString("content");
                try {
                    jOptLong = new JSONObject(str).optLong("rule_id");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    jOptLong = 0;
                }
                if (!C2093608Ic.LJ(strOptString) && !C2093608Ic.LJ(strOptString2)) {
                    C809320Vow c809320Vow = C809040VoU.LIZ().LIZ;
                    int i = 1;
                    if (c809320Vow.LIZIZ) {
                        C813110Vv3.LIZJ().getClass();
                        zLIZIZ = !C813110Vv3.LLIZLLLIL;
                    } else {
                        zLIZIZ = c809320Vow.LIZIZ("current_app_foreground", false);
                    }
                    if (!zLIZIZ) {
                        if ("desktop_red_badge".equals(strOptString)) {
                            try {
                                iNextInt = CastIntegerProtector.parseInt(strOptString2);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                iNextInt = new Random().nextInt(5) + 1;
                            }
                            if (iNextInt > 0) {
                                if (iNextInt > 15) {
                                    iNextInt = 15;
                                }
                                C0VFK.LIZJ().LIZ(iNextInt, this.LL);
                                this.LLIZLLLIL = true;
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("content", strOptString2);
                                long j = iNextInt;
                                InterfaceC808610Vnn interfaceC808610VnnLIZ = C808480Vna.LIZ();
                                if (interfaceC808610VnnLIZ != null) {
                                    interfaceC808610VnnLIZ.LJIJJ(this.LL, "desktop_red_badge", j, jSONObject2);
                                }
                                Bundle bundle = new Bundle();
                                bundle.putInt("badge_number", iNextInt);
                                if (!this.LLILLL) {
                                    i = 0;
                                }
                                bundle.putInt("red_badge_is_open", i);
                                C786410Ut5.LJJJI("show_type", "request", bundle);
                                bundle.putLong("rule_id", jOptLong);
                                InterfaceC808610Vnn interfaceC808610VnnLIZ2 = C808480Vna.LIZ();
                                if (interfaceC808610VnnLIZ2 != null) {
                                    interfaceC808610VnnLIZ2.LJJJJL(bundle);
                                }
                            } else {
                                C0VFK.LIZJ().LIZ(0, this.LL);
                                this.LLIZLLLIL = false;
                            }
                            LIZIZ(2);
                            return;
                        }
                        if ("notification".equals(strOptString)) {
                            C808480Vna.LIZ().LJJJJJL();
                            Intent intent = new Intent("com.ss.android.message");
                            C808480Vna.LIZ().LJLIIL();
                            intent.putExtra("message_data", strOptString2);
                            intent.setPackage(this.LL.getPackageName());
                            C786410Ut5.s3(this.LL, intent);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("content", strOptString2);
                            InterfaceC808610Vnn interfaceC808610VnnLIZ3 = C808480Vna.LIZ();
                            if (interfaceC808610VnnLIZ3 != null) {
                                interfaceC808610VnnLIZ3.LJIJJ(this.LL, "notification", 0L, jSONObject3);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public final void LIZIZ(int i) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.LLILZLL == null) {
                this.LLILZLL = new C809280Vos(0);
            }
            if (this.LLIZ == null) {
                this.LLIZ = new C809280Vos(0);
            }
            if (!DateUtils.isToday(this.LLILZLL.LIZ)) {
                this.LLILZ = 0;
            }
            if (!DateUtils.isToday(this.LLILZLL.LIZJ)) {
                this.LLILZIL = 0;
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C809280Vos c809280Vos = this.LLIZ;
                        C809280Vos c809280Vos2 = this.LLILZLL;
                        c809280Vos.LIZJ = c809280Vos2.LIZJ;
                        c809280Vos2.LIZJ = jCurrentTimeMillis;
                        this.LLILZIL++;
                    }
                } else {
                    this.LLILZLL.LIZIZ = jCurrentTimeMillis;
                }
            } else {
                C809280Vos c809280Vos3 = this.LLIZ;
                C809280Vos c809280Vos4 = this.LLILZLL;
                c809280Vos3.LIZ = c809280Vos4.LIZ;
                c809280Vos3.LIZIZ = c809280Vos4.LIZIZ;
                c809280Vos4.LIZ = jCurrentTimeMillis;
                c809280Vos4.LIZIZ = jCurrentTimeMillis + 900000;
                this.LLILZ++;
            }
            LIZLLL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        boolean zLJI = MethodIDManager.LJI(202308);
        if (message == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        try {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            C0VFK.LIZJ().LIZ(0, this.LL);
                            this.LLIZLLLIL = false;
                        }
                    } else {
                        LIZIZ(1);
                    }
                } else {
                    LIZIZ(1);
                    if (C809190Voj.LIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("isAllowRedBadgeShow = ");
                        sbLIZ.append(this.LLILLL);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (this.LLILLL) {
                        Intent intent = new Intent(this.LL, (Class<?>) RedBadgePushProcessService.class);
                        intent.putExtra("app_exit", true);
                        C786410Ut5.s3(this.LL, intent);
                    }
                }
            } else {
                LIZIZ(0);
                C0VFK.LIZJ().LIZ(0, this.LL);
                this.LLIZLLLIL = false;
                if (C809190Voj.LIZ()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("isAllowRedBadgeShow = ");
                    sbLIZ2.append(this.LLILLL);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                if (this.LLILLL) {
                    Intent intent2 = new Intent(this.LL, (Class<?>) RedBadgePushProcessService.class);
                    intent2.putExtra("app_entrance", true);
                    C786410Ut5.s3(this.LL, intent2);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
