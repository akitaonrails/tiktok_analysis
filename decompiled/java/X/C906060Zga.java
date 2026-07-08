package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.sugar.internal.event.ConvStreamingSessionTrackerImpl$endSession$1", f = "ConvStreamingSessionTrackerImpl.kt", l = {}, m = "invokeSuspend")
public final class C906060Zga extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C906070Zgb LL;
    public final /* synthetic */ C906080Zgc LLILLJJLI;
    public final /* synthetic */ EnumC905780Zg8 LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ long LLJIJIL;
    public final /* synthetic */ long LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C906060Zga(C906070Zgb c906070Zgb, C906080Zgc c906080Zgc, EnumC905780Zg8 enumC905780Zg8, Integer num, Integer num2, String str, boolean z, String str2, long j, long j2, long j3, long j4, InterfaceC1364105Vn<? super C906060Zga> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c906070Zgb;
        this.LLILLJJLI = c906080Zgc;
        this.LLILLL = enumC905780Zg8;
        this.LLILZ = num;
        this.LLILZIL = num2;
        this.LLILZLL = str;
        this.LLIZ = z;
        this.LLIZLLLIL = str2;
        this.LLJ = j;
        this.LLJI = j2;
        this.LLJIJIL = j3;
        this.LLJILJIL = j4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C906060Zga(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("ConvStreamingSessionTrackerImpl@a7d6.endSession$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C906070Zgb c906070Zgb = this.LL;
        InterfaceC1493105sv interfaceC1493105sv = c906070Zgb.LIZIZ;
        C906080Zgc c906080Zgc = this.LLILLJJLI;
        EnumC905780Zg8 enumC905780Zg8 = this.LLILLL;
        Integer num = this.LLILZ;
        Integer num2 = this.LLILZIL;
        String str2 = this.LLILZLL;
        boolean z = this.LLIZ;
        String str3 = this.LLIZLLLIL;
        long j = this.LLJ;
        long j2 = this.LLJI;
        long j3 = this.LLJIJIL;
        long j4 = this.LLJILJIL;
        C13DA c13da = new C13DA();
        c13da.put("conversation_id", c906080Zgc.LIZIZ);
        c13da.put("business_type", c906070Zgb.LIZ.getValue());
        c13da.put("message_id", c906080Zgc.LIZ);
        String str4 = c906080Zgc.LJFF;
        if (str4 != null) {
            c13da.put("sent_client_message_id", str4);
        }
        Long l = c906080Zgc.LJI;
        if (l != null) {
            c13da.put("sent_server_message_id", String.valueOf(l.longValue()));
        }
        c13da.put("biz_reason", enumC905780Zg8.getValue());
        c13da.put("trigger", c906080Zgc.LIZJ.getValue());
        String str5 = c906080Zgc.LIZLLL;
        if (str5 != null) {
            c13da.put("business_scene", str5);
        }
        c13da.put("blocks_count", String.valueOf(c906080Zgc.LJIIJJI));
        if (num != null) {
            c13da.put("server_error_code", String.valueOf(num.intValue()));
        }
        if (num2 != null) {
            c13da.put("error_code", String.valueOf(num2.intValue()));
        }
        if (str2 != null) {
            c13da.put("error_message", str2);
        }
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("left_conversation_before_new_message", str);
        if (str3 != null) {
            c13da.put("end_context", str3);
        }
        c13da.put("insert_fake_duration", String.valueOf(j));
        c13da.put("streaming_first_chunk_duration", String.valueOf(j2));
        c13da.put("streaming_total_duration", String.valueOf(j3));
        c13da.put("total_duration", String.valueOf(j4));
        interfaceC1493105sv.sendEvent("im_conv_streaming_session", c13da.build());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ConvStreamingSessionTrackerImpl@a7d6.endSession$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
