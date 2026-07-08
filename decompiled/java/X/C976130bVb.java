package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0bVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.matchv2.core.fallback.MatchFallbackManager$startPolling$1", f = "MatchFallbackManager.kt", l = {51}, m = "invokeSuspend")
public final class C976130bVb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C976400bW2 LLILZ;
    public final /* synthetic */ C118300cf LLILZIL;
    public final /* synthetic */ Function2<BattleInfoResponse, Long, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C976130bVb(long j, C976400bW2 c976400bW2, C118300cf c118300cf, Function2<? super BattleInfoResponse, ? super Long, Unit> function2, InterfaceC1364105Vn<? super C976130bVb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = c976400bW2;
        this.LLILZIL = c118300cf;
        this.LLILZLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C976130bVb c976130bVb = new C976130bVb(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c976130bVb.LLILLJJLI = obj;
        return c976130bVb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        DataChannel dataChannel;
        long id;
        long j;
        long id2;
        long j2;
        C975960bVK c975960bVKM3;
        User owner;
        C975960bVK c975960bVKM32;
        long j3;
        C1C7U.LIZ("MatchFallbackManager@1bb5.startPolling$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
        }
        do {
            if (C2296808zG.LJI(interfaceC497601wk)) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILLL;
                C976400bW2 c976400bW2 = this.LLILZ;
                if (jElapsedRealtime > c976400bW2.LJFF) {
                    String str = c976400bW2.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("polling attempt=");
                    sbLIZ.append(this.LLILZIL.element);
                    sbLIZ.append(", timeout, stop polling");
                    C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                    this.LLILZ.LIZ();
                } else {
                    C118300cf c118300cf = this.LLILZIL;
                    int i2 = c118300cf.element + 1;
                    c118300cf.element = i2;
                    Function2<BattleInfoResponse, Long, Unit> function2 = this.LLILZLL;
                    InterfaceC975520bUc interfaceC975520bUc = c976400bW2.LIZIZ;
                    if (interfaceC975520bUc != null && interfaceC975520bUc.Y2().compareTo(EnumC964170bCJ.MATCH_START) >= 0) {
                        String str2 = c976400bW2.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("status changed to ");
                        sbLIZ2.append(c976400bW2.LIZIZ.Y2());
                        sbLIZ2.append(", stop polling");
                        C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                        c976400bW2.LIZ();
                    } else {
                        InterfaceC975520bUc interfaceC975520bUc2 = c976400bW2.LIZIZ;
                        DataChannel dataChannel2 = null;
                        if (interfaceC975520bUc2 != null) {
                            dataChannel = interfaceC975520bUc2.getDataChannel();
                        } else {
                            dataChannel = null;
                        }
                        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel);
                        if (roomLJJLIIIIJ != null) {
                            id = roomLJJLIIIIJ.getId();
                        } else {
                            id = 0;
                        }
                        InterfaceC975520bUc interfaceC975520bUc3 = c976400bW2.LIZIZ;
                        if (interfaceC975520bUc3 != null && (c975960bVKM32 = interfaceC975520bUc3.m3()) != null) {
                            j = c975960bVKM32.LJJJJLL;
                        } else {
                            j = 0;
                        }
                        InterfaceC975520bUc interfaceC975520bUc4 = c976400bW2.LIZIZ;
                        if (interfaceC975520bUc4 != null) {
                            dataChannel2 = interfaceC975520bUc4.getDataChannel();
                        }
                        Room roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(dataChannel2);
                        if (roomLJJLIIIIJ2 != null && (owner = roomLJJLIIIIJ2.getOwner()) != null) {
                            id2 = owner.getId();
                        } else {
                            id2 = 0;
                        }
                        InterfaceC975520bUc interfaceC975520bUc5 = c976400bW2.LIZIZ;
                        if (interfaceC975520bUc5 != null && (c975960bVKM3 = interfaceC975520bUc5.m3()) != null) {
                            j2 = c975960bVKM3.LJ;
                        } else {
                            j2 = 0;
                        }
                        int type = EnumC970440bMQ.BATTLE_INFO_SCENE_OPEN_EXPIRE.getType();
                        if (j2 == 0) {
                            C20441214yg.LJ(c976400bW2.LIZ, "battle id is 0, direct return");
                        } else {
                            C480460Ism.LIZ().getClass();
                            ((LinkBattleApi) C480460Ism.LIZLLL(LinkBattleApi.class)).getInfo(id, id2, j2, j, type).LJIILIIL(new C0UO0()).LJJLL(new C515601ze(j2, c976400bW2, function2, 0), new C516101zj(i2, c976400bW2, 0));
                        }
                    }
                    j3 = this.LLILZ.LJ;
                    this.LLILLJJLI = interfaceC497601wk;
                    this.LL = 1;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MatchFallbackManager@1bb5.startPolling$1");
            return unit;
        } while (AnonymousClass0958.LIZIZ(j3, this) != objLJFF);
        C1C7U.LIZIZ("MatchFallbackManager@1bb5.startPolling$1");
        return objLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
