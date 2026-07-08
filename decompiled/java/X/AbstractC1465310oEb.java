package X;

import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0oEb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1465310oEb extends AbstractC2255721DQs<InterfaceC1465230oET> implements InterfaceC1465230oET, InterfaceC379610EuV {
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final C11NJ LLILZ = new C11NJ();
    public final LiveEvent<Boolean> LLILZIL = new C560530Lyd();
    public final LiveEvent<Pair<Effect, String>> LLILZLL = new C560530Lyd();
    public final LiveEvent<Pair<Effect, String>> LLIZ = new C560530Lyd();
    public final LiveEvent<Unit> LLIZLLLIL = new C560530Lyd();
    public final LiveEvent<Pair<Effect, String>> LLJ = new C560530Lyd();
    public final LiveEvent<Unit> LLJI = new C560530Lyd();
    public final LiveEvent<Unit> LLJIJIL = new C560530Lyd();
    public final C385670FAf<String> LLJILJIL = new h0(null);
    public final C385670FAf<Long> LLJILJILJ = new h0(-1L);
    public final LiveEvent<Unit> LLJILLL = new C560530Lyd();
    public final C560530Lyd<C1635170seZ> LLJJ = new C560530Lyd<>();
    public final C560530Lyd<Boolean> LLJJI = new C560530Lyd<>();
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(255));

    public InterfaceC1465230oET W1() {
        return this;
    }

    public abstract C1465200oEQ Z1();

    private final C1634780sdw X1() {
        return (C1634780sdw) this.LLJJIII.getValue();
    }

    @Override // X.InterfaceC1465230oET
    public void N8() {
        if (this.LLILLJJLI.isAdded(Z1())) {
            return;
        }
        this.LLILLJJLI.add(this.LLILLL, Z1(), "EditStickerPanelScene");
    }

    private final void w2() {
        ((C560530Lyd) p9()).LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1465230oET
    public InterfaceC1640930snr V6() {
        return Z1().LLLILZLLLI();
    }

    @Override // X.InterfaceC1465230oET
    public void Xg() {
        ((C560530Lyd) Fs()).LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1465230oET
    public void o3() {
        ((C560530Lyd) sj()).LJIIJ(Unit.LIZ);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLILZ.dispose();
    }

    @Override // X.InterfaceC1465230oET
    public void vu() {
        ((C560530Lyd) L9()).LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1465230oET
    public C385670FAf<Long> Cu() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1465230oET
    public LiveEvent<Unit> Fs() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1465230oET
    public C560530Lyd<C1635170seZ> J60() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1465230oET
    public LiveEvent<Unit> L9() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1465230oET
    public C560530Lyd<Boolean> Q60() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1465230oET
    public LiveEvent<Pair<Effect, String>> Tg() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1465230oET
    public LiveEvent<Boolean> V7() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1465230oET
    public C385670FAf<String> getEnterMethod() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1465230oET
    public LiveEvent<Pair<Effect, String>> hr() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1465230oET
    public LiveEvent<Pair<Effect, String>> i8() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1465230oET
    public LiveEvent<Unit> p9() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1465230oET
    public LiveEvent<Unit> sj() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1465230oET
    public void Bt(InterfaceC1406950miT interfaceC1406950miT) {
        Z1().LLJJJJ = interfaceC1406950miT;
    }

    @Override // X.InterfaceC1465230oET
    public boolean I5(Effect effect) {
        return Z1().LLLII(effect);
    }

    @Override // X.InterfaceC1465230oET
    public void Ic(ProviderEffect providerEffect) {
        C1465380oEi.LIZ(providerEffect);
    }

    @Override // X.InterfaceC1465230oET
    public void Jr(Effect effect) {
        String strValueOf = null;
        if (C1462570oAB.LJ(effect) && !C1635160seY.LIZ(effect)) {
            o2(effect, null);
            return;
        }
        if (!C1635160seY.LIZ(effect) && !C1462570oAB.LJFF(effect)) {
            int iLIZIZ = C1462570oAB.LIZIZ(effect);
            if (iLIZIZ == 3 || iLIZIZ == 4) {
                strValueOf = String.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
            Nu(effect, strValueOf);
            return;
        }
        Nu(effect, effect.getExtra());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1465230oET
    public void yw(ProviderEffect providerEffect) {
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        Object[] objArr20 = 0;
        Object[] objArr21 = 0;
        Object[] objArr22 = 0;
        Object[] objArr23 = 0;
        Object[] objArr24 = 0;
        Object[] objArr25 = 0;
        Object[] objArr26 = 0;
        Object[] objArr27 = 0;
        Object[] objArr28 = 0;
        Object[] objArr29 = 0;
        Object[] objArr30 = 0;
        Object[] objArr31 = 0;
        Object[] objArr32 = 0;
        Object[] objArr33 = 0;
        Object[] objArr34 = 0;
        Object[] objArr35 = 0;
        Object[] objArr36 = 0;
        Object[] objArr37 = 0;
        Object[] objArr38 = 0;
        Object[] objArr39 = 0;
        Object[] objArr40 = 0;
        Object[] objArr41 = 0;
        Object[] objArr42 = 0;
        Object[] objArr43 = 0;
        Object[] objArr44 = 0;
        Object[] objArr45 = 0;
        Object[] objArr46 = 0;
        Object[] objArr47 = 0;
        Object[] objArr48 = 0;
        Object[] objArr49 = 0;
        Object[] objArr50 = 0;
        Object[] objArr51 = 0;
        Object[] objArr52 = 0;
        Object[] objArr53 = 0;
        Object[] objArr54 = 0;
        if (C1635160seY.LJ(providerEffect)) {
            C1634780sdw c1634780sdwX1 = X1();
            if (c1634780sdwX1 != null) {
                ConcurrentHashMap<ProviderEffect, Effect> concurrentHashMap = c1634780sdwX1.LJFF;
                Effect effect = concurrentHashMap.get(providerEffect);
                if (effect == null) {
                    long j = 0;
                    int i = -1;
                    Object[] objArr55 = objArr54 == true ? 1 : 0;
                    Object[] objArr56 = objArr53 == true ? 1 : 0;
                    Object[] objArr57 = objArr52 == true ? 1 : 0;
                    Object[] objArr58 = objArr51 == true ? 1 : 0;
                    Object[] objArr59 = objArr50 == true ? 1 : 0;
                    Object[] objArr60 = objArr49 == true ? 1 : 0;
                    Object[] objArr61 = objArr48 == true ? 1 : 0;
                    Object[] objArr62 = objArr47 == true ? 1 : 0;
                    Object[] objArr63 = objArr46 == true ? 1 : 0;
                    Object[] objArr64 = objArr45 == true ? 1 : 0;
                    Object[] objArr65 = objArr44 == true ? 1 : 0;
                    Object[] objArr66 = objArr43 == true ? 1 : 0;
                    Object[] objArr67 = objArr42 == true ? 1 : 0;
                    Object[] objArr68 = objArr41 == true ? 1 : 0;
                    Object[] objArr69 = objArr40 == true ? 1 : 0;
                    Object[] objArr70 = objArr39 == true ? 1 : 0;
                    Object[] objArr71 = objArr38 == true ? 1 : 0;
                    Object[] objArr72 = objArr37 == true ? 1 : 0;
                    Object[] objArr73 = objArr36 == true ? 1 : 0;
                    Object[] objArr74 = objArr35 == true ? 1 : 0;
                    Object[] objArr75 = objArr34 == true ? 1 : 0;
                    Object[] objArr76 = objArr33 == true ? 1 : 0;
                    Object[] objArr77 = objArr32 == true ? 1 : 0;
                    Object[] objArr78 = objArr31 == true ? 1 : 0;
                    Object[] objArr79 = objArr30 == true ? 1 : 0;
                    Object[] objArr80 = objArr29 == true ? 1 : 0;
                    Object[] objArr81 = objArr28 == true ? 1 : 0;
                    Object[] objArr82 = objArr27 == true ? 1 : 0;
                    Object[] objArr83 = objArr26 == true ? 1 : 0;
                    Object[] objArr84 = objArr25 == true ? 1 : 0;
                    Object[] objArr85 = objArr24 == true ? 1 : 0;
                    Object[] objArr86 = objArr23 == true ? 1 : 0;
                    Object[] objArr87 = objArr22 == true ? 1 : 0;
                    Object[] objArr88 = objArr21 == true ? 1 : 0;
                    Object[] objArr89 = objArr20 == true ? 1 : 0;
                    Object[] objArr90 = objArr19 == true ? 1 : 0;
                    Object[] objArr91 = objArr18 == true ? 1 : 0;
                    Object[] objArr92 = objArr17 == true ? 1 : 0;
                    Object[] objArr93 = objArr16 == true ? 1 : 0;
                    Object[] objArr94 = objArr15 == true ? 1 : 0;
                    Object[] objArr95 = objArr14 == true ? 1 : 0;
                    Object[] objArr96 = objArr13 == true ? 1 : 0;
                    Object[] objArr97 = objArr12 == true ? 1 : 0;
                    Object[] objArr98 = objArr11 == true ? 1 : 0;
                    Object[] objArr99 = objArr10 == true ? 1 : 0;
                    Object[] objArr100 = objArr9 == true ? 1 : 0;
                    Object[] objArr101 = objArr8 == true ? 1 : 0;
                    Object[] objArr102 = objArr7 == true ? 1 : 0;
                    Object[] objArr103 = objArr6 == true ? 1 : 0;
                    Object[] objArr104 = objArr5 == true ? 1 : 0;
                    Object[] objArr105 = objArr4 == true ? 1 : 0;
                    Object[] objArr106 = objArr3 == true ? 1 : 0;
                    Object[] objArr107 = objArr2 == true ? 1 : 0;
                    Object[] objArr108 = objArr == true ? 1 : 0;
                    effect = new Effect(str, objArr55, objArr56, objArr57, objArr58, objArr59, objArr60, objArr61, objArr62, objArr63, 0, objArr64, objArr65, objArr66, objArr67, objArr68, objArr69, objArr70, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr71, objArr72, objArr73, objArr74, objArr75, objArr76, objArr77, objArr78, objArr79, objArr80, 0 == true ? 1 : 0, objArr81, 0 == true ? 1 : 0, objArr82, objArr83, j, objArr84, objArr85, j, objArr86, objArr87, objArr88, objArr89, objArr90, 0 == true ? 1 : 0, objArr91, objArr92, objArr93, objArr94, objArr95, objArr96, objArr97, objArr98, objArr99, j, objArr100, objArr101, objArr102, j, j, objArr103, objArr104, objArr105, objArr106, objArr107, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 15, objArr108);
                    Effect effectPutIfAbsent = concurrentHashMap.putIfAbsent(providerEffect, effect);
                    if (effectPutIfAbsent != null) {
                        effect = effectPutIfAbsent;
                    }
                }
                Nu(effect, null);
                return;
            }
            return;
        }
        Nu(C1638610sk7.LIZ(providerEffect), null);
    }

    private final void o2(Effect effect, String str) {
        ((C560530Lyd) hr()).LJIIJ(new Pair(effect, str));
    }

    @Override // X.InterfaceC1465230oET
    public void L0(Effect effect, String str) {
        ((C560530Lyd) i8()).LJIIJ(new Pair(effect, str));
    }

    @Override // X.InterfaceC1465230oET
    public void Nu(Effect effect, String str) {
        ((C560530Lyd) Tg()).LJIIJ(new Pair(effect, str));
    }

    public AbstractC1465310oEb(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
    }

    @Override // X.InterfaceC1465230oET
    public void Ed(boolean z, String str, long j) {
        C0CHQ.LIZ().LJIIL().updateCurrentScene("sticker_panel_show", z);
        ((C540930LJj) getEnterMethod()).LJII(str);
        ((C560530Lyd) V7()).LJIIJ(Boolean.valueOf(z));
        ((C540930LJj) Cu()).LJII(Long.valueOf(j));
    }
}
