package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05yi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newselector.util.ExtKt$reportEntranceShow$1", f = "Ext.kt", l = {}, m = "invokeSuspend")
public final class C1529005yi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1529005yi(String str, String str2, String str3, InterfaceC1364105Vn<? super C1529005yi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1529005yi(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExtKt@37d1.reportEntranceShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", this.LL);
        linkedHashMap.put("enter_method", this.LLILLJJLI);
        linkedHashMap.put("create_group_option", this.LLILLL);
        linkedHashMap.put("account_type", C1528505yd.LIZ(C461720I8s.LIZIZ()));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("show_chat_room_entrance", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExtKt@37d1.reportEntranceShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
