package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.impl.api.GetStreakApi;
import com.ss.android.ugc.aweme.im.streak.impl.datasource.StreakServerDataSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS53S1000000_2;
import njp.a;

/* JADX INFO: renamed from: X.06Fs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.datasource.StreakServerDataSource$fetchStreakDataInner$1", f = "StreakServerDataSource.kt", l = {398}, m = "invokeSuspend")
public final class C1577806Fs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StreakServerDataSource LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1577806Fs(StreakServerDataSource streakServerDataSource, InterfaceC1364105Vn<? super C1577806Fs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = streakServerDataSource;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1577806Fs(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        int iIntValue;
        String str;
        Long l;
        Integer num;
        String str2;
        Long l2;
        Integer num2;
        Integer num3;
        Long lLJFF;
        Integer numLJ;
        Integer num4;
        C1C7U.LIZ("StreakServerDataSource@881c.fetchStreakDataInner$1");
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
            long j = C06FS.LIZ().pullStreakDataDelay;
            if (j > 0) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("StreakServerDataSource@881c.fetchStreakDataInner$1");
                    return objLJFF;
                }
            }
        }
        try {
            GetStreakApi.LIZ.getClass();
            C0I0B c0i0b = C0I0B.LJFF;
            C1C3F c1c3fLIZLLL = ((GetStreakApi) ((C1566106Bf) c0i0b.LIZLLL()).LIZJ(GetStreakApi.class, "/tiktok/v1/im/streaks/get")).getStreaks().LIZLLL();
            Keva keva = (Keva) C2252271DDl.LIZIZ.getValue().LIZ.getValue();
            String curUserId = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
            String str3 = "";
            if (curUserId == null) {
                curUserId = "";
            }
            keva.storeLong(curUserId, C1567806Bw.LJI());
            if (c1c3fLIZLLL.streaks != null && (!r0.isEmpty())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                List<C2272721DxW> list = c1c3fLIZLLL.streaks;
                StreakServerDataSource streakServerDataSource = this.LLILLJJLI;
                ArrayList arrayList2 = new ArrayList();
                for (C2272721DxW c2272721DxW : list) {
                    try {
                        C1577606Fq c1577606Fq = C1577606Fq.LIZIZ;
                        int iIntValue2 = c2272721DxW.conversation_type.intValue();
                        String str4 = c2272721DxW.conversation_id;
                        long jLongValue = c1c3fLIZLLL.timestamp_millis.longValue();
                        c1577606Fq.getClass();
                        C1577606Fq.LJFF(c2272721DxW, iIntValue2, str4, jLongValue);
                        List<C1CJ8> list2 = c2272721DxW.users;
                        if (list2 != null) {
                            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                            for (C1CJ8 c1cj8 : list2) {
                                arrayList.add(new C1CJB(c1cj8.uid, c1cj8.timestamp));
                            }
                        } else {
                            arrayList = null;
                        }
                        Integer num5 = c2272721DxW.conversation_type;
                        if (num5 != null) {
                            iIntValue = num5.intValue();
                        } else {
                            C1590906Kt.LIZJ("Streak: conv type is null");
                            iIntValue = AbstractC1711506n3.LIZ;
                        }
                        str = c2272721DxW.conversation_id;
                        if (str == null) {
                            C1590906Kt.LIZJ("Streak: conv type is null");
                            str = "";
                        }
                        l = c2272721DxW.streak_start;
                        num = c2272721DxW.streak_counter;
                        str2 = c2272721DxW.streak_timezone;
                        l2 = c2272721DxW.restorable_before;
                        num2 = c2272721DxW.remain_restore_cnt;
                        num3 = c2272721DxW.streak_level;
                        lLJFF = C2286608xc.LJFF(0L);
                        numLJ = C2286608xc.LJ(-1);
                        num4 = c2272721DxW.total_restore_cnt_this_window;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C1590906Kt.LIZIZ("StreakDataSource: get streak data fail");
                            this.LLILLJJLI.LJIIIIZZ();
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("StreakServerDataSource@881c.fetchStreakDataInner$1");
                            return unit;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            this.LLILLJJLI.LJIIIIZZ();
                            throw th2;
                        }
                    }
                    try {
                        Long l3 = c2272721DxW.active_before;
                        Long l4 = c2272721DxW.end_at;
                        List list3 = c2272721DxW.day_begin_list;
                        if (list3 == null) {
                            list3 = C13BV.INSTANCE;
                        }
                        C2272741DxY c2272741DxY = new C2272741DxY(arrayList, l, num, str2, l2, num2, num3, lLJFF, numLJ, num4, l3, l4, list3, c2272721DxW.active_start, c2272721DxW.remind_at, C2286608xc.LJ(iIntValue), str, c2272721DxW.restore_refresh_window_start_ts, c2272721DxW.restore_refresh_day_cnt, C2286608xc.LJ(0), C2286608xc.LJFF(0L), C2286608xc.LJFF(0L), "");
                        Long l5 = c1c3fLIZLLL.timestamp_millis;
                        streakServerDataSource.getClass();
                        arrayList2.add(C1577406Fo.LIZLLL(iIntValue, str, c2272741DxY, null, null, l5, null, null, null));
                    } catch (Throwable th3) {
                        th = th3;
                        TryCatchGuardChecker.doCheck(th);
                        C1590906Kt.LIZIZ("StreakDataSource: get streak data fail");
                        this.LLILLJJLI.LJIIIIZZ();
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("StreakServerDataSource@881c.fetchStreakDataInner$1");
                        return unit2;
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (((StreakData) obj2).convType == AbstractC1711506n3.LIZIZ) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (((StreakData) obj3).convType != AbstractC1711506n3.LIZIZ) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        arrayList4.add(obj3);
                    }
                }
                try {
                    StreakServerDataSource streakServerDataSource2 = this.LLILLJJLI;
                    streakServerDataSource2.getClass();
                    String curUserId2 = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                    if (curUserId2 != null) {
                        str3 = curUserId2;
                    }
                    C1577406Fo.LIZJ(arrayList3, new AwS53S1000000_2(streakServerDataSource2, str3, 35));
                    StreakServerDataSource streakServerDataSource3 = this.LLILLJJLI;
                    streakServerDataSource3.getClass();
                    C1577406Fo.LIZJ(arrayList4, AFwS229S0000000_2.get$arr$(889));
                    C1577406Fo.LIZJ(arrayList4, new C06G5(streakServerDataSource3));
                    this.LLILLJJLI.LIZ.LJI(arrayList3);
                    this.LLILLJJLI.LIZ.LJI(arrayList4);
                } catch (Throwable th4) {
                    th = th4;
                    TryCatchGuardChecker.doCheck(th);
                    C1590906Kt.LIZIZ("StreakDataSource: get streak data fail");
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
        this.LLILLJJLI.LJIIIIZZ();
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("StreakServerDataSource@881c.fetchStreakDataInner$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
