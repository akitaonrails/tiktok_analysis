package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CS2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.preload.smart.v3.SmartPreloadV3Helper$handleWifiCheckResult$1$1", f = "SmartPreloadV3Helper.kt", l = {}, m = "invokeSuspend")
public final class C0CS2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Boolean LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC2214871BmP LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CS2(Boolean bool, int i, String str, InterfaceC2214871BmP interfaceC2214871BmP, boolean z, InterfaceC1364105Vn<? super C0CS2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bool;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = interfaceC2214871BmP;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CS2(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartPreloadV3Helper@94ef.handleWifiCheckResult$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.booleanValue()) {
            Aweme aweme = C2214851BmN.LIZ;
            C2214851BmN.LIZIZ(this.LLILLJJLI, this.LLILZ, this.LLILLL, this.LLILZIL);
        } else {
            C2214861BmO c2214861BmO = C2214861BmO.LIZ;
            this.LLILZ.getType();
            c2214861BmO.getClass();
            C2214861BmO.LIZJ(21, "comment_preload");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartPreloadV3Helper@94ef.handleWifiCheckResult$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
