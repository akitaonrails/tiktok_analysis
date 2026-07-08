package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06C5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.datasource.StreakPetDataSource$updateStreakPetWidgetVisibility$1", f = "StreakPetDataSource.kt", l = {}, m = "invokeSuspend")
public final class C06C5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1569106Cj LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06C5(C1569106Cj c1569106Cj, String str, boolean z, InterfaceC1364105Vn<? super C06C5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1569106Cj;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06C5(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLIZ;
        StreakPetData streakPetData;
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        C1C7U.LIZ("StreakPetDataSource@55af.updateStreakPetWidgetVisibility$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1569106Cj c1569106Cj = this.LL;
        Object obj2 = c1569106Cj.LIZIZ;
        String str = this.LLILLJJLI;
        boolean z4 = this.LLILLL;
        synchronized (obj2) {
            try {
                StreakPetData streakPetDataLIZLLL = C1569106Cj.LIZLLL(str);
                int iLIZIZ = C1567806Bw.LIZIZ(str);
                if (iLIZIZ == AbstractC1711506n3.LIZIZ) {
                    zLIZ = C296670Bk1.LIZ();
                } else if (iLIZIZ == AbstractC1711506n3.LIZ) {
                    zLIZ = C06D3.LIZ();
                } else {
                    zLIZ = false;
                }
                if (streakPetDataLIZLLL != null) {
                    if (C1571306Df.LJI(streakPetDataLIZLLL)) {
                        if (z4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        streakPetData = StreakPetData.LIZ(streakPetDataLIZLLL, false, null, z3, null, null, 516095);
                    } else {
                        if (z4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        streakPetData = StreakPetData.LIZ(streakPetDataLIZLLL, z2, null, false, null, null, 524031);
                    }
                } else if (zLIZ) {
                    streakPetData = new StreakPetData(str, 0, 0, 0L, 0, null, null, null, false, null, 0L, 0L, 0, false, null, null, null, null, null, 524286, null);
                } else {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StreakPetDataSource@55af.updateStreakPetWidgetVisibility$1");
                    return unit;
                }
                boolean z5 = C1590806Ks.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateStreakPetVisibility ");
                sbLIZ.append(str);
                sbLIZ.append(' ');
                if (z4) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ.append(z);
                sbLIZ.append(" old data ");
                sbLIZ.append(streakPetDataLIZLLL);
                sbLIZ.append(" new data ");
                sbLIZ.append(streakPetData);
                C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                c1569106Cj.LJII(streakPetData);
                c1569106Cj.LIZJ.getClass();
                C1572806Du.LL.de(streakPetData);
                if (streakPetDataLIZLLL == null) {
                    j = 0;
                } else {
                    j = streakPetDataLIZLLL.createTime;
                }
                C06C6.LIZJ(streakPetDataLIZLLL, streakPetData, j, true, C06CF.LJIIIZ, "");
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("StreakPetDataSource@55af.updateStreakPetWidgetVisibility$1");
                return unit2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
