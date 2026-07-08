package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05tC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.typingindicator.analysis.TypingStatusAnalytics$reportOnTypingIndicatorShown$1", f = "TypingStatusAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C1494805tC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1494805tC(InterfaceC1493105sv interfaceC1493105sv, int i, String str, int i2, String str2, InterfaceC1364105Vn<? super C1494805tC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = i2;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1494805tC(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C1C7U.LIZ("TypingStatusAnalytics@eb27.reportOnTypingIndicatorShown$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1493105sv interfaceC1493105sv = this.LL;
        int i = this.LLILLJJLI;
        String str = this.LLILLL;
        int i2 = this.LLILZ;
        String str2 = this.LLILZIL;
        C13DA c13da = new C13DA();
        c13da.put("position", String.valueOf(i));
        c13da.put("chat_type", str);
        Integer numLJ = C2286608xc.LJ(i2);
        if (numLJ.intValue() >= 0 && (string = numLJ.toString()) != null) {
            c13da.put("avatar_num", string);
        }
        c13da.put("conversation_id", str2);
        interfaceC1493105sv.sendEvent("dm_show_typing_bubble", c13da.build());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TypingStatusAnalytics@eb27.reportOnTypingIndicatorShown$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
