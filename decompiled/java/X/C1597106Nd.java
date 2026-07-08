package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Nd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.event.StreamAnalytics$reportStreamEnd$1", f = "StreamAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1597106Nd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EnumC905990ZgT LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Integer LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ Integer LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1597106Nd(InterfaceC1493105sv interfaceC1493105sv, String str, EnumC905990ZgT enumC905990ZgT, long j, long j2, int i, int i2, long j3, String str2, String str3, Integer num, String str4, Integer num2, InterfaceC1364105Vn<? super C1597106Nd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = str;
        this.LLILLL = enumC905990ZgT;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = i;
        this.LLIZ = i2;
        this.LLIZLLLIL = j3;
        this.LLJ = str2;
        this.LLJI = str3;
        this.LLJIJIL = num;
        this.LLJILJIL = str4;
        this.LLJILJILJ = num2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1597106Nd(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamAnalytics@5c88.reportStreamEnd$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1493105sv interfaceC1493105sv = this.LL;
        String str = this.LLILLJJLI;
        EnumC905990ZgT enumC905990ZgT = this.LLILLL;
        long j = this.LLILZ;
        long j2 = this.LLILZIL;
        int i = this.LLILZLL;
        int i2 = this.LLIZ;
        long j3 = this.LLIZLLLIL;
        String str2 = this.LLJ;
        String str3 = this.LLJI;
        Integer num = this.LLJIJIL;
        String str4 = this.LLJILJIL;
        Integer num2 = this.LLJILJILJ;
        C13DA c13da = new C13DA();
        c13da.put("client_message_id", str);
        c13da.put("reason", enumC905990ZgT.getValue());
        c13da.put("duration_ms", String.valueOf(j));
        c13da.put("first_chunk_ms", String.valueOf(j2));
        c13da.put("blocks_count", String.valueOf(i));
        c13da.put("retry_count", String.valueOf(i2));
        c13da.put("final_seq_id", String.valueOf(j3));
        c13da.put("business_type", str2);
        if (str3 != null) {
            c13da.put("business_scene", str3);
        }
        if (num != null) {
            c13da.put("error_code", String.valueOf(num.intValue()));
        }
        if (str4 != null) {
            c13da.put("error_message", str4);
        }
        if (num2 != null) {
            c13da.put("server_error_code", String.valueOf(num2.intValue()));
        }
        interfaceC1493105sv.sendEvent("im_streaming_end", c13da.build());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreamAnalytics@5c88.reportStreamEnd$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
