package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.090O, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.videocreator.SeaPdpCreatorVideoMgr$reportCreatorVideoTrace$1", f = "SeaPdpCreatorVideoMgr.kt", l = {}, m = "invokeSuspend")
public final class C090O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C090P LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C090O(C090P c090p, String str, Integer num, InterfaceC1364105Vn<? super C090O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c090p;
        this.LLILLJJLI = str;
        this.LLILLL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C090O(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpCreatorVideoMgr@e5e1.reportCreatorVideoTrace$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("stage", this.LL.name());
        String str = this.LLILLJJLI;
        if (str != null) {
            linkedHashMap.put("source_page_type", str);
        }
        Integer num = this.LLILLL;
        if (num != null) {
            num.intValue();
            linkedHashMap.put("video_cnt", num);
        }
        C1018703yb.LJ("rd_tiktokec_creator_video_trace", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpCreatorVideoMgr@e5e1.reportCreatorVideoTrace$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
