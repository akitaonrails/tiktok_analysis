package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.relation.usercard.ability.UserCardListAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS103S0201000_19;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ivr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.ability.UserCardListAbility$onFollowUser$1", f = "UserCardListAbility.kt", l = {221}, m = "invokeSuspend")
public final class C1261490ivr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UserCardListAbility LLILLJJLI;
    public final /* synthetic */ C1261860iwS LLILLL;
    public final /* synthetic */ ConcurrentHashMap<C1261860iwS, AbstractC1623806Xk<Unit>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1261490ivr(UserCardListAbility userCardListAbility, C1261860iwS c1261860iwS, ConcurrentHashMap<C1261860iwS, AbstractC1623806Xk<Unit>> concurrentHashMap, InterfaceC1364105Vn<? super C1261490ivr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = userCardListAbility;
        this.LLILLL = c1261860iwS;
        this.LLILZ = concurrentHashMap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1261490ivr(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1261860iwS c1261860iwS;
        C1C7U.LIZ("UserCardListAbility@7b48.onFollowUser$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    C1263080iyQ c1263080iyQLIZIZ = this.LLILLJJLI.LIZIZ();
                    C1261860iwS c1261860iwS2 = this.LLILLL;
                    boolean z = this.LLILLJJLI.LLILLL;
                    this.LL = 1;
                    obj = c1263080iyQLIZIZ.LJIIIIZZ(c1261860iwS2, z, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("UserCardListAbility@7b48.onFollowUser$1");
                        return objLJFF;
                    }
                }
                c098200Yq = (List) obj;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C1261860iwS c1261860iwS3 = this.LLILLL;
            UserCardListAbility userCardListAbility = this.LLILLJJLI;
            ConcurrentHashMap<C1261860iwS, AbstractC1623806Xk<Unit>> concurrentHashMap = this.LLILZ;
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                List list = (List) c098200Yq;
                C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
                StringBuilder sb = new StringBuilder();
                sb.append("result get from recUser ");
                sb.append(c1261860iwS3.getNickname());
                sb.append(", count ");
                sb.append(list.size());
                sb.append(", ");
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C1261860iwS) it2.next()).getNickname());
                }
                sb.append(arrayList);
                String string = sb.toString();
                c1264320j0Q.getClass();
                C1264320j0Q.LIZLLL("ListAbility", string);
                if (true ^ list.isEmpty()) {
                    Iterator<InterfaceC1262230ix3> it3 = userCardListAbility.LIZIZ().iterator();
                    int i2 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            InterfaceC1262230ix3 next = it3.next();
                            String uid = null;
                            if (next instanceof C1261860iwS) {
                                c1261860iwS = (C1261860iwS) next;
                            } else {
                                c1261860iwS = null;
                            }
                            if (c1261860iwS != null) {
                                uid = c1261860iwS.getUid();
                            }
                            if (Intrinsics.LJFF(uid, c1261860iwS3.getUid())) {
                                break;
                            }
                            i2++;
                        } else {
                            i2 = -1;
                            break;
                        }
                    }
                    if (i2 < 0) {
                        C1264320j0Q c1264320j0Q2 = C1264320j0Q.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("index error for ");
                        sbLIZ.append(c1261860iwS3.getNickname());
                        sbLIZ.append(", count ");
                        sbLIZ.append(list.size());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c1264320j0Q2.getClass();
                        C1264320j0Q.LIZIZ("ListAbility", strLIZIZ, null);
                        Unit unit = Unit.LIZ;
                        this.LLILLJJLI.LLIZ.set(false);
                        C1C7U.LIZIZ("UserCardListAbility@7b48.onFollowUser$1");
                        return unit;
                    }
                    C1264320j0Q c1264320j0Q3 = C1264320j0Q.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("RecMoreByTriad - at index ");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(" for ");
                    sbLIZ2.append(c1261860iwS3.getNickname());
                    sbLIZ2.append(", count ");
                    sbLIZ2.append(list.size());
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c1264320j0Q3.getClass();
                    C1264320j0Q.LIZLLL("ListAbility", strLIZIZ2);
                    userCardListAbility.v52(new AwS103S0201000_19(list, (List<C1261860iwS>) c1261860iwS3, (C1261860iwS) i2, 0));
                }
                concurrentHashMap.put(c1261860iwS3, new C1623606Xi(Unit.LIZ));
            }
            ConcurrentHashMap<C1261860iwS, AbstractC1623806Xk<Unit>> concurrentHashMap2 = this.LLILZ;
            C1261860iwS c1261860iwS4 = this.LLILLL;
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                concurrentHashMap2.put(c1261860iwS4, new C491001vg(thM5exceptionOrNullimpl));
                C1264320j0Q c1264320j0Q4 = C1264320j0Q.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("insert the ");
                sbLIZ3.append(c1261860iwS4.getNickname());
                sbLIZ3.append(" related user error");
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                c1264320j0Q4.getClass();
                C1264320j0Q.LIZIZ("ListAbility", strLIZIZ3, thM5exceptionOrNullimpl);
            }
            this.LLILLJJLI.LLIZ.set(false);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("UserCardListAbility@7b48.onFollowUser$1");
            return unit2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LLILLJJLI.LLIZ.set(false);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
