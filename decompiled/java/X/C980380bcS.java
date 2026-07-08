package X;

import Y.AfS184S0100000_15;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.battle.OperateSwitchResponse;

/* JADX INFO: renamed from: X.0bcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C980380bcS {
    public final C11NJ LIZ = new C11NJ();
    public C11JF LIZIZ;

    public final void LIZ(int i, int i2, Function1<? super C470590Icr<OperateSwitchResponse.ResponseData>, Unit> function1, Function1<? super Throwable, Unit> function12) {
        C480460Ism.LIZ().getClass();
        InterfaceC420801kM interfaceC420801kMLJJLL = ((LinkBattleApi) C480460Ism.LIZLLL(LinkBattleApi.class)).featureSwitch(C915980Zwa.LJII().getChannelId(), i, i2).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(function1, (Function1<? super C470590Icr<Unit>, Unit>) 143), new AfS184S0100000_15(function12, (Function1<? super C470590Icr<Unit>, Unit>) 143));
        this.LIZIZ = (C11JF) interfaceC420801kMLJJLL;
        this.LIZ.LIZ(interfaceC420801kMLJJLL);
    }
}
