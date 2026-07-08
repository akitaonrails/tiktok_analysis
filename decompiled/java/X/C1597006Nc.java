package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Nc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.event.StreamAnalytics$reportStreamBegin$1", f = "StreamAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1597006Nc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EnumC905940ZgO LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ Long LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1597006Nc(InterfaceC1493105sv interfaceC1493105sv, String str, EnumC905940ZgO enumC905940ZgO, long j, String str2, String str3, Integer num, Integer num2, Long l, InterfaceC1364105Vn<? super C1597006Nc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = str;
        this.LLILLL = enumC905940ZgO;
        this.LLILZ = j;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = num;
        this.LLIZLLLIL = num2;
        this.LLJ = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1597006Nc(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamAnalytics@5c88.reportStreamBegin$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1493105sv interfaceC1493105sv = this.LL;
        String str = this.LLILLJJLI;
        EnumC905940ZgO enumC905940ZgO = this.LLILLL;
        long j = this.LLILZ;
        String str2 = this.LLILZIL;
        String str3 = this.LLILZLL;
        Integer num = this.LLIZ;
        Integer num2 = this.LLIZLLLIL;
        Long l = this.LLJ;
        C13DA c13da = new C13DA();
        c13da.put("client_message_id", str);
        c13da.put("trigger", enumC905940ZgO.getValue());
        c13da.put("timestamp", String.valueOf(j));
        c13da.put("business_type", str2);
        if (str3 != null) {
            c13da.put("business_scene", str3);
        }
        if (num != null) {
            c13da.put("from_seq_id", String.valueOf(num.intValue()));
        }
        if (num2 != null) {
            c13da.put("retry_count", String.valueOf(num2.intValue()));
        }
        if (l != null) {
            c13da.put("delay_ms", String.valueOf(l.longValue()));
        }
        interfaceC1493105sv.sendEvent("im_streaming_begin", c13da.build());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreamAnalytics@5c88.reportStreamBegin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
