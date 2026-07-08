package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YhD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.util.MessageRequestKvUpdater$initPriorityScore$2$onSuccess$1", f = "MessageRequestKvUpdater.kt", l = {244}, m = "invokeSuspend")
public final class C880970YhD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<Map<String, Object>> LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ C878120Ycc LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C880970YhD(List<? extends Map<String, ? extends Object>> list, long j, C013C c013c, Function0<Unit> function0, long j2, C878120Ycc c878120Ycc, InterfaceC1364105Vn<? super C880970YhD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = j;
        this.LLILZ = c013c;
        this.LLILZIL = function0;
        this.LLILZLL = j2;
        this.LLIZ = c878120Ycc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C880970YhD(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.0Ycb] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJ;
        C1C7U.LIZ("MessageRequestKvUpdater@d42f.initPriorityScore$2$onSuccess$1");
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
            C881270Yhh c881270Yhh = C881270Yhh.LIZ;
            final List<Map<String, Object>> list = this.LLILLJJLI;
            final long j = this.LLILLL;
            final C013C c013c = this.LLILZ;
            final Function0<Unit> function0 = this.LLILZIL;
            final long j2 = this.LLILZLL;
            final C878120Ycc c878120Ycc = this.LLIZ;
            ?? r7 = new InterfaceC878160Ycg() { // from class: X.0Ycb
                @Override // X.InterfaceC878160Ycg
                public final void onFailed() {
                    if (c013c.element) {
                        return;
                    }
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    c013c.element = true;
                }

                @Override // X.InterfaceC878160Ycg
                public final void onSuccess(List<? extends List<Double>> list2) {
                    boolean z;
                    Object objValueOf;
                    Object objValueOf2;
                    Object objValueOf3;
                    long jCurrentTimeMillis = System.currentTimeMillis() - j;
                    C878120Ycc c878120Ycc2 = c878120Ycc;
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    C880960YhC c880960YhC = C880960YhC.LIZ;
                    List<C0Y8T> list3 = c878120Ycc2.LIZJ;
                    c880960YhC.getClass();
                    List listLLIILII = C13LP.LLIILII(list3, list2);
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLLIILII, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    boolean z2 = false;
                    for (Pair pair : (ArrayList) listLLIILII) {
                        C0Y8T c0y8t = (C0Y8T) pair.getFirst();
                        List list4 = (List) pair.getSecond();
                        if (1 < list4.size()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            objValueOf = ListProtector.get(list4, 1);
                        } else {
                            objValueOf = Double.valueOf(0.0d);
                        }
                        double dDoubleValue = ((Number) objValueOf).doubleValue();
                        if (2 < list4.size()) {
                            objValueOf2 = ListProtector.get(list4, 2);
                        } else {
                            objValueOf2 = Double.valueOf(0.0d);
                        }
                        double dDoubleValue2 = ((Number) objValueOf2).doubleValue();
                        C13DA c13da = new C13DA();
                        if (!C612090Nzb.LIZ()) {
                            if (list4.size() > 0) {
                                objValueOf3 = ListProtector.get(list4, 0);
                            } else {
                                objValueOf3 = Double.valueOf(0.0d);
                            }
                            c13da.put(EnumC877690Ybv.PRIORITY_SCORE.getKey(), String.valueOf(((Number) objValueOf3).doubleValue()));
                        } else if (dDoubleValue2 >= C877780Yc4.LIZ().collaborationInvitesThreshold) {
                            c13da.put(EnumC877690Ybv.ACCEPT_RATE.getKey(), String.valueOf(((long) 20001) * System.currentTimeMillis()));
                            c13da.put(EnumC877690Ybv.MOCK_ACCEPT_RATE_BY_LABEL.getKey(), "mock_by_collaboration_invites");
                        } else if (dDoubleValue < C877780Yc4.LIZ().potentialThreshold) {
                            c13da.put(EnumC877690Ybv.POTENTIAL_PAID_OFFERS.getKey(), String.valueOf(dDoubleValue));
                            c13da.put(EnumC877690Ybv.COLLABORATION_INVITES.getKey(), String.valueOf(dDoubleValue2));
                            c13da.put(EnumC877690Ybv.PENDING_CLIENT_AI_INIT.getKey(), "");
                            Pair pair2 = new Pair(c0y8t.getConversationId(), c13da.build());
                            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
                        } else {
                            c13da.put(EnumC877690Ybv.ACCEPT_RATE.getKey(), String.valueOf(((long) 10001) * System.currentTimeMillis()));
                            c13da.put(EnumC877690Ybv.MOCK_ACCEPT_RATE_BY_LABEL.getKey(), "mock_by_potential_paid_offers");
                        }
                        z2 = true;
                        c13da.put(EnumC877690Ybv.POTENTIAL_PAID_OFFERS.getKey(), String.valueOf(dDoubleValue));
                        c13da.put(EnumC877690Ybv.COLLABORATION_INVITES.getKey(), String.valueOf(dDoubleValue2));
                        c13da.put(EnumC877690Ybv.PENDING_CLIENT_AI_INIT.getKey(), "");
                        Pair pair22 = new Pair(c0y8t.getConversationId(), c13da.build());
                        linkedHashMap.put(pair22.getFirst(), pair22.getSecond());
                    }
                    if (C0BBK.LIZ()) {
                        try {
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            String message = th.getMessage();
                            if (message == null) {
                                message = "Unknown error";
                            }
                            C865670Xxd.LIZIZ(new C0YPY(-1, message, th));
                        }
                    } else {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            C0YNP.LIZ((String) entry.getKey(), (Map) entry.getValue());
                        }
                    }
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                    if (z2 || !c013c.element) {
                        Function0<Unit> function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        c013c.element = true;
                    }
                    C880830Ygz.LIZJ(new C880840Yh0(list.size(), j2, jCurrentTimeMillis, jCurrentTimeMillis3, "priority_score"));
                    C880830Ygz.LIZIZ("client", list2);
                }
            };
            this.LL = 1;
            c881270Yhh.getClass();
            AnonymousClass1455.LIZ.LIZLLL("PitayaInitTask", null, null);
            EnumC881060YhM enumC881060YhM = EnumC881060YhM.INFERENCE;
            C880830Ygz.LIZLLL(enumC881060YhM);
            C0Z0Y c0z0yLIZ = c881270Yhh.LIZ();
            if (c0z0yLIZ == null) {
                C880830Ygz.LIZ(enumC881060YhM, false, new C892820Z0u("null inst", "runtime").getMessage());
                r7.onFailed();
                objLJ = Unit.LIZ;
            } else {
                objLJ = c0z0yLIZ.LJ(list, new C881090YhP(r7), this);
                if (objLJ != C099R.LJFF()) {
                    objLJ = Unit.LIZ;
                }
            }
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("MessageRequestKvUpdater@d42f.initPriorityScore$2$onSuccess$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestKvUpdater@d42f.initPriorityScore$2$onSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
