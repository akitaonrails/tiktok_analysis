package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.INetwork;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10c8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.tiktok.kmp.active.manager.core.MobHelper$tryMobActiveEvent$1", f = "MobHelper.kt", l = {31}, m = "invokeSuspend")
public final class C19282210c8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19282410cA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19282210c8(C19282410cA c19282410cA, InterfaceC1364105Vn<? super C19282210c8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19282410cA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19282210c8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("MobHelper@c1c8.tryMobActiveEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("MobHelper@c1c8.tryMobActiveEvent$1");
                return objLJFF;
            }
        }
        C19282910cF c19282910cF = C19282910cF.LIZ;
        C19282410cA c19282410cA = this.LLILLJJLI;
        c19282910cF.getClass();
        if (c19282410cA.LIZ() != EnumC19282510cB.RECORD_LESS_30 && c19282410cA.LIZ() != EnumC19282510cB.NORMAL) {
            Pair[] pairArr = new Pair[3];
            int i2 = C19282610cC.LIZ[c19282410cA.LIZ().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        str = "";
                    } else {
                        str = "ultra_low_active";
                    }
                } else {
                    str = "low_active";
                }
            } else {
                str = "return_user";
            }
            int serverTime = 0;
            pairArr[0] = new Pair("type", str);
            pairArr[1] = new Pair("active_in_30", String.valueOf(c19282410cA.LIZLLL));
            long j = c19282410cA.LIZ;
            C1904800zfS.LIZ.getClass();
            INetwork iNetwork = (INetwork) PluggableExtentionKt.pluggableSpi$default(INetwork.class, false, false, false, 14, null);
            if (iNetwork != null) {
                serverTime = iNetwork.getServerTime();
            }
            pairArr[2] = new Pair("client_day_diff_server", String.valueOf(C0W4R.LIZ(j, ((long) serverTime) * 1000)));
            final HashMap mapLJI = C2097608Jq.LJI(pairArr);
            C19281810c4.LIZ.getClass();
            C20684815ws.LJIILLIIL("client_low_active_user_launch", mapLJI);
            C19282310c9.LIZ(new Function0() { // from class: X.00Fd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    HashMap map = mapLJI;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("client_low_active_user_launch, parsms: ");
                    sbLIZ.append(map);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MobHelper@c1c8.tryMobActiveEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
