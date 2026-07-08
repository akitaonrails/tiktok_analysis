package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.impl.api.StreakPushApi;
import com.ss.android.ugc.aweme.im.streak.impl.api.StreakPushContentResponse;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06Bu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.overview.StreakOverview$notifyPush$1", f = "StreakOverview.kt", l = {85}, m = "invokeSuspend")
public final class C1567606Bu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1567606Bu(InterfaceC1364105Vn<? super C1567606Bu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1567606Bu(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        StreakData next;
        EnumC1579606Gk enumC1579606GkLJIIIIZZ;
        boolean z;
        C1C7U.LIZ("StreakOverview@9873.notifyPush$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (!C1205304nb.LIZIZ) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StreakOverview@9873.notifyPush$1");
                return unit;
            }
            C1590806Ks.LIZ("/tiktok/v1/im/push/content/fetch start request ");
            C06F5.LIZ.getClass();
            List<StreakData> listLIZ = C06F4.LIZIZ.LIZ(C1697810uHb.LJIIJJI(C06G4.USER, C06G4.CONVERSATION));
            if (listLIZ != null) {
                Iterator<StreakData> it2 = listLIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        StreakData streakData = next;
                        List listSingletonList = Collections.singletonList(EnumC1579606Gk.SECONDARY_ACTIVE);
                        if (streakData != null) {
                            enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakData, false);
                        } else {
                            enumC1579606GkLJIIIIZZ = null;
                        }
                        if (!C13LP.LJJJJ(enumC1579606GkLJIIIIZZ, listSingletonList) && !C1567806Bw.LIZLLL(streakData)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (next != null) {
                    StreakPushApi streakPushApi = StreakPushApi.LIZIZ;
                    this.LL = 1;
                    obj = streakPushApi.pushStreakColdStart(2, 1, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("StreakOverview@9873.notifyPush$1");
                        return objLJFF;
                    }
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("StreakOverview@9873.notifyPush$1");
            return unit2;
        }
        boolean z2 = C1590806Ks.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/tiktok/v1/im/push/content/fetch request success ");
        sbLIZ.append((StreakPushContentResponse) obj);
        C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        if (obj2 == null) {
            C1590806Ks.LIZIZ("/tiktok/v1/im/push/content/fetch request fail");
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("StreakOverview@9873.notifyPush$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1567606Bu(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
