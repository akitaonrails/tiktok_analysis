package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05yZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.analytics.GroupAnalytics$logCreateGroupTypeShow$1", f = "GroupAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1528105yZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ InterfaceC1493105sv LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1528105yZ(InterfaceC1493105sv interfaceC1493105sv, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = interfaceC1493105sv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1528105yZ(this.LLILLL, this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupAnalytics@4f32.logCreateGroupTypeShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", this.LL);
        c830490Whz.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, this.LLILLJJLI);
        c830490Whz.put("group_owner_account_type", C1528505yd.LIZ(C461720I8s.LIZIZ()));
        c830490Whz.put("group_owner_account_type", C1528505yd.LIZ(C461720I8s.LIZIZ()));
        this.LLILLL.sendEvent("ttsocial_create_group_type_show", c830490Whz);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupAnalytics@4f32.logCreateGroupTypeShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
