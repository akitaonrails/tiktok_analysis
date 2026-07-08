package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.features.model.SessionFeatureItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DCO, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCO implements InterfaceC2251961DCg<C204535151p>, InterfaceC591550NIb {
    public static final /* synthetic */ int LJFF = 0;
    public final C01GW LIZ = C452501pT.LIZIZ(new C2216111BoP());
    public final C2091208He<String, Integer> LIZIZ = new C2091208He<>(100);
    public long LIZJ = System.currentTimeMillis();
    public int LIZLLL;
    public int LJ;

    public final InterfaceC625970Ogt LIZLLL() {
        return (InterfaceC625970Ogt) this.LIZ.getValue();
    }

    public final void LIZJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C1387310mCn.LIZ(this.LIZJ) != C1387310mCn.LIZ(jCurrentTimeMillis)) {
            this.LIZLLL = 0;
            this.LJ = 0;
            this.LIZJ = jCurrentTimeMillis;
        }
        if (C1387310mCn.LIZ(LIZLLL().getLong("key_timestamp", 0L)) != C1387310mCn.LIZ(jCurrentTimeMillis)) {
            LIZLLL().LJIIIIZZ("key_timestamp", jCurrentTimeMillis);
            LIZLLL().LIZJ("key_play_count", 0);
            LIZLLL().LIZJ("key_request_count", 0);
            LIZLLL().LJIIIIZZ("key_day_view_time", 0L);
        }
    }

    @Override // X.InterfaceC591550NIb
    public final void LIZ(InterfaceC582850MtX interfaceC582850MtX) {
        if (interfaceC582850MtX instanceof C591310NHd) {
            LIZJ();
            this.LJ++;
            LIZLLL().LIZJ("key_request_count", LIZLLL().getInt("key_request_count", 0) + 1);
        }
    }

    @Override // X.InterfaceC2251961DCg
    public final void LIZIZ(C204535151p c204535151p) {
        InterfaceC582850MtX interfaceC582850MtX = c204535151p.LIZIZ;
        SessionFeatureItem sessionFeatureItem = c204535151p.LIZ;
        String str = sessionFeatureItem.awemeId;
        if (((interfaceC582850MtX instanceof C582300Mse) || (interfaceC582850MtX instanceof C2183911AdZ)) && !this.LIZIZ.containsKey(str)) {
            LIZJ();
            this.LIZIZ.put(str, 0);
            this.LIZLLL++;
            LIZLLL().LIZJ("key_play_count", LIZLLL().getInt("key_play_count", 0) + 1);
            sessionFeatureItem.sessionVNum = this.LIZLLL;
            sessionFeatureItem.sessionRNum = this.LJ;
            sessionFeatureItem.dayVNum = LIZLLL().getInt("key_play_count", 0);
            sessionFeatureItem.dayRNum = LIZLLL().getInt("key_request_count", 0);
        }
        if (interfaceC582850MtX instanceof C603460Nlg) {
            C603460Nlg c603460Nlg = (C603460Nlg) interfaceC582850MtX;
            String str2 = c603460Nlg.LIZ;
            long j = 0;
            if (Intrinsics.LJFF(str2, "play_time")) {
                String value = c603460Nlg.LIZIZ.getValue("duration");
                if (value != null) {
                    try {
                        j = CastLongProtector.parseLong(value);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                LJ(j);
                return;
            }
            if (Intrinsics.LJFF(str2, "livesdk_live_window_duration_v2")) {
                String value2 = c603460Nlg.LIZIZ.getValue("duration");
                if (value2 != null) {
                    try {
                        j = CastLongProtector.parseLong(value2);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                LJ(j);
            }
        }
    }

    public final void LJ(long j) {
        LIZJ();
        long j2 = LIZLLL().getLong("key_day_view_time", 0L);
        if (j2 < 0) {
            LIZLLL().LJIIIIZZ("key_day_view_time", j);
        } else {
            LIZLLL().LJIIIIZZ("key_day_view_time", j2 + j);
        }
    }
}
