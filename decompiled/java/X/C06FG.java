package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06FG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.analytics.StreakAnalytics$reportLoadStreakLynxPanel$1", f = "StreakAnalytics.kt", l = {}, m = "invokeSuspend")
public final class C06FG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1493105sv LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Boolean LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06FG(InterfaceC1493105sv interfaceC1493105sv, String str, int i, String str2, String str3, Boolean bool, Integer num, String str4, InterfaceC1364105Vn<? super C06FG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1493105sv;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = bool;
        this.LLIZ = num;
        this.LLIZLLLIL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06FG(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("StreakAnalytics@3c6.reportLoadStreakLynxPanel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1493105sv interfaceC1493105sv = this.LL;
        String str2 = this.LLILLJJLI;
        int i = this.LLILLL;
        String str3 = this.LLILZ;
        String str4 = this.LLILZIL;
        Boolean bool = this.LLILZLL;
        Integer num = this.LLIZ;
        String str5 = this.LLIZLLLIL;
        C13DA c13da = new C13DA();
        c13da.put(C06FE.CONVERSATION_ID.getValue(), str2);
        c13da.put(C06FE.CONVERSATION_TYPE.getValue(), String.valueOf(C1567806Bw.LIZIZ(str2)));
        c13da.put(C06FE.LOAD_STAGE.getValue(), String.valueOf(i));
        c13da.put(C06FE.ENTER_FROM.getValue(), str3);
        c13da.put(C06FE.PANEL_TYPE.getValue(), str4);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            String value = C06FE.IS_LOAD_SUCCESS.getValue();
            if (zBooleanValue) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c13da.put(value, str);
        }
        if (num != null) {
            c13da.put(C06FE.ERROR_CODE.getValue(), String.valueOf(num.intValue()));
        }
        if (str5 != null) {
            c13da.put(C06FE.ERROR_MSG.getValue(), str5);
        }
        interfaceC1493105sv.sendEvent("load_streak_lynx_panel", c13da.build());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakAnalytics@3c6.reportLoadStreakLynxPanel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
