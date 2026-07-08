package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iGb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.share.action.OpenContactSharePanelAction$open$1", f = "OpenContactSharePanelAction.kt", l = {}, m = "invokeSuspend")
public final class C1235910iGb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C19EG LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ Map<String, String> LLJILJILJ;
    public final /* synthetic */ Long LLJILLL;
    public final /* synthetic */ boolean LLJJ;
    public final /* synthetic */ boolean LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1235910iGb(int i, String str, String str2, String str3, C19EG c19eg, String str4, String str5, boolean z, boolean z2, String str6, String str7, String str8, Map<String, String> map, Long l, boolean z3, boolean z4, InterfaceC1364105Vn<? super C1235910iGb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = c19eg;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = z;
        this.LLJ = z2;
        this.LLJI = str6;
        this.LLJIJIL = str7;
        this.LLJILJIL = str8;
        this.LLJILJILJ = map;
        this.LLJILLL = l;
        this.LLJJ = z3;
        this.LLJJI = z4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1235910iGb(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OpenContactSharePanelAction@bfff.open$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1378390lyP c1378390lyP = C1378390lyP.LIZ;
        int i = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        C1378410lyR c1378410lyR = new C1378410lyR(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI);
        c1378390lyP.getClass();
        C1378390lyP.LIZIZ(i, str, str2, str3, c1378410lyR, null, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OpenContactSharePanelAction@bfff.open$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
