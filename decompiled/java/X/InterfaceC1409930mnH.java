package X;

import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0mnH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1409930mnH extends C05YF {
    void Bt(InterfaceC1406950miT interfaceC1406950miT);

    C385670FAf<Long> Cu();

    void Ed(boolean z, String str, long j);

    LiveEvent<Unit> Fs();

    boolean I5(Effect effect);

    void Ic(ProviderEffect providerEffect);

    void Jr(Effect effect);

    void L0(Effect effect, String str);

    LiveEvent<Unit> L9();

    void N8();

    void Nu(Effect effect, String str);

    LiveEvent<Pair<Effect, String>> Tg();

    InterfaceC1640930snr V6();

    LiveEvent<Boolean> V7();

    void Xg();

    C385670FAf<String> getEnterMethod();

    LiveEvent<Pair<Effect, String>> hr();

    LiveEvent<Pair<Effect, String>> i8();

    void o3();

    LiveEvent<Unit> p9();

    LiveEvent<Unit> sj();

    void vu();

    void yw(ProviderEffect providerEffect);
}
