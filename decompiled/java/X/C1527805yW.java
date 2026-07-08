package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05yW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.analytics.GroupAnalytics$logEventWithCommonParams$1", f = "GroupAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1527805yW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Pair<Object, String>[] LLILLJJLI;
    public final /* synthetic */ InterfaceC1493105sv LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1527805yW(String str, Pair<? extends Object, String>[] pairArr, InterfaceC1493105sv interfaceC1493105sv, String str2, InterfaceC1364105Vn<? super C1527805yW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = pairArr;
        this.LLILLL = interfaceC1493105sv;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1527805yW(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupAnalytics@4f32.logEventWithCommonParams$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("conversation_id", this.LL);
        c830490Whz.put("group_type", C1229100i5c.LJI(this.LL));
        c830490Whz.put("chat_type", C1229100i5c.LIZLLL(this.LL));
        C1461005nk c1461005nk = C1461005nk.LIZ;
        c830490Whz.put("group_role", String.valueOf(C1527905yX.LIZ(C2286608xc.LJ(C1461005nk.LJIIIIZZ(this.LL)))));
        c830490Whz.put("group_owner_account_type", C0ZFW.LIZ.LJJIFFI(this.LL));
        for (Pair<Object, String> pair : this.LLILLJJLI) {
            c830490Whz.put(pair.getFirst().toString(), pair.getSecond());
        }
        this.LLILLL.sendEvent(this.LLILZ, c830490Whz);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupAnalytics@4f32.logEventWithCommonParams$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
