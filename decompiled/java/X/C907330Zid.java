package X;

import com.ss.android.ugc.aweme.im.common.setting.MessageContentRefreshConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Zid, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.MessageSearchContentUpdateEngine$trySyncColdMessage$1", f = "MessageSearchContentUpdateEngine.kt", l = {140}, m = "invokeSuspend")
public final class C907330Zid extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C907790ZjN LL;
    public long LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C907310Zib LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C907330Zid(C907310Zib c907310Zib, InterfaceC1364105Vn<? super C907330Zid> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c907310Zib;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C907330Zid c907330Zid = new C907330Zid(this.LLILZLL, interfaceC1364105Vn);
        c907330Zid.LLILZIL = obj;
        return c907330Zid;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        long jCurrentTimeMillis;
        C907790ZjN c907790ZjN;
        long j;
        int i;
        C1C7U.LIZ("MessageSearchContentUpdateEngine@36aa.trySyncColdMessage$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZ;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.LLILLL;
                jCurrentTimeMillis = this.LLILLJJLI;
                c907790ZjN = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILZIL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILZIL;
            C907340Zie.LIZ(this.LLILZLL.LIZIZ, "cold_message_create_time_cursor");
            jCurrentTimeMillis = System.currentTimeMillis();
            c907790ZjN = new C907790ZjN(0);
            C907310Zib c907310Zib = this.LLILZLL;
            long j2 = c907310Zib.LIZIZ.getLong("last_refresh_version", -1L);
            C01GW c01gw = C907350Zif.LIZIZ;
            long j3 = ((MessageContentRefreshConfig) c01gw.getValue()).version;
            long j4 = c907310Zib.LIZIZ.getLong("last_refresh_time", -1L);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            boolean z = c907310Zib.LIZIZ.getBoolean("history_search_updated", false);
            if (!z) {
                c907310Zib.LIZIZ.storeBoolean("history_search_updated", true);
            }
            if (!(!z) && j2 >= j3 && jCurrentTimeMillis2 - j4 <= ((long) ((MessageContentRefreshConfig) c01gw.getValue()).interval) * 86400000) {
                j = -1;
            } else {
                c907310Zib.LIZ.LIZLLL();
                c907310Zib.LIZIZ.storeLong("last_refresh_version", j3);
                c907310Zib.LIZIZ.storeLong("last_refresh_time", jCurrentTimeMillis2);
                j = -1;
                c907310Zib.LIZIZ.storeLong("cold_message_create_time_cursor", -1L);
            }
            C907310Zib c907310Zib2 = this.LLILZLL;
            synchronized (c907310Zib2) {
                if (c907310Zib2.LIZIZ.getLong("cold_message_create_time_cursor", j) == j) {
                    InterfaceC874680YTa interfaceC874680YTa = c907310Zib2.LIZJ;
                    C907280ZiY.LIZ.getClass();
                    long jLJJIII = interfaceC874680YTa.LJJIII(C907280ZiY.LIZLLL);
                    C1231704rr c1231704rr = c907310Zib2.LIZLLL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("tryInitColdMsgCursor coldMsgCursor ");
                    sbLIZ.append(jLJJIII);
                    C2188811AlT.LIZIZ(sbLIZ);
                    c1231704rr.LIZIZ();
                    c907310Zib2.LIZIZ.storeLong("cold_message_create_time_cursor", jLJJIII);
                }
            }
            i = 0;
        }
        while (C2296808zG.LJI(interfaceC497601wk)) {
            long j5 = this.LLILZLL.LIZIZ.getLong("cold_message_create_time_cursor", -1L);
            InterfaceC874680YTa interfaceC874680YTa2 = this.LLILZLL.LIZJ;
            C907280ZiY.LIZ.getClass();
            List listLJIL = interfaceC874680YTa2.LJIL(j5, C907280ZiY.LIZLLL);
            if (listLJIL == null) {
                listLJIL = C13BV.INSTANCE;
            }
            if (listLJIL.isEmpty()) {
                break;
            }
            long createdAt = ((C869590Y9l) C13LP.LJJLIIIJJI(listLJIL)).getCreatedAt();
            if (createdAt == j5) {
                break;
            }
            C1231704rr c1231704rr2 = this.LLILZLL.LIZLLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sync message size ");
            sbLIZ2.append(listLJIL.size());
            sbLIZ2.append(" list ");
            sbLIZ2.append(C13LP.LJJLIIIJ(listLJIL, null, null, null, 0, null, AFwS248S0000000_14.get$arr$(474), 31));
            C2188811AlT.LIZIZ(sbLIZ2);
            c1231704rr2.LIZIZ();
            C907310Zib c907310Zib3 = this.LLILZLL;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listLJIL) {
                C907280ZiY.LIZ.getClass();
                if (C907280ZiY.LIZ((C869590Y9l) obj2)) {
                    arrayList.add(obj2);
                }
            }
            List<C907840ZjS> listLIZIZ = c907310Zib3.LIZIZ(arrayList);
            c907790ZjN.LIZJ += ((ArrayList) listLIZIZ).size();
            c907790ZjN.LIZIZ += listLJIL.size();
            this.LLILZLL.LIZ.LJFF(listLIZIZ, true);
            C1231704rr c1231704rr3 = this.LLILZLL.LIZLLL;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("newColdMsgCursor ");
            sbLIZ3.append(createdAt);
            C2188811AlT.LIZIZ(sbLIZ3);
            c1231704rr3.LIZIZ();
            this.LLILZLL.LIZIZ.storeLong("cold_message_create_time_cursor", createdAt);
            this.LLILZIL = interfaceC497601wk;
            this.LL = c907790ZjN;
            this.LLILLJJLI = jCurrentTimeMillis;
            i = 1;
            this.LLILLL = 1;
            this.LLILZ = 1;
            if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                C1C7U.LIZIZ("MessageSearchContentUpdateEngine@36aa.trySyncColdMessage$1");
                return objLJFF;
            }
        }
        c907790ZjN.LIZLLL = System.currentTimeMillis() - jCurrentTimeMillis;
        c907790ZjN.LIZ = "messages";
        if (i != 0) {
            this.LLILZLL.LJ.invoke(c907790ZjN);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageSearchContentUpdateEngine@36aa.trySyncColdMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
