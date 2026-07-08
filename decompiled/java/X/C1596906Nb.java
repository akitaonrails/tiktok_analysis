package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Nb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.event.StreamAnalytics$reportStreamInterrupted$1", f = "StreamAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1596906Nb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1596906Nb(InterfaceC1493105sv interfaceC1493105sv, String str, int i, boolean z, long j, String str2, String str3, Integer num, String str4, InterfaceC1364105Vn<? super C1596906Nb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = j;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = num;
        this.LLJ = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1596906Nb(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("StreamAnalytics@5c88.reportStreamInterrupted$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1493105sv interfaceC1493105sv = this.LL;
        String str2 = this.LLILLJJLI;
        int i = this.LLILLL;
        boolean z = this.LLILZ;
        long j = this.LLILZIL;
        String str3 = this.LLILZLL;
        String str4 = this.LLIZ;
        Integer num = this.LLIZLLLIL;
        String str5 = this.LLJ;
        C13DA c13da = new C13DA();
        c13da.put("client_message_id", str2);
        c13da.put("seq_id", String.valueOf(i));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("server_success", str);
        c13da.put("interrupt_duration_ms", String.valueOf(j));
        c13da.put("business_type", str3);
        if (str4 != null) {
            c13da.put("business_scene", str4);
        }
        if (num != null) {
            c13da.put("error_code", String.valueOf(num.intValue()));
        }
        if (str5 != null) {
            c13da.put("error_message", str5);
        }
        interfaceC1493105sv.sendEvent("im_streaming_interrupt", c13da.build());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreamAnalytics@5c88.reportStreamInterrupted$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
