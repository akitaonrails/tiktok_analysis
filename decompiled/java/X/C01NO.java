package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01NO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.suggestfollowing.FollowingSuggestMonitor$monitorButtonShow$1", f = "FollowingSuggestMonitor.kt", l = {}, m = "invokeSuspend")
public final class C01NO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01NO(int i, String str, String str2, String str3, String str4, String str5, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01NO(this.LLILZLL, this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingSuggestMonitor@395.monitorButtonShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int iLIZJ = C2445309i7.LIZJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL;
        String str4 = this.LLILZ;
        String str5 = this.LLILZIL;
        int i = this.LLILZLL;
        linkedHashMap.put("group_id", str);
        linkedHashMap.put("author_id", str2);
        linkedHashMap.put("button_type", str3);
        linkedHashMap.put("enter_from", str4);
        linkedHashMap.put("enter_method", str5);
        linkedHashMap.put("follow_cnt", String.valueOf(i));
        linkedHashMap.put("show_count", String.valueOf(iLIZJ));
        C20684815ws.LJIILLIIL("guide_follow_button_show", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingSuggestMonitor@395.monitorButtonShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
