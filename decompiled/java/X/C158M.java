package X;

import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.view.ViewTreeObserver;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleEffectInfos;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: renamed from: X.158M, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C158M {
    public final String LIZ;
    public final C158J LIZIZ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZJ;

    public final void LIZIZ(BattleEffectInfos battleEffectInfos) {
        Long lValueOf;
        long j;
        C158J c158j = this.LIZIZ;
        c158j.getClass();
        if (battleEffectInfos != null) {
            long j2 = battleEffectInfos.effectListVersion;
            BattleEffectInfos battleEffectInfos2 = c158j.LLILLL;
            if (battleEffectInfos2 != null) {
                j = battleEffectInfos2.effectListVersion;
            } else {
                j = -1000;
            }
            if (j2 > j) {
                c158j.LLILLL = battleEffectInfos;
                c158j.LJII();
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateEffectInfos return, isEffectStarted:");
        sbLIZ.append(c158j.LLILZIL);
        sbLIZ.append(" version:");
        if (battleEffectInfos != null) {
            lValueOf = Long.valueOf(battleEffectInfos.effectListVersion);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(" this:");
        sbLIZ.append(c158j);
        C20441214yg.LJ("LiveMatchEffectFEPresenter", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C158M(String str, C158J c158j) {
        this.LIZ = str;
        this.LIZIZ = c158j;
    }

    public final void LIZ(long j, Context context, String str, boolean z) {
        if (this.LIZJ != null) {
            C20441214yg.LJ("SparkViewManager", "prepareSparkView return for effectView is not null.");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareSparkView triggerMode:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("SparkViewManager", C2188811AlT.LIZIZ(sbLIZ));
        C158P c158p = this.LIZIZ.LLIZLLLIL;
        c158p.getClass();
        c158p.LJIIIIZZ = String.valueOf(j);
        c158p.LJIIJ = z;
        c158p.LJII = System.currentTimeMillis();
        c158p.LJIIIZ = str;
        c158p.LJIL();
        c158p.LJIJJLI("effect_view_create_start");
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(context, this.LIZ, null, true, new AwS397S0200000_31(this, (C158M) c259800zU, (C259800zU<String>) 91));
        this.LIZJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1.setId(R.id.o2i);
            final C013C c013c = new C013C();
            ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: X.158L
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("effectView render ready, hasDraw:");
                    sbLIZ2.append(c013c.element);
                    C20441214yg.LIZIZ("SparkViewManager", C2188811AlT.LIZIZ(sbLIZ2));
                    C013C c013c2 = c013c;
                    if (c013c2.element) {
                        return;
                    }
                    c013c2.element = true;
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
                    HandlerHook.viewPost(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new ARunnableS81S0200000_12(this, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 95));
                    C158P c158p2 = this.LIZIZ.LLIZLLLIL;
                    String str2 = c259800zU.element;
                    c158p2.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j2 = c158p2.LJII;
                    long j3 = j2 > 0 ? jCurrentTimeMillis - j2 : 0L;
                    c158p2.LJIL();
                    AbstractC962030b8r.LJIIJ(c158p2.LIZLLL, "effect_container_id", str2, true);
                    AbstractC962030b8r.LJIIJ(c158p2.LIZLLL, "duration", String.valueOf(j3), true);
                    c158p2.LJIJJLI("effect_view_first_frame_render");
                }
            };
            ViewTreeObserver viewTreeObserver = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnDrawListener(onDrawListener);
                C2187701Ajg.LIZ(viewTreeObserver, onDrawListener, ViewTreeObserver.OnDrawListener.class);
            }
        }
    }
}
