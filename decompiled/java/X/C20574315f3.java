package X;

import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.feed.model.cardinsert.LynxCardConfig;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15f3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.lynxcard.base.SparkLoader$injectSparkContext$3$invoke$1$1", f = "SparkLoader.kt", l = {}, m = "invokeSuspend")
public final class C20574315f3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1537910q7h LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ LynxCardConfig LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20574315f3(C1537910q7h c1537910q7h, String str, String str2, String str3, String str4, Integer num, LynxCardConfig lynxCardConfig, InterfaceC1364105Vn<? super C20574315f3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1537910q7h;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = num;
        this.LLIZ = lynxCardConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20574315f3(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SparkLoader@2f3.injectSparkContext$3$invoke$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIJJ = TemplateData.LJIIIIZZ(C08JS.LIZLLL(C2097608Jq.LJIIIIZZ(new Pair("biz_info", this.LLILLJJLI), new Pair("biz_data", this.LLILLL), new Pair("biz_dynamic_url", this.LLILZ), new Pair("biz_channel", this.LLILZIL), new Pair("load_entrance_type", this.LLILZLL), new Pair("lynx_card_config", this.LLIZ))));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SparkLoader@2f3.injectSparkContext$3$invoke$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
