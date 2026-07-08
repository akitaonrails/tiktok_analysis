package X;

import Y.ARunnableS118S0100000_18;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS84S0200000_15;
import android.content.Context;
import android.os.Looper;
import com.bytedance.android.live.liveinteract.api.event.PlayerChangeLayoutParamEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostIcyClashMatchDelayEnsureLynxViewSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostIcyClashMatchLeakFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchIcyClashEffectUrl;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleEffectInfos;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS610S0100000_31;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.158N, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C158N implements InterfaceC977420bXg {
    public final DataChannel LL;
    public Context LLILLJJLI;
    public C158M LLILLL;
    public InterfaceC937900aVw LLILZ;
    public final C158U LLILZIL;
    public C975960bVK LLIZ;
    public int LLIZLLLIL;
    public final BPEAHandler LLILZLL = new BPEAHandler(Looper.getMainLooper());
    public String LLJ = "";

    @Override // X.InterfaceC977420bXg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
    }

    @Override // X.InterfaceC977420bXg
    public final void LJII(BattleInfoResponse battleInfoResponse) {
    }

    @Override // X.InterfaceC977420bXg
    public final void reset() {
    }

    public final void LJI() {
        C158M c158m = this.LLILLL;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c158m != null ? c158m.LIZJ : null;
        if (LJIIIIZZ() == null) {
            this.LLIZLLLIL++;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show return for layoutManager is null.: ");
            sbLIZ.append(this.LLIZLLLIL);
            sbLIZ.append(" parent:");
            sbLIZ.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null ? sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent() : null);
            C20441214yg.LJ("LiveMatchEffectComponent", C2188811AlT.LIZIZ(sbLIZ));
            if (LiveCoHostIcyClashMatchDelayEnsureLynxViewSetting.INSTANCE.isEnable()) {
                C786410Ut5.LJLIIL(300L, this.LLILZLL, new ARunnableS118S0100000_18(this, 69));
                return;
            }
            return;
        }
        InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = LJIIIIZZ();
        if (interfaceC937900aVwLJIIIIZZ != null) {
            interfaceC937900aVwLJIIIIZZ.LLIIIL(true);
        }
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent() != null) {
                C20441214yg.LJ("LiveMatchEffectComponent", "show return for effectView is not null.");
                return;
            }
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("addSubviewBetweenRenderAndUIContainer layoutManager:");
                sbLIZ2.append(LJIIIIZZ());
                C20441214yg.LIZIZ("LiveMatchEffectComponent", C2188811AlT.LIZIZ(sbLIZ2));
                InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ2 = LJIIIIZZ();
                if (interfaceC937900aVwLJIIIIZZ2 != null) {
                    interfaceC937900aVwLJIIIIZZ2.LLIILZL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                }
            }
        }
    }

    public final InterfaceC937900aVw LJIIIIZZ() {
        if (this.LLILZ == null) {
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            this.LLILZ = interfaceC954180awCLJIIIZ != null ? interfaceC954180awCLJIIIZ.LLIIJLIL() : null;
        }
        return this.LLILZ;
    }

    public final void LJIIJJI() {
        if (this.LLILZIL.LLILZIL) {
            C20441214yg.LJ("LiveMatchEffectComponent", "show return for isEffectStarted is false.");
            return;
        }
        Context context = this.LLILLJJLI;
        if (context != null) {
            LJIIJ(context);
        }
        C20441214yg.LIZIZ("LiveMatchEffectComponent", "realShow");
        C158U c158u = this.LLILZIL;
        c158u.getClass();
        C20441214yg.LJIIIZ("LiveMatchEffectFEPresenter", "onEffectStarted");
        c158u.LLILZIL = true;
        c158u.LJIIIIZZ(false);
        c158u.LJII();
    }

    @Override // X.InterfaceC977430bXh
    public final void dismiss() {
        C158M c158m = this.LLILLL;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c158m != null ? c158m.LIZJ : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss isShow:");
        sbLIZ.append(this.LLILZIL.LLILZIL);
        sbLIZ.append(" effectView:");
        sbLIZ.append(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        C20441214yg.LIZIZ("LiveMatchEffectComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (!LiveCoHostIcyClashMatchLeakFixSetting.INSTANCE.isEnable() && sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
            C20441214yg.LJ("LiveMatchEffectComponent", "dismiss return for effectView is null.");
            return;
        }
        C158U c158u = this.LLILZIL;
        c158u.getClass();
        JSONObject jSONObjectLIZLLL = c158u.LIZLLL(EnumC112200bg.FINISH, false);
        C389001fE.LIZ("match_effect_play_control", jSONObjectLIZLLL, System.currentTimeMillis() + 10000, false);
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LQ.LJJLIIIJJIZ(5, new Throwable().getStackTrace()), "\n", null, null, 0, null, AFwS274S0000000_30.get$arr$(263), 30);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sendFinishToFE: ");
        sbLIZ2.append(jSONObjectLIZLLL);
        sbLIZ2.append(" isStick:");
        sbLIZ2.append(c158u.LLILLJJLI);
        sbLIZ2.append(" stack:");
        sbLIZ2.append(strLJJLIIIJ);
        C20441214yg.LIZIZ("LiveMatchEffectFEPresenter", C2188811AlT.LIZIZ(sbLIZ2));
        c158u.LLILZIL = false;
        c158u.LLILLL = null;
        C1548820qPI.LJIIIIZZ("lynx_match_icy_effect_on_ready", c158u);
        c158u.LLILZLL = false;
        c158u.LLJ = null;
        DataChannel dataChannel = c158u.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(c158u);
        }
        c158u.LLJIJIL = false;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C930540aK4.LJJIJL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
        }
        InterfaceC937900aVw interfaceC937900aVwLJIIIIZZ = LJIIIIZZ();
        if (interfaceC937900aVwLJIIIIZZ != null) {
            interfaceC937900aVwLJIIIIZZ.LLIIIL(false);
        }
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C1165970gRn(this, null), 2);
        this.LLIZLLLIL = 0;
        this.LLIZ = null;
        this.LLILZLL.removeCallbacksAndMessages(null);
    }

    public final void LJIIL() {
        C158M c158m;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("retryRealShow saveShowCount:");
        sbLIZ.append(this.LLIZLLLIL);
        C20441214yg.LIZIZ("LiveMatchEffectComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLIZLLLIL > 0) {
            this.LLIZLLLIL = 0;
            Context context = this.LLILLJJLI;
            if (context == null || (c158m = this.LLILLL) == null) {
                return;
            }
            c158m.LIZ(C915980Zwa.LIZLLL().getBattleId(), context, this.LLJ, false);
        }
    }

    @Override // X.InterfaceC977430bXh
    public final void onUnload() {
        dismiss();
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public C158N(DataChannel dataChannel) {
        this.LL = dataChannel;
        this.LLILZIL = new C158U(dataChannel);
    }

    @Override // X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        this.LLILLJJLI = matchBaseWidget.context;
        this.LLILLL = new C158M(LiveMatchIcyClashEffectUrl.INSTANCE.link(), this.LLILZIL);
        C20441214yg.LIZIZ("LiveMatchEffectComponent", "onLoad");
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.DQ2(PlayerChangeLayoutParamEvent.class, this, new AwS610S0100000_31(this, 384));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[PHI: r8
      0x0045: PHI (r8v3 boolean) = (r8v1 boolean), (r8v0 boolean) binds: [B:49:0x00b1, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC977420bXg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C975960bVK r10) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C158N.LJFF(X.0bVK):void");
    }

    public final void LJIIJ(Context context) {
        C158M c158m = this.LLILLL;
        if (c158m != null && c158m.LIZJ != null) {
            C20441214yg.LJ("LiveMatchEffectComponent", "prepareSparkView return for effectView is not null.");
            LJI();
            return;
        }
        C158M c158m2 = this.LLILLL;
        if (c158m2 != null) {
            c158m2.LIZ(C915980Zwa.LIZLLL().getBattleId(), context, this.LLJ, false);
        }
        LJI();
    }

    public final void LJIILIIL(Long l, Long l2, BattleEffectInfos battleEffectInfos) {
        long jLongValue;
        long jLongValue2;
        long j;
        long jLIZ = C158B.LIZ();
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long j2 = jLongValue - jLIZ;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        long j3 = jLongValue2 - jLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerPromptAndEffect currentMS is ");
        sbLIZ.append(jLIZ);
        sbLIZ.append(", promptTimeMs is ");
        sbLIZ.append(l);
        sbLIZ.append(", startTimeMs is ");
        sbLIZ.append(l2);
        sbLIZ.append(" delayPromptStartDuration:");
        sbLIZ.append(j2);
        sbLIZ.append(" effectStartDuration:");
        sbLIZ.append(j3);
        sbLIZ.append(" effectInfos:");
        sbLIZ.append(battleEffectInfos);
        C20441214yg.LIZIZ("LiveMatchEffectComponent", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJ = "system_trigger";
        if (j2 >= 0) {
            C786410Ut5.LJLIIL(j2, this.LLILZLL, new ARunnableS131S0100000_31(this, 133));
        }
        BPEAHandler bPEAHandler = this.LLILZLL;
        ARunnableS84S0200000_15 aRunnableS84S0200000_15 = new ARunnableS84S0200000_15(this, battleEffectInfos, 33);
        if (0 < j3) {
            j = j3;
        } else {
            j = 0;
        }
        C786410Ut5.LJLIIL(j, bPEAHandler, aRunnableS84S0200000_15);
        if (j3 >= 0) {
            C786410Ut5.LJLIIL(j3, this.LLILZLL, new ARunnableS131S0100000_31(this, 134));
        }
    }
}
