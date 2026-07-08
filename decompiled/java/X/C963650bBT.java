package X;

import Y.AfS151S0200000_15;
import com.bytedance.android.live.liveinteract.match.model.BattleQuickStartRequest;
import com.bytedance.android.live.liveinteract.match.model.BattleQuickStartResponse;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bBT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963650bBT implements InterfaceC963670bBV {
    public final C11NJ LIZ;
    public final List<InterfaceC963680bBW> LIZIZ = new ArrayList();

    @Override // X.InterfaceC963670bBV
    public final void LIZIZ() {
        ((ArrayList) this.LIZIZ).clear();
    }

    public C963650bBT(C11NJ c11nj) {
        this.LIZ = c11nj;
    }

    public final void LIZJ(InterfaceC963680bBW interfaceC963680bBW) {
        ((ArrayList) this.LIZIZ).add(interfaceC963680bBW);
    }

    @Override // X.InterfaceC963670bBV
    public final void LIZ(BattleQuickStartRequest battleQuickStartRequest, Function1<? super BattleQuickStartResponse.ResponseData, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC963680bBW) it2.next()).LIZIZ(battleQuickStartRequest);
        }
        long j = battleQuickStartRequest.channelId;
        long j2 = battleQuickStartRequest.battleId;
        long j3 = battleQuickStartRequest.duration;
        long j4 = battleQuickStartRequest.actualDuration;
        int i = battleQuickStartRequest.quickStartScene;
        C930480aJy c930480aJy = C930480aJy.LIZ;
        C480460Ism.LIZ().getClass();
        InterfaceC420801kM interfaceC420801kMLJJLL = ((MultiMatchApi) C480460Ism.LIZLLL(MultiMatchApi.class)).quickStart(j, j2, j3, j4, i).LJIILIIL(new C0UO0()).LJJLL(new AfS151S0200000_15(this, function1, 60), new AfS151S0200000_15(this, function12, 61));
        C11NJ c11nj = this.LIZ;
        c930480aJy.getClass();
        c11nj.LIZ(interfaceC420801kMLJJLL);
    }
}
