package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel;
import com.ss.android.ugc.aweme.vibefeed.model.VibeFeedAcceptResponse;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0r5j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel$acceptInvite$2", f = "VibeFeedEntranceViewModel.kt", l = {345}, m = "invokeSuspend")
public final class C1575130r5j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ VibeFeedEntranceViewModel LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ EnumC912680ZrG LLIZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1575130r5j(String str, String str2, VibeFeedEntranceViewModel vibeFeedEntranceViewModel, String str3, EnumC912680ZrG enumC912680ZrG, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C1575130r5j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = vibeFeedEntranceViewModel;
        this.LLILZLL = str3;
        this.LLIZ = enumC912680ZrG;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1575130r5j c1575130r5j = new C1575130r5j(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1575130r5j.LLILLJJLI = obj;
        return c1575130r5j;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Long l;
        long jLongValue;
        Object objLJLLL = obj;
        C1C7U.LIZ("VibeFeedEntranceViewModel@aaa3.acceptInvite$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJLLL);
            } else {
                C155000ia.LIZIZ(objLJLLL);
                String str = this.LLILLL;
                if (str == null) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("VibeFeedEntranceViewModel@aaa3.acceptInvite$2");
                    return unit;
                }
                String str2 = this.LLILZ;
                if (str2 == null) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("VibeFeedEntranceViewModel@aaa3.acceptInvite$2");
                    return unit2;
                }
                VibeFeedEntranceViewModel vibeFeedEntranceViewModel = this.LLILZIL;
                String str3 = this.LLILZLL;
                EnumC912680ZrG enumC912680ZrG = this.LLIZ;
                InterfaceC629290OmF interfaceC629290OmF = (InterfaceC629290OmF) vibeFeedEntranceViewModel.LLILZIL.getValue().getOperator();
                this.LL = 1;
                objLJLLL = interfaceC629290OmF.LJLLL(str3, str2, str, enumC912680ZrG, this);
                if (objLJLLL == objLJFF) {
                    C1C7U.LIZIZ("VibeFeedEntranceViewModel@aaa3.acceptInvite$2");
                    return objLJFF;
                }
            }
            c098200Yq = (VibeFeedAcceptResponse) objLJLLL;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str4 = this.LLILLL;
        EnumC912680ZrG enumC912680ZrG2 = this.LLIZ;
        Function1<Boolean, Unit> function1 = this.LLIZLLLIL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            VibeFeedAcceptResponse vibeFeedAcceptResponse = (VibeFeedAcceptResponse) c098200Yq;
            if (C1575980r76.LIZJ(vibeFeedAcceptResponse)) {
                String str5 = null;
                if (vibeFeedAcceptResponse != null) {
                    l = vibeFeedAcceptResponse.feedCreateTime;
                } else {
                    l = null;
                }
                C1575210r5r c1575210r5r = C1575210r5r.LLILLJJLI;
                c1575210r5r.getClass();
                ConcurrentHashMap<String, EnumC1575230r5t> concurrentHashMap = C1575210r5r.LLILLL;
                EnumC1575230r5t enumC1575230r5t = EnumC1575230r5t.STARTED;
                concurrentHashMap.put(str4, enumC1575230r5t);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateFromAccept, vibeFeedState:");
                sbLIZ.append(concurrentHashMap);
                sbLIZ.append(" feedCreateTime: ");
                sbLIZ.append(l);
                C299700Bou.LIZIZ("VibeFeedStateController", C2188811AlT.LIZIZ(sbLIZ));
                c1575210r5r.LJFF(enumC1575230r5t, str4);
                String strLIZ = C1575440r6E.LIZ();
                if (strLIZ == null) {
                    strLIZ = "";
                }
                Keva kevaLIZLLL = C1575210r5r.LIZLLL(strLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("feed_create_timestamp_");
                sbLIZ2.append(str4);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                kevaLIZLLL.storeLong(strLIZIZ, jLongValue);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("accept invite success, feedCreateTime:");
                sbLIZ3.append(l);
                sbLIZ3.append(", feedId:");
                if (vibeFeedAcceptResponse != null) {
                    str5 = vibeFeedAcceptResponse.feedId;
                }
                sbLIZ3.append(str5);
                C2188811AlT.LIZIZ(sbLIZ3);
                C1575290r5z.LIZ.getClass();
                C1575290r5z.LIZJ(str4, "accept", enumC912680ZrG2);
                if (function1 != null) {
                    function1.invoke(true);
                }
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("VibeFeedEntranceViewModel@aaa3.acceptInvite$2");
                return unit3;
            }
            if (function1 != null) {
                function1.invoke(false);
            }
        }
        Function1<Boolean, Unit> function12 = this.LLIZLLLIL;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C299700Bou.LIZ("VibeFeedEntranceViewModel", "accept invite error");
            if (function12 != null) {
                function12.invoke(false);
            }
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("VibeFeedEntranceViewModel@aaa3.acceptInvite$2");
            return unit4;
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("VibeFeedEntranceViewModel@aaa3.acceptInvite$2");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
